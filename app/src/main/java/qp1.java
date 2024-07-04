package defpackage;

/* renamed from: qp1  reason: default package */
public final class qp1 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= d[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final long b(p16 p16Var, boolean z, boolean z2, int i) {
        if (this.b == 0) {
            if (!p16Var.A(this.a, 0, 1, z)) {
                return -1L;
            }
            int i2 = this.a[0] & 255;
            int i3 = 0;
            while (true) {
                if (i3 < 8) {
                    int i4 = ((d[i3] & i2) > 0L ? 1 : ((d[i3] & i2) == 0L ? 0 : -1));
                    i3++;
                    if (i4 != 0) {
                        break;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            this.c = i3;
            if (i3 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            p16Var.A(this.a, 1, i5 - 1, false);
        }
        this.b = 0;
        return a(this.c, z2, this.a);
    }
}