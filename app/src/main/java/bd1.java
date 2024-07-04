package defpackage;

import defpackage.ke1;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: bd1  reason: default package */
public final class bd1 implements Runnable {
    public final /* synthetic */ ad1 P;

    /* renamed from: bd1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ke1.a {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
        @Override // defpackage.ke1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(ke1 ke1Var, rc1 rc1Var, Map<String, List<String>> map) {
            boolean z;
            boolean z2;
            ad1 ad1Var = bd1.this.P;
            ad1Var.getClass();
            if (ke1Var.c0) {
                ic1 d = eb1.d(ke1Var.b0, "Parsing launch response");
                ad1Var.l().getClass();
                eb1.j(d, "sdkVersion", "4.8.0");
                eb1.q(d, ad1Var.h.a + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
                boolean z3 = true;
                try {
                    try {
                        ic1 n = d.n("controller");
                        ad1Var.w = n.q("url");
                        ad1Var.x = n.q("sha1");
                        ad1Var.y = d.q("status");
                        ad1Var.i(d);
                        List<ic1> list = h2.a;
                        synchronized (list) {
                            if (list.size() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            h2.a();
                        }
                    } catch (Exception unused) {
                        new File(ad1Var.h.a + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
                    }
                } catch (Exception unused2) {
                }
                if (ad1Var.y.equals("disable") && !kd1.x0) {
                    try {
                        new File(ad1Var.h.a + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5").delete();
                    } catch (Exception unused3) {
                    }
                    ga1.h().n().d(0, 1, "Launch server response with disabled status. Disabling AdColony until next launch.", true);
                    w1.d();
                } else if ((ad1Var.w.equals("") || ad1Var.y.equals("")) && !kd1.x0) {
                    t1.b(0, 0, "Missing controller status or URL. Disabling AdColony until next launch.", true);
                } else {
                    z = true;
                    if (z) {
                        if (!ad1Var.F) {
                            ga1.h().n().d(0, 0, "Incomplete or disabled launch server response. Disabling AdColony until next launch.", false);
                            ad1Var.j();
                            return;
                        }
                        return;
                    }
                    if (ad1Var.F) {
                        ic1 ic1Var = ad1Var.t;
                        if (ic1Var != null && ic1Var.n("controller").q("sha1").equals(d.n("controller").q("sha1"))) {
                            z3 = false;
                        } else {
                            t1.b(0, 1, "Controller sha1 does not match, downloading new controller.", true);
                        }
                    }
                    if (z3) {
                        ic1 ic1Var2 = new ic1();
                        eb1.j(ic1Var2, "url", ad1Var.w);
                        eb1.j(ic1Var2, "filepath", ad1Var.h.a + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
                        ad1Var.b.b(new ke1(new rc1(0, ic1Var2, "WebServices.download"), new dd1(ad1Var)));
                    }
                    ad1Var.t = d;
                    return;
                }
                z = false;
                if (z) {
                }
            } else {
                ad1Var.d();
            }
        }
    }

    public bd1(ad1 ad1Var) {
        this.P = ad1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ic1 f;
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "url", ad1.X);
        eb1.j(ic1Var, "content_type", "application/json");
        he1 l = this.P.l();
        if (!l.a.a) {
            try {
                ic1[] ic1VarArr = new ic1[2];
                ic1VarArr[0] = l.c();
                mc1 mc1Var = l.a;
                if (!mc1Var.a) {
                    mc1Var.a(2000L);
                }
                ic1VarArr[1] = l.b();
                f = eb1.f(ic1VarArr);
                f.r("launch_metadata");
            } catch (Exception unused) {
            }
            eb1.j(ic1Var, "content", f.toString());
            eb1.j(ic1Var, "url", ad1.X);
            if (this.P.W) {
                ic1 ic1Var2 = new ic1();
                eb1.j(ic1Var2, "request", "la-req-01");
                eb1.j(ic1Var2, "response", "la-res-01");
                eb1.i(ic1Var, "dictionaries_mapping", ic1Var2);
            }
            this.P.b.b(new ke1(new rc1(0, ic1Var, "WebServices.post"), new a()));
        }
        f = eb1.f(l.c(), l.b());
        f.r("launch_metadata");
        eb1.j(ic1Var, "content", f.toString());
        eb1.j(ic1Var, "url", ad1.X);
        if (this.P.W) {
        }
        this.P.b.b(new ke1(new rc1(0, ic1Var, "WebServices.post"), new a()));
    }
}