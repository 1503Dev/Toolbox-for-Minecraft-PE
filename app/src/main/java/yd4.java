package defpackage;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yd4  reason: default package */
public final class yd4 implements nc4 {
    public final JSONObject a;

    public yd4(Context context) {
        this.a = zq2.p(context);
    }

    @Override // defpackage.nc4
    public final int a() {
        return 46;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.C(new mc4() { // from class: xd4
            @Override // defpackage.mc4
            public final void b(Object obj) {
                yd4 yd4Var = yd4.this;
                JSONObject jSONObject = (JSONObject) obj;
                yd4Var.getClass();
                try {
                    jSONObject.put("gms_sdk_env", yd4Var.a);
                } catch (JSONException unused) {
                    vz3.k("Failed putting version constants.");
                }
            }
        });
    }
}