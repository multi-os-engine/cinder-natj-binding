package glm.detail;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"glm/detail/type_mat.hpp"}, useQuotes = false)
@CxxClass("glm::mat4")
public interface Mat4 extends CxxObject {

    @CxxOperator(CxxOperatorKind.MULTIPLY_ASSIGN)
    @CxxByReference
    public Mat4 mulAssign(@CxxConst @CxxByValue Mat4 value);

    @CxxConstructor()
    public static Mat4 newMat4() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
