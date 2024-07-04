package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c45  reason: default package */
public final class c45 implements uz4 {
    public static final b45 b = new b45();
    public final SecretKeySpec a;

    public c45(byte[] bArr) {
        pc5.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a = oc5.a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c = c(a, a.length);
            b45 b45Var = b;
            ((Cipher) b45Var.get()).init(1, this.a, c);
            int doFinal = ((Cipher) b45Var.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            AlgorithmParameterSpec c = c(bArr, 12);
            b45 b45Var = b;
            ((Cipher) b45Var.get()).init(2, this.a, c);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) b45Var.get()).updateAAD(bArr2);
            }
            return ((Cipher) b45Var.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}