package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ld4  reason: default package */
public final class ld4 implements mc4 {
    public final JSONObject a;

    public ld4(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            JSONObject e = mq2.e("content_info", (JSONObject) obj);
            JSONObject jSONObject = this.a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            vz3.k("Failed putting app indexing json.");
        }
    }
}