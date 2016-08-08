package cinder;

import cinder.app.MouseEvent;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.FloatPtr;
import glm.Quat;
import glm.detail.IVec2;
import glm.detail.Vec2;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/Arcball.h"}, useQuotes = false)
@CxxClass("cinder::Arcball")
public interface Arcball extends CxxObject {

    @CxxConstructor
    public static Arcball newArcball() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static Arcball newArcball(CameraPersp camera, @CxxConst @CxxByReference Sphere sphere) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    public void mouseDown(@CxxConst @CxxByReference MouseEvent event);

    @CxxMethod
    public void mouseDown(@CxxConst @CxxByReference Vec2 mousePos, @CxxConst @CxxByReference IVec2 windowSize);

    @CxxMethod
    public void mouseDrag(@CxxConst @CxxByReference MouseEvent event);

    @CxxMethod
    public void mouseDrag(@CxxConst @CxxByReference Vec2 mousePos, @CxxConst @CxxByReference IVec2 windowSize);

    @CxxMethod
    public void resetQuat();

    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Quat getQuat();

    @CxxMethod
    public void setQuat(@CxxConst @CxxByReference Quat q);

    @CxxMethod
    public void setSphere(@CxxConst @CxxByReference Sphere s);

    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Sphere getSphere();

    @CxxMethod
    public void setConstraintAxis(@CxxConst @CxxByReference Vec3 constraintAxis);

    @CxxMethod
    public void setNoConstraintAxis();

    @CxxMethod(isConst = true)
    public boolean isUsingConstraint();

    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Vec3 getConstraintAxis();

    @CxxMethod
    public void mouseOnSphere(@CxxConst @CxxByReference Vec2 point, @CxxConst @CxxByReference IVec2 windowSize, Vec3 resultVector, FloatPtr resultAngleAddition);

    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getFromVector();

    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getToVector();
}
