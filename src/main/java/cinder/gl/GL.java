package cinder.gl;

import cinder.*;
import org.moe.natj.cxx.ann.*;
import glm.Quat;
import glm.detail.Mat4;
import glm.detail.Vec2;
import std.SharedPtr;

@CxxHeader(value = {"cinder/gl/wrapper.h", "cinder/gl/draw.h"}, useQuotes = false)
public class GL {

    @CxxFunction("cinder::gl::clear")
    public static native void clear();

    @CxxFunction("cinder::gl::clear")
    public static native void clear(@CxxConst @CxxByReference ColorA colorA);

    @CxxFunction("cinder::gl::clear")
    public static native void clear(@CxxConst @CxxByReference ColorF colorF);

    @CxxFunction("cinder::gl::enableDepthWrite")
    public static native void enableDepthWrite();

    @CxxFunction("cinder::gl::enableDepthRead")
    public static native void enableDepthRead();

    @CxxFunction("cinder::gl::setMatrices")
    public static native void setMatrices(@CxxConst @CxxByReference Camera cam);

    @CxxFunction("cinder::gl::multModelMatrix")
    public static native void multModelMatrix(@CxxConst @CxxByReference Mat4 mtx);

    @CxxFunction("cinder::gl::color")
    public static native void color(float r, float g, float b);

    @CxxFunction("cinder::gl::color")
    public static native void color(@CxxConst @CxxByReference Color c);

    @CxxFunction("cinder::gl::color")
    public static native void color(@CxxConst @CxxByReference ColorA c);

    @CxxFunction("cinder::gl::color")
    public static native void color(float r, float g, float b, float a);

    @CxxFunction("cinder::gl::begin")
    public static native void begin(int mode);

    @CxxFunction("cinder::gl::end")
    public static native void end();

    @CxxFunction("cinder::gl::vertex")
    public static native void vertex(@CxxConst @CxxByReference Vec2 v);

    @CxxFunction("cinder::gl::getError")
    @CxxUnsigned
    public static native int getError();

    @CxxFunction("cinder::gl::getErrorString")
    @CxxByValue
    public static native std.String getErrorString(int err);

    //! Enables blending via \c GL_BLEND and sets the blend function to unpremultiplied alpha blending when \p enable is \c true; otherwise disables blending without modifying the blend function.
    @CxxFunction("cinder::gl::enableAlphaBlending")
    public static native void enableAlphaBlending(boolean enable);

    //! Translates the Model matrix by \a v
    @CxxFunction("cinder::gl::translate")
    public static native void translate(@CxxConst @CxxByReference Vec2 v);

    @CxxFunction("cinder::gl::getStockShader")
    @CxxByReference
    public static native SharedPtr<GlslProg> getStockShader(@CxxConst @CxxByReference ShaderDef shader);

    @CxxFunction("cinder::gl::rotate")
    public static native void rotate(@CxxConst @CxxByReference Quat quat);

    //! Rotates the Model matrix by \a angleRadians around the axis (\a x,\a y,\a z)
    @CxxFunction("cinder::gl::rotate")
    public static native void rotate(float angleRadians, float xAxis, float yAxis, float zAxis);

    @CxxFunction("cinder::gl::viewport")
    public static native void viewport(int x, int y, int width, int height);

    @CxxFunction("cinder::gl::setMatricesWindow")
    public static native void setMatricesWindow(int screenWidth, int screenHeight, boolean originUpperLeft);

    @CxxFunction("cinder::gl::setMatricesWindow")
    public static native void setMatricesWindow(int screenWidth, int screenHeight);

    //! Renders a stroked representation of \a cam
    @CxxFunction("cinder::gl::drawFrustum")
    public static native void drawFrustum(@CxxConst @CxxByReference Camera cam);

    //! Draws \a texture on the XY-plane
    @CxxFunction("cinder::gl::drawSolidRect")
    public static native void drawSolidRect(@CxxConst @CxxByReference Rectf r, @CxxConst @CxxByReference Vec2 upperLeftTexCoord, @CxxConst @CxxByReference Vec2 lowerRightTexCoord);

    @CxxFunction("cinder::gl::drawSolidRect")
    public static native void drawSolidRect(@CxxConst @CxxByReference Rectf r, @CxxConst @CxxByReference Vec2 upperLeftTexCoord);

    @CxxFunction("cinder::gl::drawSolidRect")
    public static native void drawSolidRect(@CxxConst @CxxByReference Rectf r);

    @CxxFunction("cinder::gl::enableVerticalSync")
    public static native void enableVerticalSync(boolean enable);

    @CxxFunction("cinder::gl::isVerticalSyncEnabled")
    public static native boolean isVerticalSyncEnabled();

    //! Specifies whether front or back-facing polygons are culled (as specified by \a face) when polygon culling is enabled. Valid values are \c GL_BACK and \c GL_FRONT.
    @CxxFunction("cinder::gl::cullFace")
    public static native void cullFace(int face);

    //! Disables writing to depth buffer; analogous to calling glDepthMask( GL_FALSE );
    @CxxFunction("cinder::gl::disableDepthWrite")
    public static native void disableDepthWrite();

    @CxxFunction("cinder::gl::context")
    public static native Context newContext();

    @CxxFunction("cinder::gl::drawCoordinateFrame")
    public static native void drawCoordinateFrame(float axisLength, float headLength, float headRadius);

    @CxxFunction("cinder::gl::drawCoordinateFrame")
    public static native void drawCoordinateFrame(float axisLength, float headLength);

    @CxxFunction("cinder::gl::drawCoordinateFrame")
    public static native void drawCoordinateFrame(float axisLength);

    @CxxFunction("cinder::gl::drawCoordinateFrame")
    public static native void drawCoordinateFrame();

    //! Disables reading / testing from the depth buffer. Disables \c GL_DEPTH_TEST
    @CxxFunction("cinder::gl::disableDepthRead")
    public static native void disableDepthRead();

    //! Specifies whether polygons are culled. Equivalent to calling enable( \c GL_CULL_FACE, \a enable ). Specify front or back faces with gl::cullFace().
    @CxxFunction("cinder::gl::enableFaceCulling")
    public static native void enableFaceCulling(boolean enable);

}
