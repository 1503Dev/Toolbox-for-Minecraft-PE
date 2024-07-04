package defpackage;

import android.util.JsonReader;
import org.json.JSONObject;

/* renamed from: ei4  reason: default package */
public final class ei4 {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public ei4(JsonReader jsonReader) {
        JSONObject f = mq2.f(jsonReader);
        this.d = f;
        this.a = f.optString("ad_html", null);
        this.b = f.optString("ad_base_url", null);
        this.c = f.optJSONObject("ad_json");
    }
}