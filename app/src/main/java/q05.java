package defpackage;

import defpackage.p31;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@Deprecated
/* renamed from: q05  reason: default package */
public final class q05 implements wg3, jc0, wj2, ot4 {
    public static final /* synthetic */ q05 P = new q05();
    public static final di3 Q = new di3(2);
    public static final /* synthetic */ q05 R = new q05();
    public static final /* synthetic */ q05 S = new q05();
    public static final yk4 T = new yk4();
    public static final int[] U;
    public static final int[] V;
    public static final int[] W;
    public static final int[] X;

    static {
        new zf(0);
        U = new int[]{0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        V = new int[]{0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        W = new int[]{67108863, 33554431};
        X = new int[]{26, 25};
    }

    public /* synthetic */ q05() {
    }

    public /* synthetic */ q05(int i) {
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    @Deprecated
    public static final m05 d(byte[] bArr) {
        try {
            ab5 C = ab5.C(bArr, ud5.c);
            for (za5 za5Var : C.E()) {
                if (za5Var.x().x() == 1 || za5Var.x().x() == 2 || za5Var.x().x() == 3) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return m05.a(C);
        } catch (te5 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static c85 g(u05 u05Var) {
        g05 g05Var;
        ArrayList arrayList = new ArrayList();
        z75 z75Var = z75.b;
        z75 z75Var2 = u05Var.c;
        for (List<r05> list : u05Var.a.values()) {
            for (r05 r05Var : list) {
                int i = r05Var.h - 2;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            g05Var = g05.d;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        g05Var = g05.c;
                    }
                } else {
                    g05Var = g05.b;
                }
                int i2 = r05Var.e;
                String str = r05Var.f;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new b85(g05Var, i2, str, e1.e(r05Var.d)));
            }
        }
        r05 r05Var2 = u05Var.b;
        Integer num = null;
        if (r05Var2 != null) {
            num = Integer.valueOf(r05Var2.e);
        }
        if (num != null) {
            try {
                int intValue = num.intValue();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = ((b85) arrayList.get(i3)).b;
                    i3++;
                    if (i4 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        return new c85(z75Var2, Collections.unmodifiableList(arrayList), num);
    }

    public static void h(long j, kh4 kh4Var, pl1[] pl1VarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (kh4Var.c - kh4Var.b > 1) {
                int i3 = 0;
                while (true) {
                    if (kh4Var.c - kh4Var.b == 0) {
                        i = -1;
                        break;
                    }
                    int n = kh4Var.n();
                    i3 += n;
                    if (n != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (kh4Var.c - kh4Var.b == 0) {
                        i4 = -1;
                        break;
                    }
                    int n2 = kh4Var.n();
                    i4 += n2;
                    if (n2 != 255) {
                        break;
                    }
                }
                int i5 = kh4Var.b;
                int i6 = i5 + i4;
                if (i4 != -1 && i4 <= kh4Var.c - i5) {
                    if (i == 4 && i4 >= 8) {
                        int n3 = kh4Var.n();
                        int q = kh4Var.q();
                        if (q == 49) {
                            i2 = kh4Var.i();
                            q = 49;
                        } else {
                            i2 = 0;
                        }
                        int n4 = kh4Var.n();
                        if (q == 47) {
                            kh4Var.f(1);
                            q = 47;
                        }
                        if (n3 == 181 && ((q == 49 || q == 47) && n4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (q == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            k(j, kh4Var, pl1VarArr);
                        }
                    }
                } else {
                    lb4.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i6 = kh4Var.c;
                }
                kh4Var.e(i6);
            } else {
                return;
            }
        }
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        l(jArr4, jArr2, jArr3);
        o(jArr4);
        n(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static String j(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void k(long j, kh4 kh4Var, pl1[] pl1VarArr) {
        int n = kh4Var.n();
        if ((n & 64) != 0) {
            int i = n & 31;
            kh4Var.f(1);
            int i2 = kh4Var.b;
            for (pl1 pl1Var : pl1VarArr) {
                int i3 = i * 3;
                kh4Var.e(i2);
                pl1Var.a(i3, kh4Var);
                if (j != -9223372036854775807L) {
                    pl1Var.b(j, 1, i3, 0, null);
                }
            }
        }
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = jArr3[0];
        jArr[1] = (j2 * j3) + (jArr3[1] * j);
        long j4 = jArr2[1];
        long j5 = jArr3[1];
        jArr[2] = ((j4 + j4) * j5) + (jArr3[2] * j) + (jArr2[2] * j3);
        long j6 = jArr3[2];
        long j7 = jArr2[2];
        jArr[3] = (j4 * j6) + (j7 * j5) + (jArr3[3] * j) + (jArr2[3] * j3);
        long j8 = jArr3[3];
        long j9 = jArr2[3];
        long j10 = (j4 * j8) + (j9 * j5);
        jArr[4] = j10 + j10 + (j7 * j6) + (jArr3[4] * j) + (jArr2[4] * j3);
        long j11 = jArr3[4];
        long j12 = jArr2[4];
        jArr[5] = (j7 * j8) + (j9 * j6) + (j4 * j11) + (j12 * j5) + (jArr3[5] * j) + (jArr2[5] * j3);
        long j13 = jArr3[5];
        long j14 = jArr2[5];
        long j15 = (j9 * j8) + (j4 * j13) + (j14 * j5);
        jArr[6] = j15 + j15 + (j7 * j11) + (j12 * j6) + (jArr3[6] * j) + (jArr2[6] * j3);
        long j16 = jArr3[6];
        long j17 = jArr2[6];
        jArr[7] = (j9 * j11) + (j12 * j8) + (j7 * j13) + (j14 * j6) + (j4 * j16) + (j17 * j5) + (jArr3[7] * j) + (jArr2[7] * j3);
        long j18 = jArr3[7];
        long j19 = jArr2[7];
        long j20 = (j9 * j13) + (j14 * j8) + (j4 * j18) + (j19 * j5);
        jArr[8] = j20 + j20 + (j12 * j11) + (j7 * j16) + (j17 * j6) + (jArr3[8] * j) + (jArr2[8] * j3);
        long j21 = jArr3[8];
        long j22 = jArr2[8];
        jArr[9] = (j12 * j13) + (j14 * j11) + (j9 * j16) + (j17 * j8) + (j7 * j18) + (j19 * j6) + (j4 * j21) + (j22 * j5) + (j * jArr3[9]) + (jArr2[9] * j3);
        long j23 = jArr3[9];
        long j24 = jArr2[9];
        long j25 = (j14 * j13) + (j9 * j18) + (j19 * j8) + (j4 * j23) + (j5 * j24);
        jArr[10] = j25 + j25 + (j12 * j16) + (j17 * j11) + (j7 * j21) + (j22 * j6);
        jArr[11] = (j14 * j16) + (j17 * j13) + (j12 * j18) + (j19 * j11) + (j9 * j21) + (j22 * j8) + (j7 * j23) + (j6 * j24);
        long j26 = (j14 * j18) + (j19 * j13) + (j9 * j23) + (j8 * j24);
        jArr[12] = j26 + j26 + (j17 * j16) + (j12 * j21) + (j22 * j11);
        jArr[13] = (j17 * j18) + (j19 * j16) + (j14 * j21) + (j22 * j13) + (j12 * j23) + (j11 * j24);
        long j27 = (j19 * j18) + (j14 * j23) + (j13 * j24);
        jArr[14] = j27 + j27 + (j17 * j21) + (j22 * j16);
        jArr[15] = (j19 * j21) + (j22 * j18) + (j17 * j23) + (j16 * j24);
        long j28 = (j18 * j24) + (j19 * j23);
        jArr[16] = j28 + j28 + (j22 * j21);
        jArr[17] = (j21 * j24) + (j22 * j23);
        jArr[18] = (j24 + j24) * j23;
    }

    public static boolean m(String str, CharSequence charSequence) {
        char c;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char charAt2 = charSequence.charAt(i);
                if (charAt != charAt2 && ((c = (char) ((charAt | ' ') - 97)) >= 26 || c != ((char) ((charAt2 | ' ') - 97)))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void n(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j6 + j6 + j7;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void o(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j2 + j2 + j3;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j6 + j6 + j7;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j10 + j10 + j11;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j14 + j14 + j15;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j18 + j18 + j19;
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j22 + j22 + j23;
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j26 + j26 + j27;
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j30 + j30 + j31;
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j34 + j34 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = j2 + j2;
        long j4 = jArr2[1];
        long j5 = (jArr2[2] * j2) + (j4 * j4);
        long j6 = jArr2[2];
        long j7 = (jArr2[3] * j2) + (j4 * j6);
        long j8 = jArr2[3];
        long j9 = (j6 * j6) + (j4 * 4 * j8);
        long j10 = jArr2[4];
        long j11 = (j6 * j8) + (j4 * j10) + (jArr2[5] * j2);
        long j12 = jArr2[5];
        long j13 = (j8 * j8) + (j6 * j10) + (jArr2[6] * j2) + ((j4 + j4) * j12);
        long j14 = jArr2[6];
        long j15 = (j8 * j10) + (j6 * j12) + (j4 * j14) + (jArr2[7] * j2);
        long j16 = jArr2[7];
        long j17 = (j8 * j12) + (j4 * j16);
        long j18 = j17 + j17 + (j6 * j14) + (jArr2[8] * j2);
        long j19 = j18 + j18;
        long j20 = jArr2[8];
        long j21 = (j10 * j12) + (j8 * j14) + (j6 * j16) + (j4 * j20) + (j2 * jArr2[9]);
        long j22 = jArr2[9];
        long j23 = (j4 * j22) + (j8 * j16);
        long j24 = j23 + j23 + (j12 * j12) + (j10 * j14) + (j6 * j20);
        long j25 = (j12 * j14) + (j10 * j16) + (j8 * j20) + (j6 * j22);
        long j26 = (j8 * j22) + (j12 * j16);
        long j27 = j26 + j26 + (j10 * j20);
        long j28 = (j14 * j16) + (j12 * j20) + (j10 * j22);
        long j29 = (j16 * j16) + (j14 * j20) + ((j12 + j12) * j22);
        long j30 = (j14 * j22) + (j16 * j20);
        long[] jArr3 = {j * j, jArr2[1] * j3, j5 + j5, j7 + j7, j9 + (j3 * jArr2[4]), j11 + j11, j13 + j13, j15 + j15, j19 + (j10 * j10), j21 + j21, j24 + j24, j25 + j25, j27 + j27 + (j14 * j14), j28 + j28, j29 + j29, j30 + j30, (j16 * 4 * j22) + (j20 * j20), (j20 + j20) * j22, (j22 + j22) * j22};
        o(jArr3);
        n(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] s(long[] jArr) {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        long j3;
        int i6;
        int i7;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i8 = 0;
        while (true) {
            if (i8 >= 2) {
                break;
            }
            int i9 = 0;
            while (i9 < 9) {
                long j4 = copyOf[i9];
                copyOf[i9] = j4 + (i7 << i6);
                i9++;
                copyOf[i9] = copyOf[i9] - (-((int) (((j4 >> 31) & j4) >> X[i9 & 1])));
            }
            long j5 = copyOf[9];
            int i10 = -((int) (((j5 >> 31) & j5) >> 25));
            copyOf[9] = j5 + (i10 << 25);
            copyOf[0] = copyOf[0] - (i10 * 19);
            i8++;
        }
        long j6 = copyOf[0];
        copyOf[0] = j6 + (i2 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j6 >> 31) & j6) >> 26)));
        int i11 = 0;
        for (i = 2; i11 < i; i = 2) {
            int i12 = 0;
            while (i12 < 9) {
                int i13 = i12 & 1;
                copyOf[i12] = W[i13] & copyOf[i12];
                i12++;
                copyOf[i12] = copyOf[i12] + ((int) (j3 >> X[i13]));
            }
            i11++;
        }
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[0] = copyOf[0] + (((int) (j >> 25)) * 19);
        int i14 = ((((int) j2) - 67108845) >> 31) ^ (-1);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = (W[i15 & 1] ^ ((int) copyOf[i15])) ^ (-1);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 + i20)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i14);
        long j7 = 33554431 & i14;
        copyOf[1] = copyOf[1] - j7;
        for (int i21 = 2; i21 < 10; i21 += 2) {
            copyOf[i21] = copyOf[i21] - (67108863 & i14);
            int i22 = i21 + 1;
            copyOf[i22] = copyOf[i22] - j7;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            copyOf[i23] = copyOf[i23] << V[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = 0; i24 < 10; i24++) {
            int i25 = U[i24];
            long j8 = copyOf[i24];
            bArr[i25] = (byte) (bArr[i25] | (j8 & 255));
            bArr[i25 + 1] = (byte) (bArr[i3] | ((j8 >> 8) & 255));
            bArr[i25 + 2] = (byte) (bArr[i4] | ((j8 >> 16) & 255));
            bArr[i25 + 3] = (byte) (bArr[i5] | ((j8 >> 24) & 255));
        }
        return bArr;
    }

    @Override // defpackage.jc0
    public void a() {
    }

    @Override // defpackage.wj2
    public Object b(JSONObject jSONObject) {
        return new tq2(jSONObject);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((p31.a) obj).getClass();
    }

    @Override // defpackage.ot4
    public /* synthetic */ Iterator f(vw2 vw2Var, CharSequence charSequence) {
        return new lt4(vw2Var, charSequence);
    }
}