package defpackage;

import android.content.Context;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e2  reason: default package */
public final class e2 {
    public String a = "";
    public ic1 b;

    public e2() {
        ic1 ic1Var = new ic1();
        this.b = ic1Var;
        eb1.j(ic1Var, "origin_store", "google");
    }

    public final void a(Context context) {
        String str;
        Boolean bool;
        ThreadPoolExecutor threadPoolExecutor = eg1.a;
        try {
            str = context.getPackageName();
        } catch (Exception unused) {
            str = "unknown";
        }
        eb1.j(this.b, "bundle_id", str);
        ic1 ic1Var = this.b;
        ic1Var.getClass();
        try {
            synchronized (ic1Var.a) {
                bool = Boolean.valueOf(ic1Var.a.getBoolean("use_forced_controller"));
            }
        } catch (JSONException unused2) {
            bool = null;
        }
        if (bool != null) {
            kd1.x0 = bool.booleanValue();
        }
        if (this.b.j("use_staging_launch_server")) {
            ad1.X = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String l = eg1.l(context, "IABUSPrivacy_String");
        String l2 = eg1.l(context, "IABTCF_TCString");
        int i = -1;
        boolean z = false;
        try {
            i = eg1.o(context).getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            t1.b(0, 1, "Key IABTCF_gdprApplies in SharedPreferences does not have an int value.", true);
        }
        if (l != null) {
            eb1.j(this.b, "ccpa_consent_string", l);
        }
        if (l2 != null) {
            eb1.j(this.b, "gdpr_consent_string", l2);
        }
        if (i == 0 || i == 1) {
            ic1 ic1Var2 = this.b;
            if (i == 1) {
                z = true;
            }
            eb1.m(ic1Var2, "gdpr_required", z);
        }
    }

    public final JSONObject b() {
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "name", this.b.q("mediation_network"));
        eb1.j(ic1Var, "version", this.b.q("mediation_network_version"));
        return ic1Var.a;
    }

    public final JSONObject c() {
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "name", this.b.q("plugin"));
        eb1.j(ic1Var, "version", this.b.q("plugin_version"));
        return ic1Var.a;
    }

    @Deprecated
    public final void d(String str) {
        eb1.j(this.b, "consent_string", str);
    }

    @Deprecated
    public final void e() {
        eb1.m(this.b, "gdpr_required", true);
    }
}