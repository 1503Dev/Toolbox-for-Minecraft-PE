package defpackage;

import java.nio.charset.Charset;

/* renamed from: kh4  reason: default package */
public final class kh4 {
    public byte[] a;
    public int b;
    public int c;

    static {
        sv4.u(5, zs4.a, zs4.c, zs4.f, zs4.d, zs4.e);
    }

    public kh4() {
        this.a = zn4.f;
    }

    public kh4(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public kh4(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public kh4(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final short A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        c(bArr, i);
    }

    public final void c(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void d(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        tv2.G(z);
        this.c = i;
    }

    public final void e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        tv2.G(z);
        this.b = i;
    }

    public final void f(int i) {
        e(this.b + i);
    }

    public final byte[] g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public final int k() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(k6.a("Top bit not zero: ", j));
    }

    public final int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final int m() {
        return (n() << 21) | (n() << 14) | (n() << 7) | n();
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.b = i3 + 1;
        return (bArr[i3] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
    }

    public final int p() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(k6.a("Top bit not zero: ", i));
    }

    public final int q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final long r() {
        int i;
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        int i5 = i4 + 1;
        long j3 = bArr[i4];
        int i6 = i5 + 1;
        long j4 = bArr[i5];
        int i7 = i6 + 1;
        long j5 = bArr[i6];
        int i8 = i7 + 1;
        long j6 = bArr[i7];
        long j7 = bArr[i8];
        this.b = i8 + 1 + 1;
        return ((bArr[i] & 255) << 56) | ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final long s() {
        int i;
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        long j3 = bArr[i4];
        this.b = i4 + 1 + 1;
        return ((bArr[i] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long t() {
        int i;
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        int i5 = i4 + 1;
        long j3 = bArr[i4];
        int i6 = i5 + 1;
        long j4 = bArr[i5];
        int i7 = i6 + 1;
        long j5 = bArr[i6];
        int i8 = i7 + 1;
        long j6 = bArr[i7];
        long j7 = bArr[i8];
        this.b = i8 + 1 + 1;
        return (bArr[i] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long u() {
        int i;
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        long j3 = bArr[i4];
        this.b = i4 + 1 + 1;
        return (bArr[i] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long v() {
        long t = t();
        if (t >= 0) {
            return t;
        }
        throw new IllegalStateException("Top bit not zero: " + t);
    }

    public final long w() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.a[this.b];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.a[this.b + i2] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (b & 63);
        }
        this.b += i;
        return j;
    }

    public final String x() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 != 0) {
            while (i2 < this.c && this.a[i2] != 0) {
                i2++;
            }
            byte[] bArr = this.a;
            int i3 = this.b;
            int i4 = zn4.a;
            String str = new String(bArr, i3, i2 - i3, zs4.c);
            this.b = i2;
            if (i2 < this.c) {
                this.b = i2 + 1;
            }
            return str;
        }
        return null;
    }

    public final String y(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.c && this.a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        byte[] bArr = this.a;
        int i5 = zn4.a;
        String str = new String(bArr, i3, i2, zs4.c);
        this.b += i;
        return str;
    }

    public final String z(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }
}