package defpackage;

import java.util.Set;

/* renamed from: f93  reason: default package */
public final class f93 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final Object d;

    public f93(ea2 ea2Var, uj5 uj5Var) {
        zk4 zk4Var = lp5.R;
        this.a = 1;
        this.d = ea2Var;
        this.b = uj5Var;
        this.c = zk4Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((l93) this.b).c().booleanValue();
                a44 c = ((b44) this.c).c();
                o54 c2 = ((p54) ((uj5) this.d)).c();
                if (true != booleanValue) {
                    return c2;
                }
                return c;
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                Set L = ea2.L((os3) this.b.c(), yw2Var);
                tv2.C(L);
                return L;
        }
    }

    public f93(l93 l93Var, b44 b44Var, p54 p54Var) {
        this.a = 0;
        this.b = l93Var;
        this.c = b44Var;
        this.d = p54Var;
    }
}