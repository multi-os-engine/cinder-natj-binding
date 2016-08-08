package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.Vec3;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Sphere")
public interface Sphere extends Source {

    @CxxConstructor
    public static Sphere newSphere() {
        throw new CxxExpectedGeneratedCodeException();
    }


    @CxxConstructor
    public static Sphere newSphere(@CxxConst @CxxByReference cinder.Sphere sphere) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public Sphere colors(boolean enable);

    @CxxMethod
    @CxxByReference
    public Sphere center(@CxxConst @CxxByReference Vec3 center);

    @CxxMethod
    @CxxByReference
    public Sphere radius(float radius);

    //! Specifies the number of segments, which determines the roundness of the sphere.
    @CxxMethod
    @CxxByReference
    public Sphere subdivisions(int subdiv);

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
    public Sphere clone();
}
