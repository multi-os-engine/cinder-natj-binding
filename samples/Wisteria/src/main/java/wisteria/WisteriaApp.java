package wisteria;

import boost.filesystem.Path;
import cairo.Cairo;
import cairo.Context;
import cairo.SurfaceImage;
import cairo.SurfaceQuartz;
import cinder.*;
import cinder.app.KeyEvent;
import cinder.app.MouseEvent;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxByValue;
import glm.detail.Vec2;
import sample.utils.CommonApp;

import java.util.ArrayList;
import java.util.List;

public class WisteriaApp extends CommonApp {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static int idleRestartFrames = 72;

    public SurfaceImage mOffscreenBuffer;
    public Context mOffscreenContext;
    public List<Branch> mBlossoms;
    public boolean mIsIdle; // are the blossoms all done growing?
    public int mIdleFrames;

    public WisteriaApp() {
        mBlossoms = new ArrayList<Branch>();
    }

    public void setup() {
        // allocate our offscreen buffer
        mOffscreenBuffer = SurfaceImage.newSurfaceImage(WIDTH, HEIGHT, false);
        mOffscreenContext = Context.newContext(mOffscreenBuffer);

        // fill the buffer with gray
        mOffscreenContext.setSourceRgb(0.23f, 0.23f, 0.23f);
        mOffscreenContext.paint();

        // Let the Branches know how big our windows is
        Branch.setWindowSize_static(WIDTH, HEIGHT);

        // Create some starting blossoms
        Vec2 vec2 = Vec2.newVec2(WIDTH - 50, 50);
        mBlossoms.add(new Branch(vec2, 0.619444444f, 0));
        vec2.assign(60, HEIGHT - 60);
        mBlossoms.add(new Branch(vec2, 0.905f, 180));
        vec2.assign(WIDTH / 2, HEIGHT / 2);
        mBlossoms.add(new Branch(vec2, 0.105555556f, 320));
        CxxRuntime.delete(vec2);

        mIsIdle = false;
        mIdleFrames = 0;
    }

    public void keyDown(@CxxByValue KeyEvent event) {
        switch (event.getChar()) {
            case 'p': {
                System.out.println("CRASH OCCURS IN ORIGINAL SAMPLE");
                Path lhs = Utilities.getHomeDirectory();
                Path path = Path.append(lhs, "wisteriaShot.png");
                CxxRuntime.delete(lhs);
                Surface surface = copyWindowSurface();
                ImageIo.writeImage(path, surface.asImageSourceRef());
                CxxRuntime.delete(surface);
                CxxRuntime.delete(path);
                break;
            }
        }
    }

    public void mouseDown(@CxxByValue MouseEvent event) {
        Vec2 vec2 = Vec2.newVec2(event.getPos());
        mBlossoms.add(new Branch(vec2, Branch.randomHue(), 0));
        CxxRuntime.delete(vec2);
    }

    public void update() {
        // Iterate all the blossoms, update each one and notice if they are all idle
        boolean isIdle = true;
        for (Branch b : mBlossoms) {
            b.update();
            if (b.isAlive()) {
                isIdle = false;
            }
        }
        if (isIdle && (!mIsIdle)) {
            mIsIdle = true;  // first frame of idleness
            mIdleFrames = 0;
        } else if (isIdle) { // the blossoms have all not changed in a while, let's clear them out and put up some new ones
            if (mIdleFrames++ > idleRestartFrames) {
                // clear the context
                mOffscreenContext.setSourceRgb(0.23f, 0.23f, 0.23f);
                mOffscreenContext.paint();
                mBlossoms.clear();
                Vec2 vec2 = Vec2.newVec2(Rand.randFloat((float) WIDTH), Rand.randFloat((float) HEIGHT));
                mBlossoms.add(new Branch(vec2, Branch.randomHue(), 0));
                vec2.assign(Rand.randFloat((float) WIDTH), Rand.randFloat((float) HEIGHT));
                mBlossoms.add(new Branch(vec2, Branch.randomHue(), 180));
                vec2.assign(Rand.randFloat((float) WIDTH), Rand.randFloat((float) HEIGHT));
                mBlossoms.add(new Branch(vec2, Branch.randomHue(), 320));
                CxxRuntime.delete(vec2);

                mIsIdle = false;
            }
        }
    }

    public void draw() {
        SurfaceQuartz surface = Cairo.createWindowSurface();
        Context ctx = Context.newContext(surface);
        CxxRuntime.delete(surface);
        renderScene(mOffscreenContext);
        Area bounds = mOffscreenBuffer.getBounds();
        ctx.copySurface(mOffscreenBuffer, bounds);
        CxxRuntime.delete(bounds);
        CxxRuntime.delete(ctx);
    }

    public void renderScene(Context ctx) {
        for (Branch b : mBlossoms) {
            b.draw(ctx);
        }
    }

}
