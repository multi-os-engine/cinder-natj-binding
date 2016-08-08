package cinder;

import cinder.app.MouseEvent;
import cinder.app.Window;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;
import glm.detail.Vec2;
import std.SharedPtr;

@CxxHeader(value = {"cinder/CameraUi.h"}, useQuotes = false)
@CxxClass("cinder::CameraUi")
public interface CameraUi {

    @CxxConstructor
    public static CameraUi newCameraUi() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Constructs a CameraUi which manipulates \a camera directly (and consequently expects its pointer to remain valid). Optionally attaches to mouse/window signals of \a window, with priority \a signalPriority.
    @CxxConstructor
    public static CameraUi newCameraUi(CameraPersp camera, @CxxConst @CxxByReference SharedPtr<Window> window, int signalPriority) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static CameraUi newCameraUi(CameraPersp camera) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static CameraUi newCameraUi(@CxxConst @CxxByReference CameraUi rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //CameraUi& operator=( const CameraUi &rhs );

    //! Connects to mouseDown, mouseDrag, mouseWheel and resize signals of \a window, with optional priority \a signalPriority
    @CxxMethod
    public void connect(@CxxConst @CxxByReference SharedPtr<Window> window, int signalPriority);

    //! Disconnects all signal handlers
    @CxxMethod
    public void disconnect();

    //! Returns whether the CameraUi is connected to mouse and window signal handlers
    @CxxMethod(isConst = true)
    public boolean isConnected();

    //! Sets whether the CameraUi will modify its CameraPersp either through its Window signals or through the various mouse*() member functions. Does not prevent resize handling.
    @CxxMethod
    public void enable(boolean enable);

    //! Prevents the CameraUi from modifying its CameraPersp either through its Window signals or through the various mouse*() member functions. Does not prevent resize handling.
    @CxxMethod
    public void disable();

    //! Returns whether the CameraUi will modify its CameraPersp either through its Window signals or through the various mouse*() member functions. Does not prevent resize handling.
    @CxxMethod(isConst = true)
    public boolean isEnabled();

    //! Signal emitted whenever the user modifies the camera
    //signals::Signal<void()>&	getSignalCameraChange();

    @CxxMethod
    public void mouseDown(@CxxByReference MouseEvent event);

    @CxxMethod
    public void mouseUp(@CxxByReference MouseEvent event);

    @CxxMethod
    public void mouseWheel(@CxxByReference MouseEvent event);

    @CxxMethod
    public void mouseDrag(@CxxByReference MouseEvent event);

    @CxxMethod
    public void mouseDown(@CxxConst @CxxByReference Vec2 mousePos);

    @CxxMethod
    public void mouseUp(@CxxConst @CxxByReference Vec2 mousePos);

    @CxxMethod
    public void mouseWheel(float increment);

    @CxxMethod
    public void mouseDrag(@CxxConst @CxxByReference Vec2 mousePos, boolean leftDown, boolean middleDown, boolean rightDown);

    //! Returns a reference to the currently controlled CameraPersp
    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public CameraPersp getCamera();

    //! Specifices which CameraPersp should be modified
    @CxxMethod
    public void setCamera(CameraPersp camera);

    //! Sets the size of the window in pixels when no WindowRef is supplied with connect()
    @CxxMethod
    public void setWindowSize(@CxxConst @CxxByReference IVec2 windowSizePixels);

    //! Sets the multiplier on mouse wheel zooming. Larger values zoom faster. Negative values invert the direction. Default is \c 1.2
    @CxxMethod
    public void setMouseWheelMultiplier(float multiplier);

    //! Returns the multiplier on mouse wheel zooming. Default is \c 1.2.
    @CxxMethod(isConst = true)
    public float getMouseWheelMultiplier();

    //! Sets the minimum allowable pivot distance. Default is \c 1.0. If the user dollies closer than \a minPivotDistance the pivotDistance remains \a minPivotDistance.
    @CxxMethod
    public void setMinimumPivotDistance(float minPivotDistance);

    //! Returns the minimum allowable pivot distance. Default is \c 1.0.
    @CxxMethod(isConst = true)
    public float getMinimumPivotDistance();
}
