package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.IVec2;
import glm.detail.Vec2;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Plane")
public interface Plane extends Source {

    @CxxConstructor
    public static Plane newPlane() {
        throw new CxxExpectedGeneratedCodeException();
    }

    // Specifies the number of times each side is subdivided, ex [2,2] means 4 quads in total. Defaults to [1, 1].
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByReference
    public Plane subdivisions(@CxxConst @CxxByReference IVec2 subdivisions);

    //! Specifies the size in each axis. Defaults to [2, 2], or 1 in each direction
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByReference
    public Plane size(@CxxConst @CxxByReference Vec2 size);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByReference
    public Plane axes(@CxxConst @CxxByReference Vec3 uAxis, @CxxConst @CxxByReference Vec3 vAxis);

    @CxxMethod
    @CxxByReference
    public Plane origin(@CxxConst @CxxByReference Vec3 origin);

    @CxxMethod
    @CxxByReference
    public Plane normal(@CxxConst @CxxByReference Vec3 normal);

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
    public Plane clone();
}
