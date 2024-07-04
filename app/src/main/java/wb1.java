package defpackage;

/* renamed from: wb1  reason: default package */
public final class wb1 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ ka1 Q;
    public final /* synthetic */ ob1 R;
    public final /* synthetic */ pb1 S;

    public wb1(pb1 pb1Var, String str, ka1 ka1Var, ob1 ob1Var) {
        this.S = pb1Var;
        this.P = str;
        this.Q = ka1Var;
        this.R = ob1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zd1 zd1Var;
        int i;
        try {
            i2 i2Var = this.S.c.get(this.P);
            z1 z1Var = this.S.f.get(this.P);
            if (i2Var == null) {
                zd1Var = null;
            } else {
                zd1Var = i2Var.d;
            }
            if (zd1Var == null && z1Var != null) {
                zd1Var = z1Var.getOmidManager();
            }
            if (zd1Var == null) {
                i = -1;
            } else {
                i = zd1Var.e;
            }
            if (zd1Var != null && i == 2) {
                zd1Var.a(this.Q);
                zd1Var.b(this.R);
            }
        } catch (IllegalArgumentException unused) {
            t1.b(0, 0, "IllegalArgumentException when creating omid session", true);
        }
    }
}