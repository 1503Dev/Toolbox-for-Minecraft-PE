package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: n92  reason: default package */
public final class n92 extends q92 {
    public n92(String str, Long l) {
        super(1, str, l);
    }

    @Override // defpackage.q92
    public final Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.b, ((Long) this.c).longValue()));
    }

    @Override // defpackage.q92
    public final Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(this.b))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(this.b)));
        }
        return (Long) this.c;
    }

    @Override // defpackage.q92
    public final Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.b, ((Long) this.c).longValue()));
    }

    @Override // defpackage.q92
    public final void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.b, ((Long) obj).longValue());
    }
}