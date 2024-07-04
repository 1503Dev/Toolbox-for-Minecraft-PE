package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: k06  reason: default package */
public final class k06 extends HandlerThread implements Handler.Callback {
    public q14 P;
    public Handler Q;
    public Error R;
    public RuntimeException S;
    public l06 T;

    public k06() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    q14 q14Var = this.P;
                    q14Var.getClass();
                    q14Var.c();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i2 = message.arg1;
                q14 q14Var2 = this.P;
                q14Var2.getClass();
                q14Var2.b(i2);
                SurfaceTexture surfaceTexture = this.P.U;
                surfaceTexture.getClass();
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.T = new l06(this, surfaceTexture, z);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                lb4.b("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.R = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                lb4.b("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.S = e2;
                synchronized (this) {
                    notify();
                }
            } catch (l24 e3) {
                lb4.b("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.S = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}