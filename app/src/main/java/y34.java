package defpackage;

import android.os.Bundle;

/* renamed from: y34  reason: default package */
public final class y34 extends x34 {
    public final q23 a;
    public final xc3 b;
    public final zg3 c;
    public final i44 d;
    public final j14 e;

    public y34(q23 q23Var, xc3 xc3Var, zg3 zg3Var, i44 i44Var, j14 j14Var) {
        this.a = q23Var;
        this.b = xc3Var;
        this.c = zg3Var;
        this.d = i44Var;
        this.e = j14Var;
    }

    @Override // defpackage.x34
    public final el4 c(li4 li4Var, Bundle bundle, yh4 yh4Var, hi4 hi4Var) {
        xc3 xc3Var = this.b;
        xc3Var.b = li4Var;
        xc3Var.c = bundle;
        xc3Var.e = new rc3(hi4Var, yh4Var, this.d);
        if (((Boolean) w82.d.c.a(x92.R2)).booleanValue()) {
            this.b.f = this.e;
        }
        y33 d = this.a.d();
        xc3 xc3Var2 = this.b;
        xc3Var2.getClass();
        d.e = new yc3(xc3Var2);
        d.d = this.c;
        hb3 c = d.f().c();
        return c.b(c.c());
    }
}