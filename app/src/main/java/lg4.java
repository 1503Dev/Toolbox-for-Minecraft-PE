package defpackage;

/* renamed from: lg4  reason: default package */
public final class lg4 implements vg4 {
    public wc3 a;

    @Override // defpackage.vg4
    public final /* bridge */ /* synthetic */ dz4 a(wg4 wg4Var, ug4 ug4Var) {
        return b(wg4Var, ug4Var, null);
    }

    public final synchronized dz4 b(wg4 wg4Var, ug4 ug4Var, wc3 wc3Var) {
        hb3 c;
        if (wc3Var != null) {
            this.a = wc3Var;
        } else {
            this.a = (wc3) ug4Var.b(wg4Var.b).f();
        }
        c = this.a.c();
        return c.b(c.c());
    }

    @Override // defpackage.vg4
    public final Object i() {
        wc3 wc3Var;
        synchronized (this) {
            wc3Var = this.a;
        }
        return wc3Var;
    }
}