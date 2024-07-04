package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: t7  reason: default package */
public class t7 extends cx0 {
    public static final long h;
    public static final long i;
    @Nullable
    public static t7 j;
    public boolean e;
    @Nullable
    public t7 f;
    public long g;

    /* renamed from: t7$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.o();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            while (true) {
                synchronized (t7.class) {
                    try {
                        t7 i = t7.i();
                        if (i != null) {
                            if (i == t7.j) {
                                t7.j = null;
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static t7 i() {
        t7 t7Var = j.f;
        long nanoTime = System.nanoTime();
        if (t7Var == null) {
            t7.class.wait(h);
            if (j.f != null || System.nanoTime() - nanoTime < i) {
                return null;
            }
            return j;
        }
        long j2 = t7Var.g - nanoTime;
        if (j2 > 0) {
            long j3 = j2 / 1000000;
            t7.class.wait(j3, (int) (j2 - (1000000 * j3)));
            return null;
        }
        j.f = t7Var.f;
        t7Var.f = null;
        return t7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {, blocks: (B:10:0x0017, B:12:0x001b, B:13:0x002a, B:16:0x0034, B:19:0x0042, B:22:0x004e, B:23:0x0053, B:25:0x0057, B:29:0x0061, B:31:0x0069, B:21:0x0048, B:34:0x006e, B:35:0x0073), top: B:42:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        t7 t7Var;
        t7 t7Var2;
        if (!this.e) {
            long j2 = this.c;
            boolean z = this.a;
            if (j2 == 0 && !z) {
                return;
            }
            this.e = true;
            synchronized (t7.class) {
                if (j == null) {
                    j = new t7();
                    new a().start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    j2 = Math.min(j2, c() - nanoTime);
                } else if (j2 == 0) {
                    if (z) {
                        this.g = c();
                        long j3 = this.g - nanoTime;
                        t7Var = j;
                        while (true) {
                            t7Var2 = t7Var.f;
                            if (t7Var2 != null || j3 < t7Var2.g - nanoTime) {
                                break;
                            }
                            t7Var = t7Var2;
                        }
                        this.f = t7Var2;
                        t7Var.f = this;
                        if (t7Var == j) {
                            t7.class.notify();
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
                this.g = j2 + nanoTime;
                long j32 = this.g - nanoTime;
                t7Var = j;
                while (true) {
                    t7Var2 = t7Var.f;
                    if (t7Var2 != null) {
                        break;
                        break;
                    }
                    t7Var = t7Var2;
                }
                this.f = t7Var2;
                t7Var.f = this;
                if (t7Var == j) {
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final IOException k(IOException iOException) {
        return !m() ? iOException : n(iOException);
    }

    public final void l(boolean z) {
        if (m() && z) {
            throw n(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        r2.f = r4.f;
        r4.f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean z = false;
        if (this.e) {
            this.e = false;
            synchronized (t7.class) {
                t7 t7Var = j;
                while (true) {
                    if (t7Var == null) {
                        z = true;
                        break;
                    }
                    t7 t7Var2 = t7Var.f;
                    if (t7Var2 == this) {
                        break;
                    }
                    t7Var = t7Var2;
                }
            }
            return z;
        }
        return false;
    }

    public IOException n(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void o() {
    }
}