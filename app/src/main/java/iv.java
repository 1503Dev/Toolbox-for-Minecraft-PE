package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;

/* renamed from: iv  reason: default package */
public final class iv {
    public long a = 0;
    public long b;
    public final int c;
    public final cv d;
    public final ArrayDeque e;
    public boolean f;
    public final b g;
    public final a h;
    public final c i;
    public final c j;
    @Nullable
    public int k;
    @Nullable
    public IOException l;

    /* renamed from: iv$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a implements dt0 {
        public final za P = new za();
        public boolean Q;
        public boolean R;

        public a() {
        }

        public final void a(boolean z) {
            iv ivVar;
            long min;
            iv ivVar2;
            boolean z2;
            synchronized (iv.this) {
                iv.this.j.j();
                while (true) {
                    ivVar = iv.this;
                    if (ivVar.b > 0 || this.R || this.Q || ivVar.k != 0) {
                        break;
                    }
                    ivVar.i();
                }
                ivVar.j.p();
                iv.this.b();
                min = Math.min(iv.this.b, this.P.Q);
                ivVar2 = iv.this;
                ivVar2.b -= min;
            }
            ivVar2.j.j();
            if (z) {
                try {
                    if (min == this.P.Q) {
                        z2 = true;
                        iv ivVar3 = iv.this;
                        ivVar3.d.G(ivVar3.c, z2, this.P, min);
                        iv.this.j.p();
                    }
                } catch (Throwable th) {
                    iv.this.j.p();
                    throw th;
                }
            }
            z2 = false;
            iv ivVar32 = iv.this;
            ivVar32.d.G(ivVar32.c, z2, this.P, min);
            iv.this.j.p();
        }

        @Override // defpackage.dt0
        public final cx0 c() {
            return iv.this.j;
        }

        @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z;
            synchronized (iv.this) {
                if (this.Q) {
                    return;
                }
                iv ivVar = iv.this;
                if (!ivVar.h.R) {
                    if (this.P.Q > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        while (this.P.Q > 0) {
                            a(true);
                        }
                    } else {
                        ivVar.d.G(ivVar.c, true, null, 0L);
                    }
                }
                synchronized (iv.this) {
                    this.Q = true;
                }
                iv.this.d.flush();
                iv.this.a();
            }
        }

        @Override // defpackage.dt0
        public final void e(za zaVar, long j) {
            this.P.e(zaVar, j);
            while (this.P.Q >= 16384) {
                a(false);
            }
        }

        @Override // defpackage.dt0, java.io.Flushable
        public final void flush() {
            synchronized (iv.this) {
                iv.this.b();
            }
            while (this.P.Q > 0) {
                a(false);
                iv.this.d.flush();
            }
        }
    }

    /* renamed from: iv$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b implements mt0 {
        public final za P = new za();
        public final za Q = new za();
        public final long R;
        public boolean S;
        public boolean T;

        public b(long j) {
            this.R = j;
        }

        @Override // defpackage.mt0
        public final cx0 c() {
            return iv.this.i;
        }

        @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            synchronized (iv.this) {
                this.S = true;
                za zaVar = this.Q;
                j = zaVar.Q;
                zaVar.a();
                iv.this.notifyAll();
            }
            if (j > 0) {
                iv.this.d.F(j);
            }
            iv.this.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
            r0 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
        @Override // defpackage.mt0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long q(za zaVar, long j) {
            long q;
            while (true) {
                Throwable th = null;
                synchronized (iv.this) {
                    iv.this.i.j();
                    iv ivVar = iv.this;
                    if (ivVar.k != 0 && (th = ivVar.l) == null) {
                        th = new du0(iv.this.k);
                    }
                    if (!this.S) {
                        za zaVar2 = this.Q;
                        long j2 = zaVar2.Q;
                        if (j2 > 0) {
                            q = zaVar2.q(zaVar, Math.min(8192L, j2));
                            iv ivVar2 = iv.this;
                            long j3 = ivVar2.a + q;
                            ivVar2.a = j3;
                            if (th == null && j3 >= ivVar2.d.g0.a() / 2) {
                                iv ivVar3 = iv.this;
                                ivVar3.d.I(ivVar3.a, ivVar3.c);
                                iv.this.a = 0L;
                            }
                        } else if (this.T || th != null) {
                            break;
                        } else {
                            iv.this.i();
                            iv.this.i.p();
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                }
                if (q == -1) {
                    iv.this.d.F(q);
                    return q;
                } else if (th == null) {
                    return -1L;
                } else {
                    throw th;
                }
            }
            iv.this.i.p();
            if (q == -1) {
            }
        }
    }

    /* renamed from: iv$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends t7 {
        public c() {
        }

        @Override // defpackage.t7
        public final IOException n(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // defpackage.t7
        public final void o() {
            iv.this.e(6);
            cv cvVar = iv.this.d;
            synchronized (cvVar) {
                long j = cvVar.c0;
                long j2 = cvVar.b0;
                if (j >= j2) {
                    cvVar.b0 = j2 + 1;
                    cvVar.d0 = System.nanoTime() + 1000000000;
                    try {
                        cvVar.W.execute(new xu(cvVar, cvVar.S));
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        public final void p() {
            if (m()) {
                throw n(null);
            }
        }
    }

    public iv(int i, cv cvVar, boolean z, boolean z2, @Nullable lu luVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.i = new c();
        this.j = new c();
        if (cvVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = i;
        this.d = cvVar;
        this.b = cvVar.h0.a();
        b bVar = new b(cvVar.g0.a());
        this.g = bVar;
        a aVar = new a();
        this.h = aVar;
        bVar.T = z2;
        aVar.R = z;
        if (luVar != null) {
            arrayDeque.add(luVar);
        }
        if (f() && luVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && luVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void a() {
        boolean z;
        boolean g;
        synchronized (this) {
            b bVar = this.g;
            if (!bVar.T && bVar.S) {
                a aVar = this.h;
                if (aVar.R || aVar.Q) {
                    z = true;
                    g = g();
                }
            }
            z = false;
            g = g();
        }
        if (z) {
            c(6, null);
        } else if (g) {
        } else {
            this.d.y(this.c);
        }
    }

    public final void b() {
        a aVar = this.h;
        if (aVar.Q) {
            throw new IOException("stream closed");
        }
        if (aVar.R) {
            throw new IOException("stream finished");
        }
        if (this.k != 0) {
            IOException iOException = this.l;
            if (iOException == null) {
                throw new du0(this.k);
            }
        }
    }

    public final void c(int i, @Nullable IOException iOException) {
        if (!d(i, iOException)) {
            return;
        }
        cv cvVar = this.d;
        cvVar.j0.E(this.c, i);
    }

    public final boolean d(int i, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.T && this.h.R) {
                return false;
            }
            this.k = i;
            this.l = iOException;
            notifyAll();
            this.d.y(this.c);
            return true;
        }
    }

    public final void e(int i) {
        if (d(i, null)) {
            this.d.H(this.c, i);
        }
    }

    public final boolean f() {
        return this.d.P == ((this.c & 1) == 1);
    }

    public final synchronized boolean g() {
        if (this.k != 0) {
            return false;
        }
        b bVar = this.g;
        if (bVar.T || bVar.S) {
            a aVar = this.h;
            if (aVar.R || aVar.Q) {
                if (this.f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:10:0x0018, B:11:0x001c, B:12:0x0023, B:8:0x000f), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(lu luVar, boolean z) {
        boolean g;
        synchronized (this) {
            if (this.f && z) {
                this.g.getClass();
                if (z) {
                    this.g.T = true;
                }
                g = g();
                notifyAll();
            }
            this.f = true;
            this.e.add(luVar);
            if (z) {
            }
            g = g();
            notifyAll();
        }
        if (!g) {
            this.d.y(this.c);
        }
    }

    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}