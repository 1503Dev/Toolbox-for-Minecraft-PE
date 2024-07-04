package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g35  reason: default package */
public final class g35 implements uz4 {
    public static final byte[] c = new byte[0];
    public final va5 a;
    public final uz4 b;

    public g35(va5 va5Var, uz4 uz4Var) {
        this.a = va5Var;
        this.b = uz4Var;
    }

    @Override // defpackage.uz4
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] D = x05.b(this.a).D();
        byte[] a = this.b.a(D, c);
        String B = this.a.B();
        ed5 ed5Var = gd5.Q;
        byte[] a2 = ((uz4) x05.c(B, gd5.G(D, 0, D.length), uz4.class)).a(bArr, bArr2);
        int length = a.length;
        return ByteBuffer.allocate(length + 4 + a2.length).putInt(length).put(a).put(a2).array();
    }

    @Override // defpackage.uz4
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] b = this.b.b(bArr3, c);
            String B = this.a.B();
            AtomicReference atomicReference = x05.a;
            ed5 ed5Var = gd5.Q;
            return ((uz4) x05.c(B, gd5.G(b, 0, b.length), uz4.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}