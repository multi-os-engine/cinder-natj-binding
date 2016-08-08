package cinder.geom;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxEnum;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxMethod;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = {"cinder/GeomIo.h"}, useQuotes = false)
@CxxClass("std::set<cinder::geom::Attrib>")
public interface AttribSet extends CxxObject {

    @CxxMethod(isConst = true)
    @NULong
    public long count(@CxxEnum("cinder::geom::Attrib") int val);
}
