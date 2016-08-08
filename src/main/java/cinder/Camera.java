package cinder;

import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.FloatPtr;
import glm.Quat;
import glm.detail.Mat4;
import glm.detail.Vec2;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/Camera.h"}, useQuotes = false)
@CxxClass("cinder::Camera")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Camera extends CxxObject {

    //! Returns the position in world-space from which the Camera is viewing
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getEyePoint();

    //! Sets the position in world-space from which the Camera is viewing
    @CxxMethod
    public void setEyePoint(@CxxConst @CxxByReference Vec3 eyePoint);

    //! Returns the vector in world-space which represents "up" - typically vec3( 0, 1, 0 )
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getWorldUp();

    //! Sets the vector in world-space which represents "up" - typically vec3( 0, 1, 0 )
    @CxxMethod
    public void setWorldUp(@CxxConst @CxxByReference Vec3 worldUp);

    //! Modifies the view direction to look from the current eyePoint to \a target. Also updates the pivot distance.
    @CxxMethod
    public void lookAt(@CxxConst @CxxByReference Vec3 target);

    //! Modifies the eyePoint and view direction to look from \a eyePoint to \a target. Also updates the pivot distance.
    @CxxMethod
    public void lookAt(@CxxConst @CxxByReference Vec3 eyePoint, @CxxConst @CxxByReference Vec3 target);

    //! Modifies the eyePoint and view direction to look from \a eyePoint to \a target with up vector \a up (to achieve camera roll). Also updates the pivot distance.
    @CxxMethod
    public void lookAt(@CxxConst @CxxByReference Vec3 eyePoint, @CxxConst @CxxByReference Vec3 target, @CxxConst @CxxByReference Vec3 up);

    //! Returns the world-space vector along which the camera is oriented
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getViewDirection();

    //! Sets the world-space vector along which the camera is oriented
    @CxxMethod
    public void setViewDirection(@CxxConst @CxxByReference Vec3 viewDirection);

    //! Returns the world-space quaternion that expresses the camera's orientation
    @CxxMethod(isConst = true)
    @CxxByValue
    public Quat getOrientation();

    //! Sets the camera's orientation with world-space quaternion \a orientation
    @CxxMethod
    public void setOrientation(@CxxConst @CxxByReference Quat orientation);

    //! Returns the camera's vertical field of view measured in degrees.
    @CxxMethod(isConst = true)
    public float getFov();

    //! Sets the camera's vertical field of view measured in degrees.
    @CxxMethod
    public void setFov(float verticalFov);

    //! Returns the camera's horizontal field of view measured in degrees.
    @CxxMethod(isConst = true)
    public float getFovHorizontal();

    //! Sets the camera's horizontal field of view measured in degrees.
    @CxxMethod
    public void setFovHorizontal(float horizontalFov);

    //! Returns the camera's focal length, calculating it based on the field of view.
    @CxxMethod(isConst = true)
    public float getFocalLength();

    //! Primarily for user interaction, such as with CameraUi. Returns the distance from the camera along the view direction relative to which tumbling and dollying occur.
    @CxxMethod(isConst = true)
    public float getPivotDistance();

    //! Primarily for user interaction, such as with CameraUi. Sets the distance from the camera along the view direction relative to which tumbling and dollying occur.
    @CxxMethod
    public void setPivotDistance(float distance);

    //! Primarily for user interaction, such as with CameraUi. Returns the world-space point relative to which tumbling and dollying occur.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getPivotPoint();

    //! Returns the aspect ratio of the image plane - its width divided by its height
    @CxxMethod(isConst = true)
    public float getAspectRatio();

    //! Sets the aspect ratio of the image plane - its width divided by its height
    @CxxMethod
    public void setAspectRatio(float aAspectRatio);

    //! Returns the distance along the view direction to the Near clipping plane.
    @CxxMethod(isConst = true)
    public float getNearClip();

    //! Sets the distance along the view direction to the Near clipping plane.
    @CxxMethod
    public void setNearClip(float nearClip);

    //! Returns the distance along the view direction to the Far clipping plane.
    @CxxMethod(isConst = true)
    public float getFarClip();

    //! Sets the distance along the view direction to the Far clipping plane.
    void setFarClip(float farClip);

    //! Returns the four corners of the Camera's Near clipping plane, expressed in world-space
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
    public void getNearClipCoordinates(Vec3 topLeft, Vec3 topRight, Vec3 bottomLeft, Vec3 bottomRight);

    //! Returns the four corners of the Camera's Far clipping plane, expressed in world-space
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
    public void getFarClipCoordinates(Vec3 topLeft, Vec3 topRight, Vec3 bottomLeft, Vec3 bottomRight);

    //! Returns the coordinates of the camera's frustum, suitable for passing to \c glFrustum
    @CxxMethod(isConst = true)
    public void getFrustum(FloatPtr left, FloatPtr top, FloatPtr right, FloatPtr bottom, FloatPtr near, FloatPtr far);

    //! Returns whether the camera represents a perspective projection instead of an orthographic
    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    public boolean isPersp();

    //! Returns the Camera's Projection matrix, which converts view-space into clip-space
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
    @CxxConst
    @CxxByReference
    public Mat4 getProjectionMatrix();

    //! Returns the Camera's View matrix, which converts world-space into view-space
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
    @CxxConst
    @CxxByReference
    public Mat4 getViewMatrix();

    //! Returns the Camera's Inverse View matrix, which converts view-space into world-space
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
    @CxxConst
    @CxxByReference
    public Mat4 getInverseViewMatrix();

    //! Returns a Ray that passes through the image plane coordinates (\a u, \a v) (expressed in the range [0,1]) on an image plane of aspect ratio \a imagePlaneAspectRatio
    @CxxMethod(isConst = true)
    @CxxByValue
    public Ray generateRay(float u, float v, float imagePlaneAspectRatio);

    //! Returns a Ray that passes through the pixels coordinates \a posPixels on an image of size \a imageSizePixels
    @CxxMethod(isConst = true)
    @CxxByValue
    public Ray generateRay(@CxxConst @CxxByReference Vec2 posPixels, @CxxConst @CxxByReference Vec2 imageSizePixels);

    //! Returns the \a right and \a up vectors suitable for billboarding relative to the Camera
    @CxxMethod(isConst = true)
    public void getBillboardVectors(Vec3 right, Vec3 up);

    //! Converts a world-space coordinate \a worldCoord to screen coordinates as viewed by the camera, based on a screen which is \a screenWidth x \a screenHeight pixels.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec2 worldToScreen(@CxxConst @CxxByReference Vec3 worldCoord, float screenWidth, float screenHeight);

    //! Converts a eye-space coordinate \a eyeCoord to screen coordinates as viewed by the camera
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec2 eyeToScreen(@CxxConst @CxxByReference Vec3 eyeCoord, @CxxConst @CxxByReference Vec2 screenSizePixels);

    //! Converts a world-space coordinate \a worldCoord to eye-space, also known as camera-space. -Z is along the view direction.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 worldToEye(@CxxConst @CxxByReference Vec3 worldCoord);

    //! Converts a world-space coordinate \a worldCoord to the z axis of eye-space, also known as camera-space. -Z is along the view direction. Suitable for depth sorting.
    @CxxMethod(isConst = true)
    public float worldToEyeDepth(@CxxConst @CxxByReference Vec3 worldCoord);

    //! Converts a world-space coordinate \a worldCoord to normalized device coordinates
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 worldToNdc(@CxxConst @CxxByReference Vec3 worldCoord);

    //! Calculates the area of the screen-space elliptical projection of \a sphere
    @CxxMethod(isConst = true)
    public float calcScreenArea(@CxxConst @CxxByReference Sphere sphere, @CxxConst @CxxByReference Vec2 screenSizePixels);

    //! Calculates the screen-space elliptical projection of \a sphere, putting the results in \a outCenter, \a outAxisA and \a outAxisB
    @CxxMethod(isConst = true)
    public void calcScreenProjection(@CxxConst @CxxByReference Sphere sphere, @CxxConst @CxxByReference Vec2 screenSizePixels, Vec2 outCenter, Vec2 outAxisA, Vec2 outAxisB);

}
