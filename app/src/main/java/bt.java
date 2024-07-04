package defpackage;

/* renamed from: bt  reason: default package */
public abstract class bt implements tl {
    public final byte[] P = new byte[4];
    public int Q = 0;
    public long R;

    public final void e() {
        long j = this.R << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            byte[] bArr = this.P;
            int i = this.Q;
            int i2 = i + 1;
            this.Q = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                i(bArr, 0);
                this.Q = 0;
            }
            this.R++;
            if (this.Q != 0) {
                b = 0;
            } else {
                h(j);
                g();
                return;
            }
        }
    }

    @Override // defpackage.tl
    public final void f(byte b) {
        byte[] bArr = this.P;
        int i = this.Q;
        int i2 = i + 1;
        this.Q = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            i(bArr, 0);
            this.Q = 0;
        }
        this.R++;
    }

    public abstract void g();

    public abstract void h(long j);

    public abstract void i(byte[] bArr, int i);

    @Override // defpackage.tl
    public void reset() {
        this.R = 0L;
        this.Q = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.P;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.tl
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.Q != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.P;
                int i5 = this.Q;
                int i6 = i5 + 1;
                this.Q = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    i(bArr2, 0);
                    this.Q = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & (-4)) + i3;
        while (i3 < i8) {
            i(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.P;
            int i9 = this.Q;
            this.Q = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.R += max;
    }
}