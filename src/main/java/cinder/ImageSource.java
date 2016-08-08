package cinder;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import std.SharedPtr;

@CxxHeader(value = {"cinder/ImageIo.h"}, useQuotes = false)
@CxxClass("cinder::ImageSource")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface ImageSource extends ImageIo {

    @CxxClass("cinder::ImageSource::Options")
    public interface Options extends CxxObject {

        @CxxConstructor
        public static Options newOptions() {
            throw new CxxExpectedGeneratedCodeException();
        }

        //! Specifies an image index for multi-part images, like animated GIFs. 0-based index.
        @CxxMethod
        @CxxByReference
        public Options index(int index);

        //! If an exception occurs, enabling this will prevent any attempts at using other handlers to load the image. Default = false, all handlers are tried and if none succeed, the last exception is rethrown. \see ImageIoException
        @CxxMethod
        @CxxByReference
        public Options throwOnFirstException(boolean b);

        //! Returns image index. \see index()
        @CxxMethod(isConst = true)
        public int getIndex();

        //! Returns whether throwOnFirstException() is enabled or not.
        @CxxMethod
        public boolean getThrowOnFirstException();
    }

    //! Returns the aspect ratio of individual pixels to accommodate non-square pixels
    @CxxMethod(isConst = true)
    public float getPixelAspectRatio();

    //! Returns whether the ImageSource's color data has been premultiplied by its alpha channel
    @CxxMethod(isConst = true)
    public boolean isPremultiplied();

    //! Returns the number of bytes necessary to represent a row of the ImageSource
    @CxxMethod(isConst = true)
    @NULong
    public long getRowBytes();

    //! Returns the number of images. Generally \c 1 but may not be in the case of animated GIFs. \see Options::index()
    @CxxMethod(isConst = true)
    public int getCount();

    @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
    public void load(@CxxByValue SharedPtr<ImageTarget> target);

}
