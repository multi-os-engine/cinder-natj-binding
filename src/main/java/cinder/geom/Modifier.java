package cinder.geom;

import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Modifier")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Modifier extends CxxObject {

    //! Expresses the upstream parameters for a Modifier such as # vertices
    @CxxClass("cinder::geom::Modifier::Params")
    public interface Params extends CxxObject {

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
        @CxxByValue
        public AttribSet getAvailableAttribs();

    }

    @CxxMethod(isConst = true, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
    public Modifier clone();

    @CxxMethod(isConst = true, virtuality = CxxMethodVirtuality.VIRTUAL)
    @NULong
    public long getNumVertices(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true, virtuality = CxxMethodVirtuality.VIRTUAL)
    @NULong
    public long getNumIndices(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true, virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxEnum("cinder::geom::Primitive")
    public int getPrimitive(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true, virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxUnsigned
    public byte getAttribDims(@CxxEnum("cinder::geom::Attrib") int attr, @CxxUnsigned long upstreamDims);

    @CxxMethod(isConst = true, virtuality = CxxMethodVirtuality.VIRTUAL)
    @CxxByValue
    public AttribSet getAvailableAttribs(@CxxConst @CxxByReference Modifier.Params upstreamParams);

    @CxxMethod(isConst = true, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
    public void process(SourceModsContext ctx, @CxxConst @CxxByReference AttribSet requestedAttribs);

}
