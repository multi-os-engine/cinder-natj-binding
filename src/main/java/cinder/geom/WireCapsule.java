package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireCapsule")
public interface WireCapsule extends WireSource {

    @CxxConstructor
    public static WireCapsule newWireCapsule() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public WireCapsule center(@CxxConst @CxxByReference Vec3 center);

    //! Specifies the number of radial subdivisions, which determines the roundness of the capsule. Defaults to \c 6.
    @CxxMethod
    @CxxByReference
    public WireCapsule subdivisionsAxis(int subdiv);

    //! Specifies the number of slices along the capsule's length. Defaults to \c 6. Add more subdivisions to improve texture mapping and lighting, or if you intend to bend the capsule.
    @CxxMethod
    @CxxByReference
    public WireCapsule subdivisionsHeight(int subdiv);

    //! Specifies the number of segments that make up each circle. Defaults to \c 72.
    @CxxMethod
    @CxxByReference
    public WireCapsule subdivisionsCircle(int subdiv);

    @CxxMethod
    @CxxByReference
    public WireCapsule radius(float radius);

    @CxxMethod
    @CxxByReference
    public WireCapsule length(float length);

    @CxxMethod
    @CxxByReference
    public WireCapsule direction(@CxxConst @CxxByReference Vec3 direction);

    //! Conveniently sets center, length and direction
    @CxxMethod
    @CxxByReference
    public WireCapsule set(@CxxConst @CxxByReference Vec3 from, @CxxConst @CxxByReference Vec3 to);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WireCapsule clone();
}
