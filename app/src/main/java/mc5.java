package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* renamed from: mc5  reason: default package */
public final class mc5 implements p05 {
    public final d85 a;
    public final int b;

    public mc5(d85 d85Var, int i) {
        this.a = d85Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        d85Var.a(new byte[0], i);
    }

    @Override // defpackage.p05
    public final void b(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(c(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // defpackage.p05
    public final byte[] c(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}