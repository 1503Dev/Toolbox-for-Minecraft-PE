package defpackage;

import javax.annotation.Nullable;

/* renamed from: hr3  reason: default package */
public final class hr3 implements ff3, le3, qd3, ae3, vj1, ug3 {
    public final j52 P;
    public boolean Q = false;

    public hr3(j52 j52Var, @Nullable zg4 zg4Var) {
        this.P = j52Var;
        j52Var.b(2);
        if (zg4Var != null) {
            j52Var.b(1101);
        }
    }

    @Override // defpackage.vj1
    public final synchronized void J() {
        if (this.Q) {
            this.P.b(8);
            return;
        }
        this.P.b(7);
        this.Q = true;
    }

    @Override // defpackage.ug3
    public final void M0(d62 d62Var) {
        j52 j52Var = this.P;
        synchronized (j52Var) {
            if (j52Var.c) {
                try {
                    j52Var.b.k(d62Var);
                } catch (NullPointerException e) {
                    jv5.A.g.f("AdMobClearcutLogger.modify", e);
                }
            }
        }
        this.P.b(1104);
    }

    @Override // defpackage.ug3
    public final void U(boolean z) {
        this.P.b(true != z ? 1108 : 1107);
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
        this.P.a(new jz1(3, hi4Var));
    }

    @Override // defpackage.ug3
    public final void i() {
        this.P.b(1109);
    }

    @Override // defpackage.le3
    public final void k() {
        this.P.b(3);
    }

    @Override // defpackage.ae3
    public final synchronized void n() {
        this.P.b(6);
    }

    @Override // defpackage.ug3
    public final void n0(d62 d62Var) {
        this.P.a(new fk(5, d62Var));
        this.P.b(1102);
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        j52 j52Var;
        int i;
        switch (tz3Var.P) {
            case 1:
                j52Var = this.P;
                i = 101;
                break;
            case 2:
                j52Var = this.P;
                i = 102;
                break;
            case 3:
                j52Var = this.P;
                i = 5;
                break;
            case 4:
                j52Var = this.P;
                i = 103;
                break;
            case 5:
                j52Var = this.P;
                i = 104;
                break;
            case 6:
                j52Var = this.P;
                i = 105;
                break;
            case 7:
                j52Var = this.P;
                i = 106;
                break;
            default:
                j52Var = this.P;
                i = 4;
                break;
        }
        j52Var.b(i);
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
    }

    @Override // defpackage.ug3
    public final void r0(boolean z) {
        this.P.b(true != z ? 1106 : 1105);
    }

    @Override // defpackage.ug3
    public final void v0(d62 d62Var) {
        j52 j52Var = this.P;
        synchronized (j52Var) {
            if (j52Var.c) {
                try {
                    j52Var.b.k(d62Var);
                } catch (NullPointerException e) {
                    jv5.A.g.f("AdMobClearcutLogger.modify", e);
                }
            }
        }
        this.P.b(1103);
    }
}