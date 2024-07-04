package defpackage;

import defpackage.f61;
import defpackage.g61;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: ek0  reason: default package */
public final class ek0 implements c61, f61.a {
    public static final List<ig0> v = Collections.singletonList(ig0.HTTP_1_1);
    public final uk0 a;
    public final d61 b;
    public final Random c;
    public final long d;
    public final String e;
    public xj0 f;
    public final zo g;
    public f61 h;
    public g61 i;
    public ScheduledThreadPoolExecutor j;
    public e k;
    public long n;
    public boolean o;
    public ScheduledFuture<?> p;
    public String r;
    public boolean s;
    public int t;
    public boolean u;
    public final ArrayDeque<fb> l = new ArrayDeque<>();
    public final ArrayDeque<Object> m = new ArrayDeque<>();
    public int q = -1;

    /* renamed from: ek0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ek0.this.f.Q.a();
        }
    }

    /* renamed from: ek0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public final int a;
        public final fb b;
        public final long c = 60000;

        public b(int i, fb fbVar) {
            this.a = i;
            this.b = fbVar;
        }
    }

    /* renamed from: ek0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c {
        public final int a;
        public final fb b;

        public c(int i, fb fbVar) {
            this.a = i;
            this.b = fbVar;
        }
    }

    /* renamed from: ek0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            ek0 ek0Var = ek0.this;
            synchronized (ek0Var) {
                if (!ek0Var.s) {
                    g61 g61Var = ek0Var.i;
                    if (ek0Var.u) {
                        i = ek0Var.t;
                    } else {
                        i = -1;
                    }
                    ek0Var.t++;
                    ek0Var.u = true;
                    if (i != -1) {
                        StringBuilder b = e5.b("sent ping but didn't receive pong within ");
                        b.append(ek0Var.d);
                        b.append("ms (after ");
                        b.append(i - 1);
                        b.append(" successful ping/pongs)");
                        e = new SocketTimeoutException(b.toString());
                    } else {
                        try {
                            g61Var.a(9, fb.T);
                            return;
                        } catch (IOException e) {
                            e = e;
                        }
                    }
                    ek0Var.c(e, null);
                }
            }
        }
    }

    /* renamed from: ek0$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class e implements Closeable {
        public final boolean P = true;
        public final bb Q;
        public final ab R;

        public e(bb bbVar, ab abVar) {
            this.Q = bbVar;
            this.R = abVar;
        }
    }

    public ek0(uk0 uk0Var, d61 d61Var, Random random, long j) {
        if ("GET".equals(uk0Var.b)) {
            this.a = uk0Var;
            this.b = d61Var;
            this.c = random;
            this.d = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.e = fb.k(bArr).e();
            this.g = new zo(2, this);
            return;
        }
        StringBuilder b2 = e5.b("Request must be GET: ");
        b2.append(uk0Var.b);
        throw new IllegalArgumentException(b2.toString());
    }

    public final void a(nl0 nl0Var, @Nullable hp hpVar) {
        if (nl0Var.R == 101) {
            String d2 = nl0Var.d("Connection");
            if ("Upgrade".equalsIgnoreCase(d2)) {
                String d3 = nl0Var.d("Upgrade");
                if ("websocket".equalsIgnoreCase(d3)) {
                    String d4 = nl0Var.d("Sec-WebSocket-Accept");
                    try {
                        String e2 = fb.k(MessageDigest.getInstance("SHA-1").digest(fb.h(this.e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").P)).e();
                        if (e2.equals(d4)) {
                            if (hpVar != null) {
                                return;
                            }
                            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + e2 + "' but was '" + d4 + "'");
                    } catch (NoSuchAlgorithmException e3) {
                        throw new AssertionError(e3);
                    }
                }
                throw new ProtocolException(ij.c("Expected 'Upgrade' header value 'websocket' but was '", d3, "'"));
            }
            throw new ProtocolException(ij.c("Expected 'Connection' header value 'Upgrade' but was '", d2, "'"));
        }
        StringBuilder b2 = e5.b("Expected HTTP 101 response but was '");
        b2.append(nl0Var.R);
        b2.append(" ");
        throw new ProtocolException(qq.d(b2, nl0Var.S, "'"));
    }

    public final boolean b(int i) {
        boolean z;
        synchronized (this) {
            String a2 = e61.a(i);
            if (a2 == null) {
                if (!this.s && !this.o) {
                    z = true;
                    this.o = true;
                    this.m.add(new b(i, null));
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.j;
                    if (scheduledThreadPoolExecutor != null) {
                        scheduledThreadPoolExecutor.execute(this.g);
                    }
                }
                z = false;
            } else {
                throw new IllegalArgumentException(a2);
            }
        }
        return z;
    }

    public final void c(Exception exc, @Nullable nl0 nl0Var) {
        synchronized (this) {
            if (this.s) {
                return;
            }
            this.s = true;
            e eVar = this.k;
            this.k = null;
            ScheduledFuture<?> scheduledFuture = this.p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.j;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdown();
            }
            try {
                this.b.onFailure(this, exc, nl0Var);
            } finally {
                c31.c(eVar);
            }
        }
    }

    public final void d(String str, yj0 yj0Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (this) {
            try {
                this.k = yj0Var;
                this.i = new g61(yj0Var.P, yj0Var.R, this.c);
                byte[] bArr = c31.a;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new z21(str, false));
                this.j = scheduledThreadPoolExecutor2;
                long j = this.d;
                if (j != 0) {
                    scheduledThreadPoolExecutor2.scheduleAtFixedRate(new d(), j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.m.isEmpty() && (scheduledThreadPoolExecutor = this.j) != null) {
                    scheduledThreadPoolExecutor.execute(this.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h = new f61(yj0Var.P, yj0Var.Q, this);
    }

    public final void e() {
        while (this.q == -1) {
            f61 f61Var = this.h;
            f61Var.b();
            if (f61Var.h) {
                f61Var.a();
            } else {
                int i = f61Var.e;
                if (i != 1 && i != 2) {
                    StringBuilder b2 = e5.b("Unknown opcode: ");
                    b2.append(Integer.toHexString(i));
                    throw new ProtocolException(b2.toString());
                }
                while (!f61Var.d) {
                    long j = f61Var.f;
                    if (j > 0) {
                        f61Var.b.z(f61Var.j, j);
                        if (!f61Var.a) {
                            f61Var.j.I(f61Var.l);
                            f61Var.l.a(f61Var.j.Q - f61Var.f);
                            e61.b(f61Var.l, f61Var.k);
                            f61Var.l.close();
                        }
                    }
                    if (f61Var.g) {
                        if (i == 1) {
                            f61.a aVar = f61Var.c;
                            ek0 ek0Var = (ek0) aVar;
                            ek0Var.b.onMessage(ek0Var, f61Var.j.M());
                        } else {
                            f61.a aVar2 = f61Var.c;
                            ek0 ek0Var2 = (ek0) aVar2;
                            ek0Var2.b.onMessage(ek0Var2, f61Var.j.K());
                        }
                    } else {
                        while (!f61Var.d) {
                            f61Var.b();
                            if (!f61Var.h) {
                                break;
                            }
                            f61Var.a();
                        }
                        if (f61Var.e != 0) {
                            StringBuilder b3 = e5.b("Expected continuation opcode. Got: ");
                            b3.append(Integer.toHexString(f61Var.e));
                            throw new ProtocolException(b3.toString());
                        }
                    }
                }
                throw new IOException("closed");
            }
        }
    }

    public final synchronized boolean f(int i, fb fbVar) {
        if (!this.s && !this.o) {
            long j = this.n;
            byte[] bArr = fbVar.P;
            if (bArr.length + j > 16777216) {
                b(1001);
                return false;
            }
            this.n = j + bArr.length;
            this.m.add(new c(i, fbVar));
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.j;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.execute(this.g);
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        e eVar;
        String str;
        String a2;
        synchronized (this) {
            if (this.s) {
                return false;
            }
            g61 g61Var = this.i;
            fb poll = this.l.poll();
            int i = -1;
            c cVar = null;
            if (poll == null) {
                Object poll2 = this.m.poll();
                if (poll2 instanceof b) {
                    int i2 = this.q;
                    str = this.r;
                    if (i2 != -1) {
                        e eVar2 = this.k;
                        this.k = null;
                        this.j.shutdown();
                        cVar = poll2;
                        eVar = eVar2;
                        i = i2;
                    } else {
                        this.p = this.j.schedule(new a(), ((b) poll2).c, TimeUnit.MILLISECONDS);
                        i = i2;
                        eVar = null;
                        cVar = poll2;
                    }
                } else if (poll2 == null) {
                    return false;
                } else {
                    str = null;
                    cVar = poll2;
                    eVar = null;
                }
            } else {
                eVar = null;
                str = null;
            }
            try {
                if (poll != null) {
                    g61Var.a(10, poll);
                } else if (cVar instanceof c) {
                    fb fbVar = cVar.b;
                    int i3 = cVar.a;
                    long n = fbVar.n();
                    if (!g61Var.h) {
                        g61Var.h = true;
                        g61.a aVar = g61Var.g;
                        aVar.P = i3;
                        aVar.Q = n;
                        aVar.R = true;
                        aVar.S = false;
                        Logger logger = rb0.a;
                        vj0 vj0Var = new vj0(aVar);
                        vj0Var.A(fbVar);
                        vj0Var.close();
                        synchronized (this) {
                            this.n -= fbVar.n();
                        }
                    } else {
                        throw new IllegalStateException("Another message writer is active. Did you call close()?");
                    }
                } else if (cVar instanceof b) {
                    b bVar = (b) cVar;
                    int i4 = bVar.a;
                    fb fbVar2 = bVar.b;
                    g61Var.getClass();
                    fb fbVar3 = fb.T;
                    if (i4 != 0 || fbVar2 != null) {
                        if (i4 != 0 && (a2 = e61.a(i4)) != null) {
                            throw new IllegalArgumentException(a2);
                        }
                        za zaVar = new za();
                        zaVar.W(i4);
                        if (fbVar2 != null) {
                            zaVar.R(fbVar2);
                        }
                        fbVar3 = zaVar.K();
                    }
                    g61Var.a(8, fbVar3);
                    g61Var.e = true;
                    if (eVar != null) {
                        this.b.onClosed(this, i, str);
                    }
                } else {
                    throw new AssertionError();
                }
                return true;
            } finally {
                c31.c(eVar);
            }
        }
    }
}