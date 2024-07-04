package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: vy4  reason: default package */
public abstract class vy4 extends fy4 implements dz4, Future {
    public vy4() {
        super(7);
    }

    @Override // defpackage.dz4
    public final void b(Runnable runnable, Executor executor) {
        ((hz4) this).Q.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: p */
    public final Object get() {
        return ((hz4) this).Q.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: q */
    public final Object get(long j, TimeUnit timeUnit) {
        return ((hz4) this).Q.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: r */
    public final boolean isCancelled() {
        return ((hz4) this).Q.isCancelled();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: s */
    public final boolean isDone() {
        return ((hz4) this).Q.isDone();
    }
}