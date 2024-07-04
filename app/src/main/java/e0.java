package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e0  reason: default package */
public abstract class e0<V> implements i20<V> {
    public static final boolean S = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger T = Logger.getLogger(e0.class.getName());
    public static final a U;
    public static final Object V;
    public volatile Object P;
    public volatile d Q;
    public volatile h R;

    /* renamed from: e0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {
        public abstract boolean a(e0<?> e0Var, d dVar, d dVar2);

        public abstract boolean b(e0<?> e0Var, Object obj, Object obj2);

        public abstract boolean c(e0<?> e0Var, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* renamed from: e0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (e0.S) {
                d = null;
                c = null;
                return;
            }
            d = new b(false, null);
            c = new b(true, null);
        }

        public b(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* renamed from: e0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c {
        public static final c b = new c(new a());
        public final Throwable a;

        /* renamed from: e0$c$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends Throwable {
            public a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z = e0.S;
            th.getClass();
            this.a = th;
        }
    }

    /* renamed from: e0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class d {
        public static final d d = new d(null, null);
        public final Runnable a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* renamed from: e0$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<e0, h> c;
        public final AtomicReferenceFieldUpdater<e0, d> d;
        public final AtomicReferenceFieldUpdater<e0, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<e0, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<e0, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<e0, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // defpackage.e0.a
        public final boolean a(e0<?> e0Var, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<e0, d> atomicReferenceFieldUpdater = this.d;
            while (!atomicReferenceFieldUpdater.compareAndSet(e0Var, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(e0Var) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.e0.a
        public final boolean b(e0<?> e0Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<e0, Object> atomicReferenceFieldUpdater = this.e;
            while (!atomicReferenceFieldUpdater.compareAndSet(e0Var, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(e0Var) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.e0.a
        public final boolean c(e0<?> e0Var, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<e0, h> atomicReferenceFieldUpdater = this.c;
            while (!atomicReferenceFieldUpdater.compareAndSet(e0Var, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(e0Var) != hVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.e0.a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // defpackage.e0.a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* renamed from: e0$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class f<V> implements Runnable {
        public final e0<V> P;
        public final i20<? extends V> Q;

        public f(e0<V> e0Var, i20<? extends V> i20Var) {
            this.P = e0Var;
            this.Q = i20Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.P.P != this) {
                return;
            }
            if (e0.U.b(this.P, this, e0.g(this.Q))) {
                e0.d(this.P);
            }
        }
    }

    /* renamed from: e0$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class g extends a {
        @Override // defpackage.e0.a
        public final boolean a(e0<?> e0Var, d dVar, d dVar2) {
            synchronized (e0Var) {
                if (e0Var.Q == dVar) {
                    e0Var.Q = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // defpackage.e0.a
        public final boolean b(e0<?> e0Var, Object obj, Object obj2) {
            synchronized (e0Var) {
                if (e0Var.P == obj) {
                    e0Var.P = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // defpackage.e0.a
        public final boolean c(e0<?> e0Var, h hVar, h hVar2) {
            synchronized (e0Var) {
                if (e0Var.R == hVar) {
                    e0Var.R = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // defpackage.e0.a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // defpackage.e0.a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* renamed from: e0$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class h {
        public static final h c = new h(0);
        public volatile Thread a;
        public volatile h b;

        public h() {
            e0.U.e(this, Thread.currentThread());
        }

        public h(int i) {
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(e0.class, h.class, "R"), AtomicReferenceFieldUpdater.newUpdater(e0.class, d.class, "Q"), AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "P"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        U = gVar;
        if (th != null) {
            T.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        V = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [e0$a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e0<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e0] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [e0<V>, e0] */
    public static void d(e0<?> e0Var) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = ((e0) e0Var).R;
            if (U.c((e0) e0Var, hVar, h.c)) {
                while (hVar != null) {
                    Thread thread = hVar.a;
                    if (thread != null) {
                        hVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.b;
                }
                do {
                    dVar = ((e0) e0Var).Q;
                } while (!U.a((e0) e0Var, dVar, d.d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.c;
                    dVar3.c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.c;
                    Runnable runnable = dVar2.a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        e0Var = fVar.P;
                        if (e0Var.P == fVar) {
                            if (U.b(e0Var, fVar, g(fVar.Q))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, dVar2.b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = T;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == V) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).a);
        }
        Throwable th = ((b) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object g(i20<?> i20Var) {
        Object obj;
        if (i20Var instanceof e0) {
            Object obj2 = ((e0) i20Var).P;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.a) {
                    if (bVar.b != null) {
                        return new b(false, bVar.b);
                    }
                    return b.d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean z = ((e0) i20Var).P instanceof b;
        if ((!S) & z) {
            return b.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = ((e0) i20Var).get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                if (!z) {
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + i20Var, e2));
                }
                return new b(false, e2);
            } catch (ExecutionException e3) {
                return new c(e3.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return V;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        V v;
        String valueOf;
        String str = "]";
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append(str);
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (v == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(v);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.Q;
        if (dVar != d.d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (U.a(this, dVar, dVar2)) {
                    return;
                }
                dVar = this.Q;
            } while (dVar != d.d);
            e(runnable, executor);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.P;
        if ((obj == null) || (obj instanceof f)) {
            b bVar = S ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.c : b.d;
            boolean z2 = false;
            e0<V> e0Var = this;
            while (true) {
                if (U.b(e0Var, obj, bVar)) {
                    d(e0Var);
                    if (!(obj instanceof f)) {
                        break;
                    }
                    i20<? extends V> i20Var = ((f) obj).Q;
                    if (!(i20Var instanceof e0)) {
                        ((e0) i20Var).cancel(z);
                        break;
                    }
                    e0Var = (e0) i20Var;
                    obj = e0Var.P;
                    if (!(obj == null) && !(obj instanceof f)) {
                        break;
                    }
                    z2 = true;
                } else {
                    obj = e0Var.P;
                    if (!(obj instanceof f)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.P;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return (V) f(obj2);
        }
        h hVar = this.R;
        if (hVar != h.c) {
            h hVar2 = new h();
            do {
                a aVar = U;
                aVar.d(hVar2, hVar);
                if (aVar.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.P;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return (V) f(obj);
                }
                hVar = this.R;
            } while (hVar != h.c);
            return (V) f(this.P);
        }
        return (V) f(this.P);
    }

    public final String h() {
        String valueOf;
        Object obj = this.P;
        if (obj instanceof f) {
            StringBuilder b2 = e5.b("setFuture=[");
            i20<? extends V> i20Var = ((f) obj).Q;
            if (i20Var == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(i20Var);
            }
            return qq.d(b2, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            StringBuilder b3 = e5.b("remaining delay=[");
            b3.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            b3.append(" ms]");
            return b3.toString();
        } else {
            return null;
        }
    }

    public final void i(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.R;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!U.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.P instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.P;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.P instanceof b) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    sb = h();
                } catch (RuntimeException e2) {
                    StringBuilder b2 = e5.b("Exception thrown from implementation: ");
                    b2.append(e2.getClass());
                    sb = b2.toString();
                }
                if (sb != null && !sb.isEmpty()) {
                    sb2.append("PENDING, info=[");
                    sb2.append(sb);
                    sb2.append("]");
                    sb2.append("]");
                    return sb2.toString();
                }
                str = isDone() ? "PENDING" : "PENDING";
            }
            a(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.P;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.R;
            if (hVar != h.c) {
                h hVar2 = new h();
                do {
                    a aVar = U;
                    aVar.d(hVar2, hVar);
                    if (aVar.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.P;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar2);
                    } else {
                        hVar = this.R;
                    }
                } while (hVar != h.c);
                return (V) f(this.P);
            }
            return (V) f(this.P);
        }
        while (nanos > 0) {
            Object obj3 = this.P;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return (V) f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String e0Var = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String b2 = k6.b(str, " (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = b2 + convert + " " + lowerCase;
                if (z) {
                    str2 = k6.b(str2, ",");
                }
                b2 = k6.b(str2, " ");
            }
            if (z) {
                b2 = b2 + nanos2 + " nanoseconds ";
            }
            str = k6.b(b2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(k6.b(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(ij.c(str, " for ", e0Var));
    }
}