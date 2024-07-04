package defpackage;

import android.view.Surface;

@Deprecated
/* renamed from: co5  reason: default package */
public final class co5 extends ro5 {
    public final bm5 b;
    public final sy3 c;

    public co5(gl5 gl5Var) {
        sy3 sy3Var = new sy3();
        this.c = sy3Var;
        try {
            this.b = new bm5(gl5Var, this);
            sy3Var.b();
        } catch (Throwable th) {
            this.c.b();
            throw th;
        }
    }

    @Override // defpackage.o73
    public final void E() {
        this.c.a();
        this.b.D();
    }

    @Override // defpackage.o73
    public final boolean F() {
        this.c.a();
        return this.b.F();
    }

    @Override // defpackage.ro5
    public final void a(int i, long j) {
        this.c.a();
        this.b.a(i, j);
    }

    @Override // defpackage.o73
    public final int b() {
        this.c.a();
        return this.b.b();
    }

    @Override // defpackage.o73
    public final int c() {
        this.c.a();
        return this.b.c();
    }

    @Override // defpackage.o73
    public final int d() {
        this.c.a();
        return this.b.d();
    }

    @Override // defpackage.o73
    public final int e() {
        this.c.a();
        return this.b.e();
    }

    @Override // defpackage.o73
    public final void f() {
        this.c.a();
        this.b.D();
    }

    public final void g(jo5 jo5Var) {
        this.c.a();
        this.b.g(jo5Var);
    }

    @Override // defpackage.o73
    public final int h() {
        this.c.a();
        return this.b.h();
    }

    @Override // defpackage.o73
    public final int i() {
        this.c.a();
        return this.b.i();
    }

    @Override // defpackage.o73
    public final long j() {
        this.c.a();
        return this.b.j();
    }

    @Override // defpackage.o73
    public final kd3 k() {
        this.c.a();
        return this.b.k();
    }

    @Override // defpackage.o73
    public final long l() {
        this.c.a();
        return this.b.l();
    }

    public final void m(nu5 nu5Var) {
        this.c.a();
        this.b.m(nu5Var);
    }

    public final long n() {
        this.c.a();
        return this.b.H();
    }

    @Override // defpackage.o73
    public final long o() {
        this.c.a();
        return this.b.o();
    }

    public final long p() {
        this.c.a();
        return this.b.I();
    }

    public final void q() {
        this.c.a();
        this.b.J();
    }

    @Override // defpackage.o73
    public final boolean r() {
        this.c.a();
        return this.b.r();
    }

    public final void s() {
        this.c.a();
        this.b.K();
    }

    @Override // defpackage.o73
    public final vk3 t() {
        this.c.a();
        return this.b.t();
    }

    public final void u(boolean z) {
        this.c.a();
        this.b.L(z);
    }

    public final void v(Surface surface) {
        this.c.a();
        this.b.M(surface);
    }

    public final void w(float f) {
        this.c.a();
        bm5 bm5Var = this.b;
        bm5Var.D();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (bm5Var.M != max) {
            bm5Var.M = max;
            bm5Var.y(1, 2, Float.valueOf(bm5Var.v.e * max));
            i94 i94Var = bm5Var.k;
            i94Var.b(22, new v64() { // from class: ml5
                @Override // defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj) {
                    float f2 = max;
                    int i = bm5.X;
                    ((b53) obj).e(f2);
                }
            });
            i94Var.a();
        }
    }

    public final void x() {
        this.c.a();
        this.b.N();
    }

    public final void y() {
        this.c.a();
        this.b.O();
    }

    public final void z(jo5 jo5Var) {
        this.c.a();
        this.b.P(jo5Var);
    }
}