package std;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxDefaultConstructorUnavailable;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxTemplate;

@CxxHeader(value = "functional", useQuotes = false)
@CxxTemplate("std::reference_wrapper<{{T}}>")
@CxxDefaultConstructorUnavailable
public interface ReferenceWrapper<T extends CxxObject> extends CxxObject {
}
