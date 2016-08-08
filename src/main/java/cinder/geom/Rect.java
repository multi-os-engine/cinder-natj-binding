package cinder.geom;

import cinder.ColorAf;
import cinder.Rectf;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec2;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Rect")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Rect extends Source {

    //! Equivalent to Rectf( -0.5, -0.5, 0.5, 0.5 )
    @CxxConstructor
    public static Rect newRect() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static Rect newRect(@CxxConst @CxxByValue Rectf r) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public Rect rect(@CxxConst @CxxByReference Rectf r);

    //! Enables default colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public Rect colors(boolean enable);

    //! Enables COLOR attrib and specifies corner values in clockwise order starting with the upper-left
    @CxxMethod
    @CxxByReference
    public Rect colors(@CxxConst @CxxByReference ColorAf upperLeft, @CxxConst @CxxByReference ColorAf upperRight, @CxxConst @CxxByReference ColorAf lowerRight, @CxxConst @CxxByReference ColorAf lowerLeft);

    //! Enables TEX_COORD_0 attrib and specifies corner values in clockwise order starting with the upper-left
    @CxxMethod
    @CxxByReference
    public Rect texCoords(@CxxConst @CxxByReference Vec2 upperLeft, @CxxConst @CxxByReference Vec2 upperRight, @CxxConst @CxxByReference Vec2 lowerRight, @CxxConst @CxxByReference Vec2 lowerLeft);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    @NULong
    public long getNumIndices();

    @CxxMethod(isConst = true)
    @CxxEnum("cinder::geom::Primitive")
    public int getPrimitive();

    @CxxMethod(isConst = true)
    @CxxUnsigned
    public byte getAttribDims(@CxxEnum("cinder::geom::Attrib") int attr);

    @CxxMethod(isConst = true)
    @CxxByValue
    public AttribSet getAvailableAttribs();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public Rect clone();
}
