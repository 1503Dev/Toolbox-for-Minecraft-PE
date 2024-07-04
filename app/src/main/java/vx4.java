package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* renamed from: vx4  reason: default package */
public abstract class vx4<V> extends tz4 implements dz4<V> {
    public static final boolean S;
    public static final Logger T;
    public static final kx4 U;
    public static final Object V;
    @CheckForNull
    public volatile Object P;
    @CheckForNull
    public volatile nx4 Q;
    @CheckForNull
    public volatile ux4 R;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        kx4 qx4Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        S = z;
        T = Logger.getLogger(vx4.class.getName());
        try {
            qx4Var = new tx4();
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                qx4Var = new ox4(AtomicReferenceFieldUpdater.newUpdater(ux4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ux4.class, ux4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(vx4.class, ux4.class, "R"), AtomicReferenceFieldUpdater.newUpdater(vx4.class, nx4.class, "Q"), AtomicReferenceFieldUpdater.newUpdater(vx4.class, Object.class, "P"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                qx4Var = new qx4();
            }
        }
        U = qx4Var;
        if (th != null) {
            Logger logger = T;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        V = new Object();
    }

    public static final Object e(Object obj) {
        if (obj instanceof lx4) {
            Throwable th = ((lx4) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof mx4) {
            throw new ExecutionException(((mx4) obj).a);
        } else {
            if (obj == V) {
                return null;
            }
            return obj;
        }
    }

    public static Object j(dz4 dz4Var) {
        Throwable c;
        if (dz4Var instanceof rx4) {
            Object obj = ((vx4) dz4Var).P;
            if (obj instanceof lx4) {
                lx4 lx4Var = (lx4) obj;
                if (lx4Var.a) {
                    Throwable th = lx4Var.b;
                    obj = th != null ? new lx4(false, th) : lx4.d;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(dz4Var instanceof tz4) || (c = ((tz4) dz4Var).c()) == null) {
            boolean isCancelled = dz4Var.isCancelled();
            if ((!S) && isCancelled) {
                lx4 lx4Var2 = lx4.d;
                lx4Var2.getClass();
                return lx4Var2;
            }
            try {
                Object k = k(dz4Var);
                if (!isCancelled) {
                    return k == null ? V : k;
                }
                String valueOf = String.valueOf(dz4Var);
                return new lx4(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (Error e) {
                e = e;
                return new mx4(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new mx4(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(dz4Var)), e2)) : new lx4(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new mx4(e);
            } catch (ExecutionException e4) {
                return isCancelled ? new lx4(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(dz4Var)), e4)) : new mx4(e4.getCause());
            }
        } else {
            return new mx4(c);
        }
    }

    public static Object k(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void p(vx4 vx4Var, boolean z) {
        nx4 nx4Var = null;
        while (true) {
            for (ux4 b = U.b(vx4Var); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                vx4Var.l();
            }
            vx4Var.g();
            nx4 nx4Var2 = nx4Var;
            nx4 a = U.a(vx4Var, nx4.d);
            nx4 nx4Var3 = nx4Var2;
            while (a != null) {
                nx4 nx4Var4 = a.c;
                a.c = nx4Var3;
                nx4Var3 = a;
                a = nx4Var4;
            }
            while (nx4Var3 != null) {
                nx4Var = nx4Var3.c;
                Runnable runnable = nx4Var3.a;
                runnable.getClass();
                if (runnable instanceof px4) {
                    px4 px4Var = (px4) runnable;
                    vx4Var = px4Var.P;
                    if (vx4Var.P == px4Var) {
                        if (U.f(vx4Var, px4Var, j(px4Var.Q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = nx4Var3.b;
                    executor.getClass();
                    q(runnable, executor);
                }
                nx4Var3 = nx4Var;
            }
            return;
            z = false;
        }
    }

    public static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            T.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", ho.b("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public void b(Runnable runnable, Executor executor) {
        nx4 nx4Var;
        if (runnable == null) {
            throw new NullPointerException("Runnable was null.");
        }
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (isDone() || (nx4Var = this.Q) == nx4.d) {
            q(runnable, executor);
        }
        nx4 nx4Var2 = new nx4(runnable, executor);
        do {
            nx4Var2.c = nx4Var;
            if (U.e(this, nx4Var, nx4Var2)) {
                return;
            }
            nx4Var = this.Q;
        } while (nx4Var != nx4.d);
        q(runnable, executor);
    }

    @Override // defpackage.tz4
    @CheckForNull
    public final Throwable c() {
        if (this instanceof rx4) {
            Object obj = this.P;
            if (obj instanceof mx4) {
                return ((mx4) obj).a;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z) {
        lx4 lx4Var;
        Object obj = this.P;
        if (!(obj instanceof px4) && !(obj == null)) {
            return false;
        }
        if (S) {
            lx4Var = new lx4(z, new CancellationException("Future.cancel() was called."));
        } else {
            lx4Var = z ? lx4.c : lx4.d;
            lx4Var.getClass();
        }
        boolean z2 = false;
        vx4<V> vx4Var = this;
        while (true) {
            if (U.f(vx4Var, obj, lx4Var)) {
                p(vx4Var, z);
                if (!(obj instanceof px4)) {
                    break;
                }
                dz4<? extends V> dz4Var = ((px4) obj).Q;
                if (!(dz4Var instanceof rx4)) {
                    dz4Var.cancel(z);
                    break;
                }
                vx4Var = (vx4) dz4Var;
                obj = vx4Var.P;
                if (!(obj == null) && !(obj instanceof px4)) {
                    break;
                }
                z2 = true;
            } else {
                obj = vx4Var.P;
                if (!(obj instanceof px4)) {
                    return z2;
                }
            }
        }
    }

    public final void d(ux4 ux4Var) {
        ux4Var.a = null;
        while (true) {
            ux4 ux4Var2 = this.R;
            if (ux4Var2 != ux4.c) {
                ux4 ux4Var3 = null;
                while (ux4Var2 != null) {
                    ux4 ux4Var4 = ux4Var2.b;
                    if (ux4Var2.a != null) {
                        ux4Var3 = ux4Var2;
                    } else if (ux4Var3 != null) {
                        ux4Var3.b = ux4Var4;
                        if (ux4Var3.a == null) {
                            break;
                        }
                    } else if (!U.g(this, ux4Var2, ux4Var4)) {
                        break;
                    }
                    ux4Var2 = ux4Var4;
                }
                return;
            }
            return;
        }
    }

    @CheckForNull
    public String f() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    public void g() {
    }

    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.P;
        if ((obj2 != null) && (!(obj2 instanceof px4))) {
            return e(obj2);
        }
        ux4 ux4Var = this.R;
        if (ux4Var == ux4.c) {
            Object obj3 = this.P;
            obj3.getClass();
            return e(obj3);
        }
        ux4 ux4Var2 = new ux4();
        do {
            kx4 kx4Var = U;
            kx4Var.c(ux4Var2, ux4Var);
            if (kx4Var.g(this, ux4Var, ux4Var2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        d(ux4Var2);
                        throw new InterruptedException();
                    }
                    obj = this.P;
                } while (!((obj != null) & (!(obj instanceof px4))));
                return e(obj);
            }
            ux4Var = this.R;
        } while (ux4Var != ux4.c);
        Object obj32 = this.P;
        obj32.getClass();
        return e(obj32);
    }

    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.P;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof px4))) {
            return e(obj);
        }
        long j2 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ux4 ux4Var = this.R;
            if (ux4Var != ux4.c) {
                ux4 ux4Var2 = new ux4();
                while (true) {
                    kx4 kx4Var = U;
                    kx4Var.c(ux4Var2, ux4Var);
                    if (kx4Var.g(this, ux4Var, ux4Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                d(ux4Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.P;
                            if ((obj2 != null) && (!(obj2 instanceof px4))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        d(ux4Var2);
                        j2 = 0;
                    } else {
                        ux4Var = this.R;
                        if (ux4Var == ux4.c) {
                            break;
                        }
                    }
                }
            }
            Object obj3 = this.P;
            obj3.getClass();
            return e(obj3);
        }
        while (nanos > j2) {
            Object obj4 = this.P;
            if ((obj4 != null) && (!(obj4 instanceof px4))) {
                return e(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
            j2 = 0;
        }
        String vx4Var = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ij.c(str, " for ", vx4Var));
    }

    public boolean h(Object obj) {
        if (obj == null) {
            obj = V;
        }
        if (U.f(this, null, obj)) {
            p(this, false);
            return true;
        }
        return false;
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (U.f(this, null, new mx4(th))) {
            p(this, false);
            return true;
        }
        return false;
    }

    public boolean isCancelled() {
        return this.P instanceof lx4;
    }

    public boolean isDone() {
        Object obj = this.P;
        return (obj != null) & (!(obj instanceof px4));
    }

    public void l() {
    }

    public final void m(@CheckForNull dz4 dz4Var) {
        boolean z;
        boolean z2 = true;
        if (dz4Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.P instanceof lx4)) {
            Object obj = this.P;
            dz4Var.cancel(((obj instanceof lx4) && ((lx4) obj).a) ? false : false);
        }
    }

    public final void n(dz4 dz4Var) {
        mx4 mx4Var;
        dz4Var.getClass();
        Object obj = this.P;
        if (obj == null) {
            if (dz4Var.isDone()) {
                if (U.f(this, null, j(dz4Var))) {
                    p(this, false);
                    return;
                }
                return;
            }
            px4 px4Var = new px4(this, dz4Var);
            if (U.f(this, null, px4Var)) {
                try {
                    dz4Var.b(px4Var, py4.P);
                    return;
                } catch (Error | RuntimeException e) {
                    try {
                        mx4Var = new mx4(e);
                    } catch (Error | RuntimeException unused) {
                        mx4Var = mx4.b;
                    }
                    U.f(this, px4Var, mx4Var);
                    return;
                }
            }
            obj = this.P;
        }
        if (obj instanceof lx4) {
            dz4Var.cancel(((lx4) obj).a);
        }
    }

    public final void o(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object k = k(this);
            sb.append("SUCCESS, result=[");
            if (k == null) {
                hexString = "null";
            } else if (k == this) {
                hexString = "this future";
            } else {
                sb.append(k.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(k));
            }
            sb.append(hexString);
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String name;
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            name = getClass().getSimpleName();
        } else {
            name = getClass().getName();
        }
        sb.append(name);
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            o(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.P;
            if (obj instanceof px4) {
                sb.append(", setFuture=[");
                dz4<? extends V> dz4Var = ((px4) obj).Q;
                try {
                    if (dz4Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(dz4Var);
                    }
                } catch (RuntimeException | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
            } else {
                try {
                    concat = f();
                    if (ft4.a(concat)) {
                        concat = null;
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                }
                if (isDone()) {
                    sb.delete(length, sb.length());
                    o(sb);
                }
            }
            sb.append("]");
            if (isDone()) {
            }
        }
        sb.append("]");
        return sb.toString();
    }
}