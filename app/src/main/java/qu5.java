package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qu5  reason: default package */
public final class qu5 implements nv5, mv5 {
    public final nv5 P;
    public mv5 Q;
    public pu5[] R = new pu5[0];
    public long S = 0;
    public long T;

    public qu5(yu5 yu5Var, long j) {
        this.P = yu5Var;
        this.T = j;
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long M() {
        long M = this.P.M();
        if (M != Long.MIN_VALUE) {
            long j = this.T;
            if (j == Long.MIN_VALUE || M < j) {
                return M;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mv5
    public final void a(nv5 nv5Var) {
        mv5 mv5Var = this.Q;
        mv5Var.getClass();
        mv5Var.a(this);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final void b(long j) {
        this.P.b(j);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean c(long j) {
        return this.P.c(j);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long d() {
        long d = this.P.d();
        if (d != Long.MIN_VALUE) {
            long j = this.T;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mv5
    public final /* bridge */ /* synthetic */ void e(xw5 xw5Var) {
        nv5 nv5Var = (nv5) xw5Var;
        mv5 mv5Var = this.Q;
        mv5Var.getClass();
        mv5Var.e(this);
    }

    @Override // defpackage.nv5
    public final hx5 f() {
        return this.P.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // defpackage.nv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(long j) {
        pu5[] pu5VarArr;
        this.S = -9223372036854775807L;
        boolean z = false;
        for (pu5 pu5Var : this.R) {
            if (pu5Var != null) {
                pu5Var.b = false;
            }
        }
        long g = this.P.g(j);
        if (g != j) {
            if (g >= 0) {
                long j2 = this.T;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            tv2.I(z);
            return g;
        }
        z = true;
        tv2.I(z);
        return g;
    }

    @Override // defpackage.nv5
    public final void h(long j) {
        this.P.h(j);
    }

    @Override // defpackage.nv5
    public final long i() {
        if (j()) {
            long j = this.S;
            this.S = -9223372036854775807L;
            long i = i();
            return i != -9223372036854775807L ? i : j;
        }
        long i2 = this.P.i();
        if (i2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        tv2.I(i2 >= 0);
        long j2 = this.T;
        tv2.I((j2 == Long.MIN_VALUE || i2 <= j2) ? true : true);
        return i2;
    }

    public final boolean j() {
        return this.S != -9223372036854775807L;
    }

    @Override // defpackage.nv5
    public final long k(long j, ao5 ao5Var) {
        if (j != 0) {
            long max = Math.max(0L, Math.min(ao5Var.a, j));
            long j2 = ao5Var.b;
            long j3 = this.T;
            long max2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? RecyclerView.FOREVER_NS : j3 - j));
            if (max != ao5Var.a || max2 != ao5Var.b) {
                ao5Var = new ao5(max, max2);
            }
            return this.P.k(j, ao5Var);
        }
        return 0L;
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
        this.Q = mv5Var;
        this.P.o(this, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r4 > r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    @Override // defpackage.nv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(qy5[] qy5VarArr, boolean[] zArr, ww5[] ww5VarArr, boolean[] zArr2, long j) {
        boolean z;
        int length = ww5VarArr.length;
        this.R = new pu5[length];
        ww5[] ww5VarArr2 = new ww5[length];
        int i = 0;
        while (true) {
            ww5 ww5Var = null;
            if (i >= ww5VarArr.length) {
                break;
            }
            pu5[] pu5VarArr = this.R;
            pu5 pu5Var = (pu5) ww5VarArr[i];
            pu5VarArr[i] = pu5Var;
            if (pu5Var != null) {
                ww5Var = pu5Var.a;
            }
            ww5VarArr2[i] = ww5Var;
            i++;
        }
        long p = this.P.p(qy5VarArr, zArr, ww5VarArr2, zArr2, j);
        long j2 = (j() && j == 0) ? 0L : j;
        this.S = -9223372036854775807L;
        if (p != j2) {
            if (p >= 0) {
                long j3 = this.T;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            z = false;
            tv2.I(z);
            for (int i2 = 0; i2 < ww5VarArr.length; i2++) {
                ww5 ww5Var2 = ww5VarArr2[i2];
                if (ww5Var2 == null) {
                    this.R[i2] = null;
                } else {
                    pu5[] pu5VarArr2 = this.R;
                    pu5 pu5Var2 = pu5VarArr2[i2];
                    if (pu5Var2 == null || pu5Var2.a != ww5Var2) {
                        pu5VarArr2[i2] = new pu5(this, ww5Var2);
                    }
                }
                ww5VarArr[i2] = this.R[i2];
            }
            return p;
        }
        z = true;
        tv2.I(z);
        while (i2 < ww5VarArr.length) {
        }
        return p;
    }
}