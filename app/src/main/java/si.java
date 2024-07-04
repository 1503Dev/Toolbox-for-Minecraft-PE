package defpackage;

/* renamed from: si  reason: default package */
public final class si extends t {
    public final byte[] P;

    public si(byte[] bArr) {
        this.P = bArr;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        return j7.h(this.P);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof si) {
            return j7.a(this.P, ((si) tVar).P);
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.d(this.P, 12);
    }

    @Override // defpackage.t
    public final int r() {
        return eu0.a(this.P.length) + 1 + this.P.length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }

    public final String toString() {
        char c;
        int i;
        byte b;
        byte[] bArr = this.P;
        String str = hu0.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            i4++;
            byte b2 = bArr[i3];
            if ((b2 & 240) == 240) {
                i4++;
                i3 += 4;
            } else if ((b2 & 224) == 224) {
                i3 += 3;
            } else if ((b2 & 192) == 192) {
                i3 += 2;
            } else {
                i3++;
            }
        }
        char[] cArr = new char[i4];
        int i5 = 0;
        while (i2 < bArr.length) {
            byte b3 = bArr[i2];
            if ((b3 & 240) == 240) {
                int i6 = (((((b3 & 3) << 18) | ((bArr[i2 + 1] & 63) << 12)) | ((bArr[i2 + 2] & 63) << 6)) | (bArr[i2 + 3] & 63)) - 65536;
                c = (char) ((i6 & 1023) | 56320);
                cArr[i5] = (char) (55296 | (i6 >> 10));
                i2 += 4;
                i5++;
            } else if ((b3 & 224) == 224) {
                c = (char) (((b3 & 15) << 12) | ((bArr[i2 + 1] & 63) << 6) | (bArr[i2 + 2] & 63));
                i2 += 3;
            } else {
                if ((b3 & 208) == 208) {
                    i = (b3 & 31) << 6;
                    b = bArr[i2 + 1];
                } else if ((b3 & 192) == 192) {
                    i = (b3 & 31) << 6;
                    b = bArr[i2 + 1];
                } else {
                    c = (char) (b3 & 255);
                    i2++;
                }
                c = (char) (i | (b & 63));
                i2 += 2;
            }
            cArr[i5] = c;
            i5++;
        }
        return new String(cArr);
    }
}