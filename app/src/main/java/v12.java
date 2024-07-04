package defpackage;

/* renamed from: v12  reason: default package */
public final class v12 extends c22 {
    public final q02 h;
    public long i;

    public v12(l02 l02Var, gx1 gx1Var, int i, q02 q02Var) {
        super(l02Var, "xg6GNdV7fYR9czDPsYCpiIl0/69vO40WnrUnsYSb5exMDfWVVhFT+7O8xMnCz7QV", "mckfj+6L7YQAG+Kc7UoytYIs9AbnOm5Xq8IrT+DQQ5M=", gx1Var, i, 53);
        this.h = q02Var;
        if (q02Var != null) {
            if (q02Var.a0 <= -2 && q02Var.a() == null) {
                q02Var.a0 = -3L;
            }
            this.i = q02Var.a0;
        }
    }

    @Override // defpackage.c22
    public final void b() {
        if (this.h != null) {
            gx1 gx1Var = this.d;
            long longValue = ((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue();
            gx1Var.j();
            ey1.M((ey1) gx1Var.Q, longValue);
        }
    }
}