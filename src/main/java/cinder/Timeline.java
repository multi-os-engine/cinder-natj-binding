package cinder;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/Timeline.h"}, useQuotes = false)
@CxxClass("cinder::Timeline")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Timeline extends CxxObject {

    @CxxMethod
    public void apply(Anim target, float endValue, float duration);

    @CxxMethod
    public void apply(Anim target, float endValue, float duration, @CxxByValue EaseFn easeInOutExpo);

    @CxxMethod
    public void apply2(Anim target, float endValue, float duration);
}
