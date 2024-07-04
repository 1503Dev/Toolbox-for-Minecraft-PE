package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: zx4  reason: default package */
public abstract class zx4 extends AbstractExecutorService implements ez4 {
    @Override // defpackage.ez4
    public final dz4 b(Callable callable) {
        return (dz4) super.submit(callable);
    }

    @Override // defpackage.ez4
    public final dz4 e(Runnable runnable) {
        return (dz4) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new rz4(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new rz4(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (dz4) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (dz4) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (dz4) super.submit(callable);
    }
}