package cinder.app;

import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;

@CxxHeader(value = {"cinder/app/MouseEvent.h"}, useQuotes = false)
@CxxClass("cinder::app::MouseEvent")
public interface MouseEvent {

    @CxxMethod
    @CxxConst
    @CxxByReference
    public IVec2 getPos();
}
