package cinder.geom;

import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::SourceModsContext")
@CxxCopyConstructorUnavailable
public interface SourceModsContext extends Target {
}
