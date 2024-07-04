package defpackage;

import defpackage.hv;
import defpackage.vg0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: cv  reason: default package */
public final class cv implements Closeable {
    public static final ThreadPoolExecutor m0;
    public final boolean P;
    public final c Q;
    public final String S;
    public int T;
    public int U;
    public boolean V;
    public final ScheduledThreadPoolExecutor W;
    public final ThreadPoolExecutor X;
    public final vg0.a Y;
    public long f0;
    public final bp5 h0;
    public final Socket i0;
    public final jv j0;
    public final e k0;
    public final LinkedHashSet l0;
    public final LinkedHashMap R = new LinkedHashMap();
    public long Z = 0;
    public long a0 = 0;
    public long b0 = 0;
    public long c0 = 0;
    public long d0 = 0;
    public long e0 = 0;
    public bp5 g0 = new bp5();

    /* renamed from: cv$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public Socket a;
        public String b;
        public bb c;
        public ab d;
        public c e = c.a;
        public int f;
    }

    /* renamed from: cv$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b extends a70 {
        public b() {
            super("OkHttp %s ping", cv.this.S);
        }

        @Override // defpackage.a70
        public final void b() {
            cv cvVar;
            boolean z;
            synchronized (cv.this) {
                cvVar = cv.this;
                long j = cvVar.a0;
                long j2 = cvVar.Z;
                if (j < j2) {
                    z = true;
                } else {
                    cvVar.Z = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                cvVar.a(2, 2, null);
                return;
            }
            try {
                cvVar.j0.y(1, 0, false);
            } catch (IOException e) {
                cvVar.a(2, 2, e);
            }
        }
    }

    /* renamed from: cv$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c {
        public static final a a = new a();

        /* renamed from: cv$c$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends c {
            @Override // defpackage.cv.c
            public final void b(iv ivVar) {
                ivVar.c(5, null);
            }
        }

        public void a(cv cvVar) {
        }

        public abstract void b(iv ivVar);
    }

    /* renamed from: cv$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class d extends a70 {
        public final boolean Q;
        public final int R;
        public final int S;

        public d(int i, int i2) {
            super("OkHttp %s ping %08x%08x", cv.this.S, Integer.valueOf(i), Integer.valueOf(i2));
            this.Q = true;
            this.R = i;
            this.S = i2;
        }

        @Override // defpackage.a70
        public final void b() {
            cv cvVar = cv.this;
            boolean z = this.Q;
            int i = this.R;
            int i2 = this.S;
            cvVar.getClass();
            try {
                cvVar.j0.y(i, i2, z);
            } catch (IOException e) {
                cvVar.a(2, 2, e);
            }
        }
    }

    /* renamed from: cv$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends a70 implements hv.b {
        public final hv Q;

        public e(hv hvVar) {
            super("OkHttp %s", cv.this.S);
            this.Q = hvVar;
        }

        @Override // defpackage.a70
        public final void b() {
            try {
                this.Q.g(this);
                do {
                } while (this.Q.d(false, this));
                cv.this.a(1, 6, null);
            } catch (IOException e) {
                cv.this.a(2, 2, e);
            } catch (Throwable th) {
                cv.this.a(3, 3, null);
                c31.c(this.Q);
                throw th;
            }
            c31.c(this.Q);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c31.a;
        m0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new z21("OkHttp Http2Connection", true));
    }

    public cv(a aVar) {
        bp5 bp5Var = new bp5();
        this.h0 = bp5Var;
        this.l0 = new LinkedHashSet();
        this.Y = vg0.a;
        this.P = true;
        this.Q = aVar.e;
        this.U = 3;
        this.g0.b(7, 16777216);
        String str = aVar.b;
        this.S = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new z21(c31.j("OkHttp %s Writer", str), false));
        this.W = scheduledThreadPoolExecutor;
        if (aVar.f != 0) {
            b bVar = new b();
            long j = aVar.f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(bVar, j, j, TimeUnit.MILLISECONDS);
        }
        this.X = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z21(c31.j("OkHttp %s Push Observer", str), true));
        bp5Var.b(7, 65535);
        bp5Var.b(5, 16384);
        this.f0 = bp5Var.a();
        this.i0 = aVar.a;
        this.j0 = new jv(aVar.d, true);
        this.k0 = new e(new hv(aVar.c, true));
    }

    public final void E(int i) {
        synchronized (this.j0) {
            synchronized (this) {
                if (this.V) {
                    return;
                }
                this.V = true;
                this.j0.t(this.T, i, c31.a);
            }
        }
    }

    public final synchronized void F(long j) {
        long j2 = this.e0 + j;
        this.e0 = j2;
        if (j2 >= this.g0.a() / 2) {
            I(this.e0, 0);
            this.e0 = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.j0.S);
        r6 = r3;
        r8.f0 -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(int i, boolean z, za zaVar, long j) {
        int min;
        long j2;
        boolean z2;
        if (j == 0) {
            this.j0.d(z, i, zaVar, 0);
            return;
        }
        loop0: while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        long j3 = this.f0;
                        if (j3 > 0) {
                            break;
                        } else if (!this.R.containsKey(Integer.valueOf(i))) {
                            break loop0;
                        } else {
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            j -= j2;
            jv jvVar = this.j0;
            if (z && j == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            jvVar.d(z2, i, zaVar, min);
        }
    }

    public final void H(int i, int i2) {
        try {
            this.W.execute(new vu(this, new Object[]{this.S, Integer.valueOf(i)}, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void I(long j, int i) {
        try {
            this.W.execute(new wu(this, new Object[]{this.S, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void a(int i, int i2, @Nullable IOException iOException) {
        try {
            E(i);
        } catch (IOException unused) {
        }
        iv[] ivVarArr = null;
        synchronized (this) {
            if (!this.R.isEmpty()) {
                ivVarArr = (iv[]) this.R.values().toArray(new iv[this.R.size()]);
                this.R.clear();
            }
        }
        if (ivVarArr != null) {
            for (iv ivVar : ivVarArr) {
                try {
                    ivVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.j0.close();
        } catch (IOException unused3) {
        }
        try {
            this.i0.close();
        } catch (IOException unused4) {
        }
        this.W.shutdown();
        this.X.shutdown();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 6, null);
    }

    public final void d(@Nullable IOException iOException) {
        a(2, 2, iOException);
    }

    public final void flush() {
        jv jvVar = this.j0;
        synchronized (jvVar) {
            if (!jvVar.T) {
                jvVar.P.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final synchronized iv g(int i) {
        return (iv) this.R.get(Integer.valueOf(i));
    }

    public final synchronized void t(a70 a70Var) {
        if (!this.V) {
            this.X.execute(a70Var);
        }
    }

    public final synchronized iv y(int i) {
        iv ivVar;
        ivVar = (iv) this.R.remove(Integer.valueOf(i));
        notifyAll();
        return ivVar;
    }
}