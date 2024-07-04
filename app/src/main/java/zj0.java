package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.cv;
import defpackage.nl0;
import defpackage.tu;
import defpackage.uk0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: zj0  reason: default package */
public final class zj0 extends cv.c {
    public final ak0 b;
    public final lm0 c;
    public Socket d;
    public Socket e;
    public eu f;
    public ig0 g;
    public cv h;
    public wj0 i;
    public vj0 j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o = 1;
    public final ArrayList p = new ArrayList();
    public long q = RecyclerView.FOREVER_NS;

    public zj0(ak0 ak0Var, lm0 lm0Var) {
        this.b = ak0Var;
        this.c = lm0Var;
    }

    @Override // defpackage.cv.c
    public final void a(cv cvVar) {
        int i;
        synchronized (this.b) {
            try {
                synchronized (cvVar) {
                    bp5 bp5Var = cvVar.h0;
                    i = Integer.MAX_VALUE;
                    if ((bp5Var.P & 16) != 0) {
                        i = ((int[]) bp5Var.Q)[4];
                    }
                }
                this.o = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cv.c
    public final void b(iv ivVar) {
        ivVar.c(5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, int i2, int i3, int i4, boolean z, fp fpVar) {
        boolean z2;
        boolean z3;
        lm0 lm0Var;
        int i5;
        if (this.g == null) {
            m3 m3Var = this.c.a;
            List<Cif> list = m3Var.f;
            jf jfVar = new jf(list);
            if (m3Var.i == null) {
                if (list.contains(Cif.f)) {
                    String str = this.c.a.a.d;
                    if (!ne0.a.l(str)) {
                        throw new mm0(new UnknownServiceException(ij.c("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new mm0(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (m3Var.e.contains(ig0.H2_PRIOR_KNOWLEDGE)) {
                throw new mm0(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            mm0 mm0Var = null;
            do {
                boolean z4 = true;
                z2 = false;
                try {
                    lm0 lm0Var2 = this.c;
                    if (lm0Var2.a.i != null && lm0Var2.b.type() == Proxy.Type.HTTP) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        e(i, i2, i3, fpVar);
                        if (this.d == null) {
                            lm0Var = this.c;
                            if (!((lm0Var.a.i == null && lm0Var.b.type() == Proxy.Type.HTTP) ? false : false) && this.d == null) {
                                throw new mm0(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            if (this.h == null) {
                                synchronized (this.b) {
                                    cv cvVar = this.h;
                                    synchronized (cvVar) {
                                        bp5 bp5Var = cvVar.h0;
                                        i5 = Integer.MAX_VALUE;
                                        if ((bp5Var.P & 16) != 0) {
                                            i5 = ((int[]) bp5Var.Q)[4];
                                        }
                                    }
                                    this.o = i5;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        d(i, i2, fpVar);
                    }
                    f(jfVar, i4, fpVar);
                    InetSocketAddress inetSocketAddress = this.c.c;
                    fpVar.getClass();
                    lm0Var = this.c;
                    if (!((lm0Var.a.i == null && lm0Var.b.type() == Proxy.Type.HTTP) ? false : false)) {
                    }
                    if (this.h == null) {
                    }
                } catch (IOException e) {
                    c31.d(this.e);
                    c31.d(this.d);
                    this.e = null;
                    this.d = null;
                    this.i = null;
                    this.j = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    InetSocketAddress inetSocketAddress2 = this.c.c;
                    fpVar.getClass();
                    if (mm0Var == null) {
                        mm0Var = new mm0(e);
                    } else {
                        IOException iOException = mm0Var.P;
                        Method method = c31.j;
                        if (method != null) {
                            try {
                                method.invoke(iOException, e);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                        mm0Var.Q = e;
                    }
                    if (!z) {
                        break;
                    }
                    jfVar.d = true;
                    if (jfVar.c) {
                        if (e instanceof ProtocolException) {
                            continue;
                        } else if (e instanceof InterruptedIOException) {
                            continue;
                        } else if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            continue;
                        } else if (e instanceof SSLPeerUnverifiedException) {
                            continue;
                        } else {
                            z2 = e instanceof SSLException;
                            continue;
                        }
                    }
                    if (!z2) {
                    }
                    throw mm0Var;
                }
            } while (!z2);
            throw mm0Var;
        }
        throw new IllegalStateException("already connected");
    }

    public final void d(int i, int i2, fp fpVar) {
        Socket createSocket;
        lm0 lm0Var = this.c;
        Proxy proxy = lm0Var.b;
        m3 m3Var = lm0Var.a;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = m3Var.c.createSocket();
        }
        this.d = createSocket;
        InetSocketAddress inetSocketAddress = this.c.c;
        fpVar.getClass();
        this.d.setSoTimeout(i2);
        try {
            ne0.a.h(this.d, this.c.c, i);
            try {
                this.i = new wj0(rb0.b(this.d));
                this.j = new vj0(rb0.a(this.d));
            } catch (NullPointerException e) {
                if (!"throw with null exception".equals(e.getMessage())) {
                    return;
                }
                throw new IOException(e);
            }
        } catch (ConnectException e2) {
            StringBuilder b = e5.b("Failed to connect to ");
            b.append(this.c.c);
            ConnectException connectException = new ConnectException(b.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void e(int i, int i2, int i3, fp fpVar) {
        uk0.a aVar = new uk0.a();
        aVar.e(this.c.a.a);
        aVar.b("CONNECT", null);
        aVar.c.d("Host", c31.k(this.c.a.a, true));
        aVar.c.d("Proxy-Connection", "Keep-Alive");
        aVar.c.d("User-Agent", "okhttp/3.14.7");
        uk0 a = aVar.a();
        nl0.a aVar2 = new nl0.a();
        aVar2.a = a;
        aVar2.b = ig0.HTTP_1_1;
        aVar2.c = 407;
        aVar2.d = "Preemptive Authenticate";
        aVar2.g = c31.d;
        aVar2.k = -1L;
        aVar2.l = -1L;
        aVar2.f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.a();
        this.c.a.d.getClass();
        pv pvVar = a.a;
        d(i, i2, fpVar);
        String str = "CONNECT " + c31.k(pvVar, true) + " HTTP/1.1";
        wj0 wj0Var = this.i;
        tu tuVar = new tu(null, null, wj0Var, this.j);
        cx0 c = wj0Var.c();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c.g(j, timeUnit);
        this.j.c().g(i3, timeUnit);
        tuVar.l(a.c, str);
        tuVar.c();
        nl0.a g = tuVar.g(false);
        g.a = a;
        nl0 a2 = g.a();
        long a3 = mv.a(a2);
        if (a3 != -1) {
            tu.d i4 = tuVar.i(a3);
            c31.r(i4, Integer.MAX_VALUE, timeUnit);
            i4.close();
        }
        int i5 = a2.R;
        if (i5 != 200) {
            if (i5 == 407) {
                this.c.a.d.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder b = e5.b("Unexpected response code for CONNECT: ");
            b.append(a2.R);
            throw new IOException(b.toString());
        } else if (this.i.P.n() && this.j.P.n()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void f(jf jfVar, int i, fp fpVar) {
        SSLSocket sSLSocket;
        ig0 ig0Var = ig0.HTTP_1_1;
        m3 m3Var = this.c.a;
        if (m3Var.i == null) {
            List<ig0> list = m3Var.e;
            ig0 ig0Var2 = ig0.H2_PRIOR_KNOWLEDGE;
            if (list.contains(ig0Var2)) {
                this.e = this.d;
                this.g = ig0Var2;
                i(i);
                return;
            }
            this.e = this.d;
            this.g = ig0Var;
            return;
        }
        fpVar.getClass();
        m3 m3Var2 = this.c.a;
        SSLSocketFactory sSLSocketFactory = m3Var2.i;
        String str = null;
        try {
            try {
                Socket socket = this.d;
                pv pvVar = m3Var2.a;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, pvVar.d, pvVar.e, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            Cif a = jfVar.a(sSLSocket);
            if (a.b) {
                ne0.a.g(sSLSocket, m3Var2.a.d, m3Var2.e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            eu a2 = eu.a(session);
            if (!m3Var2.j.verify(m3Var2.a.d, session)) {
                List<Certificate> list2 = a2.c;
                if (!list2.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + m3Var2.a.d + " not verified:\n    certificate: " + oc.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + lb0.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + m3Var2.a.d + " not verified (no certificates)");
            }
            m3Var2.k.a(m3Var2.a.d, a2.c);
            if (a.b) {
                str = ne0.a.j(sSLSocket);
            }
            this.e = sSLSocket;
            this.i = new wj0(rb0.b(sSLSocket));
            this.j = new vj0(rb0.a(this.e));
            this.f = a2;
            if (str != null) {
                ig0Var = ig0.b(str);
            }
            this.g = ig0Var;
            ne0.a.a(sSLSocket);
            if (this.g == ig0.HTTP_2) {
                i(i);
            }
        } catch (AssertionError e2) {
            e = e2;
            if (c31.o(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                ne0.a.a(sSLSocket);
            }
            c31.d(sSLSocket);
            throw th;
        }
    }

    public final ip g(nb0 nb0Var, bk0 bk0Var) {
        if (this.h != null) {
            return new gv(nb0Var, this, bk0Var, this.h);
        }
        this.e.setSoTimeout(bk0Var.h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.i.c().g(bk0Var.h, timeUnit);
        this.j.c().g(bk0Var.i, timeUnit);
        return new tu(nb0Var, this, this.i, this.j);
    }

    public final void h() {
        synchronized (this.b) {
            this.k = true;
        }
    }

    public final void i(int i) {
        boolean z;
        int i2;
        this.e.setSoTimeout(0);
        cv.a aVar = new cv.a();
        Socket socket = this.e;
        String str = this.c.a.a.d;
        wj0 wj0Var = this.i;
        vj0 vj0Var = this.j;
        aVar.a = socket;
        aVar.b = str;
        aVar.c = wj0Var;
        aVar.d = vj0Var;
        aVar.e = this;
        aVar.f = i;
        cv cvVar = new cv(aVar);
        this.h = cvVar;
        jv jvVar = cvVar.j0;
        synchronized (jvVar) {
            if (!jvVar.T) {
                if (jvVar.Q) {
                    Logger logger = jv.V;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(c31.j(">> CONNECTION %s", uu.a.j()));
                    }
                    jvVar.P.write((byte[]) uu.a.P.clone());
                    jvVar.P.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        jv jvVar2 = cvVar.j0;
        bp5 bp5Var = cvVar.g0;
        synchronized (jvVar2) {
            if (!jvVar2.T) {
                jvVar2.g(0, Integer.bitCount(bp5Var.P) * 6, (byte) 4, (byte) 0);
                for (int i3 = 0; i3 < 10; i3++) {
                    if (((1 << i3) & bp5Var.P) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (i3 == 4) {
                            i2 = 3;
                        } else if (i3 == 7) {
                            i2 = 4;
                        } else {
                            i2 = i3;
                        }
                        jvVar2.P.writeShort(i2);
                        jvVar2.P.writeInt(((int[]) bp5Var.Q)[i3]);
                    }
                }
                jvVar2.P.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = cvVar.g0.a();
        if (a != 65535) {
            cvVar.j0.F(a - 65535, 0);
        }
        new Thread(cvVar.k0).start();
    }

    public final boolean j(pv pvVar) {
        int i = pvVar.e;
        pv pvVar2 = this.c.a.a;
        if (i != pvVar2.e) {
            return false;
        }
        if (pvVar.d.equals(pvVar2.d)) {
            return true;
        }
        eu euVar = this.f;
        if (euVar == null || !lb0.c(pvVar.d, (X509Certificate) euVar.c.get(0))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Object obj;
        StringBuilder b = e5.b("Connection{");
        b.append(this.c.a.a.d);
        b.append(":");
        b.append(this.c.a.a.e);
        b.append(", proxy=");
        b.append(this.c.b);
        b.append(" hostAddress=");
        b.append(this.c.c);
        b.append(" cipherSuite=");
        eu euVar = this.f;
        if (euVar != null) {
            obj = euVar.b;
        } else {
            obj = "none";
        }
        b.append(obj);
        b.append(" protocol=");
        b.append(this.g);
        b.append('}');
        return b.toString();
    }
}