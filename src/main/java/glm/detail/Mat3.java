package glm.detail;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_mat.hpp"}, useQuotes = false)
@CxxClass("glm::mat3")
public interface Mat3 extends CxxObject {

    @CxxOperator(CxxOperatorKind.MULTIPLY_ASSIGN)
    @CxxByReference
    public Mat3 multiplyAssign(@CxxConst @CxxByValue Mat3 value);
}
