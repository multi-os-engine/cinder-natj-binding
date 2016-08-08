package cinder.app;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/app/AppBase.h"}, useQuotes = false)
@CxxClass("cinder::app::AppBase::Settings")
public interface Settings extends CxxObject {

    //! Sets the size of the default window measured in pixels
    @CxxMethod
    public void setWindowSize(int windowSizeX, int windowSizeY);

    //! Sets the size of the default window measured in pixels
    //void setWindowSize( const ivec2 size );

    //! Gets the size of the default window measured in pixels
    //ivec2	getWindowSize();

    //! Returns the position of the default window in screen coordinates measured in pixels
    //ivec2	getWindowPos();

    //! Sets the position of the default window in screen coordinates measured in pixels
    @CxxMethod
    public void setWindowPos(int windowPosX, int windowPosY);

    //! Sets the position of the default window in screen coordinates measured in pixels
    //void setWindowPos( const ivec2 &windowPos );

    //! Returns whether a non-default window position has been requested
    @CxxMethod
    public boolean isWindowPosSpecified();

    //! Marks the window position setting as unspecified, effectively requesting the default
    @CxxMethod
    public void setWindowPosUnspecified();

    //! Sets whether the app quits automatically when its last window is closed. Enabled by default.
    @CxxMethod
    public void setQuitOnLastWindowCloseEnabled(boolean enable);

    //! Returns whether the app quits automatically when its last window is closed. Enabled by default.
    @CxxMethod
    public boolean isQuitOnLastWindowCloseEnabled();

    //! Returns whether the default window is fullscreen
    @CxxMethod
    public boolean isFullScreen();

    //! Sets whether the default window is fullscreen at startup with FullScreenOptions \a options. Kiosk Mode is enabled by default.
    //void	setFullScreen( bool fullScreen = true, const FullScreenOptions &options = FullScreenOptions() ) { mDefaultWindowFormat.setFullScreen( fullScreen, options ); }

    //! Returns whether the default window is resizable
    @CxxMethod
    public boolean isResizable();

    //! Sets the default window to be resizable or not
    @CxxMethod
    public void setResizable(boolean resizable);

    //! Returns whether the default window will be created without a border (chrome/frame)
    @CxxMethod
    public boolean isBorderless();

    //! Sets the default window to be created without a border (chrome/frame)
    @CxxMethod
    public void setBorderless(boolean borderless);

    //! Returns whether the default  window always remains above all other windows
    @CxxMethod
    public boolean isAlwaysOnTop();

    //! Sets whether the default window always remains above all other windows
    @CxxMethod
    public void setAlwaysOnTop(boolean alwaysOnTop);

    //! Returns the display for the default window
    //DisplayRef	getDisplay() const								{ return mDefaultWindowFormat.getDisplay(); }

    //! Sets the display for the default window
    //void		setDisplay( DisplayRef display )				{ mDefaultWindowFormat.setDisplay( display ); }

    //! Returns the Window::Format which will be used if no calls are made to Settings::prepareWindow()
    //Window::Format		getDefaultWindowFormat() const							{ return mDefaultWindowFormat; }

    //! Sets the Window::Format which will be used if no calls are made to Settings::prepareWindow()
    //void				setDefaultWindowFormat( const Window::Format &format )	{ mDefaultWindowFormat = format; }

    //! Sets the default Renderer, overridding what was passed in during app instanciation.
    //void		setDefaultRenderer( const RendererRef &renderer )	{ mDefaultRenderer = renderer; }

    //! Returns the default Renderer.
    //RendererRef	getDefaultRenderer() const							{ return mDefaultRenderer; }

    //void		prepareWindow( const Window::Format &format );

    //std::vector<Window::Format>&		getWindowFormats()			{ return mWindowFormats; }

    //const std::vector<Window::Format>&	getWindowFormats() const	{ return mWindowFormats; }

    //! the title of the app reflected in ways particular to the app type and platform (such as its Window or menu)
    @CxxMethod
    public
    @CxxConst
    @CxxByReference
    std.String getTitle();

    //! the title of the app reflected in ways particular to the app type and platform (such as its Window or menu)

    @CxxMethod
    public void setTitle(@CxxConst @CxxByReference std.String title);

    //! Sets whether Windows created on a high-density (Retina) display will have their resolution doubled. Default is \c true on iOS and \c false on other platforms
    @CxxMethod
    public void setHighDensityDisplayEnabled(boolean enable);

    //! Returns whether Windows created on a high-density (Retina) display will have their resolution doubled. Default is \c true on iOS and \c false on other platforms
    @CxxMethod
    public boolean isHighDensityDisplayEnabled();

    //! Registers the app to receive multiTouch events from the operating system. Disabled by default on desktop platforms, enabled on mobile.
    @CxxMethod
    public void setMultiTouchEnabled(boolean enable);

    //! Returns whether the app is registered to receive multiTouch events from the operating system. Disabled by default on desktop platforms, enabled on mobile.
    @CxxMethod
    public boolean isMultiTouchEnabled();

    //! a value of \c true allows screensavers or the system's power management to hide the app. Default value is \c false on desktop, and \c true on mobile
    @CxxMethod
    public void setPowerManagementEnabled(boolean enable);

    //! is power management enabled, allowing screensavers and the system's power management to hide the application
    @CxxMethod
    public boolean isPowerManagementEnabled();

    //! Sets maximum frameRate the update/draw loop will execute at, specified in frames per second. FrameRate limiting is on by default, at 60 FPS.
    @CxxMethod
    public void setFrameRate(float frameRate);

    //! Disables the frameRate limiting, which is on by default. Restore using setFrameRate(). See also enableVerticalSync().
    @CxxMethod
    public void disableFrameRate();

    //! Returns whether frameRate limiting is enabled. On by default, at 60 FPS.
    @CxxMethod
    public boolean isFrameRateEnabled();

    //! Maximum frameRate of the application specified in frames per second
    @CxxMethod
    public float getFrameRate();

    //! Returns the command line args passed to the application from its entry point (ex. a main's argc / argv).
    @CxxMethod
    public
    @CxxConst
    @CxxByReference
    std.Vector<std.String> getCommandLineArgs();

    //!	Set this to true if the app should terminate prior to launching.
    @CxxMethod
    public void setShouldQuit(boolean shouldQuit);

    //! Whether or not the app should terminate prior to launching
    @CxxMethod
    public boolean getShouldQuit();
}
