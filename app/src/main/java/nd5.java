package defpackage;

/* renamed from: nd5  reason: default package */
public final class nd5 extends qd5 {
    public final byte[] T;
    public final int U;
    public int V;

    public nd5(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.T = bArr;
        this.V = 0;
        this.U = i;
    }

    @Override // defpackage.qd5
    public final void A(int i) {
        if (i >= 0) {
            F(i);
        } else {
            H(i);
        }
    }

    @Override // defpackage.qd5
    public final void B(int i, nf5 nf5Var, dg5 dg5Var) {
        F((i << 3) | 2);
        F(((vc5) nf5Var).e(dg5Var));
        dg5Var.j(nf5Var, this.Q);
    }

    @Override // defpackage.qd5
    public final void C(int i, String str) {
        int b;
        F((i << 3) | 2);
        int i2 = this.V;
        try {
            int p = qd5.p(str.length() * 3);
            int p2 = qd5.p(str.length());
            if (p2 == p) {
                int i3 = i2 + p2;
                this.V = i3;
                b = dh5.b(str, this.T, i3, this.U - i3);
                this.V = i2;
                F((b - i2) - p2);
            } else {
                F(dh5.c(str));
                byte[] bArr = this.T;
                int i4 = this.V;
                b = dh5.b(str, bArr, i4, this.U - i4);
            }
            this.V = b;
        } catch (ch5 e) {
            this.V = i2;
            r(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new od5(e2);
        }
    }

    @Override // defpackage.qd5
    public final void D(int i, int i2) {
        F((i << 3) | i2);
    }

    @Override // defpackage.qd5
    public final void E(int i, int i2) {
        F(i << 3);
        F(i2);
    }

    @Override // defpackage.qd5
    public final void F(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.T;
                int i2 = this.V;
                this.V = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new od5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
            }
        }
        byte[] bArr2 = this.T;
        int i3 = this.V;
        this.V = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // defpackage.qd5
    public final void G(long j, int i) {
        F(i << 3);
        H(j);
    }

    @Override // defpackage.qd5
    public final void H(long j) {
        if (qd5.S && this.U - this.V >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.T;
                int i = this.V;
                this.V = i + 1;
                zg5.q(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.T;
            int i2 = this.V;
            this.V = i2 + 1;
            zg5.q(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.T;
                int i3 = this.V;
                this.V = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new od5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
            }
        }
        byte[] bArr4 = this.T;
        int i4 = this.V;
        this.V = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // defpackage.fy4
    public final void i(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.T, this.V, i2);
            this.V += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new od5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.qd5
    public final void s(byte b) {
        try {
            byte[] bArr = this.T;
            int i = this.V;
            this.V = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new od5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
        }
    }

    @Override // defpackage.qd5
    public final void t(int i, boolean z) {
        F(i << 3);
        s(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.qd5
    public final void u(int i, gd5 gd5Var) {
        F((i << 3) | 2);
        F(gd5Var.o());
        gd5Var.z(this);
    }

    @Override // defpackage.qd5
    public final void v(int i, int i2) {
        F((i << 3) | 5);
        w(i2);
    }

    @Override // defpackage.qd5
    public final void w(int i) {
        try {
            byte[] bArr = this.T;
            int i2 = this.V;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.V = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new od5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
        }
    }

    @Override // defpackage.qd5
    public final void x(long j, int i) {
        F((i << 3) | 1);
        y(j);
    }

    @Override // defpackage.qd5
    public final void y(long j) {
        try {
            byte[] bArr = this.T;
            int i = this.V;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.V = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new od5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
        }
    }

    @Override // defpackage.qd5
    public final void z(int i, int i2) {
        F(i << 3);
        A(i2);
    }
}