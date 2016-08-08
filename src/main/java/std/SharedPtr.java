package std;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxByReference;
import org.moe.natj.cxx.ann.CxxCastOperator;
import org.moe.natj.cxx.ann.CxxMethod;
import org.moe.natj.cxx.ann.CxxTemplate;

@CxxTemplate("std::shared_ptr<{{T}}>")
public interface SharedPtr<T extends CxxObject> extends CxxObject {

    @CxxMethod(isConst = true)
    T get();

    @CxxMethod
    void reset();

    @CxxMethod
    void swap(@CxxByReference SharedPtr<T> ptr);

    @CxxCastOperator
    boolean hasAssociatedObject();

    default void resetSwapAndDelete(SharedPtr<T> ptr) {
        reset();
        swap(ptr);
        CxxRuntime.delete(ptr);
    }
}
