package defpackage;

import java.util.Set;

/* renamed from: l73  reason: default package */
public final class l73 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public l73(uj5 uj5Var) {
        zk4 zk4Var = lp5.R;
        this.a = 1;
        this.b = uj5Var;
        this.c = zk4Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                yw2 t = tv2.t();
                tv2.C(t);
                return new e73(((o22) this.b.c()).c, (jk2) this.c.c(), t);
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                Set L = ea2.L((os3) this.b.c(), yw2Var);
                tv2.C(L);
                return L;
        }
    }

    public l73(uj5 uj5Var, uj5 uj5Var2) {
        su3 su3Var = u92.T;
        this.a = 0;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = su3Var;
    }
}