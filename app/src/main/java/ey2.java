package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: ey2  reason: default package */
public final class ey2 extends Thread implements SurfaceTexture.OnFrameAvailableListener, cy2 {
    public static final float[] q0 = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public final dy2 P;
    public final float[] Q;
    public final float[] R;
    public final float[] S;
    public final float[] T;
    public final float[] U;
    public final float[] V;
    public final float[] W;
    public float X;
    public float Y;
    public float Z;
    public int a0;
    public int b0;
    public SurfaceTexture c0;
    public SurfaceTexture d0;
    public int e0;
    public int f0;
    public int g0;
    public final FloatBuffer h0;
    public final CountDownLatch i0;
    public final Object j0;
    public EGL10 k0;
    public EGLDisplay l0;
    public EGLContext m0;
    public EGLSurface n0;
    public volatile boolean o0;
    public volatile boolean p0;

    public ey2(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = q0;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.h0 = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.Q = new float[9];
        this.R = new float[9];
        this.S = new float[9];
        this.T = new float[9];
        this.U = new float[9];
        this.V = new float[9];
        this.W = new float[9];
        this.X = Float.NaN;
        dy2 dy2Var = new dy2(context);
        this.P = dy2Var;
        dy2Var.h = this;
        this.i0 = new CountDownLatch(1);
        this.j0 = new Object();
    }

    public static final void f(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    public static final void g(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[1];
        float f2 = fArr3[3];
        float f3 = fArr2[2];
        float f4 = fArr3[6];
        fArr[0] = (fArr2[0] * fArr3[0]) + (f * f2) + (f3 * f4);
        float f5 = fArr2[0];
        float f6 = fArr3[4];
        float f7 = fArr3[7];
        fArr[1] = (fArr3[1] * f5) + (f * f6) + (f3 * f7);
        float f8 = f5 * fArr3[2];
        float f9 = fArr2[1];
        float f10 = fArr3[5];
        float f11 = fArr3[8];
        fArr[2] = f8 + (f9 * f10) + (f3 * f11);
        float f12 = fArr2[3];
        float f13 = fArr3[0];
        float f14 = fArr2[4];
        float f15 = fArr2[5];
        fArr[3] = (f12 * f13) + (f2 * f14) + (f15 * f4);
        float f16 = fArr2[3];
        float f17 = fArr3[1];
        fArr[4] = (f16 * f17) + (f14 * f6) + (f15 * f7);
        float f18 = fArr3[2];
        fArr[5] = (f16 * f18) + (fArr2[4] * f10) + (f15 * f11);
        float f19 = fArr2[6] * f13;
        float f20 = fArr2[7];
        float f21 = fArr2[8];
        fArr[6] = f19 + (fArr3[3] * f20) + (f4 * f21);
        float f22 = fArr2[6];
        float f23 = f7 * f21;
        fArr[7] = f23 + (f20 * fArr3[4]) + (f17 * f22);
        fArr[8] = (f22 * f18) + (fArr2[7] * fArr3[5]) + (f21 * f11);
    }

    public static final void h(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void i(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int j(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        f("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            f("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            f("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            f("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                f("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void b(int i, int i2) {
        synchronized (this.j0) {
            this.b0 = i;
            this.a0 = i2;
            this.o0 = true;
            this.j0.notifyAll();
        }
    }

    public final void c() {
        synchronized (this.j0) {
            this.p0 = true;
            this.d0 = null;
            this.j0.notifyAll();
        }
    }

    public final void d(float f, float f2) {
        int i = this.b0;
        int i2 = this.a0;
        float f3 = f * 1.7453293f;
        float f4 = f2 * 1.7453293f;
        float f5 = i > i2 ? i : i2;
        this.Y -= f3 / f5;
        float f6 = this.Z - (f4 / f5);
        this.Z = f6;
        if (f6 < -1.5707964f) {
            this.Z = -1.5707964f;
            f6 = -1.5707964f;
        }
        if (f6 > 1.5707964f) {
            this.Z = 1.5707964f;
        }
    }

    public final void e() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.n0;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.k0.eglMakeCurrent(this.l0, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.k0.eglDestroySurface(this.l0, this.n0);
            this.n0 = null;
        }
        EGLContext eGLContext = this.m0;
        if (eGLContext != null) {
            this.k0.eglDestroyContext(this.l0, eGLContext);
            this.m0 = null;
        }
        EGLDisplay eGLDisplay = this.l0;
        if (eGLDisplay != null) {
            this.k0.eglTerminate(eGLDisplay);
            this.l0 = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.g0++;
        synchronized (this.j0) {
            this.j0.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        p92 p92Var;
        w82 w82Var;
        String str;
        int j;
        int i;
        String str2;
        EGLConfig eGLConfig;
        if (this.d0 != null) {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.k0 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.l0 = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.k0.eglInitialize(eglGetDisplay, new int[2])) {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (this.k0.eglChooseConfig(this.l0, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) {
                        eGLConfig = eGLConfigArr[0];
                    } else {
                        eGLConfig = null;
                    }
                    if (eGLConfig != null) {
                        EGLContext eglCreateContext = this.k0.eglCreateContext(this.l0, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                        this.m0 = eglCreateContext;
                        if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                            EGLSurface eglCreateWindowSurface = this.k0.eglCreateWindowSurface(this.l0, eGLConfig, this.d0, null);
                            this.n0 = eglCreateWindowSurface;
                            if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.k0.eglMakeCurrent(this.l0, eglCreateWindowSurface, eglCreateWindowSurface, this.m0)) {
                                z = true;
                                p92Var = x92.U0;
                                w82Var = w82.d;
                                if (((String) w82Var.c.a(p92Var)).equals(p92Var.c)) {
                                    str = (String) w82Var.c.a(p92Var);
                                } else {
                                    str = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
                                }
                                j = j(35633, str);
                                if (j != 0) {
                                    p92 p92Var2 = x92.V0;
                                    if (!((String) w82Var.c.a(p92Var2)).equals(p92Var2.c)) {
                                        str2 = (String) w82Var.c.a(p92Var2);
                                    } else {
                                        str2 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
                                    }
                                    int j2 = j(35632, str2);
                                    if (j2 != 0) {
                                        i = GLES20.glCreateProgram();
                                        f("createProgram");
                                        if (i != 0) {
                                            GLES20.glAttachShader(i, j);
                                            f("attachShader");
                                            GLES20.glAttachShader(i, j2);
                                            f("attachShader");
                                            GLES20.glLinkProgram(i);
                                            f("linkProgram");
                                            int[] iArr2 = new int[1];
                                            GLES20.glGetProgramiv(i, 35714, iArr2, 0);
                                            f("getProgramiv");
                                            if (iArr2[0] != 1) {
                                                Log.e("SphericalVideoRenderer", "Could not link program: ");
                                                Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(i));
                                                GLES20.glDeleteProgram(i);
                                                f("deleteProgram");
                                            } else {
                                                GLES20.glValidateProgram(i);
                                                f("validateProgram");
                                            }
                                        }
                                        this.e0 = i;
                                        GLES20.glUseProgram(i);
                                        f("useProgram");
                                        int glGetAttribLocation = GLES20.glGetAttribLocation(this.e0, "aPosition");
                                        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.h0);
                                        f("vertexAttribPointer");
                                        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                        f("enableVertexAttribArray");
                                        int[] iArr3 = new int[1];
                                        GLES20.glGenTextures(1, iArr3, 0);
                                        f("genTextures");
                                        int i2 = iArr3[0];
                                        GLES20.glBindTexture(36197, i2);
                                        f("bindTextures");
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        f("texParameteri");
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        f("texParameteri");
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        f("texParameteri");
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        f("texParameteri");
                                        int glGetUniformLocation = GLES20.glGetUniformLocation(this.e0, "uVMat");
                                        this.f0 = glGetUniformLocation;
                                        GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                        int i3 = this.e0;
                                        if (!z && i3 != 0) {
                                            SurfaceTexture surfaceTexture = new SurfaceTexture(i2);
                                            this.c0 = surfaceTexture;
                                            surfaceTexture.setOnFrameAvailableListener(this);
                                            this.i0.countDown();
                                            dy2 dy2Var = this.P;
                                            if (dy2Var.g == null) {
                                                Sensor defaultSensor = dy2Var.a.getDefaultSensor(11);
                                                if (defaultSensor == null) {
                                                    sv2.d("No Sensor of TYPE_ROTATION_VECTOR");
                                                } else {
                                                    HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                                                    handlerThread.start();
                                                    br4 br4Var = new br4(handlerThread.getLooper());
                                                    dy2Var.g = br4Var;
                                                    if (!dy2Var.a.registerListener(dy2Var, defaultSensor, 0, br4Var)) {
                                                        sv2.d("SensorManager.registerListener failed.");
                                                        dy2Var.a();
                                                    }
                                                }
                                            }
                                            try {
                                                try {
                                                    this.o0 = true;
                                                    while (!this.p0) {
                                                        while (this.g0 > 0) {
                                                            this.c0.updateTexImage();
                                                            this.g0--;
                                                        }
                                                        if (this.P.b(this.Q)) {
                                                            if (Float.isNaN(this.X)) {
                                                                float[] fArr = this.Q;
                                                                float f = (fArr[2] * 0.0f) + (fArr[1] * 1.0f) + (fArr[0] * 0.0f);
                                                                float f2 = fArr[4] * 1.0f;
                                                                float f3 = fArr[5] * 0.0f;
                                                                float f4 = fArr[6];
                                                                float f5 = fArr[7];
                                                                float f6 = fArr[8];
                                                                this.X = -(((float) Math.atan2(f3 + (f2 + (fArr[3] * 0.0f)), f)) - 1.5707964f);
                                                            }
                                                            i(this.V, this.X + this.Y);
                                                        } else {
                                                            h(this.Q, -1.5707964f);
                                                            i(this.V, this.Y);
                                                        }
                                                        h(this.R, 1.5707964f);
                                                        g(this.S, this.V, this.R);
                                                        g(this.T, this.Q, this.S);
                                                        h(this.U, this.Z);
                                                        g(this.W, this.U, this.T);
                                                        GLES20.glUniformMatrix3fv(this.f0, 1, false, this.W, 0);
                                                        GLES20.glDrawArrays(5, 0, 4);
                                                        f("drawArrays");
                                                        GLES20.glFinish();
                                                        this.k0.eglSwapBuffers(this.l0, this.n0);
                                                        if (this.o0) {
                                                            GLES20.glViewport(0, 0, this.b0, this.a0);
                                                            f("viewport");
                                                            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.e0, "uFOVx");
                                                            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.e0, "uFOVy");
                                                            int i4 = this.b0;
                                                            int i5 = this.a0;
                                                            if (i4 > i5) {
                                                                GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                                GLES20.glUniform1f(glGetUniformLocation3, (this.a0 * 0.87266463f) / this.b0);
                                                            } else {
                                                                GLES20.glUniform1f(glGetUniformLocation2, (i4 * 0.87266463f) / i5);
                                                                GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                            }
                                                            this.o0 = false;
                                                        }
                                                        try {
                                                            synchronized (this.j0) {
                                                                if (!this.p0 && !this.o0 && this.g0 == 0) {
                                                                    this.j0.wait();
                                                                }
                                                            }
                                                        } catch (InterruptedException unused) {
                                                        }
                                                    }
                                                    return;
                                                } finally {
                                                    this.P.a();
                                                    this.c0.setOnFrameAvailableListener(null);
                                                    this.c0 = null;
                                                    e();
                                                }
                                            } catch (IllegalStateException unused2) {
                                                sv2.g("SphericalVideoProcessor halted unexpectedly.");
                                                return;
                                            } catch (Throwable th) {
                                                sv2.e("SphericalVideoProcessor died.", th);
                                                jv5.A.g.f("SphericalVideoProcessor.run.2", th);
                                                return;
                                            }
                                        }
                                        String concat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.k0.eglGetError())));
                                        sv2.d(concat);
                                        jv5.A.g.f("SphericalVideoProcessor.run.1", new Throwable(concat));
                                        e();
                                        this.i0.countDown();
                                        return;
                                    }
                                }
                                i = 0;
                                this.e0 = i;
                                GLES20.glUseProgram(i);
                                f("useProgram");
                                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.e0, "aPosition");
                                GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.h0);
                                f("vertexAttribPointer");
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                                f("enableVertexAttribArray");
                                int[] iArr32 = new int[1];
                                GLES20.glGenTextures(1, iArr32, 0);
                                f("genTextures");
                                int i22 = iArr32[0];
                                GLES20.glBindTexture(36197, i22);
                                f("bindTextures");
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                f("texParameteri");
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                f("texParameteri");
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                f("texParameteri");
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                f("texParameteri");
                                int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.e0, "uVMat");
                                this.f0 = glGetUniformLocation4;
                                GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                int i32 = this.e0;
                                if (!z) {
                                }
                                String concat2 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.k0.eglGetError())));
                                sv2.d(concat2);
                                jv5.A.g.f("SphericalVideoProcessor.run.1", new Throwable(concat2));
                                e();
                                this.i0.countDown();
                                return;
                            }
                        }
                    }
                }
            }
            z = false;
            p92Var = x92.U0;
            w82Var = w82.d;
            if (((String) w82Var.c.a(p92Var)).equals(p92Var.c)) {
            }
            j = j(35633, str);
            if (j != 0) {
            }
            i = 0;
            this.e0 = i;
            GLES20.glUseProgram(i);
            f("useProgram");
            int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.e0, "aPosition");
            GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.h0);
            f("vertexAttribPointer");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
            f("enableVertexAttribArray");
            int[] iArr322 = new int[1];
            GLES20.glGenTextures(1, iArr322, 0);
            f("genTextures");
            int i222 = iArr322[0];
            GLES20.glBindTexture(36197, i222);
            f("bindTextures");
            GLES20.glTexParameteri(36197, 10240, 9729);
            f("texParameteri");
            GLES20.glTexParameteri(36197, 10241, 9729);
            f("texParameteri");
            GLES20.glTexParameteri(36197, 10242, 33071);
            f("texParameteri");
            GLES20.glTexParameteri(36197, 10243, 33071);
            f("texParameteri");
            int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.e0, "uVMat");
            this.f0 = glGetUniformLocation42;
            GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
            int i322 = this.e0;
            if (!z) {
            }
            String concat22 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.k0.eglGetError())));
            sv2.d(concat22);
            jv5.A.g.f("SphericalVideoProcessor.run.1", new Throwable(concat22));
            e();
            this.i0.countDown();
            return;
        }
        sv2.d("SphericalVideoProcessor started with no output texture.");
        this.i0.countDown();
    }
}