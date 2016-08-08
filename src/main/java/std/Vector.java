package std;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;

@CxxHeader(value = "vector", useQuotes = false)
@CxxTemplate("std::vector<{{T}}>")
public interface Vector<T extends CxxObject> extends CxxObject {

    @CxxMethod(isConst = true)
    @NULong
    long size();

    @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
    @CxxConst
    @CxxByReference
    T get(@NULong long index);

    @CxxMethod
    void push_back(@CxxConst @CxxByReference T value);

    @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
    @CxxByReference
    T set(@NULong long index, @CxxConst @CxxByReference T value);

    @CxxMethod
    @CxxByValue
    VectorIterator<T> begin();

    @CxxMethod
    @CxxByValue
    VectorIterator<T> end();

    @CxxMethod
    void clear();

    static void push_back(std.Vector<std.String> vector, java.lang.String value) {
        final std.String _value = std.String.getString(value);
        try {
            vector.push_back(_value);
        } finally {
            CxxRuntime.delete(_value);
        }
    }
}
