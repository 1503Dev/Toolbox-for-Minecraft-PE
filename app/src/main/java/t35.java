package defpackage;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: t35  reason: default package */
public final class t35 {
    public static final s35 c = new s35();
    public final SecretKeySpec a;
    public final boolean b;

    public t35(byte[] bArr, boolean z) {
        if (!ea2.C(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        pc5.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        this.b = z;
    }

    public static AlgorithmParameterSpec b(byte[] bArr) {
        String property = System.getProperty("java.vendor");
        Integer valueOf = (property == "The Android Project" || (property != null && property.equals("The Android Project"))) ? Integer.valueOf(Build.VERSION.SDK_INT) : null;
        return (valueOf == null || valueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z = this.b;
                byte[] bArr3 = new byte[z ? length + 28 : length + 16];
                if (z) {
                    System.arraycopy(bArr, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec b = b(bArr);
                s35 s35Var = c;
                ((Cipher) s35Var.get()).init(1, this.a, b);
                int doFinal = ((Cipher) s35Var.get()).doFinal(bArr2, 0, length, bArr3, true != this.b ? 0 : 12);
                if (doFinal == length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}