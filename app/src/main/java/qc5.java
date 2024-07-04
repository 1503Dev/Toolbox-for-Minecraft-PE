package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: qc5  reason: default package */
public final class qc5 implements uz4 {
    public final a45 a;

    public qc5(byte[] bArr) {
        this.a = new a45(bArr);
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] a = oc5.a(24);
        allocate.put(a);
        this.a.b(allocate, a, bArr, bArr2);
        return allocate.array();
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.a.c(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}