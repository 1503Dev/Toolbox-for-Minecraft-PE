package defpackage;

/* renamed from: d06  reason: default package */
public final /* synthetic */ class d06 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ d06(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((te0) this.Q).c(qa2.j, null);
                return;
            case 1:
                ((ch1) ((sh1) this.Q).V).b(new gf(4));
                return;
            case 2:
                ((ar3) this.Q).a();
                return;
            case 3:
                f64 f64Var = (f64) this.Q;
                f64Var.d.execute(new qy2(5, f64Var));
                return;
            default:
                xl4 xl4Var = (xl4) this.Q;
                while (!xl4Var.b.isEmpty()) {
                    xl4Var.a.a((vl4) xl4Var.b.remove());
                }
                return;
        }
    }
}