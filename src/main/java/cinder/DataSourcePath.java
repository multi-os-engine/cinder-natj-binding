package cinder;

import boost.filesystem.Path;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.ann.*;
import std.SharedPtr;

@CxxHeader(value = {"cinder/DataSource.h"}, useQuotes = false)
@CxxClass("cinder::DataSourcePath")
@CxxCopyConstructorUnavailable
@CxxDestructorUnavailable
public interface DataSourcePath extends DataSource {

    @CxxFunction("cinder::DataSourcePath::create")
    @CxxByValue
    public static SharedPtr<DataSourcePath> create(@CxxConst @CxxByReference Path path) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
