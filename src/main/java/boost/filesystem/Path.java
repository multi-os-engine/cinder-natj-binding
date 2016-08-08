package boost.filesystem;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;

@CxxHeader(value = {"boost/filesystem/path.hpp"}, useQuotes = false)
@CxxClass("boost::filesystem::path")
public interface Path extends CxxObject {

    @CxxMethod
    @CxxConst
    @CxxByReference
    public std.String string();

    default String getString() {
        return string().getString();
    }

    @CxxConstructor()
    public static Path newPath(@CxxConst @CxxByReference std.String path) {
        throw new CxxExpectedGeneratedCodeException();
    }

    public static Path newPath(String path) {
        std.String stdPath = std.String.getString(path);
        try {
            return newPath(stdPath);
        } finally {
            CxxRuntime.delete(stdPath);
        }
    }

    @CxxOperatorFunction(CxxOperatorKind.DIVIDE)
    @CxxByValue
    public static Path append(@CxxConst @CxxByReference Path lhs, @CxxConst @CxxByReference Path rhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    public static Path append(Path lhs, String rhs) {
        Path rhsPath = newPath(rhs);
        try {
            return Path.append(lhs, rhsPath);
        } finally {
            CxxRuntime.delete(rhsPath);
        }
    }

}
