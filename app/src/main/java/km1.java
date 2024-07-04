package defpackage;

/* renamed from: km1  reason: default package */
public final class km1 {
    public final pl1 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public km1(int i, int i2, long j, int i3, pl1 pl1Var) {
        int i4;
        int i5;
        i2 = i2 != 1 ? 2 : i2;
        this.d = j;
        this.e = i3;
        this.a = pl1Var;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        int i6 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = i4 | i6;
        if (i2 == 2) {
            i5 = i6 | 1650720768;
        } else {
            i5 = -1;
        }
        this.c = i5;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final kl1 a(long j) {
        int i = (int) (j / ((this.d * 1) / this.e));
        int h = zn4.h(this.l, i, true, true);
        if (this.l[h] == i) {
            nl1 b = b(h);
            return new kl1(b, b);
        }
        nl1 b2 = b(h);
        int i2 = h + 1;
        if (i2 < this.k.length) {
            return new kl1(b2, b(i2));
        }
        return new kl1(b2, b2);
    }

    public final nl1 b(int i) {
        return new nl1(((this.d * 1) / this.e) * this.l[i], this.k[i]);
    }
}