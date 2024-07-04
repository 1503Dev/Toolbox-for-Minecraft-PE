package defpackage;

/* renamed from: wg1  reason: default package */
public final class wg1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ zg1 Q;

    public wg1(zg1 zg1Var, int i) {
        this.Q = zg1Var;
        this.P = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Q.f(this.P);
    }
}