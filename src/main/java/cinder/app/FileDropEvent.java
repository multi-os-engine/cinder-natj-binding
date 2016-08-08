package cinder.app;

import boost.filesystem.Path;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import glm.detail.IVec2;
import std.SharedPtr;

@CxxHeader(value = {"cinder/app/FileDropEvent.h"}, useQuotes = false)
@CxxClass("cinder::app::FileDropEvent")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface FileDropEvent extends CxxObject {

    @CxxConstructor
    public static FileDropEvent newFileDropEvent(@CxxByValue SharedPtr<Window> win, int aX, int aY, @CxxConst @CxxByReference std.Vector<Path> aFiles) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Returns the X coordinate measured in points of the mouse during the event
    @CxxMethod(isConst = true)
    public int getX();

    //! Returns the Y coordinate measured in points of the mouse during the event
    @CxxMethod(isConst = true)
    public int getY();

    //! Returns the coordinates measured in points of the mouse during the event
    @CxxMethod(isConst = true)
    @CxxByValue
    public IVec2 getPos();

    //! Returns the vector of file paths which were dropped
    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public std.Vector<Path> getFiles();

    //! Returns the number of files dropped during the event
    @CxxMethod(isConst = true)
    @NULong
    public long getNumFiles();

    //! Returns the path for file number \a index.
    @CxxConst
    @CxxByReference
    public Path getFile(@NULong long index);
}
