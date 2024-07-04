package defpackage;

import java.util.Arrays;

/* renamed from: is1  reason: default package */
public final class is1 {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e = new byte[128];

    public final void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i4 = this.c + i3;
            if (length < i4) {
                this.e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.e, this.c, i3);
            this.c += i3;
        }
    }
}