package defpackage;

import android.content.Context;

/* renamed from: eu3  reason: default package */
public final class eu3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public /* synthetic */ eu3(uj5 uj5Var, uj5 uj5Var2, lj5 lj5Var, lj5 lj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = lj5Var;
        this.e = lj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new qu3(((t23) this.b).a(), (ju3) this.c.c(), yw2Var);
            case 1:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new e34((Context) this.b.c(), ((f33) this.c).a(), (sj3) this.d.c(), yw2Var2);
            default:
                d64 d64Var = (d64) this.e;
                Context context = (Context) d64Var.a.c();
                return new x54((ol4) this.b.c(), (ez4) this.c.c(), (sa2) ((z54) this.d).a.P, new c64((sj3) d64Var.b.c()));
        }
    }
}