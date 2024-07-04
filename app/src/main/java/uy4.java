package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: uy4  reason: default package */
public final class uy4 extends sy4 {
    public final dz4 W;

    public uy4(dz4 dz4Var) {
        dz4Var.getClass();
        this.W = dz4Var;
    }

    @Override // defpackage.vx4, defpackage.dz4
    public final void b(Runnable runnable, Executor executor) {
        this.W.b(runnable, executor);
    }

    @Override // defpackage.vx4, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.W.cancel(z);
    }

    @Override // defpackage.vx4, java.util.concurrent.Future
    public final Object get() {
        return this.W.get();
    }

    @Override // defpackage.vx4, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.W.get(j, timeUnit);
    }

    @Override // defpackage.vx4, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.W.isCancelled();
    }

    @Override // defpackage.vx4, java.util.concurrent.Future
    public final boolean isDone() {
        return this.W.isDone();
    }

    @Override // defpackage.vx4
    public final String toString() {
        return this.W.toString();
    }
}