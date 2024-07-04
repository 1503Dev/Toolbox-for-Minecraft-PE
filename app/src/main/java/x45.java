package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: x45  reason: default package */
public final class x45 implements z45 {
    public final int a;

    public x45(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(k6.a("Unsupported key length: ", i));
        }
        this.a = i;
    }

    @Override // defpackage.z45
    public final int a() {
        return this.a;
    }

    @Override // defpackage.z45
    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.a) {
            return new t35(bArr, false).a(bArr2, bArr3);
        }
        throw new InvalidAlgorithmParameterException(k6.a("Unexpected key length: ", length));
    }

    @Override // defpackage.z45
    public final byte[] c() {
        int i = this.a;
        if (i != 16) {
            if (i == 32) {
                return j55.j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return j55.i;
    }
}