package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: gz4  reason: default package */
public class gz4 extends zx4 {
    public final ExecutorService P;

    public gz4(ExecutorService executorService) {
        executorService.getClass();
        this.P = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.P.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.P.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.P.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.P.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.P.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.P.shutdownNow();
    }

    public final String toString() {
        return ho.b(super.toString(), "[", String.valueOf(this.P), "]");
    }
}