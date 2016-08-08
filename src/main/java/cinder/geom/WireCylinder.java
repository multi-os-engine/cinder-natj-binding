package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireCylinder")
public interface WireCylinder extends WireSource {

    @CxxConstructor
    public static WireCylinder newWireCylinder() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Specifices the base of the Cylinder.
    @CxxMethod
    @CxxByReference
    public WireCylinder origin(@CxxConst @CxxByReference Vec3 origin);

    //! Specifies the number of radial subdivisions, which determines the roundness of the Cylinder. Defaults to \c 18.
    @CxxMethod
    @CxxByReference
    public WireCylinder subdivisionsAxis(int subdiv);

    //! Specifies the number of slices along the Cylinder's height. Defaults to \c 1.
    @CxxMethod
    @CxxByReference
    public WireCylinder subdivisionsHeight(int slices);

    //! Specifies the number of segments that make up each circle. Defaults to \c 72.
    @CxxMethod
    @CxxByReference
    public WireCylinder subdivisionsCircle(int subdiv);

    //! Specifies the height of the cylinder.
    @CxxMethod
    @CxxByReference
    public WireCylinder height(float height);

    //! Specifies the base and apex radius.
    @CxxMethod
    @CxxByReference
    public WireCylinder radius(float radius);

    //! Specifies the axis of the cylinder.
    @CxxMethod
    @CxxByReference
    public WireCylinder direction(@CxxConst @CxxByReference Vec3 direction);

    //! Conveniently sets origin, height and direction so that the center of the base is \a from and the center of the apex is \a to.
    /*@CxxMethod
    @CxxByReference
    public WireCylinder	set(@CxxConst @CxxByReference Vec3 from, @CxxConst @CxxByReference Vec3 to );*/

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WireCylinder clone();
}
