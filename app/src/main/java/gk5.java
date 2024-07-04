package defpackage;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: gk5  reason: default package */
public class gk5 extends mh5 {
    public final rj5 b = new rj5();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final int g;

    static {
        gm2.a("media3.decoder");
    }

    public gk5(int i) {
        this.g = i;
    }

    public void b() {
        this.a = 0;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    @EnsuresNonNull({"data"})
    public final void c(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer e = e(i2);
        e.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            e.put(byteBuffer);
        }
        this.c = e;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer e(int i) {
        int i2 = this.g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new fk5(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}