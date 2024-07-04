package defpackage;

import android.content.Context;

/* renamed from: rr3  reason: default package */
public final class rr3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;

    public rr3(t23 t23Var, uj5 uj5Var, uj5 uj5Var2, sa3 sa3Var, uj5 uj5Var3, uj5 uj5Var4) {
        this.a = t23Var;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = sa3Var;
        this.e = uj5Var3;
        this.f = uj5Var4;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Context a = ((t23) this.a).a();
        jj4 jj4Var = (jj4) this.b.c();
        zr3 zr3Var = (zr3) this.c.c();
        hi4 hi4Var = (hi4) ((sa3) this.d).a.a;
        tv2.C(hi4Var);
        return new qr3(a, jj4Var, zr3Var, hi4Var, ((pa3) this.e).a(), (r04) this.f.c());
    }
}