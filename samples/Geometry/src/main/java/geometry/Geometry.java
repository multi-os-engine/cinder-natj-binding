package geometry;

import boost.filesystem.Path;
import cinder.*;
import cinder.Math;
import cinder.app.FileDropEvent;
import cinder.app.KeyEvent;
import cinder.app.MouseEvent;
import cinder.app.Window;
import cinder.geom.*;
import cinder.geom.Sphere;
import cinder.gl.*;
import cinder.params.InterfaceGl;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import glm.Geometric;
import glm.detail.IVec2;
import glm.detail.Vec2;
import glm.detail.Vec3;
import sample.utils.CommonApp;
import sample.utils.CommonInterfaceGl;
import sample.utils.CommonLauncher;
import sample.utils.CommonUpdateFn;
import std.Algorithm;
import std.SharedPtr;
import std.UpdateFn;

import java.util.Vector;

import static cinder.ImageIo.loadImage;
import static cinder.geom.Attrib.TANGENT;
import static geometry.Geometry.Primitive.*;
import static geometry.Geometry.Quality.HIGH;
import static geometry.Geometry.TexturingMode.PROCEDURAL;
import static geometry.Geometry.ViewMode.SHADED;
import static geometry.Geometry.ViewMode.WIREFRAME;

public class Geometry extends CommonApp {
    private static final int GL_REPEAT = 0x2901;
    private static int GL_FRONT = 0x0404;
    private static int GL_BACK = 0x0405;
    private static int GL_LINES = 0x0001;

    enum Primitive {CAPSULE, CONE, CUBE, CYLINDER, HELIX, ICOSAHEDRON, ICOSPHERE, SPHERE, TEAPOT, TORUS, TORUSKNOT, PLANE, RECT, ROUNDEDRECT, CIRCLE, RING, PRIMITIVE_COUNT}

    enum Quality {LOW, DEFAULT, HIGH}

    enum ViewMode {SHADED, WIREFRAME}

    enum TexturingMode {NONE, PROCEDURAL, SAMPLER}

    private final IntPtr mPrimitiveSelected = PtrFactory.newIntReference();
    private int mPrimitiveCurrent;
    private final IntPtr mQualitySelected = PtrFactory.newIntReference();
    private int mQualityCurrent;
    private final IntPtr mViewMode = PtrFactory.newIntReference();
    private final IntPtr mTexturingMode = PtrFactory.newIntReference();

    private final BoolPtr mShowColors = PtrFactory.newBoolReference();
    private final BoolPtr mShowNormals = PtrFactory.newBoolReference();
    private final BoolPtr mShowTangents = PtrFactory.newBoolReference();
    private final BoolPtr mShowGrid = PtrFactory.newBoolReference();
    private final BoolPtr mShowSolidPrimitive = PtrFactory.newBoolReference();
    private final BoolPtr mShowWirePrimitive = PtrFactory.newBoolReference();
    final BoolPtr mEnableFaceFulling = PtrFactory.newBoolReference();

    private final CameraPersp mCamera = CameraPersp.newCameraPersp();
    private final CameraUi mCamUi = CameraUi.newCameraUi(mCamera);
    private final BoolPtr mRecenterCamera = PtrFactory.newBoolReference(false);
    private final Vec3 mCameraTarget = Vec3.newVec3();
    private final Vec3 mCameraLerpTarget = Vec3.newVec3();
    private final Vec3 mCameraViewDirection = Vec3.newVec3();
    private double mLastMouseDownTime;

    private final SharedPtr<VertBatch> mGrid = VertBatch.createEmpty();

    private final SharedPtr<Batch> mPrimitive = Batch.createEmpty();
    private final SharedPtr<Batch> mPrimitiveWire = Batch.createEmpty();
    private final SharedPtr<Batch> mPrimitiveWireframe = Batch.createEmpty();
    private final SharedPtr<Batch> mPrimitiveNormalLines = Batch.createEmpty();
    private final SharedPtr<Batch> mPrimitiveTangentLines = Batch.createEmpty();

    private final SharedPtr<GlslProg> mPhongShader = GlslProg.createEmpty();
    private final SharedPtr<GlslProg> mWireShader = GlslProg.createEmpty();
    private final SharedPtr<GlslProg> mWireframeShader = GlslProg.createEmpty();

    private SharedPtr<Texture2d> mTexture;

    private final FloatPtr mCapsuleRadius = PtrFactory.newFloatReference();
    private final FloatPtr mCapsuleLength = PtrFactory.newFloatReference();

    private final FloatPtr mConeRatio = PtrFactory.newFloatReference();

    private final FloatPtr mHelixRatio = PtrFactory.newFloatReference();
    private final IntPtr mHelixTwist = PtrFactory.newIntReference();
    private final FloatPtr mHelixOffset = PtrFactory.newFloatReference();
    private final FloatPtr mHelixCoils = PtrFactory.newFloatReference();

    private final FloatPtr mRingWidth = PtrFactory.newFloatReference();

    private final FloatPtr mRoundedRectRadius = PtrFactory.newFloatReference();

    private final IntPtr mTorusTwist = PtrFactory.newIntReference();
    private final FloatPtr mTorusOffset = PtrFactory.newFloatReference();
    private final FloatPtr mTorusRatio = PtrFactory.newFloatReference();

    private final IntPtr mTorusKnotP = PtrFactory.newIntReference();
    private final IntPtr mTorusKnotQ = PtrFactory.newIntReference();
    private final FloatPtr mTorusKnotRadius = PtrFactory.newFloatReference();
    private final Vec3 mTorusKnotScale;

    private CommonInterfaceGl mParams;

    private Vector<Vector<InterfaceGl.OptionsBase>> mPrimitiveParams;

    private final CommonUpdateFn updateParams = new CommonUpdateFn(this::updateParams);
    private final CommonUpdateFn enableFaceCulling = new CommonUpdateFn(() -> GL.enableFaceCulling(mEnableFaceFulling.get()));
    private final CommonUpdateFn createGeometry = new CommonUpdateFn(this::createGeometry);

    public Geometry() {
        final Path path = Path.newPath(CommonLauncher.locateResource(null));
        addAssetDirectory(path);
        CxxRuntime.delete(path);
        mCapsuleRadius.setValue(0.5f);
        mCapsuleLength.setValue(1);
        mConeRatio.setValue(0.5f);
        mHelixRatio.setValue(0.25f);
        mHelixTwist.setValue(0);
        mHelixOffset.setValue(0);
        mHelixCoils.setValue(3);
        mRingWidth.setValue(0.25f);
        mRoundedRectRadius.setValue(0.2f);
        mTorusTwist.setValue(0);
        mTorusOffset.setValue(0);
        mTorusRatio.setValue(0.25f);
        mTorusKnotP.setValue(2);
        mTorusKnotQ.setValue(5);
        mTorusKnotRadius.setValue(0.15f);
        mTorusKnotScale = Vec3.newVec3(1, 0.2f, 1);

        mPrimitiveParams = new Vector<>();
        for (int i = 0; i < Primitive.values().length - 1; ++i) {
            mPrimitiveParams.add(new Vector<>());
        }
    }

    public void setup() {
        GL.enableVerticalSync(true);

        // Initialize variables.
        mPrimitiveSelected.setValue(TEAPOT.ordinal());
        mPrimitiveCurrent = mPrimitiveSelected.getValue();
        mQualitySelected.setValue(HIGH.ordinal());
        mQualityCurrent = mQualitySelected.getValue();
        mTexturingMode.setValue(PROCEDURAL.ordinal());
        mViewMode.setValue(SHADED.ordinal());
        mLastMouseDownTime = 0;
        mShowColors.setValue(false);
        mShowNormals.setValue(false);
        mShowTangents.setValue(false);
        mShowGrid.setValue(true);
        mShowSolidPrimitive.setValue(true);
        mShowWirePrimitive.setValue(false);
        mEnableFaceFulling.setValue(false);

        // Load the textures.
        Texture2d.Format fmt = Texture2d.Format.newFormat();
        fmt.setAutoInternalFormat();
        fmt.setWrap(GL_REPEAT, GL_REPEAT);
        mTexture = Texture2d.create(ImageIo.loadImage(loadAsset("stripes.jpg")), fmt);
        CxxRuntime.delete(fmt);

        // Setup the camera.
        final Vec3 vec3 = Vec3.newVec3(3, 3, 6);
        final Vec3 vec3norm = Geometric.normalize(vec3);
        final Vec3 vec3normMul = Vec3.mul(vec3norm, 5.0f);
        mCamera.lookAt(vec3normMul, mCameraTarget);
        CxxRuntime.delete(vec3normMul);
        CxxRuntime.delete(vec3norm);
        CxxRuntime.delete(vec3);
        // Done in field init: mCamUi = CameraUi.newCameraUi(mCamera);

        // Load and compile the shaders.
        createPhongShader();
        createWireShader();
        createWireframeShader();

        // Create the meshes.
        createGrid();
        createGeometry();

        // Create a parameter window, so we can toggle stuff.
        createParams();
    }

    public void keyDown(KeyEvent event) {
        switch (event.getCode()) {
            case KeyEvent.KEY_SPACE:
                int selected = (mPrimitiveSelected.getValue() + 1) % PRIMITIVE_COUNT.ordinal();
                mPrimitiveSelected.setValue(Primitive.values()[selected].ordinal());
                createGeometry();
                updateParams();
                break;
            case KeyEvent.KEY_c:
                mShowColors.setValue(!mShowColors.getValue());
                createGeometry();
                break;
            case KeyEvent.KEY_n:
                mShowNormals.setValue(!mShowNormals.getValue());
                break;
            case KeyEvent.KEY_g:
                mShowGrid.setValue(!mShowGrid.get());
                break;
            case KeyEvent.KEY_q:
                mQualitySelected.setValue(Quality.values()[(mQualitySelected.get() + 1) % 3].ordinal());
                break;
            case KeyEvent.KEY_v:
                if (mViewMode.get() == WIREFRAME.ordinal())
                    mViewMode.setValue(SHADED.ordinal());
                else
                    mViewMode.setValue(WIREFRAME.ordinal());
                break;
            case KeyEvent.KEY_w:
                mShowWirePrimitive.setValue(!mShowWirePrimitive.get());
                break;
            case KeyEvent.KEY_RETURN:
                System.out.println("reload");
                createPhongShader();
                createGeometry();
                break;
        }
    }

    public void draw() {
        // Prepare for drawing.
        GL.clear();
        GL.setMatrices(mCamera);

        // Enable the depth buffer.
        GL.enableDepthRead();
        GL.enableDepthWrite();

        if (mPrimitive.hasAssociatedObject()) {
            final ScopedTextureBind scopedTextureBind = ScopedTextureBind.newScopedTextureBind(mTexture);
            mPhongShader.get().uniform("uTexturingMode", mTexturingMode.getValue());
            mPhongShader.get().uniform("uFreq", (mPrimitiveCurrent == TORUSKNOT.ordinal()) ? IVec2.newIVec2(100, 10) : IVec2.newIVec2(20));

            // Rotate it slowly around the y-axis.
            final ScopedModelMatrix matScope = ScopedModelMatrix.newScopedModelMatrix();
            //GL.rotate((float) (getElapsedSeconds() / 5), 0, 1, 0 );

            // Draw the normals.
            if (mShowNormals.getValue() && mPrimitiveNormalLines.hasAssociatedObject()) {
                final ScopedColor colorScope = ScopedColor.newScopedColor(1, 1, 0);
                mPrimitiveNormalLines.get().draw();
                CxxRuntime.delete(colorScope);
            }

            // Draw the tangents.
            if (mShowTangents.getValue() && mPrimitiveTangentLines.hasAssociatedObject()) {
                final ScopedColor colorScope = ScopedColor.newScopedColor(0, 1, 0);
                mPrimitiveTangentLines.get().draw();
                CxxRuntime.delete(colorScope);
            }

            // Draw the wire primitive.
            if (mShowWirePrimitive.getValue() && mPrimitiveWire.hasAssociatedObject()) {
                final ScopedColor colorScope = ScopedColor.newScopedColor(1, 1, 1);
                final ScopedLineWidth linewidth = ScopedLineWidth.newScopedLineWidth(2.5f);
                mPrimitiveWire.get().draw();
                CxxRuntime.delete(linewidth);
                CxxRuntime.delete(colorScope);
            }

            // Draw the primitive.
            if (mShowSolidPrimitive.getValue()) {
                final ScopedColor colorScope = ScopedColor.newScopedColor(1, 1, 1);

                if (mViewMode.getValue() == WIREFRAME.ordinal()) {
                    // We're using alpha blending, so render the back side first.
                    final ScopedBlendAlpha blendScope = ScopedBlendAlpha.newScopedBlendAlpha();
                    final ScopedFaceCulling cullScope = ScopedFaceCulling.newScopedFaceCulling(true, GL_FRONT);

                    mWireframeShader.get().uniform("uBrightness", 0.5f);
                    mPrimitiveWireframe.get().draw();

                    // Now render the front side.
                    GL.cullFace(GL_BACK);

                    mWireframeShader.get().uniform("uBrightness", 1.0f);
                    mPrimitiveWireframe.get().draw();

                    CxxRuntime.delete(blendScope);
                    CxxRuntime.delete(cullScope);
                } else {
                    final ScopedFaceCulling cullScope = ScopedFaceCulling.newScopedFaceCulling(mEnableFaceFulling.get(), GL_BACK);

                    mPrimitive.get().draw();
                    CxxRuntime.delete(cullScope);
                }
                CxxRuntime.delete(colorScope);
            }

            CxxRuntime.delete(matScope);
            CxxRuntime.delete(scopedTextureBind);
        }

        //
        GL.disableDepthWrite();

        // Draw the grid.
        if (mShowGrid.get() && mGrid != null) {
            Context context = GL.newContext();
            ShaderDef shaderDef = ShaderDef.newShaderDef().color();
            ScopedGlslProg scopedGlslProg = ScopedGlslProg.newScopedGlslProg(context.getStockShader(shaderDef));

            mGrid.get().draw();

            // draw the coordinate frame with length 2.
            GL.drawCoordinateFrame(2);

            CxxRuntime.delete(shaderDef);
            CxxRuntime.delete(scopedGlslProg);
        }

        // Disable the depth buffer.
        GL.disableDepthRead();
        if (mParams != null) {
            mParams.draw();
        }

    }

    public void mouseDown(MouseEvent event) {
        mRecenterCamera.setValue(false);

        mCamUi.mouseDown(event);

        if (getElapsedSeconds() - mLastMouseDownTime < 0.2f) {
            mPrimitiveSelected.setValue(Primitive.values()[mPrimitiveSelected.get() + 1].ordinal());
            createGeometry();
        }

        mLastMouseDownTime = getElapsedSeconds();
    }

    public void mouseDrag(MouseEvent event) {
        mCamUi.mouseDrag(event);
    }

    public void resize() {
        mCamera.setAspectRatio(getWindowAspectRatio());

        if (mWireframeShader.hasAssociatedObject())
            mWireframeShader.get().uniform("uViewportSize", Vec2.newVec2(getWindowSize()));
    }

    public void update() {
        // If another primitive or quality was selected, reset the subdivision and recreate the primitive.
        if (mPrimitiveCurrent != mPrimitiveSelected.getValue() || mQualitySelected.getValue() != mQualityCurrent) {
            mPrimitiveCurrent = mPrimitiveSelected.getValue();
            mQualityCurrent = mQualitySelected.getValue();
            createGeometry();
        }

        // After creating a new primitive, gradually move the camera to get a good view.
        if (mRecenterCamera.getValue()) {
            final Vec3 eyePoint = mCamera.getEyePoint();
            final float distance = Geometric.distance(eyePoint, mCameraLerpTarget);
            CxxRuntime.delete(eyePoint);

            final Vec3 cameraViewDirectionMul = Vec3.mul(mCameraViewDirection, Math.lerp(distance, 5.0f, 0.25f));
            final Vec3 eye = Vec3.sub(mCameraLerpTarget, cameraViewDirectionMul);
            CxxRuntime.delete(cameraViewDirectionMul);
            {
                final Vec3 lerp = Math.lerp(mCameraTarget, mCameraLerpTarget, 0.25f);
                mCameraTarget.assign(lerp);
                CxxRuntime.delete(lerp);
            }
            mCamera.lookAt(eye, mCameraTarget);
            CxxRuntime.delete(eye);
        }
    }

    public void fileDrop(FileDropEvent event) {
        try {
            Texture2d.Format fmt = Texture2d.Format.newFormat();
            fmt.setAutoInternalFormat();
            fmt.setWrap(GL_REPEAT, GL_REPEAT);

            mTexture = Texture2d.create(loadImage(event.getFile(0)), fmt);
            CxxRuntime.delete(fmt);
        } catch (Exception exc) {
            System.out.println("Filedrop error occured");
        }
    }

    private void createGrid() {
        mGrid.resetSwapAndDelete(VertBatch.create(GL_LINES));
        final VertBatch vertBatch = mGrid.get();
        vertBatch.begin(GL_LINES);
        final Color color = Color.newColor(0.25f, 0.25f, 0.25f);
        for (int i = -10; i <= 10; ++i) {
            vertBatch.color(color);
            vertBatch.color(color);
            vertBatch.color(color);
            vertBatch.color(color);

            vertBatch.vertex((float) i, 0.0f, -10.0f);
            vertBatch.vertex((float) i, 0.0f, +10.0f);
            vertBatch.vertex(-10.0f, 0.0f, (float) i);
            vertBatch.vertex(+10.0f, 0.0f, (float) i);
        }
        CxxRuntime.delete(color);
        vertBatch.end();
    }

    private void createGeometry() {
        switch (Primitive.values()[mPrimitiveCurrent]) {
            default:
                mPrimitiveSelected.setValue(CAPSULE.ordinal());
            case CAPSULE: {
                final float mCapsuleRadius = this.mCapsuleRadius.getValue();
                final float mCapsuleLength = this.mCapsuleLength.getValue();
                final Capsule capsule = Capsule.newCapsule().radius(mCapsuleRadius).length(mCapsuleLength);
                final WireCapsule wireCapsule = WireCapsule.newWireCapsule().radius(mCapsuleRadius).length(mCapsuleLength);
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(capsule, wireCapsule);
                        break;
                    case LOW:
                        loadGeomSource(capsule.subdivisionsAxis(6).subdivisionsHeight(1), wireCapsule);
                        break;
                    case HIGH:
                        loadGeomSource(capsule.subdivisionsAxis(60).subdivisionsHeight(20), wireCapsule);
                        break;
                }
                CxxRuntime.delete(wireCapsule);
                CxxRuntime.delete(capsule);
                break;
            }
            case CONE: {
                final float mConeRatio = this.mConeRatio.getValue();
                final Cone cone = Cone.newCone().ratio(mConeRatio);
                final WireCone wireCone = WireCone.newWireCone();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(cone, wireCone);
                        break;
                    case LOW:
                        loadGeomSource(cone.subdivisionsAxis(6).subdivisionsHeight(1), wireCone);
                        break;
                    case HIGH:
                        loadGeomSource(cone.subdivisionsAxis(60).subdivisionsHeight(60), wireCone);
                        break;
                }
                CxxRuntime.delete(wireCone);
                CxxRuntime.delete(cone);
                break;
            }
            case CUBE: {
                final Cube cube = Cube.newCube();
                final WireCube wireCube = WireCube.newWireCube();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(cube, wireCube);
                        break;
                    case LOW:
                        loadGeomSource(cube.subdivisions(1), wireCube);
                        break;
                    case HIGH:
                        loadGeomSource(cube.subdivisions(10), wireCube);
                        break;
                }
                CxxRuntime.delete(wireCube);
                CxxRuntime.delete(cube);
                break;
            }
            case CYLINDER: {
                final Cylinder cylinder = Cylinder.newCylinder();
                final WireCylinder wireCylinder = WireCylinder.newWireCylinder();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(cylinder, wireCylinder);
                        break;
                    case LOW:
                        loadGeomSource(cylinder.subdivisionsAxis(6).subdivisionsCap(1), wireCylinder);
                        break;
                    case HIGH:
                        loadGeomSource(cylinder.subdivisionsAxis(60).subdivisionsHeight(20).subdivisionsCap(10), wireCylinder);
                        break;
                }
                CxxRuntime.delete(wireCylinder);
                CxxRuntime.delete(cylinder);
                break;
            }
            case HELIX: {
                final float mHelixRatio = this.mHelixRatio.getValue();
                final Float mHelixCoils = this.mHelixCoils.getValue();
                final int mHelixTwist = this.mHelixTwist.getValue();
                final float mHelixOffset = this.mHelixOffset.getValue();
                final Helix helix = Helix.newHelix().ratio(mHelixRatio).coils(mHelixCoils).twist(mHelixTwist, mHelixOffset);
                final WireCube wireCube = WireCube.newWireCube();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(helix, wireCube);
                        break;
                    case LOW:
                        loadGeomSource(helix.subdivisionsAxis(12).subdivisionsHeight(6), wireCube);
                        break;
                    case HIGH:
                        loadGeomSource(helix.subdivisionsAxis(60).subdivisionsHeight(60), wireCube);
                        break;
                }
                CxxRuntime.delete(wireCube);
                CxxRuntime.delete(helix);
                break;
            }
            case ICOSAHEDRON: {
                final Icosahedron icosahedron = Icosahedron.newIcosahedron();
                final WireIcosahedron wireIcosahedron = WireIcosahedron.newWireIcosahedron();
                loadGeomSource(icosahedron, wireIcosahedron);
                CxxRuntime.delete(wireIcosahedron);
                CxxRuntime.delete(icosahedron);
                break;
            }
            case ICOSPHERE: {
                final Icosphere icosphere = Icosphere.newIcosphere();
                final WireSphere wireSphere = WireSphere.newWireSphere();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(icosphere, wireSphere);
                        break;
                    case LOW:
                        loadGeomSource(icosphere.subdivisions(1), wireSphere);
                        break;
                    case HIGH:
                        loadGeomSource(icosphere.subdivisions(5), wireSphere);
                        break;
                }
                CxxRuntime.delete(wireSphere);
                CxxRuntime.delete(icosphere);
                break;
            }
            case SPHERE: {
                final Sphere sphere = Sphere.newSphere();
                final WireSphere wireSphere = WireSphere.newWireSphere();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(sphere, wireSphere);
                        break;
                    case LOW:
                        loadGeomSource(sphere.subdivisions(6), wireSphere);
                        break;
                    case HIGH:
                        loadGeomSource(sphere.subdivisions(60), wireSphere);
                        break;
                }
                CxxRuntime.delete(wireSphere);
                CxxRuntime.delete(sphere);
                break;
            }
            case TEAPOT: {
                final Teapot teapot = Teapot.newTeapot();
                final WireCube wireCube = WireCube.newWireCube();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(teapot, wireCube);
                        break;
                    case LOW:
                        loadGeomSource(teapot.subdivisions(2), wireCube);
                        break;
                    case HIGH:
                        loadGeomSource(teapot.subdivisions(12), wireCube);
                        break;
                }
                CxxRuntime.delete(wireCube);
                CxxRuntime.delete(teapot);
                break;
            }
            case TORUS: {
                final int mTorusTwist = this.mTorusTwist.getValue();
                final float mTorusOffset = this.mTorusOffset.getValue();
                final float mTorusRatio = this.mTorusRatio.getValue();
                final Torus torus = Torus.newTorus().twist(mTorusTwist, mTorusOffset).ratio(mTorusRatio);
                final WireTorus wireTorus = WireTorus.newWireTorus().ratio(mTorusRatio);
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(torus, wireTorus);
                        break;
                    case LOW:
                        loadGeomSource(torus.subdivisionsAxis(12).subdivisionsHeight(6), wireTorus);
                        break;
                    case HIGH:
                        loadGeomSource(torus.subdivisionsAxis(60).subdivisionsHeight(60), wireTorus);
                        break;
                }
                CxxRuntime.delete(wireTorus);
                CxxRuntime.delete(torus);
                break;
            }
            case TORUSKNOT: {
                final int mTorusKnotP = this.mTorusKnotP.getValue();
                final int mTorusKnotQ = this.mTorusKnotQ.getValue();
                final float mTorusKnotRadius = this.mTorusKnotRadius.getValue();
                final TorusKnot torusKnot = TorusKnot.newTorusKnot().parameters(mTorusKnotP, mTorusKnotQ).radius(mTorusKnotRadius).scale(mTorusKnotScale);
                final WireCube wireCube = WireCube.newWireCube();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(torusKnot, wireCube);
                        break;
                    case LOW:
                        loadGeomSource(torusKnot.subdivisionsAxis(6).subdivisionsHeight(64), wireCube);
                        break;
                    case HIGH:
                        loadGeomSource(torusKnot.subdivisionsAxis(32).subdivisionsHeight(1024), wireCube);
                        break;
                }
                CxxRuntime.delete(wireCube);
                CxxRuntime.delete(torusKnot);
                break;
            }
            case PLANE: {
                final Plane plane = Plane.newPlane();
                final WirePlane wirePlane = WirePlane.newWirePlane();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT: {
                        final IVec2 subdivisions = IVec2.newIVec2(10, 10);
                        loadGeomSource(plane.subdivisions(subdivisions), wirePlane.subdivisions(subdivisions));
                        CxxRuntime.delete(subdivisions);
                        break;
                    }
                    case LOW: {
                        final IVec2 subdivisions = IVec2.newIVec2(2, 2);
                        loadGeomSource(plane.subdivisions(subdivisions), wirePlane.subdivisions(subdivisions));
                        CxxRuntime.delete(subdivisions);
                        break;
                    }
                    case HIGH: {
                        final IVec2 subdivisions = IVec2.newIVec2(100, 100);
                        loadGeomSource(plane.subdivisions(subdivisions), wirePlane.subdivisions(subdivisions));
                        CxxRuntime.delete(subdivisions);
                        break;
                    }
                }
                CxxRuntime.delete(wirePlane);
                CxxRuntime.delete(plane);
                break;
            }

            case RECT: {
                final Rect rect = Rect.newRect();
                final WirePlane wirePlane = WirePlane.newWirePlane();
                loadGeomSource(rect, wirePlane);
                CxxRuntime.delete(wirePlane);
                CxxRuntime.delete(rect);
                break;
            }
            case ROUNDEDRECT: {
                final float mRoundedRectRadius = this.mRoundedRectRadius.getValue();
                final RoundedRect roundedRect = RoundedRect.newRoundedRect().cornerRadius(mRoundedRectRadius);
                final WireRoundedRect wireRoundedRect = WireRoundedRect.newWireRoundedRect().cornerRadius(mRoundedRectRadius);
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(roundedRect.cornerSubdivisions(3), wireRoundedRect.cornerSubdivisions(3));
                        break;
                    case LOW:
                        loadGeomSource(roundedRect.cornerSubdivisions(1), wireRoundedRect.cornerSubdivisions(1));
                        break;
                    case HIGH:
                        loadGeomSource(roundedRect.cornerSubdivisions(9), wireRoundedRect.cornerSubdivisions(9));
                        break;
                }
                CxxRuntime.delete(wireRoundedRect);
                CxxRuntime.delete(roundedRect);
                break;
            }
            case CIRCLE: {
                final Circle circle = Circle.newCircle();
                final WireCircle wireCircle = WireCircle.newWireCircle();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(circle.subdivisions(24), wireCircle.subdivisions(24));
                        break;
                    case LOW:
                        loadGeomSource(circle.subdivisions(8), wireCircle.subdivisions(8));
                        break;
                    case HIGH:
                        loadGeomSource(circle.subdivisions(120), wireCircle.subdivisions(120));
                        break;
                }
                CxxRuntime.delete(wireCircle);
                CxxRuntime.delete(circle);
                break;
            }
            case RING: {
                final float mRingWidth = this.mRingWidth.getValue();
                final Ring ring = Ring.newRing().width(mRingWidth);
                final WireCircle wireCircle = WireCircle.newWireCircle();
                switch (Quality.values()[mQualityCurrent]) {
                    case DEFAULT:
                        loadGeomSource(ring.subdivisions(24), wireCircle.subdivisions(24).radius(1 + 0.5f * mRingWidth));
                        break;
                    case LOW:
                        loadGeomSource(ring.subdivisions(8), wireCircle.subdivisions(8).radius(1 + 0.5f * mRingWidth));
                        break;
                    case HIGH:
                        loadGeomSource(ring.subdivisions(120), wireCircle.subdivisions(120).radius(1 + 0.5f * mRingWidth));
                        break;
                }
                CxxRuntime.delete(wireCircle);
                CxxRuntime.delete(ring);
                break;
            }
        }
    }

    private void loadGeomSource(Source source, Source sourceWire) {
        // The purpose of the TriMesh is to capture a bounding box; without that need we could just instantiate the Batch directly using primitive
        TriMesh.Format fmt = TriMesh.Format.newFormat().positions((byte) 3).normals().texCoords((byte) 2).tangents();
        final AttribSet availableAttribs = source.getAvailableAttribs();
        if (mShowColors.getValue() && availableAttribs.count(Attrib.COLOR.ordinal()) > 0)
            fmt.colors();
        CxxRuntime.delete(availableAttribs);

        final SharedPtr<TriMesh> mesh = TriMesh.create(source, fmt);
        final AxisAlignedBox bbox = mesh.get().calcBoundingBox();

        // Set mCameraLerpTarget
        mCameraLerpTarget.assign(bbox.getCenter());

        // Set mCameraViewDirection
        {
            final Vec3 viewDirection = mCamera.getViewDirection();
            mCameraViewDirection.assign(viewDirection);
            CxxRuntime.delete(viewDirection);
        }

        // Set mRecenterCamera
        mRecenterCamera.setValue(true);

        if (mPhongShader.hasAssociatedObject()) {
            mPrimitive.resetSwapAndDelete(Batch.create(mesh.get(), mPhongShader));
        }

        if (mWireShader.hasAssociatedObject()) {
            mPrimitiveWire.resetSwapAndDelete(Batch.create(sourceWire, mWireShader));
        }

        if (mWireframeShader.hasAssociatedObject()) {
            mPrimitiveWireframe.resetSwapAndDelete(Batch.create(mesh.get(), mWireframeShader));
        }

        final Vec3 bboxMax = bbox.getMax();
        final Vec3 bboxMin = bbox.getMin();
        Vec3 size = Vec3.sub(bboxMax, bboxMin);
        CxxRuntime.delete(bboxMin);
        CxxRuntime.delete(bboxMax);
        float scale = Algorithm.max(Algorithm.max(size.x(), size.y()), size.z()) / 25.0f;
        CxxRuntime.delete(size);

        // Set mPrimitiveNormalLines
        {
            final VertexNormalLines vertexNormalLines = VertexNormalLines.newVertexNormalLines(scale);
            final SourceMods sourceMods = Source.operatorRightShift(mesh.get(), vertexNormalLines);
            final ShaderDef shaderDef = ShaderDef.newShaderDef().color();
            final SharedPtr<GlslProg> stockShader = GL.getStockShader(shaderDef);
            mPrimitiveNormalLines.resetSwapAndDelete(Batch.create(sourceMods, stockShader));
            CxxRuntime.delete(shaderDef);
            CxxRuntime.delete(sourceMods);
            CxxRuntime.delete(vertexNormalLines);
        }

        // Set mPrimitiveTangentLines
        if (mesh.get().hasTangents()) {
            final VertexNormalLines vertexNormalLines = VertexNormalLines.newVertexNormalLines(scale, TANGENT.ordinal());
            final SourceMods sourceMods = Source.operatorRightShift(mesh.get(), vertexNormalLines);
            final ShaderDef shaderDef = ShaderDef.newShaderDef().color();
            final SharedPtr<GlslProg> stockShader = GL.getStockShader(shaderDef);
            mPrimitiveTangentLines.resetSwapAndDelete(Batch.create(sourceMods, stockShader));
            CxxRuntime.delete(shaderDef);
            CxxRuntime.delete(sourceMods);
            CxxRuntime.delete(vertexNormalLines);
        } else {
            mPrimitiveTangentLines.reset();
        }

        // Set title
        {
            final String title = "Geometry - " + mesh.get().getNumVertices() + " vertices - " + sourceWire.getNumVertices() / 2 + " lines ";
            final std.String string = std.String.getString(title);
            final SharedPtr<Window> window = getWindow();
            window.get().setTitle(string);
            CxxRuntime.delete(window);
            CxxRuntime.delete(string);
        }

        CxxRuntime.delete(bbox);
        CxxRuntime.delete(mesh);
        CxxRuntime.delete(fmt);
    }

    private void createPhongShader() {
        try {
            final SharedPtr<DataSource> vertexShader = loadAsset("phong.vert");
            final SharedPtr<DataSource> fragmentShader = loadAsset("phong.frag");
            mPhongShader.resetSwapAndDelete(GlslProg.create(vertexShader, fragmentShader));
            CxxRuntime.delete(fragmentShader);
            CxxRuntime.delete(vertexShader);
        } catch (Exception exc) {
            System.out.println("error loading phong shader: " + exc.getMessage());
        }
    }

    private void createWireShader() {
        try {
            final ShaderDef shaderDef = ShaderDef.newShaderDef().color();
            final SharedPtr<GlslProg> stockShader = GL.newContext().getStockShader(shaderDef);
            mWireShader.resetSwapAndDelete(GlslProg.createCopy(stockShader));
            CxxRuntime.delete(shaderDef);
        } catch (Exception exc) {
            System.out.println("error loading wire shader: " + exc.getMessage());
        }
    }

    private void createWireframeShader() {
        try {
            final SharedPtr<DataSource> vertexShader = loadAsset("wireframe.vert");
            final SharedPtr<DataSource> geometryShader = loadAsset("wireframe.geom");
            final SharedPtr<DataSource> fragmentShader = loadAsset("wireframe.frag");
            GlslProg.Format format = GlslProg.Format.newFormat()
                    .vertex(vertexShader)
                    .geometry(geometryShader)
                    .fragment(fragmentShader);
            mWireframeShader.resetSwapAndDelete(GlslProg.create(format));
            CxxRuntime.delete(format);
            CxxRuntime.delete(fragmentShader);
            CxxRuntime.delete(geometryShader);
            CxxRuntime.delete(vertexShader);
        } catch (Exception exc) {
            System.out.println("error loading wireframe shader: " + exc.getMessage());
        }
    }

    private void updateParams() {
        for (int i = 0; i < mPrimitiveParams.size(); ++i) {
            for (InterfaceGl.OptionsBase param : mPrimitiveParams.get(i)) {
                param.setVisible(i == mPrimitiveSelected.get());
            }
        }
    }

    private void createParams() {
        final SharedPtr<Window> window = getWindow();
        mParams = new CommonInterfaceGl(window, "Geometry Demo", 300, 400);
        CxxRuntime.delete(window);
        mParams.setOptions("", "valueswidth=100 refresh=0.1");

        final String[] primitives = new String[]{"Capsule", "Cone", "Cube", "Cylinder", "Helix",
                "Icosahedron", "Icosphere", "Sphere", "Teapot", "Torus", "Torus Knot", "Plane", "Rectangle",
                "Rounded Rectangle", "Circle", "Ring"};
        final String[] qualities = new String[]{"Low", "Default", "High"};
        final String[] viewModes = new String[]{"Shaded", "Wireframe"};
        final String[] texturingModes = new String[]{"None", "Procedural", "Sampler"};

        mParams.addParam("Primitive", primitives, mPrimitiveSelected).updateFn(updateParams.getUpdateFn());
        mParams.addParam("Quality", qualities, mQualitySelected);
        mParams.addParam("Viewing Mode", viewModes, mViewMode);
        mParams.addParam("Texturing Mode", texturingModes, mTexturingMode);

        mParams.addSeparator();

        mParams.addParam("Show Grid", mShowGrid);
        mParams.addParam("Show Normals", mShowNormals);
        mParams.addParam("Show Tangents", mShowTangents);

        final UpdateFn createGeometryFn = createGeometry.getUpdateFn();
        mParams.addParam("Show Colors", mShowColors).updateFn(createGeometryFn);

        mParams.addParam("Face Culling", mEnableFaceFulling).updateFn(enableFaceCulling.getUpdateFn());

        mParams.addSeparator();

        mParams.addParam("Show Wire Primitive", mShowWirePrimitive);
        mParams.addParam("Show Solid Primitive", mShowSolidPrimitive);

        mParams.addSeparator();

        // Capsule
        final Vector<InterfaceGl.OptionsBase> capsuleParams = mPrimitiveParams.get(CAPSULE.ordinal());
        capsuleParams.add(mParams.addParam("Capsule: Radius", mCapsuleRadius).step(0.01f).updateFn(createGeometryFn));
        capsuleParams.add(mParams.addParam("Capsule: Length", mCapsuleLength).step(0.05f).updateFn(createGeometryFn));
        mParams.keepAllOptions(capsuleParams);

        // Cone
        final Vector<InterfaceGl.OptionsBase> coneParams = mPrimitiveParams.get(CONE.ordinal());
        coneParams.add(mParams.addParam("Cone: Ratio", mConeRatio).step(0.01f).updateFn(createGeometryFn));
        mParams.keepAllOptions(coneParams);

        // Helix
        final Vector<InterfaceGl.OptionsBase> helixParams = mPrimitiveParams.get(HELIX.ordinal());
        helixParams.add(mParams.addParam("Helix: Ratio", mHelixRatio).step(0.01f).updateFn(createGeometryFn));
        helixParams.add(mParams.addParam("Helix: Coils", mHelixCoils).step(0.1f).updateFn(createGeometryFn));
        helixParams.add(mParams.addParam("Helix: Twist", mHelixTwist).updateFn(createGeometryFn));
        helixParams.add(mParams.addParam("Helix: Twist Offset", mHelixOffset).step(0.05f).updateFn(createGeometryFn));
        mParams.keepAllOptions(helixParams);

        // Ring
        final Vector<InterfaceGl.OptionsBase> ringParams = mPrimitiveParams.get(RING.ordinal());
        ringParams.add(mParams.addParam("Ring: Width", mRingWidth).step(0.01f).updateFn(createGeometryFn));
        mParams.keepAllOptions(ringParams);

        // Rounded Rect
        final Vector<InterfaceGl.OptionsBase> roundedRectParams = mPrimitiveParams.get(ROUNDEDRECT.ordinal());
        roundedRectParams.add(mParams.addParam("Corner Radius", mRoundedRectRadius).step(0.01f).updateFn(createGeometryFn));
        mParams.keepAllOptions(roundedRectParams);

        // Torus
        final Vector<InterfaceGl.OptionsBase> torusParams = mPrimitiveParams.get(TORUS.ordinal());
        torusParams.add(mParams.addParam("Torus: Ratio", mTorusRatio).step(0.01f).updateFn(createGeometryFn));
        torusParams.add(mParams.addParam("Torus: Twist", mTorusTwist).updateFn(createGeometryFn));
        torusParams.add(mParams.addParam("Torus: Twist Offset", mTorusOffset).step(0.05f).updateFn(createGeometryFn));
        mParams.keepAllOptions(torusParams);

        // Torus Knot
        final Vector<InterfaceGl.OptionsBase> torusKnotParams = mPrimitiveParams.get(TORUSKNOT.ordinal());
        torusKnotParams.add(mParams.addParam("Torus Knot: Parameter P", mTorusKnotP).updateFn(createGeometryFn));
        torusKnotParams.add(mParams.addParam("Torus Knot: Parameter Q", mTorusKnotQ).updateFn(createGeometryFn));
        final FloatPtr mTorusKnotScaleData = CxxRuntime.castToPtr(mTorusKnotScale).getFloatPtr();
        torusKnotParams.add(mParams.addParam("Torus Knot: Scale X", mTorusKnotScaleData.ofs(0)).step(0.1f).updateFn(createGeometryFn));
        torusKnotParams.add(mParams.addParam("Torus Knot: Scale Y", mTorusKnotScaleData.ofs(1)).step(0.1f).updateFn(createGeometryFn));
        torusKnotParams.add(mParams.addParam("Torus Knot: Scale Z", mTorusKnotScaleData.ofs(2)).step(0.1f).updateFn(createGeometryFn));
        torusKnotParams.add(mParams.addParam("Torus Knot: Radius", mTorusKnotRadius).step(0.05f).updateFn(createGeometryFn));
        mParams.keepAllOptions(torusKnotParams);

        mParams.finish();
        updateParams();
    }
}
