package cairo;

import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/cairo/Cairo.h"}, useQuotes = false)
public class Cairo {

    @CxxByValue
    @CxxFunction("cinder::cairo::createWindowSurface")
    public static native SurfaceQuartz createWindowSurface();

}
