package defpackage;

import android.os.Bundle;
import javax.annotation.Nullable;

/* renamed from: e44  reason: default package */
public final class e44 extends x34 {
    public final q23 a;
    public final xc3 b;
    public final zg3 c;
    public final i44 d;
    @Nullable
    public final ii4 e;
    public final j14 f;

    public e44(q23 q23Var, xc3 xc3Var, zg3 zg3Var, @Nullable ii4 ii4Var, i44 i44Var, j14 j14Var) {
        this.a = q23Var;
        this.b = xc3Var;
        this.c = zg3Var;
        this.e = ii4Var;
        this.d = i44Var;
        this.f = j14Var;
    }

    @Override // defpackage.x34
    public final el4 c(li4 li4Var, Bundle bundle, yh4 yh4Var, hi4 hi4Var) {
        ii4 ii4Var;
        xc3 xc3Var = this.b;
        xc3Var.b = li4Var;
        xc3Var.c = bundle;
        xc3Var.e = new rc3(hi4Var, yh4Var, this.d);
        l92 l92Var = x92.Q2;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && (ii4Var = this.e) != null) {
            this.b.d = ii4Var;
        }
        if (((Boolean) w82Var.c.a(x92.R2)).booleanValue()) {
            this.b.f = this.f;
        }
        rh i = this.a.i();
        xc3 xc3Var2 = this.b;
        xc3Var2.getClass();
        i.e = new yc3(xc3Var2);
        i.d = this.c;
        hb3 c = i.f().c();
        return c.b(c.c());
    }
}