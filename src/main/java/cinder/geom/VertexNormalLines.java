package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::VertexNormalLines")
@CxxDefaultConstructorUnavailable
public interface VertexNormalLines extends Modifier {

    @CxxConstructor
    public static VertexNormalLines newVertexNormalLines(float length, @CxxEnum("cinder::geom::Attrib") int attrib) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static VertexNormalLines newVertexNormalLines(float length) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxByReference
    public VertexNormalLines length(float len);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true)
    @NULong
    public long getNumIndices(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true)
    @CxxEnum("cinder::geom::Primitive")
    public int getPrimitive(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true)
    @CxxUnsigned
    public byte getAttribDims(@CxxEnum("cinder::geom::Attrib") int attr, @CxxUnsigned long upstreamDims);

    @CxxMethod(isConst = true)
    @CxxByValue
    public AttribSet getAvailableAttribs(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true)
    public Modifier clone();

    @CxxMethod(isConst = true)
    public void process(SourceModsContext ctx, @CxxConst @CxxByReference AttribSet requestedAttribs);
}
