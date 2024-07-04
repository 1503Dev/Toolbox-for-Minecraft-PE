package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wa3  reason: default package */
public final class wa3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ wa3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ii3((ye3) this.b.c(), yw2Var);
            case 1:
                return new ii3((of3) this.b.c(), (Executor) this.c.c());
            case 2:
                yw2 yw2Var2 = zw2.a;
                tv2.C(yw2Var2);
                return new ii3((ut3) this.b.c(), yw2Var2);
            default:
                return new wy3((String) this.b.c(), (wl4) this.c.c());
        }
    }
}