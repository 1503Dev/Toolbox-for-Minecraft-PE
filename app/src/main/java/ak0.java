package defpackage;

import defpackage.d11;
import defpackage.nb0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: ak0  reason: default package */
public final class ak0 {
    public static final ThreadPoolExecutor g;
    public final long b;
    public boolean f;
    public final ly0 c = new ly0(2, this);
    public final ArrayDeque d = new ArrayDeque();
    public final ij2 e = new ij2();
    public final int a = 5;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c31.a;
        g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new z21("OkHttp ConnectionPool", true));
    }

    public ak0(TimeUnit timeUnit) {
        this.b = timeUnit.toNanos(5L);
    }

    public final void a(lm0 lm0Var, IOException iOException) {
        if (lm0Var.b.type() != Proxy.Type.DIRECT) {
            m3 m3Var = lm0Var.a;
            m3Var.g.connectFailed(m3Var.a.p(), lm0Var.b.address(), iOException);
        }
        ij2 ij2Var = this.e;
        synchronized (ij2Var) {
            ((Set) ij2Var.Q).add(lm0Var);
        }
    }

    public final int b(zj0 zj0Var, long j) {
        ArrayList arrayList = zj0Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder b = e5.b("A connection to ");
                b.append(zj0Var.c.a.a);
                b.append(" was leaked. Did you forget to close a response body?");
                ne0.a.n(b.toString(), ((d11.b) reference).a);
                arrayList.remove(i);
                zj0Var.k = true;
                if (arrayList.isEmpty()) {
                    zj0Var.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final boolean c(m3 m3Var, d11 d11Var, @Nullable ArrayList arrayList, boolean z) {
        boolean z2;
        boolean z3;
        Iterator it = this.d.iterator();
        while (true) {
            boolean z4 = false;
            if (!it.hasNext()) {
                return false;
            }
            zj0 zj0Var = (zj0) it.next();
            if (z) {
                if (zj0Var.h != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    continue;
                }
            }
            if (zj0Var.p.size() < zj0Var.o && !zj0Var.k) {
                nb0.a aVar = dy.a;
                m3 m3Var2 = zj0Var.c.a;
                aVar.getClass();
                if (m3Var2.a(m3Var)) {
                    if (!m3Var.a.d.equals(zj0Var.c.a.a.d)) {
                        if (zj0Var.h != null && arrayList != null) {
                            int size = arrayList.size();
                            int i = 0;
                            while (true) {
                                if (i < size) {
                                    lm0 lm0Var = (lm0) arrayList.get(i);
                                    if (lm0Var.b.type() == Proxy.Type.DIRECT && zj0Var.c.b.type() == Proxy.Type.DIRECT && zj0Var.c.c.equals(lm0Var.c)) {
                                        z2 = true;
                                        break;
                                    }
                                    i++;
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z2 && m3Var.j == lb0.a && zj0Var.j(m3Var.a)) {
                                try {
                                    m3Var.k.a(m3Var.a.d, zj0Var.f.c);
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                    z4 = true;
                }
            }
            if (z4) {
                if (d11Var.i == null) {
                    d11Var.i = zj0Var;
                    zj0Var.p.add(new d11.b(d11Var, d11Var.f));
                    return true;
                }
                throw new IllegalStateException();
            }
        }
    }
}