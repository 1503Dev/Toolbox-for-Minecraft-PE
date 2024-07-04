package defpackage;

/* renamed from: tc5  reason: default package */
public final class tc5 {
    public final byte[] a = new byte[256];
    public int b;
    public int c;

    public tc5(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.a;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.b = 0;
        this.c = 0;
    }
}