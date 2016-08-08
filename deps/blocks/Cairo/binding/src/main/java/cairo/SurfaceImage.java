package cairo;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/cairo/Cairo.h"}, useQuotes = false)
@CxxClass("cinder::cairo::SurfaceImage")
public interface SurfaceImage extends SurfaceBase {

    @CxxConstructor()
    public static SurfaceImage newSurfaceImage(int width, int height) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static SurfaceImage newSurfaceImage(int width, int height, boolean hasAlpha) {
        throw new CxxExpectedGeneratedCodeException();
    }

}
