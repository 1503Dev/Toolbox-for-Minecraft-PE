package defpackage;

import android.content.Context;

/* renamed from: rc4  reason: default package */
public final class rc4 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public rc4(t23 t23Var, uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3) {
        zk4 zk4Var = lp5.R;
        this.a = t23Var;
        this.b = zk4Var;
        this.c = uj5Var;
        this.d = uj5Var2;
        this.e = uj5Var3;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final qc4 c() {
        Context a = ((t23) this.a).a();
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        return new qc4(a, yw2Var, ((sj5) this.c).c(), (qm4) this.d.c(), (zr3) this.e.c());
    }
}