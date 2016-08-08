package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Cone")
public interface Cone extends Cylinder {

    @CxxConstructor
    public static Cone newCone() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Enables colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public Cone colors(boolean enable);

    @CxxMethod
    @CxxByReference
    public Cone origin(@CxxConst @CxxByReference Vec3 origin);

    //! Specifies the number of radial subdivisions, which determines the roundness of the Cone. Defaults to \c 18.
    @CxxMethod
    @CxxByReference
    public Cone subdivisionsAxis(int subdiv);

    //! Specifies the number of subdivisions along the Cone's height. Defaults to \c 1.
    @CxxMethod
    @CxxByReference
    public Cone subdivisionsHeight(int subdiv);

    @CxxMethod
    @CxxByReference
    public Cone height(float height);

    //! Specifies the base and apex radius.
    @CxxMethod
    @CxxByReference
    public Cone radius(float radius);

    //! Specifies the base radius.
    @CxxMethod
    @CxxByReference
    public Cone base(float base);

    //! Specifies the apex radius.
    @CxxMethod
    @CxxByReference
    public Cone apex(float apex);

    //! Specifies the base radius as a \a ratio of the height. A value of 1.0f yields a cone angle of 45 degrees.
    @CxxMethod
    @CxxByReference
    public Cone ratio(float ratio);

    //! Specifies the base and apex radius separately.
    @CxxMethod
    @CxxByReference
    public Cone radius(float base, float apex);

    @CxxMethod
    @CxxByReference
    public Cone direction(@CxxConst @CxxByReference Vec3 direction);

    //! Conveniently sets origin, height and direction.
    @CxxMethod
    @CxxByReference
    public Cone set(@CxxConst @CxxByReference Vec3 from, @CxxConst @CxxByReference Vec3 to);
}
