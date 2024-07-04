package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: g12  reason: default package */
public final class g12 implements Callable {
    public final l02 a;
    public final gx1 b;

    public g12(l02 l02Var, gx1 gx1Var) {
        this.a = l02Var;
        this.b = gx1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Future future = this.a.k;
        if (future != null) {
            future.get();
        }
        ey1 ey1Var = this.a.j;
        if (ey1Var != null) {
            try {
                synchronized (this.b) {
                    gx1 gx1Var = this.b;
                    byte[] D = ey1Var.D();
                    gx1Var.f(D, D.length, ud5.c);
                }
                return null;
            } catch (NullPointerException | te5 unused) {
                return null;
            }
        }
        return null;
    }
}