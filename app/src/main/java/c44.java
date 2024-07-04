package defpackage;

import android.os.Bundle;

/* renamed from: c44  reason: default package */
public final class c44 extends x34 {
    public final q23 a;
    public final xc3 b;
    public final y54 c;
    public final zg3 d;
    public final i44 e;
    public final j14 f;

    public c44(q23 q23Var, xc3 xc3Var, y54 y54Var, zg3 zg3Var, i44 i44Var, j14 j14Var) {
        this.a = q23Var;
        this.b = xc3Var;
        this.c = y54Var;
        this.d = zg3Var;
        this.e = i44Var;
        this.f = j14Var;
    }

    @Override // defpackage.x34
    public final el4 c(li4 li4Var, Bundle bundle, yh4 yh4Var, hi4 hi4Var) {
        xc3 xc3Var = this.b;
        xc3Var.b = li4Var;
        xc3Var.c = bundle;
        xc3Var.e = new rc3(hi4Var, yh4Var, this.e);
        if (((Boolean) w82.d.c.a(x92.R2)).booleanValue()) {
            this.b.f = this.f;
        }
        p43 g = this.a.g();
        xc3 xc3Var2 = this.b;
        xc3Var2.getClass();
        g.e = new yc3(xc3Var2);
        g.d = this.d;
        g.f = this.c;
        hb3 a = g.f().a();
        return a.b(a.c());
    }
}