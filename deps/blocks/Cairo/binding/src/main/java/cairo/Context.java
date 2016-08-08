package cairo;

import cinder.Area;
import cinder.ColorA;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.Vec2;

@CxxHeader(value = {"cinder/cairo/Cairo.h"}, useQuotes = false)
@CxxClass("cinder::cairo::Context")
public interface Context extends CxxObject {

    @CxxConstructor()
    public static Context newContext() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Context newContext(@CxxConst @CxxByReference SurfaceBase surface) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor()
    public static Context newContext(@CxxConst @CxxByReference Context other) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod
    public void setSourceRgb(double red, double green, double blue);

    @CxxMethod
    public void setSourceRgba(double red, double green, double blue, double alpha);

    @CxxMethod
    public void paint();

    @CxxMethod
    public void circle(@CxxConst @CxxByReference Vec2 v, double radius);

    @CxxMethod
    public void fill();

    @CxxMethod
    public void	setSource(@CxxConst @CxxByReference ColorA col);

    @CxxMethod
    public void	copySurface(@CxxConst @CxxByReference SurfaceBase surface, @CxxConst @CxxByReference Area srcArea);

}
