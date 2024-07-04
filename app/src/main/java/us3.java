package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: us3  reason: default package */
public final class us3 {
    public Long a;
    public final String b;
    public String c;
    public Integer d;
    public String e;
    public Integer f;

    public /* synthetic */ us3(String str) {
        this.b = str;
    }

    public static String a(us3 us3Var) {
        String str = (String) w82.d.c.a(x92.g8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", us3Var.a);
            jSONObject.put("eventCategory", us3Var.b);
            jSONObject.putOpt("event", us3Var.c);
            jSONObject.putOpt("errorCode", us3Var.d);
            jSONObject.putOpt("rewardType", us3Var.e);
            jSONObject.putOpt("rewardAmount", us3Var.f);
        } catch (JSONException unused) {
            sv2.g("Could not convert parameters to JSON.");
        }
        return ho.b(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}