package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: yy2  reason: default package */
public final class yy2 implements Closeable {
    public final ByteBuffer P;

    public yy2(ByteBuffer byteBuffer) {
        this.P = byteBuffer.duplicate();
    }

    public final int a(ByteBuffer byteBuffer) {
        if (this.P.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.P.remaining());
            byte[] bArr = new byte[min];
            this.P.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final long d() {
        return this.P.position();
    }

    public final ByteBuffer g(long j, long j2) {
        int position = this.P.position();
        this.P.position((int) j);
        ByteBuffer slice = this.P.slice();
        slice.limit((int) j2);
        this.P.position(position);
        return slice;
    }
}