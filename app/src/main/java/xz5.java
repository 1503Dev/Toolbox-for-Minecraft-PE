package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: xz5  reason: default package */
public final class xz5 extends oo2 {
    public final AdOverlayInfoParcel Q;
    public final Activity R;
    public boolean S = false;
    public boolean T = false;

    public xz5(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.Q = adOverlayInfoParcel;
        this.R = activity;
    }

    @Override // defpackage.po2
    public final void D3(int i, int i2, Intent intent) {
    }

    @Override // defpackage.po2
    public final void E() {
    }

    @Override // defpackage.po2
    public final void G() {
        if (this.R.isFinishing()) {
            c();
        }
    }

    @Override // defpackage.po2
    public final void a0(hw hwVar) {
    }

    @Override // defpackage.po2
    public final void a2(Bundle bundle) {
        zp5 zp5Var;
        if (((Boolean) w82.d.c.a(x92.v7)).booleanValue()) {
            this.R.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.Q;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                vj1 vj1Var = adOverlayInfoParcel.Q;
                if (vj1Var != null) {
                    vj1Var.J();
                }
                oi3 oi3Var = this.Q.n0;
                if (oi3Var != null) {
                    oi3Var.w();
                }
                if (this.R.getIntent() != null && this.R.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zp5Var = this.Q.R) != null) {
                    zp5Var.c();
                }
            }
            wj1 wj1Var = jv5.A.a;
            Activity activity = this.R;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.Q;
            tw2 tw2Var = adOverlayInfoParcel2.P;
            if (wj1.b(activity, tw2Var, adOverlayInfoParcel2.X, tw2Var.X)) {
                return;
            }
        }
        this.R.finish();
    }

    public final synchronized void c() {
        if (this.T) {
            return;
        }
        zp5 zp5Var = this.Q.R;
        if (zp5Var != null) {
            zp5Var.A(4);
        }
        this.T = true;
    }

    @Override // defpackage.po2
    public final void f() {
    }

    @Override // defpackage.po2
    public final void i0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.S);
    }

    @Override // defpackage.po2
    public final void k() {
        zp5 zp5Var = this.Q.R;
        if (zp5Var != null) {
            zp5Var.Z();
        }
        if (this.R.isFinishing()) {
            c();
        }
    }

    @Override // defpackage.po2
    public final void m() {
    }

    @Override // defpackage.po2
    public final void n() {
        if (this.R.isFinishing()) {
            c();
        }
    }

    @Override // defpackage.po2
    public final void q() {
        if (this.S) {
            this.R.finish();
            return;
        }
        this.S = true;
        zp5 zp5Var = this.Q.R;
        if (zp5Var != null) {
            zp5Var.d3();
        }
    }

    @Override // defpackage.po2
    public final void s() {
    }

    @Override // defpackage.po2
    public final void u() {
        zp5 zp5Var = this.Q.R;
        if (zp5Var != null) {
            zp5Var.b();
        }
    }

    @Override // defpackage.po2
    public final boolean x() {
        return false;
    }

    @Override // defpackage.po2
    public final void z0(int i, String[] strArr, int[] iArr) {
    }
}