package defpackage;

import java.util.concurrent.Executor;

/* renamed from: oh4  reason: default package */
public final class oh4 implements wy4 {
    public final /* synthetic */ e74 P;
    public final /* synthetic */ qm4 Q;
    public final /* synthetic */ hm4 R;
    public final /* synthetic */ ph4 S;
    public final /* synthetic */ qh4 T;

    public oh4(qh4 qh4Var, e74 e74Var, qm4 qm4Var, hm4 hm4Var, ph4 ph4Var) {
        this.T = qh4Var;
        this.P = e74Var;
        this.Q = qm4Var;
        this.R = hm4Var;
        this.S = ph4Var;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        qm4 qm4Var;
        yp3 yp3Var = (yp3) obj;
        synchronized (this.T) {
            ((of3) yp3Var.g.P.Q).T = this.T.d;
            this.P.f(yp3Var);
            qh4 qh4Var = this.T;
            Executor executor = qh4Var.b;
            mh4 mh4Var = qh4Var.d;
            mh4Var.getClass();
            executor.execute(new c32(2, mh4Var));
            this.T.d.a();
            if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                qm4Var.g(yp3Var.a.b);
                qm4Var.f(yp3Var.f.P);
                hm4 hm4Var = this.R;
                hm4Var.k0(true);
                qm4Var.b(hm4Var);
                qm4Var.h();
            } else {
                rm4 rm4Var = this.T.g;
                hm4 hm4Var2 = this.R;
                hm4Var2.c(yp3Var.a.b);
                hm4Var2.P(yp3Var.f.P);
                hm4Var2.k0(true);
                rm4Var.c(hm4Var2.n());
            }
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        tz3 a;
        qm4 qm4Var;
        bq3 bq3Var = (bq3) this.T.e.i();
        if (bq3Var == null) {
            a = oj4.b(th, null);
        } else {
            a = bq3Var.c().a(th);
        }
        synchronized (this.T) {
            if (bq3Var != null) {
                bq3Var.a().p(a);
                this.T.b.execute(new g32(1, this, a));
            } else {
                this.T.d.p(a);
                this.T.c(this.S).f().c().f.i();
            }
            lj4.b(a.P, "RewardedAdLoader.onFailure", th);
            this.P.mo1a();
            if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                qm4Var.d(a);
                hm4 hm4Var = this.R;
                hm4Var.b(th);
                hm4Var.k0(false);
                qm4Var.b(hm4Var);
                qm4Var.h();
            } else {
                rm4 rm4Var = this.T.g;
                hm4 hm4Var2 = this.R;
                hm4Var2.p(a);
                hm4Var2.b(th);
                hm4Var2.k0(false);
                rm4Var.c(hm4Var2.n());
            }
        }
    }
}