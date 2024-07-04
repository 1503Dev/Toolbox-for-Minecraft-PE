package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ot2  reason: default package */
public final class ot2 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, k6.a("AdWorker(SCION_TASK_EXECUTOR) #", this.a.getAndIncrement()));
    }
}