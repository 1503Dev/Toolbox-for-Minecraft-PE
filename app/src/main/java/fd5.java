package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fd5  reason: default package */
public final class fd5 extends OutputStream {
    public static final byte[] U = new byte[0];
    public int R;
    public int T;
    public final int P = 128;
    public final ArrayList Q = new ArrayList();
    public byte[] S = new byte[128];

    public final synchronized gd5 a() {
        int i = this.T;
        byte[] bArr = this.S;
        if (i >= bArr.length) {
            this.Q.add(new ed5(this.S));
            this.S = U;
        } else if (i > 0) {
            this.Q.add(new ed5(Arrays.copyOf(bArr, i)));
        }
        this.R += this.T;
        this.T = 0;
        return gd5.F(this.Q);
    }

    public final void d(int i) {
        this.Q.add(new ed5(this.S));
        int length = this.R + this.S.length;
        this.R = length;
        this.S = new byte[Math.max(this.P, Math.max(i, length >>> 1))];
        this.T = 0;
    }

    public final String toString() {
        int i;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.R + this.T;
        }
        objArr[1] = Integer.valueOf(i);
        return String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.T == this.S.length) {
            d(1);
        }
        byte[] bArr = this.S;
        int i2 = this.T;
        this.T = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.S;
        int length = bArr2.length;
        int i3 = this.T;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.T += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        d(i5);
        System.arraycopy(bArr, i + i4, this.S, 0, i5);
        this.T = i5;
    }
}