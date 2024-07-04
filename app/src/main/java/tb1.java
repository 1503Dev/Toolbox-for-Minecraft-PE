package defpackage;

/* renamed from: tb1  reason: default package */
public final class tb1 implements Runnable {
    public final /* synthetic */ a2 P;

    public tb1(a2 a2Var) {
        this.P = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w1.a(this.P.a);
        if (!ga1.i()) {
            t1.b(0, 0, "RequestNotFilled called for AdView due to a missing context. ", true);
        }
    }
}