package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nl5  reason: default package */
public final class nl5 implements f25 {
    public boolean b;
    public dz4 d;
    public SharedPreferences f;
    public SharedPreferences.Editor g;
    public String i;
    public String j;
    public final Object a = new Object();
    public final ArrayList c = new ArrayList();
    public j32 e = null;
    public boolean h = true;
    public boolean k = true;
    public String l = "-1";
    public String m = "-1";
    public String n = "-1";
    public int o = -1;
    public su2 p = new su2("", 0);
    public long q = 0;
    public long r = 0;
    public int s = -1;
    public int t = 0;
    public Set u = Collections.emptySet();
    public JSONObject v = new JSONObject();
    public boolean w = true;
    public boolean x = true;
    public String y = null;
    public String z = "";
    public boolean A = false;
    public String B = "";
    public int C = -1;
    public int D = -1;
    public long E = 0;

    public final void A(Context context) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.a) {
            this.f = sharedPreferences;
            this.g = edit;
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            }
            if (z) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.h = this.f.getBoolean("use_https", this.h);
            this.w = this.f.getBoolean("content_url_opted_out", this.w);
            this.i = this.f.getString("content_url_hashes", this.i);
            this.k = this.f.getBoolean("gad_idless", this.k);
            this.x = this.f.getBoolean("content_vertical_opted_out", this.x);
            this.j = this.f.getString("content_vertical_hashes", this.j);
            this.t = this.f.getInt("version_code", this.t);
            this.p = new su2(this.f.getString("app_settings_json", this.p.e), this.f.getLong("app_settings_last_update_ms", this.p.f));
            this.q = this.f.getLong("app_last_background_time_ms", this.q);
            this.s = this.f.getInt("request_in_session_count", this.s);
            this.r = this.f.getLong("first_ad_req_time_ms", this.r);
            this.u = this.f.getStringSet("never_pool_slots", this.u);
            this.y = this.f.getString("display_cutout", this.y);
            this.C = this.f.getInt("app_measurement_npa", this.C);
            this.D = this.f.getInt("sd_app_measure_npa", this.D);
            this.E = this.f.getLong("sd_app_measure_npa_ts", this.E);
            this.z = this.f.getString("inspector_info", this.z);
            this.A = this.f.getBoolean("linked_device", this.A);
            this.B = this.f.getString("linked_ad_unit", this.B);
            this.l = this.f.getString("IABTCF_gdprApplies", this.l);
            this.n = this.f.getString("IABTCF_PurposeConsents", this.n);
            this.m = this.f.getString("IABTCF_TCString", this.m);
            this.o = this.f.getInt("gad_has_consent_for_cookies", this.o);
            try {
                this.v = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                sv2.h("Could not convert native advanced settings to json object", e);
            }
            D();
        }
    }

    public final void B() {
        dz4 dz4Var = this.d;
        if (dz4Var == null || dz4Var.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            sv2.h("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            sv2.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            sv2.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            sv2.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    @Override // defpackage.f25
    public final boolean C() {
        boolean z;
        if (!((Boolean) w82.d.c.a(x92.m0)).booleanValue()) {
            return false;
        }
        B();
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    public final void D() {
        zw2.a.execute(new gz1(1, this));
    }

    public final j32 E() {
        if (!this.b) {
            return null;
        }
        if ((y() && z()) || !((Boolean) eb2.b.d()).booleanValue()) {
            return null;
        }
        synchronized (this.a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.e == null) {
                this.e = new j32();
            }
            j32 j32Var = this.e;
            synchronized (j32Var.R) {
                if (j32Var.P) {
                    sv2.b("Content hash thread already started, quitting...");
                } else {
                    j32Var.P = true;
                    j32Var.start();
                }
            }
            sv2.f("start fetching content...");
            return this.e;
        }
    }

    public final String F() {
        String str;
        B();
        synchronized (this.a) {
            str = this.j;
        }
        return str;
    }

    public final void G(final Context context) {
        synchronized (this.a) {
            if (this.f != null) {
                return;
            }
            this.d = zw2.a.e(new Runnable() { // from class: yj5
                @Override // java.lang.Runnable
                public final void run() {
                    nl5.this.A(context);
                }
            });
            this.b = true;
        }
    }

    public final void H(String str) {
        B();
        synchronized (this.a) {
            if (str.equals(this.i)) {
                return;
            }
            this.i = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.g.apply();
            }
            D();
        }
    }

    public final void I(String str) {
        B();
        synchronized (this.a) {
            if (str.equals(this.j)) {
                return;
            }
            this.j = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final int a() {
        int i;
        B();
        synchronized (this.a) {
            i = this.t;
        }
        return i;
    }

    @Override // defpackage.f25
    public final long b() {
        long j;
        B();
        synchronized (this.a) {
            j = this.r;
        }
        return j;
    }

    @Override // defpackage.f25
    public final int c() {
        int i;
        B();
        synchronized (this.a) {
            i = this.o;
        }
        return i;
    }

    @Override // defpackage.f25
    public final int d() {
        int i;
        B();
        synchronized (this.a) {
            i = this.s;
        }
        return i;
    }

    @Override // defpackage.f25
    public final long e() {
        long j;
        B();
        synchronized (this.a) {
            j = this.E;
        }
        return j;
    }

    @Override // defpackage.f25
    public final su2 f() {
        su2 su2Var;
        B();
        synchronized (this.a) {
            su2Var = this.p;
        }
        return su2Var;
    }

    @Override // defpackage.f25
    public final void g(int i) {
        B();
        synchronized (this.a) {
            if (this.D == i) {
                return;
            }
            this.D = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void h(int i) {
        B();
        synchronized (this.a) {
            if (this.t == i) {
                return;
            }
            this.t = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final long i() {
        long j;
        B();
        synchronized (this.a) {
            j = this.q;
        }
        return j;
    }

    @Override // defpackage.f25
    public final void j(String str, boolean z, String str2) {
        B();
        synchronized (this.a) {
            JSONArray optJSONArray = this.v.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jv5.A.j.getClass();
                jSONObject.put("timestamp_ms", System.currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.v.put(str, optJSONArray);
            } catch (JSONException e) {
                sv2.h("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.v.toString());
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void k(boolean z) {
        B();
        synchronized (this.a) {
            if (this.x == z) {
                return;
            }
            this.x = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void l(String str, String str2) {
        char c;
        B();
        synchronized (this.a) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                this.l = str2;
            } else if (c == 1) {
                this.m = str2;
            } else if (c != 2) {
                return;
            } else {
                this.n = str2;
            }
            if (this.g != null) {
                if (str2.equals("-1")) {
                    this.g.remove(str);
                } else {
                    this.g.putString(str, str2);
                }
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final JSONObject m() {
        JSONObject jSONObject;
        B();
        synchronized (this.a) {
            jSONObject = this.v;
        }
        return jSONObject;
    }

    @Override // defpackage.f25
    public final void n(long j) {
        B();
        synchronized (this.a) {
            if (this.E == j) {
                return;
            }
            this.E = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void o(boolean z) {
        B();
        synchronized (this.a) {
            if (z == this.k) {
                return;
            }
            this.k = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void p(long j) {
        B();
        synchronized (this.a) {
            if (this.r == j) {
                return;
            }
            this.r = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void q(int i) {
        B();
        synchronized (this.a) {
            this.o = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final String q0(String str) {
        char c;
        B();
        synchronized (this.a) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                return this.l;
            } else if (c == 1) {
                return this.m;
            } else if (c != 2) {
                return null;
            } else {
                return this.n;
            }
        }
    }

    @Override // defpackage.f25
    public final void r(long j) {
        B();
        synchronized (this.a) {
            if (this.q == j) {
                return;
            }
            this.q = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void s() {
        B();
        synchronized (this.a) {
            this.v = new JSONObject();
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void t(boolean z) {
        B();
        synchronized (this.a) {
            if (this.w == z) {
                return;
            }
            this.w = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.g.apply();
            }
            D();
        }
    }

    @Override // defpackage.f25
    public final void u(int i) {
        B();
        synchronized (this.a) {
            if (this.s == i) {
                return;
            }
            this.s = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.g.apply();
            }
            D();
        }
    }

    public final void v(String str) {
        if (!((Boolean) w82.d.c.a(x92.M7)).booleanValue()) {
            return;
        }
        B();
        synchronized (this.a) {
            if (this.B.equals(str)) {
                return;
            }
            this.B = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("linked_ad_unit", str);
                this.g.apply();
            }
            D();
        }
    }

    public final void w(boolean z) {
        if (!((Boolean) w82.d.c.a(x92.M7)).booleanValue()) {
            return;
        }
        B();
        synchronized (this.a) {
            if (this.A == z) {
                return;
            }
            this.A = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("linked_device", z);
                this.g.apply();
            }
            D();
        }
    }

    public final void x(String str) {
        B();
        synchronized (this.a) {
            if (TextUtils.equals(this.y, str)) {
                return;
            }
            this.y = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.g.apply();
            }
            D();
        }
    }

    public final boolean y() {
        boolean z;
        B();
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    public final boolean z() {
        boolean z;
        B();
        synchronized (this.a) {
            z = this.x;
        }
        return z;
    }
}