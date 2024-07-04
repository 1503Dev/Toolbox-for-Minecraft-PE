package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: m92  reason: default package */
public final class m92 extends q92 {
    public m92(String str, Integer num) {
        super(1, str, num);
    }

    @Override // defpackage.q92
    public final Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.b, ((Integer) this.c).intValue()));
    }

    @Override // defpackage.q92
    public final Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(this.b))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(this.b)));
        }
        return (Integer) this.c;
    }

    @Override // defpackage.q92
    public final Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.b, ((Integer) this.c).intValue()));
    }

    @Override // defpackage.q92
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.b, ((Integer) obj).intValue());
    }
}