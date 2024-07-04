package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: vr5  reason: default package */
public final class vr5 {
    public ByteBuffer a = kr3.a;
    public int c = 0;
    public int b = 2;

    public final void a(gk5 gk5Var) {
        byte b;
        ByteBuffer byteBuffer = gk5Var.c;
        byteBuffer.getClass();
        if (byteBuffer.limit() - gk5Var.c.position() == 0) {
            return;
        }
        ByteBuffer byteBuffer2 = gk5Var.c;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i = limit - position;
        int i2 = (i + 255) / 255;
        int i3 = i2 + 27 + i;
        if (this.a.capacity() < i3) {
            this.a = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        ByteBuffer byteBuffer3 = this.a;
        byteBuffer3.put((byte) 79);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 83);
        byteBuffer3.put((byte) 0);
        byteBuffer3.put((byte) 0);
        byte b2 = byteBuffer2.get(0);
        if (byteBuffer2.limit() > 1) {
            b = byteBuffer2.get(1);
        } else {
            b = 0;
        }
        int J = this.c + ((int) ((ea2.J(b2, b) * 48000) / 1000000));
        this.c = J;
        byteBuffer3.putLong(J);
        byteBuffer3.putInt(0);
        byteBuffer3.putInt(this.b);
        this.b++;
        byteBuffer3.putInt(0);
        byteBuffer3.put((byte) i2);
        for (int i4 = 0; i4 < i2; i4++) {
            if (i >= 255) {
                byteBuffer3.put((byte) -1);
                i -= 255;
            } else {
                byteBuffer3.put((byte) i);
                i = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        byte[] array = byteBuffer3.array();
        int limit2 = byteBuffer3.limit() - byteBuffer3.position();
        int i5 = 0;
        for (int arrayOffset = byteBuffer3.arrayOffset(); arrayOffset < limit2; arrayOffset++) {
            i5 = zn4.k[(i5 >>> 24) ^ (array[arrayOffset] & 255)] ^ (i5 << 8);
        }
        int i6 = zn4.a;
        byteBuffer3.putInt(22, i5);
        byteBuffer3.position(0);
        this.a = byteBuffer3;
        gk5Var.b();
        gk5Var.c(this.a.remaining());
        gk5Var.c.put(this.a);
        gk5Var.d();
    }
}