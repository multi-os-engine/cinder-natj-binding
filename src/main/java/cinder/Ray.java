package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.FloatPtr;
import glm.detail.Mat4;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/Ray.h"}, useQuotes = false)
@CxxClass("cinder::Ray")
public interface Ray extends CxxObject {

    @CxxConstructor()
    public static Ray Ray() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Ray Ray(@CxxConst @CxxByReference Vec3 aOrigin, @CxxConst @CxxByReference Vec3 aDirection) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    public void setOrigin(@CxxConst @CxxByReference Vec3 aOrigin);

    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Vec3 getOrigin();

    @CxxMethod
    public void setDirection(@CxxConst @CxxByReference Vec3 aDirection);

    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Vec3 getDirection();

    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Vec3 getInverseDirection();

    @CxxMethod(isConst = true)
    public byte getSignX();

    @CxxMethod(isConst = true)
    public byte getSignY();

    @CxxMethod(isConst = true)
    public byte getSignZ();

    @CxxMethod
    public void transform(@CxxConst @CxxByReference Mat4 matrix);

    @CxxMethod(isConst = true)
    @CxxByValue
    public Ray transformed(@CxxConst @CxxByReference Mat4 matrix);

    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 calcPosition(float t);

    @CxxMethod(isConst = true)
    public boolean calcTriangleIntersection(@CxxConst @CxxByReference Vec3 vert0, @CxxConst @CxxByReference Vec3 vert1, @CxxConst @CxxByReference Vec3 vert2, FloatPtr result);

    @CxxMethod(isConst = true)
    public boolean calcPlaneIntersection(@CxxConst @CxxByReference Vec3 origin, @CxxConst @CxxByReference Vec3 normal, FloatPtr result);
}
