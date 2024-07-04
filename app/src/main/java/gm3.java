package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: gm3  reason: default package */
public final class gm3 implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}