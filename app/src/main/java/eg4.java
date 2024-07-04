package defpackage;

import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: eg4  reason: default package */
public final class eg4 implements wy4, ex2, ne5 {
    public static final int[] P = {-4553, -2, -1, -1, -1, -1};
    public static final int[] Q = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    public static final int[] R = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public /* synthetic */ eg4() {
    }

    public /* synthetic */ eg4(int i) {
    }

    public static final sl0 a(Throwable th) {
        hy.e("exception", th);
        return new sl0(th);
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        z61.B0(iArr, iArr2, iArr4);
        c(iArr4, iArr3);
    }

    public static void c(int[] iArr, int[] iArr2) {
        int c0;
        long j = 4553 & 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        long j3 = (j * j2) + (iArr[0] & 4294967295L) + 0;
        int i = (int) j3;
        iArr2[0] = i;
        long j4 = iArr[7] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr2[1] = i2;
        long j6 = iArr[8] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr2[2] = i3;
        long j8 = iArr[9] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i4 = (int) j9;
        iArr2[3] = i4;
        long j10 = iArr[10] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[11] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = (j13 >>> 32) + j12;
        long j15 = j14 & 4294967295L;
        long j16 = (j * j15) + (i & 4294967295L) + 0;
        iArr2[0] = (int) j16;
        long j17 = j14 >>> 32;
        long j18 = (j * j17) + j15 + (i2 & 4294967295L) + (j16 >>> 32);
        iArr2[1] = (int) j18;
        long j19 = j17 + (i3 & 4294967295L) + (j18 >>> 32);
        iArr2[2] = (int) j19;
        long j20 = (j19 >>> 32) + (4294967295L & i4);
        iArr2[3] = (int) j20;
        if ((j20 >>> 32) == 0) {
            c0 = 0;
        } else {
            c0 = z61.c0(6, 4, iArr2);
        }
        if (c0 != 0 || (iArr2[5] == -1 && z61.W(iArr2, P))) {
            z61.f(6, 4553, iArr2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r15 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(int[] iArr, int i) {
        if (i != 0) {
            long j = i & 4294967295L;
            int i2 = 0;
            long j2 = ((4553 & 4294967295L) * j) + (iArr[0] & 4294967295L) + 0;
            iArr[0] = (int) j2;
            long j3 = j + (iArr[1] & 4294967295L) + (j2 >>> 32);
            iArr[1] = (int) j3;
            long j4 = (j3 >>> 32) + (4294967295L & iArr[2]);
            iArr[2] = (int) j4;
            if ((j4 >>> 32) != 0) {
                i2 = z61.c0(6, 3, iArr);
            }
        }
        if (iArr[5] != -1 || !z61.W(iArr, P)) {
            return;
        }
        z61.f(6, 4553, iArr);
    }

    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        z61.d1(iArr, iArr3);
        c(iArr3, iArr2);
    }

    public static void i(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        z61.d1(iArr, iArr3);
        while (true) {
            c(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.d1(iArr2, iArr3);
        }
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.m1(iArr, iArr2, iArr3) != 0) {
            z61.p1(6, 4553, iArr3);
        }
    }

    public static final void k(Object obj) {
        if (obj instanceof sl0) {
            throw ((sl0) obj).P;
        }
    }

    public static int l(int i, kh4 kh4Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return kh4Var.n() + 1;
            case 7:
                return kh4Var.q() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static String m(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static void n(String str) {
        if (((Boolean) vb2.a.d()).booleanValue()) {
            sv2.b(str);
        }
    }

    public static byte[] o(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static boolean q(kh4 kh4Var, tk1 tk1Var, int i, qk1 qk1Var) {
        boolean z;
        boolean z2;
        int l;
        long u = kh4Var.u();
        long j = u >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        long j2 = u >> 12;
        long j3 = u >> 8;
        long j4 = u >> 4;
        long j5 = u >> 1;
        long j6 = u & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != tk1Var.g - 1) {
                return false;
            }
        } else if (i2 > 10 || tk1Var.g != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 == 0 || i3 == tk1Var.i) && j6 != 1) {
            try {
                long w = kh4Var.w();
                if (!z) {
                    w *= tk1Var.b;
                }
                qk1Var.a = w;
                z2 = true;
            } catch (NumberFormatException unused) {
                z2 = false;
            }
            if (z2 && (l = l((int) (j2 & 15), kh4Var)) != -1 && l <= tk1Var.b) {
                int i4 = tk1Var.e;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 <= 11) {
                        if (i5 != tk1Var.f) {
                            return false;
                        }
                    } else if (i5 == 12) {
                        if (kh4Var.n() * 1000 != i4) {
                            return false;
                        }
                    } else if (i5 <= 14) {
                        int q = kh4Var.q();
                        if (i5 == 14) {
                            q *= 10;
                        }
                        if (q != i4) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                int n = kh4Var.n();
                int i6 = kh4Var.b;
                byte[] bArr = kh4Var.a;
                int i7 = i6 - 1;
                int i8 = 0;
                for (int i9 = kh4Var.b; i9 < i7; i9++) {
                    i8 = zn4.l[i8 ^ (bArr[i9] & 255)];
                }
                int i10 = zn4.a;
                if (n == i8) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ex2
    public void e(Object obj) {
        vz3.k("Ending javascript session.");
        tj2 tj2Var = (tj2) ((sj2) obj);
        Iterator it = tj2Var.Q.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            vz3.k("Unregistering eventhandler: ".concat(String.valueOf(((mg2) simpleEntry.getValue()).toString())));
            tj2Var.P.n((String) simpleEntry.getKey(), (mg2) simpleEntry.getValue());
        }
        tj2Var.Q.clear();
    }

    @Override // defpackage.wy4
    public /* synthetic */ void f(@NullableDecl Object obj) {
        Void r1 = (Void) obj;
        vz3.k("Notification of cache hit successful.");
    }

    @Override // defpackage.wy4
    public void h(Throwable th) {
        vz3.k("Notification of cache hit failed.");
    }
}