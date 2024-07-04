package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dc3  reason: default package */
public final class dc3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ dc3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ii3((of3) this.b.c(), (Executor) this.c.c());
            default:
                i04 i04Var = (i04) this.b;
                lz3 lz3Var = (lz3) i04Var.b;
                h04 h04Var = new h04((hz3) i04Var.a.c(), new kz3(((fz3) lz3Var.a).c(), ((s23) lz3Var.b).c()));
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3(h04Var, yw2Var);
        }
    }
}