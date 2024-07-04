package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wd4  reason: default package */
public final class wd4 implements mc4 {
    public final JSONObject a;

    public wd4(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.a);
        } catch (JSONException unused) {
            vz3.k("Unable to get cache_state");
        }
    }
}