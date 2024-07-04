package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: w35  reason: default package */
public abstract class w35 {
    public int[] a;
    public final int b;

    public w35(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = r35.c(bArr);
        this.b = i;
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i);

    public final ByteBuffer c(byte[] bArr, int i) {
        int[] b = b(r35.c(bArr), i);
        int[] iArr = (int[]) b.clone();
        r35.b(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == a()) {
            int remaining = byteBuffer2.remaining();
            int i = remaining / 64;
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                if (i2 < i3) {
                    ByteBuffer c = c(bArr, this.b + i2);
                    if (i2 == i3 - 1) {
                        mh.B(byteBuffer, byteBuffer2, c, remaining % 64);
                    } else {
                        mh.B(byteBuffer, byteBuffer2, c, 64);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            throw new GeneralSecurityException(k6.a("The nonce length (in bytes) must be ", a()));
        }
    }
}