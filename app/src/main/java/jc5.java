package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: jc5  reason: default package */
public final class jc5 implements d85 {
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public jc5(byte[] bArr) {
        pc5.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        if (ea2.C(1)) {
            Cipher cipher = (Cipher) gc5.b.a("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] E = ea2.E(cipher.doFinal(new byte[16]));
            this.b = E;
            this.c = ea2.E(E);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // defpackage.d85
    public final byte[] a(byte[] bArr, int i) {
        byte[] D;
        if (i <= 16) {
            if (ea2.C(1)) {
                Cipher cipher = (Cipher) gc5.b.a("AES/ECB/NoPadding");
                cipher.init(1, this.a);
                int length = bArr.length;
                double d = length;
                Double.isNaN(d);
                Double.isNaN(d);
                int max = Math.max(1, (int) Math.ceil(d / 16.0d));
                if (max * 16 == length) {
                    D = mh.E(bArr, (max - 1) * 16, this.b, 0, 16);
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
                    int length2 = copyOfRange.length;
                    if (length2 < 16) {
                        byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                        copyOf[length2] = Byte.MIN_VALUE;
                        D = mh.D(copyOf, this.c);
                    } else {
                        throw new IllegalArgumentException("x must be smaller than a block.");
                    }
                }
                byte[] bArr2 = new byte[16];
                for (int i2 = 0; i2 < max - 1; i2++) {
                    bArr2 = cipher.doFinal(mh.E(bArr2, 0, bArr, i2 * 16, 16));
                }
                return Arrays.copyOf(cipher.doFinal(mh.D(D, bArr2)), i);
            }
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}