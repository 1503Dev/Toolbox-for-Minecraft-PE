package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* renamed from: ea2  reason: default package */
public final class ea2 implements wg3, wj2, ms5 {
    public static yz4 R;
    public static final char[] P = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final long[] Q = {2791191049453778211L, 2791191049453778402L, 6};
    public static final /* synthetic */ ea2 S = new ea2();
    public static final n53 T = new n53(1);
    public static final /* synthetic */ ea2 U = new ea2();
    public static final /* synthetic */ ea2 V = new ea2();

    public /* synthetic */ ea2() {
    }

    public /* synthetic */ ea2(int i) {
    }

    public static void A(l02 l02Var) {
        Method b;
        if (R != null) {
            return;
        }
        String str = (String) w82.d.c.a(x92.C2);
        if (str == null || str.length() == 0) {
            str = null;
            if (l02Var != null && (b = l02Var.b("hunjs8A/5DNYOOAMFalGgcT5i4IxfyPvlvtXNFOaD034Wz4GSxVvrwBSs7k+Xuhr", "SWC7heB+iJvjMtyDTDnMRbHSVyBQ/kwwuxCjVwpzEBg=")) != null) {
                str = (String) b.invoke(null, new Object[0]);
            }
            if (str == null) {
                return;
            }
        }
        try {
            m05 d = q05.d(ty1.a(str, true));
            s45.h();
            x05.g(u45.a);
            R = (yz4) d.c(yz4.class);
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
    }

    public static void B(la2 la2Var, ja2 ja2Var, String... strArr) {
        if (ja2Var == null) {
            return;
        }
        jv5.A.j.getClass();
        la2Var.c(ja2Var, SystemClock.elapsedRealtime(), strArr);
    }

    public static boolean C(int i) {
        Boolean bool;
        if (i - 1 != 0) {
            if (d45.a()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    d45.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    bool = Boolean.FALSE;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        } else if (!d45.a()) {
            return true;
        } else {
            return false;
        }
    }

    public static byte[] D(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = bArr2;
        long F = (F(bArr, 0) >> 0) & 67108863;
        long F2 = (F(bArr, 3) >> 2) & 67108863 & 67108611;
        long F3 = (F(bArr, 6) >> 4) & 67108863 & 67092735;
        long F4 = (F(bArr, 9) >> 6) & 67108863 & 66076671;
        long F5 = (F(bArr, 12) >> 8) & 67108863 & 1048575;
        int i2 = 17;
        byte[] bArr4 = new byte[17];
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 67108863;
        while (true) {
            int length = bArr3.length;
            if (i3 < length) {
                int min = Math.min(16, length - i3);
                System.arraycopy(bArr3, i3, bArr4, 0, min);
                bArr4[min] = 1;
                if (min != 16) {
                    i = 0;
                    Arrays.fill(bArr4, min + 1, i2, (byte) 0);
                } else {
                    i = 0;
                }
                long j7 = F5 * 5;
                long j8 = F4 * 5;
                long j9 = F3 * 5;
                long F6 = j5 + ((F(bArr4, i) >> i) & j6);
                long F7 = j + ((F(bArr4, 3) >> 2) & j6);
                long F8 = j2 + ((F(bArr4, 6) >> 4) & j6);
                long F9 = j3 + ((F(bArr4, 9) >> 6) & j6);
                long F10 = j4 + (((F(bArr4, 12) >> 8) & j6) | (bArr4[16] << 24));
                long j10 = F8 * F;
                long j11 = F8 * F2;
                long j12 = F9 * F;
                long j13 = F8 * F3;
                long j14 = F9 * F2;
                long j15 = F10 * F;
                long j16 = (F2 * 5 * F10) + (F9 * j9) + (F8 * j8) + (F7 * j7) + (F6 * F);
                j6 = 67108863;
                long j17 = F8 * j7;
                long a = yg.a(j9, F10, (F9 * j8) + j17 + (F6 * F2) + (F7 * F), j16 >> 26);
                long j18 = a >> 26;
                long j19 = F9 * j7;
                long a2 = yg.a(j8, F10, j19 + (F6 * F3) + (F7 * F2) + j10, j18);
                long j20 = a2 >> 26;
                long a3 = yg.a(F10, j7, (F6 * F4) + (F7 * F3) + j11 + j12, j20);
                long j21 = (F6 * F5) + (F7 * F4) + j13 + j14 + j15 + (a3 >> 26);
                long j22 = ((j21 >> 26) * 5) + (j16 & 67108863);
                long j23 = j22 >> 26;
                long j24 = j22 & 67108863;
                j = (a & 67108863) + j23;
                i3 += 16;
                i2 = 17;
                j2 = a2 & 67108863;
                j3 = a3 & 67108863;
                bArr3 = bArr2;
                j4 = j21 & 67108863;
                j5 = j24;
            } else {
                long j25 = j & j6;
                long j26 = j2 + (j >> 26);
                long j27 = j26 & j6;
                long j28 = j3 + (j26 >> 26);
                long j29 = j28 & j6;
                long j30 = j4 + (j28 >> 26);
                long j31 = j30 & j6;
                long j32 = ((j30 >> 26) * 5) + j5;
                long j33 = j32 >> 26;
                long j34 = j32 & j6;
                long j35 = j34 + 5;
                long j36 = j35 & j6;
                long j37 = j25 + j33;
                long j38 = (j35 >> 26) + j37;
                long j39 = j38 >> 26;
                long j40 = j38 & j6;
                long j41 = j39 + j27;
                long j42 = j41 >> 26;
                long j43 = j41 & j6;
                long j44 = j29 + j42;
                long j45 = j44 & j6;
                long j46 = (j31 + (j44 >> 26)) - 67108864;
                long j47 = j46 >> 63;
                long j48 = j47 ^ (-1);
                long j49 = (j37 & j47) | (j40 & j48);
                long j50 = (j27 & j47) | (j43 & j48);
                long j51 = (j29 & j47) | (j45 & j48);
                long F11 = F(bArr, 16) + (((j34 & j47) | (j36 & j48) | (j49 << 26)) & 4294967295L);
                long F12 = F(bArr, 24);
                long F13 = F(bArr, 28) + (((j51 >> 18) | (((j31 & j47) | (j46 & j48)) << 8)) & 4294967295L);
                byte[] bArr5 = new byte[16];
                I(0, F11 & 4294967295L, bArr5);
                long F14 = F(bArr, 20) + (((j49 >> 6) | (j50 << 20)) & 4294967295L) + (F11 >> 32);
                I(4, F14 & 4294967295L, bArr5);
                long j52 = F12 + (((j51 << 14) | (j50 >> 12)) & 4294967295L) + (F14 >> 32);
                I(8, j52 & 4294967295L, bArr5);
                I(12, (F13 + (j52 >> 32)) & 4294967295L, bArr5);
                return bArr5;
            }
        }
    }

    public static byte[] E(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = bArr[i];
                byte b2 = (byte) ((b + b) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static long F(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return (((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static List G(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    public static ArrayList H(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        int i = (bArr[11] & 255) << 8;
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((i | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void I(int i, long j, byte[] bArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static long J(byte b, byte b2) {
        int i = b & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = b2 & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5);
    }

    public static boolean K(byte b) {
        return b > -65;
    }

    public static final Set L(os3 os3Var, yw2 yw2Var) {
        return ((Boolean) rb2.a.d()).booleanValue() ? Collections.singleton(new ii3(os3Var, yw2Var)) : Collections.emptySet();
    }

    public static void a(byte[] bArr, int i, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static int c(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        return ((bArr[i3 + 1] & 255) << 24) | i4 | ((bArr[i3] & 255) << 16);
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static String f(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr2 = P;
            cArr[i] = cArr2[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static rs g(ts tsVar, gf0 gf0Var) {
        int i = tsVar.a;
        int i2 = 1 << i;
        int[] iArr = gf0Var.c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            length = -1;
        }
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, length, i2);
        int[][] iArr3 = (int[][]) Array.newInstance(cls, length, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr4 = iArr3[0];
            int[] iArr5 = gf0Var.c;
            int i4 = gf0Var.b;
            int i5 = iArr5[i4];
            while (true) {
                i4--;
                if (i4 >= 0) {
                    i5 = gf0Var.a.c(i5, i3) ^ gf0Var.c[i4];
                }
            }
            iArr4[i3] = tsVar.a(i5);
        }
        for (int i6 = 1; i6 < length; i6++) {
            for (int i7 = 0; i7 < i2; i7++) {
                iArr3[i6][i7] = tsVar.c(iArr3[i6 - 1][i7], i7);
            }
        }
        for (int i8 = 0; i8 < length; i8++) {
            for (int i9 = 0; i9 < i2; i9++) {
                for (int i10 = 0; i10 <= i8; i10++) {
                    int[] iArr6 = iArr2[i8];
                    iArr6[i9] = tsVar.c(iArr3[i10][i9], gf0Var.d((length + i10) - i8)) ^ iArr6[i9];
                }
            }
        }
        int[][] iArr7 = (int[][]) Array.newInstance(Integer.TYPE, length * i, (i2 + 31) >>> 5);
        for (int i11 = 0; i11 < i2; i11++) {
            int i12 = i11 >>> 5;
            int i13 = 1 << (i11 & 31);
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArr2[i14][i11];
                for (int i16 = 0; i16 < i; i16++) {
                    if (((i15 >>> i16) & 1) != 0) {
                        int[] iArr8 = iArr7[(((i14 + 1) * i) - i16) - 1];
                        iArr8[i12] = iArr8[i12] ^ i13;
                    }
                }
            }
        }
        return new rs(i2, iArr7);
    }

    public static Activity h(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return h(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int i(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static void j(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & 17592186044415L;
        long j4 = ((j2 << 20) ^ (j >>> 44)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j9 = ((j6 >>> 44) ^ (j7 << 20)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
        long[] jArr4 = new long[10];
        m(j5, j10, jArr4, 0);
        m(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        m(j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        m(j5 ^ j13, j10 ^ j14, jArr4, 6);
        m(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = jArr4[9] ^ j17;
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 44);
        long j29 = (j24 ^ j18) ^ (j28 >>> 44);
        long j30 = j28 & 17592186044415L;
        long j31 = ((j26 & 17592186044415L) >>> 1) ^ ((j30 & 1) << 43);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 17592186044415L;
        long j38 = ((j30 >>> 1) ^ ((j29 & 1) << 43)) ^ (j37 >>> 43);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 17592186044415L;
        long j45 = (j44 >>> 43) ^ (j29 >>> 1);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j21;
        long j52 = (j23 ^ j37) ^ j25;
        jArr3[1] = j52;
        long j53 = ((j24 ^ j44) ^ j37) ^ j27;
        jArr3[2] = j53;
        long j54 = j44 ^ j51;
        jArr3[3] = j54;
        long j55 = j51 ^ jArr4[2];
        jArr3[4] = j55;
        long j56 = jArr4[3];
        jArr3[5] = j56;
        jArr3[0] = j21 ^ (j52 << 44);
        jArr3[1] = (j52 >>> 20) ^ (j53 << 24);
        jArr3[2] = ((j53 >>> 40) ^ (j54 << 4)) ^ (j55 << 48);
        jArr3[3] = ((j54 >>> 60) ^ (j56 << 28)) ^ (j55 >>> 16);
        jArr3[4] = j56 >>> 36;
        jArr3[5] = 0;
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 7;
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        j(jArr, jArr4);
        j(jArr2, jArr5);
        int i2 = 0;
        while (i2 < i) {
            long j = jArr5[i2];
            long[] jArr6 = new long[8];
            jArr6[1] = j;
            long j2 = j << 1;
            jArr6[2] = j2;
            long j3 = j2 ^ j;
            jArr6[3] = j3;
            long j4 = j2 << 1;
            jArr6[4] = j4;
            jArr6[5] = j4 ^ j;
            long j5 = j3 << 1;
            jArr6[6] = j5;
            jArr6[i] = j5 ^ j;
            int i3 = 0;
            while (i3 < i) {
                long j6 = jArr4[i3];
                int i4 = (int) j6;
                long j7 = jArr6[i4 & 7] ^ (jArr6[(i4 >>> 3) & i] << 3);
                int i5 = i2;
                int i6 = 54;
                long j8 = 0;
                while (true) {
                    int i7 = (int) (j6 >>> i6);
                    long j9 = jArr6[i7 & 7] ^ (jArr6[(i7 >>> 3) & i] << 3);
                    j7 ^= j9 << i6;
                    j8 ^= j9 >>> (-i6);
                    i6 -= 6;
                    if (i6 <= 0) {
                        break;
                    }
                    i = 7;
                }
                int i8 = i5 + i3;
                jArr3[i8] = jArr3[i8] ^ (j7 & 576460752303423487L);
                int i9 = i8 + 1;
                jArr3[i9] = jArr3[i9] ^ ((j8 << 5) ^ (j7 >>> 59));
                i3++;
                i2 = i5;
                i = 7;
            }
            i2++;
            i = 7;
        }
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2];
        long j13 = jArr3[3];
        long j14 = jArr3[4];
        long j15 = jArr3[5];
        long j16 = jArr3[6];
        long j17 = jArr3[7];
        long j18 = jArr3[8];
        long j19 = jArr3[9];
        long j20 = jArr3[10];
        long j21 = jArr3[11];
        long j22 = jArr3[12];
        long j23 = jArr3[13];
        jArr3[0] = j10 ^ (j11 << 59);
        jArr3[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr3[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr3[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr3[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr3[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr3[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr3[7] = (j17 >>> 35) ^ (j18 << 24);
        jArr3[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr3[9] = (j19 >>> 45) ^ (j20 << 14);
        jArr3[10] = (j20 >>> 50) ^ (j21 << 9);
        jArr3[11] = ((j21 >>> 55) ^ (j22 << 4)) ^ (j23 << 63);
        jArr3[12] = (j22 >>> 60) ^ (j23 >>> 1);
        jArr3[13] = 0;
    }

    public static void m(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j3 << 1;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        long j8 = 0;
        int i3 = 33;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr2[(i4 >>> 9) & 7] << 9) ^ ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6));
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = 17592186044415L & j7;
        jArr[i + 1] = (j7 >>> 44) ^ (j8 << 20);
    }

    public static void n(long[] jArr, long[] jArr2) {
        ar.f(0, jArr[0], jArr2);
        ar.f(2, jArr[1], jArr2);
        int i = ((int) jArr[2]) & 255;
        int i2 = (i | (i << 4)) & 3855;
        int i3 = (i2 | (i2 << 2)) & 13107;
        jArr2[4] = (i3 | (i3 << 1)) & 21845 & 4294967295L;
    }

    public static void o(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            ar.f(i << 1, jArr[i], jArr2);
        }
        jArr2[12] = ar.d((int) jArr[6]);
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        k(jArr, jArr2, jArr4);
        r(jArr4, jArr3);
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        l(jArr, jArr2, jArr4);
        s(jArr4, jArr3);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j10 >>> 56) ^ j8;
        jArr2[2] = 7 & j9;
    }

    public static void s(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j11 = j8 ^ (j9 >>> 2);
        long j12 = jArr[11];
        long j13 = j5 ^ (j12 << 39);
        long j14 = (j6 ^ (j9 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j15 = j10 ^ (j12 >>> 2);
        long j16 = jArr[10];
        long j17 = j4 ^ (j16 << 39);
        long j18 = j13 ^ ((j16 >>> 25) ^ (j16 << 62));
        long j19 = j14 ^ (j16 >>> 2);
        long j20 = jArr[9];
        long j21 = j3 ^ (j20 << 39);
        long j22 = j17 ^ ((j20 >>> 25) ^ (j20 << 62));
        long j23 = j18 ^ (j20 >>> 2);
        long j24 = jArr[8];
        long j25 = j ^ (j11 << 39);
        long j26 = (j21 ^ ((j24 >>> 25) ^ (j24 << 62))) ^ (j11 >>> 2);
        long j27 = j15 >>> 25;
        jArr2[0] = j25 ^ j27;
        long j28 = j27 << 23;
        jArr2[1] = j28 ^ ((j2 ^ (j24 << 39)) ^ ((j11 >>> 25) ^ (j11 << 62)));
        jArr2[2] = j26;
        jArr2[3] = j22 ^ (j24 >>> 2);
        jArr2[4] = j23;
        jArr2[5] = j19;
        jArr2[6] = j15 & 33554431;
    }

    public static void t(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        n(jArr, jArr3);
        while (true) {
            r(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            n(jArr2, jArr3);
        }
    }

    public static void u(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        o(jArr, jArr3);
        while (true) {
            s(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            o(jArr2, jArr3);
        }
    }

    public static byte[] v(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            int i = 0;
            while (i < length) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }

    public static final List w(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    public static lq4 x(Context context, int i, String str, String str2, dp4 dp4Var) {
        lq4 lq4Var;
        int i2;
        hp4 hp4Var = new hp4(context, i, str, str2, dp4Var);
        try {
            lq4Var = (lq4) hp4Var.d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            hp4Var.b(2009, hp4Var.g, e);
            lq4Var = null;
        }
        hp4Var.b(3004, hp4Var.g, null);
        if (lq4Var != null) {
            if (lq4Var.R == 7) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            dp4.e = i2;
        }
        if (lq4Var == null) {
            return new lq4(null, 1, 1);
        }
        return lq4Var;
    }

    public static zr5 y(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zh4 zh4Var = (zh4) it.next();
            if (zh4Var.c) {
                arrayList.add(h3.i);
            } else {
                arrayList.add(new h3(zh4Var.a, zh4Var.b));
            }
        }
        return new zr5(context, (h3[]) arrayList.toArray(new h3[arrayList.size()]));
    }

    public static final void z(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        zy5 zy5Var;
        if (adOverlayInfoParcel.Z == 4 && adOverlayInfoParcel.R == null) {
            vj1 vj1Var = adOverlayInfoParcel.Q;
            if (vj1Var != null) {
                vj1Var.J();
            }
            oi3 oi3Var = adOverlayInfoParcel.n0;
            if (oi3Var != null) {
                oi3Var.w();
            }
            Activity g = adOverlayInfoParcel.S.g();
            tw2 tw2Var = adOverlayInfoParcel.P;
            if (tw2Var != null && tw2Var.Y && g != null) {
                context = g;
            }
            wj1 wj1Var = jv5.A.a;
            b16 b16Var = adOverlayInfoParcel.X;
            if (tw2Var != null) {
                zy5Var = tw2Var.X;
            } else {
                zy5Var = null;
            }
            wj1.b(context, tw2Var, b16Var, zy5Var);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.b0.S);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        boolean z2 = true;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (Build.VERSION.SDK_INT < 21) {
            z2 = false;
        }
        if (!z2) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        cu5 cu5Var = jv5.A.c;
        cu5.l(context, intent);
    }

    @Override // defpackage.wj2
    public Object b(JSONObject jSONObject) {
        return new tq2(jSONObject);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((nd3) obj).o();
    }
}