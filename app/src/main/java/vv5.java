package defpackage;

/* renamed from: vv5  reason: default package */
public final class vv5 implements nv5, mv5 {
    public final nv5 P;
    public final long Q;
    public mv5 R;

    public vv5(nv5 nv5Var, long j) {
        this.P = nv5Var;
        this.Q = j;
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long M() {
        long M = this.P.M();
        if (M == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return M + this.Q;
    }

    @Override // defpackage.mv5
    public final void a(nv5 nv5Var) {
        mv5 mv5Var = this.R;
        mv5Var.getClass();
        mv5Var.a(this);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final void b(long j) {
        this.P.b(j - this.Q);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean c(long j) {
        return this.P.c(j - this.Q);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long d() {
        long d = this.P.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.Q;
    }

    @Override // defpackage.mv5
    public final /* bridge */ /* synthetic */ void e(xw5 xw5Var) {
        nv5 nv5Var = (nv5) xw5Var;
        mv5 mv5Var = this.R;
        mv5Var.getClass();
        mv5Var.e(this);
    }

    @Override // defpackage.nv5
    public final hx5 f() {
        return this.P.f();
    }

    @Override // defpackage.nv5
    public final long g(long j) {
        return this.P.g(j - this.Q) + this.Q;
    }

    @Override // defpackage.nv5
    public final void h(long j) {
        this.P.h(j - this.Q);
    }

    @Override // defpackage.nv5
    public final long i() {
        long i = this.P.i();
        if (i == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return i + this.Q;
    }

    @Override // defpackage.nv5
    public final long k(long j, ao5 ao5Var) {
        return this.P.k(j - this.Q, ao5Var) + this.Q;
    }

    @Override // defpackage.nv5
    public final void l() {
        this.P.l();
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean m() {
        return this.P.m();
    }

    @Override // defpackage.nv5
    public final void o(mv5 mv5Var, long j) {
        this.R = mv5Var;
        this.P.o(this, j - this.Q);
    }

    @Override // defpackage.nv5
    public final long p(qy5[] qy5VarArr, boolean[] zArr, ww5[] ww5VarArr, boolean[] zArr2, long j) {
        ww5[] ww5VarArr2 = new ww5[ww5VarArr.length];
        int i = 0;
        while (true) {
            ww5 ww5Var = null;
            if (i >= ww5VarArr.length) {
                break;
            }
            wv5 wv5Var = (wv5) ww5VarArr[i];
            if (wv5Var != null) {
                ww5Var = wv5Var.a;
            }
            ww5VarArr2[i] = ww5Var;
            i++;
        }
        long p = this.P.p(qy5VarArr, zArr, ww5VarArr2, zArr2, j - this.Q);
        for (int i2 = 0; i2 < ww5VarArr.length; i2++) {
            ww5 ww5Var2 = ww5VarArr2[i2];
            if (ww5Var2 == null) {
                ww5VarArr[i2] = null;
            } else {
                ww5 ww5Var3 = ww5VarArr[i2];
                if (ww5Var3 == null || ((wv5) ww5Var3).a != ww5Var2) {
                    ww5VarArr[i2] = new wv5(ww5Var2, this.Q);
                }
            }
        }
        return p + this.Q;
    }
}