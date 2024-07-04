package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hd4  reason: default package */
public final class hd4 implements mc4 {
    public final String a;

    public hd4(String str) {
        this.a = str;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.a);
        } catch (JSONException e) {
            vz3.l("Failed putting Ad ID.", e);
        }
    }
}