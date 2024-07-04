package defpackage;

import java.util.concurrent.Executor;

/* renamed from: h73  reason: default package */
public final class h73 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ h73(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new g73(((t23) this.b).a(), (o22) this.c.c());
            case 1:
                return new ii3((of3) this.b.c(), (Executor) this.c.c());
            case 2:
                return new yy3(((sj5) this.b).c(), (vl4) this.c.c());
            default:
                vc4 vc4Var = (vc4) this.b;
                vc4Var.getClass();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new p94(new uc4(((t23) vc4Var.b).a(), yw2Var), ((Long) cb2.a.d()).longValue(), (kd) this.c.c());
        }
    }
}