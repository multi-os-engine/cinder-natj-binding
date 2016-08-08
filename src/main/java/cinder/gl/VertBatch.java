package cinder.gl;

import cinder.Color;
import cinder.ColorA;
import cinder.ColorF;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import glm.detail.Vec2;
import glm.detail.Vec3;
import glm.detail.Vec4;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/Batch.h"}, useQuotes = false)
@CxxClass("cinder::gl::VertBatch")
public interface VertBatch extends CxxObject {

    //! Constructs a VertBatch with primitive type \a primType. Default is \c GL_POINTS. If \a useContextDefaultBuffers is \c true, uses default buffers for the context, saving allocations; suitable for single draw.
    @CxxConstructor
    public static VertBatch newVertBatch(@CxxUnsigned int primType, boolean useContextDefaultBuffers) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static VertBatch newVertBatch(@CxxUnsigned int primType) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static VertBatch newVertBatch() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    static SharedPtr<VertBatch> createEmpty() {
        throw new CxxExpectedGeneratedCodeException();
    }


    //! Creates a VertBatchRef with primitive type \a primType. Default is \c GL_POINTS. If \a useContextDefaultBuffers is \c false, allocates and uses internal buffers and VAO; suitable for multiple draws.
    @CxxFunction("cinder::gl::VertBatch::create")
    @CxxByValue
    public static SharedPtr<VertBatch> create() {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Creates a VertBatchRef with primitive type \a primType. Default is \c GL_POINTS. If \a useContextDefaultBuffers is \c false, allocates and uses internal buffers and VAO; suitable for multiple draws.
    @CxxFunction("cinder::gl::VertBatch::create")
    @CxxByValue
    public static SharedPtr<VertBatch> create(@CxxUnsigned int primType, boolean useContextDefaultBuffers) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::gl::VertBatch::create")
    @CxxByValue
    public static SharedPtr<VertBatch> create(@CxxUnsigned int primType) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Sets the primitive type of the VertBatch. Default is \c GL_POINTS.
    @CxxMethod
    public void setType(@CxxUnsigned int type);

    //! Returns the primitive type of the VertBatch. Default is \c GL_POINTS.
    @CxxMethod(isConst = true)
    @CxxUnsigned
    public int getType();

    //! Sets the color for the current vertex (attribute geom::COLOR)
    @CxxMethod
    public void color(float r, float g, float b, float a);

    @CxxMethod
    public void color(float r, float g, float b);

    //! Sets the color for the current vertex (attribute geom::COLOR)
    @CxxMethod
    public void color(@CxxConst @CxxByReference ColorF color);

    //! Sets the color for the current vertex (attribute geom::COLOR)
    @CxxMethod
    public void color(@CxxConst @CxxByReference ColorA color);

    //! Sets the color for the current vertex (attribute geom::COLOR)
    @CxxMethod
    public void color(@CxxConst @CxxByReference Color color);

    //! Sets the normal for the current vertex (attribute geom::NORMAL)
    @CxxMethod
    public void normal(float x, float y, float z);

    //! Sets the normal for the current vertex (attribute geom::NORMAL)
    @CxxMethod
    public void normal(@CxxConst @CxxByReference Vec3 n);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord(float s, float t, float r, float q);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord(float s, float t, float r);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord(float s, float t);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord(@CxxConst @CxxByReference Vec2 t);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord(@CxxConst @CxxByReference Vec3 t);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord(@CxxConst @CxxByReference Vec4 t);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord0(float s, float t, float r, float q);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord0(@CxxConst @CxxByReference Vec2 t);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord0(@CxxConst @CxxByReference Vec3 t);

    //! Sets the texCoord0 for the current vertex (attribute geom::TEX_COORD_0)
    @CxxMethod
    public void texCoord0(@CxxConst @CxxByReference Vec4 t);

    //! Sets the texCoord1 for the current vertex (attribute geom::TEX_COORD_1)
    @CxxMethod
    public void texCoord1(float s, float t, float r, float q);

    //! Sets the texCoord1 for the current vertex (attribute geom::TEX_COORD_1)
    @CxxMethod
    public void texCoord1(@CxxConst @CxxByReference Vec2 t);

    //! Sets the texCoord1 for the current vertex (attribute geom::TEX_COORD_1)
    @CxxMethod
    public void texCoord1(@CxxConst @CxxByReference Vec3 t);

    //! Sets the texCoord1 for the current vertex (attribute geom::TEX_COORD_1)
    @CxxMethod
    public void texCoord1(@CxxConst @CxxByReference Vec4 t);

    //! Locks the values for the current vertex and sets its position (attribute geom::POSITION). Call after any corresponding calls to color(), normal() and/or texCoord().
    @CxxMethod
    public void vertex(float x, float y, float z);

    //! Locks the values for the current vertex and sets its position (attribute geom::POSITION). Call after any corresponding calls to color(), normal() and/or texCoord().
    @CxxMethod
    public void vertex(float x, float y, float z, float w);

    //! Locks the values for the current vertex and sets its position (attribute geom::POSITION). Call after any corresponding calls to color(), normal() and/or texCoord().
    @CxxMethod
    public void vertex(float x, float y);

    //! Locks the values for the current vertex and sets its position (attribute geom::POSITION). Call after any corresponding calls to color(), normal() and/or texCoord().
    @CxxMethod
    public void vertex(@CxxConst @CxxByReference Vec2 v);

    //! Locks the values for the current vertex and sets its position (attribute geom::POSITION). Call after any corresponding calls to color(), normal() and/or texCoord().
    @CxxMethod
    public void vertex(@CxxConst @CxxByReference Vec3 v);

    //! Locks the values for the current vertex and sets its position (attribute geom::POSITION). Call after any corresponding calls to color(), normal() and/or texCoord().
    @CxxMethod
    public void vertex(@CxxConst @CxxByReference Vec4 v);

    //! Locks the values for the current vertex and sets its position (attribute geom::POSITION) and color (geom::COLOR). Call after any corresponding calls to color(), normal() and/or texCoord(). Should not be called if you have called color() prior.
    @CxxMethod
    public void vertex(@CxxConst @CxxByReference Vec4 v, @CxxConst @CxxByReference ColorA c);


    //! Resets the sequence of vertices and sets the VertBatch's primitive type.
    @CxxMethod
    public void begin(@CxxUnsigned int type);

    //! No-op. Present for parity with legacy immediate mode.
    @CxxMethod
    public void end();

    //! Clears all vertices recorded by the VertBatch
    @CxxMethod
    public void clear();

    //! Returns \c true if no vertices have been added to the VertBatch.
    @CxxMethod(isConst = true)
    public boolean empty();

    //! Draws the VertBatch using the gl::Context's currently active shader. For multiple draws consider constructing a gl::Batch using the VertBatch instead.
    @CxxMethod
    public void draw();
}
