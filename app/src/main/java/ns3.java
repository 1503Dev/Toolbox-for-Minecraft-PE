package defpackage;

import java.util.Set;

/* renamed from: ns3  reason: default package */
public final class ns3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final Object d;

    public ns3(ea2 ea2Var, uj5 uj5Var) {
        zk4 zk4Var = lp5.R;
        this.a = 0;
        this.d = ea2Var;
        this.b = uj5Var;
        this.c = zk4Var;
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
                return new ut3((cu3) this.b.c(), ((ed3) this.c).a(), (String) ((uj5) this.d).c());
        }
    }

    public ns3(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3) {
        this.a = 1;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
    }
}