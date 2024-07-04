package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bc3  reason: default package */
public final class bc3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public bc3(hj3 hj3Var, uj5 uj5Var) {
        this.a = 3;
        this.c = hj3Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new ii3((of3) this.b.c(), (Executor) ((uj5) this.c).c());
            case 1:
                return new hr3((j52) this.b.c(), (zg4) ((uj5) this.c).c());
            case 2:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((gz3) this.b.c(), yw2Var);
            default:
                return new ii3((xj3) this.b.c(), zw2.e);
        }
    }

    public /* synthetic */ bc3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }
}