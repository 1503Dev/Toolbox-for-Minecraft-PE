package defpackage;

import java.util.Set;

/* renamed from: e93  reason: default package */
public final class e93 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final Object d;

    public e93(ea2 ea2Var, uj5 uj5Var) {
        zk4 zk4Var = lp5.R;
        this.a = 2;
        this.d = ea2Var;
        this.b = uj5Var;
        this.c = zk4Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                li4 a = ((ed3) this.b).a();
                u24 c = ((v24) this.c).c();
                d24 c2 = ((e24) ((uj5) this.d)).c();
                if (a.a() == null) {
                    return c2;
                }
                return c;
            case 1:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ec4(yw2Var, ((t23) this.c).a(), ((f33) ((uj5) this.d)).a());
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                Set L = ea2.L((os3) this.b.c(), yw2Var2);
                tv2.C(L);
                return L;
        }
    }

    public /* synthetic */ e93(lj5 lj5Var, lj5 lj5Var2, lj5 lj5Var3, int i) {
        this.a = i;
        this.b = lj5Var;
        this.c = lj5Var2;
        this.d = lj5Var3;
    }
}