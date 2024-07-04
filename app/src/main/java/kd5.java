package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: kd5  reason: default package */
public final class kd5 extends ld5 {
    public final InputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public /* synthetic */ kd5(InputStream inputStream) {
        Charset charset = re5.a;
        this.c = inputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final void A(int i) {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
        } else if (i >= 0) {
            int i5 = this.i;
            int i6 = i5 + i3;
            int i7 = this.j;
            if (i6 + i <= i7) {
                this.i = i6;
                this.e = 0;
                this.g = 0;
                while (i4 < i) {
                    try {
                        long j = i - i4;
                        try {
                            long skip = this.c.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                }
                                i4 += (int) skip;
                            } else {
                                throw new IllegalStateException(String.valueOf(this.c.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (te5 e) {
                            e.P = true;
                            throw e;
                        }
                    } finally {
                        this.i += i4;
                        C();
                    }
                }
                if (i4 < i) {
                    int i8 = this.e;
                    int i9 = i8 - this.g;
                    this.g = i8;
                    while (true) {
                        D(1);
                        int i10 = i - i9;
                        int i11 = this.e;
                        if (i10 > i11) {
                            i9 += i11;
                            this.g = i11;
                        } else {
                            this.g = i10;
                            return;
                        }
                    }
                }
            } else {
                A((i7 - i5) - i3);
                throw te5.f();
            }
        } else {
            throw te5.d();
        }
    }

    public final ArrayList B(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.c.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw te5.f();
                }
                this.i += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void C() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void D(int i) {
        if (!E(i)) {
            if (i > (Integer.MAX_VALUE - this.i) - this.g) {
                throw new te5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw te5.f();
        }
    }

    public final boolean E(int i) {
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 > i4) {
            int i5 = this.i;
            if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.j) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.d;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.i + i2;
                this.i = i5;
                i4 = this.e - i2;
                this.e = i4;
                this.g = 0;
            }
            try {
                int read = this.c.read(this.d, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.e += read;
                    C();
                    if (this.e >= i) {
                        return true;
                    }
                    return E(i);
                }
                throw new IllegalStateException(String.valueOf(this.c.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (te5 e) {
                e.P = true;
                throw e;
            }
        }
        throw new IllegalStateException(bp.b("refillBuffer() called when ", i, " bytes were already available in buffer"));
    }

    public final byte[] F(int i) {
        byte[] G = G(i);
        if (G != null) {
            return G;
        }
        int i2 = this.g;
        int i3 = this.e;
        int i4 = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList B = B(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, i4);
        Iterator it = B.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] G(int i) {
        if (i == 0) {
            return re5.b;
        }
        if (i >= 0) {
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i2 + i3 + i;
            if ((-2147483647) + i4 <= 0) {
                int i5 = this.j;
                if (i4 <= i5) {
                    int i6 = this.e - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.c.available()) {
                                return null;
                            }
                        } catch (te5 e) {
                            e.P = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.d, this.g, bArr, 0, i6);
                    this.i += this.e;
                    this.g = 0;
                    this.e = 0;
                    while (i6 < i) {
                        try {
                            int read = this.c.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.i += read;
                                i6 += read;
                            } else {
                                throw te5.f();
                            }
                        } catch (te5 e2) {
                            e2.P = true;
                            throw e2;
                        }
                    }
                    return bArr;
                }
                A((i5 - i2) - i3);
                throw te5.f();
            }
            throw new te5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw te5.d();
    }

    public final int H() {
        int i = this.g;
        if (this.e - i < 4) {
            D(4);
            i = this.g;
        }
        byte[] bArr = this.d;
        this.g = i + 4;
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            byte[] bArr = this.d;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long J() {
        int i = this.g;
        if (this.e - i < 8) {
            D(8);
            i = this.g;
        }
        byte[] bArr = this.d;
        this.g = i + 8;
        long j = bArr[i + 2];
        long j2 = bArr[i + 3];
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((j & 255) << 16) | ((j2 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            byte[] bArr = this.d;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = i9 ^ (bArr[i5] << 28);
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.g = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.g = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.g = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.g = i5;
                return j2;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                D(1);
            }
            byte[] bArr = this.d;
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = bArr[i2];
            j |= (b & Byte.MAX_VALUE) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw te5.c();
    }

    @Override // defpackage.ld5
    public final void a(int i) {
        this.j = i;
        C();
    }

    @Override // defpackage.ld5
    public final boolean b() {
        return this.g == this.e && !E(1);
    }

    @Override // defpackage.ld5
    public final boolean c() {
        return K() != 0;
    }

    @Override // defpackage.ld5
    public final boolean d(int i) {
        int p;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            A(4);
                            return true;
                        }
                        int i4 = te5.Q;
                        throw new se5();
                    }
                    do {
                        p = p();
                        if (p == 0) {
                            break;
                        }
                    } while (d(p));
                    z(((i >>> 3) << 3) | 4);
                    return true;
                }
                A(I());
                return true;
            }
            A(8);
            return true;
        }
        if (this.e - this.g >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw te5.c();
        }
        while (i3 < 10) {
            if (this.g == this.e) {
                D(1);
            }
            byte[] bArr2 = this.d;
            int i6 = this.g;
            this.g = i6 + 1;
            if (bArr2[i6] < 0) {
                i3++;
            }
        }
        throw te5.c();
        return true;
    }

    @Override // defpackage.ld5
    public final double g() {
        return Double.longBitsToDouble(J());
    }

    @Override // defpackage.ld5
    public final float h() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.ld5
    public final int i() {
        return this.i + this.g;
    }

    @Override // defpackage.ld5
    public final int j(int i) {
        if (i >= 0) {
            int i2 = this.i + this.g;
            int i3 = this.j;
            int i4 = i + i2;
            if (i4 <= i3) {
                this.j = i4;
                C();
                return i3;
            }
            throw te5.f();
        }
        throw te5.d();
    }

    @Override // defpackage.ld5
    public final int k() {
        return I();
    }

    @Override // defpackage.ld5
    public final int l() {
        return H();
    }

    @Override // defpackage.ld5
    public final int m() {
        return I();
    }

    @Override // defpackage.ld5
    public final int n() {
        return H();
    }

    @Override // defpackage.ld5
    public final int o() {
        return ld5.e(I());
    }

    @Override // defpackage.ld5
    public final int p() {
        if (b()) {
            this.h = 0;
            return 0;
        }
        int I = I();
        this.h = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new te5("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ld5
    public final int q() {
        return I();
    }

    @Override // defpackage.ld5
    public final long r() {
        return J();
    }

    @Override // defpackage.ld5
    public final long s() {
        return K();
    }

    @Override // defpackage.ld5
    public final long t() {
        return J();
    }

    @Override // defpackage.ld5
    public final long u() {
        return ld5.f(K());
    }

    @Override // defpackage.ld5
    public final long v() {
        return K();
    }

    @Override // defpackage.ld5
    public final ed5 w() {
        int I = I();
        int i = this.e;
        int i2 = this.g;
        if (I <= i - i2 && I > 0) {
            ed5 G = gd5.G(this.d, i2, I);
            this.g += I;
            return G;
        } else if (I != 0) {
            byte[] G2 = G(I);
            if (G2 != null) {
                return gd5.G(G2, 0, G2.length);
            }
            int i3 = this.g;
            int i4 = this.e;
            int i5 = i4 - i3;
            this.i += i4;
            this.g = 0;
            this.e = 0;
            ArrayList B = B(I - i5);
            byte[] bArr = new byte[I];
            System.arraycopy(this.d, i3, bArr, 0, i5);
            Iterator it = B.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return new ed5(bArr);
        } else {
            return gd5.Q;
        }
    }

    @Override // defpackage.ld5
    public final String x() {
        int I = I();
        if (I > 0) {
            int i = this.e;
            int i2 = this.g;
            if (I <= i - i2) {
                String str = new String(this.d, i2, I, re5.a);
                this.g += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I <= this.e) {
            D(I);
            String str2 = new String(this.d, this.g, I, re5.a);
            this.g += I;
            return str2;
        }
        return new String(F(I), re5.a);
    }

    @Override // defpackage.ld5
    public final String y() {
        byte[] F;
        byte[] bArr;
        int I = I();
        int i = this.g;
        int i2 = this.e;
        if (I <= i2 - i && I > 0) {
            bArr = this.d;
            this.g = i + I;
        } else if (I == 0) {
            return "";
        } else {
            if (I <= i2) {
                D(I);
                F = this.d;
                this.g = I;
            } else {
                F = F(I);
            }
            bArr = F;
            i = 0;
        }
        return dh5.a.b(bArr, i, I);
    }

    @Override // defpackage.ld5
    public final void z(int i) {
        if (this.h == i) {
            return;
        }
        throw new te5("Protocol message end-group tag did not match expected tag.");
    }
}