package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bs3  reason: default package */
public abstract class bs3 implements kr3 {
    public kq3 b;
    public kq3 c;
    public kq3 d;
    public kq3 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public bs3() {
        ByteBuffer byteBuffer = kr3.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        kq3 kq3Var = kq3.e;
        this.d = kq3Var;
        this.e = kq3Var;
        this.b = kq3Var;
        this.c = kq3Var;
    }

    @Override // defpackage.kr3
    public final kq3 a(kq3 kq3Var) {
        this.d = kq3Var;
        this.e = g(kq3Var);
        return h() ? this.e : kq3.e;
    }

    @Override // defpackage.kr3
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = kr3.a;
        return byteBuffer;
    }

    @Override // defpackage.kr3
    public final void d() {
        this.g = kr3.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        k();
    }

    @Override // defpackage.kr3
    public final void e() {
        d();
        this.f = kr3.a;
        kq3 kq3Var = kq3.e;
        this.d = kq3Var;
        this.e = kq3Var;
        this.b = kq3Var;
        this.c = kq3Var;
        m();
    }

    @Override // defpackage.kr3
    public boolean f() {
        return this.h && this.g == kr3.a;
    }

    public abstract kq3 g(kq3 kq3Var);

    @Override // defpackage.kr3
    public boolean h() {
        return this.e != kq3.e;
    }

    @Override // defpackage.kr3
    public final void i() {
        this.h = true;
        l();
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }
}