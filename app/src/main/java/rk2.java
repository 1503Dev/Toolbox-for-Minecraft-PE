package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: rk2  reason: default package */
public final class rk2 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final String l;

    public rk2(JSONObject jSONObject) {
        List list;
        String str;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        jv5 jv5Var = jv5.A;
        ea2 ea2Var = jv5Var.t;
        this.b = ea2.w("clickurl", jSONObject);
        ea2 ea2Var2 = jv5Var.t;
        this.c = ea2.w("imp_urls", jSONObject);
        ea2 ea2Var3 = jv5Var.t;
        this.d = ea2.w("downloaded_imp_urls", jSONObject);
        ea2 ea2Var4 = jv5Var.t;
        this.f = ea2.w("fill_urls", jSONObject);
        ea2 ea2Var5 = jv5Var.t;
        this.h = ea2.w("video_start_urls", jSONObject);
        ea2 ea2Var6 = jv5Var.t;
        this.j = ea2.w("video_complete_urls", jSONObject);
        ea2 ea2Var7 = jv5Var.t;
        this.i = ea2.w("video_reward_urls", jSONObject);
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            ea2 ea2Var8 = jv5Var.t;
            list = ea2.w("manual_impression_urls", optJSONObject);
        } else {
            list = null;
        }
        this.e = list;
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        } else {
            str = null;
        }
        this.g = str;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        ea2 ea2Var9 = jv5Var.t;
        this.k = ea2.w("template_ids", jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.l = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}