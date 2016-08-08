package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Cylinder")
@CxxDefaultConstructorUnavailable
public interface Cylinder extends Source {

    @CxxConstructor
    public static Cylinder newCylinder() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Enables colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public Cylinder colors(boolean enable);

    //! Specifices the base of the Cylinder.
    @CxxMethod
    @CxxByReference
    public Cylinder origin(@CxxConst @CxxByReference Vec3 origin);

    //! Specifies the number of radial subdivisions, which determines the roundness of the Cylinder. Defaults to \c 18.
    @CxxMethod
    @CxxByReference
    public Cylinder subdivisionsAxis(int subdiv);

    //! Specifies the number of slices along the Cylinder's height. Defaults to \c 1.
    @CxxMethod
    @CxxByReference
    public Cylinder subdivisionsHeight(int slices);

    //! Specifies the number of rings for the Cylinder's cap. Defaults to \c 3.
    @CxxMethod
    @CxxByReference
    public Cylinder subdivisionsCap(int rings);

    //! Specifies the height of the cylinder.
    @CxxMethod
    @CxxByReference
    public Cylinder height(float height);

    //! Specifies the base and apex radius.
    @CxxMethod
    @CxxByReference
    public Cylinder radius(float radius);

    //! Specifies the axis of the cylinder.
    @CxxMethod
    @CxxByReference
    public Cylinder direction(@CxxConst @CxxByReference Vec3 direction);

    //! Conveniently sets origin, height and direction so that the center of the base is \a from and the center of the apex is \a to.
    @CxxMethod
    @CxxByReference
    public Cylinder set(@CxxConst @CxxByReference Vec3 from, @CxxConst @CxxByReference Vec3 to);

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
    public Cylinder clone();
}
