package defpackage;

import android.content.Context;
import android.util.TypedValue;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Date;

/* renamed from: mh  reason: default package */
public final class mh implements wg3 {
    public static final long[] P = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};
    public static final /* synthetic */ mh Q = new mh();
    public static final pg3 R = new pg3(0);
    public static final hu3 S = new hu3();
    public static final av3 T = new av3();

    public static Date A(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static final void B(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] C(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i2 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i2 += length2;
            i++;
        }
    }

    public static final byte[] D(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return E(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] E(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static int d(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        i(jArr4[0], jArr5[0], jArr3, 0);
        i(jArr4[1], jArr5[1], jArr3, 1);
        i(jArr4[2], jArr5[2], jArr3, 2);
        i(jArr4[3], jArr5[3], jArr3, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        i(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        i(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        i(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        i(j, j3, jArr6, 0);
        i(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 56;
        while (true) {
            long j = 0;
            if (i < 0) {
                break;
            }
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                int i4 = (i3 & 15) * 9;
                int i5 = (((i3 >>> 4) & 15) + 16) * 9;
                int i6 = i2 - 1;
                for (int i7 = 0; i7 < 9; i7++) {
                    int i8 = i6 + i7;
                    jArr3[i8] = jArr3[i8] ^ (jArr2[i4 + i7] ^ jArr2[i5 + i7]);
                }
            }
            int i9 = 0;
            while (i9 < 16) {
                int i10 = 0 + i9;
                long j2 = jArr3[i10];
                jArr3[i10] = (j >>> (-8)) | (j2 << 8);
                i9++;
                j = j2;
            }
            i -= 8;
        }
        for (int i11 = 56; i11 >= 0; i11 -= 8) {
            for (int i12 = 0; i12 < 9; i12 += 2) {
                int i13 = (int) (jArr[i12] >>> i11);
                int i14 = (i13 & 15) * 9;
                int i15 = (((i13 >>> 4) & 15) + 16) * 9;
                for (int i16 = 0; i16 < 9; i16++) {
                    int i17 = i12 + i16;
                    jArr3[i17] = jArr3[i17] ^ (jArr2[i14 + i16] ^ jArr2[i15 + i16]);
                }
            }
            if (i11 > 0) {
                long j3 = 0;
                int i18 = 0;
                while (i18 < 18) {
                    int i19 = 0 + i18;
                    long j4 = jArr3[i19];
                    jArr3[i19] = (j3 >>> (-8)) | (j4 << 8);
                    i18++;
                    j3 = j4;
                }
            }
        }
    }

    public static void i(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j3 << 1;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr2[(i4 >>> 3) & 7] << 3) ^ jArr2[i4 & 7];
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static void j(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            ar.f(i << 1, jArr[i], jArr2);
        }
    }

    public static void k(long[] jArr, long[] jArr2) {
        ar.f(0, jArr[0], jArr2);
        ar.f(2, jArr[1], jArr2);
        ar.f(4, jArr[2], jArr2);
        long j = jArr[3];
        jArr2[6] = ar.d((int) j);
        jArr2[7] = ar.b((int) (j >>> 32)) & 4294967295L;
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        h(jArr, p(jArr2), jArr4);
        q(jArr4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g(jArr, jArr2, jArr4);
        r(jArr4, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        h(jArr, p(jArr2), jArr4);
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        h(jArr, jArr2, jArr4);
        q(jArr4, jArr3);
    }

    public static long[] p(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 7;
        int i2 = 0;
        while (true) {
            j = 0;
            if (i <= 0) {
                break;
            }
            i2 += 18;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArr2[i3 + i4];
                jArr2[i2 + i4] = (j >>> 63) | (j2 << 1);
                i4++;
                j = j2;
            }
            s(i2, jArr2);
            int i5 = i2 + 9;
            for (int i6 = 0; i6 < 9; i6++) {
                jArr2[i5 + i6] = jArr2[9 + i6] ^ jArr2[i2 + i6];
            }
            i--;
        }
        int i7 = 0;
        while (i7 < 144) {
            long j3 = jArr2[0 + i7];
            jArr2[144 + i7] = (j >>> (-4)) | (j3 << 4);
            i7++;
            j = j3;
        }
        return jArr2;
    }

    public static void q(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void r(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j14 = j11 >>> 41;
        jArr2[0] = j12 ^ j14;
        long j15 = j14 << 10;
        jArr2[1] = j15 ^ ((j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33)));
        jArr2[2] = j13;
        jArr2[3] = 2199023255551L & j11;
    }

    public static void s(int i, long[] jArr) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    public static int t(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void u(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        j(jArr, jArr3);
        q(jArr3, jArr2);
    }

    public static void v(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        k(jArr, jArr3);
        r(jArr3, jArr2);
    }

    public static void w(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        j(jArr, jArr3);
        while (true) {
            q(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            j(jArr2, jArr3);
        }
    }

    public static void x(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        k(jArr, jArr3);
        while (true) {
            r(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            k(jArr2, jArr3);
        }
    }

    public static String y(gd5 gd5Var) {
        String str;
        StringBuilder sb = new StringBuilder(gd5Var.o());
        for (int i = 0; i < gd5Var.o(); i++) {
            int h = gd5Var.h(i);
            if (h == 34) {
                str = "\\\"";
            } else if (h == 39) {
                str = "\\'";
            } else if (h != 92) {
                switch (h) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (h < 32 || h > 126) {
                            sb.append('\\');
                            sb.append((char) (((h >>> 6) & 3) + 48));
                            sb.append((char) (((h >>> 3) & 7) + 48));
                            h = (h & 7) + 48;
                        }
                        sb.append((char) h);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String z(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i >> 4));
            sb.append("0123456789abcdef".charAt(i & 15));
        }
        return sb.toString();
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((le3) obj).k();
    }
}