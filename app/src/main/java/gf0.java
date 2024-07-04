package defpackage;

/* renamed from: gf0  reason: default package */
public final class gf0 {
    public ts a;
    public int b;
    public int[] c;

    public gf0(ts tsVar, int i) {
        this.a = tsVar;
        this.b = i;
        int[] iArr = new int[i + 1];
        this.c = iArr;
        iArr[i] = 1;
    }

    public gf0(ts tsVar, byte[] bArr) {
        this.a = tsVar;
        int i = 8;
        int i2 = 1;
        while (tsVar.a > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[bArr.length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                c();
                return;
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.c;
                iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                i5 += 8;
                i4++;
            }
            if (!this.a.b(this.c[i3])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i3++;
        }
    }

    public static int b(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public final int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            ts tsVar = this.a;
            int i = iArr3[length];
            int i2 = iArr[length];
            tsVar.getClass();
            iArr3[length] = i ^ i2;
        }
        return iArr3;
    }

    public final void c() {
        int length = this.c.length;
        do {
            this.b = length - 1;
            length = this.b;
            if (length < 0) {
                return;
            }
        } while (this.c[length] == 0);
    }

    public final int d(int i) {
        if (i < 0 || i > this.b) {
            return 0;
        }
        return this.c[i];
    }

    public final byte[] e() {
        int i = 8;
        int i2 = 1;
        while (this.a.a > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.c.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj != null && (obj instanceof gf0)) {
            gf0 gf0Var = (gf0) obj;
            if (this.a.equals(gf0Var.a) && this.b == gf0Var.b) {
                int[] iArr = this.c;
                int[] iArr2 = gf0Var.c;
                int b = b(iArr);
                if (b == b(iArr2)) {
                    for (int i = 0; i <= b; i++) {
                        if (iArr[i] == iArr2[i]) {
                        }
                    }
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }

    public final gf0 f(int i) {
        if (this.a.b(i)) {
            return new gf0(this.a, g(this.c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public final int[] g(int[] iArr, int i) {
        int b = b(iArr);
        if (b != -1 && i != 0) {
            if (i == 1) {
                int[] iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                return iArr2;
            }
            int[] iArr3 = new int[b + 1];
            while (b >= 0) {
                iArr3[b] = this.a.c(iArr[b], i);
                b--;
            }
            return iArr3;
        }
        return new int[1];
    }

    public final int hashCode() {
        int i = this.a.b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 < iArr.length) {
                i = (i * 31) + iArr[i2];
                i2++;
            } else {
                return i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        StringBuilder b = e5.b(" Polynomial over ");
        b.append(this.a.toString());
        b.append(": \n");
        String sb2 = b.toString();
        for (int i = 0; i < this.c.length; i++) {
            StringBuilder b2 = e5.b(sb2);
            ts tsVar = this.a;
            int i2 = this.c[i];
            String str2 = "";
            for (int i3 = 0; i3 < tsVar.a; i3++) {
                if ((((byte) i2) & 1) == 0) {
                    sb = new StringBuilder();
                    str = "0";
                } else {
                    sb = new StringBuilder();
                    str = "1";
                }
                str2 = qq.d(sb, str, str2);
                i2 >>>= 1;
            }
            b2.append(str2);
            b2.append("Y^");
            b2.append(i);
            b2.append("+");
            sb2 = b2.toString();
        }
        return k6.b(sb2, ";");
    }

    public gf0(ts tsVar, int[] iArr) {
        int[] iArr2;
        this.a = tsVar;
        int b = b(iArr);
        if (b == -1) {
            iArr2 = new int[1];
        } else {
            int i = b + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.c = iArr2;
        c();
    }

    public gf0(gf0 gf0Var) {
        this.a = gf0Var.a;
        this.b = gf0Var.b;
        int[] iArr = gf0Var.c;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.c = iArr2;
    }
}