package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.IVec3;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireCube")
public interface WireCube extends WireSource {

    @CxxConstructor
    public static WireCube newWireCube() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static WireCube newWireCube(@CxxConst @CxxByReference Vec3 size) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static WireCube newWireCube(@CxxConst @CxxByReference Vec3 size, @CxxConst @CxxByReference IVec3 subdivisions) {
        throw new CxxExpectedGeneratedCodeException();
    }


    @CxxMethod
    @CxxByReference
    public WireCube subdivisions(int sub);

    @CxxMethod
    @CxxByReference
    public WireCube subdivisionsX(int sub);

    @CxxMethod
    @CxxByReference
    public WireCube subdivisionsY(int sub);

    @CxxMethod
    @CxxByReference
    public WireCube subdivisionsZ(int sub);

    @CxxMethod
    @CxxByReference
    public WireCube size(@CxxConst @CxxByReference Vec3 sz);

    @CxxMethod
    @CxxByReference
    public WireCube size(float x, float y, float z);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WireCube clone();
}
