package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import defpackage.o40;
import defpackage.oe0;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: vj  reason: default package */
public class vj implements ne5, hc5, wg3 {
    public static final int[] P = {Integer.MAX_VALUE, -1, -1, -1, -1};
    public static final int[] Q = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] R = {-1, -1073741826, -1, -1, -1, 1, 1};
    public static final int[] S = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final j33 T = new j33(1);
    public static final /* synthetic */ vj U = new vj();
    public static final pg2 V = new pg2(4);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r13 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(int[] iArr, int i) {
        if (i != 0) {
            long j = i & 4294967295L;
            int i2 = 0;
            long j2 = (j * ((-2147483647) & 4294967295L)) + (iArr[0] & 4294967295L) + 0;
            iArr[0] = (int) j2;
            long j3 = (j2 >>> 32) + (4294967295L & iArr[1]);
            iArr[1] = (int) j3;
            if ((j3 >>> 32) != 0) {
                i2 = z61.c0(5, 2, iArr);
            }
        }
        if (iArr[4] != -1 || !z61.V(iArr, P)) {
            return;
        }
        z61.u(5, -2147483647, iArr);
    }

    public static void B(View view, o40 o40Var) {
        boolean z;
        go goVar = o40Var.P.b;
        if (goVar != null && goVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += a41.e((View) parent);
            }
            o40.b bVar = o40Var.P;
            if (bVar.m != f) {
                bVar.m = f;
                o40Var.l();
            }
        }
    }

    public static void C(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        z61.c1(iArr, iArr3);
        y(iArr3, iArr2);
    }

    public static void D(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        z61.c1(iArr, iArr3);
        while (true) {
            y(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.c1(iArr2, iArr3);
        }
    }

    public static void E(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        t(jArr, jArr3);
        while (true) {
            z(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            t(jArr2, jArr3);
        }
    }

    public static void F(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.k1(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - (4294967295L & (-2147483647));
            iArr3[0] = (int) j;
            if ((j >> 32) == 0) {
                return;
            }
            z61.z(5, 1, iArr3);
        }
    }

    public static byte[] G(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static boolean H(mk1 mk1Var, boolean z) {
        boolean z2;
        long i = mk1Var.i();
        long j = -1;
        long j2 = 4096;
        if (i != -1 && i <= 4096) {
            j2 = i;
        }
        kh4 kh4Var = new kh4(64);
        int i2 = (int) j2;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < i2) {
            kh4Var.b(8);
            if (!mk1Var.B(kh4Var.a, 0, 8, true)) {
                break;
            }
            long u = kh4Var.u();
            int i4 = kh4Var.i();
            int i5 = 16;
            if (u == 1) {
                mk1Var.z(kh4Var.a, 8, 8);
                kh4Var.d(16);
                u = kh4Var.t();
            } else {
                if (u == 0) {
                    long i6 = mk1Var.i();
                    if (i6 != j) {
                        u = 8 + (i6 - mk1Var.b());
                    }
                }
                i5 = 8;
            }
            long j3 = i5;
            if (u < j3) {
                return false;
            }
            i3 += i5;
            if (i4 == 1836019574) {
                i2 += (int) u;
                if (i != -1 && i2 > i) {
                    i2 = (int) i;
                }
                j = -1;
            } else if (i4 != 1836019558 && i4 != 1836475768) {
                long j4 = i;
                long j5 = u;
                if ((i3 + u) - j3 >= i2) {
                    break;
                }
                int i7 = (int) (j5 - j3);
                i3 += i7;
                if (i4 == 1718909296) {
                    if (i7 < 8) {
                        return false;
                    }
                    kh4Var.b(i7);
                    mk1Var.z(kh4Var.a, 0, i7);
                    int i8 = i7 >> 2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        if (i9 == 1) {
                            kh4Var.f(4);
                        } else {
                            int i10 = kh4Var.i();
                            if ((i10 >>> 8) != 3368816) {
                                if (i10 == 1751476579) {
                                    i10 = 1751476579;
                                }
                                int[] iArr = S;
                                for (int i11 = 0; i11 < 29; i11++) {
                                    if (iArr[i11] != i10) {
                                    }
                                }
                                continue;
                            }
                            z3 = true;
                            break;
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i7 != 0) {
                    mk1Var.v(i7);
                }
                j = -1;
                i = j4;
            } else {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (!z3 || z != z2) {
            return false;
        }
        return true;
    }

    public static void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void f(z91 z91Var) {
        if (!z91Var.l) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public static void g(Object obj, StringBuilder sb) {
        String hexString;
        int lastIndexOf;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    public static long h(byte[] bArr, int i) {
        if (bArr != null) {
            long j = 0;
            for (int i2 = 0; i2 < 0 + i; i2++) {
                j = (j << 8) | (bArr[i2] & 255);
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    public static void i(z91 z91Var) {
        if (z91Var.k) {
            f(z91Var);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    public static byte[] j(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = bArr[i];
            }
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    public static byte[][] k(byte[][] bArr) {
        if (q(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][i2] = bArr3[i2];
                    i2++;
                }
            }
        }
        return bArr2;
    }

    public static final void l(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            if (th != th2) {
                pe0.a.getClass();
                Method method = oe0.a.a;
                if (method != null) {
                    method.invoke(th, th2);
                }
            }
        }
    }

    public static void m(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    public static ga1 n(int i) {
        if (i != 0) {
            if (i != 1) {
                return new km0();
            }
            return new sh();
        }
        return new km0();
    }

    public static byte[] o(byte[] bArr, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i + i2 <= bArr.length) {
                    byte[] bArr2 = new byte[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        bArr2[i3] = bArr[i + i3];
                    }
                    return bArr2;
                }
                throw new IllegalArgumentException("offset + length must not be greater then size of source array");
            }
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        throw new IllegalArgumentException("offset hast to be >= 0");
    }

    public static void p(z91 z91Var) {
        boolean z;
        if (dd0.NATIVE == z91Var.g.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    public static boolean q(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = 144115188075855871L & j4;
        long[] jArr4 = new long[6];
        s(j3, j6, jArr4, 0);
        s(j2, j5, jArr4, 2);
        s(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void s(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j3 << 1;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void t(long[] jArr, long[] jArr2) {
        ar.f(0, jArr[0], jArr2);
        ar.f(2, jArr[1], jArr2);
    }

    public static boolean u(long j, int i) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        z61.A0(iArr, iArr2, iArr4);
        y(iArr4, iArr3);
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        r(jArr, jArr2, jArr4);
        z(jArr4, jArr3);
    }

    public static boolean x(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static void y(int[] iArr, int[] iArr2) {
        long j = iArr[5] & 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        long j3 = iArr[7] & 4294967295L;
        long j4 = iArr[8] & 4294967295L;
        long j5 = iArr[9] & 4294967295L;
        long j6 = (iArr[0] & 4294967295L) + j + (j << 31) + 0;
        iArr2[0] = (int) j6;
        long j7 = (iArr[1] & 4294967295L) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = (iArr[2] & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (iArr[3] & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = (4294967295L & iArr[4]) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[4] = (int) j10;
        A(iArr2, (int) (j10 >>> 32));
    }

    public static void z(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    @Override // defpackage.hc5
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((qf3) obj).a();
    }
}