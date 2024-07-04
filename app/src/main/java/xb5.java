package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: xb5  reason: default package */
public final class xb5 implements wz4 {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public final jc5 a;
    public final byte[] b;

    public xb5(byte[] bArr) {
        if (ea2.C(1)) {
            List list = c;
            int length = bArr.length;
            if (list.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.b = Arrays.copyOfRange(bArr, i, length);
                this.a = new jc5(copyOfRange);
                return;
            }
            throw new InvalidKeyException(bp.b("invalid key size: ", length, " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // defpackage.wz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] D;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) gc5.b.a("AES/CTR/NoPadding");
            byte[][] bArr3 = {bArr2, bArr};
            byte[] a = this.a.a(d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr4 = bArr3[i];
                if (bArr4 == null) {
                    bArr4 = new byte[0];
                }
                a = mh.D(ea2.E(a), this.a.a(bArr4, 16));
            }
            byte[] bArr5 = bArr3[1];
            int length = bArr5.length;
            if (length >= 16) {
                int length2 = a.length;
                if (length >= length2) {
                    D = Arrays.copyOf(bArr5, length);
                    for (int i2 = 0; i2 < a.length; i2++) {
                        int i3 = (length - length2) + i2;
                        D[i3] = (byte) (D[i3] ^ a[i2]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                int length3 = bArr5.length;
                if (length3 < 16) {
                    byte[] copyOf = Arrays.copyOf(bArr5, 16);
                    copyOf[length3] = Byte.MIN_VALUE;
                    D = mh.D(copyOf, ea2.E(a));
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] a2 = this.a.a(D, 16);
            byte[] bArr6 = (byte[]) a2.clone();
            bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
            bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr6));
            return mh.C(a2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}