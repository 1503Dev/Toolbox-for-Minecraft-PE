package defpackage;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: n42  reason: default package */
public class n42 implements xj2, wg3, o55 {
    public static final int[] P = {-1, -1, -1, 0, 0, 0, 1, -1};
    public static final int[] Q = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};
    public static final z73 R = new z73(0);
    public static final /* synthetic */ n42 S = new n42();
    public static final i33 T = new i33(2);
    public static final pg2 U = new pg2(3);
    public static final mi4 V = new mi4(1);
    public static final /* synthetic */ n42 W = new n42();

    public static void a(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = ((iArr[3] & 4294967295L) - 1) + j2;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = ((iArr[6] & 4294967295L) - 1) + j6;
        iArr[6] = (int) j9;
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + (j9 >> 32));
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int d(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static int g(Context context, String str) {
        int identifier = context.getResources().getIdentifier(ij.c("ic_", str, "_black_24dp"), "drawable", context.getPackageName());
        if (identifier == 0) {
            return 2131230947;
        }
        return identifier;
    }

    public static int h(int i, int i2, int i3) {
        int l = l(i, i3);
        int l2 = l(i2, i3);
        int i4 = 0;
        if (l2 != 0) {
            int d = 1 << d(i3);
            while (l != 0) {
                if (((byte) (l & 1)) == 1) {
                    i4 ^= l2;
                }
                l >>>= 1;
                l2 <<= 1;
                if (l2 >= d) {
                    l2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        z61.D0(iArr, iArr2, iArr4);
        j(iArr4, iArr3);
    }

    public static void j(int[] iArr, int[] iArr2) {
        long j = iArr[9] & 4294967295L;
        long j2 = iArr[10] & 4294967295L;
        long j3 = iArr[11] & 4294967295L;
        long j4 = iArr[12] & 4294967295L;
        long j5 = iArr[13] & 4294967295L;
        long j6 = iArr[14] & 4294967295L;
        long j7 = iArr[15] & 4294967295L;
        long j8 = (iArr[8] & 4294967295L) - 6;
        long j9 = j8 + j;
        long j10 = j + j2;
        long j11 = (j2 + j3) - j7;
        long j12 = j3 + j4;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j14 - j9;
        long j17 = (((iArr[0] & 4294967295L) - j12) - j16) + 0;
        iArr2[0] = (int) j17;
        long j18 = ((((iArr[1] & 4294967295L) + j10) - j13) - j15) + (j17 >> 32);
        iArr2[1] = (int) j18;
        long j19 = (((iArr[2] & 4294967295L) + j11) - j14) + (j18 >> 32);
        iArr2[2] = (int) j19;
        long j20 = ((((iArr[3] & 4294967295L) + (j12 << 1)) + j16) - j15) + (j19 >> 32);
        iArr2[3] = (int) j20;
        long j21 = ((((iArr[4] & 4294967295L) + (j13 << 1)) + j6) - j10) + (j20 >> 32);
        iArr2[4] = (int) j21;
        long j22 = (((iArr[5] & 4294967295L) + (j14 << 1)) - j11) + (j21 >> 32);
        iArr2[5] = (int) j22;
        long j23 = (iArr[6] & 4294967295L) + (j15 << 1) + j16 + (j22 >> 32);
        iArr2[6] = (int) j23;
        long j24 = (((((iArr[7] & 4294967295L) + (j7 << 1)) + j8) - j11) - j13) + (j23 >> 32);
        iArr2[7] = (int) j24;
        k(iArr2, (int) ((j24 >> 32) + 6));
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
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = ((iArr[3] & 4294967295L) - j2) + j4;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = ((iArr[6] & 4294967295L) - j2) + j8;
            iArr[6] = (int) j11;
            long j12 = (4294967295L & iArr[7]) + j2 + (j11 >> 32);
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && z61.Y(iArr, P))) {
            a(iArr);
        }
    }

    public static int l(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (d(i) >= d(i2)) {
            i ^= i2 << (d(i) - d(i2));
        }
        return i;
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        j(iArr3, iArr2);
    }

    public static void n(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        while (true) {
            j(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.f1(iArr2, iArr3);
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.o1(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = (iArr3[3] & 4294967295L) + 1 + j2;
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j8;
                j6 = j8 >> 32;
            }
            long j9 = (iArr3[6] & 4294967295L) + 1 + j6;
            iArr3[6] = (int) j9;
            iArr3[7] = (int) (((4294967295L & iArr3[7]) - 1) + (j9 >> 32));
        }
    }

    @Override // defpackage.o55
    public ja c(r65 r65Var) {
        y15 y15Var;
        f65 f65Var = m25.a;
        if (((p65) r65Var).a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                c95 z = c95.z(((p65) r65Var).c, ud5.c);
                if (z.w() == 0) {
                    int o = z.A().o();
                    if (o != 16 && o != 24 && o != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(o)));
                    }
                    Integer valueOf = Integer.valueOf(o);
                    Integer num = 12;
                    Integer num2 = 16;
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
                                y15Var = y15.d;
                            }
                        }
                        y15Var = y15.c;
                    } else {
                        y15Var = y15.b;
                    }
                    if (valueOf != null) {
                        if (num != null) {
                            if (num2 != null) {
                                int intValue = valueOf.intValue();
                                num.intValue();
                                num2.intValue();
                                z15 z15Var = new z15(intValue, y15Var);
                                t15 t15Var = new t15();
                                t15Var.a = z15Var;
                                t15Var.b = ee4.d(z.A().g());
                                t15Var.c = ((p65) r65Var).f;
                                return t15Var.a();
                            }
                            throw new GeneralSecurityException("Tag size is not set");
                        }
                        throw new GeneralSecurityException("IV size is not set");
                    }
                    throw new GeneralSecurityException("Key size is not set");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (te5 unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((nd3) obj).K();
    }

    @Override // defpackage.xj2
    public JSONObject f(Object obj) {
        by3 by3Var = (by3) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) w82.d.c.a(x92.Q7)).booleanValue()) {
            jSONObject2.put("ad_request_url", by3Var.c.f);
            jSONObject2.put("ad_request_post_body", by3Var.c.c);
        }
        jSONObject2.put("base_url", by3Var.c.b);
        jSONObject2.put("signals", by3Var.b);
        jSONObject3.put("body", by3Var.a.c);
        jSONObject3.put("headers", n62.f.a.g(by3Var.a.b));
        jSONObject3.put("response_code", by3Var.a.a);
        jSONObject3.put("latency", by3Var.a.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", by3Var.c.h);
        return jSONObject;
    }
}