package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ye4  reason: default package */
public final class ye4 implements mc4 {
    public final Map a;

    public ye4(HashMap hashMap) {
        this.a = hashMap;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", n62.f.a.g(this.a));
        } catch (JSONException e) {
            vz3.k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}