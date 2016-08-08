package delayfeedback;

import boost.filesystem.Path;
import cinder.*;
import cinder.Math;
import cinder.app.KeyEvent;
import cinder.app.MouseEvent;
import cinder.audio.*;
import cinder.audio.Context;
import cinder.audio.Utilities;
import cinder.gl.*;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxByValue;
import glm.Geometric;
import glm.detail.Vec2;
import glm.detail.Vec3;
import sample.utils.CommonApp;
import sample.utils.CommonLauncher;
import std.SharedPtr;

import java.util.ArrayList;
import java.util.List;

public class DelayFeedbackApp extends CommonApp {

    private static float MAX_VOLUME = 0.6f;
    private static int MAX_SPLASHES = 200;
    private static float MAX_RADIUS = 300;
    private static float MAX_PITCH_MIDI = 80;
    private static float MIN_PITCH_MIDI = 40;

    private static String SMOOTH_CIRCLE_GLSL_VERT = "smoothCircle.vert";
    private static String SMOOTH_CIRCLE_GLSL_FRAG = "smoothCircle.frag";

    private class Splash {

        Vec2 mCenter;
        Vec3 mColorHsv;
        Anim mRadius, mAlpha;

        public void delete() {
            CxxRuntime.delete(mCenter);
            CxxRuntime.delete(mColorHsv);
            CxxRuntime.delete(mRadius);
            CxxRuntime.delete(mAlpha);
        }
    }

    private SharedPtr<GenOscNode> mOsc;
    private SharedPtr<DelayNode> mDelay;
    private SharedPtr<GainNode> mGain;

    private List<Splash> mSplashes;
    private Perlin mPerlin;

    private SharedPtr<Batch> mBatch;
    TriMesh mesh;

    public DelayFeedbackApp() {
        Path path = Path.newPath(CommonLauncher.locateResource(null));
        addAssetDirectory(path);
        CxxRuntime.delete(path);
        mPerlin = Perlin.newPerlin();
        mSplashes = new ArrayList<Splash>();
    }

    public void setup() {
        loadBatch();
        GL.enableAlphaBlending(true);

        // The basic audio::Node's used here are an oscillator with a triangle waveform, a gain, and a delay.
        // The complexity in the sound comes from how they are connected and controlled.

        cinder.audio.Context ctx = Context.master();
        mOsc = ctx.makeNode(GenOscNode.newGenOscNode());
        mGain = ctx.makeNode(GainNode.newGainNode(0));
        mDelay = ctx.makeNode(DelayNode.newDelayNode());

        mOsc.get().setWaveform(WaveformType.TRIANGLE.ordinal());

        // The Delay's length Param is itself controlled with Node's, which is configured next.
        setVariableDelayMod();

        // Now we connect up the Node's so that the signal immediately reaches the Context's OutputNode, but it also
        // feedback in a cycle to create an echo. To control the level of feedback and prevent ringing, a one-off GainNode
        // is used with a value of 0.5, which gives a fairly natural sounding decay.
        SharedPtr<GainNode> feedbackGain = ctx.makeNode(GainNode.newGainNode(0.5f));
        std.String name = std.String.getString("FeedbackGain");
        feedbackGain.get().setName(name);
        CxxRuntime.delete(name);

        mOsc.get().connectGainNode(mGain);
        mGain.get().connectOutputNode(ctx.getOutput());

        mGain.get().connectDelayNode(mDelay);
        mDelay.get().connectGainNode(feedbackGain);
        feedbackGain.get().connectDelayNode(mDelay);
        mDelay.get().connectOutputNode(ctx.getOutput());

        mOsc.get().enable();
        ctx.enable();

        System.out.println("--------- context audio graph: --------------------");
        System.out.println(ctx.printGraphToString().c_str().toUTF8String());
        System.out.println("---------------------------------------------------");

    }

    public void loadBatch() {
        SharedPtr<GlslProg> glsl;

        Path vertPath = Path.newPath(SMOOTH_CIRCLE_GLSL_VERT);
        Path fragPath = Path.newPath(SMOOTH_CIRCLE_GLSL_FRAG);
        SharedPtr<DataSource> vertAsset = loadAsset(vertPath);
        SharedPtr<DataSource> fragAsset = loadAsset(fragPath);
        try {
            glsl = GlslProg.create(vertAsset, fragAsset);
        } catch (Exception exc) {
            System.out.println("failed to load shader, what: " + exc.getMessage());
            return;
        } finally {
            CxxRuntime.delete(vertPath);
            CxxRuntime.delete(fragPath);
            CxxRuntime.delete(vertAsset);
            CxxRuntime.delete(fragAsset);
        }

        Rectf boundingBox = Rectf.newRectf(-MAX_RADIUS, -MAX_RADIUS, MAX_RADIUS, MAX_RADIUS);

        TriMesh.Format format = TriMesh.Format.newFormat();
        SharedPtr<TriMesh> triMeshSharedPtr = TriMesh.create(format.positions((byte) 2).texCoords((byte) 2));
        CxxRuntime.delete(format);
        mesh = triMeshSharedPtr.get();

        Vec2 upperLeft = Vec2.newVec2(boundingBox.getUpperLeft());
        mesh.appendPosition(upperLeft);
        upperLeft.assign(-1, -1);
        mesh.appendTexCoord(upperLeft);
        CxxRuntime.delete(upperLeft);

        Vec2 lowerLeft = Vec2.newVec2(boundingBox.getLowerLeft());
        mesh.appendPosition(lowerLeft);
        lowerLeft.assign(-1, 1);
        mesh.appendTexCoord(lowerLeft);
        CxxRuntime.delete(lowerLeft);

        Vec2 upperRight = Vec2.newVec2(boundingBox.getUpperRight());
        mesh.appendPosition(upperRight);
        upperRight.assign(1, -1);
        mesh.appendTexCoord(upperRight);
        CxxRuntime.delete(upperRight);

        Vec2 lowerRight = Vec2.newVec2(boundingBox.getLowerRight());
        mesh.appendPosition(lowerRight);
        lowerRight.assign(1, 1);
        mesh.appendTexCoord(lowerRight);
        CxxRuntime.delete(lowerRight);

        mesh.appendTriangle(0, 1, 2);
        mesh.appendTriangle(2, 1, 3);

        mBatch = Batch.create(mesh, glsl);

        CxxRuntime.delete(boundingBox);
    }

    // This method adds a low-frequency oscillator to the delay length, which makes a 'flanging' effect.
    void setVariableDelayMod() {
        mDelay.get().setMaxDelaySeconds(2);

        cinder.audio.Context ctx = Context.master();

        Node.Format format = Node.newFormat();
        SharedPtr<GenSineNode> osc = ctx.makeNode(GenSineNode.newGenSineNode(0.00113f, format.autoEnable(true)));
        CxxRuntime.delete(format);
        SharedPtr<GainNode> mul = ctx.makeNode(GainNode.newGainNode(0.3f));
        SharedPtr<AddNode> add = ctx.makeNode(AddNode.newAddNode(0.343f));

        osc.get().connectGainNode(mul);
        mul.get().connectAddNode(add);
        mDelay.get().getParamDelaySeconds().setProcessor(add);
    }

    void addSplash(Vec2 pos) {
        Splash splash = new Splash();
        splash.mCenter = pos;
        splash.mAlpha = Anim.newAnim(1);

        float radiusMin = (1 - (float) pos.y() / (float) getWindowHeight()) * MAX_RADIUS / 2;
        splash.mRadius = Anim.newAnim(Rand.randFloat(radiusMin, 30));

        float endRadius = Rand.randFloat(MAX_RADIUS * 0.9f, MAX_RADIUS);
        timeline().apply2(splash.mRadius, endRadius, 7);
        timeline().apply(splash.mAlpha, 0.0f, 7);

        Vec2 normalized = Geometric.normalize(pos);
        float h = Math.min(1, mPerlin.fBm(normalized) * 7);
        CxxRuntime.delete(normalized);
        splash.mColorHsv = Vec3.newVec3(std.Math.fabsf(h), 1, 1);

        mSplashes.add(splash);
    }

    // returns a quantized pitch (in hertz) within the lydian dominant scale
    float quantizePitch(Vec2 pos) {
        int scaleLength = 7;
        float[] scale = new float[]{0, 2, 4, 6, 7, 9, 10};

        int pitchMidi = (int) std.Math.lroundf(Math.lmap(pos.x(), 0.0f, (float) getWindowWidth(), MIN_PITCH_MIDI, MAX_PITCH_MIDI));

        boolean quantized = false;
        while (!quantized) {
            int note = pitchMidi % 12;
            for (int i = 0; i < scaleLength; i++) {
                if (note == scale[i]) {
                    quantized = true;
                    break;
                }
            }
            if (!quantized)
                pitchMidi--;
        }
        return Utilities.midiToFreq(pitchMidi);
    }

    public void keyDown(@CxxByValue KeyEvent event) {
        if (event.getChar() == 'f')
            setFullScreen(!isFullScreen());
    }

    public void draw() {
        GL.clear();

        if (mBatch == null) {
            return;
        }

        SharedPtr<GlslProg> glsProg = mBatch.get().getGlslProg();
        ScopedGlslProg glslScope = ScopedGlslProg.newScopedGlslProg(glsProg);

        for (Splash splash : mSplashes) {

            float radiusNormalized = splash.mRadius.value() / MAX_RADIUS;
            glsProg.get().uniform("uRadius", radiusNormalized);

            ScopedModelMatrix matrixScope = ScopedModelMatrix.newScopedModelMatrix();
            GL.translate(splash.mCenter);

            Color splashColor = Color.newColor(ColorModel.CM_HSV.ordinal(), splash.mColorHsv);
            GL.color(splashColor.r(), splashColor.g(), splashColor.b(), splash.mAlpha.value());

            mBatch.get().draw();

            CxxRuntime.delete(matrixScope);
            CxxRuntime.delete(splashColor);
        }
        CxxRuntime.delete(glslScope);
    }

    public void mouseDrag(@CxxByValue MouseEvent event) {
        Vec2 pos = Vec2.newVec2(event.getPos());
        float freq = quantizePitch(pos);
        CxxRuntime.delete(pos);

        float gain = 1.0f - (float) event.getPos().y() / (float) getWindowHeight();

        gain *= MAX_VOLUME;

        SharedPtr<Event> paramFreqSharedPtr = mOsc.get().getParamFreq().applyRamp(freq, 0.04f);
        CxxRuntime.delete(paramFreqSharedPtr);
        SharedPtr<Event> paramSharedPtr = mGain.get().getParam().applyRamp(gain, 0.1f);
        CxxRuntime.delete(paramSharedPtr);

        addSplash(Vec2.newVec2(event.getPos()));
    }

    public void mouseUp(@CxxByValue MouseEvent event) {
        Param.Options options = Param.newOptions();
        SharedPtr<Event> sharedPtr = mGain.get().getParam().applyRamp(0, 1.5, options.rampFn2());
        CxxRuntime.delete(sharedPtr);
        CxxRuntime.delete(options);
    }

    public void update() {
        // trim splashes
        if (mSplashes.size() > MAX_SPLASHES) {
            int trimCount = mSplashes.size() - MAX_SPLASHES;
            for (int i = 0; i < trimCount; i++) {
                mSplashes.remove(i).delete();
            }
        }
    }

}
