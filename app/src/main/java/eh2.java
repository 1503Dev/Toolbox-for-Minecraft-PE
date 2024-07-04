package defpackage;

import java.nio.charset.Charset;

/* renamed from: eh2  reason: default package */
public final class eh2 {
    public final hg2 a;

    public eh2(ld2 ld2Var) {
        Charset charset = z13.a;
        this.a = ld2Var;
        ld2Var.Q = this;
    }

    public final void a(int i, int i2) {
        this.a.V(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(long j, int i) {
        this.a.X((j >> 63) ^ (j + j), i);
    }

    public final void c(int i, int i2) {
        this.a.V(i, i2);
    }

    public final void d(long j, int i) {
        this.a.X(j, i);
    }

    public final void e(int i, boolean z) {
        this.a.L(i, z);
    }

    public final void f(int i, y82 y82Var) {
        this.a.M(i, y82Var);
    }

    public final void g(double d, int i) {
        this.a.P(Double.doubleToRawLongBits(d), i);
    }

    public final void h(int i, int i2) {
        this.a.R(i, i2);
    }

    public final void i(int i, int i2) {
        this.a.N(i, i2);
    }

    public final void j(long j, int i) {
        this.a.P(j, i);
    }

    public final void k(int i, float f) {
        this.a.N(i, Float.floatToRawIntBits(f));
    }

    public final void l(int i, lr3 lr3Var, Object obj) {
        hg2 hg2Var = this.a;
        hg2Var.U(i, 3);
        lr3Var.h((fk3) obj, hg2Var.Q);
        hg2Var.U(i, 4);
    }

    public final void m(int i, int i2) {
        this.a.R(i, i2);
    }

    public final void n(long j, int i) {
        this.a.X(j, i);
    }

    public final void o(int i, lr3 lr3Var, Object obj) {
        fk3 fk3Var = (fk3) obj;
        ld2 ld2Var = (ld2) this.a;
        ld2Var.W((i << 3) | 2);
        ld2Var.W(((du1) fk3Var).a(lr3Var));
        lr3Var.h(fk3Var, ld2Var.Q);
    }

    public final void p(int i, int i2) {
        this.a.N(i, i2);
    }

    public final void q(long j, int i) {
        this.a.P(j, i);
    }
}