package cinder.geom;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.IntPtr;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::Target")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
@CxxDestructorUnavailable
public interface Target extends CxxObject {

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
    @CxxUnsigned
    public byte getAttribDims(@CxxEnum("cinder::geom::Attrib") int attr);

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
    public void copyAttrib(@CxxEnum("cinder::geom::Attrib") int attr, @CxxUnsigned byte dims, @NULong long strideBytes, ConstFloatPtr srcData, @NULong long count);

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
    public void copyIndices(@CxxEnum("cinder::geom::Primitive") int primitive, @CxxUnsigned ConstIntPtr source, @NULong long numIndices, @CxxUnsigned byte requiredBytesPerIndex);

    //! For non-indexed geometry, this generates appropriate indices and then calls the copyIndices() virtual method.
    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void generateIndices(@CxxEnum("cinder::geom::Primitive") int sourcePrimitive, @NULong long sourceNumIndices);

    @CxxFunction("cinder::geom::Target::copyIndexDataForceTriangles")
    public static void copyIndexDataForceTriangles(@CxxEnum("cinder::geom::Primitive") int primitive, @CxxUnsigned ConstIntPtr source, @NULong long numIndices, @CxxUnsigned int indexOffset, @CxxUnsigned IntPtr target) {
        throw new CxxExpectedGeneratedCodeException();
    }

    /*@CxxFunction("cinder::geom::Target::copyIndexDataForceTriangles")
    public static void copyIndexDataForceTriangles( @CxxEnum("cinder::geom::Primitive") int primitive, @CxxUnsigned ConstIntPtr source, @NULong long numIndices, @CxxUnsigned short indexOffset,  @CxxUnsigned ShortPtr target ) {
        throw new CxxExpectedGeneratedCodeException();
    }*/

    @CxxFunction("cinder::geom::Target::copyIndexDataForceLines")
    public static void copyIndexDataForceLines(@CxxEnum("cinder::geom::Primitive") int primitive, @CxxUnsigned ConstIntPtr source, @NULong long numIndices, @CxxUnsigned int indexOffset, @CxxUnsigned IntPtr target) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::geom::Target::generateIndicesForceTriangles")
    public static void generateIndicesForceTriangles(@CxxEnum("cinder::geom::Primitive") int primitive, @NULong long numInputIndices, @CxxUnsigned int indexOffset, @CxxUnsigned IntPtr target) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::geom::Target::generateIndicesForceLines")
    public static void generateIndicesForceLines(@CxxEnum("cinder::geom::Primitive") int primitive, @NULong long numInputIndices, @CxxUnsigned int indexOffset, @CxxUnsigned IntPtr target) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Returns the Primitive type that accommodates both 'a' and 'b'. Returns \c NUM_PRIMITIVES if none can.
    @CxxFunction("cinder::geom::Target::determineCombinedPrimitive")
    @CxxEnum("cinder::geom::Primitive")
    public static int determineCombinedPrimitive(@CxxEnum("cinder::geom::Primitive") int a, @CxxEnum("cinder::geom::Primitive") int b) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
