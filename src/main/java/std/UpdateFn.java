package std;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxOperator;

@CxxHeader(value = "functional", useQuotes = false)
@CxxClass("std::function<void ()>")
public interface UpdateFn extends CxxObject {
    @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
    void call();
}
