package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: cz4  reason: default package */
public abstract class cz4 extends AtomicReference implements Runnable {
    public static final bz4 P = new bz4();
    public static final bz4 Q = new bz4();

    public abstract Object b();

    public abstract String c();

    public final void d(Thread thread) {
        Runnable runnable = (Runnable) get();
        az4 az4Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof az4)) {
                if (runnable != Q) {
                    break;
                }
            } else {
                az4Var = (az4) runnable;
            }
            i++;
            if (i > 1000) {
                bz4 bz4Var = Q;
                if (runnable == bz4Var || compareAndSet(runnable, bz4Var)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(az4Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void e(Throwable th);

    public abstract void f(Object obj);

    public abstract boolean g();

    public final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            az4 az4Var = new az4(this);
            az4Var.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, az4Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(P)) == Q) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(P)) == Q) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !g();
        if (z) {
            try {
                obj = b();
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    if (!compareAndSet(currentThread, P)) {
                        d(currentThread);
                    }
                    e(th);
                    return;
                } catch (Throwable th2) {
                    if (!compareAndSet(currentThread, P)) {
                        d(currentThread);
                    }
                    f(null);
                    throw th2;
                }
            }
        }
        if (!compareAndSet(currentThread, P)) {
            d(currentThread);
        }
        if (z) {
            f(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == P) {
            str = "running=[DONE]";
        } else if (runnable instanceof az4) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = ij.c("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return ij.c(str, ", ", c());
    }
}