package glm;

import org.moe.natj.cxx.ann.*;
import glm.detail.*;

@CxxHeader(value = {"glm/detail/func_common.hpp"}, useQuotes = false)
public class Glm {

    /// @addtogroup core_func_common
    /// @{

    /// Returns x if x >= 0; otherwise, it returns -x.
    ///
    /// @tparam genType floating-point or signed integer; scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/abs.xml">GLSL abs man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::abs")
    public static native int abs(int x);

    @CxxFunction("glm::abs")
    public static native float abs(float x);

    @CxxFunction("glm::abs")
    public static native double abs(double x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native Vec2 abs(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native Vec3 abs(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native Vec4 abs(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native IVec2 abs(@CxxConst @CxxByReference IVec2 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native IVec3 abs(@CxxConst @CxxByReference IVec3 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native IVec4 abs(@CxxConst @CxxByReference IVec4 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native DVec2 abs(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native DVec3 abs(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::abs")
    @CxxByValue
    public static native DVec4 abs(@CxxConst @CxxByReference DVec4 x);

    /// Returns 1.0 if x > 0, 0.0 if x == 0, or -1.0 if x < 0.
    ///
    /// @tparam genType Floating-point or signed integer; scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/sign.xml">GLSL sign man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::sign")
    public static native int sign(int x);

    @CxxFunction("glm::sign")
    public static native float sign(float x);

    @CxxFunction("glm::sign")
    public static native double sign(double x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native Vec2 sign(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native Vec3 sign(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native Vec4 sign(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native IVec2 sign(@CxxConst @CxxByReference IVec2 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native IVec3 sign(@CxxConst @CxxByReference IVec3 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native IVec4 sign(@CxxConst @CxxByReference IVec4 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native DVec2 sign(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native DVec3 sign(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::sign")
    @CxxByValue
    public static native DVec4 sign(@CxxConst @CxxByReference DVec4 x);

    /// Returns a value equal to the nearest integer that is less then or equal to x.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floor.xml">GLSL floor man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::floor")
    public static native float floor(float x);

    @CxxFunction("glm::floor")
    public static native double floor(double x);

    @CxxFunction("glm::floor")
    @CxxByValue
    public static native Vec2 floor(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::floor")
    @CxxByValue
    public static native Vec3 floor(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::floor")
    @CxxByValue
    public static native Vec4 floor(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::floor")
    @CxxByValue
    public static native DVec2 floor(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::floor")
    @CxxByValue
    public static native DVec3 floor(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::floor")
    @CxxByValue
    public static native DVec4 floor(@CxxConst @CxxByReference DVec4 x);

    /// Returns a value equal to the nearest integer to x
    /// whose absolute value is not larger than the absolute value of x.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/trunc.xml">GLSL trunc man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::trunc")
    public static native float trunc(float x);

    @CxxFunction("glm::trunc")
    @CxxByValue
    public static native Vec2 trunc(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::trunc")
    @CxxByValue
    public static native Vec3 trunc(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::trunc")
    @CxxByValue
    public static native Vec4 trunc(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::trunc")
    public static native double trunc(double x);

    @CxxFunction("glm::trunc")
    @CxxByValue
    public static native DVec2 trunc(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::trunc")
    @CxxByValue
    public static native DVec3 trunc(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::trunc")
    @CxxByValue
    public static native DVec4 trunc(@CxxConst @CxxByReference DVec4 x);

    /// Returns a value equal to the nearest integer to x.
    /// The fraction 0.5 will round in a direction chosen by the
    /// implementation, presumably the direction that is fastest.
    /// This includes the possibility that round(x) returns the
    /// same value as roundEven(x) for all values of x.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/round.xml">GLSL round man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::round")
    public static native float round(float x);

    @CxxFunction("glm::round")
    @CxxByValue
    public static native Vec2 round(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::round")
    @CxxByValue
    public static native Vec3 round(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::round")
    @CxxByValue
    public static native Vec4 round(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::round")
    public static native double round(double x);

    @CxxFunction("glm::round")
    @CxxByValue
    public static native DVec2 round(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::round")
    @CxxByValue
    public static native DVec3 round(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::round")
    @CxxByValue
    public static native DVec4 round(@CxxConst @CxxByReference DVec4 x);

    /// Returns a value equal to the nearest integer to x.
    /// A fractional part of 0.5 will round toward the nearest even
    /// integer. (Both 3.5 and 4.5 for x will return 4.0.)
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/roundEven.xml">GLSL roundEven man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    /// @see <a href="http://developer.amd.com/documentation/articles/pages/New-Round-to-Even-Technique.aspx">New round to even technique</a>
    @CxxFunction("glm::roundEven")
    public static native float roundEven(float x);

    @CxxFunction("glm::roundEven")
    @CxxByValue
    public static native Vec2 roundEven(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::roundEven")
    @CxxByValue
    public static native Vec3 roundEven(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::roundEven")
    @CxxByValue
    public static native Vec4 roundEven(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::roundEven")
    public static native double roundEven(double x);

    @CxxFunction("glm::roundEven")
    @CxxByValue
    public static native DVec2 roundEven(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::roundEven")
    @CxxByValue
    public static native DVec3 roundEven(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::roundEven")
    @CxxByValue
    public static native DVec4 roundEven(@CxxConst @CxxByReference DVec4 x);

    /// Returns a value equal to the nearest integer
    /// that is greater than or equal to x.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/ceil.xml">GLSL ceil man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::ceil")
    public static native float ceil(float x);

    @CxxFunction("glm::ceil")
    @CxxByValue
    public static native Vec2 ceil(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::ceil")
    @CxxByValue
    public static native Vec3 ceil(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::ceil")
    @CxxByValue
    public static native Vec4 ceil(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::ceil")
    public static native double ceil(double x);

    @CxxFunction("glm::ceil")
    @CxxByValue
    public static native DVec2 ceil(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::ceil")
    @CxxByValue
    public static native DVec3 ceil(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::ceil")
    @CxxByValue
    public static native DVec4 ceil(@CxxConst @CxxByReference DVec4 x);

    /// Return x - floor(x).
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/fract.xml">GLSL fract man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::fract")
    public static native float fract(float x);

    @CxxFunction("glm::fract")
    @CxxByValue
    public static native Vec2 fract(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::fract")
    @CxxByValue
    public static native Vec3 fract(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::fract")
    @CxxByValue
    public static native Vec4 fract(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::fract")
    public static native double fract(double x);

    @CxxFunction("glm::fract")
    @CxxByValue
    public static native DVec2 fract(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::fract")
    @CxxByValue
    public static native DVec3 fract(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::fract")
    @CxxByValue
    public static native DVec4 fract(@CxxConst @CxxByReference DVec4 x);

    /// Modulus. Returns x - y * floor(x / y)
    /// for each component in x using the floating point value y.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mod.xml">GLSL mod man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::mod")
    public static native float mod(float x, float y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native Vec2 mod(@CxxConst @CxxByReference Vec2 x, float y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native Vec3 mod(@CxxConst @CxxByReference Vec3 x, float y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native Vec4 mod(@CxxConst @CxxByReference Vec4 x, float y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native Vec2 mod(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native Vec3 mod(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native Vec4 mod(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 y);

    @CxxFunction("glm::mod")
    public static native double mod(double x, double y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native DVec2 mod(@CxxConst @CxxByReference DVec2 x, double y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native DVec3 mod(@CxxConst @CxxByReference DVec3 x, double y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native DVec4 mod(@CxxConst @CxxByReference DVec4 x, double y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native DVec2 mod(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native DVec3 mod(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 y);

    @CxxFunction("glm::mod")
    @CxxByValue
    public static native DVec4 mod(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 y);

    /// Returns the fractional part of x and sets i to the integer
    /// part (as a whole number floating point value). Both the
    /// return value and the output parameter will have the same
    /// sign as x.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/modf.xml">GLSL modf man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::modf")
    public static native float modf(float x, float y);

    @CxxFunction("glm::modf")
    public static native double modf(double x, double y);

    /// Returns y if y < x; otherwise, it returns x.
    ///
    /// @tparam genType Floating-point or integer; scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/min.xml">GLSL min man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::min")
    public static native float min(float x, float y);

    @CxxFunction("glm::min")
    public static native int min(int x, int y);

    @CxxFunction("glm::min")
    public static native double min(double x, double y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native Vec2 min(@CxxConst @CxxByReference Vec2 x, float y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native Vec3 min(@CxxConst @CxxByReference Vec3 x, float y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native Vec4 min(@CxxConst @CxxByReference Vec4 x, float y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native IVec2 min(@CxxConst @CxxByReference IVec2 x, int y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native IVec3 min(@CxxConst @CxxByReference IVec3 x, int y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native IVec4 min(@CxxConst @CxxByReference IVec4 x, int y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native DVec2 min(@CxxConst @CxxByReference DVec2 x, double y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native DVec3 min(@CxxConst @CxxByReference DVec3 x, double y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native DVec3 min(@CxxConst @CxxByReference DVec4 x, double y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native Vec2 min(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native Vec3 min(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native Vec4 min(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native IVec2 min(@CxxConst @CxxByReference IVec2 x, @CxxConst @CxxByReference IVec2 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native IVec3 min(@CxxConst @CxxByReference IVec3 x, @CxxConst @CxxByReference IVec3 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native IVec4 min(@CxxConst @CxxByReference IVec4 x, @CxxConst @CxxByReference IVec4 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native DVec2 min(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native DVec3 min(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 y);

    @CxxFunction("glm::min")
    @CxxByValue
    public static native DVec4 min(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 y);

    /// Returns y if x < y; otherwise, it returns x.
    ///
    /// @tparam genType Floating-point or integer; scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/max.xml">GLSL max man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::max")
    public static native float max(float x, float y);

    @CxxFunction("glm::max")
    public static native int max(int x, int y);

    @CxxFunction("glm::max")
    public static native double max(double x, double y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native Vec2 max(@CxxConst @CxxByReference Vec2 x, float y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native Vec3 max(@CxxConst @CxxByReference Vec3 x, float y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native Vec4 max(@CxxConst @CxxByReference Vec4 x, float y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native IVec2 max(@CxxConst @CxxByReference IVec2 x, int y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native IVec3 max(@CxxConst @CxxByReference IVec3 x, int y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native IVec4 max(@CxxConst @CxxByReference IVec4 x, int y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native DVec2 max(@CxxConst @CxxByReference DVec2 x, double y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native DVec3 max(@CxxConst @CxxByReference DVec3 x, double y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native DVec3 max(@CxxConst @CxxByReference DVec4 x, double y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native Vec2 max(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native Vec3 max(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native Vec4 max(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native IVec2 max(@CxxConst @CxxByReference IVec2 x, @CxxConst @CxxByReference IVec2 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native IVec3 max(@CxxConst @CxxByReference IVec3 x, @CxxConst @CxxByReference IVec3 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native IVec4 max(@CxxConst @CxxByReference IVec4 x, @CxxConst @CxxByReference IVec4 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native DVec2 max(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native DVec3 max(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 y);

    @CxxFunction("glm::max")
    @CxxByValue
    public static native DVec4 max(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 y);

    /// Returns min(max(x, minVal), maxVal) for each component in x
    /// using the floating-point values minVal and maxVal.
    ///
    /// @tparam genType Floating-point or integer; scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/clamp.xml">GLSL clamp man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::clamp")
    public static native float clamp(float x, float minVal, float maxVal);

    @CxxFunction("glm::clamp")
    public static native int clamp(int x, int minVal, int maxVal);

    @CxxFunction("glm::clamp")
    public static native double clamp(double x, double minVal, double maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native Vec2 clamp(@CxxConst @CxxByReference Vec2 x, float minVal, float maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native Vec3 clamp(@CxxConst @CxxByReference Vec3 x, float minVal, float maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native Vec4 clamp(@CxxConst @CxxByReference Vec4 x, float minVal, float maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native IVec2 clamp(@CxxConst @CxxByReference IVec2 x, int minVal, int maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native IVec3 clamp(@CxxConst @CxxByReference IVec3 x, int minVal, int maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native IVec4 clamp(@CxxConst @CxxByReference IVec4 x, int minVal, int maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native DVec2 clamp(@CxxConst @CxxByReference DVec2 x, double minVal, double maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native DVec3 clamp(@CxxConst @CxxByReference DVec3 x, double minVal, double maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native DVec3 clamp(@CxxConst @CxxByReference DVec4 x, double minVal, double maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native Vec2 clamp(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 minVal, @CxxConst @CxxByReference Vec2 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native Vec3 clamp(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 minVal, @CxxConst @CxxByReference Vec3 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native Vec4 clamp(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 minVal, @CxxConst @CxxByReference Vec4 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native IVec2 clamp(@CxxConst @CxxByReference IVec2 x, @CxxConst @CxxByReference IVec2 minVal, @CxxConst @CxxByReference IVec2 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native IVec3 clamp(@CxxConst @CxxByReference IVec3 x, @CxxConst @CxxByReference IVec3 minVal, @CxxConst @CxxByReference IVec3 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native IVec4 clamp(@CxxConst @CxxByReference IVec4 x, @CxxConst @CxxByReference IVec4 minVal, @CxxConst @CxxByReference IVec4 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native DVec2 clamp(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 minVal, @CxxConst @CxxByReference DVec2 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native DVec3 clamp(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 minVal, @CxxConst @CxxByReference DVec3 maxVal);

    @CxxFunction("glm::clamp")
    @CxxByValue
    public static native DVec3 clamp(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 minVal, @CxxConst @CxxByReference DVec4 maxVal);

    /// If genTypeU is a floating scalar or vector:
    /// Returns x * (1.0 - a) + y * a, i.e., the linear blend of
    /// x and y using the floating-point value a.
    /// The value for a is not restricted to the range [0, 1].
    ///
    /// If genTypeU is a boolean scalar or vector:
    /// Selects which vector each returned component comes
    /// from. For a component of <a> that is false, the
    /// corresponding component of x is returned. For a
    /// component of a that is true, the corresponding
    /// component of y is returned. Components of x and y that
    /// are not selected are allowed to be invalid floating point
    /// values and will have no effect on the results. Thus, this
    /// provides different functionality than
    /// genType mix(genType x, genType y, genType(a))
    /// where a is a Boolean vector.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/mix.xml">GLSL mix man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    ///
    /// @param[in]  x Value to interpolate.
    /// @param[in]  y Value to interpolate.
    /// @param[in]  a Interpolant.
    ///
    /// @tparam	genTypeT Floating point scalar or vector.
    /// @tparam genTypeU Floating point or boolean scalar or vector. It can't be a vector if it is the length of genTypeT.
    ///
    /// @code
    /// #include <glm/glm.hpp>
    /// ...
    /// float a;
    /// bool b;
    /// glm::dvec3 e;
    /// glm::dvec3 f;
    /// glm::vec4 g;
    /// glm::vec4 h;
    /// ...
    /// glm::vec4 r = glm::mix(g, h, a); // Interpolate with a floating-point scalar two vectors.
    /// glm::vec4 s = glm::mix(g, h, b); // Teturns g or h;
    /// glm::dvec3 t = glm::mix(e, f, a); // Types of the third parameter is not required to match with the first and the second.
    /// glm::vec4 u = glm::mix(g, h, r); // Interpolations can be perform per component with a vector for the last parameter.
    /// @endcode
    @CxxFunction("glm::mix")
    public static native float mix(float x, float y, float a);

    @CxxFunction("glm::mix")
    public static native double mix(double x, double y, double a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 y, float a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec3 mix(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 y, float a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec4 mix(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 y, float a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec2 mix(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 y, float a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec3 mix(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 y, float a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec4 mix(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 y, float a);

    @CxxFunction("glm::mix")
    public static native float mix(float x, float y, boolean a);

    @CxxFunction("glm::mix")
    public static native double mix(double x, double y, boolean a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 y, boolean a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec3 mix(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 y, boolean a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec4 mix(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 y, boolean a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec2 mix(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 y, boolean a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec3 mix(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 y, boolean a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec4 mix(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 y, boolean a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec2 mix(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 y, @CxxConst @CxxByReference Vec2 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec2 mix(@CxxConst @CxxByReference DVec2 x, @CxxConst @CxxByReference DVec2 y, @CxxConst @CxxByReference DVec2 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec3 mix(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 y, @CxxConst @CxxByReference Vec3 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec3 mix(@CxxConst @CxxByReference DVec3 x, @CxxConst @CxxByReference DVec3 y, @CxxConst @CxxByReference DVec3 a);


    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec4 mix(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 y, @CxxConst @CxxByReference Vec4 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native DVec4 mix(@CxxConst @CxxByReference DVec4 x, @CxxConst @CxxByReference DVec4 y, @CxxConst @CxxByReference DVec4 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 y, @CxxConst @CxxByReference Vec2 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec2 x, @CxxConst @CxxByReference Vec2 y, @CxxConst @CxxByReference DVec2 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 y, @CxxConst @CxxByReference Vec3 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec3 x, @CxxConst @CxxByReference Vec3 y, @CxxConst @CxxByReference DVec3 a);


    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 y, @CxxConst @CxxByReference Vec4 a);

    @CxxFunction("glm::mix")
    @CxxByValue
    public static native Vec2 mix(@CxxConst @CxxByReference Vec4 x, @CxxConst @CxxByReference Vec4 y, @CxxConst @CxxByReference DVec4 a);

    /// Returns 0.0 if x < edge, otherwise it returns 1.0 for each component of a genType.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/step.xml">GLSL step man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    /*@CxxFunction("glm::step")
    public static native float step(float edge, float y);

    @CxxFunction("glm::step")
    public static native double step(double edge, double y);*/

    /// Returns 0.0 if x < edge, otherwise it returns 1.0.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/step.xml">GLSL step man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::step")
    @CxxByValue
    public static native Vec2 step(float edge, @CxxConst @CxxByReference Vec2 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native Vec3 step(float edge, @CxxConst @CxxByReference Vec3 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native Vec4 step(float edge, @CxxConst @CxxByReference Vec4 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native DVec2 step(double edge, @CxxConst @CxxByReference DVec2 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native DVec3 step(double edge, @CxxConst @CxxByReference DVec3 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native DVec4 step(double edge, @CxxConst @CxxByReference DVec4 y);


    /// Returns 0.0 if x < edge, otherwise it returns 1.0.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/step.xml">GLSL step man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::step")
    @CxxByValue
    public static native Vec2 step(@CxxConst @CxxByReference Vec2 edge, @CxxConst @CxxByReference Vec2 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native Vec3 step(@CxxConst @CxxByReference Vec3 edge, @CxxConst @CxxByReference Vec3 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native Vec4 step(@CxxConst @CxxByReference Vec4 edge, @CxxConst @CxxByReference Vec4 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native DVec2 step(@CxxConst @CxxByReference DVec2 edge, @CxxConst @CxxByReference DVec2 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native DVec3 step(@CxxConst @CxxByReference DVec3 edge, @CxxConst @CxxByReference DVec3 y);

    @CxxFunction("glm::step")
    @CxxByValue
    public static native DVec4 step(@CxxConst @CxxByReference DVec4 edge, @CxxConst @CxxByReference DVec4 y);

    /// Returns 0.0 if x <= edge0 and 1.0 if x >= edge1 and
    /// performs smooth Hermite interpolation between 0 and 1
    /// when edge0 < x < edge1. This is useful in cases where
    /// you would want a threshold function with a smooth
    /// transition. This is equivalent to:
    /// genType t;
    /// t = clamp ((x - edge0) / (edge1 - edge0), 0, 1);
    /// return t * t * (3 - 2 * t);
    /// Results are undefined if edge0 >= edge1.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/smoothstep.xml">GLSL smoothstep man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::smoothstep")
    public static native float smoothstep(float edge0, float edge1, float x);

    @CxxFunction("glm::smoothstep")
    public static native double smoothstep(double edge0, double edge1, double x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native Vec2 smoothstep(float edge0, float edge1, @CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native Vec3 smoothstep(float edge0, float edge1, @CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native Vec4 smoothstep(float edge0, float edge1, @CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native DVec2 smoothstep(double edge0, double edge1, @CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native DVec3 smoothstep(double edge0, double edge1, @CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native DVec4 smoothstep(double edge0, double edge1, @CxxConst @CxxByReference DVec4 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native Vec2 smoothstep(@CxxConst @CxxByReference Vec2 edge0, @CxxConst @CxxByReference Vec2 edge1, @CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native Vec3 smoothstep(@CxxConst @CxxByReference Vec3 edge0, @CxxConst @CxxByReference Vec3 edge1, @CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native Vec4 smoothstep(@CxxConst @CxxByReference Vec4 edge0, @CxxConst @CxxByReference Vec4 edge1, @CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native DVec2 smoothstep(@CxxConst @CxxByReference DVec2 edge0, @CxxConst @CxxByReference DVec2 edge1, @CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native DVec3 smoothstep(@CxxConst @CxxByReference DVec3 edge0, @CxxConst @CxxByReference DVec3 edge1, @CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::smoothstep")
    @CxxByValue
    public static native DVec4 smoothstep(@CxxConst @CxxByReference DVec4 edge0, @CxxConst @CxxByReference DVec4 edge1, @CxxConst @CxxByReference DVec4 x);

    /// Returns true if x holds a NaN (not a number)
    /// representation in the underlying implementation's set of
    /// floating point representations. Returns false otherwise,
    /// including for implementations with no NaN
    /// representations.
    ///
    /// /!\ When using compiler fast math, this function may fail.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isnan.xml">GLSL isnan man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::isnan")
    @CxxByValue
    public static native BVec2 isnan(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::isnan")
    @CxxByValue
    public static native BVec3 isnan(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::isnan")
    @CxxByValue
    public static native BVec4 isnan(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::isnan")
    @CxxByValue
    public static native BVec2 isnan(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::isnan")
    @CxxByValue
    public static native BVec3 isnan(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::isnan")
    @CxxByValue
    public static native BVec4 isnan(@CxxConst @CxxByReference DVec4 x);

    /// Returns true if x holds a positive infinity or negative
    /// infinity representation in the underlying implementation's
    /// set of floating point representations. Returns false
    /// otherwise, including for implementations with no infinity
    /// representations.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/isinf.xml">GLSL isinf man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::isinf")
    @CxxByValue
    public static native BVec2 isinf(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::isinf")
    @CxxByValue
    public static native BVec3 isinf(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::isinf")
    @CxxByValue
    public static native BVec4 isinf(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::isinf")
    @CxxByValue
    public static native BVec2 isinf(@CxxConst @CxxByReference DVec2 x);

    @CxxFunction("glm::isinf")
    @CxxByValue
    public static native BVec3 isinf(@CxxConst @CxxByReference DVec3 x);

    @CxxFunction("glm::isinf")
    @CxxByValue
    public static native BVec4 isinf(@CxxConst @CxxByReference DVec4 x);

    /// Returns a signed integer value representing
    /// the encoding of a floating-point value. The floating-point
    /// value's bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToInt.xml">GLSL floatBitsToInt man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::floatBitsToInt")
    public static native int floatBitsToInt(float v);

    /// Returns a signed integer value representing
    /// the encoding of a floating-point value. The floatingpoint
    /// value's bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToInt.xml">GLSL floatBitsToInt man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::floatBitsToInt")
    @CxxByValue
    public static native IVec2 floatBitsToInt(@CxxConst @CxxByReference Vec2 v);

    @CxxFunction("glm::floatBitsToInt")
    @CxxByValue
    public static native IVec3 floatBitsToInt(@CxxConst @CxxByReference Vec3 v);

    @CxxFunction("glm::floatBitsToInt")
    @CxxByValue
    public static native IVec4 floatBitsToInt(@CxxConst @CxxByReference Vec4 v);

    /// Returns a unsigned integer value representing
    /// the encoding of a floating-point value. The floatingpoint
    /// value's bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToUint.xml">GLSL floatBitsToUint man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::floatBitsToUint")
    @CxxUnsigned
    public static native int floatBitsToUint(float v);

    /// Returns a unsigned integer value representing
    /// the encoding of a floating-point value. The floatingpoint
    /// value's bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/floatBitsToUint.xml">GLSL floatBitsToUint man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::floatBitsToUint")
    @CxxByValue
    public static native UIVec2 floatBitsToUint(@CxxConst @CxxByReference Vec2 v);

    @CxxFunction("glm::floatBitsToUint")
    @CxxByValue
    public static native UIVec3 floatBitsToUint(@CxxConst @CxxByReference Vec3 v);

    @CxxFunction("glm::floatBitsToUint")
    @CxxByValue
    public static native UIVec4 floatBitsToUint(@CxxConst @CxxByReference Vec4 v);

    /// Returns a floating-point value corresponding to a signed
    /// integer encoding of a floating-point value.
    /// If an inf or NaN is passed in, it will not signal, and the
    /// resulting floating point value is unspecified. Otherwise,
    /// the bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/intBitsToFloat.xml">GLSL intBitsToFloat man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::intBitsToFloat")
    public static native float intBitsToFloat(int v);

    /// Returns a floating-point value corresponding to a signed
    /// integer encoding of a floating-point value.
    /// If an inf or NaN is passed in, it will not signal, and the
    /// resulting floating point value is unspecified. Otherwise,
    /// the bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/intBitsToFloat.xml">GLSL intBitsToFloat man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::intBitsToFloat")
    @CxxByValue
    public static native Vec2 intBitsToFloat(@CxxConst @CxxByReference IVec2 v);

    @CxxFunction("glm::intBitsToFloat")
    @CxxByValue
    public static native Vec3 intBitsToFloat(@CxxConst @CxxByReference IVec3 v);

    @CxxFunction("glm::intBitsToFloat")
    @CxxByValue
    public static native Vec4 intBitsToFloat(@CxxConst @CxxByReference IVec4 v);

    /// Returns a floating-point value corresponding to a
    /// unsigned integer encoding of a floating-point value.
    /// If an inf or NaN is passed in, it will not signal, and the
    /// resulting floating point value is unspecified. Otherwise,
    /// the bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/uintBitsToFloat.xml">GLSL uintBitsToFloat man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::uintBitsToFloat")
    public static native float uintBitsToFloat(@CxxUnsigned int v);

    /// Returns a floating-point value corresponding to a
    /// unsigned integer encoding of a floating-point value.
    /// If an inf or NaN is passed in, it will not signal, and the
    /// resulting floating point value is unspecified. Otherwise,
    /// the bit-level representation is preserved.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/uintBitsToFloat.xml">GLSL uintBitsToFloat man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::uintBitsToFloat")
    @CxxByValue
    public static native Vec2 uintBitsToFloat(@CxxConst @CxxByReference UIVec2 v);

    @CxxFunction("glm::uintBitsToFloat")
    @CxxByValue
    public static native Vec3 uintBitsToFloat(@CxxConst @CxxByReference UIVec3 v);

    @CxxFunction("glm::uintBitsToFloat")
    @CxxByValue
    public static native Vec4 uintBitsToFloat(@CxxConst @CxxByReference UIVec4 v);

    /// Computes and returns a * b + c.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/fma.xml">GLSL fma man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    @CxxFunction("glm::fma")
    public static native int fma(int a, int b, int c);

    @CxxFunction("glm::fma")
    @CxxUnsigned
    public static native int fmaUI(@CxxUnsigned int a, @CxxUnsigned int b, @CxxUnsigned int c);

    @CxxFunction("glm::fma")
    public static native double fma(double a, double b, double c);

    @CxxFunction("glm::fma")
    public static native float fma(float a, float b, float c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native UIVec2 fma(@CxxConst @CxxByReference UIVec2 a, @CxxConst @CxxByReference UIVec2 b, @CxxConst @CxxByReference UIVec2 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native UIVec3 fma(@CxxConst @CxxByReference UIVec3 a, @CxxConst @CxxByReference UIVec3 b, @CxxConst @CxxByReference UIVec3 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native UIVec4 fma(@CxxConst @CxxByReference UIVec4 a, @CxxConst @CxxByReference UIVec4 b, @CxxConst @CxxByReference UIVec4 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native Vec2 fma(@CxxConst @CxxByReference Vec2 a, @CxxConst @CxxByReference Vec2 b, @CxxConst @CxxByReference Vec2 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native Vec3 fma(@CxxConst @CxxByReference Vec3 a, @CxxConst @CxxByReference Vec3 b, @CxxConst @CxxByReference Vec3 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native Vec4 fma(@CxxConst @CxxByReference Vec4 a, @CxxConst @CxxByReference Vec4 b, @CxxConst @CxxByReference Vec4 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native DVec2 fma(@CxxConst @CxxByReference DVec2 a, @CxxConst @CxxByReference DVec2 b, @CxxConst @CxxByReference DVec2 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native DVec3 fma(@CxxConst @CxxByReference DVec3 a, @CxxConst @CxxByReference DVec3 b, @CxxConst @CxxByReference DVec3 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native DVec4 fma(@CxxConst @CxxByReference DVec4 a, @CxxConst @CxxByReference DVec4 b, @CxxConst @CxxByReference DVec4 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native IVec2 fma(@CxxConst @CxxByReference IVec2 a, @CxxConst @CxxByReference IVec2 b, @CxxConst @CxxByReference IVec2 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native IVec3 fma(@CxxConst @CxxByReference IVec3 a, @CxxConst @CxxByReference IVec3 b, @CxxConst @CxxByReference IVec3 c);

    @CxxFunction("glm::fma")
    @CxxByValue
    public static native IVec4 fma(@CxxConst @CxxByReference IVec4 a, @CxxConst @CxxByReference IVec4 b, @CxxConst @CxxByReference IVec4 c);

    /// Splits x into a floating-point significand in the range
    /// [0.5, 1.0) and an integral exponent of two, such that:
    /// x = significand * exp(2, exponent)
    ///
    /// The significand is returned by the function and the
    /// exponent is returned in the parameter exp. For a
    /// floating-point value of zero, the significant and exponent
    /// are both zero. For a floating-point value that is an
    /// infinity or is not a number, the results are undefined.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/frexp.xml">GLSL frexp man page</a>
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    /*@CxxFunction("glm::frexp")
    public static native float frexp(float x, int exp);

    @CxxFunction("glm::frexp")
    public static native double frexp(double x, double exp);

    @CxxFunction("glm::frexp")
    @CxxByValue
    public static native Vec2 frexp(@CxxConst @CxxByReference Vec2 x, @CxxByReference Vec2 exp);

    @CxxFunction("glm::frexp")
    @CxxByValue
    public static native Vec3 frexp(@CxxConst @CxxByReference Vec3 x, @CxxByReference Vec3 exp);

    @CxxFunction("glm::frexp")
    @CxxByValue
    public static native Vec4 frexp(@CxxConst @CxxByReference Vec4 x, @CxxByReference Vec4 exp);

    @CxxFunction("glm::frexp")
    @CxxByValue
    public static native DVec2 frexp(@CxxConst @CxxByReference DVec2 x, @CxxByReference DVec2 exp);

    @CxxFunction("glm::frexp")
    @CxxByValue
    public static native DVec3 frexp(@CxxConst @CxxByReference DVec3 x, @CxxByReference DVec3 exp);

    @CxxFunction("glm::frexp")
    @CxxByValue
    public static native DVec4 frexp(@CxxConst @CxxByReference DVec4 x, @CxxByReference DVec4 exp);*/

    /// Builds a floating-point number from x and the
    /// corresponding integral exponent of two in exp, returning:
    /// significand * exp(2, exponent)
    ///
    /// If this product is too large to be represented in the
    /// floating-point type, the result is undefined.
    ///
    /// @tparam genType Floating-point scalar or vector types.
    ///
    /// @see <a href="http://www.opengl.org/sdk/docs/manglsl/xhtml/ldexp.xml">GLSL ldexp man page</a>;
    /// @see <a href="http://www.opengl.org/registry/doc/GLSLangSpec.4.20.8.pdf">GLSL 4.20.8 specification, section 8.3 Common Functions</a>
    /*template <typename genType, typename genIType>
    GLM_FUNC_DECL genType ldexp(genType const & x, genIType const & exp);*/
}
