package defpackage;

import java.util.Arrays;

/* renamed from: hd5  reason: default package */
public final class hd5 extends ld5 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public /* synthetic */ hd5(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    public final void A(int i) {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw te5.f();
        }
        throw te5.d();
    }

    public final int B() {
        int i = this.f;
        if (this.d - i >= 4) {
            byte[] bArr = this.c;
            this.f = i + 4;
            int i2 = (bArr[i + 1] & 255) << 8;
            return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
        }
        throw te5.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            byte[] bArr = this.c;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) F();
    }

    public final long D() {
        int i = this.f;
        if (this.d - i >= 8) {
            byte[] bArr = this.c;
            this.f = i + 8;
            long j = bArr[i + 2];
            long j2 = bArr[i + 3];
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((j & 255) << 16) | ((j2 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw te5.f();
    }

    public final long E() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            byte[] bArr = this.c;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                                                    this.f = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.f = i5;
                return j2;
            }
        }
        return F();
    }

    public final long F() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 != this.d) {
                byte[] bArr = this.c;
                this.f = i2 + 1;
                byte b = bArr[i2];
                j |= (b & Byte.MAX_VALUE) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw te5.f();
            }
        }
        throw te5.c();
    }

    @Override // defpackage.ld5
    public final void a(int i) {
        this.i = i;
        int i2 = this.d + this.e;
        this.d = i2;
        int i3 = i2 - this.g;
        if (i3 <= i) {
            this.e = 0;
            return;
        }
        int i4 = i3 - i;
        this.e = i4;
        this.d = i2 - i4;
    }

    @Override // defpackage.ld5
    public final boolean b() {
        return this.f == this.d;
    }

    @Override // defpackage.ld5
    public final boolean c() {
        return E() != 0;
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
                A(C());
                return true;
            }
            A(8);
            return true;
        }
        if (this.d - this.f >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.c;
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw te5.c();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 != this.d) {
                byte[] bArr2 = this.c;
                this.f = i6 + 1;
                if (bArr2[i6] < 0) {
                    i3++;
                }
            } else {
                throw te5.f();
            }
        }
        throw te5.c();
        return true;
    }

    @Override // defpackage.ld5
    public final double g() {
        return Double.longBitsToDouble(D());
    }

    @Override // defpackage.ld5
    public final float h() {
        return Float.intBitsToFloat(B());
    }

    @Override // defpackage.ld5
    public final int i() {
        return this.f - this.g;
    }

    @Override // defpackage.ld5
    public final int j(int i) {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.g;
            int i4 = (i2 - i3) + i;
            if (i4 >= 0) {
                int i5 = this.i;
                if (i4 <= i5) {
                    this.i = i4;
                    int i6 = this.d + this.e;
                    this.d = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.e = i8;
                        this.d = i6 - i8;
                    } else {
                        this.e = 0;
                    }
                    return i5;
                }
                throw te5.f();
            }
            throw te5.e();
        }
        throw te5.d();
    }

    @Override // defpackage.ld5
    public final int k() {
        return C();
    }

    @Override // defpackage.ld5
    public final int l() {
        return B();
    }

    @Override // defpackage.ld5
    public final int m() {
        return C();
    }

    @Override // defpackage.ld5
    public final int n() {
        return B();
    }

    @Override // defpackage.ld5
    public final int o() {
        return ld5.e(C());
    }

    @Override // defpackage.ld5
    public final int p() {
        if (b()) {
            this.h = 0;
            return 0;
        }
        int C = C();
        this.h = C;
        if ((C >>> 3) != 0) {
            return C;
        }
        throw new te5("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.ld5
    public final int q() {
        return C();
    }

    @Override // defpackage.ld5
    public final long r() {
        return D();
    }

    @Override // defpackage.ld5
    public final long s() {
        return E();
    }

    @Override // defpackage.ld5
    public final long t() {
        return D();
    }

    @Override // defpackage.ld5
    public final long u() {
        return ld5.f(E());
    }

    @Override // defpackage.ld5
    public final long v() {
        return E();
    }

    @Override // defpackage.ld5
    public final ed5 w() {
        int C = C();
        if (C > 0) {
            int i = this.d;
            int i2 = this.f;
            if (C <= i - i2) {
                ed5 G = gd5.G(this.c, i2, C);
                this.f += C;
                return G;
            }
        }
        if (C != 0) {
            if (C > 0) {
                int i3 = this.d;
                int i4 = this.f;
                if (C <= i3 - i4) {
                    int i5 = C + i4;
                    this.f = i5;
                    return new ed5(Arrays.copyOfRange(this.c, i4, i5));
                }
            }
            if (C <= 0) {
                throw te5.d();
            }
            throw te5.f();
        }
        return gd5.Q;
    }

    @Override // defpackage.ld5
    public final String x() {
        int C = C();
        if (C > 0) {
            int i = this.d;
            int i2 = this.f;
            if (C <= i - i2) {
                String str = new String(this.c, i2, C, re5.a);
                this.f += C;
                return str;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C < 0) {
            throw te5.d();
        }
        throw te5.f();
    }

    @Override // defpackage.ld5
    public final String y() {
        int C = C();
        if (C > 0) {
            int i = this.d;
            int i2 = this.f;
            if (C <= i - i2) {
                String b = dh5.a.b(this.c, i2, C);
                this.f += C;
                return b;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C <= 0) {
            throw te5.d();
        }
        throw te5.f();
    }

    @Override // defpackage.ld5
    public final void z(int i) {
        if (this.h == i) {
            return;
        }
        throw new te5("Protocol message end-group tag did not match expected tag.");
    }
}