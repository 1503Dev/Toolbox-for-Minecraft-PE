package defpackage;

import android.content.Context;

/* renamed from: jy3  reason: default package */
public final class jy3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public jy3(t23 t23Var, u33 u33Var, v33 v33Var, uj5 uj5Var) {
        this.a = t23Var;
        this.b = u33Var;
        this.c = v33Var;
        this.d = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Context a = ((t23) this.a).a();
        Object c = this.b.c();
        Object c2 = this.c.c();
        z63 z63Var = new z63(2, ((k33) ((py3) this.d).a).c());
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new iy3(a, (x93) c, (s33) c2, z63Var, yw2Var, new o7());
    }
}