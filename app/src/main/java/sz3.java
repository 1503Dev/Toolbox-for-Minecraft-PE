package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: sz3  reason: default package */
public final class sz3 {
    public Context a;
    public long b = 0;

    public final void a(Context context, xv2 xv2Var, boolean z, su2 su2Var, String str, String str2, yk5 yk5Var, final rm4 rm4Var) {
        PackageInfo b;
        jv5 jv5Var = jv5.A;
        jv5Var.j.getClass();
        if (SystemClock.elapsedRealtime() - this.b < 5000) {
            sv2.g("Not retrying to fetch app settings");
            return;
        }
        jv5Var.j.getClass();
        this.b = SystemClock.elapsedRealtime();
        if (su2Var != null) {
            long j = su2Var.f;
            jv5Var.j.getClass();
            if (System.currentTimeMillis() - j <= ((Long) w82.d.c.a(x92.s3)).longValue() && su2Var.h) {
                return;
            }
        }
        if (context == null) {
            sv2.g("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            sv2.g("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.a = applicationContext;
            final hm4 t = eb1.t(context, 4);
            t.f();
            zj2 a = jv5Var.p.a(this.a, xv2Var, rm4Var);
            gw gwVar = yj2.b;
            ck2 a2 = a.a("google.afma.config.fetchAppSettings", gwVar, gwVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                p92 p92Var = x92.a;
                jSONObject.put("experiment_ids", TextUtils.join(",", w82.d.a.a()));
                jSONObject.put("js", xv2Var.P);
                try {
                    ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                    if (applicationInfo != null && (b = c81.a(context).b(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", b.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    vz3.k("Error fetching PackageInfo.");
                }
                dz4 a3 = a2.a(jSONObject);
                ky4 ky4Var = new ky4() { // from class: cg3
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj) {
                        rm4 rm4Var2 = rm4.this;
                        hm4 hm4Var = t;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            String string = jSONObject2.getString("appSettingsJson");
                            jv5 jv5Var2 = jv5.A;
                            nl5 b2 = jv5Var2.g.b();
                            b2.B();
                            synchronized (b2.a) {
                                jv5Var2.j.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                if (string != null && !string.equals(b2.p.e)) {
                                    b2.p = new su2(string, currentTimeMillis);
                                    SharedPreferences.Editor editor = b2.g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        b2.g.putLong("app_settings_last_update_ms", currentTimeMillis);
                                        b2.g.apply();
                                    }
                                    b2.D();
                                    Iterator it = b2.c.iterator();
                                    while (it.hasNext()) {
                                        ((Runnable) it.next()).run();
                                    }
                                }
                                b2.p.f = currentTimeMillis;
                            }
                        }
                        hm4Var.k0(optBoolean);
                        rm4Var2.c(hm4Var.n());
                        return zw4.C(null);
                    }
                };
                yw2 yw2Var = zw2.f;
                ay4 F = zw4.F(a3, ky4Var, yw2Var);
                if (yk5Var != null) {
                    ((bx2) a3).b(yk5Var, yw2Var);
                }
                tv2.x(F, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                sv2.e("Error requesting application settings", e);
                t.b(e);
                t.k0(false);
                rm4Var.c(t.n());
            }
        }
    }
}