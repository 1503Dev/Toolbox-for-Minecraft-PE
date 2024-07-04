package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ke4  reason: default package */
public final class ke4 implements mc4 {
    public final Bundle a;

    public ke4(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.a != null) {
            try {
                mq2.e("play_store", mq2.e("device", jSONObject)).put("parental_controls", n62.f.a.f(this.a));
            } catch (JSONException unused) {
                vz3.k("Failed putting parental controls bundle.");
            }
        }
    }
}