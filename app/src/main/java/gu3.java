package defpackage;

import android.os.SystemClock;

/* renamed from: gu3  reason: default package */
public abstract class gu3 implements Runnable {
    public final long P;
    public final long Q;
    public final boolean R;
    public final /* synthetic */ h34 S;

    public gu3(h34 h34Var, boolean z) {
        this.S = h34Var;
        h34Var.b.getClass();
        this.P = System.currentTimeMillis();
        h34Var.b.getClass();
        this.Q = SystemClock.elapsedRealtime();
        this.R = z;
    }

    public abstract void b();

    public void c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.S.f) {
            c();
            return;
        }
        try {
            b();
        } catch (Exception e) {
            this.S.a(e, false, this.R);
            c();
        }
    }
}