package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: l92  reason: default package */
public final class l92 extends q92 {
    public l92(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    @Override // defpackage.q92
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.b, ((Boolean) this.c).booleanValue()));
    }

    @Override // defpackage.q92
    public final Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(this.b))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(this.b)));
        }
        return (Boolean) this.c;
    }

    @Override // defpackage.q92
    public final Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.b, ((Boolean) this.c).booleanValue()));
    }

    @Override // defpackage.q92
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(this.b, ((Boolean) obj).booleanValue());
    }
}