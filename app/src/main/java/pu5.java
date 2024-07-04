package defpackage;

/* renamed from: pu5  reason: default package */
public final class pu5 implements ww5 {
    public final ww5 a;
    public boolean b;
    public final /* synthetic */ qu5 c;

    public pu5(qu5 qu5Var, ww5 ww5Var) {
        this.c = qu5Var;
        this.a = ww5Var;
    }

    @Override // defpackage.ww5
    public final int a(vi1 vi1Var, gk5 gk5Var, int i) {
        if (this.c.j()) {
            return -3;
        }
        if (this.b) {
            gk5Var.a = 4;
            return -4;
        }
        int a = this.a.a(vi1Var, gk5Var, i);
        if (a == -5) {
            cu1 cu1Var = (cu1) vi1Var.Q;
            cu1Var.getClass();
            int i2 = cu1Var.A;
            int i3 = 0;
            if (i2 == 0) {
                if (cu1Var.B != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.c.T == Long.MIN_VALUE) {
                i3 = cu1Var.B;
            }
            bs1 bs1Var = new bs1(cu1Var);
            bs1Var.z = i2;
            bs1Var.A = i3;
            vi1Var.Q = new cu1(bs1Var);
            return -5;
        }
        qu5 qu5Var = this.c;
        long j = qu5Var.T;
        if (j != Long.MIN_VALUE && ((a == -4 && gk5Var.e >= j) || (a == -3 && qu5Var.d() == Long.MIN_VALUE && !gk5Var.d))) {
            gk5Var.b();
            gk5Var.a = 4;
            this.b = true;
            return -4;
        }
        return a;
    }

    @Override // defpackage.ww5
    public final boolean b() {
        return !this.c.j() && this.a.b();
    }

    @Override // defpackage.ww5
    public final int c(long j) {
        if (this.c.j()) {
            return -3;
        }
        return this.a.c(j);
    }

    @Override // defpackage.ww5
    public final void i() {
        this.a.i();
    }
}