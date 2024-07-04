package defpackage;

import defpackage.fr;
import defpackage.lu;
import defpackage.nl0;
import defpackage.ob;
import defpackage.pv;
import defpackage.u60;
import defpackage.uk0;
import defpackage.wk0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: mb0  reason: default package */
public final class mb0<T> implements pb<T> {
    public final al0 P;
    public final Object[] Q;
    public final ob.a R;
    public final pg<ql0, T> S;
    public volatile boolean T;
    @GuardedBy("this")
    @Nullable
    public xj0 U;
    @GuardedBy("this")
    @Nullable
    public Throwable V;
    @GuardedBy("this")
    public boolean W;

    /* renamed from: mb0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements tb {
        public final /* synthetic */ sb a;

        public a(sb sbVar) {
            this.a = sbVar;
        }

        @Override // defpackage.tb
        public final void onFailure(ob obVar, IOException iOException) {
            try {
                this.a.a(mb0.this, iOException);
            } catch (Throwable th) {
                d31.m(th);
                th.printStackTrace();
            }
        }

        @Override // defpackage.tb
        public final void onResponse(ob obVar, nl0 nl0Var) {
            try {
                try {
                    this.a.b(mb0.this, mb0.this.b(nl0Var));
                } catch (Throwable th) {
                    d31.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                d31.m(th2);
                try {
                    this.a.a(mb0.this, th2);
                } catch (Throwable th3) {
                    d31.m(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: mb0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b extends ql0 {
        public final ql0 Q;
        public final wj0 R;
        @Nullable
        public IOException S;

        /* renamed from: mb0$b$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends kr {
            public a(bb bbVar) {
                super(bbVar);
            }

            @Override // defpackage.mt0
            public final long q(za zaVar, long j) {
                try {
                    return this.P.q(zaVar, 8192L);
                } catch (IOException e) {
                    b.this.S = e;
                    throw e;
                }
            }
        }

        public b(ql0 ql0Var) {
            this.Q = ql0Var;
            a aVar = new a(ql0Var.y());
            Logger logger = rb0.a;
            this.R = new wj0(aVar);
        }

        @Override // defpackage.ql0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.Q.close();
        }

        @Override // defpackage.ql0
        public final long g() {
            return this.Q.g();
        }

        @Override // defpackage.ql0
        public final e50 t() {
            return this.Q.t();
        }

        @Override // defpackage.ql0
        public final bb y() {
            return this.R;
        }
    }

    /* renamed from: mb0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c extends ql0 {
        @Nullable
        public final e50 Q;
        public final long R;

        public c(@Nullable e50 e50Var, long j) {
            this.Q = e50Var;
            this.R = j;
        }

        @Override // defpackage.ql0
        public final long g() {
            return this.R;
        }

        @Override // defpackage.ql0
        public final e50 t() {
            return this.Q;
        }

        @Override // defpackage.ql0
        public final bb y() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public mb0(al0 al0Var, Object[] objArr, ob.a aVar, pg<ql0, T> pgVar) {
        this.P = al0Var;
        this.Q = objArr;
        this.R = aVar;
        this.S = pgVar;
    }

    public final xj0 a() {
        pv.a aVar;
        pv pvVar;
        ob.a aVar2 = this.R;
        al0 al0Var = this.P;
        Object[] objArr = this.Q;
        sd0<?>[] sd0VarArr = al0Var.j;
        int length = objArr.length;
        if (length == sd0VarArr.length) {
            wk0 wk0Var = new wk0(al0Var.c, al0Var.b, al0Var.d, al0Var.e, al0Var.f, al0Var.g, al0Var.h, al0Var.i);
            if (al0Var.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                sd0VarArr[i].a(wk0Var, objArr[i]);
            }
            pv.a aVar3 = wk0Var.d;
            if (aVar3 != null) {
                pvVar = aVar3.a();
            } else {
                pv pvVar2 = wk0Var.b;
                String str = wk0Var.c;
                pvVar2.getClass();
                try {
                    aVar = new pv.a();
                    aVar.b(pvVar2, str);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                if (aVar != null) {
                    pvVar = aVar.a();
                } else {
                    pvVar = null;
                }
                if (pvVar == null) {
                    StringBuilder b2 = e5.b("Malformed URL. Base: ");
                    b2.append(wk0Var.b);
                    b2.append(", Relative: ");
                    b2.append(wk0Var.c);
                    throw new IllegalArgumentException(b2.toString());
                }
            }
            wk0.a aVar4 = wk0Var.k;
            if (aVar4 == null) {
                fr.a aVar5 = wk0Var.j;
                if (aVar5 != null) {
                    aVar4 = new fr(aVar5.a, aVar5.b);
                } else {
                    u60.a aVar6 = wk0Var.i;
                    if (aVar6 != null) {
                        if (!aVar6.c.isEmpty()) {
                            aVar4 = new u60(aVar6.a, aVar6.b, aVar6.c);
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (wk0Var.h) {
                        aVar4 = vk0.create((e50) null, new byte[0]);
                    }
                }
            }
            e50 e50Var = wk0Var.g;
            if (e50Var != null) {
                if (aVar4 != null) {
                    aVar4 = new wk0.a(aVar4, e50Var);
                } else {
                    wk0Var.f.a("Content-Type", e50Var.a);
                }
            }
            uk0.a aVar7 = wk0Var.e;
            aVar7.e(pvVar);
            lu.a aVar8 = wk0Var.f;
            aVar8.getClass();
            ArrayList arrayList2 = aVar8.a;
            lu.a aVar9 = new lu.a();
            Collections.addAll(aVar9.a, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            aVar7.c = aVar9;
            aVar7.b(wk0Var.a, aVar4);
            aVar7.d(ky.class, new ky(al0Var.a, arrayList));
            uk0 a2 = aVar7.a();
            nb0 nb0Var = (nb0) aVar2;
            nb0Var.getClass();
            return xj0.c(nb0Var, a2, false);
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + sd0VarArr.length + ")");
    }

    public final ol0<T> b(nl0 nl0Var) {
        ql0 ql0Var = nl0Var.V;
        nl0.a aVar = new nl0.a(nl0Var);
        aVar.g = new c(ql0Var.t(), ql0Var.g());
        nl0 a2 = aVar.a();
        int i = a2.R;
        boolean z = true;
        if (i >= 200 && i < 300) {
            if (i != 204 && i != 205) {
                b bVar = new b(ql0Var);
                try {
                    T b2 = this.S.b(bVar);
                    int i2 = a2.R;
                    if (i2 < 200 || i2 >= 300) {
                        z = false;
                    }
                    if (z) {
                        return new ol0<>(a2, b2, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = bVar.S;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            ql0Var.close();
            int i3 = a2.R;
            if ((i3 < 200 || i3 >= 300) ? false : false) {
                return new ol0<>(a2, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            za zaVar = new za();
            ql0Var.y().k(zaVar);
            pl0 pl0Var = new pl0(ql0Var.t(), ql0Var.g(), zaVar);
            int i4 = a2.R;
            if (i4 < 200 || i4 >= 300) {
                z = false;
            }
            if (!z) {
                return new ol0<>(a2, null, pl0Var);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            ql0Var.close();
        }
    }

    @Override // defpackage.pb
    public final void cancel() {
        xj0 xj0Var;
        this.T = true;
        synchronized (this) {
            xj0Var = this.U;
        }
        if (xj0Var != null) {
            xj0Var.Q.a();
        }
    }

    @Override // defpackage.pb
    /* renamed from: clone */
    public final pb mo2clone() {
        return new mb0(this.P, this.Q, this.R, this.S);
    }

    @Override // defpackage.pb
    public final void g(sb<T> sbVar) {
        xj0 xj0Var;
        Throwable th;
        synchronized (this) {
            if (!this.W) {
                this.W = true;
                xj0Var = this.U;
                th = this.V;
                if (xj0Var == null && th == null) {
                    xj0 a2 = a();
                    this.U = a2;
                    xj0Var = a2;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            sbVar.a(this, th);
            return;
        }
        if (this.T) {
            xj0Var.Q.a();
        }
        xj0Var.a(new a(sbVar));
    }

    @Override // defpackage.pb
    public final synchronized uk0 t() {
        xj0 xj0Var = this.U;
        if (xj0Var != null) {
            return xj0Var.R;
        }
        Throwable th = this.V;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw new RuntimeException("Unable to create request.", this.V);
        }
        try {
            xj0 a2 = a();
            this.U = a2;
            return a2.R;
        } catch (IOException e) {
            this.V = e;
            throw new RuntimeException("Unable to create request.", e);
        } catch (Error e2) {
            e = e2;
            d31.m(e);
            this.V = e;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            d31.m(e);
            this.V = e;
            throw e;
        }
    }

    @Override // defpackage.pb
    public final boolean y() {
        boolean z;
        boolean z2 = true;
        if (this.T) {
            return true;
        }
        synchronized (this) {
            xj0 xj0Var = this.U;
            if (xj0Var != null) {
                d11 d11Var = xj0Var.Q;
                synchronized (d11Var.b) {
                    z = d11Var.m;
                }
                if (z) {
                }
            }
            z2 = false;
        }
        return z2;
    }

    public final Object clone() {
        return new mb0(this.P, this.Q, this.R, this.S);
    }
}