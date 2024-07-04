package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: lr  reason: default package */
public final class lr extends cx0 {
    public cx0 e;

    public lr(cx0 cx0Var) {
        if (cx0Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.e = cx0Var;
    }

    @Override // defpackage.cx0
    public final cx0 a() {
        return this.e.a();
    }

    @Override // defpackage.cx0
    public final cx0 b() {
        return this.e.b();
    }

    @Override // defpackage.cx0
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.cx0
    public final cx0 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.cx0
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.cx0
    public final void f() {
        this.e.f();
    }

    @Override // defpackage.cx0
    public final cx0 g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.cx0
    public final long h() {
        return this.e.h();
    }
}