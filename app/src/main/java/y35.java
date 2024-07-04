package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* renamed from: y35  reason: default package */
public abstract class y35 {
    public final w35 a;
    public final w35 b;

    public y35(byte[] bArr) {
        if (!ea2.C(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = a(bArr, 1);
        this.b = a(bArr, 0);
    }

    public static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i = length & 15;
        int i2 = i == 0 ? length : (length + 16) - i;
        int remaining = byteBuffer.remaining();
        int i3 = remaining % 16;
        int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
        ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i2);
        order.put(byteBuffer);
        order.position(i4);
        order.putLong(length);
        order.putLong(remaining);
        return order.array();
    }

    public abstract w35 a(byte[] bArr, int i);

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            w35 w35Var = this.a;
            w35Var.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                w35Var.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                byte[] bArr4 = new byte[32];
                this.b.c(bArr, 0).get(bArr4);
                byte[] D = ea2.D(bArr4, d(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(D);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.b.c(bArr, 0).get(bArr4);
                if (MessageDigest.isEqual(ea2.D(bArr4, d(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    w35 w35Var = this.a;
                    w35Var.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    w35Var.d(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}