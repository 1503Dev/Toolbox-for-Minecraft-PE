package defpackage;

/* renamed from: wj5  reason: default package */
public final class wj5 extends fh2 {
    public final z61 P;
    public final Object Q;

    public wj5(z61 z61Var, Object obj) {
        this.P = z61Var;
        this.Q = obj;
    }

    @Override // defpackage.xh2
    public final void C0(tz3 tz3Var) {
        z61 z61Var = this.P;
        if (z61Var != null) {
            z61Var.M0(tz3Var.d());
        }
    }

    @Override // defpackage.xh2
    public final void d() {
        Object obj;
        z61 z61Var = this.P;
        if (z61Var == null || (obj = this.Q) == null) {
            return;
        }
        z61Var.O0(obj);
    }
}