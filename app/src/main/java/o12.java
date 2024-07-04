package defpackage;

/* renamed from: o12  reason: default package */
public final class o12 extends c22 {
    public static volatile String h;
    public static final Object i = new Object();

    public o12(l02 l02Var, gx1 gx1Var, int i2) {
        super(l02Var, "NVotBewebesTf3yaQqbfIHsAQGGO5mYV6zcO8zQG+1Te4y/3fFN6rm5Uo4mLM7YY", "Tgl2ye65VdPWpGRA4PcAavXIUkvdg+RB2j/Kpy7fLYc=", gx1Var, i2, 1);
    }

    @Override // defpackage.c22
    public final void b() {
        gx1 gx1Var = this.d;
        gx1Var.j();
        ey1.x0((ey1) gx1Var.Q, "E");
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.d) {
            gx1 gx1Var2 = this.d;
            String str = h;
            gx1Var2.j();
            ey1.x0((ey1) gx1Var2.Q, str);
        }
    }
}