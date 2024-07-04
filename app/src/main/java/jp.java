package defpackage;

import defpackage.d11;
import defpackage.nm0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: jp  reason: default package */
public final class jp {
    public final d11 a;
    public final m3 b;
    public final ak0 c;
    public final fp d;
    public nm0.a e;
    public final nm0 f;
    public zj0 g;
    public boolean h;
    public lm0 i;

    public jp(d11 d11Var, ak0 ak0Var, m3 m3Var, ob obVar, fp fpVar) {
        this.a = d11Var;
        this.c = ak0Var;
        this.b = m3Var;
        this.d = fpVar;
        this.f = new nm0(m3Var, ak0Var.e, obVar, fpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0218, code lost:
        throw new java.net.SocketException("No route to " + r12 + ":" + r11 + "; port is out of range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023e, code lost:
        if (r3.isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0240, code lost:
        r3.addAll(r2.g);
        r2.g.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024a, code lost:
        r16.e = new defpackage.nm0.a(r3);
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
        if (r2 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zj0 a(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        zj0 zj0Var;
        Socket socket;
        Socket socket2;
        int i5;
        lm0 lm0Var;
        zj0 zj0Var2;
        lm0 lm0Var2;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        zj0 zj0Var3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str;
        int i6;
        boolean contains;
        boolean z10;
        synchronized (this.c) {
            d11 d11Var = this.a;
            synchronized (d11Var.b) {
                z2 = d11Var.m;
            }
            if (!z2) {
                z3 = false;
                this.h = false;
                d11 d11Var2 = this.a;
                zj0Var = d11Var2.i;
                socket = null;
                if (zj0Var != null && zj0Var.k) {
                    socket2 = d11Var2.f();
                } else {
                    socket2 = null;
                }
                d11 d11Var3 = this.a;
                zj0 zj0Var4 = d11Var3.i;
                if (zj0Var4 != null) {
                    zj0Var = null;
                } else {
                    zj0Var4 = null;
                }
                i5 = 1;
                if (zj0Var4 == null) {
                    if (this.c.c(this.b, d11Var3, null, false)) {
                        z4 = true;
                        zj0Var2 = this.a.i;
                        lm0Var2 = null;
                    } else {
                        lm0Var = this.i;
                        if (lm0Var != null) {
                            this.i = null;
                        } else if (d()) {
                            lm0Var = this.a.i.c;
                        }
                        zj0Var2 = zj0Var4;
                        lm0Var2 = lm0Var;
                        z4 = false;
                    }
                }
                lm0Var = null;
                zj0Var2 = zj0Var4;
                lm0Var2 = lm0Var;
                z4 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        c31.d(socket2);
        if (zj0Var != null) {
            this.d.getClass();
        }
        if (z4) {
            this.d.getClass();
        }
        if (zj0Var2 != null) {
            return zj0Var2;
        }
        if (lm0Var2 == null) {
            nm0.a aVar = this.e;
            if (aVar != null) {
                if (aVar.b < aVar.a.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            nm0 nm0Var = this.f;
            if (nm0Var.e < nm0Var.d.size()) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6 && nm0Var.g.isEmpty()) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (z7) {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (nm0Var.e < nm0Var.d.size()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        break;
                    }
                    if (nm0Var.e < nm0Var.d.size()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        List<Proxy> list = nm0Var.d;
                        int i7 = nm0Var.e;
                        nm0Var.e = i7 + 1;
                        Proxy proxy = list.get(i7);
                        nm0Var.f = new ArrayList();
                        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                } else {
                                    str = address2.getHostAddress();
                                }
                                i6 = inetSocketAddress.getPort();
                            } else {
                                StringBuilder b = e5.b("Proxy.address() is not an InetSocketAddress: ");
                                b.append(address.getClass());
                                throw new IllegalArgumentException(b.toString());
                            }
                        } else {
                            pv pvVar = nm0Var.a.a;
                            str = pvVar.d;
                            i6 = pvVar.e;
                        }
                        if (i6 < i5 || i6 > 65535) {
                            break;
                        }
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            nm0Var.f.add(InetSocketAddress.createUnresolved(str, i6));
                        } else {
                            nm0Var.c.getClass();
                            ((e1) nm0Var.a.b).getClass();
                            if (str != null) {
                                try {
                                    List asList = Arrays.asList(InetAddress.getAllByName(str));
                                    if (!asList.isEmpty()) {
                                        nm0Var.c.getClass();
                                        int size = asList.size();
                                        for (int i8 = 0; i8 < size; i8++) {
                                            nm0Var.f.add(new InetSocketAddress((InetAddress) asList.get(i8), i6));
                                        }
                                    } else {
                                        throw new UnknownHostException(nm0Var.a.b + " returned no addresses for " + str);
                                    }
                                } catch (NullPointerException e) {
                                    UnknownHostException unknownHostException = new UnknownHostException(k6.b("Broken system behaviour for dns lookup of ", str));
                                    unknownHostException.initCause(e);
                                    throw unknownHostException;
                                }
                            } else {
                                throw new UnknownHostException("hostname == null");
                            }
                        }
                        int size2 = nm0Var.f.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            lm0 lm0Var3 = new lm0(nm0Var.a, proxy, nm0Var.f.get(i9));
                            ij2 ij2Var = nm0Var.b;
                            synchronized (ij2Var) {
                                contains = ((Set) ij2Var.Q).contains(lm0Var3);
                            }
                            if (contains) {
                                nm0Var.g.add(lm0Var3);
                            } else {
                                arrayList2.add(lm0Var3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            break;
                        }
                        i5 = 1;
                    } else {
                        StringBuilder b2 = e5.b("No route to ");
                        b2.append(nm0Var.a.a.d);
                        b2.append("; exhausted proxy configurations: ");
                        b2.append(nm0Var.d);
                        throw new SocketException(b2.toString());
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        boolean z11 = false;
        synchronized (this.c) {
            d11 d11Var4 = this.a;
            synchronized (d11Var4.b) {
                z5 = d11Var4.m;
            }
            if (!z5) {
                if (z11) {
                    nm0.a aVar2 = this.e;
                    aVar2.getClass();
                    arrayList = new ArrayList(aVar2.a);
                    if (this.c.c(this.b, this.a, arrayList, false)) {
                        zj0Var2 = this.a.i;
                        z4 = true;
                    }
                } else {
                    arrayList = null;
                }
                if (!z4) {
                    if (lm0Var2 == null) {
                        nm0.a aVar3 = this.e;
                        if (aVar3.b < aVar3.a.size()) {
                            z3 = true;
                        }
                        if (z3) {
                            List<lm0> list2 = aVar3.a;
                            int i10 = aVar3.b;
                            aVar3.b = i10 + 1;
                            lm0Var2 = list2.get(i10);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    zj0Var2 = new zj0(this.c, lm0Var2);
                    this.g = zj0Var2;
                }
                zj0Var3 = zj0Var2;
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z4) {
            zj0Var3.c(i, i2, i3, i4, z, this.d);
            this.c.e.b(zj0Var3.c);
            synchronized (this.c) {
                this.g = null;
                if (this.c.c(this.b, this.a, arrayList, true)) {
                    zj0Var3.k = true;
                    socket = zj0Var3.e;
                    zj0Var3 = this.a.i;
                    this.i = lm0Var2;
                } else {
                    ak0 ak0Var = this.c;
                    if (!ak0Var.f) {
                        ak0Var.f = true;
                        ak0.g.execute(ak0Var.c);
                    }
                    ak0Var.d.add(zj0Var3);
                    d11 d11Var5 = this.a;
                    if (d11Var5.i == null) {
                        d11Var5.i = zj0Var3;
                        zj0Var3.p.add(new d11.b(d11Var5, d11Var5.f));
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            c31.d(socket);
        }
        this.d.getClass();
        return zj0Var3;
    }

    public final zj0 b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        boolean z3;
        while (true) {
            zj0 a = a(z, i, i2, i3, i4);
            synchronized (this.c) {
                try {
                    boolean z4 = false;
                    if (a.m == 0) {
                        if (a.h != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return a;
                        }
                    }
                    if (!a.e.isClosed() && !a.e.isInputShutdown() && !a.e.isOutputShutdown()) {
                        cv cvVar = a.h;
                        if (cvVar != null) {
                            long nanoTime = System.nanoTime();
                            synchronized (cvVar) {
                                if (!cvVar.V && (cvVar.c0 >= cvVar.b0 || nanoTime < cvVar.d0)) {
                                    z4 = true;
                                }
                            }
                        } else {
                            if (z2) {
                                try {
                                    int soTimeout = a.e.getSoTimeout();
                                    a.e.setSoTimeout(1);
                                    if (a.i.n()) {
                                        a.e.setSoTimeout(soTimeout);
                                    } else {
                                        a.e.setSoTimeout(soTimeout);
                                    }
                                } catch (SocketTimeoutException unused) {
                                } catch (IOException unused2) {
                                }
                            }
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        a.h();
                    } else {
                        return a;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this.c) {
            boolean z4 = true;
            if (this.i != null) {
                return true;
            }
            if (d()) {
                this.i = this.a.i.c;
                return true;
            }
            nm0.a aVar = this.e;
            if (aVar != null) {
                if (aVar.b < aVar.a.size()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            nm0 nm0Var = this.f;
            if (nm0Var.e < nm0Var.d.size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && nm0Var.g.isEmpty()) {
                z2 = false;
                if (z2) {
                    z4 = false;
                }
                return z4;
            }
            z2 = true;
            if (z2) {
            }
            return z4;
        }
    }

    public final boolean d() {
        zj0 zj0Var = this.a.i;
        if (zj0Var != null && zj0Var.l == 0 && c31.q(zj0Var.c.a.a, this.b.a)) {
            return true;
        }
        return false;
    }
}