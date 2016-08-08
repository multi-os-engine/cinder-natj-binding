package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.FloatPtr;
import glm.detail.Vec2;

@CxxHeader(value = {"cinder/Camera.h"}, useQuotes = false)
@CxxClass("cinder::CameraPersp")
public interface CameraPersp extends Camera {

    //! Creates a default camera with eyePoint at ( 28, 21, 28 ), looking at the origin, 35deg vertical field-of-view and a 1.333 aspect ratio.
    @CxxConstructor()
    public static CameraPersp newCameraPersp() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Constructs screen-aligned camera
    @CxxConstructor()
    public static CameraPersp newCameraPersp(int pixelWidth, int pixelHeight, float fov) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Constructs screen-aligned camera
    @CxxConstructor()
    public static CameraPersp newCameraPersp(int pixelWidth, int pixelHeight, float fov, float nearPlane, float farPlane) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Configures the camera's projection according to the provided parameters.
    @CxxMethod
    public void setPerspective(float verticalFovDegrees, float aspectRatio, float nearPlane, float farPlane);

    /**
     * Returns both the horizontal and vertical lens shift.
     * A horizontal lens shift of 1 (-1) will shift the view right (left) by half the width of the viewport.
     * A vertical lens shift of 1 (-1) will shift the view up (down) by half the height of the viewport.
     */
    @CxxMethod(isConst = true)
    public void getLensShift(FloatPtr horizontal, FloatPtr vertical);

    /**
     * Returns both the horizontal and vertical lens shift.
     * A horizontal lens shift of 1 (-1) will shift the view right (left) by half the width of the viewport.
     * A vertical lens shift of 1 (-1) will shift the view up (down) by half the height of the viewport.
     */
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec2 getLensShift();

    /**
     * Sets both the horizontal and vertical lens shift.
     * A horizontal lens shift of 1 (-1) will shift the view right (left) by half the width of the viewport.
     * A vertical lens shift of 1 (-1) will shift the view up (down) by half the height of the viewport.
     */
    @CxxMethod
    public void setLensShift(float horizontal, float vertical);

    /**
     * Sets both the horizontal and vertical lens shift.
     * A horizontal lens shift of 1 (-1) will shift the view right (left) by half the width of the viewport.
     * A vertical lens shift of 1 (-1) will shift the view up (down) by half the height of the viewport.
     */
    @CxxMethod
    public void setLensShift(@CxxConst @CxxByReference Vec2 shift);

    //! Returns the horizontal lens shift. A horizontal lens shift of 1 (-1) will shift the view right (left) by half the width of the viewport.
    @CxxMethod(isConst = true)
    public float getLensShiftHorizontal();

    /**
     * Sets the horizontal lens shift.
     * A horizontal lens shift of 1 (-1) will shift the view right (left) by half the width of the viewport.
     */
    @CxxMethod
    public void setLensShiftHorizontal(float horizontal);

    //! Returns the vertical lens shift. A vertical lens shift of 1 (-1) will shift the view up (down) by half the height of the viewport.
    @CxxMethod(isConst = true)
    public float getLensShiftVertical();

    /**
     * Sets the vertical lens shift.
     * A vertical lens shift of 1 (-1) will shift the view up (down) by half the height of the viewport.
     */
    @CxxMethod
    public void setLensShiftVertical(float vertical);

    @CxxMethod(isConst = true)
    public boolean isPersp();

    //! Returns a Camera whose eyePoint is positioned to exactly frame \a worldSpaceSphere but is equivalent in other parameters (including orientation). Sets the result's pivotDistance to be the distance to \a worldSpaceSphere's center.
    @CxxMethod(isConst = true)
    @CxxByValue
    public CameraPersp calcFraming(@CxxConst @CxxByReference Sphere worldSpaceSphere);

    @CxxOperator(CxxOperatorKind.ASSIGN)
    @CxxByReference
    public CameraPersp assign(@CxxConst @CxxByReference CameraPersp lhs);
}
