package defpackage;

import java.util.Set;

/* renamed from: a93  reason: default package */
public final class a93 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final Object d;

    public /* synthetic */ a93(Object obj, uj5 uj5Var, int i) {
        zk4 zk4Var = lp5.R;
        this.a = i;
        this.d = obj;
        this.b = uj5Var;
        this.c = zk4Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((z93) this.b.c(), yw2Var);
            case 1:
                return new cp3((String) ((qa3) this.b).a.c, (jl3) this.c.c(), ((yl3) ((uj5) this.d)).a());
            default:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                Set L = ea2.L((os3) this.b.c(), yw2Var2);
                tv2.C(L);
                return L;
        }
    }

    public a93(uj5 uj5Var, jj5 jj5Var, uj5 uj5Var2) {
        this.a = 1;
        this.b = uj5Var;
        this.c = jj5Var;
        this.d = uj5Var2;
    }
}