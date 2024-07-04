package defpackage;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: u94  reason: default package */
public final class u94 implements mc4 {
    @Nullable
    public final JSONObject a;
    @Nullable
    public final JSONObject b;

    public u94(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.a = jSONObject;
        this.b = jSONObject2;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}