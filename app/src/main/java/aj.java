package defpackage;

/* renamed from: aj  reason: default package */
public final class aj extends x {
    public aj(boolean z, int i, g gVar) {
        super(z, i, gVar);
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        t v = this.R.h().v();
        if (!this.Q) {
            rVar.h(v.t() ? 160 : 128, this.P);
            rVar.e(v);
            return;
        }
        rVar.h(160, this.P);
        rVar.f(v.r());
        rVar.g(v);
    }

    @Override // defpackage.t
    public final int r() {
        int r = this.R.h().v().r();
        if (this.Q) {
            return eu0.a(r) + eu0.b(this.P) + r;
        }
        return eu0.b(this.P) + (r - 1);
    }

    @Override // defpackage.t
    public final boolean t() {
        if (this.Q) {
            return true;
        }
        return this.R.h().v().t();
    }
}