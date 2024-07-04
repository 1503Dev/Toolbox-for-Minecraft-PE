package defpackage;

/* renamed from: an1  reason: default package */
public final class an1 implements mk1 {
    public final mk1 a;
    public final long b;

    public an1(p16 p16Var, long j) {
        boolean z;
        this.a = p16Var;
        if (p16Var.d >= j) {
            z = true;
        } else {
            z = false;
        }
        tv2.G(z);
        this.b = j;
    }

    @Override // defpackage.mk1
    public final boolean A(byte[] bArr, int i, int i2, boolean z) {
        return this.a.A(bArr, 0, 8, true);
    }

    @Override // defpackage.mk1
    public final boolean B(byte[] bArr, int i, int i2, boolean z) {
        return this.a.B(bArr, 0, 8, true);
    }

    @Override // defpackage.mk1
    public final long b() {
        return this.a.b() - this.b;
    }

    @Override // defpackage.mk1
    public final long e() {
        return this.a.e() - this.b;
    }

    @Override // defpackage.mk1
    public final long i() {
        return this.a.i() - this.b;
    }

    @Override // defpackage.mk1
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.mk1
    public final void v(int i) {
        ((p16) this.a).h(i, false);
    }

    @Override // defpackage.mk1
    public final void w(int i) {
        ((p16) this.a).k(i);
    }

    @Override // defpackage.mk1, defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        return this.a.x(bArr, i, i2);
    }

    @Override // defpackage.mk1
    public final void y(byte[] bArr, int i, int i2) {
        ((p16) this.a).A(bArr, i, i2, false);
    }

    @Override // defpackage.mk1
    public final void z(byte[] bArr, int i, int i2) {
        ((p16) this.a).B(bArr, i, i2, false);
    }
}