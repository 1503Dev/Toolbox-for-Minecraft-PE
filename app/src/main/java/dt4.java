package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* renamed from: dt4  reason: default package */
public class dt4 implements wg3, o74 {
    public static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] Q = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] R = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};
    public static final /* synthetic */ dt4 S = new dt4();
    public static final di3 T = new di3(0);
    public static final z92 U = new z92(3);
    public static final n53 V = new n53(2);
    public static final byte[] W = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    public static final byte[] X = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    public static final /* synthetic */ dt4 Y = new dt4();

    public static void a(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = (iArr[3] & 4294967295L) + 1 + j3;
        iArr[3] = (int) j5;
        long j6 = (4294967295L & iArr[4]) + 1 + (j5 >> 32);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            z61.b0(12, 5, iArr);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[24];
        z61.E0(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void c(int[] iArr, int[] iArr2) {
        long j = iArr[16] & 4294967295L;
        long j2 = iArr[17] & 4294967295L;
        long j3 = iArr[18] & 4294967295L;
        long j4 = iArr[19] & 4294967295L;
        long j5 = iArr[20] & 4294967295L;
        long j6 = iArr[21] & 4294967295L;
        long j7 = iArr[22] & 4294967295L;
        long j8 = iArr[23] & 4294967295L;
        long j9 = ((iArr[12] & 4294967295L) + j5) - 1;
        long j10 = (iArr[13] & 4294967295L) + j7;
        long j11 = (iArr[14] & 4294967295L) + j7 + j8;
        long j12 = (iArr[15] & 4294967295L) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = j9 + j14;
        long j17 = (iArr[0] & 4294967295L) + j16 + 0;
        iArr2[0] = (int) j17;
        long j18 = (((iArr[1] & 4294967295L) + j8) - j9) + j10 + (j17 >> 32);
        iArr2[1] = (int) j18;
        long j19 = (((iArr[2] & 4294967295L) - j6) - j10) + j11 + (j18 >> 32);
        iArr2[2] = (int) j19;
        long j20 = ((iArr[3] & 4294967295L) - j11) + j12 + j16 + (j19 >> 32);
        iArr2[3] = (int) j20;
        long j21 = (((((iArr[4] & 4294967295L) + j) + j6) + j10) - j12) + j16 + (j20 >> 32);
        iArr2[4] = (int) j21;
        long j22 = ((iArr[5] & 4294967295L) - j) + j10 + j11 + j13 + (j21 >> 32);
        iArr2[5] = (int) j22;
        long j23 = (((iArr[6] & 4294967295L) + j3) - j2) + j11 + j12 + (j22 >> 32);
        iArr2[6] = (int) j23;
        long j24 = ((((iArr[7] & 4294967295L) + j) + j4) - j3) + j12 + (j23 >> 32);
        iArr2[7] = (int) j24;
        long j25 = (((((iArr[8] & 4294967295L) + j) + j2) + j5) - j4) + (j24 >> 32);
        iArr2[8] = (int) j25;
        long j26 = (((iArr[9] & 4294967295L) + j3) - j5) + j13 + (j25 >> 32);
        iArr2[9] = (int) j26;
        long j27 = ((((iArr[10] & 4294967295L) + j3) + j4) - j14) + j15 + (j26 >> 32);
        iArr2[10] = (int) j27;
        long j28 = ((((iArr[11] & 4294967295L) + j4) + j5) - j15) + (j27 >> 32);
        iArr2[11] = (int) j28;
        d(iArr2, (int) ((j28 >> 32) + 1));
    }

    public static void d(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = ((iArr[1] & 4294967295L) - j2) + (j3 >> 32);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = (iArr[3] & 4294967295L) + j2 + j5;
            iArr[3] = (int) j7;
            long j8 = (4294967295L & iArr[4]) + j2 + (j7 >> 32);
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || z61.b0(12, 5, iArr) == 0) && !(iArr[11] == -1 && z61.T(12, iArr, P))) {
            return;
        }
        a(iArr);
    }

    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        z61.g1(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void h(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        z61.g1(iArr, iArr3);
        while (true) {
            c(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.g1(iArr2, iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.h1(12, iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = (iArr3[1] & 4294967295L) + 1 + (j >> 32);
            iArr3[1] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = ((iArr3[3] & 4294967295L) - 1) + j3;
            iArr3[3] = (int) j5;
            long j6 = ((4294967295L & iArr3[4]) - 1) + (j5 >> 32);
            iArr3[4] = (int) j6;
            if ((j6 >> 32) != 0) {
                z61.z(12, 5, iArr3);
            }
        }
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 2:
                return "CONTEXT_NOT_AN_ACTIVITY";
            case 3:
                return "CONTEXT_NULL";
            case 4:
                return "CCT_NOT_SUPPORTED";
            case 5:
                return "CCT_READY_TO_OPEN";
            case 6:
                return "ACTIVITY_NOT_FOUND";
            case 7:
                return "EMPTY_URL";
            case 8:
                return "UNKNOWN";
            default:
                return "WRONG_EXP_SETUP";
        }
    }

    public static boolean k(File file) {
        try {
            X509Certificate[][] a = ku1.a(file.getAbsolutePath());
            if (a.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(a[0][0].getEncoded());
                if (Arrays.equals(W, digest)) {
                    return true;
                }
                return !"user".equals(Build.TYPE) && Arrays.equals(X, digest);
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (iu1 e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }

    public static boolean l(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static long m(kh4 kh4Var, int i, int i2) {
        kh4Var.e(i);
        if (kh4Var.c - kh4Var.b < 5) {
            return -9223372036854775807L;
        }
        int i3 = kh4Var.i();
        if ((8388608 & i3) != 0 || ((i3 >> 8) & 8191) != i2 || (i3 & 32) == 0 || kh4Var.n() < 7 || kh4Var.c - kh4Var.b < 7 || (kh4Var.n() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        kh4Var.a(bArr, 0, 6);
        long j = bArr[3] & 255;
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((nd3) obj).q();
    }

    @Override // defpackage.o74
    public void f(Object obj, hp1 hp1Var) {
        jo5 jo5Var = (jo5) obj;
    }
}