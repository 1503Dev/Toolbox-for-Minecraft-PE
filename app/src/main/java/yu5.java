package defpackage;

import java.io.IOException;

/* renamed from: yu5  reason: default package */
public final class yu5 implements nv5, mv5 {
    public final ov5 P;
    public final long Q;
    public qv5 R;
    public nv5 S;
    public mv5 T;
    public long U = -9223372036854775807L;
    public final jz5 V;

    public yu5(ov5 ov5Var, jz5 jz5Var, long j) {
        this.P = ov5Var;
        this.V = jz5Var;
        this.Q = j;
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long M() {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        return nv5Var.M();
    }

    @Override // defpackage.mv5
    public final void a(nv5 nv5Var) {
        mv5 mv5Var = this.T;
        int i = zn4.a;
        mv5Var.a(this);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final void b(long j) {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        nv5Var.b(j);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean c(long j) {
        nv5 nv5Var = this.S;
        return nv5Var != null && nv5Var.c(j);
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final long d() {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        return nv5Var.d();
    }

    @Override // defpackage.mv5
    public final /* bridge */ /* synthetic */ void e(xw5 xw5Var) {
        nv5 nv5Var = (nv5) xw5Var;
        mv5 mv5Var = this.T;
        int i = zn4.a;
        mv5Var.e(this);
    }

    @Override // defpackage.nv5
    public final hx5 f() {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        return nv5Var.f();
    }

    @Override // defpackage.nv5
    public final long g(long j) {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        return nv5Var.g(j);
    }

    @Override // defpackage.nv5
    public final void h(long j) {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        nv5Var.h(j);
    }

    @Override // defpackage.nv5
    public final long i() {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        return nv5Var.i();
    }

    public final void j(ov5 ov5Var) {
        long j = this.Q;
        long j2 = this.U;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        qv5 qv5Var = this.R;
        qv5Var.getClass();
        nv5 g = qv5Var.g(ov5Var, this.V, j);
        this.S = g;
        if (this.T != null) {
            g.o(this, j);
        }
    }

    @Override // defpackage.nv5
    public final long k(long j, ao5 ao5Var) {
        nv5 nv5Var = this.S;
        int i = zn4.a;
        return nv5Var.k(j, ao5Var);
    }

    @Override // defpackage.nv5
    public final void l() {
        try {
            nv5 nv5Var = this.S;
            if (nv5Var != null) {
                nv5Var.l();
                return;
            }
            qv5 qv5Var = this.R;
            if (qv5Var != null) {
                qv5Var.Y();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.nv5, defpackage.xw5
    public final boolean m() {
        nv5 nv5Var = this.S;
        return nv5Var != null && nv5Var.m();
    }

    @Override // defpackage.nv5
    public final void o(mv5 mv5Var, long j) {
        this.T = mv5Var;
        nv5 nv5Var = this.S;
        if (nv5Var != null) {
            long j2 = this.Q;
            long j3 = this.U;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            nv5Var.o(this, j2);
        }
    }

    @Override // defpackage.nv5
    public final long p(qy5[] qy5VarArr, boolean[] zArr, ww5[] ww5VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.U;
        if (j3 == -9223372036854775807L || j != this.Q) {
            j2 = j;
        } else {
            this.U = -9223372036854775807L;
            j2 = j3;
        }
        nv5 nv5Var = this.S;
        int i = zn4.a;
        return nv5Var.p(qy5VarArr, zArr, ww5VarArr, zArr2, j2);
    }
}