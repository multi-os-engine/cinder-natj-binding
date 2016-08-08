package cinder.app;

import cinder.Display;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/app/Window.h"}, useQuotes = false)
@CxxClass("cinder::app::FullScreenOptions")
public interface FullScreenOptions {

    @CxxConstructor
    public static FullScreenOptions newFullScreenOptions() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! (OS X only) Sets the fullscreen mode to 'kiosk', which means don't use the 10.7 way of animating to fullscreen. Default is \c true.
    @CxxMethod
    @CxxByReference
    public FullScreenOptions kioskMode(boolean enable);

    //! Sets whether secondary displays should be blanked (made black). Default is \c false.
    @CxxMethod
    @CxxByReference
    public FullScreenOptions secondaryDisplayBlanking(boolean enable);

    //! (OS X only) Sets whether the \t Window related to these options is the only accessible window. Default is \c false.
    @CxxMethod
    @CxxByReference
    public FullScreenOptions exclusive(boolean enable);

    //! Sets the display which will be used in fullscreen mode. Defaults to the \t Window's current \t Display. Ignored on Mac OS X outside of kiosk mode.
    @CxxMethod
    @CxxByReference
    public FullScreenOptions display(@CxxByValue SharedPtr<Display> display);

    //! Returns the display on which the fullscreen should occur. A NULL value implies the default, which is the \t Window's current \t Display.
    @CxxMethod(isConst = true)
    @CxxByValue
    public SharedPtr<Display> getDisplay();

    //! Returns whether kiosk mode is enabled.
    @CxxMethod(isConst = true)
    public boolean isKioskModeEnabled();

    //! Returns whether blanking of secondary displays in enabled. Default is \c false.
    @CxxMethod(isConst = true)
    public boolean isSecondaryDisplayBlankingEnabled();

    //! Returns whether the \t Window related to these options is the only accessible window.
    @CxxMethod(isConst = true)
    public boolean isExclusive();
}
