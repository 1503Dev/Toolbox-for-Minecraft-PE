package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: y45  reason: default package */
public final class y45 implements z45 {
    @Override // defpackage.z45
    public final int a() {
        return 32;
    }

    @Override // defpackage.z45
    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            x35 x35Var = new x35(bArr);
            int length = bArr3.length;
            if (length <= 2147483631) {
                ByteBuffer allocate = ByteBuffer.allocate(length + 16);
                x35Var.b(allocate, bArr2, bArr3, bArr4);
                return allocate.array();
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // defpackage.z45
    public final byte[] c() {
        return j55.k;
    }
}