package defpackage;

/* renamed from: kx2  reason: default package */
public final class kx2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ qx2 R;

    public kx2(qx2 qx2Var, int i, int i2) {
        this.R = qx2Var;
        this.P = i;
        this.Q = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx2 rx2Var = this.R.h0;
        if (rx2Var != null) {
            ((vx2) rx2Var).h(this.P, this.Q);
        }
    }
}