package defpackage;

import android.os.Bundle;

/* renamed from: v34  reason: default package */
public final class v34 extends x34 {
    public final q23 a;
    public final jk3 b;
    public final xc3 c;
    public final zg3 d;
    public final i44 e;
    public final j14 f;

    public v34(q23 q23Var, jk3 jk3Var, xc3 xc3Var, zg3 zg3Var, i44 i44Var, j14 j14Var) {
        this.a = q23Var;
        this.b = jk3Var;
        this.c = xc3Var;
        this.d = zg3Var;
        this.e = i44Var;
        this.f = j14Var;
    }

    @Override // defpackage.x34
    public final el4 c(li4 li4Var, Bundle bundle, yh4 yh4Var, hi4 hi4Var) {
        xc3 xc3Var = this.c;
        xc3Var.b = li4Var;
        xc3Var.c = bundle;
        xc3Var.e = new rc3(hi4Var, yh4Var, this.e);
        if (((Boolean) w82.d.c.a(x92.R2)).booleanValue()) {
            this.c.f = this.f;
        }
        m33 h = this.a.h();
        xc3 xc3Var2 = this.c;
        xc3Var2.getClass();
        h.e = new yc3(xc3Var2);
        h.d = this.d;
        h.f = this.b;
        h.g = new e83(0, null);
        hb3 a = h.f().a();
        return a.b(a.c());
    }
}