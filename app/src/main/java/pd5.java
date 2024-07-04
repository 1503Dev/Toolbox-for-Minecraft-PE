package defpackage;

import java.io.OutputStream;

/* renamed from: pd5  reason: default package */
public final class pd5 extends qd5 {
    public final byte[] T;
    public final int U;
    public int V;
    public int W;
    public final OutputStream X;

    public pd5(OutputStream outputStream, int i) {
        super(0);
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.T = new byte[max];
            this.U = max;
            this.X = outputStream;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
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
        int c;
        F((i << 3) | 2);
        try {
            int length = str.length() * 3;
            int p = qd5.p(length);
            int i2 = p + length;
            int i3 = this.U;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int b = dh5.b(str, bArr, 0, length);
                F(b);
                R(bArr, 0, b);
                return;
            }
            if (i2 > i3 - this.V) {
                L();
            }
            int p2 = qd5.p(str.length());
            int i4 = this.V;
            try {
                try {
                    if (p2 == p) {
                        int i5 = i4 + p2;
                        this.V = i5;
                        int b2 = dh5.b(str, this.T, i5, this.U - i5);
                        this.V = i4;
                        c = (b2 - i4) - p2;
                        P(c);
                        this.V = b2;
                    } else {
                        c = dh5.c(str);
                        P(c);
                        this.V = dh5.b(str, this.T, this.V, c);
                    }
                    this.W += c;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new od5(e);
                }
            } catch (ch5 e2) {
                this.W -= this.V - i4;
                this.V = i4;
                throw e2;
            }
        } catch (ch5 e3) {
            r(str, e3);
        }
    }

    @Override // defpackage.qd5
    public final void D(int i, int i2) {
        F((i << 3) | i2);
    }

    @Override // defpackage.qd5
    public final void E(int i, int i2) {
        M(20);
        P(i << 3);
        P(i2);
    }

    @Override // defpackage.qd5
    public final void F(int i) {
        M(5);
        P(i);
    }

    @Override // defpackage.qd5
    public final void G(long j, int i) {
        M(20);
        P(i << 3);
        Q(j);
    }

    @Override // defpackage.qd5
    public final void H(long j) {
        M(10);
        Q(j);
    }

    public final void L() {
        this.X.write(this.T, 0, this.V);
        this.V = 0;
    }

    public final void M(int i) {
        if (this.U - this.V < i) {
            L();
        }
    }

    public final void N(int i) {
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
        this.W += 4;
    }

    public final void O(long j) {
        byte[] bArr = this.T;
        int i = this.V;
        int i2 = i + 1;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.V = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.W += 8;
    }

    public final void P(int i) {
        int i2;
        if (qd5.S) {
            long j = this.V;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.T;
                int i3 = this.V;
                this.V = i3 + 1;
                zg5.q(bArr, i3, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.T;
            int i4 = this.V;
            this.V = i4 + 1;
            zg5.q(bArr2, i4, (byte) i);
            i2 = this.W + ((int) (this.V - j));
        } else {
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.T;
                int i5 = this.V;
                this.V = i5 + 1;
                bArr3[i5] = (byte) ((i & 127) | 128);
                this.W++;
                i >>>= 7;
            }
            byte[] bArr4 = this.T;
            int i6 = this.V;
            this.V = i6 + 1;
            bArr4[i6] = (byte) i;
            i2 = this.W + 1;
        }
        this.W = i2;
    }

    public final void Q(long j) {
        if (qd5.S) {
            long j2 = this.V;
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
            this.W += (int) (this.V - j2);
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.T;
            int i3 = this.V;
            this.V = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.W++;
            j >>>= 7;
        }
        byte[] bArr4 = this.T;
        int i4 = this.V;
        this.V = i4 + 1;
        bArr4[i4] = (byte) j;
        this.W++;
    }

    public final void R(byte[] bArr, int i, int i2) {
        int i3 = this.U;
        int i4 = this.V;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.T, i4, i2);
            this.V += i2;
        } else {
            System.arraycopy(bArr, i, this.T, i4, i5);
            int i6 = i + i5;
            this.V = this.U;
            this.W += i5;
            L();
            i2 -= i5;
            if (i2 <= this.U) {
                System.arraycopy(bArr, i6, this.T, 0, i2);
                this.V = i2;
            } else {
                this.X.write(bArr, i6, i2);
            }
        }
        this.W += i2;
    }

    @Override // defpackage.fy4
    public final void i(byte[] bArr, int i, int i2) {
        R(bArr, i, i2);
    }

    @Override // defpackage.qd5
    public final void s(byte b) {
        if (this.V == this.U) {
            L();
        }
        byte[] bArr = this.T;
        int i = this.V;
        this.V = i + 1;
        bArr[i] = b;
        this.W++;
    }

    @Override // defpackage.qd5
    public final void t(int i, boolean z) {
        M(11);
        P(i << 3);
        byte[] bArr = this.T;
        int i2 = this.V;
        this.V = i2 + 1;
        bArr[i2] = z ? (byte) 1 : (byte) 0;
        this.W++;
    }

    @Override // defpackage.qd5
    public final void u(int i, gd5 gd5Var) {
        F((i << 3) | 2);
        F(gd5Var.o());
        gd5Var.z(this);
    }

    @Override // defpackage.qd5
    public final void v(int i, int i2) {
        M(14);
        P((i << 3) | 5);
        N(i2);
    }

    @Override // defpackage.qd5
    public final void w(int i) {
        M(4);
        N(i);
    }

    @Override // defpackage.qd5
    public final void x(long j, int i) {
        M(18);
        P((i << 3) | 1);
        O(j);
    }

    @Override // defpackage.qd5
    public final void y(long j) {
        M(8);
        O(j);
    }

    @Override // defpackage.qd5
    public final void z(int i, int i2) {
        M(20);
        P(i << 3);
        if (i2 >= 0) {
            P(i2);
        } else {
            Q(i2);
        }
    }
}