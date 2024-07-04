package defpackage;

/* renamed from: ri  reason: default package */
public final class ri extends x {
    public ri(boolean z, int i, g gVar) {
        super(z, i, gVar);
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        t u = this.R.h().u();
        if (!this.Q) {
            rVar.h(u.t() ? 160 : 128, this.P);
            rVar.e(u);
            return;
        }
        rVar.h(160, this.P);
        rVar.f(u.r());
        rVar.g(u);
    }

    @Override // defpackage.t
    public final int r() {
        int r = this.R.h().u().r();
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
        return this.R.h().u().t();
    }
}