package defpackage;

/* renamed from: cq1  reason: default package */
public final class cq1 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final kh4 f;
    public final kh4 g;
    public int h;
    public int i;

    public cq1(kh4 kh4Var, kh4 kh4Var2, boolean z) {
        this.g = kh4Var;
        this.f = kh4Var2;
        this.e = z;
        kh4Var2.e(12);
        this.a = kh4Var2.p();
        kh4Var.e(12);
        this.i = kh4Var.p();
        uf0.j("first_chunk must be 1", kh4Var.i() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.v() : this.f.u();
        if (this.b == this.h) {
            this.c = this.g.p();
            this.g.f(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.p() : -1;
        }
        return true;
    }
}