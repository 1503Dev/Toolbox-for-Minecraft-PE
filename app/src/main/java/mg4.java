package defpackage;

/* renamed from: mg4  reason: default package */
public final class mg4 implements vg4 {
    public final vg4 a;
    public wc3 b;

    public mg4(lg4 lg4Var) {
        this.a = lg4Var;
    }

    @Override // defpackage.vg4
    public final /* bridge */ /* synthetic */ dz4 a(wg4 wg4Var, ug4 ug4Var) {
        return b(wg4Var, ug4Var, null);
    }

    public final synchronized dz4 b(wg4 wg4Var, ug4 ug4Var, wc3 wc3Var) {
        this.b = wc3Var;
        if (wg4Var.a == null) {
            return ((lg4) this.a).b(wg4Var, ug4Var, wc3Var);
        }
        hb3 c = wc3Var.c();
        return c.b(c.d(zw4.C(wg4Var.a)));
    }

    @Override // defpackage.vg4
    public final Object i() {
        wc3 wc3Var;
        synchronized (this) {
            wc3Var = this.b;
        }
        return wc3Var;
    }
}