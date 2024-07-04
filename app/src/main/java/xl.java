package defpackage;

import defpackage.xj0;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: xl  reason: default package */
public final class xl {
    @Nullable
    public ThreadPoolExecutor c;
    public int a = 64;
    public int b = 5;
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();

    @Nullable
    public final xj0.a a(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            xj0.a aVar = (xj0.a) it.next();
            if (xj0.this.R.a.d.equals(str)) {
                return aVar;
            }
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            xj0.a aVar2 = (xj0.a) it2.next();
            if (xj0.this.R.a.d.equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final void b(xj0.a aVar) {
        aVar.R.decrementAndGet();
        ArrayDeque arrayDeque = this.e;
        synchronized (this) {
            if (!arrayDeque.remove(aVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                xj0.a aVar = (xj0.a) it.next();
                if (this.e.size() >= this.a) {
                    break;
                } else if (aVar.R.get() < this.b) {
                    it.remove();
                    aVar.R.incrementAndGet();
                    arrayList.add(aVar);
                    this.e.add(aVar);
                }
            }
            synchronized (this) {
                int size2 = this.e.size() + this.f.size();
            }
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                xj0.a aVar2 = (xj0.a) arrayList.get(i);
                synchronized (this) {
                    if (this.c == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        SynchronousQueue synchronousQueue = new SynchronousQueue();
                        byte[] bArr = c31.a;
                        this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new z21("OkHttp Dispatcher", false));
                    }
                    threadPoolExecutor = this.c;
                }
                aVar2.getClass();
                try {
                    try {
                        threadPoolExecutor.execute(aVar2);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        xj0.this.Q.e(interruptedIOException);
                        aVar2.Q.onFailure(xj0.this, interruptedIOException);
                        xj0.this.P.P.b(aVar2);
                    }
                } catch (Throwable th) {
                    xj0.this.P.P.b(aVar2);
                    throw th;
                }
            }
        }
        size = arrayList.size();
        while (i < size) {
        }
    }
}