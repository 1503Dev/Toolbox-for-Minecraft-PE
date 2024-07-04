package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: vb5  reason: default package */
public final class vb5 implements uz4 {
    public static final tb5 e = new tb5();
    public static final ub5 f = new ub5();
    public final byte[] a;
    public final byte[] b;
    public final SecretKeySpec c;
    public final int d;

    public vb5(byte[] bArr, int i) {
        if (!ea2.C(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = i;
        pc5.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, secretKeySpec);
        byte[] c = c(cipher.doFinal(new byte[16]));
        this.a = c;
        this.b = c(c);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[i + length + 16];
            byte[] a = oc5.a(i);
            System.arraycopy(a, 0, bArr3, 0, this.d);
            Cipher cipher = (Cipher) e.get();
            cipher.init(1, this.c);
            byte[] d = d(cipher, 0, a, 0, a.length);
            byte[] d2 = d(cipher, 1, bArr2, 0, 0);
            Cipher cipher2 = (Cipher) f.get();
            cipher2.init(1, this.c, new IvParameterSpec(d));
            cipher2.doFinal(bArr, 0, length, bArr3, this.d);
            byte[] d3 = d(cipher, 2, bArr3, this.d, length);
            int i2 = length + this.d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((d2[i3] ^ d[i3]) ^ d3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = (length - this.d) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) e.get();
            cipher.init(1, this.c);
            byte[] d = d(cipher, 0, bArr, 0, this.d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d2 = d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d3 = d(cipher, 2, bArr, this.d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ d2[i3]) ^ d[i3]) ^ d3[i3]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) f.get();
                cipher2.init(1, this.c, new IvParameterSpec(d));
                return cipher2.doFinal(bArr, this.d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(e(bArr3, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = e(copyOfRange, this.a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(e(doFinal, bArr2));
    }
}