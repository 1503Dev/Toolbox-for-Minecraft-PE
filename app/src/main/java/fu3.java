package defpackage;

import java.nio.ByteBuffer;

/* renamed from: fu3  reason: default package */
public final class fu3 extends bs3 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[LOOP:4: B:30:0x00b3->B:31:0x00b5, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0036, B:31:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.kr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 == 536870912) {
                        i2 /= 3;
                    } else if (i3 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer j = j(i2);
                i = this.b.c;
                if (i == 3) {
                    while (position < limit) {
                        j.put((byte) 0);
                        j.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        short max = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(position), 1.0f)) * 32767.0f);
                        j.put((byte) (max & 255));
                        j.put((byte) ((max >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 1));
                        j.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 1));
                        j.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i != 805306368) {
                    throw new IllegalStateException();
                } else {
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 2));
                        j.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                j.flip();
            }
            i2 /= 2;
            ByteBuffer j2 = j(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j2.flip();
        }
        i2 += i2;
        ByteBuffer j22 = j(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j22.flip();
    }

    @Override // defpackage.bs3
    public final kq3 g(kq3 kq3Var) {
        int i = kq3Var.c;
        if (i != 3) {
            if (i == 2) {
                return kq3.e;
            }
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                throw new br3(kq3Var);
            }
        }
        return new kq3(kq3Var.a, kq3Var.b, 2);
    }
}