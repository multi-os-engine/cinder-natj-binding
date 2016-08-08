package std;

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConstructor;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxMethod;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.impl.PtrFactory;

import java.io.UnsupportedEncodingException;

@CxxHeader(value = "string", useQuotes = false)
@CxxClass("std::string")
public interface String extends CxxObject {

    @CxxMethod(isConst = true)
    @NULong
    long length();

    @CxxMethod(isConst = true)
    ConstBytePtr c_str();

    @CxxConstructor
    static std.String create(BytePtr ptr, @NULong long len) {
        throw new CxxExpectedGeneratedCodeException();
    }

    default java.lang.String getString() {
        return c_str().toUTF8String();
    }

    static String getString(java.lang.String s) {
        try {
            final byte[] bytes = s.getBytes("UTF-8");
            final BytePtr bytePtr = PtrFactory.newByteArray(bytes);
            return create(bytePtr, bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException occurred", e);
        }
    }

    static BytePtr getBytePtr(java.lang.String s) {
        try {
            // In this method we need to make sure the C-String is null-terminated!
            final byte[] bytes = s.getBytes("UTF-8");
            final BytePtr buffer = PtrFactory.newByteArray(bytes.length + 1);
            buffer.copyFrom(bytes);
            buffer.setValue(bytes.length, (byte) 0);
            return buffer;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException occurred", e);
        }
    }

    @CxxConstructor
    public static std.Vector<std.String> newStringVector() {
        throw new CxxExpectedGeneratedCodeException();
    }
}
