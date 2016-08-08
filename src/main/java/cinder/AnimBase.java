package cinder;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxDestructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"cinder/Tween.h"}, useQuotes = false)
@CxxClass("cinder::AnimBase")
@CxxDestructorUnavailable
public interface AnimBase extends CxxObject {
}
