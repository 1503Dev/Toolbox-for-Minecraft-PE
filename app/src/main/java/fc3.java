package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fc3  reason: default package */
public final class fc3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ fc3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ii3((of3) this.b.c(), (Executor) this.c.c());
            case 1:
                return new xs3((ys3) this.b.c(), new vs3((gh2) ((ws3) this.c).a.c()));
            default:
                return new ju3(((t23) this.b).a(), ((f33) this.c).a());
        }
    }
}