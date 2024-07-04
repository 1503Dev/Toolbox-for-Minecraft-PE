package defpackage;

import java.util.Collections;

/* renamed from: tk1  reason: default package */
public final class tk1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final sk1 k;
    public final yt2 l;

    public tk1(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, sk1 sk1Var, yt2 yt2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = c(i7);
        this.j = j;
        this.k = sk1Var;
        this.l = yt2Var;
    }

    public tk1(byte[] bArr, int i) {
        eh4 eh4Var = new eh4(bArr, bArr.length);
        eh4Var.e(i * 8);
        this.a = eh4Var.b(16);
        this.b = eh4Var.b(16);
        this.c = eh4Var.b(24);
        this.d = eh4Var.b(24);
        int b = eh4Var.b(20);
        this.e = b;
        this.f = d(b);
        this.g = eh4Var.b(3) + 1;
        int b2 = eh4Var.b(5) + 1;
        this.h = b2;
        this.i = c(b2);
        int b3 = eh4Var.b(4);
        int b4 = eh4Var.b(32);
        int i2 = zn4.a;
        this.j = ((b3 & 4294967295L) << 32) | (b4 & 4294967295L);
        this.k = null;
        this.l = null;
    }

    public static int c(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final cu1 b(byte[] bArr, yt2 yt2Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        yt2 yt2Var2 = this.l;
        if (yt2Var2 != null) {
            if (yt2Var == null) {
                yt2Var = yt2Var2;
            } else {
                yt2Var = yt2Var2.a(yt2Var.P);
            }
        }
        bs1 bs1Var = new bs1();
        bs1Var.j = "audio/flac";
        bs1Var.k = i;
        bs1Var.w = this.g;
        bs1Var.x = this.e;
        bs1Var.l = Collections.singletonList(bArr);
        bs1Var.h = yt2Var;
        return new cu1(bs1Var);
    }
}