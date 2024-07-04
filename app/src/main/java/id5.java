package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: id5  reason: default package */
public final class id5 extends ld5 {
    public final Iterable c;
    public final Iterator d;
    public ByteBuffer e;
    public int f;
    public int g;
    public int i;
    public long k;
    public long l;
    public long m;
    public int h = Integer.MAX_VALUE;
    public int j = 0;

    public /* synthetic */ id5(ArrayList arrayList, int i) {
        this.f = i;
        this.c = arrayList;
        this.d = arrayList.iterator();
        if (i != 0) {
            E();
            return;
        }
        this.e = re5.c;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    public final void A(int i) {
        if (i >= 0) {
            if (i <= ((this.f - this.j) - this.k) + this.l) {
                while (i > 0) {
                    if (this.m - this.k == 0) {
                        C();
                    }
                    int min = Math.min(i, (int) (this.m - this.k));
                    i -= min;
                    this.k += min;
                }
                return;
            }
        }
        if (i >= 0) {
            throw te5.f();
        }
        throw te5.d();
    }

    public final int B() {
        return (int) (((this.f - this.j) - this.k) + this.l);
    }

    public final void C() {
        if (!this.d.hasNext()) {
            throw te5.f();
        }
        E();
    }

    public final void D(byte[] bArr, int i) {
        if (i <= B()) {
            int i2 = i;
            while (i2 > 0) {
                if (this.m - this.k == 0) {
                    C();
                }
                int min = Math.min(i2, (int) (this.m - this.k));
                long j = min;
                zg5.c.g(this.k, bArr, i - i2, j);
                i2 -= min;
                this.k += j;
            }
        } else if (i <= 0) {
        } else {
            throw te5.f();
        }
    }

    public final void E() {
        ByteBuffer byteBuffer = (ByteBuffer) this.d.next();
        this.e = byteBuffer;
        this.j += (int) (this.k - this.l);
        long position = byteBuffer.position();
        this.k = position;
        this.l = position;
        this.m = this.e.limit();
        long j = zg5.j(this.e);
        this.k += j;
        this.l += j;
        this.m += j;
    }

    public final byte F() {
        if (this.m - this.k == 0) {
            C();
        }
        long j = this.k;
        this.k = 1 + j;
        return zg5.f(j);
    }

    public final int G() {
        long j = this.m;
        long j2 = this.k;
        if (j - j2 < 4) {
            return (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24);
        }
        this.k = 4 + j2;
        return (zg5.f(j2) & 255) | ((zg5.f(1 + j2) & 255) << 8) | ((zg5.f(2 + j2) & 255) << 16) | ((zg5.f(j2 + 3) & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (defpackage.zg5.f(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int H() {
        int i;
        long j = this.k;
        if (this.m != j) {
            long j2 = j + 1;
            byte f = zg5.f(j);
            if (f >= 0) {
                this.k++;
                return f;
            } else if (this.m - this.k >= 10) {
                long j3 = j2 + 1;
                int f2 = f ^ (zg5.f(j2) << 7);
                if (f2 < 0) {
                    i = f2 ^ (-128);
                } else {
                    long j4 = j3 + 1;
                    int f3 = f2 ^ (zg5.f(j3) << 14);
                    if (f3 >= 0) {
                        i = f3 ^ 16256;
                    } else {
                        j3 = j4 + 1;
                        int f4 = f3 ^ (zg5.f(j4) << 21);
                        if (f4 < 0) {
                            i = f4 ^ (-2080896);
                        } else {
                            j4 = j3 + 1;
                            byte f5 = zg5.f(j3);
                            i = (f4 ^ (f5 << 28)) ^ 266354560;
                            if (f5 < 0) {
                                j3 = j4 + 1;
                                if (zg5.f(j4) < 0) {
                                    j4 = j3 + 1;
                                    if (zg5.f(j3) < 0) {
                                        j3 = j4 + 1;
                                        if (zg5.f(j4) < 0) {
                                            j4 = j3 + 1;
                                            if (zg5.f(j3) < 0) {
                                                j3 = j4 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j3 = j4;
                }
                this.k = j3;
                return i;
            }
        }
        return (int) K();
    }

    public final long I() {
        long j = this.m;
        long j2 = this.k;
        if (j - j2 < 8) {
            long F = (F() & 255) << 40;
            return (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24) | ((F() & 255) << 32) | F | ((F() & 255) << 48) | ((F() & 255) << 56);
        }
        this.k = 8 + j2;
        long f = (zg5.f(4 + j2) & 255) << 32;
        return (zg5.f(j2) & 255) | ((zg5.f(1 + j2) & 255) << 8) | ((zg5.f(j2 + 2) & 255) << 16) | ((zg5.f(j2 + 3) & 255) << 24) | f | ((zg5.f(j2 + 5) & 255) << 40) | ((zg5.f(j2 + 6) & 255) << 48) | ((zg5.f(j2 + 7) & 255) << 56);
    }

    public final long J() {
        long f;
        long j;
        long j2;
        int i;
        long j3 = this.k;
        if (this.m != j3) {
            long j4 = j3 + 1;
            byte f2 = zg5.f(j3);
            if (f2 >= 0) {
                this.k++;
                return f2;
            } else if (this.m - this.k >= 10) {
                long j5 = j4 + 1;
                int f3 = f2 ^ (zg5.f(j4) << 7);
                if (f3 >= 0) {
                    long j6 = j5 + 1;
                    int f4 = f3 ^ (zg5.f(j5) << 14);
                    if (f4 >= 0) {
                        f = f4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int f5 = f4 ^ (zg5.f(j6) << 21);
                        if (f5 < 0) {
                            i = f5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long f6 = f5 ^ (zg5.f(j5) << 28);
                            if (f6 < 0) {
                                long j7 = j6 + 1;
                                long f7 = f6 ^ (zg5.f(j6) << 35);
                                if (f7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    f6 = f7 ^ (zg5.f(j7) << 42);
                                    if (f6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        f7 = f6 ^ (zg5.f(j6) << 49);
                                        if (f7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            f = (f7 ^ (zg5.f(j7) << 56)) ^ 71499008037633920L;
                                            if (f < 0) {
                                                long j8 = 1 + j6;
                                                if (zg5.f(j6) >= 0) {
                                                    j5 = j8;
                                                    this.k = j5;
                                                    return f;
                                                }
                                            }
                                        }
                                    }
                                }
                                f = f7 ^ j;
                                j5 = j7;
                                this.k = j5;
                                return f;
                            }
                            j2 = 266354560;
                            f = f6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.k = j5;
                    return f;
                }
                i = f3 ^ (-128);
                f = i;
                this.k = j5;
                return f;
            }
        }
        return K();
    }

    public final long K() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte F = F();
            j |= (F & Byte.MAX_VALUE) << i;
            if ((F & 128) == 0) {
                return j;
            }
        }
        throw te5.c();
    }

    @Override // defpackage.ld5
    public final void a(int i) {
        this.h = i;
        int i2 = this.f + this.g;
        this.f = i2;
        if (i2 <= i) {
            this.g = 0;
            return;
        }
        int i3 = i2 - i;
        this.g = i3;
        this.f = i2 - i3;
    }

    @Override // defpackage.ld5
    public final boolean b() {
        return (((long) this.j) + this.k) - this.l == ((long) this.f);
    }

    @Override // defpackage.ld5
    public final boolean c() {
        return J() != 0;
    }

    @Override // defpackage.ld5
    public final boolean d(int i) {
        int p;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (F() >= 0) {
                    return true;
                }
            }
            throw te5.c();
        } else if (i2 == 1) {
            A(8);
            return true;
        } else if (i2 == 2) {
            A(H());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    A(4);
                    return true;
                }
                throw te5.a();
            }
            return false;
        } else {
            do {
                p = p();
                if (p == 0) {
                    break;
                }
            } while (d(p));
            z(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // defpackage.ld5
    public final double g() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.ld5
    public final float h() {
        return Float.intBitsToFloat(G());
    }

    @Override // defpackage.ld5
    public final int i() {
        return (int) ((this.j + this.k) - this.l);
    }

    @Override // defpackage.ld5
    public final int j(int i) {
        if (i >= 0) {
            int i2 = i() + i;
            int i3 = this.h;
            if (i2 <= i3) {
                this.h = i2;
                int i4 = this.f + this.g;
                this.f = i4;
                if (i4 > i2) {
                    int i5 = i4 - i2;
                    this.g = i5;
                    this.f = i4 - i5;
                } else {
                    this.g = 0;
                }
                return i3;
            }
            throw te5.f();
        }
        throw te5.d();
    }

    @Override // defpackage.ld5
    public final int k() {
        return H();
    }

    @Override // defpackage.ld5
    public final int l() {
        return G();
    }

    @Override // defpackage.ld5
    public final int m() {
        return H();
    }

    @Override // defpackage.ld5
    public final int n() {
        return G();
    }

    @Override // defpackage.ld5
    public final int o() {
        return ld5.e(H());
    }

    @Override // defpackage.ld5
    public final int p() {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int H = H();
        this.i = H;
        if ((H >>> 3) != 0) {
            return H;
        }
        throw new te5("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ld5
    public final int q() {
        return H();
    }

    @Override // defpackage.ld5
    public final long r() {
        return I();
    }

    @Override // defpackage.ld5
    public final long s() {
        return J();
    }

    @Override // defpackage.ld5
    public final long t() {
        return I();
    }

    @Override // defpackage.ld5
    public final long u() {
        return ld5.f(J());
    }

    @Override // defpackage.ld5
    public final long v() {
        return J();
    }

    @Override // defpackage.ld5
    public final ed5 w() {
        int H = H();
        if (H > 0) {
            long j = this.m;
            long j2 = this.k;
            long j3 = H;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[H];
                zg5.c.g(j2, bArr, 0L, j3);
                this.k += j3;
                return new ed5(bArr);
            }
        }
        if (H > 0 && H <= B()) {
            byte[] bArr2 = new byte[H];
            D(bArr2, H);
            return new ed5(bArr2);
        } else if (H == 0) {
            return gd5.Q;
        } else {
            if (H < 0) {
                throw te5.d();
            }
            throw te5.f();
        }
    }

    @Override // defpackage.ld5
    public final String x() {
        int H = H();
        if (H > 0) {
            long j = this.m;
            long j2 = this.k;
            long j3 = H;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[H];
                zg5.c.g(j2, bArr, 0L, j3);
                String str = new String(bArr, re5.a);
                this.k += j3;
                return str;
            }
        }
        if (H > 0 && H <= B()) {
            byte[] bArr2 = new byte[H];
            D(bArr2, H);
            return new String(bArr2, re5.a);
        } else if (H == 0) {
            return "";
        } else {
            if (H < 0) {
                throw te5.d();
            }
            throw te5.f();
        }
    }

    @Override // defpackage.ld5
    public final String y() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int H = H();
        if (H > 0) {
            long j = this.m;
            long j2 = this.k;
            long j3 = H;
            if (j3 <= j - j2) {
                long j4 = j2 - this.l;
                ByteBuffer byteBuffer = this.e;
                int i = (int) j4;
                bh5 bh5Var = dh5.a;
                if (byteBuffer.hasArray()) {
                    str = bh5Var.b(byteBuffer.array(), byteBuffer.arrayOffset() + i, H);
                } else {
                    byteBuffer.isDirect();
                    if ((((byteBuffer.limit() - i) - H) | i | H) >= 0) {
                        int i2 = i + H;
                        char[] cArr = new char[H];
                        int i3 = 0;
                        while (i < i2) {
                            byte b = byteBuffer.get(i);
                            if (b >= 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                break;
                            }
                            i++;
                            cArr[i3] = (char) b;
                            i3++;
                        }
                        int i4 = i3;
                        while (i < i2) {
                            int i5 = i + 1;
                            byte b2 = byteBuffer.get(i);
                            if (b2 >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                i = i5;
                                while (true) {
                                    i4 = i6;
                                    if (i >= i2) {
                                        break;
                                    }
                                    byte b3 = byteBuffer.get(i);
                                    if (b3 >= 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        i++;
                                        i6 = i4 + 1;
                                        cArr[i4] = (char) b3;
                                    }
                                }
                            } else {
                                if (b2 < -32) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    if (i5 < i2) {
                                        int i7 = i5 + 1;
                                        byte b4 = byteBuffer.get(i5);
                                        int i8 = i4 + 1;
                                        if (b2 >= -62 && !tv2.J(b4)) {
                                            cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                                            i = i7;
                                            i4 = i8;
                                        } else {
                                            throw te5.b();
                                        }
                                    } else {
                                        throw te5.b();
                                    }
                                } else {
                                    if (b2 < -16) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        if (i5 < i2 - 1) {
                                            int i9 = i5 + 1;
                                            tv2.z(b2, byteBuffer.get(i5), byteBuffer.get(i9), cArr, i4);
                                            i = i9 + 1;
                                            i4++;
                                        } else {
                                            throw te5.b();
                                        }
                                    } else if (i5 < i2 - 2) {
                                        int i10 = i5 + 1;
                                        byte b5 = byteBuffer.get(i5);
                                        int i11 = i10 + 1;
                                        tv2.v(b2, b5, byteBuffer.get(i10), byteBuffer.get(i11), cArr, i4);
                                        i4 += 2;
                                        i = i11 + 1;
                                    } else {
                                        throw te5.b();
                                    }
                                }
                            }
                        }
                        str = new String(cArr, 0, i4);
                    } else {
                        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(H)));
                    }
                }
                this.k += j3;
                return str;
            }
        }
        if (H >= 0 && H <= B()) {
            byte[] bArr = new byte[H];
            D(bArr, H);
            return dh5.a.b(bArr, 0, H);
        } else if (H == 0) {
            return "";
        } else {
            if (H <= 0) {
                throw te5.d();
            }
            throw te5.f();
        }
    }

    @Override // defpackage.ld5
    public final void z(int i) {
        if (this.i == i) {
            return;
        }
        throw new te5("Protocol message end-group tag did not match expected tag.");
    }
}