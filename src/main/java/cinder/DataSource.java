package cinder;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxCopyConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxDestructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/DataSource.h"}, useQuotes = false)
@CxxClass("cinder::DataSource")
@CxxCopyConstructorUnavailable
@CxxDestructorUnavailable
public interface DataSource extends CxxObject {

}
