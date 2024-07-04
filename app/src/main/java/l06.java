package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: l06  reason: default package */
public final class l06 extends Surface {
    public static int S;
    public static boolean T;
    public final boolean P;
    public final k06 Q;
    public boolean R;

    public /* synthetic */ l06(k06 k06Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.Q = k06Var;
        this.P = z;
    }

    public static l06 a(Context context, boolean z) {
        boolean z2 = false;
        tv2.I(!z || c(context));
        k06 k06Var = new k06();
        int i = z ? S : 0;
        k06Var.start();
        Handler handler = new Handler(k06Var.getLooper(), k06Var);
        k06Var.Q = handler;
        k06Var.P = new q14(handler);
        synchronized (k06Var) {
            k06Var.Q.obtainMessage(1, i, 0).sendToTarget();
            while (k06Var.T == null && k06Var.S == null && k06Var.R == null) {
                try {
                    k06Var.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = k06Var.S;
        if (runtimeException == null) {
            Error error = k06Var.R;
            if (error == null) {
                l06 l06Var = k06Var.T;
                l06Var.getClass();
                return l06Var;
            }
            throw error;
        }
        throw runtimeException;
    }

    public static synchronized boolean c(Context context) {
        int i;
        String eglQueryString;
        synchronized (l06.class) {
            if (!T) {
                int i2 = zn4.a;
                int i3 = 2;
                if (i2 >= 24 && ((i2 >= 26 || (!"samsung".equals(zn4.c) && !"XT1650".equals(zn4.d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i3 = 1;
                    }
                    S = i3;
                    T = true;
                }
                i3 = 0;
                S = i3;
                T = true;
            }
            i = S;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.Q) {
            try {
                if (!this.R) {
                    Handler handler = this.Q.Q;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.R = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}