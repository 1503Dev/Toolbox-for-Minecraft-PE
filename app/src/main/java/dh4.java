package defpackage;

/* renamed from: dh4  reason: default package */
public final class dh4 implements wy4 {
    public final /* synthetic */ e74 P;
    public final /* synthetic */ qm4 Q;
    public final /* synthetic */ hm4 R;
    public final /* synthetic */ sj3 S;
    public final /* synthetic */ hh4 T;

    public dh4(hh4 hh4Var, e74 e74Var, qm4 qm4Var, hm4 hm4Var, s43 s43Var) {
        this.T = hh4Var;
        this.P = e74Var;
        this.Q = qm4Var;
        this.R = hm4Var;
        this.S = s43Var;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        qm4 qm4Var;
        dj3 dj3Var = (dj3) obj;
        synchronized (this.T) {
            try {
                this.T.i = null;
                l92 l92Var = x92.R6;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    nj2 nj2Var = dj3Var.g.P;
                    hh4 hh4Var = this.T;
                    t64 t64Var = hh4Var.d;
                    Object obj2 = nj2Var.Q;
                    ((of3) obj2).Q = t64Var;
                    ((of3) obj2).T = hh4Var.e;
                }
                this.P.f(dj3Var);
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    this.T.b.execute(new Runnable() { // from class: bh4
                        @Override // java.lang.Runnable
                        public final void run() {
                            dh4.this.T.d.k();
                        }
                    });
                    this.T.b.execute(new qx3(1, this));
                }
                if (((Boolean) fb2.c.d()).booleanValue() && (qm4Var = this.Q) != null) {
                    qm4Var.g(dj3Var.a.b);
                    qm4Var.f(dj3Var.f.P);
                    hm4 hm4Var = this.R;
                    hm4Var.k0(true);
                    qm4Var.b(hm4Var);
                    qm4Var.h();
                } else {
                    rm4 rm4Var = this.T.g;
                    hm4 hm4Var2 = this.R;
                    hm4Var2.c(dj3Var.a.b);
                    hm4Var2.P(dj3Var.f.P);
                    hm4Var2.k0(true);
                    rm4Var.c(hm4Var2.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        qm4 qm4Var;
        tz3 a = this.S.a().a(th);
        synchronized (this.T) {
            this.T.i = null;
            this.S.b().p(a);
            if (((Boolean) w82.d.c.a(x92.R6)).booleanValue()) {
                this.T.b.execute(new ch4(0, this, a));
                this.T.b.execute(new s13(1, this, a));
            }
            lj4.b(a.P, "InterstitialAdLoader.onFailure", th);
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