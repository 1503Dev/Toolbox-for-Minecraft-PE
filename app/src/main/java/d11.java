package defpackage;

import defpackage.nb0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: d11  reason: default package */
public final class d11 {
    public final nb0 a;
    public final ak0 b;
    public final ob c;
    public final fp d;
    public final a e;
    @Nullable
    public Object f;
    public uk0 g;
    public jp h;
    public zj0 i;
    @Nullable
    public hp j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    /* renamed from: d11$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends t7 {
        public a() {
        }

        @Override // defpackage.t7
        public final void o() {
            d11.this.a();
        }
    }

    /* renamed from: d11$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b extends WeakReference<d11> {
        public final Object a;

        public b(d11 d11Var, Object obj) {
            super(d11Var);
            this.a = obj;
        }
    }

    public d11(nb0 nb0Var, xj0 xj0Var) {
        a aVar = new a();
        this.e = aVar;
        this.a = nb0Var;
        nb0.a aVar2 = dy.a;
        ez1 ez1Var = nb0Var.f0;
        aVar2.getClass();
        this.b = (ak0) ez1Var.Q;
        this.c = xj0Var;
        this.d = ((ep) nb0Var.V).a;
        aVar.g(nb0Var.k0, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        hp hpVar;
        zj0 zj0Var;
        synchronized (this.b) {
            this.m = true;
            hpVar = this.j;
            jp jpVar = this.h;
            if (jpVar == null || (zj0Var = jpVar.g) == null) {
                zj0Var = this.i;
            }
        }
        if (hpVar != null) {
            hpVar.d.cancel();
        } else if (zj0Var != null) {
            c31.d(zj0Var.d);
        }
    }

    public final void b() {
        synchronized (this.b) {
            if (this.o) {
                throw new IllegalStateException();
            }
            this.j = null;
        }
    }

    @Nullable
    public final IOException c(hp hpVar, boolean z, boolean z2, @Nullable IOException iOException) {
        boolean z3;
        synchronized (this.b) {
            hp hpVar2 = this.j;
            if (hpVar != hpVar2) {
                return iOException;
            }
            boolean z4 = true;
            if (z) {
                z3 = !this.k;
                this.k = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.l) {
                    z3 = true;
                }
                this.l = true;
            }
            if (this.k && this.l && z3) {
                hpVar2.b().m++;
                this.j = null;
            } else {
                z4 = false;
            }
            return z4 ? d(iOException, false) : iOException;
        }
    }

    @Nullable
    public final IOException d(@Nullable IOException iOException, boolean z) {
        zj0 zj0Var;
        Socket socket;
        boolean z2;
        synchronized (this.b) {
            if (z) {
                if (this.j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            zj0Var = this.i;
            if (zj0Var != null && this.j == null && (z || this.o)) {
                socket = f();
            } else {
                socket = null;
            }
            if (this.i != null) {
                zj0Var = null;
            }
            if (this.o && this.j == null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c31.d(socket);
        if (zj0Var != null) {
            this.d.getClass();
        }
        if (z2) {
            if (!this.n && this.e.m()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            this.d.getClass();
        }
        return iOException;
    }

    @Nullable
    public final IOException e(@Nullable IOException iOException) {
        synchronized (this.b) {
            this.o = true;
        }
        return d(iOException, false);
    }

    @Nullable
    public final Socket f() {
        int size = this.i.p.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (((Reference) this.i.p.get(i)).get() == this) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            zj0 zj0Var = this.i;
            zj0Var.p.remove(i);
            this.i = null;
            if (zj0Var.p.isEmpty()) {
                zj0Var.q = System.nanoTime();
                ak0 ak0Var = this.b;
                ak0Var.getClass();
                if (!zj0Var.k && ak0Var.a != 0) {
                    ak0Var.notifyAll();
                } else {
                    ak0Var.d.remove(zj0Var);
                    z = true;
                }
                if (z) {
                    return zj0Var.e;
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }
}