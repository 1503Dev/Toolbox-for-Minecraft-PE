package defpackage;

import android.content.Context;

/* renamed from: n63  reason: default package */
public final class n63 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;

    public /* synthetic */ n63(uj5 uj5Var, int i) {
        this.a = i;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new m63((Context) this.b.c());
            case 1:
                z83 z83Var = (z83) this.b;
                return new z93(new it2(((t23) z83Var.a).a(), ((ed3) z83Var.b).a().f));
            case 2:
                return new ue3(((sj5) this.b).c());
            case 3:
                return new tg3(((sj5) this.b).c());
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new f64(yw2Var);
        }
    }
}