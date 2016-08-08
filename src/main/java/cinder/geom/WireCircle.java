package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec2;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WireCircle")
public interface WireCircle extends Source {

    @CxxConstructor
    public static WireCircle newWireCircle() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Sets the center point of the circle to \a center.
    @CxxMethod
    @CxxByReference
    public WireCircle center(@CxxConst @CxxByReference Vec2 center);

    //! Sets the center point of the circle to \a center.
    @CxxMethod
    @CxxByReference
    public WireCircle center(@CxxConst @CxxByReference Vec3 center);

    //! Sets the radius of the circle to \a radius.
    @CxxMethod
    @CxxByReference
    public WireCircle radius(float radius);

    //! Specifies the number of segments that make up the circle. Defaults to \c 12.
    @CxxMethod
    @CxxByReference
    public WireCircle subdivisions(int subdiv);

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
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WireCircle clone();
}
