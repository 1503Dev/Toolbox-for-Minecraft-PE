package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: rw5  reason: default package */
public final class rw5 {
    public final kh4 a = new kh4(32);
    public qw5 b;
    public qw5 c;
    public qw5 d;
    public long e;
    public final jz5 f;

    public rw5(jz5 jz5Var) {
        this.f = jz5Var;
        qw5 qw5Var = new qw5(0L);
        this.b = qw5Var;
        this.c = qw5Var;
        this.d = qw5Var;
    }

    public static qw5 c(qw5 qw5Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= qw5Var.b) {
            qw5Var = qw5Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (qw5Var.b - j));
            yy5 yy5Var = qw5Var.c;
            byte[] bArr = yy5Var.a;
            yy5Var.getClass();
            byteBuffer.put(bArr, (int) (j - qw5Var.a), min);
            i -= min;
            j += min;
            if (j == qw5Var.b) {
                qw5Var = qw5Var.d;
            }
        }
        return qw5Var;
    }

    public static qw5 d(qw5 qw5Var, long j, byte[] bArr, int i) {
        while (j >= qw5Var.b) {
            qw5Var = qw5Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (qw5Var.b - j));
            yy5 yy5Var = qw5Var.c;
            byte[] bArr2 = yy5Var.a;
            yy5Var.getClass();
            System.arraycopy(bArr2, (int) (j - qw5Var.a), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == qw5Var.b) {
                qw5Var = qw5Var.d;
            }
        }
        return qw5Var;
    }

    public static qw5 e(qw5 qw5Var, gk5 gk5Var, sw5 sw5Var, kh4 kh4Var) {
        long j;
        ByteBuffer byteBuffer;
        boolean z;
        if (gk5Var.a(1073741824)) {
            long j2 = sw5Var.b;
            int i = 1;
            kh4Var.b(1);
            qw5 d = d(qw5Var, j2, kh4Var.a, 1);
            long j3 = j2 + 1;
            byte b = kh4Var.a[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            rj5 rj5Var = gk5Var.b;
            byte[] bArr = rj5Var.a;
            if (bArr == null) {
                rj5Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            qw5Var = d(d, j3, rj5Var.a, i3);
            long j4 = j3 + i3;
            if (z) {
                kh4Var.b(2);
                qw5Var = d(qw5Var, j4, kh4Var.a, 2);
                j4 += 2;
                i = kh4Var.q();
            }
            int[] iArr = rj5Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = rj5Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i4 = i * 6;
                kh4Var.b(i4);
                qw5Var = d(qw5Var, j4, kh4Var.a, i4);
                j4 += i4;
                kh4Var.e(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr[i5] = kh4Var.q();
                    iArr2[i5] = kh4Var.p();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = sw5Var.a - ((int) (j4 - sw5Var.b));
            }
            ol1 ol1Var = sw5Var.c;
            int i6 = zn4.a;
            byte[] bArr2 = ol1Var.b;
            byte[] bArr3 = rj5Var.a;
            int i7 = ol1Var.a;
            int i8 = ol1Var.c;
            int i9 = ol1Var.d;
            rj5Var.f = i;
            rj5Var.d = iArr;
            rj5Var.e = iArr2;
            rj5Var.b = bArr2;
            rj5Var.a = bArr3;
            rj5Var.c = i7;
            rj5Var.g = i8;
            rj5Var.h = i9;
            MediaCodec.CryptoInfo cryptoInfo = rj5Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i7;
            if (zn4.a >= 24) {
                aj5 aj5Var = rj5Var.j;
                aj5Var.getClass();
                aj5.a(aj5Var, i8, i9);
            }
            long j5 = sw5Var.b;
            int i10 = (int) (j4 - j5);
            sw5Var.b = j5 + i10;
            sw5Var.a -= i10;
        }
        if (gk5Var.a(268435456)) {
            kh4Var.b(4);
            qw5 d2 = d(qw5Var, sw5Var.b, kh4Var.a, 4);
            int p = kh4Var.p();
            sw5Var.b += 4;
            sw5Var.a -= 4;
            gk5Var.c(p);
            qw5Var = c(d2, sw5Var.b, gk5Var.c, p);
            sw5Var.b += p;
            int i11 = sw5Var.a - p;
            sw5Var.a = i11;
            ByteBuffer byteBuffer2 = gk5Var.f;
            if (byteBuffer2 != null && byteBuffer2.capacity() >= i11) {
                gk5Var.f.clear();
            } else {
                gk5Var.f = ByteBuffer.allocate(i11);
            }
            j = sw5Var.b;
            byteBuffer = gk5Var.f;
        } else {
            gk5Var.c(sw5Var.a);
            j = sw5Var.b;
            byteBuffer = gk5Var.c;
        }
        return c(qw5Var, j, byteBuffer, sw5Var.a);
    }

    public final void a(long j) {
        qw5 qw5Var;
        if (j != -1) {
            while (true) {
                qw5Var = this.b;
                if (j < qw5Var.b) {
                    break;
                }
                jz5 jz5Var = this.f;
                yy5 yy5Var = qw5Var.c;
                synchronized (jz5Var) {
                    yy5[] yy5VarArr = jz5Var.d;
                    int i = jz5Var.c;
                    jz5Var.c = i + 1;
                    yy5VarArr[i] = yy5Var;
                    jz5Var.b--;
                    jz5Var.notifyAll();
                }
                qw5 qw5Var2 = this.b;
                qw5Var2.c = null;
                qw5 qw5Var3 = qw5Var2.d;
                qw5Var2.d = null;
                this.b = qw5Var3;
            }
            if (this.c.a < qw5Var.a) {
                this.c = qw5Var;
            }
        }
    }

    public final int b(int i) {
        yy5 yy5Var;
        qw5 qw5Var = this.d;
        if (qw5Var.c == null) {
            jz5 jz5Var = this.f;
            synchronized (jz5Var) {
                int i2 = jz5Var.b + 1;
                jz5Var.b = i2;
                int i3 = jz5Var.c;
                if (i3 > 0) {
                    yy5[] yy5VarArr = jz5Var.d;
                    int i4 = i3 - 1;
                    jz5Var.c = i4;
                    yy5Var = yy5VarArr[i4];
                    yy5Var.getClass();
                    yy5VarArr[i4] = null;
                } else {
                    yy5 yy5Var2 = new yy5(new byte[65536]);
                    yy5[] yy5VarArr2 = jz5Var.d;
                    int length = yy5VarArr2.length;
                    if (i2 > length) {
                        jz5Var.d = (yy5[]) Arrays.copyOf(yy5VarArr2, length + length);
                    }
                    yy5Var = yy5Var2;
                }
            }
            qw5 qw5Var2 = new qw5(this.d.b);
            qw5Var.c = yy5Var;
            qw5Var.d = qw5Var2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }
}