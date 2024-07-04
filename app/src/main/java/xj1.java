package defpackage;

/* renamed from: xj1  reason: default package */
public final class xj1 implements Runnable {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ xj1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vw5[] vw5VarArr;
        switch (this.P) {
            case 0:
                Thread.currentThread();
                ((r82) this.Q).getClass();
                ((r82) this.Q).a();
                return;
            case 1:
                ((ui2) this.Q).d();
                return;
            case 2:
                rx2 rx2Var = ((qx2) this.Q).h0;
                if (rx2Var != null) {
                    vx2 vx2Var = (vx2) rx2Var;
                    vx2Var.c("pause", new String[0]);
                    vx2Var.b();
                    vx2Var.W = false;
                    ((vx2) ((qx2) this.Q).h0).g();
                    return;
                }
                return;
            case 3:
                ((c73) this.Q).P.d.f();
                return;
            case 4:
                ((go5) this.Q).c();
                return;
            case 5:
                ((mw5) this.Q).q0 = true;
                return;
            default:
                mw5 mw5Var = (mw5) ((pz5) this.Q);
                for (vw5 vw5Var : mw5Var.d0) {
                    vw5Var.j(true);
                    if (vw5Var.A != null) {
                        vw5Var.A = null;
                        vw5Var.f = null;
                    }
                }
                ou5 ou5Var = (ou5) mw5Var.W;
                if (ou5Var.b != null) {
                    ou5Var.b = null;
                }
                ou5Var.c = null;
                return;
        }
    }
}