package defpackage;

import android.os.SystemClock;

/* renamed from: do5  reason: default package */
public final class do5 implements tm5 {
    public boolean P;
    public long Q;
    public long R;
    public y13 S = y13.d;

    public do5(dx3 dx3Var) {
    }

    @Override // defpackage.tm5
    public final long a() {
        long j = this.Q;
        if (this.P) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.R;
            y13 y13Var = this.S;
            return j + (y13Var.a == 1.0f ? zn4.q(elapsedRealtime) : elapsedRealtime * y13Var.c);
        }
        return j;
    }

    @Override // defpackage.tm5
    public final void b(y13 y13Var) {
        if (this.P) {
            c(a());
        }
        this.S = y13Var;
    }

    public final void c(long j) {
        this.Q = j;
        if (this.P) {
            this.R = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.tm5
    public final y13 d() {
        return this.S;
    }

    public final void e() {
        if (this.P) {
            return;
        }
        this.R = SystemClock.elapsedRealtime();
        this.P = true;
    }
}