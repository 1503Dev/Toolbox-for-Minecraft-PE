package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: kt3  reason: default package */
public final class kt3 implements kr3 {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public kq3 e;
    public kq3 f;
    public kq3 g;
    public kq3 h;
    public boolean i;
    public qs3 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public kt3() {
        kq3 kq3Var = kq3.e;
        this.e = kq3Var;
        this.f = kq3Var;
        this.g = kq3Var;
        this.h = kq3Var;
        ByteBuffer byteBuffer = kr3.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // defpackage.kr3
    public final kq3 a(kq3 kq3Var) {
        if (kq3Var.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = kq3Var.a;
            }
            this.e = kq3Var;
            kq3 kq3Var2 = new kq3(i, kq3Var.b, 2);
            this.f = kq3Var2;
            this.i = true;
            return kq3Var2;
        }
        throw new br3(kq3Var);
    }

    @Override // defpackage.kr3
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        qs3 qs3Var = this.j;
        qs3Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = qs3Var.b;
        int i2 = remaining2 / i;
        int i3 = i * i2;
        short[] f = qs3Var.f(qs3Var.j, qs3Var.k, i2);
        qs3Var.j = f;
        asShortBuffer.get(f, qs3Var.k * qs3Var.b, (i3 + i3) / 2);
        qs3Var.k += i2;
        qs3Var.e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // defpackage.kr3
    public final ByteBuffer c() {
        int i;
        int i2;
        qs3 qs3Var = this.j;
        if (qs3Var != null && (i2 = (i = qs3Var.m * qs3Var.b) + i) > 0) {
            if (this.k.capacity() < i2) {
                ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            ShortBuffer shortBuffer = this.l;
            int min = Math.min(shortBuffer.remaining() / qs3Var.b, qs3Var.m);
            shortBuffer.put(qs3Var.l, 0, qs3Var.b * min);
            int i3 = qs3Var.m - min;
            qs3Var.m = i3;
            short[] sArr = qs3Var.l;
            int i4 = qs3Var.b;
            System.arraycopy(sArr, min * i4, sArr, 0, i3 * i4);
            this.o += i2;
            this.k.limit(i2);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = kr3.a;
        return byteBuffer;
    }

    @Override // defpackage.kr3
    public final void d() {
        if (h()) {
            kq3 kq3Var = this.e;
            this.g = kq3Var;
            kq3 kq3Var2 = this.f;
            this.h = kq3Var2;
            if (this.i) {
                this.j = new qs3(kq3Var.a, kq3Var.b, this.c, this.d, kq3Var2.a);
            } else {
                qs3 qs3Var = this.j;
                if (qs3Var != null) {
                    qs3Var.k = 0;
                    qs3Var.m = 0;
                    qs3Var.o = 0;
                    qs3Var.p = 0;
                    qs3Var.q = 0;
                    qs3Var.r = 0;
                    qs3Var.s = 0;
                    qs3Var.t = 0;
                    qs3Var.u = 0;
                    qs3Var.v = 0;
                }
            }
        }
        this.m = kr3.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.kr3
    public final void e() {
        this.c = 1.0f;
        this.d = 1.0f;
        kq3 kq3Var = kq3.e;
        this.e = kq3Var;
        this.f = kq3Var;
        this.g = kq3Var;
        this.h = kq3Var;
        ByteBuffer byteBuffer = kr3.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.kr3
    public final boolean f() {
        if (this.p) {
            qs3 qs3Var = this.j;
            if (qs3Var == null) {
                return true;
            }
            int i = qs3Var.m * qs3Var.b;
            if (i + i == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kr3
    public final boolean h() {
        if (this.f.a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.kr3
    public final void i() {
        int i;
        qs3 qs3Var = this.j;
        if (qs3Var != null) {
            int i2 = qs3Var.k;
            float f = qs3Var.c;
            float f2 = qs3Var.d;
            int i3 = qs3Var.m + ((int) ((((i2 / (f / f2)) + qs3Var.o) / (qs3Var.e * f2)) + 0.5f));
            short[] sArr = qs3Var.j;
            int i4 = qs3Var.h;
            qs3Var.j = qs3Var.f(sArr, i2, i4 + i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = qs3Var.h;
                i = i6 + i6;
                int i7 = qs3Var.b;
                if (i5 >= i * i7) {
                    break;
                }
                qs3Var.j[(i7 * i2) + i5] = 0;
                i5++;
            }
            qs3Var.k += i;
            qs3Var.e();
            if (qs3Var.m > i3) {
                qs3Var.m = i3;
            }
            qs3Var.k = 0;
            qs3Var.r = 0;
            qs3Var.o = 0;
        }
        this.p = true;
    }
}