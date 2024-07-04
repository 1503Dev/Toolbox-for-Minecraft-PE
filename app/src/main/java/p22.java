package defpackage;

/* renamed from: p22  reason: default package */
public final /* synthetic */ class p22 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ p22(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((t22) this.Q).c(3);
                return;
            case 1:
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    vx2 vx2Var = (vx2) rx2Var;
                    iy2 iy2Var = vx2Var.T;
                    iy2Var.Q = false;
                    wi4 wi4Var = cu5.i;
                    wi4Var.removeCallbacks(iy2Var);
                    wi4Var.postDelayed(iy2Var, 250L);
                    wi4Var.post(new gh4(1, vx2Var));
                    return;
                }
                return;
            case 2:
                ((wy4) this.Q).h(new vu3(3));
                return;
            default:
                ((tf4) this.Q).d.p(oj4.d(6, null, null));
                return;
        }
    }
}