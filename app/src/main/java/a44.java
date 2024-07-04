package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;

/* renamed from: a44  reason: default package */
public final class a44 extends x34 {
    public final q23 a;
    public final xc3 b;
    public final y54 c;
    public final zg3 d;
    public final jk3 e;
    public final bf3 f;
    public final ViewGroup g;
    public final xf3 h;
    public final i44 i;
    public final j14 j;

    public a44(q23 q23Var, xc3 xc3Var, y54 y54Var, zg3 zg3Var, jk3 jk3Var, bf3 bf3Var, ViewGroup viewGroup, xf3 xf3Var, i44 i44Var, j14 j14Var) {
        this.a = q23Var;
        this.b = xc3Var;
        this.c = y54Var;
        this.d = zg3Var;
        this.e = jk3Var;
        this.f = bf3Var;
        this.g = viewGroup;
        this.h = xf3Var;
        this.i = i44Var;
        this.j = j14Var;
    }

    @Override // defpackage.x34
    public final el4 c(li4 li4Var, Bundle bundle, yh4 yh4Var, hi4 hi4Var) {
        xc3 xc3Var = this.b;
        xc3Var.b = li4Var;
        xc3Var.c = bundle;
        xc3Var.e = new rc3(hi4Var, yh4Var, this.i);
        if (((Boolean) w82.d.c.a(x92.R2)).booleanValue()) {
            this.b.f = this.j;
        }
        f43 e = this.a.e();
        xc3 xc3Var2 = this.b;
        xc3Var2.getClass();
        e.e = new yc3(xc3Var2);
        e.d = this.d;
        e.f = this.c;
        e.i = this.e;
        e.g = new x93(this.f, this.h);
        e.h = new e83(0, this.g);
        hb3 c = e.f().c();
        return c.b(c.c());
    }
}