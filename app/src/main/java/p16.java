package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: p16  reason: default package */
public final class p16 implements mk1 {
    public final gv5 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        gm2.a("media3.extractor");
    }

    public p16(fv4 fv4Var, long j, long j2) {
        this.b = fv4Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.mk1
    public final boolean A(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            n(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = l(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mk1
    public final boolean B(byte[] bArr, int i, int i2, boolean z) {
        if (h(i2, z)) {
            System.arraycopy(this.e, this.f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // defpackage.mk1
    public final long b() {
        return this.d + this.f;
    }

    @Override // defpackage.mk1
    public final long e() {
        return this.d;
    }

    public final int f(byte[] bArr, int i, int i2) {
        int min;
        m(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = l(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    public final int g() {
        int min = Math.min(this.g, 1);
        n(min);
        if (min == 0) {
            min = l(this.a, 0, Math.min(1, 4096), 0, true);
        }
        if (min != -1) {
            this.d += min;
        }
        return min;
    }

    public final boolean h(int i, boolean z) {
        m(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = l(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    @Override // defpackage.mk1
    public final long i() {
        return this.c;
    }

    @Override // defpackage.mk1
    public final void j() {
        this.f = 0;
    }

    public final void k(int i) {
        int min = Math.min(this.g, i);
        n(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = l(this.a, -i2, Math.min(i, i2 + 4096), i2, false);
        }
        if (i2 != -1) {
            this.d += i2;
        }
    }

    public final int l(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int x = this.b.x(bArr, i + i3, i2 - i3);
        if (x == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + x;
    }

    public final void m(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    public final void n(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.mk1
    public final void v(int i) {
        h(i, false);
    }

    @Override // defpackage.mk1
    public final void w(int i) {
        k(i);
    }

    @Override // defpackage.mk1, defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            n(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = l(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4;
    }

    @Override // defpackage.mk1
    public final void y(byte[] bArr, int i, int i2) {
        A(bArr, i, i2, false);
    }

    @Override // defpackage.mk1
    public final void z(byte[] bArr, int i, int i2) {
        B(bArr, i, i2, false);
    }
}