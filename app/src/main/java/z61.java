package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c00;
import java.math.BigInteger;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: z61  reason: default package */
public abstract class z61 {
    public static c00.a a;
    public static final int[] b = {13, 41, 121, 337, 897, 2305};
    public static final byte[] c = new byte[0];
    public static final int[] d = new int[0];
    public static final wn[] e = new wn[0];

    public static boolean A(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 5;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[6 + i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[0 + i];
            if (i2 < i3) {
                z = false;
                break;
            } else if (i2 > i3) {
                break;
            } else {
                i--;
            }
        }
        if (z) {
            j1(iArr, 6, iArr2, 0, iArr3);
        } else {
            j1(iArr2, 0, iArr, 6, iArr3);
        }
        return z;
    }

    public static void A0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        int i = 1;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr[0] & 4294967295L;
        long j7 = (j6 * j) + 0;
        iArr3[0] = (int) j7;
        long j8 = (j6 * j2) + (j7 >>> 32);
        iArr3[1] = (int) j8;
        long j9 = (j6 * j3) + (j8 >>> 32);
        iArr3[2] = (int) j9;
        long j10 = (j6 * j4) + (j9 >>> 32);
        iArr3[3] = (int) j10;
        long j11 = (j6 * j5) + (j10 >>> 32);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        for (int i2 = 5; i < i2; i2 = 5) {
            long j12 = iArr[i] & 4294967295L;
            int i3 = i + 0;
            long j13 = j;
            long j14 = (j12 * j) + (iArr3[i3] & 4294967295L) + 0;
            iArr3[i3] = (int) j14;
            int i4 = i + 1;
            long j15 = j2;
            long j16 = (j12 * j2) + (iArr3[i4] & 4294967295L) + (j14 >>> 32);
            iArr3[i4] = (int) j16;
            int i5 = i + 2;
            long j17 = (j12 * j3) + (iArr3[i5] & 4294967295L) + (j16 >>> 32);
            iArr3[i5] = (int) j17;
            int i6 = i + 3;
            long j18 = (j12 * j4) + (iArr3[i6] & 4294967295L) + (j17 >>> 32);
            iArr3[i6] = (int) j18;
            long j19 = j18 >>> 32;
            int i7 = i + 4;
            long j20 = (j12 * j5) + (iArr3[i7] & 4294967295L) + j19;
            iArr3[i7] = (int) j20;
            iArr3[i + 5] = (int) (j20 >>> 32);
            i = i4;
            j = j13;
            j2 = j15;
        }
    }

    public static BigInteger A1(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                x0((2 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean B(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[8 + i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[0 + i];
            if (i2 < i3) {
                z = false;
                break;
            } else if (i2 > i3) {
                break;
            } else {
                i--;
            }
        }
        if (z) {
            l1(iArr, 8, iArr2, 0, iArr3);
        } else {
            l1(iArr2, 0, iArr, 8, iArr3);
        }
        return z;
    }

    public static void B0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr[0] & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        iArr3[6] = (int) (j13 >>> 32);
        int i = 1;
        for (int i2 = 6; i < i2; i2 = 6) {
            long j14 = iArr[i] & 4294967295L;
            int i3 = i + 0;
            long j15 = j;
            long j16 = (j14 * j) + (iArr3[i3] & 4294967295L) + 0;
            iArr3[i3] = (int) j16;
            int i4 = i + 1;
            long j17 = j2;
            long j18 = (j14 * j2) + (iArr3[i4] & 4294967295L) + (j16 >>> 32);
            iArr3[i4] = (int) j18;
            int i5 = i + 2;
            long j19 = (j14 * j3) + (iArr3[i5] & 4294967295L) + (j18 >>> 32);
            iArr3[i5] = (int) j19;
            int i6 = i + 3;
            long j20 = (j14 * j4) + (iArr3[i6] & 4294967295L) + (j19 >>> 32);
            iArr3[i6] = (int) j20;
            int i7 = i + 4;
            long j21 = (j14 * j5) + (iArr3[i7] & 4294967295L) + (j20 >>> 32);
            iArr3[i7] = (int) j21;
            long j22 = j21 >>> 32;
            int i8 = i + 5;
            long j23 = (j14 * j6) + (iArr3[i8] & 4294967295L) + j22;
            iArr3[i8] = (int) j23;
            iArr3[i + 6] = (int) (j23 >>> 32);
            i = i4;
            j = j15;
            j2 = j17;
        }
    }

    public static BigInteger B1(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                x0((3 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean C(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void C0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr[0] & 4294967295L;
        long j9 = (j8 * j) + 0;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = iArr[i] & 4294967295L;
            int i3 = i + 0;
            long j17 = j;
            long j18 = (j16 * j) + (iArr3[i3] & 4294967295L) + 0;
            iArr3[i3] = (int) j18;
            int i4 = i + 1;
            long j19 = j2;
            long j20 = (j16 * j2) + (iArr3[i4] & 4294967295L) + (j18 >>> 32);
            iArr3[i4] = (int) j20;
            int i5 = i + 2;
            long j21 = (j16 * j3) + (iArr3[i5] & 4294967295L) + (j20 >>> 32);
            iArr3[i5] = (int) j21;
            int i6 = i + 3;
            long j22 = (j16 * j4) + (iArr3[i6] & 4294967295L) + (j21 >>> 32);
            iArr3[i6] = (int) j22;
            int i7 = i + 4;
            long j23 = (j16 * j5) + (iArr3[i7] & 4294967295L) + (j22 >>> 32);
            iArr3[i7] = (int) j23;
            int i8 = i + 5;
            long j24 = (j16 * j6) + (iArr3[i8] & 4294967295L) + (j23 >>> 32);
            iArr3[i8] = (int) j24;
            long j25 = j24 >>> 32;
            int i9 = i + 6;
            long j26 = (j16 * j7) + (iArr3[i9] & 4294967295L) + j25;
            iArr3[i9] = (int) j26;
            iArr3[i + 7] = (int) (j26 >>> 32);
            i = i4;
            j = j17;
            j2 = j19;
        }
    }

    public static void C1(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static boolean D(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void D0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        long j10 = (j9 * j) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j18 = iArr[i] & 4294967295L;
            int i3 = i + 0;
            long j19 = j;
            long j20 = (j18 * j) + (iArr3[i3] & 4294967295L) + 0;
            iArr3[i3] = (int) j20;
            int i4 = i + 1;
            long j21 = j2;
            long j22 = (j18 * j2) + (iArr3[i4] & 4294967295L) + (j20 >>> 32);
            iArr3[i4] = (int) j22;
            int i5 = i + 2;
            long j23 = (j18 * j3) + (iArr3[i5] & 4294967295L) + (j22 >>> 32);
            iArr3[i5] = (int) j23;
            int i6 = i + 3;
            long j24 = (j18 * j4) + (iArr3[i6] & 4294967295L) + (j23 >>> 32);
            iArr3[i6] = (int) j24;
            int i7 = i + 4;
            long j25 = (j18 * j5) + (iArr3[i7] & 4294967295L) + (j24 >>> 32);
            iArr3[i7] = (int) j25;
            int i8 = i + 5;
            long j26 = (j18 * j6) + (iArr3[i8] & 4294967295L) + (j25 >>> 32);
            iArr3[i8] = (int) j26;
            int i9 = i + 6;
            long j27 = (j18 * j7) + (iArr3[i9] & 4294967295L) + (j26 >>> 32);
            iArr3[i9] = (int) j27;
            long j28 = j27 >>> 32;
            int i10 = i + 7;
            long j29 = (j18 * j8) + (iArr3[i10] & 4294967295L) + j28;
            iArr3[i10] = (int) j29;
            iArr3[i + 8] = (int) (j29 >>> 32);
            i = i4;
            j = j19;
            j2 = j21;
        }
    }

    public static boolean E(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void E0(int[] iArr, int[] iArr2, int[] iArr3) {
        int r1;
        B0(iArr, iArr2, iArr3);
        long j = iArr2[6] & 4294967295L;
        long j2 = iArr2[7] & 4294967295L;
        long j3 = iArr2[8] & 4294967295L;
        long j4 = iArr2[9] & 4294967295L;
        long j5 = iArr2[10] & 4294967295L;
        long j6 = iArr2[11] & 4294967295L;
        long j7 = iArr[6] & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[12] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[13] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[14] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[15] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[16] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[17] = (int) j13;
        iArr3[18] = (int) (j13 >>> 32);
        int i = 1;
        int i2 = 1;
        int i3 = 12;
        while (i2 < 6) {
            i3 += i;
            long j14 = iArr[6 + i2] & 4294967295L;
            int i4 = i3 + 0;
            long j15 = (j14 * j) + (iArr3[i4] & 4294967295L) + 0;
            iArr3[i4] = (int) j15;
            int i5 = i3 + 1;
            long j16 = j2;
            long j17 = (j14 * j2) + (iArr3[i5] & 4294967295L) + (j15 >>> 32);
            iArr3[i5] = (int) j17;
            int i6 = i3 + 2;
            long j18 = (j14 * j3) + (iArr3[i6] & 4294967295L) + (j17 >>> 32);
            iArr3[i6] = (int) j18;
            int i7 = i3 + 3;
            long j19 = (j14 * j4) + (iArr3[i7] & 4294967295L) + (j18 >>> 32);
            iArr3[i7] = (int) j19;
            int i8 = i3 + 4;
            long j20 = (j14 * j5) + (iArr3[i8] & 4294967295L) + (j19 >>> 32);
            iArr3[i8] = (int) j20;
            int i9 = i3 + 5;
            long j21 = (j14 * j6) + (iArr3[i9] & 4294967295L) + (j20 >>> 32);
            iArr3[i9] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            i2++;
            j3 = j3;
            j2 = j16;
            i = 1;
        }
        int r = r(iArr3, iArr3);
        boolean z = false;
        int p = p(iArr3, 18, iArr3, 12, p(iArr3, 0, iArr3, 6, 0) + r) + r;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        if (A(iArr, iArr, iArr4) != A(iArr2, iArr2, iArr5)) {
            z = true;
        }
        int[] iArr6 = new int[12];
        B0(iArr4, iArr5, iArr6);
        if (z) {
            r1 = o(12, iArr6, iArr3, 6);
        } else {
            r1 = r1(12, iArr6, iArr3, 6);
        }
        t(24, p + r1, 18, iArr3);
    }

    public static boolean F(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int F0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = 0;
        while (i6 < 5) {
            long j8 = iArr[i6] & j;
            long j9 = (j8 * j2) + (iArr3[i] & j) + 0;
            iArr3[i6 + 0] = (int) j9;
            int i7 = i6 + 1;
            long j10 = j3;
            long j11 = (j8 * j3) + (iArr3[i7] & 4294967295L) + (j9 >>> 32);
            iArr3[i7] = (int) j11;
            long j12 = j4;
            long j13 = (j8 * j4) + (iArr3[i2] & 4294967295L) + (j11 >>> 32);
            iArr3[i6 + 2] = (int) j13;
            long j14 = (j8 * j5) + (iArr3[i3] & 4294967295L) + (j13 >>> 32);
            iArr3[i6 + 3] = (int) j14;
            long j15 = j14 >>> 32;
            long j16 = (j8 * j6) + (iArr3[i4] & 4294967295L) + j15;
            iArr3[i6 + 4] = (int) j16;
            long j17 = (j16 >>> 32) + j7 + (iArr3[i5] & 4294967295L);
            iArr3[i6 + 5] = (int) j17;
            j7 = j17 >>> 32;
            i6 = i7;
            j = 4294967295L;
            j2 = j2;
            j4 = j12;
            j3 = j10;
        }
        return (int) j7;
    }

    public static boolean G(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int G0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = iArr2[5] & 4294967295L;
        long j8 = 0;
        while (i7 < 6) {
            long j9 = j7;
            long j10 = iArr[i7] & j;
            long j11 = j2;
            long j12 = (j10 * j2) + (iArr3[i] & j) + 0;
            iArr3[i7 + 0] = (int) j12;
            int i8 = i7 + 1;
            long j13 = (j10 * j3) + (iArr3[i8] & 4294967295L) + (j12 >>> 32);
            iArr3[i8] = (int) j13;
            long j14 = (j10 * j4) + (iArr3[i2] & 4294967295L) + (j13 >>> 32);
            iArr3[i7 + 2] = (int) j14;
            long j15 = (j10 * j5) + (iArr3[i3] & 4294967295L) + (j14 >>> 32);
            iArr3[i7 + 3] = (int) j15;
            long j16 = (j10 * j6) + (iArr3[i4] & 4294967295L) + (j15 >>> 32);
            iArr3[i7 + 4] = (int) j16;
            long j17 = j16 >>> 32;
            long j18 = (j10 * j9) + (iArr3[i5] & 4294967295L) + j17;
            iArr3[i7 + 5] = (int) j18;
            long j19 = j8 + (iArr3[i6] & 4294967295L) + (j18 >>> 32);
            iArr3[i7 + 6] = (int) j19;
            j8 = j19 >>> 32;
            i7 = i8;
            j = 4294967295L;
            j7 = j9;
            j2 = j11;
            j3 = j3;
        }
        return (int) j8;
    }

    public static boolean H(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int H0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = 0;
        int i8 = 0;
        while (i8 < 7) {
            long j9 = j7;
            long j10 = iArr[i8] & 4294967295L;
            long j11 = j6;
            long j12 = (j10 * j) + (iArr3[i] & 4294967295L) + 0;
            iArr3[i8 + 0] = (int) j12;
            int i9 = i8 + 1;
            long j13 = j2;
            long j14 = (j10 * j2) + (iArr3[i9] & 4294967295L) + (j12 >>> 32);
            iArr3[i9] = (int) j14;
            long j15 = (j10 * j3) + (iArr3[i2] & 4294967295L) + (j14 >>> 32);
            iArr3[i8 + 2] = (int) j15;
            long j16 = (j10 * j4) + (iArr3[i3] & 4294967295L) + (j15 >>> 32);
            iArr3[i8 + 3] = (int) j16;
            long j17 = (j10 * j5) + (iArr3[i4] & 4294967295L) + (j16 >>> 32);
            iArr3[i8 + 4] = (int) j17;
            long j18 = (j10 * j11) + (iArr3[i5] & 4294967295L) + (j17 >>> 32);
            iArr3[i8 + 5] = (int) j18;
            long j19 = (j10 * j9) + (iArr3[i6] & 4294967295L) + (j18 >>> 32);
            iArr3[i8 + 6] = (int) j19;
            long j20 = j8 + (iArr3[i7] & 4294967295L) + (j19 >>> 32);
            iArr3[i8 + 7] = (int) j20;
            j8 = j20 >>> 32;
            i8 = i9;
            j7 = j9;
            j6 = j11;
            j3 = j3;
            j2 = j13;
        }
        return (int) j8;
    }

    public static int[] I(int i, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= i) {
            int[] iArr = new int[(i + 31) >> 5];
            int i2 = 0;
            while (bigInteger.signum() != 0) {
                iArr[i2] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
                i2++;
            }
            return iArr;
        }
        throw new IllegalArgumentException();
    }

    public static int I0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = 0;
        int i9 = 0;
        while (i9 < 8) {
            long j10 = j8;
            long j11 = iArr[i9] & 4294967295L;
            long j12 = j6;
            long j13 = (j11 * j) + (iArr3[i] & 4294967295L) + 0;
            iArr3[i9 + 0] = (int) j13;
            int i10 = i9 + 1;
            long j14 = j2;
            long j15 = (j11 * j2) + (iArr3[i10] & 4294967295L) + (j13 >>> 32);
            iArr3[i10] = (int) j15;
            long j16 = (j11 * j3) + (iArr3[i2] & 4294967295L) + (j15 >>> 32);
            iArr3[i9 + 2] = (int) j16;
            long j17 = (j11 * j4) + (iArr3[i3] & 4294967295L) + (j16 >>> 32);
            iArr3[i9 + 3] = (int) j17;
            long j18 = (j11 * j5) + (iArr3[i4] & 4294967295L) + (j17 >>> 32);
            iArr3[i9 + 4] = (int) j18;
            long j19 = (j11 * j12) + (iArr3[i5] & 4294967295L) + (j18 >>> 32);
            iArr3[i9 + 5] = (int) j19;
            long j20 = (j11 * j7) + (iArr3[i6] & 4294967295L) + (j19 >>> 32);
            iArr3[i9 + 6] = (int) j20;
            long j21 = (j11 * j10) + (iArr3[i7] & 4294967295L) + (j20 >>> 32);
            iArr3[i9 + 7] = (int) j21;
            long j22 = j9 + (iArr3[i8] & 4294967295L) + (j21 >>> 32);
            iArr3[i9 + 8] = (int) j22;
            j9 = j22 >>> 32;
            i9 = i10;
            j8 = j10;
            j6 = j12;
            j3 = j3;
            j2 = j14;
        }
        return (int) j9;
    }

    public static int[] J(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static int[] K(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[6];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static int[] L(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static int[] M(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static long[] N(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[3];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static long[] O(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static byte[] P(int i, BigInteger bigInteger) {
        int i2;
        if (i == 2) {
            if (bigInteger.signum() == 0) {
                return c;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength() - 1;
            byte[] bArr = new byte[bitLength];
            BigInteger xor = add.xor(bigInteger);
            int i3 = 1;
            while (i3 < bitLength) {
                if (xor.testBit(i3)) {
                    int i4 = i3 - 1;
                    if (bigInteger.testBit(i3)) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    bArr[i4] = (byte) i2;
                    i3++;
                }
                i3++;
            }
            bArr[bitLength - 1] = 1;
            return bArr;
        } else if (i >= 2 && i <= 8) {
            if (bigInteger.signum() == 0) {
                return c;
            }
            int bitLength2 = bigInteger.bitLength() + 1;
            byte[] bArr2 = new byte[bitLength2];
            int i5 = 1 << i;
            int i6 = i5 - 1;
            int i7 = i5 >>> 1;
            int i8 = 0;
            int i9 = 0;
            boolean z = false;
            while (i8 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i8) == z) {
                    i8++;
                } else {
                    bigInteger = bigInteger.shiftRight(i8);
                    int intValue = bigInteger.intValue() & i6;
                    if (z) {
                        intValue++;
                    }
                    if ((intValue & i7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        intValue -= i5;
                    }
                    if (i9 > 0) {
                        i8--;
                    }
                    int i10 = i9 + i8;
                    bArr2[i10] = (byte) intValue;
                    i9 = i10 + 1;
                    i8 = i;
                }
            }
            if (bitLength2 > i9) {
                byte[] bArr3 = new byte[i9];
                System.arraycopy(bArr2, 0, bArr3, 0, i9);
                return bArr3;
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
    }

    public static t51 R(wn wnVar) {
        qf0 l = wnVar.a.l(wnVar, "bc_wnaf");
        if (l != null && (l instanceof t51)) {
            return (t51) l;
        }
        return new t51();
    }

    public static int S(int i) {
        int[] iArr = b;
        int i2 = 0;
        while (i2 < 6 && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    public static boolean T(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ RecyclerView.UNDEFINED_DURATION;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static boolean U(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean V(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean W(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean X(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static t51 X0(wn wnVar, int i) {
        t51 t51Var;
        int length;
        int i2;
        int i3;
        hn hnVar = wnVar.a;
        qf0 l = hnVar.l(wnVar, "bc_wnaf");
        if (l != null && (l instanceof t51)) {
            t51Var = (t51) l;
        } else {
            t51Var = new t51();
        }
        int i4 = 0;
        boolean z = true;
        int max = 1 << Math.max(0, i - 2);
        wn[] wnVarArr = t51Var.a;
        if (wnVarArr == null) {
            wnVarArr = e;
            length = 0;
        } else {
            length = wnVarArr.length;
        }
        if (length < max) {
            wn[] wnVarArr2 = new wn[max];
            System.arraycopy(wnVarArr, 0, wnVarArr2, 0, wnVarArr.length);
            if (max == 1) {
                wnVarArr2[0] = wnVar.n();
            } else {
                if (length == 0) {
                    wnVarArr2[0] = wnVar;
                    i2 = 1;
                } else {
                    i2 = length;
                }
                jn jnVar = null;
                if (max == 2) {
                    wnVarArr2[1] = wnVar.u();
                } else {
                    wn wnVar2 = t51Var.c;
                    wn wnVar3 = wnVarArr2[i2 - 1];
                    if (wnVar2 == null) {
                        wnVar2 = wnVarArr2[0].w();
                        t51Var.c = wnVar2;
                        if (!wnVar2.j()) {
                            if (hnVar.a.b() != 1) {
                                z = false;
                            }
                            if (z && hnVar.j() >= 64 && ((i3 = hnVar.f) == 2 || i3 == 3 || i3 == 4)) {
                                jn i5 = wnVar2.i();
                                wnVar2 = hnVar.c(wnVar2.b.t(), wnVar2.h().t(), false);
                                jn o = i5.o();
                                wnVar3 = wnVar3.r(o).s(o.j(i5));
                                if (length == 0) {
                                    wnVarArr2[0] = wnVar3;
                                }
                                jnVar = i5;
                            }
                        }
                    }
                    while (i2 < max) {
                        wnVar3 = wnVar3.a(wnVar2);
                        wnVarArr2[i2] = wnVar3;
                        i2++;
                    }
                }
                hnVar.o(wnVarArr2, length, max - length, jnVar);
            }
            wnVarArr = wnVarArr2;
        }
        t51Var.a = wnVarArr;
        wn[] wnVarArr3 = t51Var.b;
        if (wnVarArr3 == null) {
            wnVarArr3 = new wn[max];
        } else {
            int length2 = wnVarArr3.length;
            if (length2 < max) {
                wn[] wnVarArr4 = new wn[max];
                System.arraycopy(wnVarArr3, 0, wnVarArr4, 0, wnVarArr3.length);
                i4 = length2;
                wnVarArr3 = wnVarArr4;
            } else {
                i4 = length2;
            }
        }
        while (i4 < max) {
            wnVarArr3[i4] = wnVarArr[i4].m();
            i4++;
        }
        t51Var.b = wnVarArr3;
        hnVar.p(wnVar, "bc_wnaf", t51Var);
        return t51Var;
    }

    public static boolean Y(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static int Y0(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static int Z(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int Z0(int i, int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr[i2] = (i3 >>> (-2)) | (i4 << 2);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-2);
    }

    public static int a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int a0(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] + 1;
            iArr[i] = i2;
            if (i2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int a1(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr2[i2] = (i3 >>> (-3)) | (i4 << 3);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-3);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static int b0(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static void b1(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 8;
        int i2 = 3;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = iArr[1] & 4294967295L;
                long j6 = (((i6 << 31) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i7 = (int) j6;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j7 = iArr[2] & 4294967295L;
                long j8 = (j7 * j) + (iArr2[2] & 4294967295L) + (j6 >>> 32);
                int i8 = (int) j8;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long a2 = yg.a(j7, j5, j8 >>> 32, iArr2[3] & 4294967295L);
                long j9 = (iArr2[4] & 4294967295L) + (a2 >>> 32);
                long j10 = iArr[3] & 4294967295L;
                long j11 = (iArr2[5] & 4294967295L) + (j9 >>> 32);
                long j12 = j9 & 4294967295L;
                long j13 = (a2 & 4294967295L) + (j * j10);
                int i9 = (int) j13;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                long a3 = yg.a(j5, j10, j13 >>> 32, j12);
                long a4 = yg.a(j10, j7, a3 >>> 32, j11 & 4294967295L);
                long j14 = (iArr2[6] & 4294967295L) + (j11 >>> 32) + (a4 >>> 32);
                int i10 = (int) a3;
                iArr2[4] = (i10 << 1) | (i9 >>> 31);
                int i11 = (int) (a4 & 4294967295L);
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                int i12 = i11 >>> 31;
                int i13 = (int) j14;
                iArr2[6] = i12 | (i13 << 1);
                iArr2[7] = (i13 >>> 31) | ((iArr2[7] + ((int) (j14 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static int c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int c0(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = 0 + i2;
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static void c1(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 10;
        int i2 = 4;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = iArr[1] & 4294967295L;
                long j6 = (((i6 << 31) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i7 = (int) j6;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j7 = (iArr2[2] & 4294967295L) + (j6 >>> 32);
                long j8 = iArr[2] & 4294967295L;
                long j9 = j7 + (j8 * j);
                int i8 = (int) j9;
                iArr2[2] = (i7 >>> 31) | (i8 << 1);
                long a2 = yg.a(j8, j5, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (a2 >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (j10 >>> 32) + (iArr2[5] & 4294967295L);
                long j13 = j10 & 4294967295L;
                long j14 = (j11 * j) + (a2 & 4294967295L);
                int i9 = (int) j14;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                long a3 = yg.a(j11, j5, j14 >>> 32, j13);
                long a4 = yg.a(j11, j8, a3 >>> 32, j12 & 4294967295L);
                long j15 = (iArr2[6] & 4294967295L) + (j12 >>> 32) + (a4 >>> 32);
                long j16 = a4 & 4294967295L;
                long j17 = iArr[4] & 4294967295L;
                long j18 = (iArr2[7] & 4294967295L) + (j15 >>> 32);
                long j19 = 4294967295L & j18;
                long j20 = (j17 * j) + (a3 & 4294967295L);
                int i10 = (int) j20;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                long a5 = yg.a(j5, j17, j20 >>> 32, j16);
                long a6 = yg.a(j17, j8, a5 >>> 32, j15 & 4294967295L);
                long a7 = yg.a(j17, j11, a6 >>> 32, j19);
                long j21 = (iArr2[8] & 4294967295L) + (j18 >>> 32) + (a7 >>> 32);
                int i12 = (int) a5;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = (int) a6;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) a7;
                iArr2[7] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j21;
                iArr2[8] = i16 | (i17 << 1);
                iArr2[9] = (i17 >>> 31) | ((iArr2[9] + ((int) (j21 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void d0(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void d1(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 12;
        int i2 = 5;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = iArr[1] & 4294967295L;
                long j6 = (j5 * j) + (((i6 << 31) & 4294967295L) | (j4 >>> 33));
                int i7 = (int) j6;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i7 << 1);
                int i8 = i7 >>> 31;
                long j7 = iArr[2] & 4294967295L;
                long j8 = (j7 * j) + (iArr2[2] & 4294967295L) + (j6 >>> 32);
                int i9 = (int) j8;
                iArr2[2] = i8 | (i9 << 1);
                int i10 = i9 >>> 31;
                long a2 = yg.a(j7, j5, j8 >>> 32, iArr2[3] & 4294967295L);
                long j9 = (iArr2[4] & 4294967295L) + (a2 >>> 32);
                long j10 = iArr[3] & 4294967295L;
                long j11 = (iArr2[5] & 4294967295L) + (j9 >>> 32);
                long j12 = j9 & 4294967295L;
                long j13 = (iArr2[6] & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (j10 * j) + (a2 & 4294967295L);
                int i11 = (int) j15;
                iArr2[3] = i10 | (i11 << 1);
                long a3 = yg.a(j10, j5, j15 >>> 32, j12);
                long a4 = yg.a(j10, j7, a3 >>> 32, j14);
                long j16 = j13 + (a4 >>> 32);
                long j17 = a4 & 4294967295L;
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j16 >>> 32);
                long j20 = j16 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (a3 & 4294967295L);
                int i12 = (int) j23;
                iArr2[4] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long a5 = yg.a(j18, j5, j23 >>> 32, j17);
                long a6 = yg.a(j18, j7, a5 >>> 32, j20);
                long a7 = yg.a(j18, j10, a6 >>> 32, j22);
                long j24 = a6 & 4294967295L;
                long j25 = j21 + (a7 >>> 32);
                long j26 = iArr[5] & 4294967295L;
                long j27 = (iArr2[9] & 4294967295L) + (j25 >>> 32);
                long j28 = (j * j26) + (a5 & 4294967295L);
                int i14 = (int) j28;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long a8 = yg.a(j26, j5, j28 >>> 32, j24);
                long a9 = yg.a(j26, j7, a8 >>> 32, a7 & 4294967295L);
                long a10 = yg.a(j26, j10, a9 >>> 32, j25 & 4294967295L);
                long a11 = yg.a(j26, j18, a10 >>> 32, 4294967295L & j27);
                long j29 = (iArr2[10] & 4294967295L) + (j27 >>> 32) + (a11 >>> 32);
                int i16 = (int) a8;
                iArr2[6] = (i16 << 1) | i15;
                int i17 = (int) a9;
                iArr2[7] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) a10;
                iArr2[8] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) a11;
                iArr2[9] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j29;
                iArr2[10] = i22 | (i23 << 1);
                iArr2[11] = (i23 >>> 31) | ((iArr2[11] + ((int) (j29 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static int e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int e0(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int i3;
        int q1;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            int i5 = i;
            int i6 = 0;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    int i7 = iArr2[i5];
                    iArr2[i5] = i6;
                    i6 = i7;
                }
            }
            i4 += 32;
        }
        int i8 = 0;
        while ((i3 & 1) == 0) {
            i3 >>>= 1;
            i8++;
        }
        if (i8 > 0) {
            int i9 = 0;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i10 = iArr2[i];
                iArr2[i] = (i9 << (-i8)) | (i10 >>> i8);
                i9 = i10;
            }
            i4 += i8;
        }
        for (int i11 = 0; i11 < i4; i11++) {
            if ((iArr3[0] & 1) != 0) {
                if (i2 < 0) {
                    q1 = n(length, iArr, iArr3);
                } else {
                    q1 = q1(length, iArr, iArr3);
                }
                i2 = q1 + i2;
            }
            int i12 = i2;
            int i13 = length;
            while (true) {
                i13--;
                if (i13 >= 0) {
                    int i14 = iArr3[i13];
                    iArr3[i13] = (i12 << 31) | (i14 >>> 1);
                    i12 = i14;
                }
            }
        }
        return i2;
    }

    public static void e1(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 14;
        int i2 = 6;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = iArr[1] & 4294967295L;
                long j6 = (j5 * j) + (((i6 << 31) & 4294967295L) | (j4 >>> 33));
                int i7 = (int) j6;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i7 << 1);
                int i8 = i7 >>> 31;
                long j7 = iArr[2] & 4294967295L;
                long j8 = (j7 * j) + (iArr2[2] & 4294967295L) + (j6 >>> 32);
                int i9 = (int) j8;
                iArr2[2] = i8 | (i9 << 1);
                int i10 = i9 >>> 31;
                long a2 = yg.a(j7, j5, j8 >>> 32, iArr2[3] & 4294967295L);
                long j9 = (iArr2[4] & 4294967295L) + (a2 >>> 32);
                long j10 = iArr[3] & 4294967295L;
                long j11 = (iArr2[5] & 4294967295L) + (j9 >>> 32);
                long j12 = j9 & 4294967295L;
                long j13 = (iArr2[6] & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (j10 * j) + (a2 & 4294967295L);
                int i11 = (int) j15;
                iArr2[3] = i10 | (i11 << 1);
                long a3 = yg.a(j10, j5, j15 >>> 32, j12);
                long a4 = yg.a(j10, j7, a3 >>> 32, j14);
                long j16 = j13 + (a4 >>> 32);
                long j17 = a4 & 4294967295L;
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j16 >>> 32);
                long j20 = j16 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (a3 & 4294967295L);
                int i12 = (int) j23;
                iArr2[4] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long a5 = yg.a(j18, j5, j23 >>> 32, j17);
                long a6 = yg.a(j18, j7, a5 >>> 32, j20);
                long a7 = yg.a(j18, j10, a6 >>> 32, j22);
                long j24 = a6 & 4294967295L;
                long j25 = j21 + (a7 >>> 32);
                long j26 = iArr[5] & 4294967295L;
                long j27 = (iArr2[9] & 4294967295L) + (j25 >>> 32);
                long j28 = j25 & 4294967295L;
                long j29 = (iArr2[10] & 4294967295L) + (j27 >>> 32);
                long j30 = j27 & 4294967295L;
                long j31 = (j26 * j) + (a5 & 4294967295L);
                int i14 = (int) j31;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long a8 = yg.a(j26, j5, j31 >>> 32, j24);
                long a9 = yg.a(j26, j7, a8 >>> 32, a7 & 4294967295L);
                long a10 = yg.a(j26, j10, a9 >>> 32, j28);
                long j32 = a9 & 4294967295L;
                long a11 = yg.a(j26, j18, a10 >>> 32, j30);
                long j33 = j29 + (a11 >>> 32);
                long j34 = a11 & 4294967295L;
                long j35 = iArr[6] & 4294967295L;
                long j36 = (iArr2[11] & 4294967295L) + (j33 >>> 32);
                long j37 = 4294967295L & j36;
                long j38 = (j * j35) + (a8 & 4294967295L);
                int i16 = (int) j38;
                iArr2[6] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long a12 = yg.a(j35, j5, j38 >>> 32, j32);
                long a13 = yg.a(j35, j7, a12 >>> 32, a10 & 4294967295L);
                long a14 = yg.a(j35, j10, a13 >>> 32, j34);
                long a15 = yg.a(j35, j18, a14 >>> 32, j33 & 4294967295L);
                long a16 = yg.a(j35, j26, a15 >>> 32, j37);
                long j39 = (iArr2[12] & 4294967295L) + (j36 >>> 32) + (a16 >>> 32);
                int i18 = (int) a12;
                iArr2[7] = (i18 << 1) | i17;
                int i19 = (int) a13;
                iArr2[8] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) a14;
                iArr2[9] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) a15;
                iArr2[10] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) a16;
                iArr2[11] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j39;
                iArr2[12] = i26 | (i27 << 1);
                iArr2[13] = (i27 >>> 31) | ((iArr2[13] + ((int) (j39 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static void f(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) + (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (4294967295L & iArr[1]) + 1 + (j >>> 32);
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return;
        }
        b0(i, 2, iArr);
    }

    public static void f0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int length = iArr.length;
        if (!n0(iArr2, length)) {
            if (g0(iArr2, length)) {
                System.arraycopy(iArr2, 0, iArr3, 0, length);
                return;
            }
            int[] iArr4 = new int[length];
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            int[] iArr5 = new int[length];
            iArr5[0] = 1;
            if ((1 & iArr4[0]) == 0) {
                i = e0(iArr, iArr4, length, iArr5, 0);
            } else {
                i = 0;
            }
            if (g0(iArr4, length)) {
                if (i < 0) {
                    a(iArr.length, iArr5, iArr, iArr3);
                    return;
                } else {
                    System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                    return;
                }
            }
            int[] iArr6 = new int[length];
            System.arraycopy(iArr, 0, iArr6, 0, length);
            int[] iArr7 = new int[length];
            int i2 = length;
            int i3 = 0;
            while (true) {
                int i4 = i2 - 1;
                if (iArr4[i4] == 0 && iArr6[i4] == 0) {
                    i2 = i4;
                } else if (T(i2, iArr4, iArr6)) {
                    q1(i2, iArr6, iArr4);
                    i = e0(iArr, iArr4, i2, iArr5, (q1(length, iArr7, iArr5) - i3) + i);
                    if (g0(iArr4, i2)) {
                        if (i < 0) {
                            a(iArr.length, iArr5, iArr, iArr3);
                            return;
                        } else {
                            System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                            return;
                        }
                    }
                } else {
                    q1(i2, iArr4, iArr6);
                    i3 = e0(iArr, iArr6, i2, iArr7, (q1(length, iArr5, iArr7) - i) + i3);
                    if (g0(iArr6, i2)) {
                        if (i3 < 0) {
                            a(iArr.length, iArr7, iArr, iArr3);
                            return;
                        } else {
                            System.arraycopy(iArr7, 0, iArr3, 0, iArr.length);
                            return;
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
    }

    public static void f1(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 16;
        int i2 = 7;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = iArr[1] & 4294967295L;
                long j6 = (j5 * j) + (((i6 << 31) & 4294967295L) | (j4 >>> 33));
                int i7 = (int) j6;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i7 << 1);
                int i8 = i7 >>> 31;
                long j7 = iArr[2] & 4294967295L;
                long j8 = (j7 * j) + (iArr2[2] & 4294967295L) + (j6 >>> 32);
                int i9 = (int) j8;
                iArr2[2] = i8 | (i9 << 1);
                int i10 = i9 >>> 31;
                long a2 = yg.a(j7, j5, j8 >>> 32, iArr2[3] & 4294967295L);
                long j9 = (iArr2[4] & 4294967295L) + (a2 >>> 32);
                long j10 = iArr[3] & 4294967295L;
                long j11 = (iArr2[5] & 4294967295L) + (j9 >>> 32);
                long j12 = j9 & 4294967295L;
                long j13 = (iArr2[6] & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (j10 * j) + (a2 & 4294967295L);
                int i11 = (int) j15;
                iArr2[3] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long a3 = yg.a(j10, j5, j15 >>> 32, j12);
                long a4 = yg.a(j10, j7, a3 >>> 32, j14);
                long j16 = j13 + (a4 >>> 32);
                long j17 = a4 & 4294967295L;
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j16 >>> 32);
                long j20 = j16 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (a3 & 4294967295L);
                int i13 = (int) j23;
                iArr2[4] = i12 | (i13 << 1);
                long a5 = yg.a(j18, j5, j23 >>> 32, j17);
                long a6 = yg.a(j18, j7, a5 >>> 32, j20);
                long a7 = yg.a(j18, j10, a6 >>> 32, j22);
                long j24 = a6 & 4294967295L;
                long j25 = j21 + (a7 >>> 32);
                long j26 = iArr[5] & 4294967295L;
                long j27 = (iArr2[9] & 4294967295L) + (j25 >>> 32);
                long j28 = (iArr2[10] & 4294967295L) + (j27 >>> 32);
                long j29 = j27 & 4294967295L;
                long j30 = (j26 * j) + (a5 & 4294967295L);
                int i14 = (int) j30;
                iArr2[5] = (i13 >>> 31) | (i14 << 1);
                long a8 = yg.a(j26, j5, j30 >>> 32, j24);
                long a9 = yg.a(j26, j7, a8 >>> 32, a7 & 4294967295L);
                long a10 = yg.a(j26, j10, a9 >>> 32, j25 & 4294967295L);
                long j31 = a9 & 4294967295L;
                long a11 = yg.a(j26, j18, a10 >>> 32, j29);
                long j32 = a10 & 4294967295L;
                long j33 = j28 + (a11 >>> 32);
                long j34 = a11 & 4294967295L;
                long j35 = iArr[6] & 4294967295L;
                long j36 = (iArr2[11] & 4294967295L) + (j33 >>> 32);
                long j37 = j33 & 4294967295L;
                long j38 = j36 & 4294967295L;
                long j39 = (j35 * j) + (a8 & 4294967295L);
                int i15 = (int) j39;
                iArr2[6] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                long a12 = yg.a(j35, j5, j39 >>> 32, j31);
                long a13 = yg.a(j35, j7, a12 >>> 32, j32);
                long a14 = yg.a(j35, j10, a13 >>> 32, j34);
                long j40 = a13 & 4294967295L;
                long a15 = yg.a(j35, j18, a14 >>> 32, j37);
                long j41 = a14 & 4294967295L;
                long a16 = yg.a(j35, j26, a15 >>> 32, j38);
                long j42 = a15 & 4294967295L;
                long j43 = (iArr2[12] & 4294967295L) + (j36 >>> 32) + (a16 >>> 32);
                long j44 = iArr[7] & 4294967295L;
                long j45 = (iArr2[13] & 4294967295L) + (j43 >>> 32);
                long j46 = (iArr2[14] & 4294967295L) + (j45 >>> 32);
                long j47 = (j * j44) + (a12 & 4294967295L);
                int i17 = (int) j47;
                iArr2[7] = (i17 << 1) | i16;
                long a17 = yg.a(j44, j5, j47 >>> 32, j40);
                long a18 = yg.a(j44, j7, a17 >>> 32, j41);
                long a19 = yg.a(j44, j10, a18 >>> 32, j42);
                long a20 = yg.a(j44, j18, a19 >>> 32, a16 & 4294967295L);
                long a21 = yg.a(j44, j26, a20 >>> 32, j43 & 4294967295L);
                long a22 = yg.a(j44, j35, a21 >>> 32, j45 & 4294967295L);
                long j48 = j46 + (a22 >>> 32);
                int i18 = (int) a17;
                iArr2[8] = (i18 << 1) | (i17 >>> 31);
                int i19 = (int) a18;
                iArr2[9] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) a19;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) a20;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) a21;
                iArr2[12] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) a22;
                iArr2[13] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j48;
                iArr2[14] = i28 | (i29 << 1);
                iArr2[15] = (i29 >>> 31) | ((iArr2[15] + ((int) (j48 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static int g(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (iArr2[i2] & 4294967295L) + (4294967295L & iArr3[i2]) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static boolean g0(int[] iArr, int i) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void g1(int[] iArr, int[] iArr2) {
        d1(iArr, iArr2);
        int i = 6;
        long j = 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        int i2 = 12;
        int i3 = 5;
        int i4 = 12;
        int i5 = 0;
        while (true) {
            int i6 = i3 - 1;
            long j3 = j & iArr[i3 + i];
            long j4 = j3 * j3;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i5 << 31) | ((int) (j4 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j4 >>> 1);
            int i8 = (int) j4;
            if (i6 <= 0) {
                long j5 = j2 * j2;
                iArr2[12] = (int) j5;
                long j6 = iArr[7] & 4294967295L;
                long j7 = (j6 * j2) + (((i8 << 31) & 4294967295L) | (j5 >>> 33));
                int i9 = (int) j7;
                iArr2[13] = (((int) (j5 >>> 32)) & 1) | (i9 << 1);
                int i10 = i9 >>> 31;
                long j8 = iArr[8] & 4294967295L;
                long j9 = (j8 * j2) + (4294967295L & iArr2[14]) + (j7 >>> 32);
                int i11 = (int) j9;
                iArr2[14] = i10 | (i11 << 1);
                long a2 = yg.a(j8, j6, j9 >>> 32, iArr2[15] & 4294967295L);
                long j10 = (iArr2[16] & 4294967295L) + (a2 >>> 32);
                long j11 = iArr[9] & 4294967295L;
                long j12 = (iArr2[17] & 4294967295L) + (j10 >>> 32);
                long j13 = j12 & 4294967295L;
                long j14 = (j11 * j2) + (a2 & 4294967295L);
                int i12 = (int) j14;
                iArr2[15] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long a3 = yg.a(j11, j6, j14 >>> 32, j10 & 4294967295L);
                long a4 = yg.a(j11, j8, a3 >>> 32, j13);
                long j15 = (iArr2[18] & 4294967295L) + (j12 >>> 32) + (a4 >>> 32);
                long j16 = iArr[10] & 4294967295L;
                long j17 = (iArr2[19] & 4294967295L) + (j15 >>> 32);
                long j18 = j17 & 4294967295L;
                long j19 = (j16 * j2) + (a3 & 4294967295L);
                int i14 = (int) j19;
                iArr2[16] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long a5 = yg.a(j16, j6, j19 >>> 32, a4 & 4294967295L);
                long a6 = yg.a(j16, j8, a5 >>> 32, j15 & 4294967295L);
                long a7 = yg.a(j16, j11, a6 >>> 32, j18);
                long j20 = a6 & 4294967295L;
                long j21 = (iArr2[20] & 4294967295L) + (j17 >>> 32) + (a7 >>> 32);
                long j22 = iArr[11] & 4294967295L;
                long j23 = (iArr2[21] & 4294967295L) + (j21 >>> 32);
                long j24 = (j2 * j22) + (a5 & 4294967295L);
                int i16 = (int) j24;
                iArr2[17] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long a8 = yg.a(j6, j22, j24 >>> 32, j20);
                long a9 = yg.a(j22, j8, a8 >>> 32, a7 & 4294967295L);
                long a10 = yg.a(j22, j11, a9 >>> 32, j21 & 4294967295L);
                long a11 = yg.a(j22, j16, a10 >>> 32, j23 & 4294967295L);
                long j25 = (iArr2[22] & 4294967295L) + (j23 >>> 32) + (a11 >>> 32);
                int i18 = (int) a8;
                iArr2[18] = i17 | (i18 << 1);
                int i19 = (int) a9;
                iArr2[19] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) a10;
                iArr2[20] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) a11;
                iArr2[21] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j25;
                iArr2[22] = i24 | (i25 << 1);
                iArr2[23] = (i25 >>> 31) | ((iArr2[23] + ((int) (j25 >>> 32))) << 1);
                int r = r(iArr2, iArr2);
                int p = p(iArr2, 18, iArr2, 12, p(iArr2, 0, iArr2, 6, 0) + r) + r;
                int[] iArr3 = new int[6];
                A(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                d1(iArr3, iArr4);
                t(24, r1(12, iArr4, iArr2, 6) + p, 18, iArr2);
                return;
            }
            i5 = i8;
            j = 4294967295L;
            i3 = i6;
            i = 6;
            i2 = 12;
        }
    }

    public static int h(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static boolean h0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int h1(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((iArr[i2] & 4294967295L) - (4294967295L & iArr2[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int i(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static boolean i0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int i1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int j(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static boolean j0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void j1(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = ((iArr[i + 0] & 4294967295L) - (iArr2[i2 + 0] & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        iArr3[5] = (int) (((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32));
    }

    public static int k(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static boolean k0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int k1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean l0(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void l1(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = ((iArr[i + 0] & 4294967295L) - (iArr2[i2 + 0] & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[i + 6] & 4294967295L) - (iArr2[i2 + 6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        iArr3[7] = (int) (((iArr[i + 7] & 4294967295L) - (iArr2[i2 + 7] & 4294967295L)) + (j7 >> 32));
    }

    public static boolean m0(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int m1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int n(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static boolean n0(int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int n1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int o(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = (iArr[0 + i3] & 4294967295L) + (4294967295L & iArr2[i4]) + j;
            iArr2[i4] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static boolean o0(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int o1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int p(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j = (iArr[i + 0] & 4294967295L) + (iArr2[i4] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[i5] & 4294967295L) + (j >>> 32);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[i6] & 4294967295L) + (j2 >>> 32);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[i7] & 4294967295L) + (j3 >>> 32);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[i8] & 4294967295L) + (j4 >>> 32);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (iArr[i + 5] & 4294967295L) + (4294967295L & iArr2[i9]) + (j5 >>> 32);
        iArr2[i9] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static boolean p0(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void p1(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) - (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = ((4294967295L & iArr[1]) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return;
        }
        z(i, 2, iArr);
    }

    public static int q(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4 = i2 + 0;
        long j = (iArr[i + 0] & 4294967295L) + (iArr2[i4] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[i5] & 4294967295L) + (j >>> 32);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[i6] & 4294967295L) + (j2 >>> 32);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[i7] & 4294967295L) + (j3 >>> 32);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[i8] & 4294967295L) + (j4 >>> 32);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[i9] & 4294967295L) + (j5 >>> 32);
        iArr2[i9] = (int) j6;
        int i10 = i2 + 6;
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[i10] & 4294967295L) + (j6 >>> 32);
        iArr2[i10] = (int) j7;
        int i11 = i2 + 7;
        long j8 = (iArr[i + 7] & 4294967295L) + (4294967295L & iArr2[i11]) + (j7 >>> 32);
        iArr2[i11] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean q0(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int q1(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((iArr2[i2] & 4294967295L) - (4294967295L & iArr[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int r(int[] iArr, int[] iArr2) {
        long j = (iArr[6] & 4294967295L) + (iArr2[12] & 4294967295L) + 0;
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (iArr[7] & 4294967295L) + (iArr2[13] & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (iArr[8] & 4294967295L) + (iArr2[14] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (iArr[9] & 4294967295L) + (iArr2[15] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (iArr[10] & 4294967295L) + (iArr2[16] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (iArr[11] & 4294967295L) + (4294967295L & iArr2[17]) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
    }

    public static boolean r0(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int r1(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = ((iArr2[i4] & 4294967295L) - (4294967295L & iArr[0 + i3])) + j;
            iArr2[i4] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int s(int[] iArr, int[] iArr2) {
        long j = (iArr[8] & 4294967295L) + (iArr2[16] & 4294967295L) + 0;
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (iArr[9] & 4294967295L) + (iArr2[17] & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (iArr[10] & 4294967295L) + (iArr2[18] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (iArr[11] & 4294967295L) + (iArr2[19] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (iArr[12] & 4294967295L) + (iArr2[20] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (iArr[13] & 4294967295L) + (iArr2[21] & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (iArr[14] & 4294967295L) + (iArr2[22] & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (iArr[15] & 4294967295L) + (4294967295L & iArr2[23]) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static boolean s0(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void s1(int[] iArr, int[] iArr2) {
        long j = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        iArr2[4] = (int) (((iArr2[4] & 4294967295L) - (4294967295L & iArr[4])) + (j4 >> 32));
    }

    public static void t(int i, int i2, int i3, int[] iArr) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[i3]);
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return;
        }
        b0(i, i3 + 1, iArr);
    }

    public static boolean t0(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void t1(int[] iArr, int[] iArr2) {
        long j = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        iArr2[5] = (int) (((iArr2[5] & 4294967295L) - (4294967295L & iArr[5])) + (j5 >> 32));
    }

    public static int u(int i, int i2, int[] iArr) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return b0(i, 1, iArr);
    }

    public static boolean u0(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void u1(int[] iArr, int[] iArr2) {
        long j = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        iArr2[7] = (int) (((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j7 >> 32));
    }

    public static int v(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public static int v0(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static BigInteger v1(int[] iArr, int i) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                d0(bArr, i3, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static long w0(byte[] bArr, int i) {
        return ((v0(bArr, i + 4) & 4294967295L) << 32) | (4294967295L & v0(bArr, i));
    }

    public static BigInteger w1(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                d0(bArr, i2, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void x(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static void x0(int i, long j, byte[] bArr) {
        d0(bArr, (int) (j >>> 32), i);
        d0(bArr, (int) (j & 4294967295L), i + 4);
    }

    public static BigInteger x1(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                d0(bArr, i2, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static z91 y(e3 e3Var, nb nbVar) {
        if (zw4.P.a) {
            return new z91(e3Var, nbVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static wn y0(wn wnVar, int i, nj2 nj2Var) {
        t51 t51Var;
        hn hnVar = wnVar.a;
        t51 X0 = X0(wnVar, i);
        wn r = wnVar.r((jn) nj2Var.Q);
        qf0 l = hnVar.l(r, "bc_wnaf");
        if (l != null && (l instanceof t51)) {
            t51Var = (t51) l;
        } else {
            t51Var = new t51();
        }
        wn wnVar2 = X0.c;
        if (wnVar2 != null) {
            t51Var.c = wnVar2.r((jn) nj2Var.Q);
        }
        wn[] wnVarArr = X0.a;
        int length = wnVarArr.length;
        wn[] wnVarArr2 = new wn[length];
        for (int i2 = 0; i2 < wnVarArr.length; i2++) {
            wnVarArr2[i2] = wnVarArr[i2].r((jn) nj2Var.Q);
        }
        t51Var.a = wnVarArr2;
        wn[] wnVarArr3 = new wn[length];
        for (int i3 = 0; i3 < length; i3++) {
            wnVarArr3[i3] = wnVarArr2[i3].m();
        }
        t51Var.b = wnVarArr3;
        hnVar.p(r, "bc_wnaf", t51Var);
        return r;
    }

    public static BigInteger y1(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                d0(bArr, i2, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int z(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    public static void z0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        int i = 1;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr[0] & 4294967295L;
        long j6 = (j5 * j) + 0;
        iArr3[0] = (int) j6;
        long j7 = (j5 * j2) + (j6 >>> 32);
        iArr3[1] = (int) j7;
        long j8 = (j5 * j3) + (j7 >>> 32);
        iArr3[2] = (int) j8;
        long j9 = (j5 * j4) + (j8 >>> 32);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j10 = iArr[i] & 4294967295L;
            int i3 = i + 0;
            long j11 = (j10 * j) + (iArr3[i3] & 4294967295L) + 0;
            iArr3[i3] = (int) j11;
            int i4 = i + 1;
            long j12 = (j10 * j2) + (iArr3[i4] & 4294967295L) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i + 2;
            long j13 = (j10 * j3) + (iArr3[i5] & 4294967295L) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i + 3;
            long j14 = (j10 * j4) + (iArr3[i6] & 4294967295L) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            iArr3[i + 4] = (int) (j14 >>> 32);
            i = i4;
            j = j;
        }
    }

    public static BigInteger z1(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                d0(bArr, i2, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public wn J0(wn wnVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum != 0 && !wnVar.j()) {
            wn K0 = K0(wnVar, bigInteger.abs());
            if (signum <= 0) {
                K0 = K0.m();
            }
            if (K0.k()) {
                return K0;
            }
            throw new IllegalArgumentException("Invalid point");
        }
        return wnVar.a.k();
    }

    public abstract wn K0(wn wnVar, BigInteger bigInteger);

    public abstract void L0();

    public abstract void M0(l20 l20Var);

    public void N0() {
    }

    public abstract void O0(Object obj);

    public void P0() {
    }

    public abstract Path Q(float f, float f2, float f3, float f4);

    public abstract void Q0();

    public abstract void R0(String str);

    public abstract void S0(int i);

    public abstract void T0(Typeface typeface, boolean z);

    public abstract void U0(i2 i2Var);

    public abstract void V0();

    public abstract void W0(xg0 xg0Var);

    public abstract void m(View view, js jsVar);

    public abstract List w(String str, List list);
}