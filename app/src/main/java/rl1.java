package defpackage;

/* renamed from: rl1  reason: default package */
public final class rl1 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public rl1(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final int a(int i) {
        int i2 = this.c;
        int i3 = i2 + 1;
        int min = Math.min(i, 8 - this.d);
        int i4 = ((this.a[i2] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        b(i);
        return i5;
    }

    public final void b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            i4++;
            this.c = i4;
            i5 -= 8;
            this.d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        tv2.I(z);
    }

    public final boolean c() {
        b(1);
        return 1 == (((this.a[this.c] & 255) >> this.d) & 1);
    }
}