package cinder;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/Tween.h"}, useQuotes = false)
@CxxClass("cinder::Tween<float>")
@CxxDefaultConstructorUnavailable
public interface Tween extends CxxObject {

    @CxxHeader(value = {"cinder/Tween.h"}, useQuotes = false)
    @CxxClass("cinder::Tween<float>::Options")
    @CxxDefaultConstructorUnavailable
    @CxxCopyConstructorUnavailable
    @CxxDestructorUnavailable
    public interface Options extends CxxObject {
    }
}
