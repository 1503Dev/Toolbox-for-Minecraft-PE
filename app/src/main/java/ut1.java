package defpackage;

/* renamed from: ut1  reason: default package */
public final class ut1 implements tt1 {
    public final nk1 a;
    public final pl1 b;
    public final wt1 c;
    public final cu1 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public ut1(nk1 nk1Var, pl1 pl1Var, wt1 wt1Var, String str, int i) {
        this.a = nk1Var;
        this.b = pl1Var;
        this.c = wt1Var;
        int i2 = wt1Var.a * wt1Var.d;
        int i3 = wt1Var.c;
        int i4 = i2 / 8;
        if (i3 == i4) {
            int i5 = wt1Var.b * i4;
            int i6 = i5 * 8;
            int max = Math.max(i4, i5 / 10);
            this.e = max;
            bs1 bs1Var = new bs1();
            bs1Var.j = str;
            bs1Var.e = i6;
            bs1Var.f = i6;
            bs1Var.k = max;
            bs1Var.w = wt1Var.a;
            bs1Var.x = wt1Var.b;
            bs1Var.y = i;
            this.d = new cu1(bs1Var);
            return;
        }
        throw jy2.a("Expected block size: " + i4 + "; got: " + i3, null);
    }

    @Override // defpackage.tt1
    public final void a(long j, int i) {
        this.a.n(new zt1(this.c, 1, i, j));
        this.b.e(this.d);
    }

    @Override // defpackage.tt1
    public final void c(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.tt1
    public final boolean d(p16 p16Var, long j) {
        wt1 wt1Var;
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int f = this.b.f(p16Var, (int) Math.min(i2 - i, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        int i3 = this.c.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long r = this.f + zn4.r(this.h, 1000000L, wt1Var.b);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.b(r, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        if (j2 <= 0) {
            return true;
        }
        return false;
    }
}