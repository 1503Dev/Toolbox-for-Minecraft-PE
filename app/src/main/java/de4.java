package defpackage;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: de4  reason: default package */
public final class de4 implements mc4 {
    public final List a;

    public de4(List list) {
        this.a = list;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.a));
        } catch (JSONException unused) {
            vz3.k("Failed putting experiment ids.");
        }
    }
}