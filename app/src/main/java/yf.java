package defpackage;

import android.net.Uri;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: yf  reason: default package */
public final class yf implements ta0, pk1, o55, iu5 {
    public static final int[] P = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] Q = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};
    public static final z92 R = new z92(0);
    public static final /* synthetic */ yf S = new yf();
    public static final o53 T = new o53(0);
    public static final mi4 U = new mi4(0);
    public static final /* synthetic */ yf V = new yf();
    public static final /* synthetic */ yf W = new yf();

    public static void b(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = ((iArr[2] & 4294967295L) - 1) + j2;
        iArr[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + 1 + (j4 >> 32);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + j6);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        z61.D0(iArr, iArr2, iArr4);
        g(iArr4, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        long j = iArr[8] & 4294967295L;
        long j2 = iArr[9] & 4294967295L;
        long j3 = iArr[10] & 4294967295L;
        long j4 = iArr[11] & 4294967295L;
        long j5 = iArr[12] & 4294967295L;
        long j6 = iArr[13] & 4294967295L;
        long j7 = iArr[14] & 4294967295L;
        long j8 = iArr[15] & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = (iArr[0] & 4294967295L) + j13 + j6 + j7 + j8 + 0;
        iArr2[0] = (int) j14;
        long j15 = (((iArr[1] & 4294967295L) + j13) - j) + j7 + j8 + (j14 >> 32);
        iArr2[1] = (int) j15;
        long j16 = ((iArr[2] & 4294967295L) - j12) + (j15 >> 32);
        iArr2[2] = (int) j16;
        long j17 = ((((iArr[3] & 4294967295L) + j13) - j2) - j3) + j6 + (j16 >> 32);
        iArr2[3] = (int) j17;
        long j18 = ((((iArr[4] & 4294967295L) + j13) - j9) - j) + j7 + (j17 >> 32);
        iArr2[4] = (int) j18;
        long j19 = (iArr[5] & 4294967295L) + j11 + j3 + (j18 >> 32);
        iArr2[5] = (int) j19;
        long j20 = (iArr[6] & 4294967295L) + j4 + j7 + j8 + (j19 >> 32);
        iArr2[6] = (int) j20;
        long j21 = (4294967295L & iArr[7]) + j13 + j11 + j5 + (j20 >> 32);
        iArr2[7] = (int) j21;
        h(iArr2, (int) (j21 >> 32));
    }

    public static void h(int[] iArr, int i) {
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
            long j6 = ((iArr[2] & 4294967295L) - j2) + j4;
            iArr[2] = (int) j6;
            long j7 = (iArr[3] & 4294967295L) + j2 + (j6 >> 32);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = (4294967295L & iArr[7]) + j2 + j8;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && z61.Y(iArr, P))) {
            b(iArr);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        g(iArr3, iArr2);
    }

    public static void j(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        while (true) {
            g(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.f1(iArr2, iArr3);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.o1(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = (iArr3[2] & 4294967295L) + 1 + j2;
            iArr3[2] = (int) j4;
            long j5 = ((iArr3[3] & 4294967295L) - 1) + (j4 >> 32);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (iArr3[6] & 4294967295L);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & iArr3[7]) - 1) + j6);
        }
    }

    @Override // defpackage.pk1
    public /* synthetic */ lk1[] a(Uri uri, Map map) {
        int i = ok1.a;
        int i2 = l03.l0;
        return new lk1[]{new vq1(), new op1()};
    }

    @Override // defpackage.o55
    public ja c(r65 r65Var) {
        q15 q15Var;
        f65 f65Var = s15.a;
        if (((p65) r65Var).a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                w85 z = w85.z(((p65) r65Var).c, ud5.c);
                if (z.w() == 0) {
                    int o = z.B().o();
                    if (o != 16 && o != 24 && o != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(o)));
                    }
                    Integer valueOf = Integer.valueOf(o);
                    int w = z.A().w();
                    if (w != 12 && w != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(w)));
                    }
                    Integer valueOf2 = Integer.valueOf(w);
                    Integer num = 16;
                    int i = ((p65) r65Var).e;
                    int b = cm0.b(i);
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 4) {
                                    int a = e1.a(i);
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a);
                                }
                            } else {
                                q15Var = q15.d;
                            }
                        }
                        q15Var = q15.c;
                    } else {
                        q15Var = q15.b;
                    }
                    if (valueOf != null) {
                        if (valueOf2 != null) {
                            if (num != null) {
                                int intValue = valueOf.intValue();
                                int intValue2 = valueOf2.intValue();
                                num.intValue();
                                r15 r15Var = new r15(intValue, intValue2, q15Var);
                                k15 k15Var = new k15();
                                k15Var.a = r15Var;
                                k15Var.b = ee4.d(z.B().g());
                                k15Var.c = ((p65) r65Var).f;
                                return k15Var.a();
                            }
                            throw new GeneralSecurityException("Tag size is not set");
                        }
                        throw new GeneralSecurityException("IV size is not set");
                    }
                    throw new GeneralSecurityException("Key size is not set");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (te5 unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
    }

    @Override // defpackage.ta0
    public Object d() {
        return new ArrayDeque();
    }

    @Override // defpackage.iu5
    public int e(Object obj) {
        Pattern pattern = lu5.a;
        String str = ((pt5) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (zn4.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}