package cinder.geom;

import cinder.ColorAf;
import cinder.Rectf;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec2;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::RoundedRect")
public interface RoundedRect extends Source {

    @CxxConstructor
    public static RoundedRect newRoundedRect() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static RoundedRect newRoundedRect(@CxxConst @CxxByReference Rectf r, float cornerRadius) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static RoundedRect newRoundedRect(@CxxConst @CxxByReference Rectf r) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public RoundedRect rect(@CxxConst @CxxByReference Rectf r);

    @CxxMethod
    @CxxByReference
    public RoundedRect colors(boolean enable);

    @CxxMethod
    @CxxByReference
    public RoundedRect cornerSubdivisions(int cornerSubdivisions);

    @CxxMethod
    @CxxByReference
    public RoundedRect cornerRadius(float cornerRadius);

    @CxxMethod
    @CxxByReference
    public RoundedRect texCoords(@CxxConst @CxxByReference Vec2 upperLeft, @CxxConst @CxxByReference Vec2 lowerRight);

    @CxxMethod
    @CxxByReference
    public RoundedRect colors(@CxxConst @CxxByReference ColorAf upperLeft, @CxxConst @CxxByReference ColorAf upperRight, @CxxConst @CxxByReference ColorAf lowerRight, @CxxConst @CxxByReference ColorAf lowerLeft);

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
    public RoundedRect clone();
}
