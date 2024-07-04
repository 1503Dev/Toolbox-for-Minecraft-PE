package defpackage;

/* renamed from: bf4  reason: default package */
public final class bf4 implements wy4 {
    public final /* synthetic */ e74 P;
    public final /* synthetic */ qm4 Q;
    public final /* synthetic */ hm4 R;
    public final /* synthetic */ cf4 S;
    public final /* synthetic */ df4 T;

    public bf4(df4 df4Var, e74 e74Var, qm4 qm4Var, hm4 hm4Var, cf4 cf4Var) {
        this.T = df4Var;
        this.P = e74Var;
        this.Q = qm4Var;
        this.R = hm4Var;
        this.S = cf4Var;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        qm4 qm4Var;
        ea3 ea3Var = (ea3) obj;
        synchronized (this.T) {
            this.T.j = null;
            if (((Boolean) w82.d.c.a(x92.Q6)).booleanValue()) {
                ((of3) ea3Var.g.P.Q).S = this.T.d;
            }
            this.P.f(ea3Var);
            if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                qm4Var.g(ea3Var.a.b);
                qm4Var.f(ea3Var.f.P);
                hm4 hm4Var = this.R;
                hm4Var.k0(true);
                qm4Var.b(hm4Var);
                qm4Var.h();
            } else {
                rm4 rm4Var = this.T.h;
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
        tz3 a;
        qm4 qm4Var;
        v73 v73Var = (v73) this.T.e.i();
        if (v73Var == null) {
            a = oj4.b(th, null);
        } else {
            a = v73Var.c().a(th);
        }
        synchronized (this.T) {
            df4 df4Var = this.T;
            df4Var.j = null;
            if (v73Var != null) {
                v73Var.d().p(a);
                if (((Boolean) w82.d.c.a(x92.Q6)).booleanValue()) {
                    this.T.b.execute(new us2(3, this, a));
                }
            } else {
                df4Var.d.p(a);
                this.T.c(this.S).f().c().f.i();
            }
            lj4.b(a.P, "AppOpenAdLoader.onFailure", th);
            this.P.mo1a();
            if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                qm4Var.d(a);
                hm4 hm4Var = this.R;
                hm4Var.b(th);
                hm4Var.k0(false);
                qm4Var.b(hm4Var);
                qm4Var.h();
            } else {
                rm4 rm4Var = this.T.h;
                hm4 hm4Var2 = this.R;
                hm4Var2.p(a);
                hm4Var2.b(th);
                hm4Var2.k0(false);
                rm4Var.c(hm4Var2.n());
            }
        }
    }
}