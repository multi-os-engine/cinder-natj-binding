package sample.utils;

import boost.filesystem.Path;
import cinder.DataSource;
import cinder.Surface;
import cinder.Timeline;
import cinder.app.*;
import cinder.app.cocoa.AppMac;
import org.moe.natj.cxx.CxxInheritedObject;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;
import std.SharedPtr;

@CxxInheritedClass("natj::cindersample::CommonApp")
public abstract class CommonApp extends CxxInheritedObject implements AppMac {

    private final AppBase _super;

    @CxxInheritedConstructor()
    private static native long newCommonApp(long java);

    public CommonApp() {
        super(new ICxxConstructor() {
            @Override
            public long construct(long java) {
                return CommonApp.newCommonApp(java);
            }
        });
        // TODO: use direct interface to AppMac?
        _super = cxxGetDirectInterface(AppBase.class);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void setup() {
        _super.setup();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void keyDown(@CxxByValue KeyEvent event) {
        _super.keyDown(event);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseMove(@CxxByValue MouseEvent event) {
        _super.mouseMove(event);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void draw() {
        _super.draw();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseDown(@CxxByValue MouseEvent event) {
        _super.mouseDown(event);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseDrag(@CxxByValue MouseEvent event) {
        _super.mouseDrag(event);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseUp(@CxxByValue MouseEvent event) {
        _super.mouseUp(event);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void resize() {
        _super.resize();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void update() {
        _super.update();
    }

    @CxxMethod
    @CxxByValue
    public native SharedPtr<DataSource> loadAsset(@CxxConst @CxxByReference Path path);

    public SharedPtr<DataSource> loadAsset(String path) {
        Path p = Path.newPath(path);
        try {
            return loadAsset(p);
        } finally {
            CxxRuntime.delete(p);
        }
    }

    //! Adds an absolute path 'dirPath' to the list of directories which are searched for assets.
    @CxxMethod
    public void addAssetDirectory(@CxxConst @CxxByReference Path dirPath) {
        _super.addAssetDirectory(dirPath);
    }

    @CxxMethod
    @CxxByValue
    public Path getAppPath() {
        return _super.getAppPath();
    }

    @CxxMethod
    public float getWindowAspectRatio() {
        return _super.getWindowAspectRatio();
    }


    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void setFullScreen(boolean fullScreen) {
        _super.setFullScreen(fullScreen);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void quit() {
        _super.quit();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public boolean isFullScreen() {
        return _super.isFullScreen();
    }

    @CxxMethod
    @CxxByReference
    public Timeline timeline() {
        return _super.timeline();
    }

    @CxxMethod
    @CxxByValue
    public native SharedPtr<DataSource> loadResource(@CxxConst @CxxByReference Path resourcePath);

    @CxxMethod
    public int getWindowWidth() {
        return _super.getWindowWidth();
    }

    @CxxMethod
    public int getWindowHeight() {
        return _super.getWindowHeight();
    }

    @CxxMethod
    public void setWindowSize(int windowWidth, int windowHeight) {
        _super.setWindowSize(windowWidth, windowHeight);
    }

    @CxxMethod
    public void setWindowPos(int x, int y) {
        _super.setWindowPos(x, y);
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByValue
    public native SharedPtr<Window> getWindow();

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void fileDrop(@CxxByValue FileDropEvent event) {
        _super.fileDrop(event);
    }

    @CxxMethod(isConst = true)
    public double getElapsedSeconds() {
        return _super.getElapsedSeconds();
    }

    @CxxMethod(isConst = true)
    @CxxByValue
    public IVec2 getWindowSize() {
        return _super.getWindowSize();
    }

    @CxxMethod
    @CxxByValue
    public Surface copyWindowSurface() {
        return _super.copyWindowSurface();
    }
}
