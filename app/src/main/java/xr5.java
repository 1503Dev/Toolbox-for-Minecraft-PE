package defpackage;

import java.nio.ByteBuffer;

/* renamed from: xr5  reason: default package */
public final class xr5 extends bs3 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void n(int i2, ByteBuffer byteBuffer) {
        double d = i2;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.kr3
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            j = j((i2 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j);
                position += 3;
            }
        } else if (i3 != 805306368) {
            throw new IllegalStateException();
        } else {
            j = j(i2);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // defpackage.bs3
    public final kq3 g(kq3 kq3Var) {
        int i2 = kq3Var.c;
        int i3 = zn4.a;
        if (i2 == 536870912 || i2 == 805306368) {
            return new kq3(kq3Var.a, kq3Var.b, 4);
        }
        if (i2 == 4) {
            return kq3.e;
        }
        throw new br3(kq3Var);
    }
}