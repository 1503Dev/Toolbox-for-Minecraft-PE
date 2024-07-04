package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* renamed from: z64  reason: default package */
public final class z64 extends mp2 {
    public final zr5 P;
    public final Context Q;
    public final hh4 R;
    public final String S;
    public final xv2 T;
    public final t64 U;
    public final mh4 V;
    public final rz1 W;
    public dj3 X;
    public boolean Y = ((Boolean) w82.d.c.a(x92.t0)).booleanValue();

    public z64(Context context, zr5 zr5Var, String str, hh4 hh4Var, t64 t64Var, mh4 mh4Var, xv2 xv2Var, rz1 rz1Var) {
        this.P = zr5Var;
        this.S = str;
        this.Q = context;
        this.R = hh4Var;
        this.U = t64Var;
        this.V = mh4Var;
        this.T = xv2Var;
        this.W = rz1Var;
    }

    @Override // defpackage.pq2
    public final void A3(i42 i42Var) {
    }

    @Override // defpackage.pq2
    public final synchronized void B2(boolean z) {
        uf0.b("setImmersiveMode must be called on the main UI thread.");
        this.Y = z;
    }

    @Override // defpackage.pq2
    public final synchronized void F() {
        uf0.b("destroy must be called on the main UI thread.");
        dj3 dj3Var = this.X;
        if (dj3Var != null) {
            ee3 ee3Var = dj3Var.c;
            ee3Var.getClass();
            ee3Var.R0(new cz1(1, null));
        }
    }

    @Override // defpackage.pq2
    public final void F2(yk3 yk3Var) {
        uf0.b("setPaidEventListener must be called on the main UI thread.");
        this.U.R.set(yk3Var);
    }

    @Override // defpackage.pq2
    public final synchronized String G() {
        gd3 gd3Var;
        dj3 dj3Var = this.X;
        if (dj3Var != null && (gd3Var = dj3Var.f) != null) {
            return gd3Var.P;
        }
        return null;
    }

    @Override // defpackage.pq2
    public final void G0(pn5 pn5Var, xh2 xh2Var) {
        this.U.S.set(xh2Var);
        z1(pn5Var);
    }

    @Override // defpackage.pq2
    public final void G1(q33 q33Var) {
        this.U.T.set(q33Var);
    }

    @Override // defpackage.pq2
    public final synchronized void J() {
        uf0.b("resume must be called on the main UI thread.");
        dj3 dj3Var = this.X;
        if (dj3Var != null) {
            ee3 ee3Var = dj3Var.c;
            ee3Var.getClass();
            ee3Var.R0(new dk5(3, null));
        }
    }

    @Override // defpackage.pq2
    public final void J2(by5 by5Var) {
    }

    @Override // defpackage.pq2
    public final void K1(zr5 zr5Var) {
    }

    @Override // defpackage.pq2
    public final synchronized void M1() {
        uf0.b("pause must be called on the main UI thread.");
        dj3 dj3Var = this.X;
        if (dj3Var != null) {
            ee3 ee3Var = dj3Var.c;
            ee3Var.getClass();
            ee3Var.R0(new y54(null));
        }
    }

    @Override // defpackage.pq2
    public final void O() {
    }

    @Override // defpackage.pq2
    public final synchronized boolean O3() {
        boolean z;
        uf0.b("isLoaded must be called on the main UI thread.");
        synchronized (this) {
            dj3 dj3Var = this.X;
            if (dj3Var != null && !dj3Var.m.Q.get()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
        return z;
    }

    @Override // defpackage.pq2
    public final void Q() {
    }

    @Override // defpackage.pq2
    public final void R2(qc2 qc2Var) {
    }

    @Override // defpackage.pq2
    public final void S0(gr2 gr2Var) {
        this.V.T.set(gr2Var);
    }

    @Override // defpackage.pq2
    public final void S3(gf2 gf2Var) {
        uf0.b("setAdListener must be called on the main UI thread.");
        this.U.P.set(gf2Var);
    }

    @Override // defpackage.pq2
    public final synchronized void U2(sa2 sa2Var) {
        uf0.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.R.f = sa2Var;
    }

    @Override // defpackage.pq2
    public final void a1(px2 px2Var) {
        uf0.b("setAppEventListener must be called on the main UI thread.");
        this.U.a(px2Var);
    }

    @Override // defpackage.pq2
    public final void c3(zq4 zq4Var) {
    }

    @Override // defpackage.pq2
    public final void d0() {
    }

    @Override // defpackage.pq2
    public final synchronized void f0() {
        uf0.b("showInterstitial must be called on the main UI thread.");
        if (this.X == null) {
            sv2.g("Interstitial can not be shown before loaded.");
            this.U.g0(oj4.d(9, null, null));
            return;
        }
        if (((Boolean) w82.d.c.a(x92.c2)).booleanValue()) {
            this.W.b.d(new Throwable().getStackTrace());
        }
        this.X.b(null, this.Y);
    }

    @Override // defpackage.pq2
    public final gf2 g() {
        gf2 gf2Var;
        t64 t64Var = this.U;
        synchronized (t64Var) {
            gf2Var = (gf2) t64Var.P.get();
        }
        return gf2Var;
    }

    @Override // defpackage.pq2
    public final zr5 h() {
        return null;
    }

    @Override // defpackage.pq2
    public final void h4(c13 c13Var) {
    }

    @Override // defpackage.pq2
    public final Bundle i() {
        uf0.b("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // defpackage.pq2
    public final px2 j() {
        px2 px2Var;
        t64 t64Var = this.U;
        synchronized (t64Var) {
            px2Var = (px2) t64Var.Q.get();
        }
        return px2Var;
    }

    @Override // defpackage.pq2
    public final void j4(boolean z) {
    }

    @Override // defpackage.pq2
    public final hw k() {
        return null;
    }

    @Override // defpackage.pq2
    public final synchronized mq3 l() {
        if (!((Boolean) w82.d.c.a(x92.J5)).booleanValue()) {
            return null;
        }
        dj3 dj3Var = this.X;
        if (dj3Var == null) {
            return null;
        }
        return dj3Var.f;
    }

    @Override // defpackage.pq2
    public final synchronized boolean l0() {
        return this.R.a();
    }

    @Override // defpackage.pq2
    public final cs3 n() {
        return null;
    }

    @Override // defpackage.pq2
    public final void o0() {
    }

    @Override // defpackage.pq2
    public final void r2() {
    }

    @Override // defpackage.pq2
    public final synchronized String s() {
        gd3 gd3Var;
        dj3 dj3Var = this.X;
        if (dj3Var != null && (gd3Var = dj3Var.f) != null) {
            return gd3Var.P;
        }
        return null;
    }

    @Override // defpackage.pq2
    public final void s0() {
        uf0.b("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // defpackage.pq2
    public final void t0() {
    }

    @Override // defpackage.pq2
    public final synchronized void t1(hw hwVar) {
        if (this.X == null) {
            sv2.g("Interstitial can not be shown before loaded.");
            this.U.g0(oj4.d(9, null, null));
            return;
        }
        if (((Boolean) w82.d.c.a(x92.c2)).booleanValue()) {
            this.W.b.d(new Throwable().getStackTrace());
        }
        this.X.b((Activity) va0.c0(hwVar), this.Y);
    }

    @Override // defpackage.pq2
    public final synchronized String w() {
        return this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:13:0x0043, B:15:0x0050, B:17:0x0054, B:19:0x005d, B:22:0x0067, B:29:0x0078, B:33:0x007d, B:12:0x003e, B:23:0x0068, B:25:0x006c), top: B:42:0x0001 }] */
    @Override // defpackage.pq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean z1(pn5 pn5Var) {
        boolean z;
        boolean z2 = true;
        if (((Boolean) kb2.i.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                z = true;
                if (this.T.R >= ((Integer) w82.d.c.a(x92.L8)).intValue() || !z) {
                    uf0.b("loadAd must be called on the main UI thread.");
                }
                cu5 cu5Var = jv5.A.c;
                if (!cu5.b(this.Q) && pn5Var.h0 == null) {
                    sv2.d("Failed to load the ad because app ID is missing.");
                    t64 t64Var = this.U;
                    if (t64Var != null) {
                        t64Var.p(oj4.d(4, null, null));
                    }
                    return false;
                }
                synchronized (this) {
                    dj3 dj3Var = this.X;
                    if ((dj3Var == null || dj3Var.m.Q.get()) ? false : false) {
                        return false;
                    }
                    lj4.a(this.Q, pn5Var.U);
                    this.X = null;
                    return this.R.b(pn5Var, this.S, new ah4(this.P), new db3(3, this));
                }
            }
        }
        z = false;
        if (this.T.R >= ((Integer) w82.d.c.a(x92.L8)).intValue()) {
        }
        uf0.b("loadAd must be called on the main UI thread.");
        cu5 cu5Var2 = jv5.A.c;
        if (!cu5.b(this.Q)) {
        }
        synchronized (this) {
        }
    }
}