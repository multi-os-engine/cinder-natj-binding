package glm;

import org.moe.natj.cxx.ann.*;
import glm.detail.Vec2;
import glm.detail.Vec3;
import glm.detail.Vec4;

@CxxHeader(value = {"glm/detail/func_geometric.hpp"}, useQuotes = false)
public class Geometric {

    @CxxFunction("glm::length")
    public static native float length(@CxxConst @CxxByReference Vec2 x);

    @CxxFunction("glm::length")
    public static native float length(@CxxConst @CxxByReference Vec3 x);

    @CxxFunction("glm::length")
    public static native float length(@CxxConst @CxxByReference Vec4 x);

    @CxxFunction("glm::normalize")
    @CxxByValue
    public static native Vec2 normalize(@CxxByValue Vec2 c);

    @CxxFunction("glm::normalize")
    @CxxByValue
    public static native Vec3 normalize(@CxxByValue Vec3 c);

    @CxxFunction("glm::normalize")
    @CxxByValue
    public static native Vec2 normalize(@CxxByValue Vec4 c);

    @CxxFunction("glm::distance")
    public static native float distance(@CxxConst @CxxByReference Vec2 p0, @CxxConst @CxxByReference Vec2 p1);

    @CxxFunction("glm::distance")
    public static native float distance(@CxxConst @CxxByReference Vec3 p0, @CxxConst @CxxByReference Vec3 p1);

    @CxxFunction("glm::distance")
    public static native float distance(@CxxConst @CxxByReference Vec4 p0, @CxxConst @CxxByReference Vec4 p1);

    @CxxFunction("glm::dot")
    public static native float dot(float x, float y);

    @CxxFunction("glm::dot")
    public static native float dot(@CxxConst @CxxByReference Vec2 p0, @CxxConst @CxxByReference Vec2 p1);

    @CxxFunction("glm::dot")
    public static native float dot(@CxxConst @CxxByReference Vec3 p0, @CxxConst @CxxByReference Vec3 p1);

    @CxxFunction("glm::dot")
    public static native float dot(@CxxConst @CxxByReference Vec4 p0, @CxxConst @CxxByReference Vec4 p1);

    @CxxFunction("glm::faceforward")
    @CxxByValue
    public static native Vec2 faceforward(@CxxConst @CxxByReference Vec2 N, @CxxConst @CxxByReference Vec2 I, @CxxConst @CxxByReference Vec2 Nref);

    @CxxFunction("glm::faceforward")
    @CxxByValue
    public static native Vec3 faceforward(@CxxConst @CxxByReference Vec3 N, @CxxConst @CxxByReference Vec3 I, @CxxConst @CxxByReference Vec3 Nref);

    @CxxFunction("glm::faceforward")
    @CxxByValue
    public static native Vec4 faceforward(@CxxConst @CxxByReference Vec4 N, @CxxConst @CxxByReference Vec4 I, @CxxConst @CxxByReference Vec4 Nref);

    @CxxFunction("glm::reflect")
    @CxxByValue
    public static native Vec2 reflect(@CxxConst @CxxByReference Vec2 I, @CxxConst @CxxByReference Vec2 N);

    @CxxFunction("glm::reflect")
    @CxxByValue
    public static native Vec3 reflect(@CxxConst @CxxByReference Vec3 I, @CxxConst @CxxByReference Vec3 N);

    @CxxFunction("glm::reflect")
    @CxxByValue
    public static native Vec4 reflect(@CxxConst @CxxByReference Vec4 I, @CxxConst @CxxByReference Vec4 N);

    @CxxFunction("glm::refract")
    @CxxByValue
    public static native Vec2 refract(@CxxConst @CxxByReference Vec2 I, @CxxConst @CxxByReference Vec2 N, float eta);

    @CxxFunction("glm::refract")
    @CxxByValue
    public static native Vec3 refract(@CxxConst @CxxByReference Vec3 I, @CxxConst @CxxByReference Vec3 N, float eta);

    @CxxFunction("glm::refract")
    @CxxByValue
    public static native Vec4 refract(@CxxConst @CxxByReference Vec4 I, @CxxConst @CxxByReference Vec4 N, float eta);
}
