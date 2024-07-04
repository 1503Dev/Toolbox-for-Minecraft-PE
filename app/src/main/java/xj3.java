package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: xj3  reason: default package */
public final class xj3 implements le3, zp5, ae3 {
    public final Context P;
    public final y03 Q;
    public final yh4 R;
    public final xv2 S;
    public final s52 T;
    public va0 U;

    public xj3(Context context, y03 y03Var, yh4 yh4Var, xv2 xv2Var, s52 s52Var) {
        this.P = context;
        this.Q = y03Var;
        this.R = yh4Var;
        this.S = xv2Var;
        this.T = s52Var;
    }

    @Override // defpackage.zp5
    public final void A(int i) {
        this.U = null;
    }

    @Override // defpackage.zp5
    public final void Z() {
    }

    @Override // defpackage.zp5
    public final void b() {
    }

    @Override // defpackage.zp5
    public final void c() {
        if (this.U != null && this.Q != null) {
            if (!((Boolean) w82.d.c.a(x92.m4)).booleanValue()) {
                this.Q.a("onSdkImpression", new e7());
            }
        }
    }

    @Override // defpackage.zp5
    public final void d3() {
    }

    @Override // defpackage.le3
    public final void k() {
        String str;
        int i;
        int i2;
        int i3;
        s52 s52Var = this.T;
        if ((s52Var == s52.X || s52Var == s52.T || s52Var == s52.a0) && this.R.T && this.Q != null) {
            jv5 jv5Var = jv5.A;
            if (jv5Var.v.d(this.P)) {
                xv2 xv2Var = this.S;
                String str2 = xv2Var.Q + "." + xv2Var.R;
                if (this.R.V.j() - 1 != 1) {
                    str = "javascript";
                } else {
                    str = null;
                }
                String str3 = str;
                if (this.R.V.j() == 1) {
                    i2 = 2;
                    i3 = 3;
                } else {
                    if (this.R.Y == 2) {
                        i = 4;
                    } else {
                        i = 1;
                    }
                    i2 = i;
                    i3 = 1;
                }
                va0 a = jv5Var.v.a(str2, this.Q.m0(), str3, i2, i3, this.R.l0);
                this.U = a;
                if (a != null) {
                    jv5Var.v.b((View) this.Q, a);
                    this.Q.j0(this.U);
                    jv5Var.v.c(this.U);
                    this.Q.a("onSdkLoaded", new e7());
                }
            }
        }
    }

    @Override // defpackage.ae3
    public final void n() {
        if (this.U != null && this.Q != null) {
            if (((Boolean) w82.d.c.a(x92.m4)).booleanValue()) {
                this.Q.a("onSdkImpression", new e7());
            }
        }
    }

    @Override // defpackage.zp5
    public final void n3() {
    }
}