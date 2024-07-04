package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: v45  reason: default package */
public final class v45 {
    public static void a(w95 w95Var) {
        cc5.f(c(w95Var.A().B()));
        b(w95Var.A().C());
        if (w95Var.E() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        x05.a(w95Var.w().z());
    }

    public static String b(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(j82.j(i))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int c(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return 3;
                }
                if (i != 1) {
                    throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(i2)));
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                if (i != 1) {
                    throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(i2)));
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return 2;
        }
        return 1;
    }
}