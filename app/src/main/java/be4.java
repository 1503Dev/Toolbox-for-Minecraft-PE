package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: be4  reason: default package */
public final class be4 implements mc4 {
    public final String a;
    public final String b;

    public be4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            JSONObject e = mq2.e("pii", (JSONObject) obj);
            e.put("doritos", this.a);
            e.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            vz3.k("Failed putting doritos string.");
        }
    }
}