package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: uq0  reason: default package */
public final class uq0 extends fb {
    public final transient byte[][] U;
    public final transient int[] V;

    public uq0(za zaVar, int i) {
        super(null);
        b31.a(zaVar.Q, 0L, i);
        sq0 sq0Var = zaVar.P;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = sq0Var.c;
            int i6 = sq0Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            sq0Var = sq0Var.f;
        }
        this.U = new byte[i4];
        this.V = new int[i4 * 2];
        sq0 sq0Var2 = zaVar.P;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.U;
            bArr[i7] = sq0Var2.a;
            int i8 = sq0Var2.c;
            int i9 = sq0Var2.b;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.V;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            sq0Var2.d = true;
            i7++;
            sq0Var2 = sq0Var2.f;
        }
    }

    @Override // defpackage.fb
    public final ByteBuffer b() {
        return ByteBuffer.wrap(t()).asReadOnlyBuffer();
    }

    @Override // defpackage.fb
    public final String e() {
        return u().e();
    }

    @Override // defpackage.fb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fb) {
            fb fbVar = (fb) obj;
            if (fbVar.n() == n() && m(fbVar, n())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fb
    public final int hashCode() {
        int i = this.Q;
        if (i != 0) {
            return i;
        }
        int length = this.U.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.U[i2];
            int[] iArr = this.V;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.Q = i4;
        return i4;
    }

    @Override // defpackage.fb
    public final byte i(int i) {
        b31.a(this.V[this.U.length - 1], i, 1L);
        int s = s(i);
        int i2 = s == 0 ? 0 : this.V[s - 1];
        int[] iArr = this.V;
        byte[][] bArr = this.U;
        return bArr[s][(i - i2) + iArr[bArr.length + s]];
    }

    @Override // defpackage.fb
    public final String j() {
        return u().j();
    }

    @Override // defpackage.fb
    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > n() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int s = s(i);
        while (true) {
            boolean z = true;
            if (i3 <= 0) {
                return true;
            }
            int i4 = s == 0 ? 0 : this.V[s - 1];
            int min = Math.min(i3, ((this.V[s] - i4) + i4) - i);
            int[] iArr = this.V;
            byte[][] bArr2 = this.U;
            int i5 = (i - i4) + iArr[bArr2.length + s];
            byte[] bArr3 = bArr2[s];
            Charset charset = b31.a;
            int i6 = 0;
            while (true) {
                if (i6 >= min) {
                    break;
                } else if (bArr3[i6 + i5] != bArr[i6 + i2]) {
                    z = false;
                    break;
                } else {
                    i6++;
                }
            }
            if (!z) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            s++;
        }
    }

    @Override // defpackage.fb
    public final boolean m(fb fbVar, int i) {
        if (n() - i < 0) {
            return false;
        }
        int s = s(0);
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int i4 = s == 0 ? 0 : this.V[s - 1];
            int min = Math.min(i, ((this.V[s] - i4) + i4) - i2);
            int[] iArr = this.V;
            byte[][] bArr = this.U;
            if (!fbVar.l(i3, (i2 - i4) + iArr[bArr.length + s], min, bArr[s])) {
                return false;
            }
            i2 += min;
            i3 += min;
            i -= min;
            s++;
        }
        return true;
    }

    @Override // defpackage.fb
    public final int n() {
        return this.V[this.U.length - 1];
    }

    @Override // defpackage.fb
    public final fb o() {
        return u().o();
    }

    @Override // defpackage.fb
    public final fb p() {
        return u().p();
    }

    @Override // defpackage.fb
    public final String q() {
        return u().q();
    }

    @Override // defpackage.fb
    public final void r(za zaVar) {
        int length = this.U.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.V;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            sq0 sq0Var = new sq0(this.U[i], i3, (i3 + i4) - i2, true, false);
            sq0 sq0Var2 = zaVar.P;
            if (sq0Var2 == null) {
                sq0Var.g = sq0Var;
                sq0Var.f = sq0Var;
                zaVar.P = sq0Var;
            } else {
                sq0Var2.g.b(sq0Var);
            }
            i++;
            i2 = i4;
        }
        zaVar.Q += i2;
    }

    public final int s(int i) {
        int binarySearch = Arrays.binarySearch(this.V, 0, this.U.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    public final byte[] t() {
        int[] iArr = this.V;
        byte[][] bArr = this.U;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.V;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.U[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // defpackage.fb
    public final String toString() {
        return u().toString();
    }

    public final fb u() {
        return new fb(t());
    }
}