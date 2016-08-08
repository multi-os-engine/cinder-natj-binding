package cairo;

import cinder.Area;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/cairo/Cairo.h"}, useQuotes = false)
@CxxClass("cinder::cairo::SurfaceBase")
public interface SurfaceBase extends CxxObject {

    @CxxConstructor()
    public static Context newSurfaceBase() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Context newSurfaceBase(@CxxConst @CxxByReference SurfaceBase other) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    @CxxConst
    @CxxByValue
    public Area getBounds();

}
