package defpackage;

import android.util.Log;
import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: ar  reason: default package */
public class ar implements hc5, wg3, bl4, qt4 {
    public static final int[] P = {-977, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] Q = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int[] R = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};
    public static final /* synthetic */ ar S = new ar();
    public static final /* synthetic */ ar T = new ar();
    public static final byte[] U = new byte[0];
    public static final /* synthetic */ ar V = new ar();

    public static int b(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    public static long d(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        int i9 = i7 ^ (i8 ^ (i8 << 1));
        return (((i9 >>> 1) & 1431655765) << 32) | (1431655765 & i9);
    }

    public static void f(int i, long j, long[] jArr) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & 6148914691236517205L;
        jArr[i + 1] = (j11 >>> 1) & 6148914691236517205L;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        z61.D0(iArr, iArr2, iArr4);
        h(iArr4, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j = 977 & 4294967295L;
        long j2 = iArr[8] & 4294967295L;
        long j3 = (j * j2) + (iArr[0] & 4294967295L) + 0;
        int i = (int) j3;
        iArr2[0] = i;
        long j4 = iArr[9] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr2[1] = i2;
        long j6 = iArr[10] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr2[2] = i3;
        long j8 = iArr[11] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i4 = (int) j9;
        iArr2[3] = i4;
        long j10 = iArr[12] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[13] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = iArr[14] & 4294967295L;
        long j15 = (j * j14) + j12 + (iArr[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = iArr[15] & 4294967295L;
        long j17 = (j * j16) + j14 + (iArr[7] & 4294967295L) + (j15 >>> 32);
        iArr2[7] = (int) j17;
        long j18 = (j17 >>> 32) + j16;
        long j19 = j18 & 4294967295L;
        long j20 = (j * j19) + (i & 4294967295L) + 0;
        int i5 = 0;
        iArr2[0] = (int) j20;
        long j21 = j18 >>> 32;
        long j22 = (j * j21) + j19 + (i2 & 4294967295L) + (j20 >>> 32);
        iArr2[1] = (int) j22;
        long j23 = j21 + (i3 & 4294967295L) + (j22 >>> 32);
        iArr2[2] = (int) j23;
        long j24 = (j23 >>> 32) + (4294967295L & i4);
        iArr2[3] = (int) j24;
        if ((j24 >>> 32) != 0) {
            i5 = z61.c0(8, 4, iArr2);
        }
        if (i5 != 0 || (iArr2[7] == -1 && z61.Y(iArr2, P))) {
            z61.f(8, 977, iArr2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r15 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(int[] iArr, int i) {
        if (i != 0) {
            long j = i & 4294967295L;
            int i2 = 0;
            long j2 = ((977 & 4294967295L) * j) + (iArr[0] & 4294967295L) + 0;
            iArr[0] = (int) j2;
            long j3 = j + (iArr[1] & 4294967295L) + (j2 >>> 32);
            iArr[1] = (int) j3;
            long j4 = (j3 >>> 32) + (4294967295L & iArr[2]);
            iArr[2] = (int) j4;
            if ((j4 >>> 32) != 0) {
                i2 = z61.c0(8, 3, iArr);
            }
        }
        if (iArr[7] != -1 || !z61.Y(iArr, P)) {
            return;
        }
        z61.f(8, 977, iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        h(iArr3, iArr2);
    }

    public static void k(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        while (true) {
            h(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.f1(iArr2, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.o1(iArr, iArr2, iArr3) != 0) {
            z61.p1(8, 977, iArr3);
        }
    }

    public static long m(long j) {
        long j2 = ((j >>> 1) ^ j) & 2459565876494606882L;
        long j3 = j ^ (j2 ^ (j2 << 1));
        long j4 = ((j3 >>> 2) ^ j3) & 868082074056920076L;
        long j5 = j3 ^ (j4 ^ (j4 << 2));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 8) ^ j7) & 280375465148160L;
        long j9 = j7 ^ (j8 ^ (j8 << 8));
        long j10 = ((j9 >>> 16) ^ j9) & 4294901760L;
        return j9 ^ (j10 ^ (j10 << 16));
    }

    public static Class n(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static void o(String str, Exception exc) {
        hn4.a.booleanValue();
        Log.e("OMIDLIB", str, exc);
    }

    @Override // defpackage.qt4
    public Object a() {
        return new qk5();
    }

    @Override // defpackage.hc5
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // defpackage.bl4
    public Object e(Object obj) {
        Exception exc = (Exception) obj;
        return "";
    }

    @Override // defpackage.wg3
    /* renamed from: e  reason: collision with other method in class */
    public void mo0e(Object obj) {
        ((bi3) obj).h();
    }
}