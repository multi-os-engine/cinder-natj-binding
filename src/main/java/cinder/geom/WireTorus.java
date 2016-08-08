package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireTorus")
public interface WireTorus extends WireSource {

    @CxxConstructor
    public static WireTorus newWireTorus() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public WireTorus center(@CxxConst @CxxByReference Vec3 center);

    @CxxMethod
    @CxxByReference
    public WireTorus subdivisionsAxis(int subdiv);

    @CxxMethod
    @CxxByReference
    public WireTorus subdivisionsHeight(int subdiv);

    //! Specifies the number of segments that make up each circle. Defaults to \c 72.
    @CxxMethod
    @CxxByReference
    public WireTorus subdivisionsCircle(int subdiv);

    //! Specifies the major and minor radius as a ratio (minor : major). Resulting torus will fit unit cube.
    @CxxMethod
    @CxxByReference
    public WireTorus ratio(float ratio);

    //! Specifies the major and minor radius separately.
    @CxxMethod
    @CxxByReference
    public WireTorus radius(float major, float minor);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WireTorus clone();
}

