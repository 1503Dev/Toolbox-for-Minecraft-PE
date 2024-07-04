package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aw2  reason: default package */
public final class aw2 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);
    public final /* synthetic */ String b;

    public aw2(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.b;
        int andIncrement = this.a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}