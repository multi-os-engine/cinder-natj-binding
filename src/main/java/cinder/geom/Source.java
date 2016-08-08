package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Source")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Source extends CxxObject {

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    @NULong
    public long getNumVertices();

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    @NULong
    public long getNumIndices();

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    @CxxEnum("cinder::geom::Primitive")
    public int getPrimitive();

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    @CxxUnsigned
    public byte getAttribDims(@CxxEnum("cinder::geom::Attrib") int attr);

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    @CxxByValue
    public AttribSet getAvailableAttribs();

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    public Source clone();

    @CxxOperatorFunction(CxxOperatorKind.RIGHT_SHIFT)
    @CxxByValue
    public static SourceMods operatorRightShift(@CxxConst Source source, @CxxConst @CxxByReference Modifier modifier) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
