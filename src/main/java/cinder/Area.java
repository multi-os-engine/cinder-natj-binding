package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.DVec2;
import glm.detail.IVec2;
import glm.detail.Mat3;
import glm.detail.Vec2;

@CxxHeader(value = {"cinder/Area.h"}, useQuotes = false)
@CxxClass("cinder::Area")
public interface Area extends CxxObject {

    @CxxMethod
    public void set(int aX1, int aY1, int aX2, int aY2);

    @CxxMethod
    public int getWidth();

    @CxxMethod
    public int getHeight();

    @CxxMethod
    @CxxByValue
    public IVec2 getSize();

    @CxxMethod
    @CxxByValue
    public Vec2 getCenter();

    @CxxMethod
    public int calcArea();

    @CxxMethod
    public void clipBy(@CxxConst @CxxByReference Area clip);

    @CxxMethod
    @CxxByValue
    public Area getClipBy(@CxxConst @CxxByReference Area clip);

    //! Translates the Area by \a off
    @CxxMethod
    public void offset(@CxxConst @CxxByReference IVec2 off);
    //! Returns a copy of the Area translated by \a off

    @CxxMethod
    @CxxByValue
    public Area getOffset(@CxxConst @CxxByReference IVec2 off);
    //! Translates the Area so that its upper-left corner is \a newUL

    @CxxMethod
    public void moveULTo(@CxxConst @CxxByReference IVec2 newUL);

    //! Returns a copy of the Area translated so that its upper-left corner is \a newUL
    @CxxMethod
    @CxxByValue
    public Area getMoveULTo(@CxxConst @CxxByReference IVec2 newUL);

    //! Expands the Area by \a expandX horizontally and \a expandY vertically. \a expandX is subtracted from \c x1 and added to \c x2 and \a expandY is subtracted from \c y1 and added to \c y2.
    @CxxMethod
    public void expand(int expandX, int expandY);

    @CxxMethod
    public int getX1();

    @CxxMethod
    public void setX1(int aX1);

    @CxxMethod
    public int getY1();

    @CxxMethod
    public void setY1(int aY1);

    @CxxMethod
    public int getX2();

    @CxxMethod
    public void setX2(int aX2);

    @CxxMethod
    public int getY2();

    @CxxMethod
    public void setY2(int aY2);

    @CxxMethod
    @CxxByValue
    public IVec2 getUL(); // left-top offset

    @CxxMethod
    @CxxByValue
    public IVec2 getLR(); // right-bottom offset

    @CxxMethod
    public boolean contains(@CxxConst @CxxByReference IVec2 offset);

    //template<typename T>
    //boolean			contains( @CxxConst @CxxByReference glm::tvec2<T, glm::defaultp> &offset );
    @CxxMethod
    public boolean contains(@CxxConst @CxxByReference Vec2 offset);

    @CxxMethod
    public boolean intersects(@CxxConst @CxxByReference Area area);

    //! Expands the Area to include \a point in its interior
    //@CxxMethod
    //public void include(@CxxConst @CxxByReference IVec2 point);

    //! Expands the Area to include all points in \a points in its interior
    //@CxxMethod
    //public void include(@CxxConst @CxxByReference IVec2Vector points);

    //! Expands the Area to include \a rect in its interior
    @CxxMethod
    public void include(@CxxConst @CxxByReference Area area);

    @CxxMethod
    public float distance(@CxxConst @CxxByReference Vec2 pt);

    @CxxMethod
    public float distance(@CxxConst @CxxByReference DVec2 pt);

    @CxxMethod
    public float distance(@CxxConst @CxxByReference IVec2 pt);

    @CxxMethod
    public float distanceSquared(@CxxConst @CxxByReference Vec2 pt);

    @CxxMethod
    public float distanceSquared(@CxxConst @CxxByReference DVec2 pt);

    @CxxMethod
    public float distanceSquared(@CxxConst @CxxByReference IVec2 pt);

    @CxxMethod
    @CxxByValue
    public Vec2 closestPoint(@CxxConst @CxxByReference Vec2 pt);

    @CxxMethod
    @CxxByValue
    public IVec2 closestPoint(@CxxConst @CxxByReference IVec2 pt);

    @CxxMethod
    @CxxByValue
    public DVec2 closestPoint(@CxxConst @CxxByReference DVec2 pt);

    //! Transforms the Area by \a matrix. Represents the bounding box of the transformed Area when \a matrix expresses non-scale/translate operations.
    @CxxMethod
    public void transform(@CxxConst @CxxByReference Mat3 matrix);

    //! Returns a copy of the Area transformed by \a matrix. Represents the bounding box of the transformed Area when \a matrix expresses non-scale/translate operations.
    @CxxMethod
    @CxxByValue
    public Area transformed(@CxxConst @CxxByReference Mat3 matrix);

    @CxxConstructor()
    public static Area newArea() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Area newArea(@CxxConst @CxxByReference IVec2 UL, @CxxConst @CxxByReference IVec2 LR) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Area newArea(int aX1, int aY1, int aX2, int aY2) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Constructs an Area with all values initialized to zero.
    public static Area zero() {
        throw new CxxExpectedGeneratedCodeException();
    }

    public static Area proportionalFit(@CxxConst @CxxByReference Area srcArea, @CxxConst @CxxByReference Area dstArea, boolean center, boolean expand) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
