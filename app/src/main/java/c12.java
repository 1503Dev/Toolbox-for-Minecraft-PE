package defpackage;

/* renamed from: c12  reason: default package */
public final class c12 extends c22 {
    public c12(l02 l02Var, gx1 gx1Var, int i) {
        super(l02Var, "9Ibp0iX8frxcDol5LCDOary7OEblvzOEr0WtPn69zRxHnh2qqHn8v0kanoAZtnND", "icVSPKCsokOqk/nN9ldgEGzs48x1unFAjrOT1dBDO7k=", gx1Var, i, 5);
    }

    @Override // defpackage.c22
    public final void b() {
        gx1 gx1Var = this.d;
        gx1Var.j();
        ey1.A0((ey1) gx1Var.Q, -1L);
        gx1 gx1Var2 = this.d;
        gx1Var2.j();
        ey1.B0((ey1) gx1Var2.Q, -1L);
        int[] iArr = (int[]) this.e.invoke(null, this.a.a);
        synchronized (this.d) {
            gx1 gx1Var3 = this.d;
            gx1Var3.j();
            ey1.A0((ey1) gx1Var3.Q, iArr[0]);
            gx1 gx1Var4 = this.d;
            long j = iArr[1];
            gx1Var4.j();
            ey1.B0((ey1) gx1Var4.Q, j);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                gx1 gx1Var5 = this.d;
                gx1Var5.j();
                ey1.R((ey1) gx1Var5.Q, i);
            }
        }
    }
}