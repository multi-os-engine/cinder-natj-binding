package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Capsule")
public interface Capsule extends Source {

    @CxxConstructor
    public static Capsule newCapsule() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Enables colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public Capsule colors(boolean enable);

    @CxxMethod
    @CxxByReference
    public Capsule center(@CxxConst @CxxByReference Vec3 center);

    //! Specifies the number of radial subdivisions, which determines the roundness of the capsule. Defaults to \c 6.
    @CxxMethod
    @CxxByReference
    public Capsule subdivisionsAxis(int subdiv);

    //! Specifies the number of slices along the capsule's length. Defaults to \c 6. Add more subdivisions to improve texture mapping and lighting, or if you intend to bend the capsule.
    @CxxMethod
    @CxxByReference
    public Capsule subdivisionsHeight(int subdiv);

    @CxxMethod
    @CxxByReference
    public Capsule radius(float radius);

    @CxxMethod
    @CxxByReference
    public Capsule length(float length);

    @CxxMethod
    @CxxByReference
    public Capsule direction(@CxxConst @CxxByReference Vec3 direction);

    //! Conveniently sets center, length and direction
    @CxxMethod
    @CxxByReference
    public Capsule set(@CxxConst @CxxByReference Vec3 from, @CxxConst @CxxByReference Vec3 to);

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
    public Capsule clone();
}
