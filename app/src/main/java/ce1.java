package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ce1  reason: default package */
public final class ce1 implements Callable<ic1> {
    public final /* synthetic */ long a = 2000;
    public final /* synthetic */ he1 b;

    public ce1(he1 he1Var) {
        this.b = he1Var;
    }

    @Override // java.util.concurrent.Callable
    public final ic1 call() {
        mc1 mc1Var = this.b.a;
        if (!mc1Var.a) {
            long j = this.a;
            if (j > 0) {
                mc1Var.a(j);
            }
        }
        return this.b.b();
    }
}