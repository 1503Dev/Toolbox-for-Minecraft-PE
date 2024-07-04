package defpackage;

import android.text.TextUtils;
import defpackage.o3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ad4  reason: default package */
public final class ad4 implements mc4 {
    public final o3.a a;
    public final String b;
    public final cr4 c;

    public ad4(o3.a aVar, String str, cr4 cr4Var) {
        this.a = aVar;
        this.b = str;
        this.c = cr4Var;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        boolean z;
        try {
            JSONObject e = mq2.e("pii", (JSONObject) obj);
            o3.a aVar = this.a;
            if (aVar != null && !TextUtils.isEmpty(aVar.a)) {
                e.put("rdid", this.a.a);
                e.put("is_lat", this.a.b);
                e.put("idtype", "adid");
                cr4 cr4Var = this.c;
                String str = cr4Var.a;
                if (str != null && cr4Var.b >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    e.put("paidv1_id_android_3p", str);
                    e.put("paidv1_creation_time_android_3p", this.c.b);
                    return;
                }
                return;
            }
            String str2 = this.b;
            if (str2 != null) {
                e.put("pdid", str2);
                e.put("pdidtype", "ssaid");
            }
        } catch (JSONException e2) {
            vz3.l("Failed putting Ad ID.", e2);
        }
    }
}