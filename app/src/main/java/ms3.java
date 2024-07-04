package defpackage;

import java.util.Set;

/* renamed from: ms3  reason: default package */
public final class ms3 implements lj5 {
    public final /* synthetic */ int a = 0;
    public final uj5 b;
    public final Object c;

    public ms3(ea2 ea2Var, uj5 uj5Var) {
        this.c = ea2Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                Set L = ea2.L((os3) this.b.c(), yw2Var);
                tv2.C(L);
                return L;
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new bc4((qt2) this.b.c(), yw2Var2, ((t23) ((uj5) this.c)).a());
        }
    }

    public ms3(uj5 uj5Var, t23 t23Var) {
        this.b = uj5Var;
        this.c = t23Var;
    }
}