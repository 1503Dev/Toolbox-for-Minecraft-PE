package defpackage;

/* renamed from: i74  reason: default package */
public final class i74 implements wy4 {
    public final /* synthetic */ e74 P;
    public final /* synthetic */ qm4 Q;
    public final /* synthetic */ hm4 R;
    public final /* synthetic */ nk3 S;
    public final /* synthetic */ j74 T;

    public i74(j74 j74Var, fb3 fb3Var, qm4 qm4Var, hm4 hm4Var, n33 n33Var) {
        this.T = j74Var;
        this.P = fb3Var;
        this.Q = qm4Var;
        this.R = hm4Var;
        this.S = n33Var;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        qm4 qm4Var;
        ea3 ea3Var = (ea3) obj;
        synchronized (this.T) {
            ((of3) ea3Var.g.P.Q).Q = this.T.d.b;
            this.P.f(ea3Var);
            this.T.b.a().execute(new j02(3, this));
            if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                qm4Var.g(ea3Var.a.b);
                qm4Var.f(ea3Var.f.P);
                hm4 hm4Var = this.R;
                hm4Var.k0(true);
                qm4Var.b(hm4Var);
                qm4Var.h();
            } else {
                rm4 rm4Var = this.T.e;
                hm4 hm4Var2 = this.R;
                hm4Var2.c(ea3Var.a.b);
                hm4Var2.P(ea3Var.f.P);
                hm4Var2.k0(true);
                rm4Var.c(hm4Var2.n());
            }
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        qm4 qm4Var;
        tz3 a = this.S.a().a(th);
        this.S.b().p(a);
        this.T.b.a().execute(new h74(0, this, a));
        lj4.b(a.P, "NativeAdLoader.onFailure", th);
        this.P.mo1a();
        if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
            qm4Var.d(a);
            hm4 hm4Var = this.R;
            hm4Var.b(th);
            hm4Var.k0(false);
            qm4Var.b(hm4Var);
            qm4Var.h();
            return;
        }
        rm4 rm4Var = this.T.e;
        hm4 hm4Var2 = this.R;
        hm4Var2.p(a);
        hm4Var2.b(th);
        hm4Var2.k0(false);
        rm4Var.c(hm4Var2.n());
    }
}