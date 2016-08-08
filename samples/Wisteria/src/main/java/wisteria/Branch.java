package wisteria;

import cairo.Context;
import cinder.Area;
import cinder.ColorA;
import cinder.ColorModel;
import cinder.Rand;
import org.moe.natj.cxx.CxxRuntime;
import glm.detail.Vec2;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private static final int MAX_BRANCHES = 50;
    private static final int INITIAL_SPAWN = 20;

    private static int sWindowWidth, sWindowHeight;

    private boolean mIsRoot;
    private int mLifespan, mTotalLifespan;
    private final Vec2 mOrigin = Vec2.newVec2();
    private final Vec2 mPos = Vec2.newVec2();
    private float mSpeed;
    private int mLaunchDelay;
    private float mAngle, mAngleDelta;
    private float mChangeProb, mFlowerProb;
    private float mStartEllipseRadius, mEndEllipseRadius;
    private final ColorA mStartColor = ColorA.newColorA();
    private final ColorA mEndColor = ColorA.newColorA();
    private final ColorA mFlowerColor = ColorA.newColorA();
    private float mScale;
    private List<Branch> mBranches;

    protected void finalize() throws Throwable {
        CxxRuntime.delete(mOrigin);
        CxxRuntime.delete(mPos);
        CxxRuntime.delete(mStartColor);
        CxxRuntime.delete(mEndColor);
        CxxRuntime.delete(mFlowerColor);
    }

    public Branch(Vec2 aOrigin, float flowerHue, int launchDelay) {
        mOrigin.assign(aOrigin);

        mBranches = new ArrayList<Branch>();
        mIsRoot = true;
        float baseHue = 0.33333f;

        float sat = 0.5f + Rand.randFloat(0.5f);
        float brightness = 1.0f;
        float opacity = 0.8f + Rand.randFloat(0.2f);
        mLaunchDelay = 0;
        ColorA flowerColor = ColorA.newColorA(ColorModel.CM_HSV.ordinal(), flowerHue, sat, brightness, opacity);
        for (int i = 0; i < INITIAL_SPAWN; i++) {
            createBranch(mOrigin, baseHue, flowerColor, launchDelay);
        }
        CxxRuntime.delete(flowerColor);
    }

    public Branch(Vec2 aOrigin, int aLifespan, float aSpeed, int aLaunchDelay, float aAngle, float aAngleDelta, float aChangeProb, float aFlowerProb,
                  float aStartEllipseRadius, float aEndEllipseRadius, ColorA aStartColor, ColorA aEndColor, ColorA aFlowerColor, float aScale) {
        mOrigin.assign(aOrigin);
        mPos.assign(aOrigin);
        mBranches = new ArrayList<Branch>();
        mIsRoot = false;
        mLifespan = (int) (aLifespan * aScale);
        mTotalLifespan = (int) (aLifespan * aScale);
        mAngle = aAngle;
        mSpeed = aSpeed;
        mLaunchDelay = aLaunchDelay;
        if (Rand.randBool()) {
            mAngleDelta = aAngleDelta;
        } else {
            mAngleDelta = -aAngleDelta;
        }
        mChangeProb = aChangeProb;
        mFlowerProb = aFlowerProb;
        mStartEllipseRadius = aStartEllipseRadius * aScale;
        mEndEllipseRadius = aEndEllipseRadius * aScale;

        mStartColor.assign(aStartColor);
        mEndColor.assign(aEndColor);
        mFlowerColor.assign(aFlowerColor);

        mScale = aScale;
    }

    private Branch(Branch toCopy) {
        this.mIsRoot = toCopy.mIsRoot;
        this.mLifespan = toCopy.mLifespan;
        this.mTotalLifespan = toCopy.mTotalLifespan;
        this.mOrigin.assign(toCopy.mOrigin);
        this.mPos.assign(toCopy.mPos);
        this.mSpeed = toCopy.mSpeed;
        this.mLaunchDelay = toCopy.mLaunchDelay;
        this.mAngle = toCopy.mAngle;
        this.mAngleDelta = toCopy.mAngleDelta;
        this.mChangeProb = toCopy.mChangeProb;
        this.mFlowerProb = toCopy.mFlowerProb;
        this.mStartEllipseRadius = toCopy.mStartEllipseRadius;
        this.mEndEllipseRadius = toCopy.mEndEllipseRadius;
        this.mStartColor.assign(toCopy.mStartColor);
        this.mEndColor.assign(toCopy.mEndColor);
        this.mFlowerColor.assign(toCopy.mFlowerColor);
        this.mScale = toCopy.mScale;
        this.mBranches = new ArrayList<>(toCopy.mBranches);
    }

    private static final ColorA BLACK = ColorA.newColor(0, 0, 0, 1.0f);

    public void update() {
        if (mLaunchDelay-- > 0) {
            return;
        }
        if ((mLifespan > 0) && (!mIsRoot)) {
            Vec2 lhs = Vec2.newVec2((float) Math.cos(mAngle), (float) Math.sin(mAngle));
            Vec2 mul = Vec2.mul(lhs, (mSpeed * 2.0f * mScale));
            CxxRuntime.delete(lhs);
            mPos.addAssign(mul);
            CxxRuntime.delete(mul);
            Area area = Area.newArea(0, 0, sWindowWidth, sWindowHeight);
            if (!area.contains(mPos)) {
                mLifespan = 0;
            }
            CxxRuntime.delete(area);
            mAngle += mAngleDelta;
            mLifespan--;
            if (Rand.randFloat() < mChangeProb) {
                mAngleDelta = -mAngleDelta;
            }

            float ageLerp = 1.0f - mLifespan / (float) mTotalLifespan;
            if (Rand.randFloat() < mFlowerProb * (1.0 - ageLerp)) {
                if (mBranches.size() < MAX_BRANCHES) {
                    Branch newBranch = new Branch(this);
                    newBranch.mBranches.clear();
                    ColorA lerp = cinder.Math.lerp(mFlowerColor, BLACK, 0.5f);
                    newBranch.mStartColor.assign(lerp);
                    CxxRuntime.delete(lerp);
                    newBranch.mEndColor.assign(mFlowerColor);
                    newBranch.mFlowerProb = -1.0f;
                    newBranch.mLifespan = (int) (30 * mScale);
                    newBranch.mTotalLifespan = newBranch.mLifespan;
                    newBranch.mLaunchDelay = Rand.randInt(40, 70);
                    newBranch.mStartEllipseRadius = newBranch.mEndEllipseRadius;
                    newBranch.mEndEllipseRadius = 15.0f * mScale;
                    newBranch.mAngleDelta *= 1.2f;
                    newBranch.mAngle += 0.1f;
                    mBranches.add(newBranch);
                }
            }
        }
        for (Branch b : mBranches) {
            b.update();
        }
    }

    public void draw(Context ctx) {
        if (mLaunchDelay > 0) {
            return;
        }
        if ((mLifespan > 0) && (!mIsRoot)) {
            float ageLerp = 1.0f - mLifespan / (float) mTotalLifespan;
            float radius = cinder.Math.lerp(mStartEllipseRadius, mEndEllipseRadius, ageLerp);
            ColorA drawColor = cinder.Math.lerp(mStartColor, mEndColor, ageLerp);
            ctx.setSourceRgba(drawColor.r(), drawColor.g(), drawColor.b(), 0.075f);
            ctx.circle(mPos, (5.0f * mScale + radius * 1.3f) / 2);
            ctx.fill();
            ctx.setSource(drawColor);
            CxxRuntime.delete(drawColor);
            ctx.circle(mPos, radius / 2);
            ctx.fill();
        }
        for (Branch b : mBranches) {
            b.draw(ctx);
        }
    }

    public boolean isAlive() {
        if ((!mIsRoot) && (mLifespan > 0)) {
            return true;
        } else {
            for (Branch b : mBranches) {
                if (b.isAlive()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void createBranch(Vec2 origin, float baseHue, ColorA flowerColor, int launchDelay) {
        float changeProb = 0.05f + Rand.randFloat(0.05f);
        float flowerProb = 0.05f + Rand.randFloat(0.21f);
        float startRadius = 5 + Rand.randFloat(5);
        float endRadius = Rand.randFloat(1);
        int lifespan = 100 + Rand.randInt(100);
        float speed = Rand.randFloat(0.9f, 1.0f);
        float angleDelta = Rand.randFloat(0.02f, 0.15f);
        float hue = baseHue + Rand.randFloat(0.1f);
        float sat = 0.5f + Rand.randFloat(0.5f);
        float brightness = 1.0f;
        float opacity = 0.5f + Rand.randFloat(0.5f);
        ColorA startColor = ColorA.newColorA(ColorModel.CM_HSV.ordinal(), hue, sat, brightness, opacity);
        ColorA endColor = ColorA.newColorA(ColorModel.CM_HSV.ordinal(), hue + 0.1f, sat, brightness / 2.0f, opacity);
        float scale = Rand.randFloat(0.5f, 1.0f);
        mBranches.add(new Branch(origin, lifespan, speed, launchDelay, Rand.randFloat(6.28f), angleDelta,
                changeProb, flowerProb, startRadius, endRadius, startColor, endColor, flowerColor, scale));
        CxxRuntime.delete(startColor);
        CxxRuntime.delete(endColor);
    }

    public static float randomHue() {
        if (Rand.randFloat(0.6666666666f) > 0.5f) {// in [ 0, 60 ]
            return Rand.randFloat(0 / 360.0f, 60.0f / 360.0f);
        }
        return Rand.randFloat(190.0f / 360.0f, 360.0f / 360.0f);
    }

    public static void setWindowSize_static(int aWindowWidth, int aWindowHeight) {
        sWindowWidth = aWindowWidth;
        sWindowHeight = aWindowHeight;
    }

}
