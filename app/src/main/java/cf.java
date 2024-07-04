package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cf  reason: default package */
public final class cf implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public cf(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder b = e5.b(str);
        b.append(this.a.incrementAndGet());
        return new Thread(runnable, b.toString());
    }
}