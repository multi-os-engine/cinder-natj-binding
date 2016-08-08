package cinder.gl;

import cinder.DataSource;
import cinder.DataSourcePath;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import glm.detail.IVec2;
import glm.detail.Vec2;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/GlslProg.h"}, useQuotes = false)
@CxxClass("cinder::gl::GlslProg")
@CxxDefaultConstructorUnavailable
@CxxCopyConstructorUnavailable
public interface GlslProg extends CxxObject {

    @CxxConstructor
    static SharedPtr<GlslProg> createEmpty() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    static SharedPtr<GlslProg> createCopy(@CxxConst @CxxByReference SharedPtr<GlslProg> orig) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxHeader(value = {"cinder/gl/GlslProg.h"}, useQuotes = false)
    @CxxClass("cinder::gl::GlslProg::Uniform")
    public interface Uniform extends CxxObject {

        //! Returns a const reference of the name as defined inside the Glsl.
        @CxxMethod(isConst = true)
        @CxxConst
        @CxxByReference
        public std.String getName();


    }

    @CxxHeader(value = {"cinder/gl/GlslProg.h"}, useQuotes = false)
    @CxxClass("cinder::gl::GlslProg::Format")
    public interface Format extends CxxObject {

        //! Defaults to specifying location 0 for the \c geom::Attrib::POSITION semantic
        @CxxConstructor
        public static Format newFormat() {
            throw new CxxExpectedGeneratedCodeException();
        }

        //! Supplies the GLSL source for the vertex shader
        @CxxMethod
        @CxxByReference
        public Format vertex(@CxxConst @CxxByReference SharedPtr<DataSource> dataSource);

        //! Supplies the GLSL source for the geometry shader
        @CxxMethod
        @CxxByReference
        public Format geometry(@CxxConst @CxxByReference SharedPtr<DataSource> dataSource);

        //! Supplies the GLSL source for the fragment shader
        @CxxMethod
        @CxxByReference
        public Format fragment(@CxxConst @CxxByReference SharedPtr<DataSource> dataSource);


    }

   /* @CxxMethod
    public void uniform( @CxxConst @CxxByReference std.String name, boolean data );

    @CxxMethod
    public void uniform( @CxxConst @CxxByReference std.String name, int data );*/

    @CxxMethod(isConst = true)
    public void uniform(@CxxConst @CxxByReference std.String name, int data);

    default void uniform(String name, int data) {
        std.String stdName = std.String.getString(name);
        try {
            uniform(stdName, data);
        } finally {
            CxxRuntime.delete(stdName);
        }
    }

    @CxxMethod(isConst = true)
    public void uniform(@CxxConst @CxxByReference std.String name, float data);

    default void uniform(String name, float data) {
        std.String stdName = std.String.getString(name);
        try {
            uniform(stdName, data);
        } finally {
            CxxRuntime.delete(stdName);
        }
    }

    @CxxMethod(isConst = true)
    public void uniform(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference IVec2 data);

    default void uniform(String name, IVec2 data) {
        std.String stdName = std.String.getString(name);
        try {
            uniform(stdName, data);
        } finally {
            CxxRuntime.delete(stdName);
            CxxRuntime.delete(data);
        }
    }

    @CxxMethod(isConst = true)
    public void uniform(@CxxConst @CxxByReference std.String name, @CxxConst @CxxByReference Vec2 data);

    default void uniform(String name, Vec2 data) {
        std.String stdName = std.String.getString(name);
        try {
            uniform(stdName, data);
        } finally {
            CxxRuntime.delete(stdName);
            CxxRuntime.delete(data);
        }
    }

    //! Returns a const reference to the Active Uniform cache.
    @CxxMethod(isConst = true)
    @CxxConst
    @CxxByReference
    public std.Vector<Uniform> getActiveUniforms();

    @CxxFunction("cinder::gl::GlslProg::create")
    @CxxByValue
    public static SharedPtr<GlslProg> create(@CxxByValue SharedPtr<DataSource> vertexShader, @CxxByValue SharedPtr<DataSource> fragmentShader) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::gl::GlslProg::create")
    @CxxByValue
    public static SharedPtr<GlslProg> createWithDataSourcePath(@CxxByValue SharedPtr<DataSourcePath> vertexShader, @CxxByValue SharedPtr<DataSourcePath> fragmentShader) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::gl::GlslProg::create")
    @CxxByValue
    public static SharedPtr<GlslProg> create(@CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }
}
