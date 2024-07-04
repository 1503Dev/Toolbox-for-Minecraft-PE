package defpackage;

/* renamed from: ge0  reason: default package */
public final class ge0 {
    public int[] a;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ge0(byte[] bArr) {
        int i;
        if (bArr.length > 4) {
            boolean z = false;
            int c = ea2.c(bArr, 0);
            int i2 = c - 1;
            int i3 = zx.a;
            if (i2 == 0) {
                i = 1;
            } else {
                i = 0;
                for (i2 = i2 < 0 ? -i2 : i2; i2 > 0; i2 >>>= 8) {
                    i++;
                }
            }
            if (bArr.length == (c * i) + 4) {
                this.a = new int[c];
                for (int i4 = 0; i4 < c; i4++) {
                    int[] iArr = this.a;
                    int i5 = (i4 * i) + 4;
                    int i6 = 0;
                    for (int i7 = i - 1; i7 >= 0; i7--) {
                        i6 |= (bArr[i5 + i7] & 255) << (i7 * 8);
                    }
                    iArr[i4] = i6;
                }
                int[] iArr2 = this.a;
                int length = iArr2.length;
                boolean[] zArr = new boolean[length];
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        int i9 = iArr2[i8];
                        if (i9 < 0 || i9 >= length || zArr[i9]) {
                            break;
                        }
                        zArr[i9] = true;
                        i8++;
                    } else {
                        z = true;
                        break;
                    }
                }
                throw new IllegalArgumentException("invalid encoding");
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    public final byte[] a() {
        int i;
        int length = this.a.length;
        int i2 = length - 1;
        int i3 = zx.a;
        if (i2 == 0) {
            i = 1;
        } else {
            if (i2 < 0) {
                i2 = -i2;
            }
            int i4 = 0;
            while (i2 > 0) {
                i4++;
                i2 >>>= 8;
            }
            i = i4;
        }
        byte[] bArr = new byte[(length * i) + 4];
        ea2.a(bArr, length, 0);
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = this.a[i5];
            int i7 = (i5 * i) + 4;
            for (int i8 = i - 1; i8 >= 0; i8--) {
                bArr[i7 + i8] = (byte) (i6 >>> (i8 * 8));
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ge0) {
            int[] iArr = this.a;
            int[] iArr2 = ((ge0) obj).a;
            if (iArr.length != iArr2.length) {
                return false;
            }
            boolean z = true;
            for (int length = iArr.length - 1; length >= 0; length--) {
                z &= iArr[length] == iArr2[length];
            }
            return z;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder b = e5.b("[");
        b.append(this.a[0]);
        String sb = b.toString();
        for (int i = 1; i < this.a.length; i++) {
            StringBuilder c = yg.c(sb, ", ");
            c.append(this.a[i]);
            sb = c.toString();
        }
        return k6.b(sb, "]");
    }
}