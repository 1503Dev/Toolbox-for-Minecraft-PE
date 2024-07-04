package defpackage;

/* renamed from: uu2  reason: default package */
public final class uu2 extends r82 {
    public final /* synthetic */ yu2 b;

    public uu2(yu2 yu2Var) {
        this.b = yu2Var;
    }

    @Override // defpackage.r82
    public final void a() {
        yu2 yu2Var = this.b;
        ba2 ba2Var = new ba2(yu2Var.e, yu2Var.f.P);
        synchronized (this.b.a) {
            try {
                da2 da2Var = jv5.A.l;
                da2.l(this.b.h, ba2Var);
            } catch (IllegalArgumentException e) {
                sv2.h("Cannot config CSI reporter.", e);
            }
        }
    }
}