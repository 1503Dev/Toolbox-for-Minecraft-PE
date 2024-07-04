package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: p92  reason: default package */
public final class p92 extends q92 {
    public p92(String str, String str2) {
        super(1, str, str2);
    }

    @Override // defpackage.q92
    public final Object a(JSONObject jSONObject) {
        return jSONObject.optString(this.b, (String) this.c);
    }

    @Override // defpackage.q92
    public final Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(this.b))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(this.b));
        }
        return (String) this.c;
    }

    @Override // defpackage.q92
    public final Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.b, (String) this.c);
    }

    @Override // defpackage.q92
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.b, (String) obj);
    }
}