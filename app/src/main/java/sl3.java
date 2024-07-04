package defpackage;

import org.json.JSONObject;

/* renamed from: sl3  reason: default package */
public final class sl3 extends tl3 {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public sl3(yh4 yh4Var, JSONObject jSONObject) {
        super(yh4Var);
        JSONObject optJSONObject;
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject k = mq2.k(jSONObject, strArr);
        if (k == null) {
            optJSONObject = null;
        } else {
            optJSONObject = k.optJSONObject(strArr[1]);
        }
        this.b = optJSONObject;
        this.c = mq2.i(jSONObject, "allow_pub_owned_ad_view");
        this.d = mq2.i(jSONObject, "attribution", "allow_pub_rendering");
        this.e = mq2.i(jSONObject, "enable_omid");
        String[] strArr2 = {"watermark_overlay_png_base64"};
        JSONObject k2 = mq2.k(jSONObject, strArr2);
        this.g = k2 != null ? k2.optString(strArr2[0], "") : "";
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = ((Boolean) w82.d.c.a(x92.l4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // defpackage.tl3
    public final s82 a() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new s82(8, jSONObject) : this.a.V;
    }

    @Override // defpackage.tl3
    public final String b() {
        return this.g;
    }

    @Override // defpackage.tl3
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.tl3
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.tl3
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.tl3
    public final boolean f() {
        return this.f;
    }
}