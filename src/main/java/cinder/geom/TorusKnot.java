package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::TorusKnot")
public interface TorusKnot extends Source {

    @CxxConstructor
    public static TorusKnot newTorusKnot() {
        throw new CxxExpectedGeneratedCodeException();
    }

    // Enables colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public TorusKnot colors(boolean enable);

    @CxxMethod
    @CxxByReference
    public TorusKnot subdivisionsAxis(int subdiv);

    @CxxMethod
    @CxxByReference
    public TorusKnot subdivisionsHeight(int subdiv);

    //! Specifies the \a P and \a Q parameters of the torus knot.
    @CxxMethod
    @CxxByReference
    public TorusKnot parameters(int p, int q);

    //! Specifies the radius of the tube.
    @CxxMethod
    @CxxByReference
    public TorusKnot radius(float radius);

    //! Allows you to scale the generated curve.
    @CxxMethod
    @CxxByReference
    public TorusKnot scale(@CxxConst @CxxByReference Vec3 scale);

    //! Allows you to scale the generated curve.
    @CxxMethod
    @CxxByReference
    public TorusKnot scale(float x, float y, float z);

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
    public TorusKnot clone();
}
