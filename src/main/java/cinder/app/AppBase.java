package cinder.app;

import boost.filesystem.Path;
import cinder.DataSource;
import cinder.Display;
import cinder.Surface;
import cinder.Timeline;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;
import std.SharedPtr;

@CxxHeader(value = {"cinder/app/AppBase.h"}, useQuotes = false)
@CxxClass("cinder::app::AppBase")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface AppBase extends CxxObject {

    //! Startup settings, used during App construction. They are modified before the app is created by passing a SettingsFn to the app instanciation macros.
    @CxxClass("cinder::app::AppBase::Settings")
    public interface Settings extends CxxObject {

        @CxxConstructor
        public static Settings newSettings() {
            throw new CxxExpectedGeneratedCodeException();
        }

        //! Sets the size of the default window measured in pixels
        @CxxMethod
        public void setWindowSize(int windowSizeX, int windowSizeY);

        //! Sets the size of the default window measured in pixels
        @CxxMethod
        public void setWindowSize(@CxxConst @CxxByReference IVec2 size);

        //! Gets the size of the default window measured in pixels
        @CxxMethod(isConst = true)
        @CxxByValue
        public IVec2 getWindowSize();

        //! Returns the position of the default window in screen coordinates measured in pixels
        @CxxMethod(isConst = true)
        @CxxByValue
        public IVec2 getWindowPos();

        //! Sets the position of the default window in screen coordinates measured in pixels
        @CxxMethod
        public void setWindowPos(int windowPosX, int windowPosY);

        //! Sets the position of the default window in screen coordinates measured in pixels
        @CxxMethod
        public void setWindowPos(@CxxConst @CxxByReference IVec2 windowPos);

        //! Returns whether a non-default window position has been requested
        @CxxMethod(isConst = true)
        public boolean isWindowPosSpecified();

        //! Marks the window position setting as unspecified, effectively requesting the default
        @CxxMethod
        public void setWindowPosUnspecified();

        //! Sets whether the app quits automatically when its last window is closed. Enabled by default.
        @CxxMethod
        public void setQuitOnLastWindowCloseEnabled(boolean enable);

        //! Returns whether the app quits automatically when its last window is closed. Enabled by default.
        @CxxMethod(isConst = true)
        public boolean isQuitOnLastWindowCloseEnabled();

        //! Returns whether the default window is fullscreen
        @CxxMethod
        public boolean isFullScreen();

        //! Sets whether the default window is fullscreen at startup with FullScreenOptions \a options. Kiosk Mode is enabled by default.
        @CxxMethod
        public void setFullScreen(boolean fullScreen, @CxxConst @CxxByReference FullScreenOptions options);

        //! Returns whether the default window is resizable
        @CxxMethod(isConst = true)
        public boolean isResizable();

        //! Sets the default window to be resizable or not
        @CxxMethod
        public void setResizable(boolean resizable);

        //! Returns whether the default window will be created without a border (chrome/frame)
        @CxxMethod(isConst = true)
        public boolean isBorderless();

        //! Sets the default window to be created without a border (chrome/frame)
        @CxxMethod
        public void setBorderless(boolean borderless);

        //! Returns whether the default  window always remains above all other windows
        @CxxMethod(isConst = true)
        public boolean isAlwaysOnTop();

        //! Sets whether the default window always remains above all other windows
        @CxxMethod
        public void setAlwaysOnTop(boolean alwaysOnTop);

        //! Returns the display for the default window
        @CxxMethod(isConst = true)
        @CxxByValue
        public SharedPtr<Display> getDisplay();

        //! Sets the display for the default window
        @CxxMethod
        public void setDisplay(@CxxByValue SharedPtr<Display> display);

        //! Returns the Window::Format which will be used if no calls are made to Settings::prepareWindow()
        @CxxMethod(isConst = true)
        @CxxByValue
        public Window.Format getDefaultWindowFormat();

        //! Sets the Window::Format which will be used if no calls are made to Settings::prepareWindow()
        @CxxMethod
        public void setDefaultWindowFormat(@CxxConst @CxxByReference Window.Format format);

        //! Sets the default Renderer, overridding what was passed in during app instanciation.
        @CxxMethod
        public void setDefaultRenderer(@CxxConst @CxxByReference SharedPtr<Renderer> renderer);

        //! Returns the default Renderer.
        @CxxMethod(isConst = true)
        @CxxByValue
        public SharedPtr<Renderer> getDefaultRenderer();

        @CxxMethod
        public void prepareWindow(@CxxConst @CxxByReference Window.Format format);

        @CxxMethod(value = "getWindowFormats")
        @CxxByReference
        public std.Vector<Window.Format> getWindowFormats();

        @CxxMethod(value = "getWindowFormats", isConst = true)
        @CxxConst
        @CxxByReference
        public std.Vector<Window.Format> getWindowFormatsConst();

        //! the title of the app reflected in ways particular to the app type and platform (such as its Window or menu)
        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public std.String getTitle();

        //! the title of the app reflected in ways particular to the app type and platform (such as its Window or menu)
        @CxxMethod
        public void setTitle(@CxxConst @CxxByReference std.String title);

        //! Sets whether Windows created on a high-density (Retina) display will have their resolution doubled. Default is \c true on iOS and \c false on other platforms
        @CxxMethod
        public void setHighDensityDisplayEnabled(boolean enable);

        //! Returns whether Windows created on a high-density (Retina) display will have their resolution doubled. Default is \c true on iOS and \c false on other platforms
        @CxxMethod(isConst = true)
        public boolean isHighDensityDisplayEnabled();

        //! Registers the app to receive multiTouch events from the operating system. Disabled by default on desktop platforms, enabled on mobile.
        @CxxMethod
        public void setMultiTouchEnabled(boolean enable);

        //! Returns whether the app is registered to receive multiTouch events from the operating system. Disabled by default on desktop platforms, enabled on mobile.
        @CxxMethod(isConst = true)
        public boolean isMultiTouchEnabled();

        //! a value of \c true allows screensavers or the system's power management to hide the app. Default value is \c false on desktop, and \c true on mobile
        @CxxMethod
        public void setPowerManagementEnabled(boolean enable);

        //! is power management enabled, allowing screensavers and the system's power management to hide the application
        @CxxMethod(isConst = true)
        public boolean isPowerManagementEnabled();

        //! Sets maximum frameRate the update/draw loop will execute at, specified in frames per second. FrameRate limiting is on by default, at 60 FPS.
        @CxxMethod
        public void setFrameRate(float frameRate);

        //! Disables the frameRate limiting, which is on by default. Restore using setFrameRate(). See also enableVerticalSync().
        @CxxMethod
        public void disableFrameRate();

        //! Returns whether frameRate limiting is enabled. On by default, at 60 FPS.
        @CxxMethod(isConst = true)
        public boolean isFrameRateEnabled();

        //! Maximum frameRate of the application specified in frames per second
        @CxxMethod(isConst = true)
        public float getFrameRate();

        //! Returns the command line args passed to the application from its entry point (ex. a main's argc / argv).
        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public std.Vector<std.String> getCommandLineArgs();

        //!	Set this to true if the app should terminate prior to launching.
        @CxxMethod
        public void setShouldQuit(boolean shouldQuit);

        //! Whether or not the app should terminate prior to launching
        @CxxMethod(isConst = true)
        public boolean getShouldQuit();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void keyDown(@CxxByValue KeyEvent event);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void setup();

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void draw();

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void resize();

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void update();

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseDrag(@CxxByValue MouseEvent event);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseUp(@CxxByValue MouseEvent event);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseDown(@CxxByValue MouseEvent event);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void mouseMove(@CxxByValue MouseEvent event);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void setFullScreen(boolean fullScreen);

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
    public void quit();

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public boolean isFullScreen();

    @CxxMethod
    @CxxByValue
    public SharedPtr<DataSource> loadAsset(@CxxConst @CxxByReference Path path);

    //! Adds an absolute path 'dirPath' to the list of directories which are searched for assets.
    @CxxMethod
    public void addAssetDirectory(@CxxConst @CxxByReference Path dirPath);

    @CxxMethod
    @CxxByValue
    public Path getAppPath();

    @CxxMethod
    public float getWindowAspectRatio();

    //! Returns a reference to the App's Timeline
    @CxxMethod
    @CxxByReference
    public Timeline timeline();

    @CxxMethod
    @CxxByValue
    public SharedPtr<DataSource> loadResource(@CxxConst @CxxByReference Path resourcePath);

    //! Returns the width of the App's current window measured in points
    @CxxMethod
    public int getWindowWidth();

    //! Returns the height of the App's current window measured in points
    @CxxMethod
    public int getWindowHeight();

    //! Sets the size of the App's current window measured in points. Ignored in full-screen mode.
    @CxxMethod
    public void setWindowSize(int windowWidth, int windowHeight);

    //! Sets the coordinates of the top-left corner of the current window measured in points
    @CxxMethod
    public void setWindowPos(int x, int y);

    //! Override to receive file-drop events.
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void fileDrop(@CxxByValue FileDropEvent event);


    //! Returns the number of seconds which have elapsed since application launch
    @CxxMethod(isConst = true)
    public double getElapsedSeconds();

    //! Returns the size of the App's current window measured in points
    @CxxMethod(isConst = true)
    @CxxByValue
    public IVec2 getWindowSize();

    /**
     * \return a copy of the current window's contents as a Surface8u
     **/
    @CxxMethod
    @CxxByValue
    Surface copyWindowSurface();

    //! Returns the the currently active Window. Throws ExcInvalidWindow if called with no active window.
    /*@CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByValue
    public Window.shared_ptr getWindow();*/
}
