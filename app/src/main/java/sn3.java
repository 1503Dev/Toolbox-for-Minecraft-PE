package defpackage;

import android.os.Bundle;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sn3  reason: default package */
public final /* synthetic */ class sn3 implements at4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sn3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.at4
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                yn3 yn3Var = (yn3) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                List list = (List) obj;
                yn3Var.getClass();
                Integer num = null;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String optString = jSONObject.optString("text");
                Integer d = yn3.d("bg_color", jSONObject);
                Integer d2 = yn3.d("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int optInt2 = jSONObject.optInt("animation_ms", 1000);
                int optInt3 = jSONObject.optInt("presentation_ms", 4000);
                if (optInt > 0) {
                    num = Integer.valueOf(optInt);
                }
                return new ic2(optString, list, d, d2, num, optInt3 + optInt2, yn3Var.h.T);
            default:
                JSONObject jSONObject2 = (JSONObject) obj;
                Bundle bundle = ((rq2) this.c).P;
                if (bundle != null) {
                    try {
                        n62 n62Var = n62.f;
                        JSONObject f = n62Var.a.f(bundle);
                        try {
                            n62Var.a.getClass();
                            mv2.h(jSONObject2, f);
                            return jSONObject2;
                        } catch (JSONException unused) {
                            return f;
                        }
                    } catch (JSONException unused2) {
                        return jSONObject2;
                    }
                }
                return jSONObject2;
        }
    }
}