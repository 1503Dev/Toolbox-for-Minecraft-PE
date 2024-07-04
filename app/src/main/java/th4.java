package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* renamed from: th4  reason: default package */
public final class th4 extends vr2 {
    public final qh4 Q;
    public final mh4 R;
    public final String S;
    public final ii4 T;
    public final Context U;
    public final xv2 V;
    public final rz1 W;
    public yp3 X;
    public boolean Y = ((Boolean) w82.d.c.a(x92.t0)).booleanValue();

    public th4(String str, qh4 qh4Var, Context context, mh4 mh4Var, ii4 ii4Var, xv2 xv2Var, rz1 rz1Var) {
        this.S = str;
        this.Q = qh4Var;
        this.R = mh4Var;
        this.T = ii4Var;
        this.U = context;
        this.V = xv2Var;
        this.W = rz1Var;
    }

    @Override // defpackage.wr2
    public final void A1(es2 es2Var) {
        uf0.b("#008 Must be called on the main UI thread.");
        this.R.U.set(es2Var);
    }

    @Override // defpackage.wr2
    public final synchronized void S(hw hwVar) {
        y2(hwVar, this.Y);
    }

    @Override // defpackage.wr2
    public final synchronized void U(boolean z) {
        uf0.b("setImmersiveMode must be called on the main UI thread.");
        this.Y = z;
    }

    @Override // defpackage.wr2
    public final synchronized void U0(pn5 pn5Var, ds2 ds2Var) {
        t4(pn5Var, ds2Var, 3);
    }

    @Override // defpackage.wr2
    public final synchronized String b() {
        gd3 gd3Var;
        yp3 yp3Var = this.X;
        if (yp3Var != null && (gd3Var = yp3Var.f) != null) {
            return gd3Var.P;
        }
        return null;
    }

    @Override // defpackage.wr2
    public final Bundle c() {
        Bundle bundle;
        uf0.b("#008 Must be called on the main UI thread.");
        yp3 yp3Var = this.X;
        if (yp3Var != null) {
            pe3 pe3Var = yp3Var.n;
            synchronized (pe3Var) {
                bundle = new Bundle(pe3Var.Q);
            }
            return bundle;
        }
        return new Bundle();
    }

    @Override // defpackage.wr2
    public final void c4(vi3 vi3Var) {
        if (vi3Var == null) {
            this.R.Q.set(null);
            return;
        }
        mh4 mh4Var = this.R;
        mh4Var.Q.set(new sh4(this, vi3Var));
    }

    @Override // defpackage.wr2
    public final mq3 d() {
        yp3 yp3Var;
        if (!((Boolean) w82.d.c.a(x92.J5)).booleanValue() || (yp3Var = this.X) == null) {
            return null;
        }
        return yp3Var.f;
    }

    @Override // defpackage.wr2
    public final synchronized void h1(pn5 pn5Var, ds2 ds2Var) {
        t4(pn5Var, ds2Var, 2);
    }

    @Override // defpackage.wr2
    public final tr2 i() {
        uf0.b("#008 Must be called on the main UI thread.");
        yp3 yp3Var = this.X;
        if (yp3Var != null) {
            return yp3Var.p;
        }
        return null;
    }

    @Override // defpackage.wr2
    public final synchronized void l3(hs2 hs2Var) {
        uf0.b("#008 Must be called on the main UI thread.");
        ii4 ii4Var = this.T;
        ii4Var.a = hs2Var.P;
        ii4Var.b = hs2Var.Q;
    }

    @Override // defpackage.wr2
    public final void p4(yk3 yk3Var) {
        uf0.b("setOnPaidEventListener must be called on the main UI thread.");
        this.R.W.set(yk3Var);
    }

    @Override // defpackage.wr2
    public final boolean t() {
        uf0.b("#008 Must be called on the main UI thread.");
        yp3 yp3Var = this.X;
        return (yp3Var == null || yp3Var.s) ? false : true;
    }

    @Override // defpackage.wr2
    public final void t2(zr2 zr2Var) {
        uf0.b("#008 Must be called on the main UI thread.");
        this.R.S.set(zr2Var);
    }

    public final synchronized void t4(pn5 pn5Var, ds2 ds2Var, int i) {
        boolean z = false;
        if (((Boolean) kb2.k.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                z = true;
            }
        }
        if (this.V.R < ((Integer) w82.d.c.a(x92.L8)).intValue() || !z) {
            uf0.b("#008 Must be called on the main UI thread.");
        }
        this.R.R.set(ds2Var);
        cu5 cu5Var = jv5.A.c;
        if (cu5.b(this.U) && pn5Var.h0 == null) {
            sv2.d("Failed to load the ad because app ID is missing.");
            this.R.p(oj4.d(4, null, null));
            return;
        }
        if (this.X != null) {
            return;
        }
        nh4 nh4Var = new nh4();
        qh4 qh4Var = this.Q;
        qh4Var.h.o.a = i;
        qh4Var.b(pn5Var, this.S, nh4Var, new wv1(5, this));
    }

    @Override // defpackage.wr2
    public final synchronized void y2(hw hwVar, boolean z) {
        uf0.b("#008 Must be called on the main UI thread.");
        if (this.X == null) {
            sv2.g("Rewarded can not be shown before loaded");
            this.R.g0(oj4.d(9, null, null));
            return;
        }
        if (((Boolean) w82.d.c.a(x92.c2)).booleanValue()) {
            this.W.b.d(new Throwable().getStackTrace());
        }
        this.X.b((Activity) va0.c0(hwVar), z);
    }
}