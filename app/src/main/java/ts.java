package defpackage;

/* renamed from: ts  reason: default package */
public final class ts {
    public int a;
    public int b;

    public ts(byte[] bArr) {
        boolean z = false;
        this.a = 0;
        if (bArr.length == 4) {
            int i = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
            int i2 = 2;
            int i3 = ((bArr[3] & 255) << 24) | i | ((bArr[2] & 255) << 16);
            this.b = i3;
            if (i3 != 0) {
                int d = n42.d(i3) >>> 1;
                int i4 = 0;
                while (true) {
                    if (i4 < d) {
                        i2 = n42.h(i2, i2, i3);
                        int i5 = i2 ^ 2;
                        int i6 = i3;
                        while (i6 != 0) {
                            int l = n42.l(i5, i6);
                            i5 = i6;
                            i6 = l;
                        }
                        if (i5 != 1) {
                            break;
                        }
                        i4++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                this.a = n42.d(this.b);
                return;
            }
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    public final int a(int i) {
        int i2 = (1 << this.a) - 2;
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = a(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = c(i3, i);
            }
            i = c(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    public final boolean b(int i) {
        int i2 = this.a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public final int c(int i, int i2) {
        return n42.h(i, i2, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ts)) {
            ts tsVar = (ts) obj;
            if (this.a == tsVar.a && this.b == tsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder b = e5.b("Finite Field GF(2^");
        b.append(this.a);
        b.append(") = GF(2)[X]/<");
        int i = this.b;
        if (i == 0) {
            str2 = "0";
        } else {
            if (((byte) (i & 1)) == 1) {
                str = "1";
            } else {
                str = "";
            }
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    str = str + "+x^" + i3;
                }
                i2 >>>= 1;
                i3++;
            }
            str2 = str;
        }
        return qq.d(b, str2, "> ");
    }
}