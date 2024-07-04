package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: dc5  reason: default package */
public final class dc5 implements uz4 {
    public final ic5 a;
    public final p05 b;
    public final int c;

    public dc5(ic5 ic5Var, p05 p05Var, int i) {
        this.a = ic5Var;
        this.b = p05Var;
        this.c = i;
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] c = this.a.c(bArr);
        return mh.C(c, this.b.c(mh.C(bArr2, c, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.c, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.b.b(copyOfRange2, mh.C(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.a.a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}