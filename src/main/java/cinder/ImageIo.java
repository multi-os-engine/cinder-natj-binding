package cinder;

import boost.filesystem.Path;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/ImageIo.h"}, useQuotes = false)
@CxxClass("cinder::ImageIo")
@CxxDefaultConstructorUnavailable
public interface ImageIo extends CxxObject {

    enum ColorModel {CM_RGB, CM_GRAY, CM_UNKNOWN}

    ;

    enum DataType {UINT8, UINT16, FLOAT32, FLOAT16, DATA_UNKNOWN}

    ;

    enum ChannelType {
        CHAN_RGB_R, CHAN_RGB_G, CHAN_RGB_B, CHAN_GRAY, CHAN_ALPHA, CHAN_MASK, CHAN_LAB_L, CHAN_LAB_A, CHAN_LAB_B,
        CHAN_YUV_Y, CHAN_YUV_U, CHAN_YUV_V, CHAN_CMYK_C, CHAN_CMYK_M, CHAN_CMYK_Y, CHAN_CMYK_K,
        CHAN_UNKNOWN
    }

    ;

    enum ChannelOrder {RGBA, BGRA, ARGB, ABGR, RGBX, BGRX, XRGB, XBGR, RGB, BGR, Y, YA, CUSTOM}

    @CxxFunction("cinder::loadImage")
    @CxxByValue
    public static SharedPtr<ImageSource> loadImage(@CxxByValue SharedPtr<DataSource> dataSource) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::loadImage")
    @CxxByValue
    public static SharedPtr<ImageSource> loadImageWithDataSourcePath(@CxxByValue SharedPtr<DataSourcePath> dataSource) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Loads an image from the file path \a path. Optional \a extension parameter allows specification of a file type. For example, "jpg" would force the file to load as a JPEG
    @CxxFunction("cinder::loadImage")
    @CxxByValue
    public static SharedPtr<ImageSource> loadImage(@CxxConst @CxxByReference Path path, @CxxByValue ImageSource.Options options, @CxxByValue std.String extension) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::loadImage")
    @CxxByValue
    public static SharedPtr<ImageSource> loadImage(@CxxConst @CxxByReference Path path, @CxxByValue ImageSource.Options options) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::loadImage")
    @CxxByValue
    public static SharedPtr<ImageSource> loadImage(@CxxConst @CxxByReference Path path) {
        throw new CxxExpectedGeneratedCodeException();
    }

    /**
     * Writes \a imageSource to file path \a path. Optional \a extension parameter allows specification of a file type. For example, "jpg" would force the file to load as a JPEG
     * \note If \a path does not exist, the necessary directories are created automatically.
     **/
    @CxxFunction("cinder::writeImage")
    public static void writeImage(@CxxConst @CxxByReference Path path, @CxxConst @CxxByReference SharedPtr<ImageSource> imageSource, @CxxByValue ImageTarget.Options options, @CxxByValue std.String extension) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::writeImage")
    public static void writeImage(@CxxConst @CxxByReference Path path, @CxxConst @CxxByReference SharedPtr<ImageSource> imageSource) {
        throw new CxxExpectedGeneratedCodeException();
    }

}
