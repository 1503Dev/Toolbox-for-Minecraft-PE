package defpackage;

import defpackage.eg1;

/* renamed from: i2  reason: default package */
public final class i2 {
    public z61 a;
    public c b;
    public ob1 c;
    public zd1 d;
    public int e;
    public String f;
    public String g;
    public final String h;
    public String i;
    public String j;
    public boolean l;
    public String m;
    public final a n = new a();
    public int k = 1;

    /* renamed from: i2$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements eg1.a {
        public boolean P;

        public a() {
        }

        @Override // defpackage.eg1.a
        public final boolean a() {
            return this.P;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                if (this.P) {
                    return;
                }
                this.P = true;
                if (!ga1.j()) {
                    return;
                }
                ad1 h = ga1.h();
                if (h.D.a) {
                    h.h();
                }
                StringBuilder b = e5.b("Ad show failed due to a native timeout (5000 ms). ");
                StringBuilder b2 = e5.b("Interstitial with adSessionId(");
                b2.append(i2.this.f);
                b2.append("). ");
                b.append(b2.toString());
                b.append("Reloading controller.");
                t1.b(0, 0, b.toString(), true);
            }
        }
    }

    /* renamed from: i2$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public final /* synthetic */ z61 P;

        public b(i2 i2Var, z61 z61Var) {
            this.P = z61Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.getClass();
        }
    }

    /* renamed from: i2$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
    }

    public i2(String str, z61 z61Var, String str2) {
        this.a = z61Var;
        this.h = str2;
        this.f = str;
    }

    public final void a() {
        c cVar;
        synchronized (this) {
            this.k = 6;
            cVar = this.b;
            if (cVar != null) {
                this.b = null;
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            ad1 ad1Var = ((fd1) cVar).a;
            int i = ad1Var.V - 1;
            ad1Var.V = i;
            if (i == 0) {
                ad1Var.b();
            }
        }
    }

    public final boolean b() {
        this.k = 4;
        z61 z61Var = this.a;
        if (z61Var == null) {
            return false;
        }
        eg1.n(new b(this, z61Var));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        StringBuilder sb;
        String str;
        m2 m2Var;
        if (!ga1.j()) {
            return false;
        }
        ad1 h = ga1.h();
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "zone_id", this.h);
        eb1.l(0, ic1Var, "type");
        eb1.j(ic1Var, "id", this.f);
        int i = this.k;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eb1.l(24, ic1Var, "request_fail_reason");
            sb = new StringBuilder();
            sb.append("This ad object has already been shown. Please request a new ad ");
            str = "via AdColony.requestInterstitial.";
        } else if (i == 4) {
            eb1.l(17, ic1Var, "request_fail_reason");
            sb = new StringBuilder();
            sb.append("This ad object has expired. Please request a new ad via AdColony");
            str = ".requestInterstitial.";
        } else if (h.A) {
            eb1.l(23, ic1Var, "request_fail_reason");
            sb = new StringBuilder();
            str = "Can not show ad while an interstitial is already active.";
        } else {
            m2 m2Var2 = h.u.get(this.h);
            if (m2Var2 != null) {
                if (m2.a(m2Var2.c) > 1) {
                    int i2 = m2Var2.e;
                    if (i2 == 0) {
                        m2Var2.e = m2.a(m2Var2.c) - 1;
                    } else {
                        m2Var2.e = i2 - 1;
                    }
                }
                z2 = false;
                if (!z2) {
                    eb1.l(11, ic1Var, "request_fail_reason");
                    z4 = false;
                    m2Var = h.u.get(this.h);
                    if (m2Var != null && m2Var.f && h.p == null) {
                        t1.b(0, 1, "Rewarded ad: show() called with no reward listener set.", false);
                    }
                    new rc1(1, ic1Var, "AdSession.launch_ad_unit").b();
                    return z4;
                }
                ad1 h2 = ga1.h();
                if (h2.k == null) {
                    h2.k = new rd1();
                }
                h2.k.getClass();
                String b2 = rd1.b();
                String str2 = this.m;
                if (str2 != null && str2.length() != 0 && !str2.equals(b2) && !str2.equals("all") && ((!str2.equals("online") || (!b2.equals("wifi") && !b2.equals("cell"))) && (!str2.equals("offline") || !b2.equals("none")))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    eb1.l(9, ic1Var, "request_fail_reason");
                    sb = new StringBuilder();
                    str = "Tried to show interstitial ad during unacceptable network conditions.";
                } else {
                    this.k = 5;
                    ga1.h().A = true;
                    eg1.e(5000L, this.n);
                    z4 = true;
                    m2Var = h.u.get(this.h);
                    if (m2Var != null) {
                        t1.b(0, 1, "Rewarded ad: show() called with no reward listener set.", false);
                    }
                    new rc1(1, ic1Var, "AdSession.launch_ad_unit").b();
                    return z4;
                }
            }
            z2 = true;
            if (!z2) {
            }
        }
        sb.append(str);
        t1.b(0, 1, sb.toString(), false);
        z4 = false;
        m2Var = h.u.get(this.h);
        if (m2Var != null) {
        }
        new rc1(1, ic1Var, "AdSession.launch_ad_unit").b();
        return z4;
    }
}