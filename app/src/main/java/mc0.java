package defpackage;

/* renamed from: mc0  reason: default package */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ mc0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                tc0 tc0Var = (tc0) this.Q;
                tc0Var.j = false;
                tc0Var.l = 0;
                tc0Var.b();
                return;
            case 1:
                ((fz0) this.Q).dismiss();
                return;
            default:
                w20 w20Var = (w20) this.Q;
                if (w20Var.d) {
                    w20Var.d = false;
                    w20Var.b();
                    return;
                }
                return;
        }
    }
}