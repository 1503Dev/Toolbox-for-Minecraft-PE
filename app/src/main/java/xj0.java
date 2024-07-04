package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xj0  reason: default package */
public final class xj0 implements ob {
    public final nb0 P;
    public d11 Q;
    public final uk0 R;
    public final boolean S;
    public boolean T;

    /* renamed from: xj0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a extends a70 {
        public final tb Q;
        public volatile AtomicInteger R;

        public a(tb tbVar) {
            super("OkHttp %s", xj0.this.R.a.o());
            this.R = new AtomicInteger(0);
            this.Q = tbVar;
        }

        @Override // defpackage.a70
        public final void b() {
            xj0.this.Q.e.j();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    xj0.this.P.P.b(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.Q.onResponse(xj0.this, xj0.this.b());
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    ne0 ne0Var = ne0.a;
                    ne0Var.m(4, "Callback failure for " + xj0.this.d(), e);
                } else {
                    this.Q.onFailure(xj0.this, e);
                }
                xj0.this.P.P.b(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                xj0.this.Q.a();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.addSuppressed(th);
                    this.Q.onFailure(xj0.this, iOException);
                }
                throw th;
            }
            xj0.this.P.P.b(this);
        }
    }

    public xj0(nb0 nb0Var, uk0 uk0Var, boolean z) {
        this.P = nb0Var;
        this.R = uk0Var;
        this.S = z;
    }

    public static xj0 c(nb0 nb0Var, uk0 uk0Var, boolean z) {
        xj0 xj0Var = new xj0(nb0Var, uk0Var, z);
        xj0Var.Q = new d11(nb0Var, xj0Var);
        return xj0Var;
    }

    public final void a(tb tbVar) {
        a a2;
        synchronized (this) {
            if (!this.T) {
                this.T = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        d11 d11Var = this.Q;
        d11Var.getClass();
        d11Var.f = ne0.a.k();
        d11Var.d.getClass();
        xl xlVar = this.P.P;
        a aVar = new a(tbVar);
        synchronized (xlVar) {
            try {
                xlVar.d.add(aVar);
                if (!this.S && (a2 = xlVar.a(this.R.a.d)) != null) {
                    aVar.R = a2.R;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xlVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nl0 b() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.P.T);
        arrayList.add(new wl0(this.P));
        arrayList.add(new wa(this.P.X));
        this.P.getClass();
        arrayList.add(new jb(null));
        arrayList.add(new ef());
        if (!this.S) {
            arrayList.addAll(this.P.U);
        }
        arrayList.add(new rb(this.S));
        d11 d11Var = this.Q;
        uk0 uk0Var = this.R;
        nb0 nb0Var = this.P;
        bk0 bk0Var = new bk0(arrayList, d11Var, null, 0, uk0Var, this, nb0Var.l0, nb0Var.m0, nb0Var.n0);
        boolean z2 = false;
        try {
            nl0 a2 = bk0Var.a(uk0Var);
            d11 d11Var2 = this.Q;
            synchronized (d11Var2.b) {
                z = d11Var2.m;
            }
            if (!z) {
                this.Q.e(null);
                return a2;
            }
            c31.c(a2);
            throw new IOException("Canceled");
        } catch (IOException e) {
            try {
                throw this.Q.e(e);
            } catch (Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    this.Q.e(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
            }
            throw th;
        }
    }

    public final Object clone() {
        return c(this.P, this.R, this.S);
    }

    public final String d() {
        boolean z;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        d11 d11Var = this.Q;
        synchronized (d11Var.b) {
            z = d11Var.m;
        }
        if (z) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.S) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(this.R.a.o());
        return sb.toString();
    }
}