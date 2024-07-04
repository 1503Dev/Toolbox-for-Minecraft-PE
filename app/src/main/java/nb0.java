package defpackage;

import defpackage.fp;
import defpackage.ob;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: nb0  reason: default package */
public final class nb0 implements Cloneable, ob.a {
    public static final List<ig0> p0 = c31.m(ig0.HTTP_2, ig0.HTTP_1_1);
    public static final List<Cif> q0 = c31.m(Cif.e, Cif.f);
    public final xl P;
    @Nullable
    public final Proxy Q;
    public final List<ig0> R;
    public final List<Cif> S;
    public final List<cy> T;
    public final List<cy> U;
    public final fp.b V;
    public final ProxySelector W;
    public final rg X;
    public final SocketFactory Y;
    public final SSLSocketFactory Z;
    public final z61 a0;
    public final HostnameVerifier b0;
    public final oc c0;
    public final u7 d0;
    public final u7 e0;
    public final ez1 f0;
    public final zl g0;
    public final boolean h0;
    public final boolean i0;
    public final boolean j0;
    public final int k0;
    public final int l0;
    public final int m0;
    public final int n0;
    public final int o0;

    /* renamed from: nb0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends dy {
    }

    /* renamed from: nb0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public xl a;
        @Nullable
        public Proxy b;
        public List<ig0> c;
        public List<Cif> d;
        public final ArrayList e;
        public final ArrayList f;
        public fp.b g;
        public ProxySelector h;
        public rg i;
        public SocketFactory j;
        @Nullable
        public SSLSocketFactory k;
        @Nullable
        public z61 l;
        public HostnameVerifier m;
        public oc n;
        public u7 o;
        public u7 p;
        public ez1 q;
        public zl r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        public b() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new xl();
            this.c = nb0.p0;
            this.d = nb0.q0;
            this.g = new ep();
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new la0();
            }
            this.i = rg.a;
            this.j = SocketFactory.getDefault();
            this.m = lb0.a;
            this.n = oc.c;
            yg ygVar = u7.a;
            this.o = ygVar;
            this.p = ygVar;
            this.q = new ez1();
            this.r = zl.a;
            this.s = true;
            this.t = true;
            this.u = true;
            this.v = 0;
            this.w = 10000;
            this.x = 10000;
            this.y = 10000;
            this.z = 0;
        }

        public b(nb0 nb0Var) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            this.a = nb0Var.P;
            this.b = nb0Var.Q;
            this.c = nb0Var.R;
            this.d = nb0Var.S;
            arrayList.addAll(nb0Var.T);
            arrayList2.addAll(nb0Var.U);
            this.g = nb0Var.V;
            this.h = nb0Var.W;
            this.i = nb0Var.X;
            nb0Var.getClass();
            this.j = nb0Var.Y;
            this.k = nb0Var.Z;
            this.l = nb0Var.a0;
            this.m = nb0Var.b0;
            this.n = nb0Var.c0;
            this.o = nb0Var.d0;
            this.p = nb0Var.e0;
            this.q = nb0Var.f0;
            this.r = nb0Var.g0;
            this.s = nb0Var.h0;
            this.t = nb0Var.i0;
            this.u = nb0Var.j0;
            this.v = nb0Var.k0;
            this.w = nb0Var.l0;
            this.x = nb0Var.m0;
            this.y = nb0Var.n0;
            this.z = nb0Var.o0;
        }
    }

    static {
        dy.a = new a();
    }

    public nb0() {
        this(new b());
    }

    public nb0(b bVar) {
        boolean z;
        z61 z61Var;
        this.P = bVar.a;
        this.Q = bVar.b;
        this.R = bVar.c;
        List<Cif> list = bVar.d;
        this.S = list;
        this.T = c31.l(bVar.e);
        this.U = c31.l(bVar.f);
        this.V = bVar.g;
        this.W = bVar.h;
        this.X = bVar.i;
        bVar.getClass();
        this.Y = bVar.j;
        loop0: while (true) {
            for (Cif cif : list) {
                z = z || cif.a;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.k;
        if (sSLSocketFactory == null && z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            ne0 ne0Var = ne0.a;
                            SSLContext i = ne0Var.i();
                            i.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.Z = i.getSocketFactory();
                            z61Var = ne0Var.c(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS", e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw new AssertionError("No System TLS", e2);
            }
        }
        this.Z = sSLSocketFactory;
        z61Var = bVar.l;
        this.a0 = z61Var;
        SSLSocketFactory sSLSocketFactory2 = this.Z;
        if (sSLSocketFactory2 != null) {
            ne0.a.f(sSLSocketFactory2);
        }
        this.b0 = bVar.m;
        oc ocVar = bVar.n;
        this.c0 = Objects.equals(ocVar.b, z61Var) ? ocVar : new oc(ocVar.a, z61Var);
        this.d0 = bVar.o;
        this.e0 = bVar.p;
        this.f0 = bVar.q;
        this.g0 = bVar.r;
        this.h0 = bVar.s;
        this.i0 = bVar.t;
        this.j0 = bVar.u;
        this.k0 = bVar.v;
        this.l0 = bVar.w;
        this.m0 = bVar.x;
        this.n0 = bVar.y;
        this.o0 = bVar.z;
        if (this.T.contains(null)) {
            StringBuilder b2 = e5.b("Null interceptor: ");
            b2.append(this.T);
            throw new IllegalStateException(b2.toString());
        } else if (this.U.contains(null)) {
            StringBuilder b3 = e5.b("Null network interceptor: ");
            b3.append(this.U);
            throw new IllegalStateException(b3.toString());
        }
    }
}