package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m93  reason: default package */
public final /* synthetic */ class m93 implements Runnable {
    public final /* synthetic */ AtomicReference P;

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) this.P.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}