package defpackage;

/* renamed from: x12  reason: default package */
public final class x12 extends c22 {
    public x12(l02 l02Var, gx1 gx1Var, int i) {
        super(l02Var, "7sn4HHbUg+T4b9n1KPrutL8tcrilMYlvs7RJQ5pmfB/1m2qwJzRoxivnCVXu/U+z", "apLnpmRDpCfdu10ORTmQ+sdRCmiB4EA8hGSHUeA9nD0=", gx1Var, i, 48);
    }

    @Override // defpackage.c22
    public final void b() {
        ey1 ey1Var;
        gx1 gx1Var = this.d;
        gx1Var.j();
        ey1.k0((ey1) gx1Var.Q, 3);
        int i = 1;
        boolean booleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
        synchronized (this.d) {
            if (booleanValue) {
                gx1 gx1Var2 = this.d;
                i = 2;
                gx1Var2.j();
                ey1Var = (ey1) gx1Var2.Q;
            } else {
                gx1 gx1Var3 = this.d;
                gx1Var3.j();
                ey1Var = (ey1) gx1Var3.Q;
            }
            ey1.k0(ey1Var, i);
        }
    }
}