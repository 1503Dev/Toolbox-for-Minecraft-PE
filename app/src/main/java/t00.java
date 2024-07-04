package defpackage;

/* renamed from: t00  reason: default package */
public final class t00 {
    public int a;
    public int b;
    public int c;
    public short[][][] d;
    public short[][][] e;
    public short[][] f;
    public short[] g;

    public t00(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b & 255;
        this.a = i;
        int i2 = b2 & 255;
        this.b = i2;
        this.c = i2 - i;
        this.d = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj != null && (obj instanceof t00)) {
            t00 t00Var = (t00) obj;
            if (this.a == t00Var.a && this.b == t00Var.b && this.c == t00Var.c) {
                short[][][] sArr = this.d;
                short[][][] sArr2 = t00Var.d;
                if (sArr.length != sArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int length = sArr.length - 1; length >= 0; length--) {
                        z &= ja.j(sArr[length], sArr2[length]);
                    }
                }
                if (z) {
                    short[][][] sArr3 = this.e;
                    short[][][] sArr4 = t00Var.e;
                    if (sArr3.length != sArr4.length) {
                        z2 = false;
                    } else {
                        z2 = true;
                        for (int length2 = sArr3.length - 1; length2 >= 0; length2--) {
                            z2 &= ja.j(sArr3[length2], sArr4[length2]);
                        }
                    }
                    if (z2 && ja.j(this.f, t00Var.f) && ja.i(this.g, t00Var.g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.a * 37) + this.b) * 37) + this.c) * 37;
        short[][][] sArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 != sArr.length; i3++) {
            i2 = (i2 * 257) + j7.l(sArr[i3]);
        }
        int i4 = (i2 + i) * 37;
        short[][][] sArr2 = this.e;
        int i5 = 0;
        for (int i6 = 0; i6 != sArr2.length; i6++) {
            i5 = (i5 * 257) + j7.l(sArr2[i6]);
        }
        int l = j7.l(this.f);
        return j7.k(this.g) + ((l + ((i5 + i4) * 37)) * 37);
    }
}