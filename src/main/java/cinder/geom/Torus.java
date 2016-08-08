package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Torus")
public interface Torus extends Source {

    @CxxConstructor
    public static Torus newTorus() {
        throw new CxxExpectedGeneratedCodeException();
    }

    // Enables colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public Torus colors(boolean enable);

    @CxxMethod
    @CxxByReference
    public Torus center(@CxxConst @CxxByReference Vec3 center);

    @CxxMethod
    @CxxByReference
    public Torus subdivisionsAxis(int subdiv);

    @CxxMethod
    @CxxByReference
    public Torus subdivisionsHeight(int subdiv);

    //! Allows you to twist the torus along the ring.
    @CxxMethod
    @CxxByReference
    public Torus twist(@CxxUnsigned int twist);

    //! Allows you to twist the torus along the ring. The \a offset is in radians.
    @CxxMethod
    @CxxByReference
    public Torus twist(@CxxUnsigned int twist, float offset);

    //! Specifies the major and minor radius as a ratio (minor : major). Resulting torus will fit unit cube.
    @CxxMethod
    @CxxByReference
    public Torus ratio(float ratio);

    //! Specifies the major and minor radius separately.
    @CxxMethod
    @CxxByReference
    public Torus radius(float major, float minor);

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
    public Torus clone();
}
