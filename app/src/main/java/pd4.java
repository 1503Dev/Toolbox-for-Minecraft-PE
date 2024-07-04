package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pd4  reason: default package */
public final class pd4 implements mc4 {
    public final String a;
    public final int b;

    public pd4(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        try {
            JSONObject e = mq2.e("pii", jSONObject);
            e.put("pvid", this.a);
            e.put("pvid_s", this.b);
        } catch (JSONException e2) {
            vz3.l("Failed putting gms core app set ID info.", e2);
        }
    }
}