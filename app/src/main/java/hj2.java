package defpackage;

/* renamed from: hj2  reason: default package */
public final class hj2 implements dx2 {
    public final /* synthetic */ qj2 P;
    public final /* synthetic */ hm4 Q;
    public final /* synthetic */ rj2 R;

    public hj2(rj2 rj2Var, qj2 qj2Var, hm4 hm4Var) {
        this.R = rj2Var;
        this.P = qj2Var;
        this.Q = hm4Var;
    }

    @Override // defpackage.dx2, defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        rm4 rm4Var;
        synchronized (this.R.a) {
            try {
                this.R.g = 1;
                vz3.k("Failed loading new engine. Marking new engine destroyable.");
                this.P.i();
                if (((Boolean) fb2.d.d()).booleanValue() && (rm4Var = this.R.e) != null) {
                    hm4 hm4Var = this.Q;
                    hm4Var.k0(false);
                    rm4Var.c(hm4Var.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}