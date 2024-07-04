package defpackage;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zd1  reason: default package */
public final class zd1 {
    public z91 a;
    public zw5 b;
    public fk c;
    public int e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public String n;
    public String o;
    public ArrayList d = new ArrayList();
    public String f = "";

    /* renamed from: zd1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ String P;

        public a(String str) {
            this.P = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ic1 ic1Var = new ic1();
            ic1 ic1Var2 = new ic1();
            eb1.l(zd1.this.e, ic1Var2, "session_type");
            eb1.j(ic1Var2, "session_id", zd1.this.f);
            eb1.j(ic1Var2, "event", this.P);
            eb1.j(ic1Var, "type", "iab_hook");
            eb1.j(ic1Var, "message", ic1Var2.toString());
            new rc1(0, ic1Var, "CustomMessage.controller_send").b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zd1(ic1 ic1Var, String str) {
        int i;
        nr c;
        int i2;
        i31 i31Var;
        this.e = -1;
        this.n = "";
        this.o = "";
        int l = ic1Var.l("ad_unit_type");
        String q = ic1Var.q("ad_type");
        try {
            if (l != 0) {
                if (l == 1) {
                    if (!q.equals("video")) {
                        if (q.equals("display")) {
                            i = 1;
                        } else if (q.equals("banner_display") || q.equals("interstitial_display")) {
                            i = 2;
                        }
                        this.e = i;
                        this.j = ic1Var.j("skippable");
                        this.l = ic1Var.l("skip_offset");
                        this.m = ic1Var.l("video_duration");
                        c = eb1.c(ic1Var, "js_resources");
                        nr c2 = eb1.c(ic1Var, "verification_params");
                        nr c3 = eb1.c(ic1Var, "vendor_keys");
                        this.o = str;
                        for (i2 = 0; i2 < c.c(); i2++) {
                            try {
                                String g = c2.g(i2);
                                String g2 = c3.g(i2);
                                URL url = new URL(c.g(i2));
                                if (!g.equals("") && !g2.equals("")) {
                                    vj.b(g2, "VendorKey is null or empty");
                                    vj.b(g, "VerificationParameters is null or empty");
                                    i31Var = new i31(g2, url, g);
                                } else {
                                    i31Var = new i31(null, url, null);
                                }
                                this.d.add(i31Var);
                            } catch (MalformedURLException unused) {
                                t1.b(0, 0, "Invalid js resource url passed to Omid", true);
                            }
                        }
                        kf1 m = ga1.h().m();
                        String q2 = ic1Var.q("filepath");
                        m.getClass();
                        this.n = kf1.a(q2, true).toString();
                        return;
                    }
                }
                i = this.e;
                this.e = i;
                this.j = ic1Var.j("skippable");
                this.l = ic1Var.l("skip_offset");
                this.m = ic1Var.l("video_duration");
                c = eb1.c(ic1Var, "js_resources");
                nr c22 = eb1.c(ic1Var, "verification_params");
                nr c32 = eb1.c(ic1Var, "vendor_keys");
                this.o = str;
                while (i2 < c.c()) {
                }
                kf1 m2 = ga1.h().m();
                String q22 = ic1Var.q("filepath");
                m2.getClass();
                this.n = kf1.a(q22, true).toString();
                return;
            }
            kf1 m22 = ga1.h().m();
            String q222 = ic1Var.q("filepath");
            m22.getClass();
            this.n = kf1.a(q222, true).toString();
            return;
        } catch (IOException unused2) {
            t1.b(0, 0, "Error loading IAB JS Client", true);
            return;
        }
        i = 0;
        this.e = i;
        this.j = ic1Var.j("skippable");
        this.l = ic1Var.l("skip_offset");
        this.m = ic1Var.l("video_duration");
        c = eb1.c(ic1Var, "js_resources");
        nr c222 = eb1.c(ic1Var, "verification_params");
        nr c322 = eb1.c(ic1Var, "vendor_keys");
        this.o = str;
        while (i2 < c.c()) {
        }
    }

    public final void a(ka1 ka1Var) {
        String str;
        ArrayList arrayList;
        nb a2;
        e3 a3;
        if (this.e >= 0 && (str = this.n) != null && !str.equals("") && (arrayList = this.d) != null) {
            if (!arrayList.isEmpty() || this.e == 2) {
                ad1 h = ga1.h();
                dd0 dd0Var = dd0.NATIVE;
                int i = this.e;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            xg xgVar = xg.HTML_DISPLAY;
                            wd0 wd0Var = h.O;
                            vj.a("Partner is null", wd0Var);
                            vj.a("WebView is null", ka1Var);
                            z91 y = z61.y(e3.a(xgVar, null), new nb(wd0Var, ka1Var, null, null, "", f3.HTML));
                            this.a = y;
                            this.f = y.m;
                            return;
                        }
                        return;
                    }
                    xg xgVar2 = xg.NATIVE_DISPLAY;
                    a2 = nb.a(h.O, this.n, this.d);
                    a3 = e3.a(xgVar2, null);
                } else {
                    xg xgVar3 = xg.VIDEO;
                    a2 = nb.a(h.O, this.n, this.d);
                    a3 = e3.a(xgVar3, dd0Var);
                }
                z91 y2 = z61.y(a3, a2);
                this.a = y2;
                this.f = y2.m;
                e("inject_javascript");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ob1 ob1Var) {
        nc1 n;
        String str;
        boolean z;
        fk fkVar;
        z91 z91Var;
        e31 e31Var;
        ld1 ld1Var;
        ImageView imageView;
        ob1 parentContainer;
        if (!this.i && this.e >= 0 && this.a != null) {
            js jsVar = js.OTHER;
            e("register_ad_view");
            ka1 ka1Var = ga1.h().v.get(Integer.valueOf(ob1Var.c0));
            if (ka1Var == null && !ob1Var.R.isEmpty()) {
                ka1Var = ob1Var.R.entrySet().iterator().next().getValue();
            }
            z91 z91Var2 = this.a;
            if (z91Var2 != null && ka1Var != null) {
                z91Var2.G1(ka1Var);
                if ((ka1Var instanceof ld1) && (imageView = (ld1Var = (ld1) ka1Var).x0) != null && (parentContainer = ld1Var.getParentContainer()) != null) {
                    parentContainer.a(imageView, jsVar);
                }
            } else if (z91Var2 != null) {
                z91Var2.G1(ob1Var);
                z91 z91Var3 = this.a;
                ob1Var.p0 = z91Var3;
                HashMap<Integer, View> hashMap = ob1Var.V;
                if (z91Var3 != null && hashMap != null) {
                    for (Map.Entry<Integer, View> entry : hashMap.entrySet()) {
                        ob1Var.a(entry.getValue(), jsVar);
                    }
                }
                e("register_obstructions");
            }
            ae1 ae1Var = new ae1(this);
            ExecutorService executorService = w1.a;
            try {
                if (!ga1.R) {
                    n = ga1.h().n();
                    str = "Ignoring call to AdColony.addCustomMessageListener as AdColony has not yet been configured.";
                } else if (!eg1.u("viewability_ad_event")) {
                    n = ga1.h().n();
                    str = "Ignoring call to AdColony.addCustomMessageListener.";
                } else {
                    ga1.h().q.put("viewability_ad_event", ae1Var);
                    if (this.e == 0) {
                        fkVar = null;
                    } else {
                        z91 z91Var4 = this.a;
                        vj.a("AdSession is null", z91Var4);
                        if (dd0.NATIVE == z91Var4.g.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (!z91Var4.k) {
                                vj.f(z91Var4);
                                g3 g3Var = z91Var4.j;
                                if (g3Var.c == null) {
                                    fkVar = new fk(8, z91Var4);
                                    g3Var.c = fkVar;
                                } else {
                                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                                }
                            } else {
                                throw new IllegalStateException("AdSession is started");
                            }
                        } else {
                            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
                        }
                    }
                    this.c = fkVar;
                    this.a.H1();
                    z91Var = this.a;
                    vj.a("AdSession is null", z91Var);
                    if (z91Var.j.b != null) {
                        vj.f(z91Var);
                        zw5 zw5Var = new zw5(9, z91Var);
                        z91Var.j.b = zw5Var;
                        this.b = zw5Var;
                        e("start_session");
                        if (this.c != null) {
                            if (this.j) {
                                e31Var = new e31(true, Float.valueOf(this.l));
                            } else {
                                e31Var = new e31(false, null);
                            }
                            zw5 zw5Var2 = this.b;
                            zw5Var2.getClass();
                            vj.i((z91) zw5Var2.Q);
                            vj.p((z91) zw5Var2.Q);
                            z91 z91Var5 = (z91) zw5Var2.Q;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("skippable", e31Var.a);
                                if (e31Var.a) {
                                    jSONObject.put("skipOffset", e31Var.b);
                                }
                                jSONObject.put("autoPlay", e31Var.c);
                                jSONObject.put("position", e31Var.d);
                            } catch (JSONException e) {
                                s45.b("VastProperties: JSON error", e);
                            }
                            if (!z91Var5.o) {
                                gw.d(z91Var5.j.f(), "publishLoadedEvent", jSONObject);
                                z91Var5.o = true;
                            } else {
                                throw new IllegalStateException("Loaded event can only be sent once");
                            }
                        } else {
                            zw5 zw5Var3 = this.b;
                            vj.i((z91) zw5Var3.Q);
                            vj.p((z91) zw5Var3.Q);
                            z91 z91Var6 = (z91) zw5Var3.Q;
                            if (!z91Var6.o) {
                                gw.d(z91Var6.j.f(), "publishLoadedEvent", new Object[0]);
                                z91Var6.o = true;
                            } else {
                                throw new IllegalStateException("Loaded event can only be sent once");
                            }
                        }
                        this.i = true;
                        return;
                    }
                    throw new IllegalStateException("AdEvents already exists for AdSession");
                }
                this.a.H1();
                z91Var = this.a;
                vj.a("AdSession is null", z91Var);
                if (z91Var.j.b != null) {
                }
            } catch (NullPointerException e2) {
                z91 z91Var7 = this.a;
                StringBuilder b = e5.b("Exception occurred on AdSession.start: ");
                b.append(Log.getStackTraceString(e2));
                z91Var7.E1(b.toString());
                d();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in ADCOmidManager on AdSession.start: ");
                sb.append(Log.getStackTraceString(e2));
                sb.append(" Ad with adSessionId: " + this.o + ".");
                t1.b(0, 0, sb.toString(), true);
                return;
            }
            n.d(0, 1, str, false);
            if (this.e == 0) {
            }
            this.c = fkVar;
        }
    }

    public final void c(String str, float f) {
        if (ga1.i() && this.a != null) {
            if (this.c == null && !str.equals("start") && !str.equals("skip") && !str.equals("continue") && !str.equals("cancel")) {
                return;
            }
            char c = 65535;
            try {
                switch (str.hashCode()) {
                    case -1941887438:
                        if (str.equals("first_quartile")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1710060637:
                        if (str.equals("buffer_start")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case -1638835128:
                        if (str.equals("midpoint")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1367724422:
                        if (str.equals("cancel")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -934426579:
                        if (str.equals("resume")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -651914917:
                        if (str.equals("third_quartile")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -599445191:
                        if (str.equals("complete")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -567202649:
                        if (str.equals("continue")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -342650039:
                        if (str.equals("sound_mute")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 3532159:
                        if (str.equals("skip")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 106440182:
                        if (str.equals("pause")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 109757538:
                        if (str.equals("start")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 583742045:
                        if (str.equals("in_video_engagement")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 823102269:
                        if (str.equals("html5_interaction")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 1648173410:
                        if (str.equals("sound_unmute")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1906584668:
                        if (str.equals("buffer_end")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.b.d();
                        fk fkVar = this.c;
                        if (fkVar != null) {
                            if (f <= 0.0f) {
                                f = this.m;
                            }
                            fkVar.o(f);
                        }
                        e(str);
                        return;
                    case 1:
                        this.c.i();
                        e(str);
                        return;
                    case 2:
                        this.c.k();
                        e(str);
                        return;
                    case 3:
                        this.c.p();
                        e(str);
                        return;
                    case 4:
                        this.k = true;
                        this.c.e();
                        e(str);
                        return;
                    case 5:
                        e(str);
                        d();
                        return;
                    case 6:
                    case 7:
                        fk fkVar2 = this.c;
                        if (fkVar2 != null) {
                            fkVar2.n();
                        }
                        e(str);
                        d();
                        return;
                    case '\b':
                        this.c.q(0.0f);
                        e(str);
                        return;
                    case '\t':
                        this.c.q(1.0f);
                        e(str);
                        return;
                    case '\n':
                        if (!this.g && !this.h && !this.k) {
                            fk fkVar3 = this.c;
                            vj.i((z91) fkVar3.Q);
                            ((z91) fkVar3.Q).j.d("pause");
                            e(str);
                            this.g = true;
                            this.h = false;
                            return;
                        }
                        return;
                    case 11:
                        if (this.g && !this.k) {
                            this.c.l();
                            e(str);
                            this.g = false;
                            return;
                        }
                        return;
                    case '\f':
                        this.c.c();
                        e(str);
                        return;
                    case '\r':
                        this.c.b();
                        e(str);
                        return;
                    case 14:
                    case 15:
                        this.c.a();
                        e(str);
                        if (this.h && !this.g && !this.k) {
                            fk fkVar4 = this.c;
                            vj.i((z91) fkVar4.Q);
                            ((z91) fkVar4.Q).j.d("pause");
                            e("pause");
                            this.g = true;
                            this.h = false;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                StringBuilder c2 = yg.c("Recording IAB event for ", str);
                StringBuilder b = e5.b(" caused ");
                b.append(e.getClass());
                c2.append(b.toString());
                t1.b(0, 1, c2.toString(), true);
            }
        }
    }

    public final void d() {
        ExecutorService executorService = w1.a;
        if (!ga1.R) {
            t1.b(0, 1, "Ignoring call to AdColony.removeCustomMessageListener as AdColony has not yet been configured.", false);
        } else {
            ga1.h().q.remove("viewability_ad_event");
        }
        this.a.F1();
        e("end_session");
        this.a = null;
    }

    public final void e(String str) {
        boolean z;
        try {
            eg1.a.execute(new a(str));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (!z) {
            t1.b(0, 0, "Executing ADCOmidManager.sendIabCustomMessage failed", true);
        }
    }
}