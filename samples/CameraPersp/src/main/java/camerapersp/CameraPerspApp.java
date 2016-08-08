package camerapersp;

import boost.filesystem.Path;
import cinder.*;
import cinder.app.KeyEvent;
import cinder.app.MouseEvent;
import cinder.app.Window;
import cinder.geom.*;
import cinder.gl.*;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import glm.detail.IVec2;
import glm.detail.Vec2;
import glm.detail.Vec3;
import sample.utils.CommonApp;
import sample.utils.CommonInterfaceGl;
import sample.utils.CommonLauncher;
import sample.utils.CommonUpdateFn;
import std.SharedPtr;


public class CameraPerspApp extends CommonApp {

    public static final int GL_TRIANGLE_STRIP = 0x0005;
    public static final int GL_LINES = 0x0001;

    private static final int FBO_WIDTH = 1024, FBO_HEIGHT = 768;
    private final SharedPtr<Fbo> mObjectFbo = Fbo.createEmpty();
    private final CameraPersp mObjectCam = CameraPersp.newCameraPersp();
    private final CameraPersp mViewCam = CameraPersp.newCameraPersp();
    private final CameraPersp mViewCamInit = CameraPersp.newCameraPersp();
    private CameraUi mCamUi;
    private final SharedPtr<GlslProg> mObjectGlsl = GlslProg.createEmpty();
    private final SharedPtr<TextureCubeMap> mCubeMap = TextureCubeMap.createEmpty();

    private final std.Vector<SharedPtr<Batch>> mObjects = Batch.newBatchRefVector();
    private long mCurrObject = 0;

    // params for the main camera
    private CommonInterfaceGl mParams;
    private final Vec3 mEyePoint = Vec3.newVec3();
    private final Vec3 mLookAt = Vec3.newVec3();
    private final FloatPtr mFov = PtrFactory.newFloatReference();
    private final FloatPtr mAspectRatio = PtrFactory.newFloatReference();
    private final FloatPtr mNearPlane = PtrFactory.newFloatReference();
    private final FloatPtr mFarPlane = PtrFactory.newFloatReference();
    private final Vec2 mLensShift = Vec2.newVec2();

    private final IntPtr mObjectSelection = PtrFactory.newIntReference();

    private final IVec2 mLastMousePos = IVec2.newIVec2(0);

    private final CommonUpdateFn bindUpdateFn = new CommonUpdateFn(this::setDefaultValues);
    private final CommonUpdateFn paramUpdateFn = new CommonUpdateFn(() -> mCurrObject = mObjectSelection.getValue());

    public CameraPerspApp() {
        final Path path = Path.newPath(CommonLauncher.locateResource(null));
        addAssetDirectory(path);
        CxxRuntime.delete(path);
    }

    public void setup() {
        setWindowSize(1280, 480);

        GL.enableDepthRead();
        GL.enableDepthWrite();
        GL.enableAlphaBlending(true);

        setDefaultValues();

        {
            Fbo.Format format = Fbo.Format.newFormat();
            mObjectFbo.resetSwapAndDelete(Fbo.create(FBO_WIDTH, FBO_HEIGHT, format.depthTexture()));
            CxxRuntime.delete(format);
        }

        try {
            final TextureCubeMap.Format mipmap = TextureCubeMap.Format.newFormat().mipmap(true);
            final SharedPtr<DataSource> dataSource = loadAsset("humus_sf.jpg");
            final SharedPtr<ImageSource> imageSource = ImageIo.loadImage(dataSource);
            mCubeMap.resetSwapAndDelete(TextureCubeMap.create(imageSource, mipmap));
            CxxRuntime.delete(imageSource);
            CxxRuntime.delete(dataSource);
            CxxRuntime.delete(mipmap);
            final SharedPtr<DataSource> vertexShader = loadAsset("objectshader.vert");
            final SharedPtr<DataSource> fragmentShader = loadAsset("objectshader.frag");
            mObjectGlsl.resetSwapAndDelete(GlslProg.create(vertexShader, fragmentShader));
            CxxRuntime.delete(fragmentShader);
            CxxRuntime.delete(vertexShader);
        } catch (Exception e) {
            System.out.println("failed to load shader, what: " + e.getMessage());
            quit();
        }

        {
            final Teapot teapot = Teapot.newTeapot();
            SharedPtr<Batch> teapotBatch = Batch.create(teapot.subdivisions(16), mObjectGlsl);
            teapotBatch.get().getGlslProg().get().uniform("uCubeMapTex", 0);
            mObjects.push_back(teapotBatch);
            CxxRuntime.delete(teapotBatch);
            CxxRuntime.delete(teapot);
        }
        {
            final Torus torus = Torus.newTorus();
            final SharedPtr<Batch> torusBatch = Batch.create(torus.subdivisionsAxis(32), mObjectGlsl);
            mObjects.push_back(torusBatch);
            CxxRuntime.delete(torusBatch);
            CxxRuntime.delete(torus);
        }
        {
            final Cone cone = Cone.newCone();
            final SharedPtr<Batch> coneBatch = Batch.create(cone.subdivisionsAxis(32), mObjectGlsl);
            mObjects.push_back(coneBatch);
            CxxRuntime.delete(coneBatch);
            CxxRuntime.delete(cone);
        }
        {
            final Helix helix = Helix.newHelix();
            final SharedPtr<Batch> helixBatch = Batch.create(helix.subdivisionsAxis(32), mObjectGlsl);
            mObjects.push_back(helixBatch);
            CxxRuntime.delete(helixBatch);
            CxxRuntime.delete(helix);
        }
        {
            final Cylinder cylinder = Cylinder.newCylinder();
            final SharedPtr<Batch> cylinderBatch = Batch.create(cylinder.subdivisionsAxis(32), mObjectGlsl);
            mObjects.push_back(cylinderBatch);
            CxxRuntime.delete(cylinderBatch);
            CxxRuntime.delete(cylinder);
        }

        final SharedPtr<Window> window = getWindow();
        mParams = new CommonInterfaceGl(window, "CameraPersp", 200, 300);
        CxxRuntime.delete(window);

        mObjectSelection.setValue(0);

        final String[] mObjectNames = new String[]{"Teapot", "Torus", "Cone", "Helix", "Cylinder"};

        mParams.addParam("Object", mObjectNames, mObjectSelection)
                .keyDecr("[")
                .keyIncr("]")
                .updateFn(paramUpdateFn.getUpdateFn());
        mParams.addSeparator();
        final FloatPtr mEyePointData = CxxRuntime.castToPtr(mEyePoint).getFloatPtr();
        mParams.addParam("Eye Point X", mEyePointData).step(0.01f);
        mParams.addParam("Eye Point Y", mEyePointData.ofs(1)).step(0.01f);
        mParams.addParam("Eye Point Z", mEyePointData.ofs(2)).step(0.01f);
        mParams.addSeparator();
        final FloatPtr mLookAtData = CxxRuntime.castToPtr(mLookAt).getFloatPtr();
        mParams.addParam("Look At X", mLookAtData).step(0.01f);
        mParams.addParam("Look At Y", mLookAtData.ofs(1)).step(0.01f);
        mParams.addParam("Look At Z", mLookAtData.ofs(2)).step(0.01f);
        mParams.addSeparator();
        mParams.addParam("FOV", mFov).min(1.0f).max(179.0f);
        mParams.addParam("Near Plane", mNearPlane).step(0.02f).min(0.1f);
        mParams.addParam("Far Plane", mFarPlane).step(0.02f).min(0.1f);
        final FloatPtr mLensShiftData = CxxRuntime.castToPtr(mLookAt).getFloatPtr();
        mParams.addParam("Lens Shift X", mLensShiftData).step(0.01f);
        mParams.addParam("Lens Shift Y", mLensShiftData.ofs(1)).step(0.01f);
        mParams.addSeparator();

        mParams.addButton("Reset Defaults", bindUpdateFn.getUpdateFn());

        final Vec3 eyePoint = Vec3.newVec3(0.0f, 0.0f, 10.0f);
        mViewCam.setEyePoint(eyePoint);
        CxxRuntime.delete(eyePoint);
        mViewCam.setPerspective(60, getWindowWidth() * 0.5f / getWindowHeight(), 1, 1000);
        final Vec3 target = Vec3.newVec3(0);
        mViewCam.lookAt(target);
        CxxRuntime.delete(target);
        mViewCamInit.assign(mViewCam);
        mCamUi = CameraUi.newCameraUi(mViewCam);

        mParams.finish();
    }

    public void keyDown(KeyEvent event) {
        if (event.getCode() == KeyEvent.KEY_ESCAPE) quit();
    }

    public void mouseMove(MouseEvent event) {
        mLastMousePos.assign(event.getPos());
    }

    public void draw() {
        {
            final ColorF clearColor = ColorF.newColor(0.2f, 0.2f, 0.2f);
            GL.clear(clearColor);
            CxxRuntime.delete(clearColor);
        }

        final ScopedGlslProg shaderScp;
        {
            final ShaderDef shaderDef = ShaderDef.newShaderDef();
            final SharedPtr<GlslProg> stockShader = GL.getStockShader(shaderDef.color());
            shaderScp = ScopedGlslProg.newScopedGlslProg(stockShader);
            CxxRuntime.delete(shaderDef);
        }

        GL.setMatrices(mViewCam);
        GL.viewport(getWindowWidth() / 2, 0, getWindowWidth() / 2, getWindowHeight());

        final Vec3 wTopLeft = Vec3.newVec3();
        final Vec3 wTopRight = Vec3.newVec3();
        final Vec3 wBottomLeft = Vec3.newVec3();
        final Vec3 wBottomRight = Vec3.newVec3();

        // Draw the far plane rect
        {
            mObjectCam.getFarClipCoordinates(wTopLeft, wTopRight, wBottomLeft, wBottomRight);
            final VertBatch farPlane = VertBatch.newVertBatch(GL_TRIANGLE_STRIP);
            final ColorA farPlaneColor = ColorA.newColor(0.0f, 0.0f, 0.0f, 0.7f);
            farPlane.color(farPlaneColor);
            farPlane.vertex(wTopLeft);
            farPlane.vertex(wBottomLeft);
            farPlane.vertex(wTopRight);
            farPlane.vertex(wBottomRight);
            farPlane.draw();
            CxxRuntime.delete(farPlaneColor);
            CxxRuntime.delete(farPlane);
        }

        // Draw a ray from the camera to the lookAt Point
        {
            final VertBatch ray = VertBatch.newVertBatch(GL_LINES);
            final Color rayColor = Color.newColor(0.0f, 1.0f, 0.0f);
            ray.color(rayColor);
            ray.vertex(mEyePoint);
            ray.vertex(mLookAt);
            ray.draw();
            CxxRuntime.delete(rayColor);
            CxxRuntime.delete(ray);
        }

        // Draw a ray from mouse to the far plane
        final Rectf r;
        {
            final Vec2 sTopLeft = mObjectCam.worldToScreen(wTopLeft, getWindowWidth() / 2, getWindowHeight());
            final Vec2 sBottomRight = mObjectCam.worldToScreen(wBottomRight, getWindowWidth() / 2, getWindowHeight());
            r = Rectf.newRectf(sTopLeft, sBottomRight);
            CxxRuntime.delete(sBottomRight);
            CxxRuntime.delete(sTopLeft);
        }

        if (r.contains(mLastMousePos)) {
            final Ray clickRay;
            {
                final Vec2 posPixels = Vec2.newVec2(mLastMousePos);
                final IVec2 imageSizePixelsI = IVec2.newIVec2(getWindowWidth() / 2, getWindowHeight());
                final Vec2 imageSizePixels = Vec2.newVec2(imageSizePixelsI);
                clickRay = mObjectCam.generateRay(posPixels, imageSizePixels);
                CxxRuntime.delete(imageSizePixels);
                CxxRuntime.delete(imageSizePixelsI);
                CxxRuntime.delete(posPixels);
            }

            final VertBatch rayLine = VertBatch.newVertBatch(GL_LINES);
            final ColorF rayLineColor = ColorF.newColor(0.8f, 0.0f, 0.0f);
            rayLine.color(rayLineColor);
            rayLine.vertex(mEyePoint);
            final Vec3 mul = Vec3.mul(clickRay.getDirection(), mObjectCam.getFarClip());
            final Vec3 add = Vec3.add(mEyePoint, mul);
            CxxRuntime.delete(mul);
            rayLine.vertex(add);
            CxxRuntime.delete(add);
            rayLine.draw();

            CxxRuntime.delete(clickRay);
            CxxRuntime.delete(rayLine);
            CxxRuntime.delete(rayLineColor);
        }
        CxxRuntime.delete(r);

        // Draw camera frustrum
        {
            ColorA frustrumColor = ColorA.newColor(0.8f, 0.8f, 0.8f, 0.5f);
            GL.color(frustrumColor);
            CxxRuntime.delete(frustrumColor);
        }
        GL.drawFrustum(mObjectCam);

        // Draw the object in the scene
        mObjectFbo.get().bindTexture();
        {
            Color sceneColor = Color.newColor(1.0f, 1.0f, 1.0f);
            GL.color(sceneColor);
            CxxRuntime.delete(sceneColor);
        }
        mObjects.get(mCurrObject).get().draw();

        // Draw the near plane with projection
        final ScopedGlslProg shaderScp2;
        {
            final ShaderDef shaderDef = ShaderDef.newShaderDef();
            final SharedPtr<GlslProg> stockShader = GL.getStockShader(shaderDef.texture().color());
            shaderScp2 = ScopedGlslProg.newScopedGlslProg(stockShader);
            CxxRuntime.delete(shaderDef);
        }
        mObjectCam.getNearClipCoordinates(wTopLeft, wTopRight, wBottomLeft, wBottomRight);
        mObjectFbo.get().bindTexture();

        {
            final VertBatch nearPlane = VertBatch.newVertBatch(GL_TRIANGLE_STRIP);
            final ColorA nearPlaneColor = ColorA.newColor(1.0f, 1.0f, 1.0f, 0.7f);
            nearPlane.color(nearPlaneColor);
            nearPlane.texCoord(0.0f, 1.0f);
            nearPlane.vertex(wTopLeft);
            nearPlane.texCoord(0.0f, 0.0f);
            nearPlane.vertex(wBottomLeft);
            nearPlane.texCoord(1.0f, 1.0f);
            nearPlane.vertex(wTopRight);
            nearPlane.texCoord(1.0f, 0.0f);
            nearPlane.vertex(wBottomRight);
            nearPlane.draw();
            CxxRuntime.delete(nearPlaneColor);
            CxxRuntime.delete(nearPlane);
        }

        // Draw the fbo in screen space on the left
        final ScopedGlslProg shaderScp4;
        {
            final ShaderDef shaderDef = ShaderDef.newShaderDef();
            final SharedPtr<GlslProg> stockShader = GL.getStockShader(shaderDef.texture());
            shaderScp4 = ScopedGlslProg.newScopedGlslProg(stockShader);
            CxxRuntime.delete(shaderDef);
        }
        GL.viewport(0, 0, getWindowWidth(), getWindowHeight());
        GL.setMatricesWindow(getWindowWidth(), getWindowHeight());
        {
            final Rectf rectf = Rectf.newRectf(0.0f, 0.0f, 640, 480);
            GL.drawSolidRect(rectf);
            CxxRuntime.delete(rectf);
        }

        mObjectFbo.get().unbindTexture();

        // Draw Params
        mParams.draw();

        CxxRuntime.delete(shaderScp4);

        CxxRuntime.delete(shaderScp2);

        CxxRuntime.delete(wTopLeft);
        CxxRuntime.delete(wTopRight);
        CxxRuntime.delete(wBottomLeft);
        CxxRuntime.delete(wBottomRight);

        CxxRuntime.delete(shaderScp);
    }

    public void mouseDown(MouseEvent event) {
        mCamUi.mouseDown(event);
    }

    public void mouseDrag(MouseEvent event) {
        Rectf r = Rectf.newRectf(getWindowWidth() / 2, 0, getWindowWidth(), getWindowHeight());
        if (r.contains(event.getPos())) {
            mCamUi.mouseDrag(event);
        }
        CxxRuntime.delete(r);
    }

    public void update() {
        renderObjectToFbo();
    }

    public void setDefaultValues() {
        mCurrObject = 0;
        mObjectSelection.setValue(0);
        mEyePoint.assign(-2.2f, -1.6f, 7.0f);
        mLookAt.assign(0.0f, 0.0f, 0.0f);
        mFov.setValue(25.0f);
        mAspectRatio.setValue(getWindowAspectRatio());
        mNearPlane.setValue(3.5f);
        mFarPlane.setValue(15.0f);
        mLensShift.assign(0.0f, 0.0f);
        mViewCam.assign(mViewCamInit);
    }

    public void renderObjectToFbo() {
        ScopedFramebuffer fbScp = ScopedFramebuffer.newScopedFramebuffer(mObjectFbo);
        {
            ColorF clearColor = ColorF.newColor(0.0f, 0.0f, 0.0f);
            GL.clear(clearColor);
            CxxRuntime.delete(clearColor);
        }
        final IVec2 dimension = mObjectFbo.get().getSize();
        final IVec2 lowerLeftPosition = IVec2.newIVec2(0);
        ScopedViewport scpVp = ScopedViewport.newScopedViewport(lowerLeftPosition, dimension);
        CxxRuntime.delete(lowerLeftPosition);
        CxxRuntime.delete(dimension);

        mObjectCam.setEyePoint(mEyePoint);
        mObjectCam.setPerspective(mFov.getValue(), mObjectFbo.get().getAspectRatio(), mNearPlane.getValue(), mFarPlane.getValue());
        mObjectCam.setLensShift(mLensShift);
        mObjectCam.lookAt(mLookAt);
        GL.setMatrices(mObjectCam);

        ScopedGlslProg shader = ScopedGlslProg.newScopedGlslProg(mObjectGlsl);
        {
            Color white = Color.white();
            GL.color(white);
            CxxRuntime.delete(white);
        }

        mCubeMap.get().bind();
        mObjects.get(mCurrObject).get().draw();

        CxxRuntime.delete(shader);
        CxxRuntime.delete(scpVp);
        CxxRuntime.delete(fbScp);
    }
}
