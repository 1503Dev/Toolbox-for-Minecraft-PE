package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qf4  reason: default package */
public final class qf4 extends mp2 implements zp5, z32 {
    public final q23 P;
    public final Context Q;
    public final String S;
    public final jf4 T;
    public final if4 U;
    public final xv2 V;
    public u73 X;
    public c83 Y;
    public AtomicBoolean R = new AtomicBoolean();
    public long W = -1;

    public qf4(q23 q23Var, Context context, String str, jf4 jf4Var, if4 if4Var, xv2 xv2Var) {
        this.P = q23Var;
        this.Q = context;
        this.S = str;
        this.T = jf4Var;
        this.U = if4Var;
        this.V = xv2Var;
        if4Var.U.set(this);
    }

    @Override // defpackage.zp5
    public final void A(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            t4(i2 != 1 ? i2 != 2 ? 6 : 3 : 4);
        } else {
            t4(2);
        }
    }

    @Override // defpackage.pq2
    public final void A3(i42 i42Var) {
        this.U.Q.set(i42Var);
    }

    @Override // defpackage.pq2
    public final void B2(boolean z) {
    }

    @Override // defpackage.pq2
    public final synchronized void F() {
        uf0.b("destroy must be called on the main UI thread.");
        c83 c83Var = this.Y;
        if (c83Var != null) {
            c83Var.b();
        }
    }

    @Override // defpackage.pq2
    public final void F2(yk3 yk3Var) {
    }

    @Override // defpackage.pq2
    public final synchronized String G() {
        return null;
    }

    @Override // defpackage.pq2
    public final void G0(pn5 pn5Var, xh2 xh2Var) {
    }

    @Override // defpackage.pq2
    public final void G1(q33 q33Var) {
    }

    @Override // defpackage.pq2
    public final synchronized void J() {
        uf0.b("resume must be called on the main UI thread.");
    }

    @Override // defpackage.pq2
    public final void J2(by5 by5Var) {
        this.T.i.i = by5Var;
    }

    @Override // defpackage.pq2
    public final synchronized void K1(zr5 zr5Var) {
        uf0.b("setAdSize must be called on the main UI thread.");
    }

    @Override // defpackage.pq2
    public final synchronized void M1() {
        uf0.b("pause must be called on the main UI thread.");
    }

    @Override // defpackage.pq2
    public final void O() {
    }

    @Override // defpackage.pq2
    public final boolean O3() {
        return false;
    }

    @Override // defpackage.pq2
    public final synchronized void Q() {
    }

    @Override // defpackage.pq2
    public final void R2(qc2 qc2Var) {
    }

    @Override // defpackage.pq2
    public final void S0(gr2 gr2Var) {
    }

    @Override // defpackage.pq2
    public final void S3(gf2 gf2Var) {
    }

    @Override // defpackage.pq2
    public final synchronized void U2(sa2 sa2Var) {
    }

    @Override // defpackage.zp5
    public final void Z() {
    }

    @Override // defpackage.pq2
    public final void a1(px2 px2Var) {
    }

    @Override // defpackage.zp5
    public final synchronized void b() {
        c83 c83Var = this.Y;
        if (c83Var != null) {
            jv5.A.j.getClass();
            c83Var.d(SystemClock.elapsedRealtime() - this.W, 1);
        }
    }

    @Override // defpackage.zp5
    public final synchronized void c() {
        if (this.Y == null) {
            return;
        }
        jv5 jv5Var = jv5.A;
        jv5Var.j.getClass();
        this.W = SystemClock.elapsedRealtime();
        int i = this.Y.j;
        if (i <= 0) {
            return;
        }
        ScheduledExecutorService b = this.P.b();
        dk dkVar = jv5Var.j;
        u73 u73Var = new u73(b, dkVar);
        this.X = u73Var;
        g53 g53Var = new g53(3, this);
        synchronized (u73Var) {
            u73Var.f = g53Var;
            dkVar.getClass();
            long j = i;
            u73Var.d = SystemClock.elapsedRealtime() + j;
            u73Var.c = b.schedule(g53Var, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.pq2
    public final synchronized void c3(zq4 zq4Var) {
    }

    @Override // defpackage.pq2
    public final void d0() {
    }

    @Override // defpackage.zp5
    public final void d3() {
    }

    @Override // defpackage.pq2
    public final synchronized void f0() {
    }

    @Override // defpackage.pq2
    public final gf2 g() {
        return null;
    }

    @Override // defpackage.pq2
    public final synchronized zr5 h() {
        return null;
    }

    @Override // defpackage.pq2
    public final synchronized void h4(c13 c13Var) {
    }

    @Override // defpackage.pq2
    public final Bundle i() {
        return new Bundle();
    }

    @Override // defpackage.pq2
    public final px2 j() {
        return null;
    }

    @Override // defpackage.pq2
    public final synchronized void j4(boolean z) {
    }

    @Override // defpackage.pq2
    public final hw k() {
        return null;
    }

    @Override // defpackage.pq2
    public final synchronized mq3 l() {
        return null;
    }

    @Override // defpackage.pq2
    public final synchronized boolean l0() {
        return this.T.a();
    }

    @Override // defpackage.pq2
    public final synchronized cs3 n() {
        return null;
    }

    @Override // defpackage.zp5
    public final void n3() {
    }

    @Override // defpackage.pq2
    public final void o0() {
    }

    @Override // defpackage.pq2
    public final void r2() {
    }

    @Override // defpackage.pq2
    public final synchronized String s() {
        return null;
    }

    @Override // defpackage.pq2
    public final void s0() {
    }

    @Override // defpackage.pq2
    public final void t0() {
    }

    @Override // defpackage.pq2
    public final void t1(hw hwVar) {
    }

    public final synchronized void t4(int i) {
        if (this.R.compareAndSet(false, true)) {
            this.U.a();
            u73 u73Var = this.X;
            if (u73Var != null) {
                jv5.A.f.d(u73Var);
            }
            if (this.Y != null) {
                long j = -1;
                if (this.W != -1) {
                    jv5.A.j.getClass();
                    j = SystemClock.elapsedRealtime() - this.W;
                }
                this.Y.d(j, i);
            }
            F();
        }
    }

    @Override // defpackage.pq2
    public final synchronized String w() {
        return this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004e, B:18:0x0053, B:21:0x0065, B:25:0x006d, B:12:0x003d), top: B:31:0x0001 }] */
    @Override // defpackage.pq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean z1(pn5 pn5Var) {
        boolean z;
        if (((Boolean) kb2.d.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                z = true;
                if (this.V.R >= ((Integer) w82.d.c.a(x92.L8)).intValue() || !z) {
                    uf0.b("loadAd must be called on the main UI thread.");
                }
                cu5 cu5Var = jv5.A.c;
                if (cu5.b(this.Q) && pn5Var.h0 == null) {
                    sv2.d("Failed to load the ad because app ID is missing.");
                    this.U.p(oj4.d(4, null, null));
                    return false;
                }
                if (!l0()) {
                    return false;
                }
                this.R = new AtomicBoolean();
                return this.T.b(pn5Var, this.S, new pf4(), new s82(6, this));
            }
        }
        z = false;
        if (this.V.R >= ((Integer) w82.d.c.a(x92.L8)).intValue()) {
        }
        uf0.b("loadAd must be called on the main UI thread.");
        cu5 cu5Var2 = jv5.A.c;
        if (cu5.b(this.Q)) {
            sv2.d("Failed to load the ad because app ID is missing.");
            this.U.p(oj4.d(4, null, null));
            return false;
        }
        if (!l0()) {
        }
    }
}