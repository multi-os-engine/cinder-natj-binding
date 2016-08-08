package std;

import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.general.ann.NLong;

@CxxHeader(value = {"math.h"}, useQuotes = false)
public class Math {

    @CxxFunction
    public static native float fabsf(float value);

    @CxxFunction
    @NLong
    public static native long lroundf(float value);
}
