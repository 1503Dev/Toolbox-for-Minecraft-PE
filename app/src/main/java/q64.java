package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewParent;
import java.util.Collections;

/* renamed from: q64  reason: default package */
public final class q64 extends mp2 implements cf3 {
    public final Context P;
    public final tf4 Q;
    public final String R;
    public final t64 S;
    public zr5 T;
    public final ki4 U;
    public final xv2 V;
    public h83 W;

    public q64(Context context, zr5 zr5Var, String str, tf4 tf4Var, t64 t64Var, xv2 xv2Var) {
        this.P = context;
        this.Q = tf4Var;
        this.T = zr5Var;
        this.R = str;
        this.S = t64Var;
        this.U = tf4Var.k;
        this.V = xv2Var;
        tf4Var.h.Q0(this, tf4Var.b);
    }

    @Override // defpackage.pq2
    public final void A3(i42 i42Var) {
    }

    @Override // defpackage.pq2
    public final void B2(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r4.V.R < ((java.lang.Integer) r1.c.a(defpackage.x92.M8)).intValue()) goto L18;
     */
    @Override // defpackage.pq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void F() {
        if (((Boolean) kb2.e.d()).booleanValue()) {
            l92 l92Var = x92.H8;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            }
        }
        uf0.b("destroy must be called on the main UI thread.");
        h83 h83Var = this.W;
        if (h83Var != null) {
            ee3 ee3Var = h83Var.c;
            ee3Var.getClass();
            ee3Var.R0(new cz1(1, null));
        }
    }

    @Override // defpackage.pq2
    public final void F2(yk3 yk3Var) {
        if (u4()) {
            uf0.b("setPaidEventListener must be called on the main UI thread.");
        }
        this.S.R.set(yk3Var);
    }

    @Override // defpackage.pq2
    public final synchronized String G() {
        gd3 gd3Var;
        h83 h83Var = this.W;
        if (h83Var != null && (gd3Var = h83Var.f) != null) {
            return gd3Var.P;
        }
        return null;
    }

    @Override // defpackage.pq2
    public final void G0(pn5 pn5Var, xh2 xh2Var) {
    }

    @Override // defpackage.pq2
    public final void G1(q33 q33Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r4.V.R < ((java.lang.Integer) r1.c.a(defpackage.x92.M8)).intValue()) goto L18;
     */
    @Override // defpackage.pq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void J() {
        if (((Boolean) kb2.h.d()).booleanValue()) {
            l92 l92Var = x92.G8;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            }
        }
        uf0.b("resume must be called on the main UI thread.");
        h83 h83Var = this.W;
        if (h83Var != null) {
            ee3 ee3Var = h83Var.c;
            ee3Var.getClass();
            ee3Var.R0(new dk5(3, null));
        }
    }

    @Override // defpackage.pq2
    public final void J2(by5 by5Var) {
    }

    @Override // defpackage.pq2
    public final synchronized void K1(zr5 zr5Var) {
        uf0.b("setAdSize must be called on the main UI thread.");
        this.U.b = zr5Var;
        this.T = zr5Var;
        h83 h83Var = this.W;
        if (h83Var != null) {
            h83Var.h(this.Q.f, zr5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r3.V.R < ((java.lang.Integer) r1.c.a(defpackage.x92.M8)).intValue()) goto L18;
     */
    @Override // defpackage.pq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void M1() {
        if (((Boolean) kb2.g.d()).booleanValue()) {
            l92 l92Var = x92.I8;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            }
        }
        uf0.b("pause must be called on the main UI thread.");
        h83 h83Var = this.W;
        if (h83Var != null) {
            ee3 ee3Var = h83Var.c;
            ee3Var.getClass();
            ee3Var.R0(new y54(null));
        }
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
        uf0.b("recordManualImpression must be called on the main UI thread.");
        h83 h83Var = this.W;
        if (h83Var != null) {
            h83Var.g();
        }
    }

    @Override // defpackage.pq2
    public final void R2(qc2 qc2Var) {
        if (u4()) {
            uf0.b("setAdListener must be called on the main UI thread.");
        }
        y64 y64Var = this.Q.e;
        synchronized (y64Var) {
            y64Var.P = qc2Var;
        }
    }

    @Override // defpackage.pq2
    public final void S0(gr2 gr2Var) {
    }

    @Override // defpackage.pq2
    public final void S3(gf2 gf2Var) {
        if (u4()) {
            uf0.b("setAdListener must be called on the main UI thread.");
        }
        this.S.P.set(gf2Var);
    }

    @Override // defpackage.pq2
    public final synchronized void U2(sa2 sa2Var) {
        uf0.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.Q.g = sa2Var;
    }

    @Override // defpackage.cf3
    public final synchronized void a() {
        PowerManager powerManager;
        boolean k;
        int i;
        ViewParent parent = this.Q.f.getParent();
        if (!(parent instanceof View)) {
            k = false;
        } else {
            View view = (View) parent;
            cu5 cu5Var = jv5.A.c;
            Context context = view.getContext();
            Context applicationContext = context.getApplicationContext();
            KeyguardManager keyguardManager = null;
            if (applicationContext != null) {
                powerManager = (PowerManager) applicationContext.getSystemService("power");
            } else {
                powerManager = null;
            }
            Object systemService = context.getSystemService("keyguard");
            if (systemService != null && (systemService instanceof KeyguardManager)) {
                keyguardManager = (KeyguardManager) systemService;
            }
            k = cu5.k(view, powerManager, keyguardManager);
        }
        if (k) {
            zr5 zr5Var = this.U.b;
            h83 h83Var = this.W;
            if (h83Var != null && h83Var.f() != null && this.U.p) {
                zr5Var = ea2.y(this.P, Collections.singletonList(this.W.f()));
            }
            synchronized (this) {
                ki4 ki4Var = this.U;
                ki4Var.b = zr5Var;
                ki4Var.p = this.T.c0;
                try {
                    t4(ki4Var.a);
                } catch (RemoteException unused) {
                    sv2.g("Failed to refresh the banner ad.");
                    return;
                }
            }
            return;
        }
        tf4 tf4Var = this.Q;
        bf3 bf3Var = tf4Var.h;
        xf3 xf3Var = tf4Var.j;
        synchronized (xf3Var) {
            i = xf3Var.P;
        }
        bf3Var.S0(i);
    }

    @Override // defpackage.pq2
    public final void a1(px2 px2Var) {
        if (u4()) {
            uf0.b("setAppEventListener must be called on the main UI thread.");
        }
        this.S.a(px2Var);
    }

    @Override // defpackage.pq2
    public final synchronized void c3(zq4 zq4Var) {
        if (u4()) {
            uf0.b("setVideoOptions must be called on the main UI thread.");
        }
        this.U.d = zq4Var;
    }

    @Override // defpackage.pq2
    public final void d0() {
    }

    @Override // defpackage.pq2
    public final void f0() {
    }

    @Override // defpackage.pq2
    public final gf2 g() {
        gf2 gf2Var;
        t64 t64Var = this.S;
        synchronized (t64Var) {
            gf2Var = (gf2) t64Var.P.get();
        }
        return gf2Var;
    }

    @Override // defpackage.pq2
    public final synchronized zr5 h() {
        uf0.b("getAdSize must be called on the main UI thread.");
        h83 h83Var = this.W;
        if (h83Var != null) {
            return ea2.y(this.P, Collections.singletonList(h83Var.e()));
        }
        return this.U.b;
    }

    @Override // defpackage.pq2
    public final synchronized void h4(c13 c13Var) {
        uf0.b("setCorrelationIdProvider must be called on the main UI thread");
        this.U.s = c13Var;
    }

    @Override // defpackage.pq2
    public final Bundle i() {
        uf0.b("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // defpackage.pq2
    public final px2 j() {
        px2 px2Var;
        t64 t64Var = this.S;
        synchronized (t64Var) {
            px2Var = (px2) t64Var.Q.get();
        }
        return px2Var;
    }

    @Override // defpackage.pq2
    public final synchronized void j4(boolean z) {
        if (u4()) {
            uf0.b("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.U.e = z;
    }

    @Override // defpackage.pq2
    public final hw k() {
        if (u4()) {
            uf0.b("getAdFrame must be called on the main UI thread.");
        }
        return new va0(this.Q.f);
    }

    @Override // defpackage.pq2
    public final synchronized mq3 l() {
        if (!((Boolean) w82.d.c.a(x92.J5)).booleanValue()) {
            return null;
        }
        h83 h83Var = this.W;
        if (h83Var == null) {
            return null;
        }
        return h83Var.f;
    }

    @Override // defpackage.pq2
    public final synchronized boolean l0() {
        return this.Q.a();
    }

    @Override // defpackage.pq2
    public final synchronized cs3 n() {
        uf0.b("getVideoController must be called from the main thread.");
        h83 h83Var = this.W;
        if (h83Var != null) {
            return h83Var.d();
        }
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
        h83 h83Var = this.W;
        if (h83Var != null && (gd3Var = h83Var.f) != null) {
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
    public final void t1(hw hwVar) {
    }

    public final synchronized boolean t4(pn5 pn5Var) {
        if (u4()) {
            uf0.b("loadAd must be called on the main UI thread.");
        }
        cu5 cu5Var = jv5.A.c;
        if (cu5.b(this.P) && pn5Var.h0 == null) {
            sv2.d("Failed to load the ad because app ID is missing.");
            t64 t64Var = this.S;
            if (t64Var != null) {
                t64Var.p(oj4.d(4, null, null));
            }
            return false;
        }
        lj4.a(this.P, pn5Var.U);
        return this.Q.b(pn5Var, this.R, null, new u04(8, this));
    }

    public final boolean u4() {
        boolean z;
        if (((Boolean) kb2.f.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                z = true;
                if (this.V.R < ((Integer) w82.d.c.a(x92.L8)).intValue() && z) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (this.V.R < ((Integer) w82.d.c.a(x92.L8)).intValue()) {
        }
        return true;
    }

    @Override // defpackage.pq2
    public final synchronized String w() {
        return this.R;
    }

    @Override // defpackage.pq2
    public final synchronized boolean z1(pn5 pn5Var) {
        zr5 zr5Var = this.T;
        synchronized (this) {
            ki4 ki4Var = this.U;
            ki4Var.b = zr5Var;
            ki4Var.p = this.T.c0;
        }
        return t4(pn5Var);
        return t4(pn5Var);
    }
}