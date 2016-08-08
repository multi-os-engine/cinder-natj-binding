package cinder.geom;

import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxMethod;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("cinder::geom::SourceMods")
public interface SourceMods extends Source {

    @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
    public SourceMods clone();
}
