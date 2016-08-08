package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;

@CxxHeader(value = {"cinder/ImageIo.h"}, useQuotes = false)
@CxxClass("cinder::ImageTarget")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ImageTarget extends ImageIo {

    @CxxClass("cinder::ImageTarget::Options")
    public interface Options extends CxxObject {

        @CxxConstructor
        public static Options newOptions() {
            throw new CxxExpectedGeneratedCodeException();
        }

        @CxxMethod
        @CxxByReference
        public Options quality(float quality);

        @CxxMethod
        @CxxByReference
        public Options colorModel(@CxxEnum("cinder::ImageIo::ColorModel") int cm);

        @CxxMethod
        public void setColorModelDefault();

        @CxxMethod(isConst = true)
        public float getQuality();

        @CxxMethod(isConst = true)
        public boolean isColorModelDefault();

        @CxxMethod(isConst = true)
        @CxxEnum("cinder::ImageIo::ColorModel")
        public int getColorModel();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
    public VoidPtr getRowPointer(int row);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void setRow(int row, ConstVoidPtr data);

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void finalize();

}
