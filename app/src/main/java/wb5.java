package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* renamed from: wb5  reason: default package */
public final class wb5 implements uz4 {
    public final t35 a;

    public wb5(byte[] bArr) {
        if (!ea2.C(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new t35(bArr, true);
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.a.a(oc5.a(12), bArr);
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        t35 t35Var = this.a;
        t35Var.getClass();
        if (copyOf.length == 12) {
            boolean z = t35Var.b;
            int i = true != z ? 16 : 28;
            int length = bArr.length;
            if (length >= i) {
                if (!z || ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    AlgorithmParameterSpec b = t35.b(copyOf);
                    s35 s35Var = t35.c;
                    ((Cipher) s35Var.get()).init(2, t35Var.a, b);
                    if (bArr2 != null && bArr2.length != 0) {
                        ((Cipher) s35Var.get()).updateAAD(bArr2);
                    }
                    boolean z2 = t35Var.b;
                    int i2 = true != z2 ? 0 : 12;
                    if (z2) {
                        length -= 12;
                    }
                    return ((Cipher) s35Var.get()).doFinal(bArr, i2, length);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}