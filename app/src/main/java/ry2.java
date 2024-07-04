package defpackage;

/* renamed from: ry2  reason: default package */
public final /* synthetic */ class ry2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ ry2(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                String str = (String) this.R;
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    ((vx2) rx2Var).c("exception", "what", "ExoPlayerAdapter exception", "extra", str);
                    return;
                }
                return;
            default:
                d24 d24Var = (d24) this.Q;
                y03 y03Var = (y03) this.R;
                d24Var.getClass();
                y03Var.l0();
                q13 q = y03Var.q();
                zq4 zq4Var = d24Var.d.a;
                if (zq4Var != null && q != null) {
                    q.v4(zq4Var);
                    return;
                }
                return;
        }
    }
}