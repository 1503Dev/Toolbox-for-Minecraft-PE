package defpackage;

import defpackage.lu;
import defpackage.nl0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* renamed from: tu  reason: default package */
public final class tu implements ip {
    public final nb0 a;
    public final zj0 b;
    public final bb c;
    public final ab d;
    public int e = 0;
    public long f = 262144;
    public lu g;

    /* renamed from: tu$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public abstract class a implements mt0 {
        public final lr P;
        public boolean Q;

        public a() {
            this.P = new lr(tu.this.c.c());
        }

        public final void a() {
            int i = tu.this.e;
            if (i == 6) {
                return;
            }
            if (i == 5) {
                lr lrVar = this.P;
                cx0 cx0Var = lrVar.e;
                lrVar.e = cx0.d;
                cx0Var.a();
                cx0Var.b();
                tu.this.e = 6;
                return;
            }
            StringBuilder b = e5.b("state: ");
            b.append(tu.this.e);
            throw new IllegalStateException(b.toString());
        }

        @Override // defpackage.mt0
        public final cx0 c() {
            return this.P;
        }

        @Override // defpackage.mt0
        public long q(za zaVar, long j) {
            try {
                return tu.this.c.q(zaVar, j);
            } catch (IOException e) {
                tu.this.b.h();
                a();
                throw e;
            }
        }
    }

    /* renamed from: tu$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b implements dt0 {
        public final lr P;
        public boolean Q;

        public b() {
            this.P = new lr(tu.this.d.c());
        }

        @Override // defpackage.dt0
        public final cx0 c() {
            return this.P;
        }

        @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.Q) {
                return;
            }
            this.Q = true;
            tu.this.d.v("0\r\n\r\n");
            tu tuVar = tu.this;
            lr lrVar = this.P;
            tuVar.getClass();
            cx0 cx0Var = lrVar.e;
            lrVar.e = cx0.d;
            cx0Var.a();
            cx0Var.b();
            tu.this.e = 3;
        }

        @Override // defpackage.dt0
        public final void e(za zaVar, long j) {
            if (!this.Q) {
                if (j == 0) {
                    return;
                }
                tu.this.d.f(j);
                tu.this.d.v("\r\n");
                tu.this.d.e(zaVar, j);
                tu.this.d.v("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // defpackage.dt0, java.io.Flushable
        public final synchronized void flush() {
            if (this.Q) {
                return;
            }
            tu.this.d.flush();
        }
    }

    /* renamed from: tu$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends a {
        public final pv S;
        public long T;
        public boolean U;

        public c(pv pvVar) {
            super();
            this.T = -1L;
            this.U = true;
            this.S = pvVar;
        }

        @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.Q) {
                return;
            }
            if (this.U && !c31.i(this, TimeUnit.MILLISECONDS)) {
                tu.this.b.h();
                a();
            }
            this.Q = true;
        }

        @Override // defpackage.tu.a, defpackage.mt0
        public final long q(za zaVar, long j) {
            if (!this.Q) {
                if (!this.U) {
                    return -1L;
                }
                long j2 = this.T;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        tu.this.c.l();
                    }
                    try {
                        this.T = tu.this.c.B();
                        String trim = tu.this.c.l().trim();
                        if (this.T >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                            if (this.T == 0) {
                                this.U = false;
                                tu tuVar = tu.this;
                                tuVar.g = tuVar.k();
                                tu tuVar2 = tu.this;
                                mv.d(tuVar2.a.X, this.S, tuVar2.g);
                                a();
                            }
                            if (!this.U) {
                                return -1L;
                            }
                        } else {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.T + trim + "\"");
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long q = super.q(zaVar, Math.min(8192L, this.T));
                if (q != -1) {
                    this.T -= q;
                    return q;
                }
                tu.this.b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: tu$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends a {
        public long S;

        public d(long j) {
            super();
            this.S = j;
            if (j == 0) {
                a();
            }
        }

        @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.Q) {
                return;
            }
            if (this.S != 0 && !c31.i(this, TimeUnit.MILLISECONDS)) {
                tu.this.b.h();
                a();
            }
            this.Q = true;
        }

        @Override // defpackage.tu.a, defpackage.mt0
        public final long q(za zaVar, long j) {
            if (!this.Q) {
                long j2 = this.S;
                if (j2 == 0) {
                    return -1L;
                }
                long q = super.q(zaVar, Math.min(j2, 8192L));
                if (q != -1) {
                    long j3 = this.S - q;
                    this.S = j3;
                    if (j3 == 0) {
                        a();
                    }
                    return q;
                }
                tu.this.b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: tu$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class e implements dt0 {
        public final lr P;
        public boolean Q;

        public e() {
            this.P = new lr(tu.this.d.c());
        }

        @Override // defpackage.dt0
        public final cx0 c() {
            return this.P;
        }

        @Override // defpackage.dt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.Q) {
                return;
            }
            this.Q = true;
            tu tuVar = tu.this;
            lr lrVar = this.P;
            tuVar.getClass();
            cx0 cx0Var = lrVar.e;
            lrVar.e = cx0.d;
            cx0Var.a();
            cx0Var.b();
            tu.this.e = 3;
        }

        @Override // defpackage.dt0
        public final void e(za zaVar, long j) {
            if (!this.Q) {
                long j2 = zaVar.Q;
                byte[] bArr = c31.a;
                if ((0 | j) >= 0 && 0 <= j2 && j2 - 0 >= j) {
                    tu.this.d.e(zaVar, j);
                    return;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new IllegalStateException("closed");
        }

        @Override // defpackage.dt0, java.io.Flushable
        public final void flush() {
            if (this.Q) {
                return;
            }
            tu.this.d.flush();
        }
    }

    /* renamed from: tu$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f extends a {
        public boolean S;

        public f(tu tuVar) {
            super();
        }

        @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.Q) {
                return;
            }
            if (!this.S) {
                a();
            }
            this.Q = true;
        }

        @Override // defpackage.tu.a, defpackage.mt0
        public final long q(za zaVar, long j) {
            if (this.Q) {
                throw new IllegalStateException("closed");
            }
            if (this.S) {
                return -1L;
            }
            long q = super.q(zaVar, 8192L);
            if (q == -1) {
                this.S = true;
                a();
                return -1L;
            }
            return q;
        }
    }

    public tu(nb0 nb0Var, zj0 zj0Var, bb bbVar, ab abVar) {
        this.a = nb0Var;
        this.b = zj0Var;
        this.c = bbVar;
        this.d = abVar;
    }

    @Override // defpackage.ip
    public final void a(uk0 uk0Var) {
        boolean z;
        Proxy.Type type = this.b.c.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(uk0Var.b);
        sb.append(' ');
        if (!uk0Var.a.a.equals("https") && type == Proxy.Type.HTTP) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(uk0Var.a);
        } else {
            sb.append(bl0.a(uk0Var.a));
        }
        sb.append(" HTTP/1.1");
        l(uk0Var.c, sb.toString());
    }

    @Override // defpackage.ip
    public final mt0 b(nl0 nl0Var) {
        if (!mv.b(nl0Var)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(nl0Var.d("Transfer-Encoding"))) {
            pv pvVar = nl0Var.P.a;
            if (this.e == 4) {
                this.e = 5;
                return new c(pvVar);
            }
            StringBuilder b2 = e5.b("state: ");
            b2.append(this.e);
            throw new IllegalStateException(b2.toString());
        }
        long a2 = mv.a(nl0Var);
        if (a2 != -1) {
            return i(a2);
        }
        if (this.e == 4) {
            this.e = 5;
            this.b.h();
            return new f(this);
        }
        StringBuilder b3 = e5.b("state: ");
        b3.append(this.e);
        throw new IllegalStateException(b3.toString());
    }

    @Override // defpackage.ip
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.ip
    public final void cancel() {
        zj0 zj0Var = this.b;
        if (zj0Var != null) {
            c31.d(zj0Var.d);
        }
    }

    @Override // defpackage.ip
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.ip
    public final dt0 e(uk0 uk0Var, long j) {
        vk0 vk0Var = uk0Var.d;
        if (vk0Var != null && vk0Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(uk0Var.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new b();
            }
            StringBuilder b2 = e5.b("state: ");
            b2.append(this.e);
            throw new IllegalStateException(b2.toString());
        } else if (j != -1) {
            if (this.e == 1) {
                this.e = 2;
                return new e();
            }
            StringBuilder b3 = e5.b("state: ");
            b3.append(this.e);
            throw new IllegalStateException(b3.toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // defpackage.ip
    public final long f(nl0 nl0Var) {
        if (mv.b(nl0Var)) {
            if ("chunked".equalsIgnoreCase(nl0Var.d("Transfer-Encoding"))) {
                return -1L;
            }
            return mv.a(nl0Var);
        }
        return 0L;
    }

    @Override // defpackage.ip
    public final nl0.a g(boolean z) {
        String str;
        int i = this.e;
        if (i != 1 && i != 3) {
            StringBuilder b2 = e5.b("state: ");
            b2.append(this.e);
            throw new IllegalStateException(b2.toString());
        }
        try {
            yt0 a2 = yt0.a(j());
            nl0.a aVar = new nl0.a();
            aVar.b = a2.a;
            aVar.c = a2.b;
            aVar.d = a2.c;
            aVar.f = k().e();
            if (z && a2.b == 100) {
                return null;
            }
            if (a2.b == 100) {
                this.e = 3;
                return aVar;
            }
            this.e = 4;
            return aVar;
        } catch (EOFException e2) {
            zj0 zj0Var = this.b;
            if (zj0Var != null) {
                str = zj0Var.c.a.a.o();
            } else {
                str = "unknown";
            }
            throw new IOException(k6.b("unexpected end of stream on ", str), e2);
        }
    }

    @Override // defpackage.ip
    public final zj0 h() {
        return this.b;
    }

    public final d i(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new d(j);
        }
        StringBuilder b2 = e5.b("state: ");
        b2.append(this.e);
        throw new IllegalStateException(b2.toString());
    }

    public final String j() {
        String r = this.c.r(this.f);
        this.f -= r.length();
        return r;
    }

    public final lu k() {
        String str;
        lu.a aVar = new lu.a();
        while (true) {
            String j = j();
            if (j.length() != 0) {
                dy.a.getClass();
                int indexOf = j.indexOf(":", 1);
                if (indexOf != -1) {
                    str = j.substring(0, indexOf);
                    j = j.substring(indexOf + 1);
                } else {
                    if (j.startsWith(":")) {
                        j = j.substring(1);
                    }
                    str = "";
                }
                aVar.b(str, j);
            } else {
                return new lu(aVar);
            }
        }
    }

    public final void l(lu luVar, String str) {
        if (this.e == 0) {
            this.d.v(str).v("\r\n");
            int length = luVar.a.length / 2;
            for (int i = 0; i < length; i++) {
                this.d.v(luVar.d(i)).v(": ").v(luVar.g(i)).v("\r\n");
            }
            this.d.v("\r\n");
            this.e = 1;
            return;
        }
        StringBuilder b2 = e5.b("state: ");
        b2.append(this.e);
        throw new IllegalStateException(b2.toString());
    }
}