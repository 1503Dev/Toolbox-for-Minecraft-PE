package defpackage;

import java.util.logging.Level;

/* renamed from: ld2  reason: default package */
public final class ld2 extends hg2 {
    public final byte[] T;
    public final int U;
    public int V;

    public ld2(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.T = bArr;
        this.V = 0;
        this.U = i;
    }

    @Override // defpackage.hg2
    public final void K(byte b) {
        try {
            byte[] bArr = this.T;
            int i = this.V;
            this.V = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new le2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
        }
    }

    @Override // defpackage.hg2
    public final void L(int i, boolean z) {
        W(i << 3);
        K(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.hg2
    public final void M(int i, y82 y82Var) {
        W((i << 3) | 2);
        W(y82Var.m());
        y82Var.q(this);
    }

    @Override // defpackage.hg2
    public final void N(int i, int i2) {
        W((i << 3) | 5);
        O(i2);
    }

    @Override // defpackage.hg2
    public final void O(int i) {
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
            throw new le2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
        }
    }

    @Override // defpackage.hg2
    public final void P(long j, int i) {
        W((i << 3) | 1);
        Q(j);
    }

    @Override // defpackage.hg2
    public final void Q(long j) {
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
            throw new le2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
        }
    }

    @Override // defpackage.hg2
    public final void R(int i, int i2) {
        W(i << 3);
        S(i2);
    }

    @Override // defpackage.hg2
    public final void S(int i) {
        if (i >= 0) {
            W(i);
        } else {
            Y(i);
        }
    }

    @Override // defpackage.hg2
    public final void T(int i, String str) {
        int a;
        W((i << 3) | 2);
        int i2 = this.V;
        try {
            int c0 = hg2.c0(str.length() * 3);
            int c02 = hg2.c0(str.length());
            if (c02 == c0) {
                int i3 = i2 + c02;
                this.V = i3;
                a = nf4.a(str, this.T, i3, this.U - i3);
                this.V = i2;
                W((a - i2) - c02);
            } else {
                W(nf4.b(str));
                byte[] bArr = this.T;
                int i4 = this.V;
                a = nf4.a(str, bArr, i4, this.U - i4);
            }
            this.V = a;
        } catch (IndexOutOfBoundsException e) {
            throw new le2(e);
        } catch (ze4 e2) {
            this.V = i2;
            hg2.R.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(z13.a);
            try {
                int length = bytes.length;
                W(length);
                e0(bytes, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new le2(e3);
            }
        }
    }

    @Override // defpackage.hg2
    public final void U(int i, int i2) {
        W((i << 3) | i2);
    }

    @Override // defpackage.hg2
    public final void V(int i, int i2) {
        W(i << 3);
        W(i2);
    }

    @Override // defpackage.hg2
    public final void W(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.T;
                int i2 = this.V;
                this.V = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new le2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
            }
        }
        byte[] bArr2 = this.T;
        int i3 = this.V;
        this.V = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // defpackage.hg2
    public final void X(long j, int i) {
        W(i << 3);
        Y(j);
    }

    @Override // defpackage.hg2
    public final void Y(long j) {
        if (hg2.S && this.U - this.V >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.T;
                int i = this.V;
                this.V = i + 1;
                hc4.c.d(bArr, hc4.f + i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.T;
            int i2 = this.V;
            this.V = i2 + 1;
            hc4.c.d(bArr2, hc4.f + i2, (byte) j);
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
                throw new le2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), 1), e);
            }
        }
        byte[] bArr4 = this.T;
        int i4 = this.V;
        this.V = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    public final void e0(byte[] bArr, int i) {
        try {
            System.arraycopy(bArr, 0, this.T, this.V, i);
            this.V += i;
        } catch (IndexOutOfBoundsException e) {
            throw new le2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.V), Integer.valueOf(this.U), Integer.valueOf(i)), e);
        }
    }
}