package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.Random;

/* renamed from: ok2  reason: default package */
public final class ok2 extends l23 {
    public final t6 P;

    public ok2(t6 t6Var) {
        this.P = t6Var;
    }

    @Override // defpackage.m23
    public final void I(String str) {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        h34Var.b(new gf3(h34Var, str));
    }

    @Override // defpackage.m23
    public final long M() {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        dv2 dv2Var = new dv2();
        h34Var.b(new yh3(h34Var, dv2Var));
        Long l = (Long) dv2.b2(dv2Var.A(500L), Long.class);
        if (l == null) {
            long nanoTime = System.nanoTime();
            h34Var.b.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = h34Var.e + 1;
            h34Var.e = i;
            return nextLong + i;
        }
        return l.longValue();
    }

    @Override // defpackage.m23
    public final void Y2(hw hwVar, String str, String str2) {
        Activity activity;
        t6 t6Var = this.P;
        if (hwVar != null) {
            activity = (Activity) va0.c0(hwVar);
        } else {
            activity = null;
        }
        h34 h34Var = t6Var.a;
        h34Var.getClass();
        h34Var.b(new da3(h34Var, activity, str, str2));
    }

    @Override // defpackage.m23
    public final String b() {
        return this.P.a.g;
    }

    @Override // defpackage.m23
    public final String e() {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        dv2 dv2Var = new dv2();
        h34Var.b(new fh3(h34Var, dv2Var));
        return dv2Var.Z(50L);
    }

    @Override // defpackage.m23
    public final String f() {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        dv2 dv2Var = new dv2();
        h34Var.b(new ti3(h34Var, dv2Var));
        return dv2Var.Z(500L);
    }

    @Override // defpackage.m23
    public final String g() {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        dv2 dv2Var = new dv2();
        h34Var.b(new mg3(h34Var, dv2Var));
        return dv2Var.Z(500L);
    }

    @Override // defpackage.m23
    public final String h() {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        dv2 dv2Var = new dv2();
        h34Var.b(new mj3(h34Var, dv2Var));
        return dv2Var.Z(500L);
    }

    @Override // defpackage.m23
    public final void i0(Bundle bundle) {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        h34Var.b(new xb3(h34Var, bundle));
    }

    @Override // defpackage.m23
    public final void q0(String str) {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        h34Var.b(new kf3(h34Var, str));
    }

    @Override // defpackage.m23
    public final void w3(Bundle bundle, String str, String str2) {
        h34 h34Var = this.P.a;
        h34Var.getClass();
        h34Var.b(new rs3(h34Var, str, str2, bundle));
    }
}