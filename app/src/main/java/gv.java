package defpackage;

import defpackage.cy;
import defpackage.lu;
import defpackage.nl0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: gv  reason: default package */
public final class gv implements ip {
    public static final List<String> g = c31.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> h = c31.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final cy.a a;
    public final zj0 b;
    public final cv c;
    public volatile iv d;
    public final ig0 e;
    public volatile boolean f;

    public gv(nb0 nb0Var, zj0 zj0Var, bk0 bk0Var, cv cvVar) {
        this.b = zj0Var;
        this.a = bk0Var;
        this.c = cvVar;
        List<ig0> list = nb0Var.R;
        ig0 ig0Var = ig0.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(ig0Var) ? ig0Var : ig0.HTTP_2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[Catch: all -> 0x0185, TryCatch #3 {, blocks: (B:24:0x00a0, B:43:0x00e8, B:44:0x00ea, B:57:0x0124, B:58:0x0125, B:25:0x00a1, B:27:0x00a8, B:28:0x00ac, B:30:0x00b0, B:32:0x00c6, B:34:0x00ce, B:39:0x00d8, B:41:0x00de, B:42:0x00e7, B:83:0x017f, B:84:0x0184, B:45:0x00eb, B:47:0x00ef, B:52:0x010c, B:54:0x0112, B:56:0x0120, B:78:0x0174, B:79:0x017b), top: B:94:0x00a0 }] */
    @Override // defpackage.ip
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(uk0 uk0Var) {
        boolean z;
        int i;
        iv ivVar;
        boolean z2;
        byte b;
        byte b2;
        if (this.d != null) {
            return;
        }
        if (uk0Var.d != null) {
            z = true;
        } else {
            z = false;
        }
        lu luVar = uk0Var.c;
        ArrayList arrayList = new ArrayList((luVar.a.length / 2) + 4);
        arrayList.add(new hu(hu.f, uk0Var.b));
        arrayList.add(new hu(hu.g, bl0.a(uk0Var.a)));
        String a = uk0Var.a("Host");
        if (a != null) {
            arrayList.add(new hu(hu.i, a));
        }
        arrayList.add(new hu(hu.h, uk0Var.a.a));
        int length = luVar.a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = luVar.d(i2).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && luVar.g(i2).equals("trailers"))) {
                arrayList.add(new hu(lowerCase, luVar.g(i2)));
            }
        }
        cv cvVar = this.c;
        boolean z3 = !z;
        synchronized (cvVar.j0) {
            synchronized (cvVar) {
                if (cvVar.U > 1073741823) {
                    cvVar.E(5);
                }
                if (!cvVar.V) {
                    i = cvVar.U;
                    cvVar.U = i + 2;
                    ivVar = new iv(i, cvVar, z3, false, null);
                    if (z && cvVar.f0 != 0 && ivVar.b != 0) {
                        z2 = false;
                        if (ivVar.g()) {
                            cvVar.R.put(Integer.valueOf(i), ivVar);
                        }
                    }
                    z2 = true;
                    if (ivVar.g()) {
                    }
                } else {
                    throw new hf();
                }
            }
            jv jvVar = cvVar.j0;
            synchronized (jvVar) {
                if (!jvVar.T) {
                    jvVar.U.d(arrayList);
                    long j = jvVar.R.Q;
                    int min = (int) Math.min(jvVar.S, j);
                    long j2 = min;
                    if (j == j2) {
                        b = 4;
                    } else {
                        b = 0;
                    }
                    if (z3) {
                        b2 = (byte) (b | 1);
                    } else {
                        b2 = b;
                    }
                    jvVar.g(i, min, (byte) 1, b2);
                    jvVar.P.e(jvVar.R, j2);
                    if (j > j2) {
                        jvVar.G(j - j2, i);
                    }
                } else {
                    throw new IOException("closed");
                }
            }
        }
        if (z2) {
            jv jvVar2 = cvVar.j0;
            synchronized (jvVar2) {
                if (!jvVar2.T) {
                    jvVar2.P.flush();
                } else {
                    throw new IOException("closed");
                }
            }
        }
        this.d = ivVar;
        if (!this.f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.d.i.g(((bk0) this.a).h, timeUnit);
            this.d.j.g(((bk0) this.a).i, timeUnit);
            return;
        }
        this.d.e(6);
        throw new IOException("Canceled");
    }

    @Override // defpackage.ip
    public final mt0 b(nl0 nl0Var) {
        return this.d.g;
    }

    @Override // defpackage.ip
    public final void c() {
        iv ivVar = this.d;
        synchronized (ivVar) {
            if (!ivVar.f && !ivVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        ivVar.h.close();
    }

    @Override // defpackage.ip
    public final void cancel() {
        this.f = true;
        if (this.d != null) {
            this.d.e(6);
        }
    }

    @Override // defpackage.ip
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.ip
    public final dt0 e(uk0 uk0Var, long j) {
        iv ivVar = this.d;
        synchronized (ivVar) {
            if (!ivVar.f && !ivVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return ivVar.h;
    }

    @Override // defpackage.ip
    public final long f(nl0 nl0Var) {
        return mv.a(nl0Var);
    }

    @Override // defpackage.ip
    public final nl0.a g(boolean z) {
        lu luVar;
        iv ivVar = this.d;
        synchronized (ivVar) {
            ivVar.i.j();
            while (ivVar.e.isEmpty() && ivVar.k == 0) {
                ivVar.i();
            }
            ivVar.i.p();
            if (!ivVar.e.isEmpty()) {
                luVar = (lu) ivVar.e.removeFirst();
            } else {
                IOException iOException = ivVar.l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new du0(ivVar.k);
            }
        }
        ig0 ig0Var = this.e;
        ArrayList arrayList = new ArrayList(20);
        int length = luVar.a.length / 2;
        yt0 yt0Var = null;
        for (int i = 0; i < length; i++) {
            String d = luVar.d(i);
            String g2 = luVar.g(i);
            if (d.equals(":status")) {
                yt0Var = yt0.a("HTTP/1.1 " + g2);
            } else if (!h.contains(d)) {
                dy.a.getClass();
                arrayList.add(d);
                arrayList.add(g2.trim());
            }
        }
        if (yt0Var != null) {
            nl0.a aVar = new nl0.a();
            aVar.b = ig0Var;
            aVar.c = yt0Var.b;
            aVar.d = yt0Var.c;
            lu.a aVar2 = new lu.a();
            Collections.addAll(aVar2.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar.f = aVar2;
            if (z) {
                dy.a.getClass();
                if (aVar.c == 100) {
                    return null;
                }
            }
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // defpackage.ip
    public final zj0 h() {
        return this.b;
    }
}