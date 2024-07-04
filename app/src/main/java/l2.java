package defpackage;

/* renamed from: l2  reason: default package */
public final class l2 implements Runnable {
    public final /* synthetic */ z61 P;
    public final /* synthetic */ i2 Q;

    public l2(i2 i2Var, z61 z61Var) {
        this.Q = i2Var;
        this.P = z61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z61 z61Var = this.P;
        w1.a(this.Q.h);
        z61Var.V0();
    }
}