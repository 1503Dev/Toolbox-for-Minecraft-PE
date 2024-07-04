package defpackage;

/* renamed from: oc0  reason: default package */
public final /* synthetic */ class oc0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ oc0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                tc0 tc0Var = (tc0) this.Q;
                tc0Var.k = false;
                tc0Var.c();
                return;
            default:
                hy0 hy0Var = (hy0) this.Q;
                ((iy0) hy0Var.p).H(hy0Var.e);
                return;
        }
    }
}