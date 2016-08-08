package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.*;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Helix")
public interface Helix extends Torus {

    @CxxConstructor
    public static Helix newHelix() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByReference
    public Helix center(@CxxConst @CxxByReference Vec3 center);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByReference
    public Helix subdivisionsAxis(int subdiv);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByReference
    public Helix subdivisionsHeight(int subdiv);

    //! Specifies the height, measured from center to center.
    @CxxMethod
    @CxxByReference
    public Helix height(float height);

    //! Specifies the number of coils.
    @CxxMethod
    @CxxByReference
    public Helix coils(float coils);

    //! Allows you to twist the helix along the ring.
    @CxxMethod
    @CxxByReference
    public Helix twist(@CxxUnsigned int twist);

    //! Allows you to twist the helix along the ring. The \a offset is in radians.
    @CxxMethod
    @CxxByReference
    public Helix twist(@CxxUnsigned int twist, float offset);

    //! Specifies the major and minor radius as a ratio (minor : major).
    @CxxMethod
    @CxxByReference
    public Helix ratio(float ratio);

    //! Specifies the major and minor radius separately.
    @CxxMethod
    @CxxByReference
    public Helix radius(float major, float minor);
}
