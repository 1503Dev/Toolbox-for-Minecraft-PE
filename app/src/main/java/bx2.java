package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: bx2  reason: default package */
public class bx2 implements dz4 {
    public final lz4 P = new lz4();

    public final boolean a(Object obj) {
        boolean h = this.P.h(obj);
        if (!h) {
            jv5.A.g.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return h;
    }

    @Override // defpackage.dz4
    public final void b(Runnable runnable, Executor executor) {
        this.P.b(runnable, executor);
    }

    public final boolean c(Throwable th) {
        boolean i = this.P.i(th);
        if (!i) {
            jv5.A.g.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return i;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.P.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.P.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.P.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.P.P instanceof lx4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.P.isDone();
    }
}