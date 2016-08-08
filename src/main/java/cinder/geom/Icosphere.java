package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Icosphere")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Icosphere extends Source {

    @CxxConstructor
    public static Icosphere newIcosphere() {
        throw new CxxExpectedGeneratedCodeException();
    }

    // Enables colors. Disabled by default.
    @CxxMethod
    @CxxByReference
    public Icosphere colors(boolean enable);

    @CxxMethod
    @CxxByReference
    public Icosphere subdivisions(int sub);

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
    public Icosphere clone();
}
