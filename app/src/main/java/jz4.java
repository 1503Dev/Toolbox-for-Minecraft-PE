package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jz4  reason: default package */
public final class jz4 extends gz4 implements ScheduledExecutorService {
    public final ScheduledExecutorService Q;

    public jz4(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.Q = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        rz4 rz4Var = new rz4(Executors.callable(runnable, null));
        return new hz4(rz4Var, this.Q.schedule(rz4Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        rz4 rz4Var = new rz4(callable);
        return new hz4(rz4Var, this.Q.schedule(rz4Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        iz4 iz4Var = new iz4(runnable);
        return new hz4(iz4Var, this.Q.scheduleAtFixedRate(iz4Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        iz4 iz4Var = new iz4(runnable);
        return new hz4(iz4Var, this.Q.scheduleWithFixedDelay(iz4Var, j, j2, timeUnit));
    }
}