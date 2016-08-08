package cinder;

import boost.filesystem.Path;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"cinder/Utilities.h"}, useQuotes = false)
public class Utilities {

    //! Returns a canonical version of \a path. Collapses '.', ".." and "//". Converts '~' on Cocoa. Expands environment variables on MSW.
    @CxxByValue
    @CxxFunction("cinder::expandPath")
    public static native Path expandPath(@CxxByReference @CxxConst Path path);

    //! Returns a path to the user's home directory.
    @CxxByValue
    @CxxFunction("cinder::getHomeDirectory")
    public static native Path getHomeDirectory();

    //! Returns a path to the user's documents directory.
    @CxxByValue
    @CxxFunction("cinder::getDocumentsDirectory")
    public static native Path getDocumentsDirectory();

}
