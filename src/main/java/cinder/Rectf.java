package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;
import glm.detail.Vec2;

@CxxHeader(value = {"cinder/Rect.h"}, useQuotes = false)
@CxxClass("cinder::RectT<float>")
public interface Rectf extends CxxObject {

    @CxxMethod
    @CxxByValue
    public Vec2T getUpperLeft();

    @CxxMethod
    @CxxByValue
    public Vec2T getUpperRight();

    @CxxMethod
    @CxxByValue
    public Vec2T getLowerRight();

    @CxxMethod
    @CxxByValue
    public Vec2T getLowerLeft();

    @CxxMethod
    @CxxByValue
    public Vec2T getCenter();

    @CxxMethod
    @CxxByValue
    public Vec2T getSize();

    @CxxConstructor()
    public static Rectf newRectf() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Initializes the rectangle to be the bounding box of \a points
    //@CxxConstructor(Rectf.class)
    //public static native Rectf newRectf(@CxxConst @CxxByReference Vec2TVector points );

    @CxxConstructor()
    public static Rectf newRectf(float aX1, float aY1, float aX2, float aY2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Rectf newRectf(@CxxConst @CxxByReference Vec2 v1, @CxxConst @CxxByReference Vec2 v2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Rectf newRectf(@CxxConst @CxxByReference Area area) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod(isConst = true)
    public boolean contains(@CxxConst @CxxByReference IVec2 pt);
}
