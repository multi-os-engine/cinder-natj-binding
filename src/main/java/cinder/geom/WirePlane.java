package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.IVec2;
import glm.detail.Vec2;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::WirePlane")
public interface WirePlane extends WireSource {

    @CxxConstructor
    public static WirePlane newWirePlane() {
        throw new CxxExpectedGeneratedCodeException();
    }

    // Specifies the number of times each side is subdivided, ex [2,2] means 4 quads in total. Defaults to [1, 1].
    @CxxMethod
    @CxxByReference
    public WirePlane subdivisions(@CxxConst @CxxByReference IVec2 subdivisions);

    //! Specifies the size in each axis. Defaults to [2, 2], or 1 in each direction
    @CxxMethod
    @CxxByReference
    public WirePlane size(@CxxConst @CxxByReference Vec2 size);

    //!
    @CxxMethod
    @CxxByReference
    public WirePlane axes(@CxxConst @CxxByReference Vec3 uAxis, @CxxConst @CxxByReference Vec3 vAxis);

    //!
    @CxxMethod
    @CxxByReference
    public WirePlane origin(@CxxConst @CxxByReference Vec3 origin);

    //!
    @CxxMethod
    @CxxByReference
    public WirePlane normal(@CxxConst @CxxByReference Vec3 normal);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public WirePlane clone();
}
