package cinder;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDestructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/DataTarget.h"}, useQuotes = false)
@CxxClass("cinder::DataTarget")
@CxxCopyConstructorUnavailable
@CxxDestructorUnavailable
public interface DataTarget extends CxxObject {
}
