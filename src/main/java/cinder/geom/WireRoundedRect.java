package cinder.geom;

import cinder.Rectf;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireRoundedRect")
public interface WireRoundedRect extends WireSource {

    @CxxConstructor
    public static WireRoundedRect newWireRoundedRect() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static WireRoundedRect newWireRoundedRect(@CxxConst @CxxByReference Rectf r, float cornerRadius) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static WireRoundedRect newWireRoundedRect(@CxxConst @CxxByReference Rectf r) {
        throw new CxxExpectedGeneratedCodeException();
    }


    @CxxMethod
    @CxxByReference
    public WireRoundedRect rect(@CxxConst @CxxByReference Rectf r);

    @CxxMethod
    @CxxByReference
    public WireRoundedRect cornerSubdivisions(int cornerSubdivisions);

    @CxxMethod
    @CxxByReference
    public WireRoundedRect cornerRadius(float cornerRadius);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WireRoundedRect clone();
}
