package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: y74  reason: default package */
public final /* synthetic */ class y74 implements mc4 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ y74(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                ((Bundle) obj).putString("ms", this.b);
                return;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(this.b)) {
                        mq2.e("pii", jSONObject).put("adsid", this.b);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    sv2.h("Failed putting trustless token.", e);
                    return;
                }
        }
    }
}