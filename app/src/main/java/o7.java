package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: o7  reason: default package */
public class o7 implements uc, kr1, jp2, hc5, wg3 {
    public static final int[] P = {-1, -1, -2, -1, -1, -1};
    public static final int[] Q = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] R = {-1, -1, -3, -1, -2, -1, 1, 0, 2};
    public static final /* synthetic */ o7 S = new o7();
    public static final di3 T = new di3(1);

    public /* synthetic */ o7() {
    }

    public /* synthetic */ o7(int i) {
    }

    public static void h(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (4294967295L & iArr[2]) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            z61.b0(6, 3, iArr);
        }
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        z61.B0(iArr, iArr2, iArr4);
        j(iArr4, iArr3);
    }

    public static void j(int[] iArr, int[] iArr2) {
        long j = iArr[6] & 4294967295L;
        long j2 = iArr[7] & 4294967295L;
        long j3 = (iArr[10] & 4294967295L) + j;
        long j4 = (iArr[11] & 4294967295L) + j2;
        long j5 = (iArr[0] & 4294967295L) + j3 + 0;
        long j6 = (iArr[1] & 4294967295L) + j4 + (j5 >> 32);
        int i = (int) j6;
        iArr2[1] = i;
        long j7 = j3 + (iArr[8] & 4294967295L);
        long j8 = j4 + (iArr[9] & 4294967295L);
        long j9 = (iArr[2] & 4294967295L) + j7 + (j6 >> 32);
        long j10 = j9 & 4294967295L;
        long j11 = (iArr[3] & 4294967295L) + j8 + (j9 >> 32);
        iArr2[3] = (int) j11;
        long j12 = (iArr[4] & 4294967295L) + (j7 - j) + (j11 >> 32);
        iArr2[4] = (int) j12;
        long j13 = (iArr[5] & 4294967295L) + (j8 - j2) + (j12 >> 32);
        iArr2[5] = (int) j13;
        long j14 = j13 >> 32;
        long j15 = j10 + j14;
        long j16 = j14 + (((int) j5) & 4294967295L);
        iArr2[0] = (int) j16;
        long j17 = j16 >> 32;
        if (j17 != 0) {
            long j18 = j17 + (4294967295L & i);
            iArr2[1] = (int) j18;
            j15 += j18 >> 32;
        }
        iArr2[2] = (int) j15;
        if (((j15 >> 32) == 0 || z61.b0(6, 3, iArr2) == 0) && !(iArr2[5] == -1 && z61.W(iArr2, P))) {
            return;
        }
        h(iArr2);
    }

    public static void k(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (4294967295L & iArr[2]) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || z61.b0(6, 3, iArr) == 0) && !(iArr[5] == -1 && z61.W(iArr, P))) {
            return;
        }
        h(iArr);
    }

    public static void l(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        z61.d1(iArr, iArr3);
        j(iArr3, iArr2);
    }

    public static void m(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        z61.d1(iArr, iArr3);
        while (true) {
            j(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.d1(iArr2, iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.m1(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((4294967295L & iArr3[2]) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                z61.z(6, 3, iArr3);
            }
        }
    }

    @Override // defpackage.kr1
    public long a(p16 p16Var) {
        return -1L;
    }

    @Override // defpackage.kr1
    public ml1 b() {
        return new ll1(-9223372036854775807L, 0L);
    }

    @Override // defpackage.hc5
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // defpackage.jp2
    public void d(String str, Throwable th) {
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((vh3) obj).b();
    }

    @Override // defpackage.jp2
    public void f(Throwable th, String str, float f) {
    }

    @Override // defpackage.kr1
    public void g(long j) {
    }

    public /* synthetic */ o7(Object obj) {
    }
}