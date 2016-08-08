package cinder.geom;

import cinder.ColorAf;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Cube")
public interface Cube extends Source {

    @CxxConstructor
    public static Cube newCube() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Enables default colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public Cube colors(boolean enable);

    //! Enables per-face colors ordered { +X, -X, +Y, -Y, +Z, -Z }. Colors are disabled by default.
    @CxxMethod
    @CxxByReference
    public Cube colors(@CxxConst @CxxByReference ColorAf posX, @CxxConst @CxxByReference ColorAf negX, @CxxConst @CxxByReference ColorAf posY, @CxxConst @CxxByReference ColorAf negY, @CxxConst @CxxByReference ColorAf posZ, @CxxConst @CxxByReference ColorAf negZ);

    @CxxMethod
    @CxxByReference
    public Cube subdivisions(int sub);

    @CxxMethod
    @CxxByReference
    public Cube subdivisionsX(int sub);

    @CxxMethod
    @CxxByReference
    public Cube subdivisionsY(int sub);

    @CxxMethod
    @CxxByReference
    public Cube subdivisionsZ(int sub);

    @CxxMethod
    @CxxByReference
    public Cube size(@CxxConst @CxxByReference Vec3 sz);

    @CxxMethod
    @CxxByReference
    public Cube size(float x, float y, float z);

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
    public Cube clone();
}
