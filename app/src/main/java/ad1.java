package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import defpackage.ag1;
import defpackage.if1;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

/* renamed from: ad1  reason: default package */
public final class ad1 {
    public static String X = "https://adc3-launch.adcolony.com/v4/launch";
    public static volatile String Y = "";
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public id1 N;
    public long P;
    public long Q;
    public boolean R;
    public long S;
    public long T;
    public long U;
    public int V;
    public boolean W;
    public tc1 a;
    public se1 b;
    public re1 c;
    public pb1 d;
    public ie1 e;
    public kf1 f;
    public mf1 g;
    public jf1 h;
    public nc1 i;
    public he1 j;
    public rd1 k;
    public ob1 l;
    public ag1 m;
    public z1 n;
    public i2 o;
    public r10 p;
    public e2 r;
    public rc1 s;
    public ic1 t;
    public String w;
    public String x;
    public String y;
    public HashMap<String, g2> q = new HashMap<>();
    public HashMap<String, m2> u = new HashMap<>();
    public HashMap<Integer, fb1> v = new HashMap<>();
    public String z = "";
    public mc1 D = new mc1();
    public int M = 1;
    public wd0 O = null;

    /* renamed from: ad1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements zc1 {
        public a() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ad1.this.g(true, true);
        }
    }

    /* renamed from: ad1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements zc1 {
        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ic1 ic1Var = new ic1();
            String q = rc1Var.b.q("data");
            ThreadPoolExecutor threadPoolExecutor = eg1.a;
            CRC32 crc32 = new CRC32();
            int length = q.length();
            for (int i = 0; i < length; i++) {
                crc32.update(q.charAt(i));
            }
            eb1.l((int) crc32.getValue(), ic1Var, "crc32");
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: ad1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements zc1 {
        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ic1 ic1Var = new ic1();
            eb1.j(ic1Var, "sha1", eg1.m(rc1Var.b.q("data")));
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: ad1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements zc1 {
        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            int l = rc1Var.b.l("number");
            ic1 ic1Var = new ic1();
            ThreadPoolExecutor threadPoolExecutor = eg1.a;
            nr nrVar = new nr();
            for (int i = 0; i < l; i++) {
                nrVar.d(UUID.randomUUID().toString());
            }
            eb1.h(ic1Var, "uuids", nrVar);
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: ad1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements zc1 {

        /* renamed from: ad1$e$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements zf1<String> {
            public final /* synthetic */ rc1 a;

            public a(rc1 rc1Var) {
                this.a = rc1Var;
            }

            public final void a(String str) {
                ic1 ic1Var = new ic1();
                eb1.j(ic1Var, "advertiser_id", ad1.this.l().c);
                eb1.m(ic1Var, "limit_ad_tracking", ad1.this.l().d);
                this.a.a(ic1Var).b();
            }

            public final void b(Throwable th) {
                StringBuilder c = yg.c("Device.query_advertiser_info", " failed with error: ");
                c.append(Log.getStackTraceString(th));
                t1.b(0, 1, c.toString(), true);
            }
        }

        public e() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ad1.this.l().a(ga1.P, new a(rc1Var));
        }
    }

    /* renamed from: ad1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements zc1 {
        public f() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            me1 me1Var = ad1.this.n().e;
            ad1.this.l().g = rc1Var.b.q("version");
            if (me1Var != null) {
                String str = ad1.this.l().g;
                synchronized (me1Var) {
                    me1Var.d.put("controllerVersion", str);
                }
            }
        }
    }

    /* renamed from: ad1$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g implements zc1 {
        public g() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ad1 ad1Var = ad1.this;
            rc1Var.b.n("signals");
            ad1Var.getClass();
        }
    }

    /* renamed from: ad1$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h implements zc1 {

        /* renamed from: ad1$h$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements nf1<wd1> {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // defpackage.nf1
            public final void a(wd1 wd1Var) {
                wd1 wd1Var2 = wd1Var;
                ic1 ic1Var = new ic1();
                if (wd1Var2 != null) {
                    eb1.i(ic1Var, "odt", wd1Var2.a());
                }
                this.P.a(ic1Var).b();
            }
        }

        public h() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            if (ad1.this.R) {
                yd1.c().b(new a(rc1Var), ad1.this.Q);
                return;
            }
            wd1 wd1Var = yd1.c().c;
            ic1 ic1Var = new ic1();
            if (wd1Var != null) {
                eb1.i(ic1Var, "odt", wd1Var.a());
            }
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: ad1$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i implements zc1 {
        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            yd1.c().b(new eb1(), -1L);
        }
    }

    /* renamed from: ad1$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class j implements zc1 {
        public j() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ag1 ag1Var = ad1.this.m;
            if (ga1.j()) {
                if (!ag1Var.a) {
                    ag1Var.d = new ag1.b(rc1Var.b);
                    Runnable runnable = ag1Var.c;
                    if (runnable != null) {
                        eg1.q(runnable);
                        eg1.n(ag1Var.c);
                        return;
                    }
                    eg1.q(ag1Var.b);
                    eg1.e(ga1.h().T, ag1Var.b);
                    return;
                }
                return;
            }
            ag1Var.getClass();
        }
    }

    /* renamed from: ad1$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = ga1.P;
            if (!ad1.this.K && context != null) {
                try {
                    zw4.a(context.getApplicationContext());
                    ad1.this.K = true;
                } catch (IllegalArgumentException unused) {
                    t1.b(0, 0, "IllegalArgumentException when activating Omid", true);
                    ad1.this.K = false;
                }
            }
            ad1 ad1Var = ad1.this;
            if (ad1Var.K && ad1Var.O == null) {
                try {
                    vj.b("AdColony", "Name is null or empty");
                    vj.b("4.8.0", "Version is null or empty");
                    ad1Var.O = new wd0();
                } catch (IllegalArgumentException unused2) {
                    t1.b(0, 0, "IllegalArgumentException when creating Omid Partner", true);
                    ad1.this.K = false;
                }
            }
        }
    }

    /* renamed from: ad1$l */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class l implements if1.b {
    }

    /* renamed from: ad1$m */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ga1.h().q().e) {
                ad1 ad1Var = ad1.this;
                ad1Var.getClass();
                new Thread(new bd1(ad1Var)).start();
            }
        }
    }

    /* renamed from: ad1$n */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class n implements nf1<ud1> {
        @Override // defpackage.nf1
        public final void a(ud1 ud1Var) {
            yd1.c().a = ud1Var;
        }
    }

    /* renamed from: ad1$o */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class o implements zc1 {
        public o() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ad1 ad1Var = ad1.this;
            ad1Var.getClass();
            Context context = ga1.P;
            if (context != null) {
                try {
                    int l = rc1Var.b.l("id");
                    if (l > 0) {
                        ad1Var.v.remove(Integer.valueOf(l));
                        ad1Var.a.c(l);
                    }
                    eg1.n(new cd1(ad1Var, context, rc1Var));
                } catch (RuntimeException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.toString() + ": during WebView initialization.");
                    sb.append(" Disabling AdColony.");
                    ga1.h().n().d(0, 0, sb.toString(), false);
                    w1.d();
                }
            }
        }
    }

    /* renamed from: ad1$p */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class p implements zc1 {
        public p() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ad1 ad1Var = ad1.this;
            ad1Var.getClass();
            int l = rc1Var.b.l("id");
            ad1Var.v.remove(Integer.valueOf(l));
            ad1Var.a.c(l);
        }
    }

    /* renamed from: ad1$q */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class q implements zc1 {
        public q() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            double optDouble;
            me1 me1Var = ad1.this.n().e;
            boolean z = true;
            ad1.this.D.b(true);
            if (ad1.this.I) {
                ic1 ic1Var = new ic1();
                ic1 ic1Var2 = new ic1();
                eb1.j(ic1Var2, "app_version", eg1.p());
                eb1.i(ic1Var, "app_bundle_info", ic1Var2);
                new rc1(1, ic1Var, "AdColony.on_update").b();
                ad1.this.I = false;
            }
            if (ad1.this.J) {
                new rc1("AdColony.on_install", 1).b();
            }
            ic1 ic1Var3 = rc1Var.b;
            if (me1Var != null) {
                String q = ic1Var3.q("app_session_id");
                synchronized (me1Var) {
                    me1Var.d.put("sessionId", q);
                }
            }
            List<ic1> list = h2.a;
            synchronized (list) {
                if (list.size() == 0) {
                    z = false;
                }
            }
            if (z) {
                h2.a();
            }
            Integer k = ic1Var3.k("base_download_threads");
            if (k != null) {
                se1 se1Var = ad1.this.b;
                se1Var.b = k.intValue();
                int corePoolSize = se1Var.e.getCorePoolSize();
                int i = se1Var.b;
                if (corePoolSize < i) {
                    se1Var.e.setCorePoolSize(i);
                }
            }
            Integer k2 = ic1Var3.k("concurrent_requests");
            if (k2 != null) {
                se1 se1Var2 = ad1.this.b;
                se1Var2.c = k2.intValue();
                int corePoolSize2 = se1Var2.e.getCorePoolSize();
                int i2 = se1Var2.c;
                if (corePoolSize2 > i2) {
                    se1Var2.e.setCorePoolSize(i2);
                }
            }
            Integer k3 = ic1Var3.k("threads_keep_alive_time");
            if (k3 != null) {
                ad1.this.b.e.setKeepAliveTime(k3.intValue(), TimeUnit.SECONDS);
            }
            synchronized (ic1Var3.a) {
                optDouble = ic1Var3.a.optDouble("thread_pool_scaling_factor");
            }
            if (!Double.isNaN(optDouble)) {
                ad1.this.b.d = optDouble;
            }
            ag1 ag1Var = ad1.this.m;
            ag1Var.a();
            ag1Var.a = false;
            eg1.e(ga1.h().T, ag1Var.b);
            ad1 ad1Var = ad1.this;
            ad1Var.getClass();
            ic1 ic1Var4 = new ic1();
            eb1.j(ic1Var4, "type", "AdColony.on_configuration_completed");
            nr nrVar = new nr();
            for (String str : ad1Var.u.keySet()) {
                nrVar.d(str);
            }
            ic1 ic1Var5 = new ic1();
            eb1.h(ic1Var5, "zone_ids", nrVar);
            eb1.i(ic1Var4, "message", ic1Var5);
            new rc1(0, ic1Var4, "CustomMessage.controller_send").b();
        }
    }

    /* renamed from: ad1$r */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class r implements zc1 {
        public r() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            e2 e2Var = ad1.this.r;
            ic1 ic1Var = e2Var.b;
            eb1.j(ic1Var, "app_id", e2Var.a);
            ic1 ic1Var2 = new ic1();
            eb1.i(ic1Var2, "options", ic1Var);
            rc1Var.a(ic1Var2).b();
        }
    }

    /* renamed from: ad1$s */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class s implements zc1 {
        public s() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ad1 ad1Var = ad1.this;
            if (ad1Var.p != null) {
                eg1.n(new hd1(ad1Var, rc1Var));
            }
        }
    }

    /* renamed from: ad1$t */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class t implements zc1 {
        public t() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            m2 m2Var;
            ad1 ad1Var = ad1.this;
            if (!ad1Var.C) {
                String q = rc1Var.b.q("zone_id");
                if (ad1Var.u.containsKey(q)) {
                    m2Var = ad1Var.u.get(q);
                } else {
                    m2 m2Var2 = new m2();
                    ad1Var.u.put(q, m2Var2);
                    m2Var = m2Var2;
                }
                m2Var.getClass();
                ic1 ic1Var = rc1Var.b;
                ic1 n = ic1Var.n("reward");
                m2Var.a = n.q("reward_name");
                m2Var.d = n.l("reward_amount");
                n.l("views_per_reward");
                n.l("views_until_reward");
                m2Var.f = ic1Var.j("rewarded");
                ic1Var.l("status");
                m2Var.b = ic1Var.l("type");
                m2Var.c = ic1Var.l("play_interval");
                ic1Var.q("zone_id");
            }
        }
    }

    public ad1() {
        new ic1();
        this.P = 500L;
        this.Q = 500L;
        this.S = 20000L;
        this.T = 300000L;
        this.U = 15000L;
        this.W = false;
    }

    public final mf1 a() {
        if (this.g == null) {
            mf1 mf1Var = new mf1();
            this.g = mf1Var;
            mf1Var.a();
        }
        return this.g;
    }

    public final void b() {
        this.D.b(false);
        this.d.e();
        Object p2 = this.r.b.p("force_ad_id");
        if (p2 == null) {
            p2 = Boolean.FALSE;
        }
        if ((p2 instanceof String) && !((String) p2).isEmpty()) {
            c();
        }
        w1.c(ga1.P, this.r);
        e();
        this.u.clear();
        this.a.a();
    }

    public final void c() {
        synchronized (this.d.c) {
            for (i2 i2Var : this.d.c.values()) {
                i2Var.b();
            }
            this.d.c.clear();
        }
    }

    public final void d() {
        if (ga1.h().q().e) {
            int i2 = this.L + 1;
            this.L = i2;
            int min = Math.min(this.M * i2, 120);
            this.M = min;
            eg1.e(min * 1000, new m());
            return;
        }
        t1.b(0, 1, "Max launch server download attempts hit, or AdColony is no longer active.", true);
    }

    public final void e() {
        this.v.remove(1);
        this.a.c(1);
        for (fb1 fb1Var : this.v.values()) {
            tc1 tc1Var = this.a;
            tc1Var.getClass();
            tc1Var.c(fb1Var.getAdcModuleId());
        }
        this.v.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(e2 e2Var, boolean z) {
        char c2;
        boolean z2;
        Context context;
        boolean z3;
        boolean z4;
        Context context2;
        Application application;
        this.C = z;
        this.r = e2Var;
        this.a = new tc1();
        new nd1();
        he1 he1Var = new he1();
        this.j = he1Var;
        boolean z5 = false;
        he1Var.a.b(false);
        he1Var.b.b(false);
        ga1.f("Device.get_info", new be1());
        se1 se1Var = new se1();
        this.b = se1Var;
        se1Var.e.allowCoreThreadTimeOut(true);
        ga1.f("WebServices.download", new ne1(se1Var));
        ga1.f("WebServices.get", new oe1(se1Var));
        ga1.f("WebServices.post", new pe1(se1Var));
        re1 re1Var = new re1();
        this.c = re1Var;
        ga1.f("SessionInfo.stopped", new qe1(re1Var));
        re1Var.j = new ff1(re1Var);
        pb1 pb1Var = new pb1();
        this.d = pb1Var;
        pb1Var.f();
        this.e = new ie1();
        kf1 kf1Var = new kf1();
        this.f = kf1Var;
        kf1Var.f();
        nc1 nc1Var = new nc1();
        this.i = nc1Var;
        nc1Var.e();
        jf1 jf1Var = new jf1();
        this.h = jf1Var;
        jf1Var.a();
        mf1 mf1Var = new mf1();
        this.g = mf1Var;
        mf1Var.a();
        this.k = new rd1();
        this.m = new ag1();
        rd1 rd1Var = this.k;
        rd1Var.getClass();
        rd1Var.c = rd1.b();
        ga1.f("Network.start_notifications", new od1(rd1Var));
        ga1.f("Network.stop_notifications", new pd1(rd1Var));
        w1.c(ga1.P, e2Var);
        if (!z) {
            this.G = new File(qq.d(new StringBuilder(), this.h.a, "026ae9c9824b3e483fa6c71fa88f57ae27816141")).exists();
            boolean exists = new File(qq.d(new StringBuilder(), this.h.a, "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5")).exists();
            if (this.G && exists) {
                String q2 = eb1.n(this.h.a + "026ae9c9824b3e483fa6c71fa88f57ae27816141").q("sdkVersion");
                this.j.getClass();
                if (q2.equals("4.8.0")) {
                    z4 = true;
                    this.F = z4;
                    if1.a().d = new l();
                    if (this.G) {
                        ic1 n2 = eb1.n(this.h.a + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
                        this.t = n2;
                        i(n2);
                    }
                    g(this.F, false);
                    context2 = ga1.P;
                    if (context2 != null && this.N == null) {
                        this.N = new id1(this);
                        if (!(context2 instanceof Application)) {
                            application = (Application) context2;
                        } else {
                            application = ((Activity) context2).getApplication();
                        }
                        application.registerActivityLifecycleCallbacks(this.N);
                    }
                }
            }
            z4 = false;
            this.F = z4;
            if1.a().d = new l();
            if (this.G) {
            }
            g(this.F, false);
            context2 = ga1.P;
            if (context2 != null) {
                this.N = new id1(this);
                if (!(context2 instanceof Application)) {
                }
                application.registerActivityLifecycleCallbacks(this.N);
            }
        }
        ga1.f("Module.load", new o());
        ga1.f("Module.unload", new p());
        ga1.f("AdColony.on_configured", new q());
        ga1.f("AdColony.get_app_info", new r());
        ga1.f("AdColony.v4vc_reward", new s());
        ga1.f("AdColony.zone_info", new t());
        ga1.f("AdColony.probe_launch_server", new a());
        ga1.f("Crypto.sha1", new c());
        ga1.f("Crypto.crc32", new b());
        ga1.f("Crypto.uuid", new d());
        ga1.f("Device.query_advertiser_info", new e());
        ga1.f("AdColony.controller_version", new f());
        ga1.f("AdColony.provide_signals", new g());
        ga1.f("AdColony.odt_calculate", new h());
        ga1.f("AdColony.odt_cache", new i());
        ga1.f("AdColony.heartbeat", new j());
        jf1 jf1Var2 = this.h;
        try {
            context = ga1.P;
        } catch (Exception unused) {
        }
        if (context != null) {
            int i2 = (int) (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime / 1000);
            ic1 b2 = jf1Var2.b();
            if (b2.c("last_update")) {
                if (b2.l("last_update") != i2) {
                    z3 = true;
                    c2 = 1;
                } else {
                    z3 = false;
                    c2 = 0;
                }
            } else {
                z3 = true;
                c2 = 2;
            }
            if (z3) {
                try {
                    eb1.l(i2, b2, "last_update");
                    eb1.q(b2, jf1Var2.a + "AppVersion");
                } catch (Exception unused2) {
                }
            }
            if (c2 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.I = z2;
            if (c2 == 2) {
                z5 = true;
            }
            this.J = z5;
            eg1.n(new k());
        }
        c2 = 0;
        if (c2 != 1) {
        }
        this.I = z2;
        if (c2 == 2) {
        }
        this.J = z5;
        eg1.n(new k());
    }

    public final boolean g(boolean z, boolean z2) {
        if (!ga1.i()) {
            return false;
        }
        this.H = z2;
        this.F = z;
        if (z && !z2) {
            this.a.a();
            this.H = true;
        }
        new Thread(new bd1(this)).start();
        return true;
    }

    public final void h() {
        boolean z;
        Iterator<i2> it = this.d.c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i2 next = it.next();
            if (next != null) {
                if (next.k == 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (ga1.j()) {
                        ad1 h2 = ga1.h();
                        pb1 k2 = h2.k();
                        eg1.n(new j2(next));
                        m2 m2Var = h2.u.get(next.h);
                        if (m2Var != null && m2Var.f) {
                            ic1 ic1Var = new ic1();
                            eb1.l(m2.a(m2Var.d), ic1Var, "reward_amount");
                            String str = m2Var.a;
                            if (!ga1.j() || ga1.h().B || ga1.h().C) {
                                t1.b(0, 0, "The AdColonyZone API is not available while AdColony is disabled.", false);
                                str = "";
                            }
                            eb1.j(ic1Var, "reward_name", str);
                            eb1.m(ic1Var, "success", true);
                            eb1.j(ic1Var, "zone_id", next.h);
                            rc1 rc1Var = new rc1(0, ic1Var, "AdColony.v4vc_reward");
                            if (h2.p != null) {
                                eg1.n(new hd1(h2, rc1Var));
                            }
                        }
                        eg1.n(new k2(next, k2));
                    }
                }
            }
        }
        b();
    }

    public final void i(ic1 ic1Var) {
        long j2;
        boolean optBoolean;
        boolean optBoolean2;
        Context context;
        if (!kd1.x0) {
            ic1 n2 = ic1Var.n("logging");
            nc1.h = n2.a(1, "send_level");
            nc1.f = n2.j("log_private");
            nc1.g = n2.a(3, "print_level");
            nc1 nc1Var = this.i;
            nr c2 = eb1.c(n2, "modules");
            nc1Var.getClass();
            ic1 ic1Var2 = new ic1();
            for (int i2 = 0; i2 < c2.c(); i2++) {
                ic1 e2 = c2.e(i2);
                eb1.i(ic1Var2, Integer.toString(e2.l("id")), e2);
            }
            nc1Var.a = ic1Var2;
            nc1 nc1Var2 = this.i;
            nr m2 = n2.m("included_fields");
            if (m2 != null) {
                nc1Var2.getClass();
                m2.d("level");
                m2.d("message");
            }
            nc1Var2.b = m2;
        }
        ic1 n3 = ic1Var.n("metadata");
        l().f = n3;
        re1 q2 = q();
        int l2 = n3.l("session_timeout");
        if (l2 <= 0) {
            j2 = q2.a;
        } else {
            j2 = l2 * 1000;
        }
        q2.a = j2;
        Y = ic1Var.q("pie");
        this.z = ic1Var.n("controller").q("version");
        this.P = eb1.b(n3, "signals_timeout", this.P);
        this.Q = eb1.b(n3, "calculate_odt_timeout", this.Q);
        boolean z = this.R;
        synchronized (n3.a) {
            optBoolean = n3.a.optBoolean("async_odt_query", z);
        }
        this.R = optBoolean;
        this.S = eb1.b(n3, "ad_request_timeout", this.S);
        this.T = eb1.b(n3, "controller_heartbeat_interval", this.T);
        this.U = eb1.b(n3, "controller_heartbeat_timeout", this.U);
        synchronized (n3.a) {
            optBoolean2 = n3.a.optBoolean("enable_compression", false);
        }
        this.W = optBoolean2;
        if1 a2 = if1.a();
        ic1 o2 = n3.o("odt_config");
        n nVar = new n();
        a2.getClass();
        if (ga1.i()) {
            context = ga1.P.getApplicationContext();
        } else {
            context = null;
        }
        if (context != null && o2 != null) {
            try {
                a2.a.execute(new hf1(a2, o2, nVar, context));
            } catch (RejectedExecutionException e3) {
                StringBuilder sb = new StringBuilder();
                StringBuilder b2 = e5.b("ADCEventsRepository.open failed with: ");
                b2.append(e3.toString());
                sb.append(b2.toString());
                t1.b(0, 0, sb.toString(), true);
            }
        }
    }

    public final void j() {
        this.D.b(false);
        this.C = true;
    }

    public final pb1 k() {
        if (this.d == null) {
            pb1 pb1Var = new pb1();
            this.d = pb1Var;
            pb1Var.f();
        }
        return this.d;
    }

    public final he1 l() {
        if (this.j == null) {
            he1 he1Var = new he1();
            this.j = he1Var;
            he1Var.a.b(false);
            he1Var.b.b(false);
            ga1.f("Device.get_info", new be1());
        }
        return this.j;
    }

    public final kf1 m() {
        if (this.f == null) {
            kf1 kf1Var = new kf1();
            this.f = kf1Var;
            kf1Var.f();
        }
        return this.f;
    }

    public final nc1 n() {
        if (this.i == null) {
            nc1 nc1Var = new nc1();
            this.i = nc1Var;
            nc1Var.e();
        }
        return this.i;
    }

    public final tc1 o() {
        if (this.a == null) {
            tc1 tc1Var = new tc1();
            this.a = tc1Var;
            tc1Var.a();
        }
        return this.a;
    }

    public final e2 p() {
        if (this.r == null) {
            this.r = new e2();
        }
        return this.r;
    }

    public final re1 q() {
        if (this.c == null) {
            re1 re1Var = new re1();
            this.c = re1Var;
            ga1.f("SessionInfo.stopped", new qe1(re1Var));
            re1Var.j = new ff1(re1Var);
        }
        return this.c;
    }

    public final jf1 r() {
        if (this.h == null) {
            jf1 jf1Var = new jf1();
            this.h = jf1Var;
            jf1Var.a();
        }
        return this.h;
    }
}