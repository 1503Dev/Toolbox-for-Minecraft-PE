package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* renamed from: ox4  reason: default package */
public final class ox4 extends kx4 {
    public final AtomicReferenceFieldUpdater<ux4, Thread> a;
    public final AtomicReferenceFieldUpdater<ux4, ux4> b;
    public final AtomicReferenceFieldUpdater<vx4, ux4> c;
    public final AtomicReferenceFieldUpdater<vx4, nx4> d;
    public final AtomicReferenceFieldUpdater<vx4, Object> e;

    public ox4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.kx4
    public final nx4 a(vx4 vx4Var, nx4 nx4Var) {
        return this.d.getAndSet(vx4Var, nx4Var);
    }

    @Override // defpackage.kx4
    public final ux4 b(vx4 vx4Var) {
        return this.c.getAndSet(vx4Var, ux4.c);
    }

    @Override // defpackage.kx4
    public final void c(ux4 ux4Var, @CheckForNull ux4 ux4Var2) {
        this.b.lazySet(ux4Var, ux4Var2);
    }

    @Override // defpackage.kx4
    public final void d(ux4 ux4Var, Thread thread) {
        this.a.lazySet(ux4Var, thread);
    }

    @Override // defpackage.kx4
    public final boolean e(vx4 vx4Var, @CheckForNull nx4 nx4Var, nx4 nx4Var2) {
        return p5.s(this.d, vx4Var, nx4Var, nx4Var2);
    }

    @Override // defpackage.kx4
    public final boolean f(vx4 vx4Var, @CheckForNull Object obj, Object obj2) {
        return p5.s(this.e, vx4Var, obj, obj2);
    }

    @Override // defpackage.kx4
    public final boolean g(vx4 vx4Var, @CheckForNull ux4 ux4Var, @CheckForNull ux4 ux4Var2) {
        return p5.s(this.c, vx4Var, ux4Var, ux4Var2);
    }
}