package defpackage;

/* renamed from: zm0  reason: default package */
public final class zm0 implements g91, tl {
    public static long[] V;
    public static int[] W;
    public long[] P;
    public byte[] Q;
    public int R;
    public int S;
    public int T;
    public boolean U;

    static {
        boolean z;
        long[] jArr = new long[24];
        int i = 1;
        int i2 = 0;
        byte[] bArr = {1};
        for (int i3 = 0; i3 < 24; i3++) {
            jArr[i3] = 0;
            for (int i4 = 0; i4 < 7; i4++) {
                int i5 = (1 << i4) - 1;
                byte b = bArr[0];
                if ((b & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i6 = b & 128;
                int i7 = b << 1;
                if (i6 != 0) {
                    bArr[0] = (byte) (i7 ^ 113);
                } else {
                    bArr[0] = (byte) i7;
                }
                if (z) {
                    jArr[i3] = jArr[i3] ^ (1 << i5);
                }
            }
        }
        V = jArr;
        int[] iArr = new int[25];
        iArr[0] = 0;
        int i8 = 0;
        while (i2 < 24) {
            int i9 = i2 + 1;
            iArr[((i8 % 5) * 5) + (i % 5)] = (((i2 + 2) * i9) / 2) % 64;
            int i10 = i8 * 1;
            i8 = ((i8 * 3) + (i * 2)) % 5;
            i = (i10 + (i * 0)) % 5;
            i2 = i9;
        }
        W = iArr;
    }

    public zm0(int i) {
        if (i != 128 && i != 256) {
            throw new IllegalArgumentException(bp.b("'bitLength' ", i, " not supported for SHAKE"));
        }
        this.P = new long[25];
        this.Q = new byte[192];
        j(i);
    }

    @Override // defpackage.g91
    public final int a(byte[] bArr, int i) {
        boolean z = this.U;
        if (!z) {
            int i2 = this.S;
            if (i2 % 8 == 0) {
                if (!z) {
                    this.Q[i2 >> 3] = (byte) 15;
                    this.S = i2 + 4;
                } else {
                    throw new IllegalStateException("attempt to absorb while squeezing");
                }
            } else {
                throw new IllegalStateException("attempt to absorb with odd length queue");
            }
        }
        long j = i * 8;
        if (!z) {
            byte[] bArr2 = this.Q;
            int i3 = this.S;
            int i4 = i3 >> 3;
            bArr2[i4] = (byte) (bArr2[i4] | ((byte) (1 << (i3 & 7))));
            int i5 = i3 + 1;
            this.S = i5;
            if (i5 == this.R) {
                e(bArr2, 0);
                this.S = 0;
            }
            int i6 = this.S;
            int i7 = i6 >> 6;
            int i8 = i6 & 63;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                long[] jArr = this.P;
                jArr[i10] = z61.w0(this.Q, i9) ^ jArr[i10];
                i9 += 8;
            }
            if (i8 > 0) {
                long[] jArr2 = this.P;
                jArr2[i7] = (z61.w0(this.Q, i9) & ((1 << i8) - 1)) ^ jArr2[i7];
            }
            long[] jArr3 = this.P;
            int i11 = (this.R - 1) >> 6;
            jArr3[i11] = jArr3[i11] ^ Long.MIN_VALUE;
            h();
            g();
            this.S = this.R;
            this.U = true;
        }
        long j2 = 0;
        if (j % 8 == 0) {
            while (j2 < j) {
                if (this.S == 0) {
                    h();
                    g();
                    this.S = this.R;
                }
                int min = (int) Math.min(this.S, j - j2);
                System.arraycopy(this.Q, (this.R - this.S) / 8, bArr, ((int) (j2 / 8)) + 0, min / 8);
                this.S -= min;
                j2 += min;
            }
            reset();
            return i;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }

    @Override // defpackage.tl
    public final String b() {
        StringBuilder b = e5.b("SHAKE");
        b.append(this.T);
        return b.toString();
    }

    @Override // defpackage.tl
    public final int c() {
        return this.T / 8;
    }

    @Override // defpackage.tl
    public final int d(byte[] bArr) {
        int i = this.T / 8;
        a(bArr, i);
        return i;
    }

    public final void e(byte[] bArr, int i) {
        int i2 = this.R >> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.P;
            jArr[i3] = jArr[i3] ^ z61.w0(bArr, i);
            i += 8;
        }
        h();
    }

    @Override // defpackage.tl
    public final void f(byte b) {
        i(new byte[]{b}, 0, 1);
    }

    public final void g() {
        long[] jArr = this.P;
        int i = this.R >> 6;
        byte[] bArr = this.Q;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j = jArr[0 + i3];
            int i4 = (int) (4294967295L & j);
            bArr[i2] = (byte) i4;
            int i5 = i2 + 1;
            bArr[i5] = (byte) (i4 >>> 8);
            int i6 = i5 + 1;
            bArr[i6] = (byte) (i4 >>> 16);
            bArr[i6 + 1] = (byte) (i4 >>> 24);
            int i7 = (int) (j >>> 32);
            int i8 = i2 + 4;
            bArr[i8] = (byte) i7;
            int i9 = i8 + 1;
            bArr[i9] = (byte) (i7 >>> 8);
            int i10 = i9 + 1;
            bArr[i10] = (byte) (i7 >>> 16);
            bArr[i10 + 1] = (byte) (i7 >>> 24);
            i2 += 8;
        }
    }

    public final void h() {
        for (int i = 0; i < 24; i++) {
            long[] jArr = this.P;
            long j = jArr[0];
            long j2 = jArr[5];
            long j3 = jArr[10];
            long j4 = jArr[15];
            long j5 = jArr[20];
            long j6 = (((j ^ j2) ^ j3) ^ j4) ^ j5;
            long j7 = jArr[1];
            long j8 = jArr[6];
            long j9 = jArr[11];
            long j10 = jArr[16];
            long j11 = jArr[21];
            long j12 = (((j7 ^ j8) ^ j9) ^ j10) ^ j11;
            long j13 = jArr[2];
            long j14 = jArr[7];
            long j15 = jArr[12];
            long j16 = jArr[17];
            long j17 = jArr[22];
            long j18 = (((j13 ^ j14) ^ j15) ^ j16) ^ j17;
            long j19 = jArr[3];
            long j20 = jArr[8];
            long j21 = jArr[13];
            long j22 = jArr[18];
            long j23 = jArr[23];
            long j24 = (((j19 ^ j20) ^ j21) ^ j22) ^ j23;
            long j25 = jArr[4];
            long j26 = jArr[9];
            long j27 = jArr[14];
            long j28 = jArr[19];
            long j29 = jArr[24];
            long j30 = (((j25 ^ j26) ^ j27) ^ j28) ^ j29;
            long j31 = ((j12 >>> (-1)) | (j12 << 1)) ^ j30;
            jArr[0] = j ^ j31;
            jArr[5] = j2 ^ j31;
            jArr[10] = j3 ^ j31;
            jArr[15] = j4 ^ j31;
            jArr[20] = j5 ^ j31;
            long j32 = ((j18 << 1) | (j18 >>> (-1))) ^ j6;
            jArr[1] = j7 ^ j32;
            jArr[6] = j8 ^ j32;
            jArr[11] = j9 ^ j32;
            jArr[16] = j10 ^ j32;
            jArr[21] = j11 ^ j32;
            long j33 = ((j24 << 1) | (j24 >>> (-1))) ^ j12;
            jArr[2] = j13 ^ j33;
            jArr[7] = j14 ^ j33;
            jArr[12] = j15 ^ j33;
            jArr[17] = j16 ^ j33;
            jArr[22] = j17 ^ j33;
            long j34 = ((j30 << 1) | (j30 >>> (-1))) ^ j18;
            jArr[3] = j19 ^ j34;
            jArr[8] = j20 ^ j34;
            jArr[13] = j21 ^ j34;
            jArr[18] = j22 ^ j34;
            jArr[23] = j23 ^ j34;
            long j35 = ((j6 << 1) | (j6 >>> (-1))) ^ j24;
            jArr[4] = j25 ^ j35;
            jArr[9] = j26 ^ j35;
            jArr[14] = j27 ^ j35;
            jArr[19] = j28 ^ j35;
            jArr[24] = j29 ^ j35;
            for (int i2 = 1; i2 < 25; i2++) {
                long j36 = jArr[i2];
                int i3 = W[i2];
                jArr[i2] = (j36 >>> (-i3)) | (j36 << i3);
            }
            long[] jArr2 = this.P;
            long j37 = jArr2[1];
            jArr2[1] = jArr2[6];
            jArr2[6] = jArr2[9];
            jArr2[9] = jArr2[22];
            jArr2[22] = jArr2[14];
            jArr2[14] = jArr2[20];
            jArr2[20] = jArr2[2];
            jArr2[2] = jArr2[12];
            jArr2[12] = jArr2[13];
            jArr2[13] = jArr2[19];
            jArr2[19] = jArr2[23];
            jArr2[23] = jArr2[15];
            jArr2[15] = jArr2[4];
            jArr2[4] = jArr2[24];
            jArr2[24] = jArr2[21];
            jArr2[21] = jArr2[8];
            jArr2[8] = jArr2[16];
            jArr2[16] = jArr2[5];
            jArr2[5] = jArr2[3];
            jArr2[3] = jArr2[18];
            jArr2[18] = jArr2[17];
            jArr2[17] = jArr2[11];
            jArr2[11] = jArr2[7];
            jArr2[7] = jArr2[10];
            jArr2[10] = j37;
            for (int i4 = 0; i4 < 25; i4 += 5) {
                int i5 = i4 + 0;
                long j38 = jArr2[i5];
                int i6 = i4 + 1;
                long j39 = jArr2[i6];
                int i7 = i4 + 2;
                long j40 = jArr2[i7];
                long j41 = ((j39 ^ (-1)) & j40) ^ j38;
                int i8 = i4 + 3;
                long j42 = jArr2[i8];
                int i9 = i4 + 4;
                long j43 = jArr2[i9];
                jArr2[i5] = j41;
                jArr2[i6] = ((j40 ^ (-1)) & j42) ^ j39;
                jArr2[i7] = j40 ^ ((j42 ^ (-1)) & j43);
                jArr2[i8] = j42 ^ ((j43 ^ (-1)) & j38);
                jArr2[i9] = j43 ^ ((j38 ^ (-1)) & j39);
            }
            long[] jArr3 = this.P;
            jArr3[0] = jArr3[0] ^ V[i];
        }
    }

    public final void i(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.S;
        if (i4 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.U) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i5 = i4 >> 3;
        int i6 = this.R >> 3;
        int i7 = 0;
        while (i7 < i2) {
            if (i5 != 0 || i7 > (i3 = i2 - i6)) {
                int min = Math.min(i6 - i5, i2 - i7);
                System.arraycopy(bArr, i + i7, this.Q, i5, min);
                i5 += min;
                i7 += min;
                if (i5 == i6) {
                    e(this.Q, 0);
                    i5 = 0;
                }
            } else {
                do {
                    e(bArr, i + i7);
                    i7 += i6;
                } while (i7 <= i3);
            }
        }
        this.S = i5 << 3;
    }

    public final void j(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        int i2 = 1600 - (i << 1);
        if (i2 > 0 && i2 < 1600 && i2 % 64 == 0) {
            this.R = i2;
            int i3 = 0;
            while (true) {
                long[] jArr = this.P;
                if (i3 >= jArr.length) {
                    break;
                }
                jArr[i3] = 0;
                i3++;
            }
            byte[] bArr = this.Q;
            for (int i4 = 0; i4 < bArr.length; i4++) {
                bArr[i4] = 0;
            }
            this.S = 0;
            this.U = false;
            this.T = (1600 - i2) / 2;
            return;
        }
        throw new IllegalStateException("invalid rate value");
    }

    @Override // defpackage.tl
    public final void reset() {
        j(this.T);
    }

    @Override // defpackage.tl
    public final void update(byte[] bArr, int i, int i2) {
        i(bArr, i, i2);
    }
}