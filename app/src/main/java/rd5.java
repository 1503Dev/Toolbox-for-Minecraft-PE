package defpackage;

import java.nio.charset.Charset;

/* renamed from: rd5  reason: default package */
public final class rd5 {
    public final qd5 a;

    public rd5(qd5 qd5Var) {
        Charset charset = re5.a;
        this.a = qd5Var;
        qd5Var.Q = this;
    }

    public final void a(int i, int i2) {
        this.a.E(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(long j, int i) {
        this.a.G((j >> 63) ^ (j + j), i);
    }

    public final void c(int i, int i2) {
        this.a.E(i, i2);
    }

    public final void d(long j, int i) {
        this.a.G(j, i);
    }

    public final void e(int i, boolean z) {
        this.a.t(i, z);
    }

    public final void f(int i, gd5 gd5Var) {
        this.a.u(i, gd5Var);
    }

    public final void g(double d, int i) {
        this.a.x(Double.doubleToRawLongBits(d), i);
    }

    public final void h(int i, int i2) {
        this.a.z(i, i2);
    }

    public final void i(int i, int i2) {
        this.a.v(i, i2);
    }

    public final void j(long j, int i) {
        this.a.x(j, i);
    }

    public final void k(int i, float f) {
        this.a.v(i, Float.floatToRawIntBits(f));
    }

    public final void l(int i, dg5 dg5Var, Object obj) {
        qd5 qd5Var = this.a;
        qd5Var.D(i, 3);
        dg5Var.j((nf5) obj, qd5Var.Q);
        qd5Var.D(i, 4);
    }

    public final void m(int i, int i2) {
        this.a.z(i, i2);
    }

    public final void n(long j, int i) {
        this.a.G(j, i);
    }

    public final void o(int i, dg5 dg5Var, Object obj) {
        this.a.B(i, (nf5) obj, dg5Var);
    }

    public final void p(int i, int i2) {
        this.a.v(i, i2);
    }

    public final void q(long j, int i) {
        this.a.x(j, i);
    }
}