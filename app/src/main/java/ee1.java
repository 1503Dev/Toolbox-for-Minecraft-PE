package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ee1  reason: default package */
public final class ee1 implements Callable<ic1> {
    public final /* synthetic */ long a = 2000;
    public final /* synthetic */ he1 b;

    public ee1(he1 he1Var) {
        this.b = he1Var;
    }

    @Override // java.util.concurrent.Callable
    public final ic1 call() {
        mc1 mc1Var = this.b.b;
        if (!mc1Var.a) {
            long j = this.a;
            if (j > 0) {
                mc1Var.a(j);
            }
        }
        he1 he1Var = this.b;
        he1Var.getClass();
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "app_set_id", he1Var.e);
        return ic1Var;
    }
}