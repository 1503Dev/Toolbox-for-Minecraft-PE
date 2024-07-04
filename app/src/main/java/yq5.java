package defpackage;

import java.nio.ByteBuffer;

/* renamed from: yq5  reason: default package */
public final class yq5 extends bs3 {
    public int[] i;
    public int[] j;

    @Override // defpackage.kr3
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    @Override // defpackage.bs3
    public final kq3 g(kq3 kq3Var) {
        int[] iArr = this.i;
        if (iArr == null) {
            return kq3.e;
        }
        if (kq3Var.c != 2) {
            throw new br3(kq3Var);
        }
        boolean z = kq3Var.b != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new kq3(kq3Var.a, length, 2) : kq3.e;
            }
            int i2 = iArr[i];
            if (i2 >= kq3Var.b) {
                throw new br3(kq3Var);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // defpackage.bs3
    public final void k() {
        this.j = this.i;
    }

    @Override // defpackage.bs3
    public final void m() {
        this.j = null;
        this.i = null;
    }
}