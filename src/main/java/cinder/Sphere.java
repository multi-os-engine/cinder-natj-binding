package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.FloatPtr;
import glm.detail.Mat4;
import glm.detail.Vec2;
import glm.detail.Vec3;
import std.Vector;

@CxxHeader(value = {"cinder/Sphere.h"}, useQuotes = false)
@CxxClass("cinder::Sphere")
public interface Sphere extends CxxObject {

    @CxxConstructor()
    public static Sphere newSphere() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Sphere newSphere(@CxxConst @CxxByReference Vec3 center, float radius) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod(isConst = true)
    public float getRadius();

    @CxxMethod
    public void setRadius(float radius);

    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getCenter();

    @CxxMethod
    public void setCenter(@CxxConst @CxxByReference Vec3 center);

    @CxxMethod(isConst = true)
    public boolean intersects(@CxxConst @CxxByReference Ray ray);

    @CxxMethod(isConst = true)
    public int intersect(@CxxConst @CxxByReference Ray ray, FloatPtr intersection);

    @CxxMethod(isConst = true)
    public int intersect(@CxxConst @CxxByReference Ray ray, FloatPtr min, FloatPtr max);

    //! Returns the closest point on \a ray to the Sphere. If \a ray intersects then returns the point of nearest intersection.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 closestPoint(@CxxConst @CxxByReference Ray ray);

    @CxxFunction("cinder::Sphere::calculateBoundingSphere")
    @CxxByValue
    public static Sphere calculateBoundingSphere(@CxxConst @CxxByReference Vector<Vec3> points) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::Sphere::calculateBoundingSphere")
    @CxxByValue
    public static Sphere calculateBoundingSphere(@CxxConst Vec3 points, int numPoints) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Converts sphere to another coordinate system. Note that it will not return correct results if there are non-uniform scaling, shears, or other unusual transforms in \a transform.
    public Sphere transformed(@CxxConst @CxxByReference Mat4 transform);

    //! Calculates the projection of the Sphere (an oriented ellipse) given \a focalLength. Returns \c false if calculation failed, rendering only \a outCenter correct. Algorithm due to Iñigo Quilez.
    @CxxMethod(isConst = true)
    public void calcProjection(float focalLength, Vec2 outCenter, Vec2 outAxisA, Vec2 outAxisB);

    //! Calculates the projection of the Sphere (an oriented ellipse) given \a focalLength. Algorithm due to Iñigo Quilez.
    @CxxMethod(isConst = true)
    public void calcProjection(float focalLength, @CxxByValue Vec2 screenSizePixels, Vec2 outCenter, Vec2 outAxisA, Vec2 outAxisB);

    //! Calculates the projected area of the Sphere given \a focalLength and screen size in pixels. Algorithm due to Iñigo Quilez.
    @CxxMethod(isConst = true)
    public float calcProjectedArea(float focalLength, @CxxByValue Vec2 screenSizePixels);
}
