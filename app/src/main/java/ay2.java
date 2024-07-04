package defpackage;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: ay2  reason: default package */
public final class ay2 {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) w82.d.c.a(x92.x)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, final rx2 rx2Var) {
        if (rx2Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.c || Math.abs(timestamp - this.b) >= this.a) {
            this.c = false;
            this.b = timestamp;
            cu5.i.post(new Runnable() { // from class: zx2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    vx2 vx2Var = (vx2) rx2.this;
                    if (vx2Var.W) {
                        if (vx2Var.i0.getParent() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            vx2Var.Q.removeView(vx2Var.i0);
                        }
                    }
                    if (vx2Var.V != null && vx2Var.h0 != null) {
                        jv5 jv5Var = jv5.A;
                        jv5Var.j.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (vx2Var.V.getBitmap(vx2Var.h0) != null) {
                            vx2Var.j0 = true;
                        }
                        jv5Var.j.getClass();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (vz3.m()) {
                            vz3.k("Spinner frame grab took " + elapsedRealtime2 + "ms");
                        }
                        if (elapsedRealtime2 > vx2Var.U) {
                            sv2.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
                            vx2Var.c0 = false;
                            vx2Var.h0 = null;
                            la2 la2Var = vx2Var.S;
                            if (la2Var != null) {
                                la2Var.b("spinner_jank", Long.toString(elapsedRealtime2));
                            }
                        }
                    }
                }
            });
        }
    }
}