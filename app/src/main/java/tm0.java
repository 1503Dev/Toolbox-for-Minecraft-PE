package defpackage;

/* renamed from: tm0  reason: default package */
public final class tm0 extends bt {
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int[] X = new int[80];
    public int Y;

    public tm0() {
        reset();
    }

    @Override // defpackage.tl
    public final String b() {
        return "SHA-1";
    }

    @Override // defpackage.tl
    public final int c() {
        return 20;
    }

    @Override // defpackage.tl
    public final int d(byte[] bArr) {
        e();
        z61.d0(bArr, this.S, 0);
        z61.d0(bArr, this.T, 4);
        z61.d0(bArr, this.U, 8);
        z61.d0(bArr, this.V, 12);
        z61.d0(bArr, this.W, 16);
        reset();
        return 20;
    }

    @Override // defpackage.bt
    public final void g() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.S;
        int i4 = this.T;
        int i5 = this.U;
        int i6 = this.V;
        int i7 = this.W;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int[] iArr2 = this.X;
            int i10 = i9 + 1;
            int d = e1.d(((i3 << 5) | (i3 >>> 27)) + ((i5 & i4) | ((i4 ^ (-1)) & i6)), iArr2[i9], 1518500249, i7);
            int i11 = (i4 >>> 2) | (i4 << 30);
            int i12 = i10 + 1;
            int d2 = e1.d(((d << 5) | (d >>> 27)) + ((i11 & i3) | ((i3 ^ (-1)) & i5)), iArr2[i10], 1518500249, i6);
            int i13 = (i3 >>> 2) | (i3 << 30);
            int i14 = i12 + 1;
            int d3 = e1.d(((d2 << 5) | (d2 >>> 27)) + ((i13 & d) | ((d ^ (-1)) & i11)), iArr2[i12], 1518500249, i5);
            i7 = (d >>> 2) | (d << 30);
            int i15 = i14 + 1;
            i4 = e1.d(((d3 << 5) | (d3 >>> 27)) + ((i7 & d2) | ((d2 ^ (-1)) & i13)), iArr2[i14], 1518500249, i11);
            i6 = (d2 >>> 2) | (d2 << 30);
            i3 = e1.d(((i4 << 5) | (i4 >>> 27)) + ((i6 & d3) | ((d3 ^ (-1)) & i7)), iArr2[i15], 1518500249, i13);
            i5 = (d3 >>> 2) | (d3 << 30);
            i8++;
            i9 = i15 + 1;
        }
        int i16 = 0;
        while (i16 < 4) {
            int[] iArr3 = this.X;
            int i17 = i9 + 1;
            int d4 = e1.d(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr3[i9], 1859775393, i7);
            int i18 = (i4 >>> 2) | (i4 << 30);
            int i19 = i17 + 1;
            int d5 = e1.d(((d4 << 5) | (d4 >>> 27)) + ((i3 ^ i18) ^ i5), iArr3[i17], 1859775393, i6);
            int i20 = (i3 >>> 2) | (i3 << 30);
            int i21 = i19 + 1;
            int d6 = e1.d(((d5 << 5) | (d5 >>> 27)) + ((d4 ^ i20) ^ i18), iArr3[i19], 1859775393, i5);
            i7 = (d4 >>> 2) | (d4 << 30);
            int i22 = i21 + 1;
            i4 = e1.d(((d6 << 5) | (d6 >>> 27)) + ((d5 ^ i7) ^ i20), iArr3[i21], 1859775393, i18);
            i6 = (d5 >>> 2) | (d5 << 30);
            i3 = e1.d(((i4 << 5) | (i4 >>> 27)) + ((d6 ^ i6) ^ i7), iArr3[i22], 1859775393, i20);
            i5 = (d6 >>> 2) | (d6 << 30);
            i16++;
            i9 = i22 + 1;
        }
        int i23 = 0;
        while (i23 < 4) {
            int[] iArr4 = this.X;
            int i24 = i9 + 1;
            int d7 = e1.d(((i4 & i5) | (i4 & i6) | (i5 & i6)) + ((i3 << 5) | (i3 >>> 27)), iArr4[i9], -1894007588, i7);
            int i25 = (i4 >>> 2) | (i4 << 30);
            int i26 = i24 + 1;
            int d8 = e1.d(((i3 & i25) | (i3 & i5) | (i25 & i5)) + ((d7 << 5) | (d7 >>> 27)), iArr4[i24], -1894007588, i6);
            int i27 = (i3 >>> 2) | (i3 << 30);
            int i28 = i26 + 1;
            int d9 = e1.d(((d7 & i27) | (d7 & i25) | (i27 & i25)) + ((d8 << 5) | (d8 >>> 27)), iArr4[i26], -1894007588, i5);
            i7 = (d7 >>> 2) | (d7 << 30);
            int i29 = i28 + 1;
            i4 = e1.d(((d8 & i7) | (d8 & i27) | (i7 & i27)) + ((d9 << 5) | (d9 >>> 27)), iArr4[i28], -1894007588, i25);
            i6 = (d8 >>> 2) | (d8 << 30);
            i3 = e1.d(((d9 & i6) | (d9 & i7) | (i6 & i7)) + ((i4 << 5) | (i4 >>> 27)), iArr4[i29], -1894007588, i27);
            i5 = (d9 >>> 2) | (d9 << 30);
            i23++;
            i9 = i29 + 1;
        }
        int i30 = 0;
        while (i30 <= 3) {
            int[] iArr5 = this.X;
            int i31 = i9 + 1;
            int d10 = e1.d(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr5[i9], -899497514, i7);
            int i32 = (i4 >>> 2) | (i4 << 30);
            int i33 = i31 + 1;
            int d11 = e1.d(((d10 << 5) | (d10 >>> 27)) + ((i3 ^ i32) ^ i5), iArr5[i31], -899497514, i6);
            int i34 = (i3 >>> 2) | (i3 << 30);
            int i35 = i33 + 1;
            int d12 = e1.d(((d11 << 5) | (d11 >>> 27)) + ((d10 ^ i34) ^ i32), iArr5[i33], -899497514, i5);
            i7 = (d10 >>> 2) | (d10 << 30);
            int i36 = i35 + 1;
            i4 = e1.d(((d12 << 5) | (d12 >>> 27)) + ((d11 ^ i7) ^ i34), iArr5[i35], -899497514, i32);
            i6 = (d11 >>> 2) | (d11 << 30);
            i3 = e1.d(((i4 << 5) | (i4 >>> 27)) + ((d12 ^ i6) ^ i7), iArr5[i36], -899497514, i34);
            i5 = (d12 >>> 2) | (d12 << 30);
            i30++;
            i9 = i36 + 1;
        }
        this.S += i3;
        this.T += i4;
        this.U += i5;
        this.V += i6;
        this.W += i7;
        this.Y = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            this.X[i37] = 0;
        }
    }

    @Override // defpackage.bt
    public final void h(long j) {
        if (this.Y > 14) {
            g();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // defpackage.bt
    public final void i(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.X;
        int i5 = this.Y;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.Y = i6;
        if (i6 == 16) {
            g();
        }
    }

    @Override // defpackage.bt, defpackage.tl
    public final void reset() {
        super.reset();
        this.S = 1732584193;
        this.T = -271733879;
        this.U = -1732584194;
        this.V = 271733878;
        this.W = -1009589776;
        this.Y = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}