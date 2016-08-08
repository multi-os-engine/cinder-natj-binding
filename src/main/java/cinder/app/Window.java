package cinder.app;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/app/Window.h"}, useQuotes = false)
@CxxClass("cinder::app::Window")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface Window extends CxxObject {

    @CxxClass("cinder::app::Window::Format")
    public interface Format extends CxxObject {

    }

    //! Sets the title of the Window as a UTF-8 string.
    @CxxMethod
    public void setTitle(@CxxConst @CxxByReference std.String title);
}
