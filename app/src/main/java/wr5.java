package defpackage;

import java.nio.ByteBuffer;

/* renamed from: wr5  reason: default package */
public final class wr5 extends bs3 {
    public int i;
    public boolean j;
    public byte[] k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;

    public wr5() {
        byte[] bArr = zn4.f;
        this.k = bArr;
        this.l = bArr;
    }

    @Override // defpackage.kr3
    public final void b(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.m;
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    limit = byteBuffer.limit();
                    int n = n(byteBuffer);
                    byteBuffer.limit(n);
                    this.q += byteBuffer.remaining() / this.i;
                    p(byteBuffer, this.l, this.o);
                    if (n < limit) {
                        o(this.l, this.o);
                        this.m = 0;
                        byteBuffer.limit(limit);
                    }
                } else {
                    limit = byteBuffer.limit();
                    int n2 = n(byteBuffer);
                    int position2 = n2 - byteBuffer.position();
                    byte[] bArr = this.k;
                    int length = bArr.length;
                    int i3 = this.n;
                    int i4 = length - i3;
                    if (n2 < limit && position2 < i4) {
                        o(bArr, i3);
                        this.n = 0;
                        this.m = 0;
                    } else {
                        int min = Math.min(position2, i4);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.k, this.n, min);
                        int i5 = this.n + min;
                        this.n = i5;
                        byte[] bArr2 = this.k;
                        if (i5 == bArr2.length) {
                            if (this.p) {
                                o(bArr2, this.o);
                                long j = this.q;
                                int i6 = this.n;
                                int i7 = this.o;
                                this.q = j + ((i6 - (i7 + i7)) / this.i);
                                i5 = i6;
                            } else {
                                this.q += (i5 - this.o) / this.i;
                            }
                            p(byteBuffer, this.k, i5);
                            this.n = 0;
                            i2 = 2;
                            this.m = i2;
                        }
                        byteBuffer.limit(limit);
                    }
                }
            } else {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i8 = this.i;
                            position = ((limit2 / i8) * i8) + i8;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position != byteBuffer.position()) {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.p = true;
                    }
                    byteBuffer.limit(limit);
                }
                this.m = i2;
                byteBuffer.limit(limit);
            }
        }
    }

    @Override // defpackage.bs3
    public final kq3 g(kq3 kq3Var) {
        if (kq3Var.c == 2) {
            return this.j ? kq3Var : kq3.e;
        }
        throw new br3(kq3Var);
    }

    @Override // defpackage.bs3, defpackage.kr3
    public final boolean h() {
        return this.j;
    }

    @Override // defpackage.bs3
    public final void k() {
        if (this.j) {
            kq3 kq3Var = this.b;
            int i = kq3Var.d;
            this.i = i;
            int i2 = kq3Var.a;
            int i3 = ((int) ((150000 * i2) / 1000000)) * i;
            if (this.k.length != i3) {
                this.k = new byte[i3];
            }
            int i4 = ((int) ((20000 * i2) / 1000000)) * i;
            this.o = i4;
            if (this.l.length != i4) {
                this.l = new byte[i4];
            }
        }
        this.m = 0;
        this.q = 0L;
        this.n = 0;
        this.p = false;
    }

    @Override // defpackage.bs3
    public final void l() {
        int i = this.n;
        if (i > 0) {
            o(this.k, i);
        }
        if (this.p) {
            return;
        }
        this.q += this.o / this.i;
    }

    @Override // defpackage.bs3
    public final void m() {
        this.j = false;
        this.o = 0;
        byte[] bArr = zn4.f;
        this.k = bArr;
        this.l = bArr;
    }

    public final int n(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.i;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void o(byte[] bArr, int i) {
        j(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.p = true;
        }
    }

    public final void p(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.o);
        int i2 = this.o - min;
        System.arraycopy(bArr, i - i2, this.l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.l, i2, min);
    }
}