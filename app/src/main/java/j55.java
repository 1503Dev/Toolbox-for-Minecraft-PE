package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: j55  reason: default package */
public final class j55 {
    public static final byte[] a = b(1, 0);
    public static final byte[] b = b(2, 32);
    public static final byte[] c = b(2, 16);
    public static final byte[] d = b(2, 17);
    public static final byte[] e = b(2, 18);
    public static final byte[] f = b(2, 1);
    public static final byte[] g = b(2, 2);
    public static final byte[] h = b(2, 3);
    public static final byte[] i = b(2, 1);
    public static final byte[] j = b(2, 2);
    public static final byte[] k = b(2, 3);
    public static final byte[] l = new byte[0];
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;

    static {
        Charset charset = y65.a;
        m = "KEM".getBytes(charset);
        n = "HPKE".getBytes(charset);
        o = "HPKE-v1".getBytes(charset);
    }

    public static void a(na5 na5Var) {
        if (na5Var.B() == 2 || na5Var.B() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(zw4.n(na5Var.B())));
        }
        String str = "UNRECOGNIZED";
        if (na5Var.A() == 2 || na5Var.A() == 1) {
            int A = na5Var.A();
            if (A == 2) {
                str = "KDF_UNKNOWN";
            } else if (A == 3) {
                str = "HKDF_SHA256";
            } else if (A == 4) {
                str = "HKDF_SHA384";
            } else if (A == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (na5Var.z() == 2 || na5Var.z() == 1) {
            int z = na5Var.z();
            if (z == 2) {
                str = "AEAD_UNKNOWN";
            } else if (z == 3) {
                str = "AES_128_GCM";
            } else if (z == 4) {
                str = "AES_256_GCM";
            } else if (z == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    public static byte[] b(int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] c(String str, byte[] bArr, byte[] bArr2, int i2) {
        return mh.C(b(2, i2), o, bArr2, str.getBytes(y65.a), bArr);
    }
}