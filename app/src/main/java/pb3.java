package defpackage;

/* renamed from: pb3  reason: default package */
public final class pb3 implements le3, vj1, ff3, ae3, nd3, ug3 {
    public final kd P;
    public final ru2 Q;

    public pb3(kd kdVar, ru2 ru2Var) {
        this.P = kdVar;
        this.Q = ru2Var;
    }

    @Override // defpackage.vj1
    public final void J() {
        ru2 ru2Var = this.Q;
        synchronized (ru2Var.d) {
            if (ru2Var.k != -1) {
                qu2 qu2Var = new qu2(ru2Var);
                qu2Var.a = ru2Var.a.b();
                ru2Var.c.add(qu2Var);
                ru2Var.i++;
                hv2 hv2Var = ru2Var.b;
                synchronized (hv2Var.a) {
                    zu2 zu2Var = hv2Var.d;
                    synchronized (zu2Var.f) {
                        zu2Var.i++;
                    }
                }
                ru2Var.b.a(ru2Var);
            }
        }
    }

    @Override // defpackage.nd3
    public final void K() {
    }

    @Override // defpackage.ug3
    public final void M0(d62 d62Var) {
        ru2 ru2Var = this.Q;
        synchronized (ru2Var.d) {
            hv2 hv2Var = ru2Var.b;
            synchronized (hv2Var.a) {
                hv2Var.d.b();
            }
        }
    }

    @Override // defpackage.ug3
    public final void U(boolean z) {
    }

    public final void a(pn5 pn5Var) {
        ru2 ru2Var = this.Q;
        synchronized (ru2Var.d) {
            long b = ru2Var.a.b();
            ru2Var.j = b;
            hv2 hv2Var = ru2Var.b;
            synchronized (hv2Var.a) {
                hv2Var.d.a(pn5Var, b);
            }
        }
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
        ru2 ru2Var = this.Q;
        long b = this.P.b();
        synchronized (ru2Var.d) {
            ru2Var.k = b;
            if (b != -1) {
                ru2Var.b.a(ru2Var);
            }
        }
    }

    @Override // defpackage.ug3
    public final void i() {
    }

    @Override // defpackage.nd3
    public final void j() {
        ru2 ru2Var = this.Q;
        synchronized (ru2Var.d) {
            if (ru2Var.k != -1 && !ru2Var.c.isEmpty()) {
                qu2 qu2Var = (qu2) ru2Var.c.getLast();
                if (qu2Var.b == -1) {
                    qu2Var.b = qu2Var.c.a.b();
                    ru2Var.b.a(ru2Var);
                }
            }
        }
    }

    @Override // defpackage.le3
    public final void k() {
        ru2 ru2Var = this.Q;
        synchronized (ru2Var.d) {
            if (ru2Var.k != -1) {
                ru2Var.h = ru2Var.a.b();
            }
        }
    }

    @Override // defpackage.nd3
    public final void l(cr2 cr2Var, String str, String str2) {
    }

    @Override // defpackage.nd3
    public final void m() {
    }

    @Override // defpackage.ae3
    public final void n() {
        ru2 ru2Var = this.Q;
        synchronized (ru2Var.d) {
            if (ru2Var.k != -1 && ru2Var.g == -1) {
                ru2Var.g = ru2Var.a.b();
                ru2Var.b.a(ru2Var);
            }
            hv2 hv2Var = ru2Var.b;
            synchronized (hv2Var.a) {
                zu2 zu2Var = hv2Var.d;
                synchronized (zu2Var.f) {
                    zu2Var.j++;
                }
            }
        }
    }

    @Override // defpackage.ug3
    public final void n0(d62 d62Var) {
    }

    @Override // defpackage.nd3
    public final void o() {
    }

    @Override // defpackage.nd3
    public final void q() {
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
    }

    @Override // defpackage.ug3
    public final void r0(boolean z) {
    }

    @Override // defpackage.ug3
    public final void v0(d62 d62Var) {
        ru2 ru2Var = this.Q;
        synchronized (ru2Var.d) {
            hv2 hv2Var = ru2Var.b;
            synchronized (hv2Var.a) {
                hv2Var.d.b();
            }
        }
    }
}