package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.adcolony.sdk.AdColonyAdViewActivity;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;

/* renamed from: mf1  reason: default package */
public final class mf1 {

    /* renamed from: mf1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements zc1 {
        public a() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = rc1Var.b;
            pb1 k = ga1.h().k();
            String q = ic1Var.q("ad_session_id");
            i2 i2Var = k.c.get(q);
            z1 z1Var = k.f.get(q);
            if ((i2Var != null && i2Var.a != null && i2Var.c != null) || (z1Var != null && z1Var.getListener() != null)) {
                if (z1Var == null) {
                    new rc1("AdUnit.make_in_app_purchase", i2Var.c.c0).b();
                }
                mf1.b(q);
                mf1.c(q);
            }
        }
    }

    /* renamed from: mf1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements zc1 {
        public b() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            Activity activity;
            mf1.this.getClass();
            String q = rc1Var.b.q("ad_session_id");
            Context context = ga1.P;
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            boolean z = activity instanceof AdColonyAdViewActivity;
            if (activity instanceof ia1) {
                if (z) {
                    ((AdColonyAdViewActivity) activity).e();
                    return;
                }
                ic1 ic1Var = new ic1();
                eb1.j(ic1Var, "id", q);
                new rc1(((ia1) activity).R, ic1Var, "AdSession.on_request_close").b();
            }
        }
    }

    /* renamed from: mf1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements zc1 {
        public c() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = rc1Var.b;
            Context context = ga1.P;
            if (context != null && ga1.j()) {
                String q = ic1Var.q("ad_session_id");
                ad1 h = ga1.h();
                z1 z1Var = h.k().f.get(q);
                if (z1Var != null) {
                    if ((z1Var.getTrustedDemandSource() || z1Var.d0) && h.n != z1Var) {
                        z1Var.setExpandMessage(rc1Var);
                        z1Var.setExpandedWidth(ic1Var.l("width"));
                        z1Var.setExpandedHeight(ic1Var.l("height"));
                        z1Var.setOrientation(ic1Var.a(-1, "orientation"));
                        z1Var.setNoCloseButton(ic1Var.j("use_custom_close"));
                        h.n = z1Var;
                        h.l = z1Var.getContainer();
                        Intent intent = new Intent(context, AdColonyAdViewActivity.class);
                        mf1.c(q);
                        mf1.b(q);
                        eg1.i(intent, false);
                    }
                }
            }
        }
    }

    /* renamed from: mf1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements zc1 {
        public d() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            z1 z1Var = ga1.h().k().f.get(rc1Var.b.q("ad_session_id"));
            if (z1Var != null) {
                z1Var.setNoCloseButton(rc1Var.b.j("use_custom_close"));
            }
        }
    }

    /* renamed from: mf1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements zc1 {
        public e() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            int orientation;
            int i;
            mf1.this.getClass();
            ic1 ic1Var = rc1Var.b;
            String q = ic1Var.q("ad_session_id");
            int l = ic1Var.l("orientation");
            pb1 k = ga1.h().k();
            z1 z1Var = k.f.get(q);
            i2 i2Var = k.c.get(q);
            Context context = ga1.P;
            if (z1Var != null) {
                z1Var.setOrientation(l);
            } else if (i2Var != null) {
                i2Var.e = l;
            }
            if (i2Var == null && z1Var == null) {
                t1.b(0, 0, k6.b("Invalid ad session id sent with set orientation properties message: ", q), true);
            } else if (context instanceof ia1) {
                ia1 ia1Var = (ia1) context;
                if (z1Var == null) {
                    orientation = i2Var.e;
                } else {
                    orientation = z1Var.getOrientation();
                }
                if (orientation != 0) {
                    if (orientation != 1) {
                        i = 4;
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
                ia1Var.setRequestedOrientation(i);
                ia1Var.Q = orientation;
            }
        }
    }

    /* renamed from: mf1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements zc1 {
        public f() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = rc1Var.b;
            String q = ic1Var.n("clickOverride").q("url");
            String q2 = ic1Var.q("ad_session_id");
            pb1 k = ga1.h().k();
            i2 i2Var = k.c.get(q2);
            z1 z1Var = k.f.get(q2);
            if (i2Var != null) {
                i2Var.i = q;
            } else if (z1Var != null) {
                z1Var.setClickOverride(q);
            }
        }
    }

    /* renamed from: mf1$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g implements Runnable {
        public final /* synthetic */ String P;

        public g(String str) {
            this.P = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ic1 ic1Var = new ic1();
            eb1.j(ic1Var, "type", "open_hook");
            eb1.j(ic1Var, "message", this.P);
            new rc1(0, ic1Var, "CustomMessage.controller_send").b();
        }
    }

    /* renamed from: mf1$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h implements zc1 {
        public h() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            mf1.f(rc1Var);
        }
    }

    /* renamed from: mf1$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i implements zc1 {
        public i() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = new ic1();
            ic1 ic1Var2 = rc1Var.b;
            Intent intent = new Intent("android.intent.action.DIAL");
            StringBuilder b = e5.b("tel:");
            b.append(ic1Var2.q("phone_number"));
            Intent data = intent.setData(Uri.parse(b.toString()));
            String q = ic1Var2.q("ad_session_id");
            if (eg1.i(data, false)) {
                eb1.m(ic1Var, "success", true);
                rc1Var.a(ic1Var).b();
                mf1.d(q);
                mf1.b(q);
                mf1.c(q);
                return;
            }
            eg1.f("Failed to dial number.");
            eb1.m(ic1Var, "success", false);
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: mf1$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class j implements zc1 {
        public j() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = rc1Var.b;
            ic1 ic1Var2 = new ic1();
            String q = ic1Var.q("ad_session_id");
            nr c = eb1.c(ic1Var, "recipients");
            String str = "";
            for (int i = 0; i < c.c(); i++) {
                if (i != 0) {
                    str = k6.b(str, ";");
                }
                StringBuilder b = e5.b(str);
                b.append(c.g(i));
                str = b.toString();
            }
            if (eg1.i(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", ic1Var.q("body")), false)) {
                eb1.m(ic1Var2, "success", true);
                rc1Var.a(ic1Var2).b();
                mf1.d(q);
                mf1.b(q);
                mf1.c(q);
                return;
            }
            eg1.f("Failed to create sms.");
            eb1.m(ic1Var2, "success", false);
            rc1Var.a(ic1Var2).b();
        }
    }

    /* renamed from: mf1$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class k implements zc1 {
        public k() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            Context context = ga1.P;
            if (context != null) {
                int a = rc1Var.b.a(500, "length_ms");
                ic1 ic1Var = new ic1();
                ThreadPoolExecutor threadPoolExecutor = eg1.a;
                nr nrVar = new nr();
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                    if (packageInfo.requestedPermissions != null) {
                        nr nrVar2 = new nr();
                        int i = 0;
                        while (true) {
                            try {
                                String[] strArr = packageInfo.requestedPermissions;
                                if (i >= strArr.length) {
                                    break;
                                }
                                nrVar2.d(strArr[i]);
                                i++;
                            } catch (Exception unused) {
                            }
                        }
                        nrVar = nrVar2;
                    }
                } catch (Exception unused2) {
                }
                boolean z = false;
                for (int i2 = 0; i2 < nrVar.c(); i2++) {
                    if (nrVar.g(i2).equals("android.permission.VIBRATE")) {
                        z = true;
                    }
                }
                if (!z) {
                    t1.b(0, 1, "No vibrate permission detected.", false);
                } else if (eg1.h(context, a)) {
                    eb1.m(ic1Var, "success", true);
                    rc1Var.a(ic1Var).b();
                }
                eb1.m(ic1Var, "success", false);
                rc1Var.a(ic1Var).b();
            }
        }
    }

    /* renamed from: mf1$l */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class l implements zc1 {
        public l() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = new ic1();
            ic1 ic1Var2 = rc1Var.b;
            String q = ic1Var2.q("url");
            String q2 = ic1Var2.q("ad_session_id");
            z1 z1Var = ga1.h().k().f.get(q2);
            if (z1Var == null || z1Var.getTrustedDemandSource() || z1Var.d0) {
                if (q.startsWith("browser")) {
                    q = q.replaceFirst("browser", "http");
                }
                if (q.startsWith("safari")) {
                    q = q.replaceFirst("safari", "http");
                }
                mf1.e(q);
                if (eg1.i(new Intent("android.intent.action.VIEW", Uri.parse(q)), false)) {
                    eb1.m(ic1Var, "success", true);
                    rc1Var.a(ic1Var).b();
                    mf1.d(q2);
                    mf1.b(q2);
                    mf1.c(q2);
                    return;
                }
                eg1.f("Failed to launch browser.");
                eb1.m(ic1Var, "success", false);
                rc1Var.a(ic1Var).b();
            }
        }
    }

    /* renamed from: mf1$m */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class m implements zc1 {
        public m() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = new ic1();
            ic1 ic1Var2 = rc1Var.b;
            nr c = eb1.c(ic1Var2, "recipients");
            boolean j = ic1Var2.j("html");
            String q = ic1Var2.q("subject");
            String q2 = ic1Var2.q("body");
            String q3 = ic1Var2.q("ad_session_id");
            String[] strArr = new String[c.c()];
            for (int i = 0; i < c.c(); i++) {
                strArr[i] = c.g(i);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (!j) {
                intent.setType("plain/text");
            }
            intent.putExtra("android.intent.extra.SUBJECT", q).putExtra("android.intent.extra.TEXT", q2).putExtra("android.intent.extra.EMAIL", strArr);
            if (eg1.i(intent, false)) {
                eb1.m(ic1Var, "success", true);
                rc1Var.a(ic1Var).b();
                mf1.d(q3);
                mf1.b(q3);
                mf1.c(q3);
                return;
            }
            eg1.f("Failed to send email.");
            eb1.m(ic1Var, "success", false);
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: mf1$n */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class n implements zc1 {
        public n() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = new ic1();
            ic1 ic1Var2 = rc1Var.b;
            String q = ic1Var2.q("ad_session_id");
            if (ic1Var2.j("deep_link")) {
                mf1.f(rc1Var);
                return;
            }
            Context context = ga1.P;
            if (context != null) {
                if (eg1.i(context.getPackageManager().getLaunchIntentForPackage(ic1Var2.q("handle")), false)) {
                    eb1.m(ic1Var, "success", true);
                    rc1Var.a(ic1Var).b();
                    mf1.d(q);
                    mf1.b(q);
                    mf1.c(q);
                    return;
                }
                eg1.f("Failed to launch external application.");
                eb1.m(ic1Var, "success", false);
                rc1Var.a(ic1Var).b();
            }
        }
    }

    /* renamed from: mf1$o */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class o implements zc1 {
        public o() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01e1  */
        @Override // defpackage.zc1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(rc1 rc1Var) {
            nr nrVar;
            nr nrVar2;
            String str;
            nr nrVar3;
            String str2;
            rc1 rc1Var2;
            ic1 ic1Var;
            String str3;
            String str4;
            long j;
            long j2;
            Intent putExtra;
            mf1.this.getClass();
            ic1 ic1Var2 = new ic1();
            ic1 ic1Var3 = rc1Var.b;
            String q = ic1Var3.q("ad_session_id");
            ic1 n = ic1Var3.n("params");
            ic1 n2 = n.n("recurrence");
            nr nrVar4 = new nr();
            nr nrVar5 = new nr();
            nr nrVar6 = new nr();
            String q2 = n.q("description");
            n.q("location");
            String q3 = n.q("start");
            String q4 = n.q("end");
            String q5 = n.q("summary");
            if (!n2.f()) {
                str2 = n2.q("expires");
                str = n2.q("frequency").toUpperCase(Locale.getDefault());
                nrVar3 = eb1.c(n2, "daysInWeek");
                nrVar = eb1.c(n2, "daysInMonth");
                nrVar2 = eb1.c(n2, "daysInYear");
            } else {
                nrVar = nrVar5;
                nrVar2 = nrVar6;
                str = "";
                nrVar3 = nrVar4;
                str2 = str;
            }
            if (q5.equals("")) {
                q5 = q2;
            }
            Date x = eg1.x(q3);
            Date x2 = eg1.x(q4);
            Date x3 = eg1.x(str2);
            if (x != null && x2 != null) {
                long time = x.getTime();
                long time2 = x2.getTime();
                long j3 = 0;
                if (x3 != null) {
                    j = (x3.getTime() - x.getTime()) / 1000;
                } else {
                    j = 0;
                }
                if (str.equals("DAILY")) {
                    j2 = 86400;
                } else if (str.equals("WEEKLY")) {
                    j2 = 604800;
                } else if (str.equals("MONTHLY")) {
                    j2 = 2629800;
                } else {
                    if (str.equals("YEARLY")) {
                        j2 = 31557600;
                    }
                    long j4 = j3;
                    if (n2.f()) {
                        String str5 = "FREQ=" + str + ";COUNT=" + j4;
                        try {
                            if (nrVar3.c() != 0) {
                                str5 = str5 + ";BYDAY=" + eg1.d(nrVar3);
                            }
                            if (nrVar.c() != 0) {
                                str5 = str5 + ";BYMONTHDAY=" + eg1.k(nrVar);
                            }
                            if (nrVar2.c() != 0) {
                                str5 = str5 + ";BYYEARDAY=" + eg1.k(nrVar2);
                            }
                        } catch (JSONException unused) {
                        }
                        putExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", q5).putExtra("description", q2).putExtra("beginTime", time).putExtra("endTime", time2).putExtra("rrule", str5);
                    } else {
                        putExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", q5).putExtra("description", q2).putExtra("beginTime", time).putExtra("endTime", time2);
                    }
                    if (!eg1.i(putExtra, false)) {
                        eb1.m(ic1Var2, "success", true);
                        rc1Var.a(ic1Var2).b();
                        mf1.d(q);
                        mf1.b(q);
                        mf1.c(q);
                        return;
                    }
                    rc1Var2 = rc1Var;
                    ic1Var = ic1Var2;
                    str3 = "success";
                    str4 = "Unable to create Calendar Event.";
                }
                j3 = (j / j2) + 1;
                long j42 = j3;
                if (n2.f()) {
                }
                if (!eg1.i(putExtra, false)) {
                }
            } else {
                rc1Var2 = rc1Var;
                ic1Var = ic1Var2;
                str3 = "success";
                str4 = "Unable to create Calendar Event";
            }
            eg1.f(str4);
            eb1.m(ic1Var, str3, false);
            rc1Var2.a(ic1Var).b();
        }
    }

    /* renamed from: mf1$p */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class p implements zc1 {
        public p() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            mf1.this.getClass();
            ic1 ic1Var = new ic1();
            ic1 ic1Var2 = rc1Var.b;
            Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
            Intent putExtra = type.putExtra("android.intent.extra.TEXT", ic1Var2.q("text") + " " + ic1Var2.q("url"));
            String q = ic1Var2.q("ad_session_id");
            if (eg1.i(putExtra, true)) {
                eb1.m(ic1Var, "success", true);
                rc1Var.a(ic1Var).b();
                mf1.d(q);
                mf1.b(q);
                mf1.c(q);
                return;
            }
            eg1.f("Unable to create social post.");
            eb1.m(ic1Var, "success", false);
            rc1Var.a(ic1Var).b();
        }
    }

    public static void b(String str) {
        z1 z1Var;
        pb1 k2 = ga1.h().k();
        i2 i2Var = k2.c.get(str);
        if ((i2Var == null || i2Var.a == null || !i2Var.l) && (z1Var = k2.f.get(str)) != null) {
            z1Var.getListener();
        }
    }

    public static void c(String str) {
        if (ga1.h().k().f.get(str) == null) {
            return;
        }
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "ad_session_id", str);
        new rc1(1, ic1Var, "MRAID.on_event").b();
    }

    public static void d(String str) {
        z1 z1Var;
        pb1 k2 = ga1.h().k();
        i2 i2Var = k2.c.get(str);
        if ((i2Var == null || i2Var.a == null) && (z1Var = k2.f.get(str)) != null) {
            z1Var.getListener();
        }
    }

    public static void e(String str) {
        boolean z;
        try {
            eg1.a.execute(new g(str));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (!z) {
            t1.b(0, 0, "Executing ADCSystem.sendOpenCustomMessage failed", true);
        }
    }

    public static boolean f(rc1 rc1Var) {
        ic1 ic1Var = new ic1();
        ic1 ic1Var2 = rc1Var.b;
        String q = ic1Var2.q("product_id");
        String q2 = ic1Var2.q("ad_session_id");
        if (q.equals("")) {
            q = ic1Var2.q("handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(q));
        e(q);
        if (eg1.i(intent, false)) {
            eb1.m(ic1Var, "success", true);
            rc1Var.a(ic1Var).b();
            d(q2);
            b(q2);
            c(q2);
            return true;
        }
        eg1.f("Unable to open.");
        eb1.m(ic1Var, "success", false);
        rc1Var.a(ic1Var).b();
        return false;
    }

    public final void a() {
        ga1.f("System.open_store", new h());
        ga1.f("System.telephone", new i());
        ga1.f("System.sms", new j());
        ga1.f("System.vibrate", new k());
        ga1.f("System.open_browser", new l());
        ga1.f("System.mail", new m());
        ga1.f("System.launch_app", new n());
        ga1.f("System.create_calendar_event", new o());
        ga1.f("System.social_post", new p());
        ga1.f("System.make_in_app_purchase", new a());
        ga1.f("System.close", new b());
        ga1.f("System.expand", new c());
        ga1.f("System.use_custom_close", new d());
        ga1.f("System.set_orientation_properties", new e());
        ga1.f("System.click_override", new f());
    }
}