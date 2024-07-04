package defpackage;

/* renamed from: w24  reason: default package */
public final class w24 extends bl2 implements je3 {
    public cl2 P;
    public n54 Q;

    @Override // defpackage.cl2
    public final synchronized void E() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.E();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void F() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.F();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void H0(qr2 qr2Var) {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.H0(qr2Var);
        }
    }

    @Override // defpackage.cl2
    public final synchronized void I(String str) {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.I(str);
        }
    }

    @Override // defpackage.cl2
    public final synchronized void K() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.K();
        }
        n54 n54Var = this.Q;
        if (n54Var != null) {
            synchronized (n54Var) {
                n54Var.c.a(null);
            }
        }
    }

    @Override // defpackage.cl2
    public final synchronized void K3(tr2 tr2Var) {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.K3(tr2Var);
        }
    }

    @Override // defpackage.cl2
    public final synchronized void P2(tz3 tz3Var) {
        n54 n54Var = this.Q;
        if (n54Var != null) {
            synchronized (n54Var) {
                if (!n54Var.a) {
                    n54Var.a = true;
                    n54Var.b(tz3Var);
                }
            }
        }
    }

    @Override // defpackage.cl2
    public final synchronized void Y() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.Y();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void b() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.b();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void e() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.e();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void e0(int i) {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.e0(i);
        }
    }

    @Override // defpackage.je3
    public final synchronized void e4(n54 n54Var) {
        this.Q = n54Var;
    }

    @Override // defpackage.cl2
    public final synchronized void g0(tz3 tz3Var) {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.g0(tz3Var);
        }
    }

    @Override // defpackage.cl2
    public final synchronized void k() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.k();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void m() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.m();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void m1(sd2 sd2Var, String str) {
    }

    @Override // defpackage.cl2
    public final synchronized void m2(String str, String str2) {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.m2(str, str2);
        }
    }

    @Override // defpackage.cl2
    public final synchronized void o() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.o();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void r() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.r();
        }
    }

    @Override // defpackage.cl2
    public final synchronized void u() {
        cl2 cl2Var = this.P;
        if (cl2Var != null) {
            cl2Var.u();
        }
    }

    public final synchronized void u4(q54 q54Var) {
        this.P = q54Var;
    }

    @Override // defpackage.cl2
    public final synchronized void v(int i) {
        n54 n54Var = this.Q;
        if (n54Var != null) {
            n54Var.a(i);
        }
    }

    @Override // defpackage.cl2
    public final synchronized void x1(int i, String str) {
        n54 n54Var = this.Q;
        if (n54Var != null) {
            synchronized (n54Var) {
                if (!n54Var.a) {
                    n54Var.a = true;
                    if (str == null) {
                        str = "Error from: " + n54Var.b.a + ", code: " + i;
                    }
                    n54Var.b(new tz3(i, str, "undefined", null, null));
                }
            }
        }
    }
}