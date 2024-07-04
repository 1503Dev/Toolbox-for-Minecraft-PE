package defpackage;

/* renamed from: qq1  reason: default package */
public final class qq1 {
    public final pl1 a;
    public ar1 d;
    public nq1 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final zq1 b = new zq1();
    public final kh4 c = new kh4();
    public final kh4 j = new kh4(1);
    public final kh4 k = new kh4();

    public qq1(pl1 pl1Var, ar1 ar1Var, nq1 nq1Var) {
        this.a = pl1Var;
        this.d = ar1Var;
        this.e = nq1Var;
        this.d = ar1Var;
        this.e = nq1Var;
        pl1Var.e(ar1Var.a.f);
        c();
    }

    public final int a(int i, int i2) {
        kh4 kh4Var;
        boolean z;
        boolean z2;
        int i3;
        yq1 b = b();
        if (b == null) {
            return 0;
        }
        int i4 = b.d;
        if (i4 != 0) {
            kh4Var = this.b.n;
        } else {
            byte[] bArr = b.e;
            int i5 = zn4.a;
            kh4 kh4Var2 = this.k;
            int length = bArr.length;
            kh4Var2.c(bArr, length);
            kh4Var = this.k;
            i4 = length;
        }
        zq1 zq1Var = this.b;
        int i6 = this.f;
        if (zq1Var.k && zq1Var.l[i6]) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        kh4 kh4Var3 = this.j;
        byte[] bArr2 = kh4Var3.a;
        if (true != z2) {
            i3 = 0;
        } else {
            i3 = 128;
        }
        bArr2[0] = (byte) (i3 | i4);
        kh4Var3.e(0);
        this.a.c(this.j, 1);
        this.a.c(kh4Var, i4);
        if (!z2) {
            return i4 + 1;
        }
        if (!z) {
            this.c.b(8);
            kh4 kh4Var4 = this.c;
            byte[] bArr3 = kh4Var4.a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = 0;
            bArr3[3] = (byte) i2;
            bArr3[4] = (byte) ((i >> 24) & 255);
            bArr3[5] = (byte) ((i >> 16) & 255);
            bArr3[6] = (byte) ((i >> 8) & 255);
            bArr3[7] = (byte) (i & 255);
            this.a.c(kh4Var4, 8);
            return i4 + 9;
        }
        kh4 kh4Var5 = this.b.n;
        int q = kh4Var5.q();
        kh4Var5.f(-2);
        int i7 = (q * 6) + 2;
        if (i2 != 0) {
            this.c.b(i7);
            byte[] bArr4 = this.c.a;
            kh4Var5.a(bArr4, 0, i7);
            int i8 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
            bArr4[2] = (byte) ((i8 >> 8) & 255);
            bArr4[3] = (byte) (i8 & 255);
            kh4Var5 = this.c;
        }
        this.a.c(kh4Var5, i7);
        return i4 + 1 + i7;
    }

    public final yq1 b() {
        if (!this.l) {
            return null;
        }
        zq1 zq1Var = this.b;
        nq1 nq1Var = zq1Var.a;
        int i = zn4.a;
        int i2 = nq1Var.a;
        yq1 yq1Var = zq1Var.m;
        if (yq1Var == null) {
            yq1[] yq1VarArr = this.d.a.k;
            if (yq1VarArr == null) {
                yq1Var = null;
            } else {
                yq1Var = yq1VarArr[i2];
            }
        }
        if (yq1Var == null || !yq1Var.a) {
            return null;
        }
        return yq1Var;
    }

    public final void c() {
        zq1 zq1Var = this.b;
        zq1Var.d = 0;
        zq1Var.p = 0L;
        zq1Var.q = false;
        zq1Var.k = false;
        zq1Var.o = false;
        zq1Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final boolean d() {
        this.f++;
        if (this.l) {
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i == iArr[i2]) {
                this.h = i2 + 1;
                this.g = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}