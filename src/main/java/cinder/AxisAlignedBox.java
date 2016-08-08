package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.FloatPtr;
import glm.detail.Mat4;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/AxisAlignedBox.h"}, useQuotes = false)
@CxxClass("cinder::AxisAlignedBox")
public interface AxisAlignedBox extends CxxObject {

    @CxxConstructor
    public static AxisAlignedBox newAxisAlignedBox() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static AxisAlignedBox newAxisAlignedBox(@CxxConst @CxxByReference Vec3 min, @CxxConst @CxxByReference Vec3 max) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Returns the center of the axis-aligned box.
    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Vec3 getCenter();

    //! Returns the extents of the axis-aligned box.
    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public Vec3 getExtents();

    //! Returns the size of the axis-aligned box.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getSize();

    //! Returns the corner of the axis-aligned box with the smallest x, y and z coordinates.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getMin();

    //! Returns the corner of the axis-aligned box with the largest x, y and z coordinates.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getMax();

    //! Construct an axis-aligned box by specifying two opposite corners.
    @CxxMethod
    public void set(@CxxConst @CxxByReference Vec3 min, @CxxConst @CxxByReference Vec3 max);

    //! Expands the box so that it contains \a point.
    @CxxMethod
    public void include(@CxxConst @CxxByReference Vec3 point);

    //! Expands the box so that it contains \a box.
    @CxxMethod
    public void include(@CxxConst @CxxByReference AxisAlignedBox box);

    //! Returns \c true if the axis-aligned box contains \a point.
    @CxxMethod(isConst = true)
    public boolean contains(@CxxConst @CxxByReference Vec3 point);

    //! Returns \c true if the axis-aligned boxes intersect.
    @CxxMethod(isConst = true)
    public boolean intersects(@CxxConst @CxxByReference AxisAlignedBox box);

    //! Returns \c true if the axis-aligned box intersects \a sphere.
    //@CxxMethod(isConst = true)
    //public boolean intersects( @CxxConst @CxxByReference Sphere sphere );

    //! Returns \c true if the ray intersects the axis-aligned box.
    @CxxMethod(isConst = true)
    public boolean intersects(@CxxConst @CxxByReference Ray ray);

    //! Performs ray intersections and returns the number of intersections (0, 1 or 2). Returns \a min and \a max distance from the ray origin.
    @CxxMethod(isConst = true)
    public int intersect(@CxxConst @CxxByReference Ray ray, FloatPtr min, FloatPtr max);

    //! Given a plane through the origin with \a normal, returns the minimum and maximum distance to the axis-aligned box.
    @CxxMethod(isConst = true)
    public void project(@CxxConst @CxxByReference Vec3 normal, FloatPtr min, FloatPtr max);

    //! Given a plane through the origin with \a normal, returns the corner closest to the plane.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getNegative(@CxxConst @CxxByReference Vec3 normal);

    //! Given a plane through the origin with \a normal, returns the corner farthest from the plane.
    @CxxMethod(isConst = true)
    @CxxByValue
    public Vec3 getPositive(@CxxConst @CxxByReference Vec3 normal);

    //! Converts axis-aligned box to another coordinate space.
    @CxxMethod
    public void transform(@CxxConst @CxxByReference Mat4 transform);

    //! Converts axis-aligned box to another coordinate space.
    @CxxMethod(isConst = true)
    @CxxByValue
    public AxisAlignedBox transformed(@CxxConst @CxxByReference Mat4 transform);
}
