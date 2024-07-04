package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: yb5  reason: default package */
public final class yb5 implements uz4 {
    public final x35 a;

    public yb5(byte[] bArr) {
        this.a = new x35(bArr);
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] a = oc5.a(12);
        allocate.put(a);
        this.a.b(allocate, a, bArr, bArr2);
        return allocate.array();
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.a.c(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}