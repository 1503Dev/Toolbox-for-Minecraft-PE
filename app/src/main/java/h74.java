package defpackage;

/* renamed from: h74  reason: default package */
public final /* synthetic */ class h74 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ h74(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((i74) this.Q).T.d.c.p((tz3) this.R);
                return;
            case 1:
                ((ey4) this.Q).r((iv4) this.R);
                return;
            default:
                d16 d16Var = ((c16) this.Q).b;
                int i = zn4.a;
                pp5 pp5Var = ((xl5) d16Var).P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1030, new en2(2, G, (Exception) this.R));
                return;
        }
    }
}