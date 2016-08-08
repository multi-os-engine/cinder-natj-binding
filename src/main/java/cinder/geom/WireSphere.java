package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireSphere")
public interface WireSphere extends WireSource {

    @CxxConstructor
    public static WireSphere newWireSphere() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public WireSphere center(@CxxConst @CxxByReference Vec3 center);

    @CxxMethod
    @CxxByReference
    public WireSphere radius(float radius);

    //! Specifies the number of segments that make up each circle. Defaults to \c 72.
    @CxxMethod
    @CxxByReference
    public WireSphere subdivisionsCircle(int subdiv);

    @CxxMethod
    @CxxByReference
    public WireSphere subdivisionsHeight(int subdiv);

    @CxxMethod
    @CxxByReference
    public WireSphere subdivisionsAxis(int subdiv);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WireSphere clone();
}
