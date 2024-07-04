package defpackage;

/* renamed from: xs1  reason: default package */
public final class xs1 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final km4 a = new km4();
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final kh4 b = new kh4();

    public static long a(kh4 kh4Var) {
        int i = kh4Var.b;
        if (kh4Var.c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        kh4Var.a(bArr, 0, 9);
        kh4Var.e(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static final int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void b(p16 p16Var) {
        kh4 kh4Var = this.b;
        byte[] bArr = zn4.f;
        int length = bArr.length;
        kh4Var.c(bArr, 0);
        this.c = true;
        p16Var.f = 0;
    }
}