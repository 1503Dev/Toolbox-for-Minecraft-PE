package defpackage;

import java.nio.ByteBuffer;

/* renamed from: gs5  reason: default package */
public final class gs5 extends bs3 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = zn4.f;
    public int n;
    public long o;

    @Override // defpackage.kr3
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer j = j(length);
        int max = Math.max(0, Math.min(length, this.n));
        j.put(this.m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i2));
        byteBuffer.limit(byteBuffer.position() + max2);
        j.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - max2;
        int i4 = this.n - max;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, max, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        j.flip();
    }

    @Override // defpackage.bs3, defpackage.kr3
    public final ByteBuffer c() {
        int i;
        if (super.f() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    @Override // defpackage.bs3, defpackage.kr3
    public final boolean f() {
        return super.f() && this.n == 0;
    }

    @Override // defpackage.bs3
    public final kq3 g(kq3 kq3Var) {
        if (kq3Var.c == 2) {
            this.k = true;
            return (this.i == 0 && this.j == 0) ? kq3.e : kq3Var;
        }
        throw new br3(kq3Var);
    }

    @Override // defpackage.bs3
    public final void k() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.bs3
    public final void l() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.bs3
    public final void m() {
        this.m = zn4.f;
    }
}