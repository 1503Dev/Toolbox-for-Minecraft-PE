package defpackage;

/* renamed from: lq1  reason: default package */
public final class lq1 implements iq1 {
    public final kh4 a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public lq1(aq1 aq1Var) {
        kh4 kh4Var = aq1Var.b;
        this.a = kh4Var;
        kh4Var.e(12);
        this.c = kh4Var.p() & 255;
        this.b = kh4Var.p();
    }

    @Override // defpackage.iq1
    public final int a() {
        return -1;
    }

    @Override // defpackage.iq1
    public final int c() {
        return this.b;
    }

    @Override // defpackage.iq1
    public final int d() {
        int i = this.c;
        if (i == 8) {
            return this.a.n();
        }
        if (i == 16) {
            return this.a.q();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int n = this.a.n();
            this.e = n;
            return (n & 240) >> 4;
        }
        return this.e & 15;
    }
}