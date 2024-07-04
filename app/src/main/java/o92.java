package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: o92  reason: default package */
public final class o92 extends q92 {
    public o92(String str, Float f) {
        super(1, str, f);
    }

    @Override // defpackage.q92
    public final Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.b, ((Float) this.c).floatValue()));
    }

    @Override // defpackage.q92
    public final Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(this.b))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(this.b)));
        }
        return (Float) this.c;
    }

    @Override // defpackage.q92
    public final Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.b, ((Float) this.c).floatValue()));
    }

    @Override // defpackage.q92
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(this.b, ((Float) obj).floatValue());
    }
}