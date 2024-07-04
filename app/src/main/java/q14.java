package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;

/* renamed from: q14  reason: default package */
public final class q14 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] V = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler P;
    public final int[] Q = new int[1];
    public EGLDisplay R;
    public EGLContext S;
    public EGLSurface T;
    public SurfaceTexture U;

    public q14(Handler handler) {
        this.P = handler;
    }

    public final void b(int i) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        i34.a("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        i34.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        this.R = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, V, 0, eGLConfigArr, 0, 1, iArr2, 0);
        i34.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.R, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        i34.a("eglCreateContext failed", eglCreateContext != null);
        this.S = eglCreateContext;
        EGLDisplay eGLDisplay = this.R;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            i34.a("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        i34.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.T = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.Q, 0);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (z) {
            throw new l24(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.Q[0]);
        this.U = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.P.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.U;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.Q, 0);
            }
            EGLDisplay eGLDisplay = this.R;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.R;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.T;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.R, this.T);
            }
            EGLContext eGLContext = this.S;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.R, eGLContext);
            }
            int i = zn4.a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.R;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.R);
            }
            this.R = null;
            this.S = null;
            this.T = null;
            this.U = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.R;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.R;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.T;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.R, this.T);
            }
            EGLContext eGLContext2 = this.S;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.R, eGLContext2);
            }
            int i2 = zn4.a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.R;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.R);
            }
            this.R = null;
            this.S = null;
            this.T = null;
            this.U = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.P.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.U;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}