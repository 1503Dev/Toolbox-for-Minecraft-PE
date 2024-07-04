package defpackage;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* renamed from: da2  reason: default package */
public final class da2 implements wg3, mg, o55 {
    public static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};
    public static final a83 Q = new a83(0);
    public static final /* synthetic */ da2 R = new da2();
    public static final pg2 S = new pg2(2);
    public static final l33 T = new l33(2);
    public static final /* synthetic */ da2 U = new da2();
    public static final /* synthetic */ da2 V = new da2();
    public static final int[] W = {1, 2, 3, 6};
    public static final int[] X = {48000, 44100, 32000};
    public static final int[] Y = {24000, 22050, 16000};
    public static final int[] Z = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] a0 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] b0 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a = z61.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a > 511 || (a == 511 && z61.C(16, iArr3, P))) {
            a = (z61.a0(iArr3) + a) & 511;
        }
        iArr3[16] = a;
    }

    public static void d(int[] iArr, int[] iArr2) {
        int i;
        z61.f1(iArr, iArr2);
        long j = 4294967295L;
        long j2 = iArr[8] & 4294967295L;
        int i2 = 16;
        int i3 = 7;
        int i4 = 16;
        int i5 = 0;
        while (true) {
            int i6 = i3 - 1;
            long j3 = j & iArr[i3 + 8];
            long j4 = j3 * j3;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i5 << 31) | ((int) (j4 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j4 >>> 1);
            i5 = (int) j4;
            if (i6 <= 0) {
                break;
            }
            j = 4294967295L;
            i2 = 16;
            i3 = i6;
        }
        long j5 = j2 * j2;
        iArr2[16] = (int) j5;
        long j6 = iArr[9] & 4294967295L;
        long j7 = (j6 * j2) + (((i5 << 31) & 4294967295L) | (j5 >>> 33));
        int i8 = (int) j7;
        iArr2[17] = (((int) (j5 >>> 32)) & 1) | (i8 << 1);
        int i9 = i8 >>> 31;
        long j8 = iArr[10] & 4294967295L;
        long j9 = (j8 * j2) + (4294967295L & iArr2[18]) + (j7 >>> 32);
        int i10 = (int) j9;
        iArr2[18] = i9 | (i10 << 1);
        long a = yg.a(j8, j6, j9 >>> 32, iArr2[19] & 4294967295L);
        long j10 = (iArr2[20] & 4294967295L) + (a >>> 32);
        long j11 = iArr[11] & 4294967295L;
        long j12 = (iArr2[21] & 4294967295L) + (j10 >>> 32);
        long j13 = (j11 * j2) + (a & 4294967295L);
        int i11 = (int) j13;
        iArr2[19] = (i10 >>> 31) | (i11 << 1);
        int i12 = i11 >>> 31;
        long a2 = yg.a(j11, j6, j13 >>> 32, j10 & 4294967295L);
        long a3 = yg.a(j11, j8, a2 >>> 32, j12 & 4294967295L);
        long j14 = (iArr2[22] & 4294967295L) + (j12 >>> 32) + (a3 >>> 32);
        long j15 = a3 & 4294967295L;
        long j16 = iArr[12] & 4294967295L;
        long j17 = (iArr2[23] & 4294967295L) + (j14 >>> 32);
        long j18 = j14 & 4294967295L;
        long j19 = (iArr2[24] & 4294967295L) + (j17 >>> 32);
        long j20 = j17 & 4294967295L;
        long j21 = (j16 * j2) + (a2 & 4294967295L);
        int i13 = (int) j21;
        iArr2[20] = i12 | (i13 << 1);
        int i14 = i13 >>> 31;
        long a4 = yg.a(j16, j6, j21 >>> 32, j15);
        long a5 = yg.a(j16, j8, a4 >>> 32, j18);
        long a6 = yg.a(j16, j11, a5 >>> 32, j20);
        long j22 = a5 & 4294967295L;
        long j23 = j19 + (a6 >>> 32);
        long j24 = iArr[13] & 4294967295L;
        long j25 = (iArr2[25] & 4294967295L) + (j23 >>> 32);
        long j26 = j23 & 4294967295L;
        long j27 = (iArr2[26] & 4294967295L) + (j25 >>> 32);
        long j28 = j25 & 4294967295L;
        long j29 = (j24 * j2) + (a4 & 4294967295L);
        int i15 = (int) j29;
        iArr2[21] = i14 | (i15 << 1);
        int i16 = i15 >>> 31;
        long a7 = yg.a(j24, j6, j29 >>> 32, j22);
        long a8 = yg.a(j24, j8, a7 >>> 32, a6 & 4294967295L);
        long a9 = yg.a(j24, j11, a8 >>> 32, j26);
        long j30 = a8 & 4294967295L;
        long a10 = yg.a(j24, j16, a9 >>> 32, j28);
        long j31 = j27 + (a10 >>> 32);
        long j32 = a10 & 4294967295L;
        long j33 = iArr[14] & 4294967295L;
        long j34 = (iArr2[27] & 4294967295L) + (j31 >>> 32);
        long j35 = (iArr2[28] & 4294967295L) + (j34 >>> 32);
        long j36 = j34 & 4294967295L;
        long j37 = (j33 * j2) + (a7 & 4294967295L);
        int i17 = (int) j37;
        iArr2[22] = i16 | (i17 << 1);
        int i18 = i17 >>> 31;
        long a11 = yg.a(j33, j6, j37 >>> 32, j30);
        long a12 = yg.a(j33, j8, a11 >>> 32, a9 & 4294967295L);
        long a13 = yg.a(j33, j11, a12 >>> 32, j32);
        long j38 = a12 & 4294967295L;
        long a14 = yg.a(j33, j16, a13 >>> 32, j31 & 4294967295L);
        long j39 = a13 & 4294967295L;
        long a15 = yg.a(j33, j24, a14 >>> 32, j36);
        long j40 = a14 & 4294967295L;
        long j41 = j35 + (a15 >>> 32);
        long j42 = iArr[15] & 4294967295L;
        long j43 = (iArr2[29] & 4294967295L) + (j41 >>> 32);
        long j44 = j41 & 4294967295L;
        long j45 = (iArr2[30] & 4294967295L) + (j43 >>> 32);
        long j46 = j43 & 4294967295L;
        long j47 = (j2 * j42) + (a11 & 4294967295L);
        int i19 = (int) j47;
        iArr2[23] = i18 | (i19 << 1);
        long a16 = yg.a(j6, j42, j47 >>> 32, j38);
        long a17 = yg.a(j8, j42, a16 >>> 32, j39);
        long a18 = yg.a(j11, j42, a17 >>> 32, j40);
        long a19 = yg.a(j42, j16, a18 >>> 32, a15 & 4294967295L);
        long a20 = yg.a(j42, j24, a19 >>> 32, j44);
        long a21 = yg.a(j42, j33, a20 >>> 32, j46);
        long j48 = j45 + (a21 >>> 32);
        int i20 = (int) a16;
        iArr2[24] = (i19 >>> 31) | (i20 << 1);
        int i21 = i20 >>> 31;
        int i22 = (int) a17;
        iArr2[25] = i21 | (i22 << 1);
        int i23 = i22 >>> 31;
        int i24 = (int) a18;
        iArr2[26] = i23 | (i24 << 1);
        int i25 = i24 >>> 31;
        int i26 = (int) a19;
        iArr2[27] = i25 | (i26 << 1);
        int i27 = i26 >>> 31;
        int i28 = (int) a20;
        iArr2[28] = i27 | (i28 << 1);
        int i29 = i28 >>> 31;
        int i30 = (int) a21;
        iArr2[29] = i29 | (i30 << 1);
        int i31 = i30 >>> 31;
        int i32 = (int) j48;
        iArr2[30] = i31 | (i32 << 1);
        iArr2[31] = (i32 >>> 31) | ((iArr2[31] + ((int) (j48 >>> 32))) << 1);
        int s = z61.s(iArr2, iArr2);
        int q = z61.q(24, 16, iArr2, iArr2, z61.q(0, 8, iArr2, iArr2, 0) + s) + s;
        int[] iArr3 = new int[8];
        z61.B(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        z61.f1(iArr3, iArr4);
        z61.t(32, z61.r1(16, iArr4, iArr2, 8) + q, 24, iArr2);
        int i33 = iArr[16];
        long j49 = (i33 << 1) & 4294967295L;
        long j50 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            long j51 = ((iArr[i34 + i35] & 4294967295L) * j49) + (iArr2[i] & 4294967295L) + j50;
            iArr2[i35 + 16] = (int) j51;
            long j52 = j51 >>> 32;
            i35++;
            if (i35 >= 16) {
                iArr2[32] = (i33 * i33) + ((int) j52);
                return;
            }
            j50 = j52;
            i34 = 0;
        }
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int r1;
        int[] iArr4 = new int[33];
        z61.D0(iArr, iArr2, iArr4);
        long j = iArr2[8] & 4294967295L;
        long j2 = iArr2[9] & 4294967295L;
        long j3 = iArr2[10] & 4294967295L;
        long j4 = iArr2[11] & 4294967295L;
        long j5 = iArr2[12] & 4294967295L;
        long j6 = iArr2[13] & 4294967295L;
        long j7 = iArr2[14] & 4294967295L;
        long j8 = iArr2[15] & 4294967295L;
        long j9 = iArr[8] & 4294967295L;
        long j10 = 0;
        long j11 = (j9 * j) + 0;
        iArr4[16] = (int) j11;
        long j12 = (j9 * j2) + (j11 >>> 32);
        iArr4[17] = (int) j12;
        long j13 = (j9 * j3) + (j12 >>> 32);
        iArr4[18] = (int) j13;
        long j14 = (j9 * j4) + (j13 >>> 32);
        iArr4[19] = (int) j14;
        long j15 = (j9 * j5) + (j14 >>> 32);
        iArr4[20] = (int) j15;
        long j16 = (j9 * j6) + (j15 >>> 32);
        iArr4[21] = (int) j16;
        long j17 = (j9 * j7) + (j16 >>> 32);
        iArr4[22] = (int) j17;
        long j18 = (j9 * j8) + (j17 >>> 32);
        iArr4[23] = (int) j18;
        iArr4[24] = (int) (j18 >>> 32);
        int i = 1;
        int i2 = 1;
        int i3 = 16;
        while (i2 < 8) {
            i3 += i;
            long j19 = iArr[i2 + 8] & 4294967295L;
            int i4 = i3 + 0;
            long j20 = (j19 * j) + (iArr4[i4] & 4294967295L) + 0;
            iArr4[i4] = (int) j20;
            int i5 = i3 + 1;
            long j21 = (j19 * j2) + (iArr4[i5] & 4294967295L) + (j20 >>> 32);
            iArr4[i5] = (int) j21;
            int i6 = i3 + 2;
            long j22 = (j19 * j3) + (iArr4[i6] & 4294967295L) + (j21 >>> 32);
            iArr4[i6] = (int) j22;
            int i7 = i3 + 3;
            long j23 = (j19 * j4) + (iArr4[i7] & 4294967295L) + (j22 >>> 32);
            iArr4[i7] = (int) j23;
            int i8 = i3 + 4;
            long j24 = (j19 * j5) + (iArr4[i8] & 4294967295L) + (j23 >>> 32);
            iArr4[i8] = (int) j24;
            int i9 = i3 + 5;
            long j25 = (j19 * j6) + (iArr4[i9] & 4294967295L) + (j24 >>> 32);
            iArr4[i9] = (int) j25;
            int i10 = i3 + 6;
            long j26 = (j19 * j7) + (iArr4[i10] & 4294967295L) + (j25 >>> 32);
            iArr4[i10] = (int) j26;
            long j27 = j26 >>> 32;
            int i11 = i3 + 7;
            long j28 = (j19 * j8) + (iArr4[i11] & 4294967295L) + j27;
            iArr4[i11] = (int) j28;
            iArr4[i3 + 8] = (int) (j28 >>> 32);
            i2++;
            j2 = j2;
            j3 = j3;
            i = 1;
        }
        int s = z61.s(iArr4, iArr4);
        int i12 = 0;
        int q = z61.q(24, 16, iArr4, iArr4, z61.q(0, 8, iArr4, iArr4, 0) + s) + s;
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[8];
        if (z61.B(iArr, iArr, iArr5) != z61.B(iArr2, iArr2, iArr6)) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr7 = new int[16];
        z61.D0(iArr5, iArr6, iArr7);
        if (z) {
            r1 = z61.o(16, iArr7, iArr4, 8);
        } else {
            r1 = z61.r1(16, iArr7, iArr4, 8);
        }
        z61.t(32, q + r1, 24, iArr4);
        int i13 = iArr[16];
        int i14 = iArr2[16];
        long j29 = i13 & 4294967295L;
        long j30 = i14 & 4294967295L;
        while (true) {
            long j31 = j29;
            int i15 = i12 + 16;
            long j32 = ((iArr[i12] & 4294967295L) * j30) + ((iArr2[i12] & 4294967295L) * j29) + (iArr4[i15] & 4294967295L) + j10;
            iArr4[i15] = (int) j32;
            long j33 = j32 >>> 32;
            i12++;
            if (i12 >= 16) {
                iArr4[32] = (i13 * i14) + ((int) j33);
                g(iArr4, iArr3);
                return;
            }
            j10 = j33;
            j29 = j31;
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i2 = i;
        int i3 = 16;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i4 = iArr[16 + i3];
            iArr2[i3 + 0] = (i2 << (-9)) | (i4 >>> 9);
            i2 = i4;
        }
        int n = z61.n(16, iArr, iArr2) + ((i2 << (-9)) >>> 23) + (i >>> 9);
        if (n > 511 || (n == 511 && z61.C(16, iArr2, P))) {
            n = (z61.a0(iArr2) + n) & 511;
        }
        iArr2[16] = n;
    }

    public static void h(int[] iArr) {
        int i = iArr[16];
        int u = z61.u(16, i >>> 9, iArr) + (i & 511);
        if (u > 511 || (u == 511 && z61.C(16, iArr, P))) {
            u = (z61.a0(iArr) + u) & 511;
        }
        iArr[16] = u;
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        d(iArr, iArr3);
        g(iArr3, iArr2);
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3) {
        int h1 = (z61.h1(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (h1 < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < 16) {
                    int i3 = iArr3[i2] - 1;
                    iArr3[i2] = i3;
                    if (i3 != -1) {
                        break;
                    }
                    i2++;
                } else {
                    i = -1;
                    break;
                }
            }
            h1 = (h1 + i) & 511;
        }
        iArr3[16] = h1;
    }

    public static final b52 k(Context context, y42 y42Var) {
        g52 g52Var = new g52(context);
        b52 b52Var = new b52(g52Var);
        e52 e52Var = new e52(g52Var, y42Var, b52Var);
        f52 f52Var = new f52(g52Var, b52Var);
        synchronized (g52Var.c) {
            x42 x42Var = new x42(context, jv5.A.r.a(), e52Var, f52Var);
            g52Var.a = x42Var;
            x42Var.n();
        }
        return b52Var;
    }

    public static final void l(ca2 ca2Var, ba2 ba2Var) {
        File externalStorageDirectory;
        if (ba2Var.c != null) {
            if (!TextUtils.isEmpty(ba2Var.d)) {
                Context context = ba2Var.c;
                String str = ba2Var.d;
                String str2 = ba2Var.a;
                LinkedHashMap linkedHashMap = ba2Var.b;
                ca2Var.e = context;
                ca2Var.f = str;
                ca2Var.d = str2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ca2Var.h = atomicBoolean;
                atomicBoolean.set(((Boolean) hb2.c.d()).booleanValue());
                if (ca2Var.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                    ca2Var.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ca2Var.b.put((String) entry.getKey(), (String) entry.getValue());
                }
                zw2.a.execute(new lz1(1, ca2Var));
                HashMap hashMap = ca2Var.c;
                ga2 ga2Var = ia2.b;
                hashMap.put("action", ga2Var);
                ca2Var.c.put("ad_format", ga2Var);
                ca2Var.c.put("e", ia2.c);
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }

    public static int m(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = X[i];
        if (i4 == 44100) {
            int i5 = b0[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = a0[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }

    @Override // defpackage.mg
    public Object b(yv0 yv0Var) {
        return Boolean.valueOf(yv0Var.l());
    }

    @Override // defpackage.o55
    public ja c(r65 r65Var) {
        q75 q75Var;
        r75 r75Var;
        f65 f65Var = t75.a;
        if (((p65) r65Var).a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                ea5 A = ea5.A(((p65) r65Var).c, ud5.c);
                if (A.w() == 0) {
                    p75 p75Var = new p75();
                    p75Var.a = Integer.valueOf(A.C().o());
                    p75Var.b = Integer.valueOf(A.B().w());
                    int B = A.B().B();
                    int i = B - 2;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        q75Var = q75.c;
                                    } else {
                                        throw new GeneralSecurityException("Unable to parse HashType: " + j82.j(B));
                                    }
                                } else {
                                    q75Var = q75.f;
                                }
                            } else {
                                q75Var = q75.d;
                            }
                        } else {
                            q75Var = q75.e;
                        }
                    } else {
                        q75Var = q75.b;
                    }
                    p75Var.c = q75Var;
                    int i2 = ((p65) r65Var).e;
                    int b = cm0.b(i2);
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 4) {
                                    r75Var = r75.c;
                                } else {
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + e1.a(i2));
                                }
                            } else {
                                r75Var = r75.e;
                            }
                        } else {
                            r75Var = r75.d;
                        }
                    } else {
                        r75Var = r75.b;
                    }
                    p75Var.d = r75Var;
                    s75 a = p75Var.a();
                    j75 j75Var = new j75();
                    j75Var.a = a;
                    j75Var.b = ee4.d(A.C().g());
                    j75Var.c = ((p65) r65Var).f;
                    return j75Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (IllegalArgumentException | te5 unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((nd3) obj).j();
    }
}