package cinder.app.cocoa;

import cinder.app.AppBase;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/app/cocoa/AppMac.h"}, useQuotes = false)
@CxxClass("cinder::app::AppMac")
@CxxCopyConstructorUnavailable
public interface AppMac extends AppBase {

    @CxxConstructor()
    public static AppMac newAppMac() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
    public void quit();

}
