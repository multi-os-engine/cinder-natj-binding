package glm;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxHeader;

@CxxHeader(value = {"glm/fwd.hpp"}, useQuotes = false)
@CxxClass("glm::quat")
public interface Quat extends CxxObject {
}
