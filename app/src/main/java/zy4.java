package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: zy4  reason: default package */
public final class zy4 implements dz4 {
    public static final zy4 Q = new zy4(null);
    public static final Logger R = Logger.getLogger(zy4.class.getName());
    public final Object P;

    public zy4(Object obj) {
        this.P = obj;
    }

    @Override // defpackage.dz4
    public final void b(Runnable runnable, Executor executor) {
        if (executor != null) {
            try {
                executor.execute(runnable);
                return;
            } catch (RuntimeException e) {
                R.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", ho.b("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                return;
            }
        }
        throw new NullPointerException("Executor was null.");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.P;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.P;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return ho.b(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.P), "]]");
    }
}