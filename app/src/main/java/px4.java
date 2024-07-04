package defpackage;

/* renamed from: px4  reason: default package */
public final class px4<V> implements Runnable {
    public final vx4<V> P;
    public final dz4<? extends V> Q;

    public px4(vx4 vx4Var, dz4 dz4Var) {
        this.P = vx4Var;
        this.Q = dz4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.P.P != this) {
            return;
        }
        if (vx4.U.f(this.P, this, vx4.j(this.Q))) {
            vx4.p(this.P, false);
        }
    }
}