package defpackage;

import android.content.Context;

/* renamed from: k33  reason: default package */
public final class k33 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public k33(t23 t23Var, uj5 uj5Var) {
        this.a = t23Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final zq2 c() {
        Context a = ((t23) this.a).a();
        rm4 rm4Var = (rm4) this.b.c();
        jv5 jv5Var = jv5.A;
        zj2 b = jv5Var.p.b(a, xv2.c(), rm4Var);
        gw gwVar = yj2.b;
        b.getClass();
        return new zq2(a, jv5Var.p.b(a, xv2.c(), rm4Var).a("google.afma.sdkConstants.getSdkConstants", gwVar, gwVar));
    }
}