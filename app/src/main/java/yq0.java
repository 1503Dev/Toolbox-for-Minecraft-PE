package defpackage;

import defpackage.e0;

/* renamed from: yq0  reason: default package */
public final class yq0<V> extends e0<V> {
    public final boolean j(V v) {
        if (v == null) {
            v = (V) e0.V;
        }
        if (e0.U.b(this, null, v)) {
            e0.d(this);
            return true;
        }
        return false;
    }

    public final boolean k(Throwable th) {
        th.getClass();
        if (e0.U.b(this, null, new e0.c(th))) {
            e0.d(this);
            return true;
        }
        return false;
    }

    public final boolean l(i20<? extends V> i20Var) {
        e0.c cVar;
        i20Var.getClass();
        Object obj = this.P;
        if (obj == null) {
            if (((e0) i20Var).isDone()) {
                if (!e0.U.b(this, null, e0.g(i20Var))) {
                    return false;
                }
                e0.d(this);
            } else {
                e0.f fVar = new e0.f(this, i20Var);
                if (e0.U.b(this, null, fVar)) {
                    try {
                        ((e0) i20Var).c(fVar, vl.P);
                    } catch (Throwable th) {
                        try {
                            cVar = new e0.c(th);
                        } catch (Throwable unused) {
                            cVar = e0.c.b;
                        }
                        e0.U.b(this, fVar, cVar);
                    }
                } else {
                    obj = this.P;
                }
            }
            return true;
        }
        if (!(obj instanceof e0.b)) {
            return false;
        }
        ((e0) i20Var).cancel(((e0.b) obj).a);
        return false;
    }
}