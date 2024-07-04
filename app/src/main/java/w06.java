package defpackage;

/* renamed from: w06  reason: default package */
public final /* synthetic */ class w06 implements Runnable {
    public final /* synthetic */ int P = 0;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public w06(xn5 xn5Var, yv0 yv0Var) {
        this.R = xn5Var;
        this.Q = yv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                d16 d16Var = ((c16) this.Q).b;
                int i = zn4.a;
                xl5 xl5Var = (xl5) d16Var;
                bm5 bm5Var = xl5Var.P;
                int i2 = bm5.X;
                bm5Var.getClass();
                pp5 pp5Var = xl5Var.P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1015, new wq1(G, (nk5) this.R));
                return;
            default:
                synchronized (((xn5) this.R).Q) {
                    bc0 bc0Var = ((xn5) this.R).R;
                    if (bc0Var != null) {
                        Exception h = ((yv0) this.Q).h();
                        uf0.f(h);
                        bc0Var.c(h);
                    }
                }
                return;
        }
    }

    public /* synthetic */ w06(c16 c16Var, nk5 nk5Var) {
        this.Q = c16Var;
        this.R = nk5Var;
    }
}