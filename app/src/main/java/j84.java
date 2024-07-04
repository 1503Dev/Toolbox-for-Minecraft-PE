package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j84  reason: default package */
public final class j84 implements mc4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j84(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (!((Bundle) this.b).isEmpty()) {
                    bundle.putBundle("installed_adapter_data", (Bundle) this.b);
                    return;
                }
                return;
            case 1:
                ((Bundle) obj).putBundle("shared_pref", (Bundle) this.b);
                return;
            default:
                try {
                    JSONObject e = mq2.e("pii", (JSONObject) obj);
                    if (!TextUtils.isEmpty((String) this.b)) {
                        e.put("attok", (String) this.b);
                        return;
                    }
                    return;
                } catch (JSONException e2) {
                    vz3.l("Failed putting attestation token.", e2);
                    return;
                }
        }
    }

    public /* synthetic */ j84(Bundle bundle) {
        this.a = 0;
        this.b = bundle;
    }
}