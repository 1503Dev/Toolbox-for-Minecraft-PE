package defpackage;

/* renamed from: um0  reason: default package */
public final class um0 extends bt {
    public static final int[] c0 = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int[] a0 = new int[64];
    public int b0;

    public um0() {
        reset();
    }

    @Override // defpackage.tl
    public final String b() {
        return "SHA-224";
    }

    @Override // defpackage.tl
    public final int c() {
        return 28;
    }

    @Override // defpackage.tl
    public final int d(byte[] bArr) {
        e();
        z61.d0(bArr, this.S, 0);
        z61.d0(bArr, this.T, 4);
        z61.d0(bArr, this.U, 8);
        z61.d0(bArr, this.V, 12);
        z61.d0(bArr, this.W, 16);
        z61.d0(bArr, this.X, 20);
        z61.d0(bArr, this.Y, 24);
        reset();
        return 28;
    }

    @Override // defpackage.bt
    public final void g() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.a0;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int i5 = this.S;
        int i6 = this.T;
        int i7 = this.U;
        int i8 = this.V;
        int i9 = this.W;
        int i10 = this.X;
        int i11 = this.Y;
        int i12 = this.Z;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int l = l(i9) + ((i10 & i9) ^ ((i9 ^ (-1)) & i11));
            int[] iArr2 = c0;
            int i15 = l + iArr2[i14] + this.a0[i14] + i12;
            int i16 = i8 + i15;
            int j = j(i5, i6, i7) + k(i5) + i15;
            int i17 = i14 + 1;
            int l2 = l(i16) + (((i16 ^ (-1)) & i10) ^ (i9 & i16)) + iArr2[i17] + this.a0[i17] + i11;
            int i18 = i7 + l2;
            int j2 = j(j, i5, i6) + k(j) + l2;
            int i19 = i17 + 1;
            int l3 = l(i18) + (((i18 ^ (-1)) & i9) ^ (i16 & i18)) + iArr2[i19] + this.a0[i19] + i10;
            int i20 = i6 + l3;
            int j3 = j(j2, j, i5) + k(j2) + l3;
            int i21 = i19 + 1;
            int l4 = l(i20) + (((i20 ^ (-1)) & i16) ^ (i18 & i20)) + iArr2[i21] + this.a0[i21] + i9;
            int i22 = i5 + l4;
            int j4 = j(j3, j2, j) + k(j3) + l4;
            int i23 = i21 + 1;
            int l5 = l(i22) + (((i22 ^ (-1)) & i18) ^ (i20 & i22)) + iArr2[i23] + this.a0[i23] + i16;
            int i24 = j + l5;
            int j5 = l5 + j(j4, j3, j2) + k(j4);
            int i25 = i23 + 1;
            int l6 = l(i24) + (((i24 ^ (-1)) & i20) ^ (i22 & i24)) + iArr2[i25] + this.a0[i25] + i18;
            int i26 = j2 + l6;
            int j6 = l6 + j(j5, j4, j3) + k(j5);
            int i27 = i25 + 1;
            int l7 = l(i26) + (((i26 ^ (-1)) & i22) ^ (i24 & i26)) + iArr2[i27] + this.a0[i27] + i20;
            int i28 = j3 + l7;
            int j7 = j(j6, j5, j4) + k(j6) + l7;
            int i29 = i27 + 1;
            int l8 = l(i28) + (((i28 ^ (-1)) & i24) ^ (i26 & i28)) + iArr2[i29] + this.a0[i29] + i22;
            i14 = i29 + 1;
            i13++;
            i9 = j4 + l8;
            i5 = j(j7, j6, j5) + k(j7) + l8;
            i11 = i26;
            i7 = j6;
            i10 = i28;
            i6 = j7;
            i12 = i24;
            i8 = j5;
        }
        this.S += i5;
        this.T += i6;
        this.U += i7;
        this.V += i8;
        this.W += i9;
        this.X += i10;
        this.Y += i11;
        this.Z += i12;
        this.b0 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            this.a0[i30] = 0;
        }
    }

    @Override // defpackage.bt
    public final void h(long j) {
        if (this.b0 > 14) {
            g();
        }
        int[] iArr = this.a0;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // defpackage.bt
    public final void i(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.a0;
        int i5 = this.b0;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.b0 = i6;
        if (i6 == 16) {
            g();
        }
    }

    public final int j(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    public final int k(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public final int l(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    @Override // defpackage.bt, defpackage.tl
    public final void reset() {
        super.reset();
        this.S = -1056596264;
        this.T = 914150663;
        this.U = 812702999;
        this.V = -150054599;
        this.W = -4191439;
        this.X = 1750603025;
        this.Y = 1694076839;
        this.Z = -1090891868;
        this.b0 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.a0;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}