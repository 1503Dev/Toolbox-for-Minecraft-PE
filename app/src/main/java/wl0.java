package defpackage;

import defpackage.nl0;
import defpackage.pv;
import defpackage.uk0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: wl0  reason: default package */
public final class wl0 implements cy {
    public final nb0 a;

    public wl0(nb0 nb0Var) {
        this.a = nb0Var;
    }

    public static int c(nl0 nl0Var, int i) {
        String d = nl0Var.d("Retry-After");
        if (d == null) {
            return i;
        }
        if (d.matches("\\d+")) {
            return Integer.valueOf(d).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
        if (r3.isOneShot() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0124, code lost:
        if (r3.R == 408) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
        if (c(r11, 0) > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0159, code lost:
        if (r1.R == 503) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0164, code lost:
        if (c(r11, Integer.MAX_VALUE) != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
        r1 = r11.P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0181, code lost:
        if (r5.equals("HEAD") == false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v1, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [oc] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [jp, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // defpackage.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nl0 a(bk0 bk0Var) {
        SSLSocketFactory sSLSocketFactory;
        oc ocVar;
        HostnameVerifier hostnameVerifier;
        int i;
        boolean z;
        wl0 wl0Var;
        boolean z2;
        hp hpVar;
        lm0 lm0Var;
        wl0 wl0Var2;
        uk0 uk0Var;
        String d;
        pv.a aVar;
        pv pvVar;
        vk0 vk0Var;
        boolean z3;
        u7 u7Var;
        Proxy proxy;
        uk0 uk0Var2 = bk0Var.e;
        d11 d11Var = bk0Var.b;
        ?? r3 = 0;
        uk0 uk0Var3 = uk0Var2;
        nl0 nl0Var = null;
        int i2 = 0;
        while (true) {
            uk0 uk0Var4 = d11Var.g;
            if (uk0Var4 != null) {
                if (c31.q(uk0Var4.a, uk0Var3.a) && d11Var.h.c()) {
                    i = i2;
                    synchronized (d11Var.b) {
                        try {
                            z = d11Var.m;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    if (!z) {
                        r3 = 0;
                        try {
                            nl0 b = bk0Var.b(uk0Var3, d11Var, null);
                            if (nl0Var != null) {
                                nl0.a aVar2 = new nl0.a(b);
                                nl0.a aVar3 = new nl0.a(nl0Var);
                                aVar3.g = null;
                                nl0 a = aVar3.a();
                                if (a.V == null) {
                                    aVar2.j = a;
                                    b = aVar2.a();
                                } else {
                                    throw new IllegalArgumentException("priorResponse.body != null");
                                }
                            }
                            nl0Var = b;
                            dy.a.getClass();
                            hpVar = nl0Var.b0;
                            if (hpVar != null) {
                                lm0Var = hpVar.b().c;
                            } else {
                                lm0Var = null;
                            }
                            int i3 = nl0Var.R;
                            uk0 uk0Var5 = nl0Var.P;
                            String str = uk0Var5.b;
                            if (i3 != 307 && i3 != 308) {
                                if (i3 != 401) {
                                    if (i3 != 503) {
                                        if (i3 != 407) {
                                            if (i3 != 408) {
                                                switch (i3) {
                                                    case 300:
                                                    case 301:
                                                    case 302:
                                                    case 303:
                                                        wl0Var2 = this;
                                                        if (wl0Var2.a.i0) {
                                                            pv pvVar2 = nl0Var.P.a;
                                                            pvVar2.getClass();
                                                            aVar = new pv.a();
                                                            aVar.b(pvVar2, d);
                                                            if (aVar == null) {
                                                            }
                                                            if (pvVar != null) {
                                                                uk0 uk0Var6 = nl0Var.P;
                                                                uk0Var6.getClass();
                                                                uk0.a aVar4 = new uk0.a(uk0Var6);
                                                                if (vj.x(str)) {
                                                                }
                                                                if (!c31.q(nl0Var.P.a, pvVar)) {
                                                                }
                                                                aVar4.e(pvVar);
                                                                uk0Var = aVar4.a();
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        uk0Var = null;
                                                        break;
                                                    default:
                                                        uk0Var = null;
                                                        wl0Var2 = this;
                                                        break;
                                                }
                                            } else {
                                                wl0Var2 = this;
                                                if (wl0Var2.a.j0) {
                                                    vk0 vk0Var2 = uk0Var5.d;
                                                    if (vk0Var2 != null) {
                                                    }
                                                    nl0 nl0Var2 = nl0Var.Y;
                                                    if (nl0Var2 != null) {
                                                    }
                                                }
                                                uk0Var = null;
                                            }
                                        } else {
                                            wl0Var2 = this;
                                            if (lm0Var != null) {
                                                proxy = lm0Var.b;
                                            } else {
                                                proxy = wl0Var2.a.Q;
                                            }
                                            if (proxy.type() == Proxy.Type.HTTP) {
                                                u7Var = wl0Var2.a.d0;
                                            } else {
                                                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                            }
                                        }
                                    } else {
                                        wl0Var2 = this;
                                        nl0 nl0Var3 = nl0Var.Y;
                                        if (nl0Var3 != null) {
                                        }
                                    }
                                } else {
                                    wl0Var2 = this;
                                    u7Var = wl0Var2.a.e0;
                                }
                                u7Var.getClass();
                                uk0Var = null;
                            } else {
                                wl0Var2 = this;
                                if (!str.equals("GET")) {
                                }
                                if (wl0Var2.a.i0 && (d = nl0Var.d("Location")) != null) {
                                    pv pvVar22 = nl0Var.P.a;
                                    pvVar22.getClass();
                                    try {
                                        aVar = new pv.a();
                                        aVar.b(pvVar22, d);
                                    } catch (IllegalArgumentException unused) {
                                        aVar = null;
                                    }
                                    if (aVar == null) {
                                        pvVar = aVar.a();
                                    } else {
                                        pvVar = null;
                                    }
                                    if (pvVar != null && (pvVar.a.equals(nl0Var.P.a.a) || wl0Var2.a.h0)) {
                                        uk0 uk0Var62 = nl0Var.P;
                                        uk0Var62.getClass();
                                        uk0.a aVar42 = new uk0.a(uk0Var62);
                                        if (vj.x(str)) {
                                            boolean equals = str.equals("PROPFIND");
                                            if (!str.equals("PROPFIND")) {
                                                aVar42.b("GET", null);
                                            } else {
                                                if (equals) {
                                                    vk0Var = nl0Var.P.d;
                                                } else {
                                                    vk0Var = null;
                                                }
                                                aVar42.b(str, vk0Var);
                                            }
                                            if (!equals) {
                                                aVar42.c("Transfer-Encoding");
                                                aVar42.c("Content-Length");
                                                aVar42.c("Content-Type");
                                            }
                                        }
                                        if (!c31.q(nl0Var.P.a, pvVar)) {
                                            aVar42.c("Authorization");
                                        }
                                        aVar42.e(pvVar);
                                        uk0Var = aVar42.a();
                                    }
                                }
                                uk0Var = null;
                            }
                            uk0Var3 = uk0Var;
                        } catch (IOException e) {
                            wl0Var = this;
                            try {
                                if (!(e instanceof hf)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!wl0Var.b(e, d11Var, z2, uk0Var3)) {
                                    throw e;
                                }
                                d11Var.b();
                                i2 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                d11Var.b();
                                throw th;
                            }
                        } catch (mm0 e2) {
                            wl0Var = this;
                            if (!wl0Var.b(e2.Q, d11Var, false, uk0Var3)) {
                                throw e2.P;
                            }
                            d11Var.b();
                            i2 = i;
                        } catch (Throwable th4) {
                            th = th4;
                            d11Var.b();
                            throw th;
                        }
                        if (uk0Var3 == null) {
                            if (hpVar != null && hpVar.e) {
                                if (!d11Var.n) {
                                    d11Var.n = true;
                                    d11Var.e.m();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            return nl0Var;
                        }
                        vk0 vk0Var3 = uk0Var3.d;
                        if (vk0Var3 != null && vk0Var3.isOneShot()) {
                            return nl0Var;
                        }
                        c31.c(nl0Var.V);
                        synchronized (d11Var.b) {
                            if (d11Var.j != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        if (z3) {
                            hpVar.d.cancel();
                            hpVar.a.c(hpVar, true, true, null);
                            r3 = 0;
                        } else {
                            r3 = 0;
                        }
                        i2 = i + 1;
                        if (i2 > 20) {
                            throw new ProtocolException(k6.a("Too many follow-up requests: ", i2));
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } else if (d11Var.j == null) {
                    if (d11Var.h != null) {
                        d11Var.d(r3, true);
                        d11Var.h = r3;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            d11Var.g = uk0Var3;
            ak0 ak0Var = d11Var.b;
            pv pvVar3 = uk0Var3.a;
            if (pvVar3.a.equals("https")) {
                nb0 nb0Var = d11Var.a;
                SSLSocketFactory sSLSocketFactory2 = nb0Var.Z;
                HostnameVerifier hostnameVerifier2 = nb0Var.b0;
                ocVar = nb0Var.c0;
                sSLSocketFactory = sSLSocketFactory2;
                hostnameVerifier = hostnameVerifier2;
            } else {
                sSLSocketFactory = r3;
                SSLSocketFactory sSLSocketFactory3 = sSLSocketFactory;
                ocVar = sSLSocketFactory3;
                hostnameVerifier = sSLSocketFactory3;
            }
            String str2 = pvVar3.d;
            int i4 = pvVar3.e;
            nb0 nb0Var2 = d11Var.a;
            i = i2;
            d11Var.h = new jp(d11Var, ak0Var, new m3(str2, i4, nb0Var2.g0, nb0Var2.Y, sSLSocketFactory, hostnameVerifier, ocVar, nb0Var2.d0, nb0Var2.Q, nb0Var2.R, nb0Var2.S, nb0Var2.W), d11Var.c, d11Var.d);
            synchronized (d11Var.b) {
            }
        }
    }

    public final boolean b(IOException iOException, d11 d11Var, boolean z, uk0 uk0Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!this.a.j0) {
            return false;
        }
        if (z) {
            vk0 vk0Var = uk0Var.d;
            if ((vk0Var != null && vk0Var.isOneShot()) || (iOException instanceof FileNotFoundException)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return false;
            }
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        jp jpVar = d11Var.h;
        synchronized (jpVar.c) {
            z3 = jpVar.h;
        }
        if (z3 && d11Var.h.c()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }
}