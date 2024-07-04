package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import defpackage.eg1;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: w1  reason: default package */
public final class w1 {
    public static ExecutorService a = eg1.z();

    /* renamed from: w1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ z61 P;
        public final /* synthetic */ String Q;

        public a(z61 z61Var, String str) {
            this.P = z61Var;
            this.Q = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            z61 z61Var = this.P;
            w1.a(this.Q);
            z61Var.V0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m2 a(String str) {
        m2 m2Var;
        ad1 h;
        if (ga1.i()) {
            h = ga1.h();
        } else if (ga1.j()) {
            h = ga1.h();
        } else {
            m2Var = null;
            if (m2Var != null) {
                return new m2();
            }
            return m2Var;
        }
        m2Var = h.u.get(str);
        if (m2Var != null) {
        }
    }

    public static void b(z61 z61Var, String str) {
        if (z61Var != null) {
            eg1.n(new a(z61Var, str));
        }
    }

    public static void c(Context context, e2 e2Var) {
        String str;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        ad1 h = ga1.h();
        he1 l = h.l();
        if (e2Var != null && context != null) {
            ThreadPoolExecutor threadPoolExecutor = eg1.a;
            try {
                str = context.getPackageName();
            } catch (Exception unused) {
                str = "unknown";
            }
            String p = eg1.p();
            Context context2 = ga1.P;
            int i = 0;
            if (context2 != null) {
                try {
                    i = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
                } catch (Exception unused2) {
                    t1.b(0, 0, "Failed to retrieve package info.", true);
                }
            }
            l.getClass();
            String e = he1.e();
            if (h.k == null) {
                h.k = new rd1();
            }
            h.k.getClass();
            String b = rd1.b();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", "unknown");
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            ga1.h().l().getClass();
            hashMap.put("countryLocaleShort", Locale.getDefault().getCountry());
            ga1.h().l().getClass();
            hashMap.put("manufacturer", Build.MANUFACTURER);
            ga1.h().l().getClass();
            hashMap.put("model", Build.MODEL);
            ga1.h().l().getClass();
            hashMap.put("osVersion", Build.VERSION.RELEASE);
            hashMap.put("carrierName", e);
            hashMap.put("networkType", b);
            hashMap.put("platform", "android");
            hashMap.put("appName", str);
            hashMap.put("appVersion", p);
            hashMap.put("appBuildNumber", Integer.valueOf(i));
            hashMap.put("appId", "" + e2Var.a);
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            ga1.h().l().getClass();
            hashMap.put("sdkVersion", "4.8.0");
            hashMap.put("controllerVersion", "unknown");
            JSONObject b2 = e2Var.b();
            b2.getClass();
            JSONObject c = e2Var.c();
            c.getClass();
            synchronized (b2) {
                optString = b2.optString("mediation_network");
            }
            if (!optString.equals("")) {
                synchronized (b2) {
                    optString5 = b2.optString("mediation_network");
                }
                hashMap.put("mediationNetwork", optString5);
                synchronized (b2) {
                    optString6 = b2.optString("mediation_network_version");
                }
                hashMap.put("mediationNetworkVersion", optString6);
            }
            synchronized (c) {
                optString2 = c.optString("plugin");
            }
            if (!optString2.equals("")) {
                synchronized (c) {
                    optString3 = c.optString("plugin");
                }
                hashMap.put("plugin", optString3);
                synchronized (c) {
                    optString4 = c.optString("plugin_version");
                }
                hashMap.put("pluginVersion", optString4);
            }
            nc1 n = h.n();
            n.getClass();
            try {
                me1 me1Var = new me1(new xb1(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
                n.e = me1Var;
                me1Var.b(TimeUnit.SECONDS);
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void d() {
        if (!ga1.R) {
            return;
        }
        Context context = ga1.P;
        if (context != null && (context instanceof ia1)) {
            ((Activity) context).finish();
        }
        ad1 h = ga1.h();
        h.k().e();
        h.c();
        h.e();
        h.j();
    }

    public static void e() {
        if (!ga1.R) {
            t1.b(0, 1, "Ignoring call to AdColony.removeRewardListener() as AdColony has not yet been configured.", false);
        } else {
            ga1.h().p = null;
        }
    }

    public static void f(z61 z61Var, String str) {
        boolean z = false;
        if (!ga1.R) {
            t1.b(0, 1, "Ignoring call to AdColony.requestInterstitial as AdColony has not yet been configured.", false);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (!je1.a(1, bundle)) {
                eg1.b bVar = new eg1.b(ga1.h().S);
                u1 u1Var = new u1(z61Var, str, bVar);
                eg1.e(bVar.a(), u1Var);
                try {
                    a.execute(new v1(u1Var, str, z61Var, bVar));
                    z = true;
                } catch (RejectedExecutionException unused) {
                }
                if (!z) {
                    eg1.g(u1Var);
                    return;
                }
                return;
            }
        }
        b(z61Var, str);
    }

    public static void g(e2 e2Var) {
        String str;
        boolean z = false;
        if (!ga1.R) {
            t1.b(0, 1, "Ignoring call to AdColony.setAppOptions() as AdColony has not yet been configured.", false);
            return;
        }
        ga1.b(e2Var);
        if (ga1.j()) {
            ad1 h = ga1.h();
            if (h.r != null) {
                z = true;
            }
            if (z && (str = h.p().a) != null) {
                e2Var.a = str;
                eb1.j(e2Var.b, "app_id", str);
            }
        }
        ga1.h().r = e2Var;
        Context context = ga1.P;
        if (context != null) {
            e2Var.a(context);
        }
        try {
            a.execute(new s1(e2Var));
        } catch (RejectedExecutionException unused) {
        }
    }
}