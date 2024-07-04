package defpackage;

/* renamed from: sb1  reason: default package */
public final class sb1 implements Runnable {
    public final /* synthetic */ rc1 P;
    public final /* synthetic */ i2 Q;
    public final /* synthetic */ z61 R;

    public sb1(rc1 rc1Var, i2 i2Var, z61 z61Var) {
        this.P = rc1Var;
        this.Q = i2Var;
        this.R = z61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ic1 ic1Var = this.P.b;
        i2 i2Var = this.Q;
        if (i2Var.d == null) {
            ic1 n = ic1Var.n("iab");
            if (!n.f()) {
                i2Var.d = new zd1(n, i2Var.f);
            }
        }
        this.Q.g = ic1Var.q("ad_id");
        i2 i2Var2 = this.Q;
        ic1Var.q("creative_id");
        i2Var2.getClass();
        this.Q.m = ic1Var.q("view_network_pass_filter");
        zd1 zd1Var = this.Q.d;
        if (zd1Var != null && zd1Var.e != 2) {
            try {
                zd1Var.a(null);
            } catch (IllegalArgumentException unused) {
                t1.b(0, 0, "IllegalArgumentException when creating omid session", true);
            }
        }
        this.R.U0(this.Q);
    }
}