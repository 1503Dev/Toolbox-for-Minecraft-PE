package defpackage;

import android.content.Context;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: v32  reason: default package */
public final class v32 implements hr5, k16, wg3, bl4, wj3 {
    public static final int[] P = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] Q = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] R = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};
    public static final /* synthetic */ v32 S = new v32();
    public static final /* synthetic */ v32 T = new v32();
    public static final pg3 U = new pg3(1);
    public static final /* synthetic */ v32 V = new v32();
    public static final /* synthetic */ v32 W = new v32();

    public /* synthetic */ v32() {
    }

    public /* synthetic */ v32(int i) {
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.d(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && z61.X(iArr3, P))) {
            d(iArr3);
        }
    }

    public static void d(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (4294967295L & iArr[3]) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            z61.b0(7, 4, iArr);
        }
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        z61.C0(iArr, iArr2, iArr4);
        g(iArr4, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        long j = iArr[10] & 4294967295L;
        long j2 = iArr[11] & 4294967295L;
        long j3 = iArr[12] & 4294967295L;
        long j4 = iArr[13] & 4294967295L;
        long j5 = ((iArr[7] & 4294967295L) + j2) - 1;
        long j6 = (iArr[8] & 4294967295L) + j3;
        long j7 = (iArr[9] & 4294967295L) + j4;
        long j8 = ((iArr[0] & 4294967295L) - j5) + 0;
        long j9 = j8 & 4294967295L;
        long j10 = ((iArr[1] & 4294967295L) - j6) + (j8 >> 32);
        int i = (int) j10;
        iArr2[1] = i;
        long j11 = ((iArr[2] & 4294967295L) - j7) + (j10 >> 32);
        int i2 = (int) j11;
        iArr2[2] = i2;
        long j12 = (((iArr[3] & 4294967295L) + j5) - j) + (j11 >> 32);
        long j13 = (((iArr[4] & 4294967295L) + j6) - j2) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = (((iArr[5] & 4294967295L) + j7) - j3) + (j13 >> 32);
        iArr2[5] = (int) j14;
        long j15 = (((iArr[6] & 4294967295L) + j) - j4) + (j14 >> 32);
        iArr2[6] = (int) j15;
        long j16 = (j15 >> 32) + 1;
        long j17 = (j12 & 4294967295L) + j16;
        long j18 = j9 - j16;
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (i & 4294967295L);
            iArr2[1] = (int) j20;
            long j21 = (j20 >> 32) + (4294967295L & i2);
            iArr2[2] = (int) j21;
            j17 += j21 >> 32;
        }
        iArr2[3] = (int) j17;
        if (((j17 >> 32) == 0 || z61.b0(7, 4, iArr2) == 0) && !(iArr2[6] == -1 && z61.X(iArr2, P))) {
            return;
        }
        d(iArr2);
    }

    public static void h(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = ((iArr[0] & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & iArr[3]) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || z61.b0(7, 4, iArr) == 0) && !(iArr[6] == -1 && z61.X(iArr, P))) {
            return;
        }
        d(iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        z61.e1(iArr, iArr3);
        g(iArr3, iArr2);
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.n1(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = ((4294967295L & iArr3[3]) - 1) + j2;
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                z61.z(7, 4, iArr3);
            }
        }
    }

    public static int k(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static long l(long j, int i) {
        return i == 1 ? j : (i & 1) == 0 ? l((j * j) % 1073807359, i >> 1) % 1073807359 : ((l((j * j) % 1073807359, i >> 1) % 1073807359) * j) % 1073807359;
    }

    public static byte[] m(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            int i = 0;
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i2 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i2;
            copyOf[31] = (byte) (i2 | 64);
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i3 = 0; i3 < 7; i3++) {
                    byte[][] bArr3 = zb5.a;
                    if (MessageDigest.isEqual(bArr3[i3], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(mh.z(bArr3[i3])));
                    }
                }
                long[] jArr2 = new long[10];
                int i4 = 0;
                for (int i5 = 10; i4 < i5; i5 = 10) {
                    int i6 = q05.U[i4];
                    byte[] bArr4 = copyOf2;
                    jArr2[i4] = ((((((copyOf2[i6 + 1] & 255) << 8) | (copyOf2[i6] & 255)) | ((copyOf2[i6 + 2] & 255) << 16)) | ((copyOf2[i6 + 3] & 255) << 24)) >> q05.V[i4]) & q05.W[i4 & 1];
                    i4++;
                    copyOf2 = bArr4;
                }
                long[] jArr3 = new long[19];
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                jArr5[0] = 1;
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                long[] jArr8 = new long[19];
                jArr8[0] = 1;
                long[] jArr9 = new long[19];
                long[] jArr10 = new long[19];
                jArr10[0] = 1;
                System.arraycopy(jArr2, 0, jArr3, 0, 10);
                int i7 = 0;
                while (i7 < 32) {
                    int i8 = copyOf[(32 - i7) - 1] & 255;
                    int i9 = 8;
                    while (i < i9) {
                        int i10 = (i8 >> (7 - i)) & 1;
                        zb5.a(i10, jArr5, jArr3);
                        zb5.a(i10, jArr6, jArr4);
                        byte[] bArr5 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr5, 10);
                        int i11 = i8;
                        long[] jArr11 = new long[19];
                        long[] jArr12 = jArr;
                        long[] jArr13 = new long[19];
                        int i12 = i7;
                        long[] jArr14 = new long[19];
                        int i13 = i;
                        long[] jArr15 = new long[19];
                        long[] jArr16 = new long[19];
                        long[] jArr17 = jArr10;
                        long[] jArr18 = new long[19];
                        long[] jArr19 = new long[19];
                        q05.r(jArr5, jArr5, jArr6);
                        q05.q(jArr6, copyOf3, jArr6);
                        long[] copyOf4 = Arrays.copyOf(jArr3, 10);
                        q05.r(jArr3, jArr3, jArr4);
                        q05.q(jArr4, copyOf4, jArr4);
                        q05.l(jArr15, jArr3, jArr6);
                        q05.l(jArr16, jArr5, jArr4);
                        q05.o(jArr15);
                        q05.n(jArr15);
                        q05.o(jArr16);
                        q05.n(jArr16);
                        long[] jArr20 = jArr3;
                        System.arraycopy(jArr15, 0, copyOf4, 0, 10);
                        q05.r(jArr15, jArr15, jArr16);
                        q05.q(jArr16, copyOf4, jArr16);
                        q05.p(jArr19, jArr15);
                        q05.p(jArr18, jArr16);
                        q05.l(jArr16, jArr18, jArr2);
                        q05.o(jArr16);
                        q05.n(jArr16);
                        System.arraycopy(jArr19, 0, jArr7, 0, 10);
                        System.arraycopy(jArr16, 0, jArr8, 0, 10);
                        q05.p(jArr13, jArr5);
                        q05.p(jArr14, jArr6);
                        q05.l(jArr9, jArr13, jArr14);
                        q05.o(jArr9);
                        q05.n(jArr9);
                        q05.q(jArr14, jArr13, jArr14);
                        Arrays.fill(jArr11, 10, 18, 0L);
                        int i14 = 0;
                        for (int i15 = 10; i14 < i15; i15 = 10) {
                            jArr11[i14] = jArr14[i14] * 121665;
                            i14++;
                        }
                        q05.n(jArr11);
                        q05.r(jArr11, jArr11, jArr13);
                        q05.l(jArr17, jArr14, jArr11);
                        q05.o(jArr17);
                        q05.n(jArr17);
                        zb5.a(i10, jArr9, jArr7);
                        zb5.a(i10, jArr17, jArr8);
                        i = i13 + 1;
                        jArr3 = jArr7;
                        i8 = i11;
                        copyOf = bArr5;
                        jArr = jArr12;
                        i7 = i12;
                        jArr7 = jArr20;
                        i9 = 8;
                        long[] jArr21 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr21;
                        long[] jArr22 = jArr9;
                        jArr9 = jArr5;
                        jArr5 = jArr22;
                        jArr10 = jArr6;
                        jArr6 = jArr17;
                    }
                    i7++;
                    i = 0;
                }
                long[] jArr23 = jArr;
                long[] jArr24 = new long[10];
                long[] jArr25 = new long[10];
                long[] jArr26 = new long[10];
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = jArr3;
                long[] jArr35 = new long[10];
                q05.p(jArr25, jArr6);
                q05.p(jArr35, jArr25);
                q05.p(jArr33, jArr35);
                q05.i(jArr26, jArr33, jArr6);
                q05.i(jArr27, jArr26, jArr25);
                q05.p(jArr33, jArr27);
                q05.i(jArr28, jArr33, jArr26);
                q05.p(jArr33, jArr28);
                q05.p(jArr35, jArr33);
                q05.p(jArr33, jArr35);
                q05.p(jArr35, jArr33);
                q05.p(jArr33, jArr35);
                q05.i(jArr29, jArr33, jArr28);
                q05.p(jArr33, jArr29);
                q05.p(jArr35, jArr33);
                for (int i16 = 2; i16 < 10; i16 += 2) {
                    q05.p(jArr33, jArr35);
                    q05.p(jArr35, jArr33);
                }
                q05.i(jArr30, jArr35, jArr29);
                q05.p(jArr33, jArr30);
                q05.p(jArr35, jArr33);
                for (int i17 = 2; i17 < 20; i17 += 2) {
                    q05.p(jArr33, jArr35);
                    q05.p(jArr35, jArr33);
                }
                q05.i(jArr33, jArr35, jArr30);
                q05.p(jArr35, jArr33);
                q05.p(jArr33, jArr35);
                for (int i18 = 2; i18 < 10; i18 += 2) {
                    q05.p(jArr35, jArr33);
                    q05.p(jArr33, jArr35);
                }
                q05.i(jArr31, jArr33, jArr29);
                q05.p(jArr33, jArr31);
                q05.p(jArr35, jArr33);
                for (int i19 = 2; i19 < 50; i19 += 2) {
                    q05.p(jArr33, jArr35);
                    q05.p(jArr35, jArr33);
                }
                q05.i(jArr32, jArr35, jArr31);
                q05.p(jArr35, jArr32);
                q05.p(jArr33, jArr35);
                for (int i20 = 2; i20 < 100; i20 += 2) {
                    q05.p(jArr35, jArr33);
                    q05.p(jArr33, jArr35);
                }
                q05.i(jArr35, jArr33, jArr32);
                q05.p(jArr33, jArr35);
                q05.p(jArr35, jArr33);
                for (int i21 = 2; i21 < 50; i21 += 2) {
                    q05.p(jArr33, jArr35);
                    q05.p(jArr35, jArr33);
                }
                q05.i(jArr33, jArr35, jArr31);
                q05.p(jArr35, jArr33);
                q05.p(jArr33, jArr35);
                q05.p(jArr35, jArr33);
                q05.p(jArr33, jArr35);
                q05.p(jArr35, jArr33);
                q05.i(jArr24, jArr35, jArr27);
                q05.i(jArr23, jArr5, jArr24);
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[10];
                long[] jArr38 = new long[11];
                long[] jArr39 = new long[11];
                long[] jArr40 = new long[11];
                q05.i(jArr36, jArr2, jArr23);
                q05.r(jArr37, jArr2, jArr23);
                long[] jArr41 = new long[10];
                jArr41[0] = 486662;
                q05.r(jArr39, jArr37, jArr41);
                q05.i(jArr39, jArr39, jArr4);
                q05.r(jArr39, jArr39, jArr34);
                q05.i(jArr39, jArr39, jArr36);
                q05.i(jArr39, jArr39, jArr34);
                for (int i22 = 0; i22 < 10; i22++) {
                    jArr38[i22] = jArr39[i22] * 4;
                }
                q05.n(jArr38);
                q05.i(jArr39, jArr36, jArr4);
                q05.q(jArr39, jArr39, jArr4);
                q05.i(jArr40, jArr37, jArr34);
                q05.r(jArr39, jArr39, jArr40);
                q05.p(jArr39, jArr39);
                if (MessageDigest.isEqual(q05.s(jArr38), q05.s(jArr39))) {
                    return q05.s(jArr23);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(mh.z(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static int n(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    public static String o(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            sv2.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void p(qi2 qi2Var, String str, JSONObject jSONObject) {
        StringBuilder b = sd1.b("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        sv2.b("Dispatching AFMA event: ".concat(b.toString()));
        qi2Var.m(b.toString());
    }

    public static byte[] q() {
        byte[] a = oc5.a(32);
        a[0] = (byte) (a[0] | 7);
        int i = a[31] & 63;
        a[31] = (byte) i;
        a[31] = (byte) (i | 128);
        return a;
    }

    public static void r(qi2 qi2Var, String str, String str2) {
        qi2Var.m(str + "(" + str2 + ");");
    }

    public static byte[] s(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static void t(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        u32 u32Var = new u32(j, i2, str);
        if ((priorityQueue.size() != i || (((u32) priorityQueue.peek()).c <= i2 && ((u32) priorityQueue.peek()).a <= j)) && !priorityQueue.contains(u32Var)) {
            priorityQueue.add(u32Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static long u(String[] strArr, int i) {
        long a = (o32.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            a = (((o32.a(strArr[i2]) + 2147483647L) % 1073807359) + ((a * 16785407) % 1073807359)) % 1073807359;
        }
        return a;
    }

    @Override // defpackage.k16
    public long b(long j) {
        return j;
    }

    @Override // defpackage.wj3
    public void c(boolean z, Context context, wd3 wd3Var) {
    }

    @Override // defpackage.bl4
    public Object e(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        vz3.k("Ad request signals:");
        vz3.k(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((ae3) obj).n();
    }
}