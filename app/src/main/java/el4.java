package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: el4  reason: default package */
public final class el4 implements dz4 {
    public final Object P;
    public final String Q;
    public final dz4 R;

    public el4(Object obj, String str, dz4 dz4Var) {
        this.P = obj;
        this.Q = str;
        this.R = dz4Var;
    }

    @Override // defpackage.dz4
    public final void b(Runnable runnable, Executor executor) {
        this.R.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.R.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.R.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.R.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.R.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.R.isDone();
    }

    public final String toString() {
        String str = this.Q;
        int identityHashCode = System.identityHashCode(this);
        return str + "@" + identityHashCode;
    }
}