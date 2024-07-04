package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sk2  reason: default package */
public final class sk2 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public sk2(JSONObject jSONObject) {
        if (sv2.j(2)) {
            vz3.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                rk2 rk2Var = new rk2(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(rk2Var.l);
                arrayList.add(rk2Var);
                if (i < 0) {
                    Iterator it = rk2Var.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            ea2 ea2Var = jv5.A.t;
            this.b = ea2.w("click_urls", optJSONObject);
            this.c = ea2.w("imp_urls", optJSONObject);
            this.d = ea2.w("downloaded_imp_urls", optJSONObject);
            this.e = ea2.w("nofill_urls", optJSONObject);
            this.f = ea2.w("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            qr2.c(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}