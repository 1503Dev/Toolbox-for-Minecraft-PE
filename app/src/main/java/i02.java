package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i02  reason: default package */
public final class i02 implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();
    public final AtomicInteger b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        int andIncrement = this.b.getAndIncrement();
        newThread.setName("gads-" + andIncrement);
        return newThread;
    }
}