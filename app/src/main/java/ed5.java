package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ed5  reason: default package */
public class ed5 extends dd5 {
    public final byte[] R;

    public ed5(byte[] bArr) {
        bArr.getClass();
        this.R = bArr;
    }

    @Override // defpackage.gd5
    public final boolean C() {
        int J = J();
        return dh5.d(this.R, J, o() + J);
    }

    @Override // defpackage.dd5
    public final boolean I(gd5 gd5Var, int i, int i2) {
        if (i2 > gd5Var.o()) {
            int o = o();
            throw new IllegalArgumentException("Length too large: " + i2 + o);
        }
        int i3 = i + i2;
        if (i3 > gd5Var.o()) {
            int o2 = gd5Var.o();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + o2);
        } else if (gd5Var instanceof ed5) {
            ed5 ed5Var = (ed5) gd5Var;
            byte[] bArr = this.R;
            byte[] bArr2 = ed5Var.R;
            int J = J() + i2;
            int J2 = J();
            int J3 = ed5Var.J() + i;
            while (J2 < J) {
                if (bArr[J2] != bArr2[J3]) {
                    return false;
                }
                J2++;
                J3++;
            }
            return true;
        } else {
            return gd5Var.u(i, i3).equals(u(0, i2));
        }
    }

    public int J() {
        return 0;
    }

    @Override // defpackage.gd5
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gd5) || o() != ((gd5) obj).o()) {
            return false;
        }
        if (o() == 0) {
            return true;
        }
        if (obj instanceof ed5) {
            ed5 ed5Var = (ed5) obj;
            int i = this.P;
            int i2 = ed5Var.P;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return I(ed5Var, 0, o());
        }
        return obj.equals(this);
    }

    @Override // defpackage.gd5
    public byte h(int i) {
        return this.R[i];
    }

    @Override // defpackage.gd5
    public byte m(int i) {
        return this.R[i];
    }

    @Override // defpackage.gd5
    public int o() {
        return this.R.length;
    }

    @Override // defpackage.gd5
    public void p(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.R, i, bArr, i2, i3);
    }

    @Override // defpackage.gd5
    public final int s(int i, int i2, int i3) {
        byte[] bArr = this.R;
        int J = J() + i2;
        Charset charset = re5.a;
        for (int i4 = J; i4 < J + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // defpackage.gd5
    public final int t(int i, int i2, int i3) {
        int J = J() + i2;
        byte[] bArr = this.R;
        return dh5.a.a(i, J, i3 + J, bArr);
    }

    @Override // defpackage.gd5
    public final gd5 u(int i, int i2) {
        int D = gd5.D(i, i2, o());
        return D == 0 ? gd5.Q : new cd5(this.R, J() + i, D);
    }

    @Override // defpackage.gd5
    public final ld5 v() {
        byte[] bArr = this.R;
        int J = J();
        int o = o();
        hd5 hd5Var = new hd5(bArr, J, o);
        try {
            hd5Var.j(o);
            return hd5Var;
        } catch (te5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.gd5
    public final String w(Charset charset) {
        return new String(this.R, J(), o(), charset);
    }

    @Override // defpackage.gd5
    public final ByteBuffer y() {
        return ByteBuffer.wrap(this.R, J(), o()).asReadOnlyBuffer();
    }

    @Override // defpackage.gd5
    public final void z(qd5 qd5Var) {
        qd5Var.i(this.R, J(), o());
    }
}