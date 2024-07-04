package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: sb5  reason: default package */
public final class sb5 implements ic5 {
    public static final rb5 d = new rb5();
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public sb5(byte[] bArr, int i) {
        if (!ea2.C(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        pc5.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    @Override // defpackage.ic5
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            b(bArr, i2, i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void b(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        cipher.init(z ? 1 : 2, this.a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // defpackage.ic5
    public final byte[] c(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[i + length];
            byte[] a = oc5.a(i);
            System.arraycopy(a, 0, bArr2, 0, this.b);
            b(bArr, 0, length, bArr2, this.b, a, true);
            return bArr2;
        }
        throw new GeneralSecurityException(k6.a("plaintext length can not exceed ", Integer.MAX_VALUE - this.b));
    }
}