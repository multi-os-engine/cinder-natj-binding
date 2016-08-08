package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireCone")
public interface WireCone extends WireCylinder {

    @CxxConstructor
    public static WireCone newWireCone() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public WireCone origin(@CxxConst @CxxByReference Vec3 origin);

    //! Specifies the number of radial subdivisions, which determines the roundness of the WireCone. Defaults to \c 18.
    @CxxMethod
    @CxxByReference
    public WireCone subdivisionsAxis(int subdiv);

    //! Specifies the number of subdivisions along the WireCone's height. Defaults to \c 1.
    @CxxMethod
    @CxxByReference
    public WireCone subdivisionsHeight(int subdiv);

    //! Specifies the number of segments that make up each circle. Defaults to \c 72.
    @CxxMethod
    @CxxByReference
    public WireCone subdivisionsCircle(int subdiv);

    //!
    @CxxMethod
    @CxxByReference
    public WireCone height(float height);

    //! Specifies the base and apex radius.
    @CxxMethod
    @CxxByReference
    public WireCone radius(float radius);

    //! Specifies the base radius.
    @CxxMethod
    @CxxByReference
    public WireCone base(float base);

    //! Specifies the apex radius.
    @CxxMethod
    @CxxByReference
    public WireCone apex(float apex);

    //! Specifies the apex radius as a \a ratio of the height. A value of 1.0f yields a cone angle of 45 degrees.
    @CxxMethod
    @CxxByReference
    public WireCone ratio(float ratio);

    //! Specifies the base and apex radius separately.
    @CxxMethod
    @CxxByReference
    public WireCone radius(float base, float apex);

    @CxxMethod
    @CxxByReference
    public WireCone direction(@CxxConst @CxxByReference Vec3 direction);

    //! Conveniently sets origin, height and direction.
    /*@CxxMethod
    @CxxByReference
    public WireCone	set( @CxxConst @CxxByReference Vec3 from, @CxxConst @CxxByReference Vec3 to );*/

    @CxxMethod(isConst = true)
    public WireCone clone();
}
