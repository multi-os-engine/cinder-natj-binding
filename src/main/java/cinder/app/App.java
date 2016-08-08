package cinder.app;

import boost.filesystem.Path;
import cinder.*;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.IVec2;
import glm.detail.Vec2;
import std.SharedPtr;
import std.String;
import std.Vector;

@CxxHeader(value = {"cinder/app/AppBase.h"}, useQuotes = false)
public class App {
    /**
     * @name App Free Functions
     * Convenience methods which mirror App member-functions and apply to the active application
     **/
    //@{
    @CxxFunction("cinder::app::getWindow")
    @CxxByValue
    public static native SharedPtr<Window> getWindow();

    //! Returns the number of Windows the app has open
    @CxxFunction("cinder::app::getNumWindows")
    @NULong
    public static native long getNumWindows();

    //! Gets a Window by index, in the range [0, getNumWindows()).
    @CxxFunction("cinder::app::getWindowIndex")
    @CxxByValue
    public static native SharedPtr<Window> getWindowIndex(@NULong long index);

    //! Returns the width of the active App's window measured in points, or of the screen when in full-screen mode
    @CxxFunction("cinder::app::getWindowWidth")
    public static native int getWindowWidth();

    //! Sets the position of the active App's window measured in points. Ignored in full-screen mode
    @CxxFunction("cinder::app::setWindowPos")
    public static native void setWindowPos(@CxxConst @CxxByReference IVec2 windowPos);

    //! Sets the position of the active App's window measured in points. Ignored in full-screen mode
    @CxxFunction("cinder::app::setWindowPos")
    public static native void setWindowPos(int x, int y);

    //! Returns the height of the active App's window measured in points, or the screen when in full-screen mode.
    @CxxFunction("cinder::app::getWindowHeight")
    public static native int getWindowHeight();

    //! Sets the size of the active App's window in points. Ignored in full-screen mode.
    @CxxFunction("cinder::app::setWindowSize")
    public static native void setWindowSize(@CxxByValue IVec2 size);

    //! Sets the size of the active App's window in points. Ignored in full-screen mode.
    @CxxFunction("cinder::app::setWindowSize")
    public static native void setWindowSize(int windowSizeX, int windowSizeY);

    //! Returns the center of the active App's window in pixels or of the screen in full-screen mode.

    /**
     * Equivalent to <tt>Vec2( getWindowWidth() * 0.5, getWindowHeight() * 0.5 ) </tt>
     **/
    @CxxFunction("cinder::app::getWindowCenter")
    @CxxByValue
    public static native Vec2 getWindowCenter();

    //! Returns the size of the active App's window or the screen in full-screen mode measured in points
    @CxxFunction("cinder::app::getWindowSize")
    @CxxByValue
    public static native IVec2 getWindowSize();

    //! Returns the position of the active App's window measured in points
    @CxxFunction("cinder::app::getWindowPos")
    @CxxByValue
    public static native IVec2 getWindowPos();

    //! Returns the aspect ratio of the active App's window or the screen in full-screen mode
    @CxxFunction("cinder::app::getWindowAspectRatio")
    public static native float getWindowAspectRatio();

    //! Returns the bounding area of the active App's window or the screen in full-screen mode measured in points

    /**
     * Equivalent to \code Area( 0, 0, getWindowWidth(), getWindowHeight() ); \endcode
     **/
    @CxxFunction("cinder::app::getWindowBounds")
    @CxxByValue
    public static native Area getWindowBounds();

    //! Returns the contentScale of the active App's window, which is the multiplier that maps points to pixels
    @CxxFunction("cinder::app::getWindowContentScale")
    public static native float getWindowContentScale();

    //! Returns the maximum frame-rate the active App will attempt to maintain.
    @CxxFunction("cinder::app::getFrameRate")
    public static native float getFrameRate();

    //! Sets the maximum frame-rate the active App will attempt to maintain.
    @CxxFunction("cinder::app::setFrameRate")
    public static native void setFrameRate(float frameRate);

    //! Returns whether the active App is in full-screen mode or not.
    @CxxFunction("cinder::app::isFullScreen")
    public static native boolean isFullScreen();

    //! Sets whether the active App is in full-screen mode based on \a fullScreen
    @CxxFunction("cinder::app::setFullScreen")
    public static native void setFullScreen(boolean fullScreen);

    //! Returns a scalar mapped from points to pixels for the current Window
    @CxxFunction("cinder::app::toPixels")
    public static native float toPixels(float s);

    //! Returns a Vec2 mapped from points to pixels for the current Window
    @CxxFunction("cinder::app::toPixels")
    @CxxByValue
    public static native Vec2 toPixels(@CxxByValue Vec2 s);

    //! Returns a IVec2 mapped from points to pixels for the current Window
    @CxxFunction("cinder::app::toPixels")
    @CxxByValue
    public static native IVec2 toPixels(@CxxByValue IVec2 s);

    //! Returns an Area mapped from points to pixels for the current Window
    @CxxFunction("cinder::app::toPixels")
    @CxxByValue
    public static native Area toPixels(@CxxConst @CxxByReference Area a);

    //! Returns a Rectf mapped from points to pixels for the current Window
    @CxxFunction("cinder::app::toPixels")
    @CxxByValue
    public static native Rectf toPixels(@CxxConst @CxxByReference Rectf a);

    //! Returns a scalar mapped from pixels to points for the current Window
    @CxxFunction("cinder::app::toPoints")
    public static native float toPoints(float s);

    //! Returns a Vec2 mapped from pixels to points for the current Window
    @CxxFunction("cinder::app::toPoints")
    @CxxByValue
    public static native Vec2 toPoints(@CxxByValue Vec2 s);

    //! Returns a IVec2 mapped from pixels to points for the current Window
    @CxxFunction("cinder::app::toPoints")
    @CxxByValue
    public static native IVec2 toPoints(@CxxByValue IVec2 s);

    //! Returns an Area mapped from pixels to points for the current Window
    @CxxFunction("cinder::app::toPoints")
    @CxxByValue
    public static native Area toPoints(@CxxConst @CxxByReference Area a);

    //! Returns a Rectf mapped from pixels to points for the current Window
    @CxxFunction("cinder::app::toPoints")
    @CxxByValue
    public static native Rectf toPoints(@CxxConst @CxxByReference Rectf a);

    //! Returns the number seconds which have elapsed since the active App launched.
    @CxxFunction("cinder::app::getElapsedSeconds")
    public static native double getElapsedSeconds();

    //! Returns the number of animation frames which have elapsed since the active App launched.
    @CxxFunction("cinder::app::getElapsedFrames")
    @CxxUnsigned
    public static native int getElapsedFrames();

    //! Returns \c true if the calling thread is the Application's main thread (the thread running the main function), false otherwise.
    @CxxFunction("cinder::app::isMainThread")
    public static native boolean isMainThread();

    //    #if defined( CINDER_MSW )
//    //! (MSW only) Returns a DataSource to an application resource. \a mswID and \a mswType identify the resource as defined the application's .rc file(s). \sa \ref CinderResources
//    @CxxFunction("cinder::app::loadResource") DataSourceRef loadResource ( @CxxConst @CxxByReference path resourcePath, int mswID, @CxxConst @CxxByReference string mswType );
//    #else
    //! Returns a DataSource to an application resource. \a resourcePath is defined on a per-platform basis. \sa \ref CinderResources
    @CxxFunction("cinder::app::loadResource")
    @CxxByValue
    public static native SharedPtr<DataSource> loadResource(@CxxConst @CxxByReference Path resourcePath);
//    #endif // defined( CINDER_MSW )

    //! Returns a DataSourceRef to the active App's's asset. Throws a AssetLoadExc on failure.
    @CxxFunction("cinder::app::loadAsset")
    @CxxByValue
    public static native SharedPtr<DataSource> loadAsset(@CxxConst @CxxByReference Path relativePath);

    //! Returns a path to the active App's asset. Returns an empty path on failure.
    @CxxFunction("cinder::app::getAssetPath")
    @CxxByValue
    public static native Path getAssetPath(@CxxConst @CxxByReference Path relativePath);

    //! Adds an absolute path \a dirPath to the active App's list of directories which are searched for assets.
    @CxxFunction("cinder::app::addAssetDirectory")
    public static native void addAssetDirectory(@CxxConst @CxxByReference Path dirPath);

    //! Returns a vector of directories that are searched when looking up an asset path.
    @CxxFunction("cinder::app::getAssetDirectories")
    @CxxConst
    @CxxByReference
    public static native Vector<Path> getAssetDirectories();

    //! Returns the absolute file path to the resources folder. Returns an empty path on windows. \sa CinderResources
    @CxxFunction("cinder::app::getResourceDirectory")
    @CxxByValue
    public static native Path getResourceDirectory();

    //! Returns the absolute file path to a resource located at \a rsrcRelativePath inside the bundle's resources folder. Returns an empty path on windows. Throws ResourceLoadExc on failure. \sa CinderResources
    @CxxFunction("cinder::app::getResourcePath")
    @CxxByValue
    public static native Path getResourcePath(@CxxConst @CxxByReference Path rsrcRelativePath);

    //! Returns the path to the active App on disk
    @CxxFunction("cinder::app::getAppPath")
    @CxxByValue
    public static native Path getAppPath();

    //! Presents the user with a file-open dialog and returns the selected file path.

    /**
     * The dialog optionally begins at the path \a initialPath and can be limited to allow selection of files ending in the extensions enumerated in \a extensions.
     * If the active app is in full-screen mode it will temporarily switch to windowed-mode to present the dialog.
     * \return the selected file path or an empty string if the user cancelled.
     **/
    @CxxFunction("cinder::app::getOpenFilePath")
    @CxxByValue
    public static native Path getOpenFilePath(@CxxConst @CxxByReference Path initialPath, @CxxByValue Vector<String> extensions);

    //! Presents the user with a file-save dialog and returns the selected file path.

    /**
     * The dialog optionally begins at the path \a initialPath and can be limited to allow selection of files ending in the extensions enumerated in \a extensions.
     * If the active app is in full-screen mode it will temporarily switch to windowed-mode to present the dialog.
     * \return the selected file path or an empty string if the user cancelled.
     **/
    @CxxFunction("cinder::app::getSaveFilePath")
    @CxxByValue
    public static native Path getSaveFilePath(@CxxConst @CxxByReference Path initialPath, @CxxByValue Vector<String> extensions);

//    //! Returns a reference to an output console, which is an alias to cout on the mac, and a wrapper around OutputDebugString on MSW
//
//    /**
//     * On Mac OS X all output is echoed either to the Debugger Console in XCode or the system console
//     * On Windows output is echoed using OutputDebugString, echoed to the Output window of the debugger or to a stream viewable with Dbgview
//     * \code console() << "This line will be echoed" << endl; \endcode
//     **/
//    @CxxFunction("cinder::app::console")
//    @CxxByReference
//    ostream console();

    //! Returns a reference to the active App's Timeline
    @CxxFunction("cinder::app::timeline")
    @CxxByReference
    public static native Timeline timeline();

    //! Returns a copy of the current window's contents as a Surface8u
    @CxxFunction("cinder::app::copyWindowSurface")
    @CxxByValue
    public static native Surface copyWindowSurface();

    //! Returns a copy of the Area \a area from the current window's contents as a Surface8u
    @CxxFunction("cinder::app::copyWindowSurface")
    @CxxByValue
    public static native Surface copyWindowSurface(@CxxConst @CxxByReference Area area);

    //! Restores the current rendering context to be the App's window or the screen in full-screen mode. Generally this is only necessary if the app has display a dialog box or some other external window.
    @CxxFunction("cinder::app::restoreWindowContext")
    public static native void restoreWindowContext();

//@}

}
