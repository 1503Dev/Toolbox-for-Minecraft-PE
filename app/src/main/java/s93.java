package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: s93  reason: default package */
public final class s93 implements le3, ae3 {
    public final Context P;
    public final y03 Q;
    public final yh4 R;
    public final xv2 S;
    public va0 T;
    public boolean U;

    public s93(Context context, y03 y03Var, yh4 yh4Var, xv2 xv2Var) {
        this.P = context;
        this.Q = y03Var;
        this.R = yh4Var;
        this.S = xv2Var;
    }

    public final synchronized void a() {
        String str;
        int i;
        int i2;
        if (!this.R.T) {
            return;
        }
        if (this.Q == null) {
            return;
        }
        jv5 jv5Var = jv5.A;
        if (!jv5Var.v.d(this.P)) {
            return;
        }
        xv2 xv2Var = this.S;
        String str2 = xv2Var.Q + "." + xv2Var.R;
        if (this.R.V.j() - 1 != 1) {
            str = "javascript";
        } else {
            str = null;
        }
        String str3 = str;
        if (this.R.V.j() == 1) {
            i = 2;
            i2 = 3;
        } else {
            if (this.R.e == 1) {
                i = 3;
            } else {
                i = 1;
            }
            i2 = 1;
        }
        va0 a = jv5Var.v.a(str2, this.Q.m0(), str3, i, i2, this.R.l0);
        this.T = a;
        y03 y03Var = this.Q;
        if (a != null) {
            jv5Var.v.b((View) y03Var, a);
            this.Q.j0(this.T);
            jv5Var.v.c(this.T);
            this.U = true;
            this.Q.a("onSdkLoaded", new e7());
        }
    }

    @Override // defpackage.le3
    public final synchronized void k() {
        if (this.U) {
            return;
        }
        a();
    }

    @Override // defpackage.ae3
    public final synchronized void n() {
        y03 y03Var;
        if (!this.U) {
            a();
        }
        if (!this.R.T || this.T == null || (y03Var = this.Q) == null) {
            return;
        }
        y03Var.a("onSdkImpression", new e7());
    }
}