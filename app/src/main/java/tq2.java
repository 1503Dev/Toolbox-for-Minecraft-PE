package defpackage;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: tq2  reason: default package */
public final class tq2 {
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final JSONObject h;
    public final String i;

    public tq2(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        List asList;
        this.f = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        if (optString != null && (optString.equals("1") || optString.equals("true"))) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        String optString2 = jSONObject.optString("cookies_include", "true");
        if (optString2 != null && (optString2.equals("1") || optString2.equals("true"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.e = z2;
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString3 = jSONObject.optString("errors");
        if (optString3 == null) {
            asList = null;
        } else {
            asList = Arrays.asList(optString3.split(","));
        }
        this.a = asList;
        this.g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
    }
}