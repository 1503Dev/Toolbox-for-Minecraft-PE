package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k3  reason: default package */
public final class k3 {
    public final fw5 a;
    public final n2 b;

    public k3(fw5 fw5Var) {
        this.a = fw5Var;
        tz3 tz3Var = fw5Var.R;
        this.b = tz3Var == null ? null : tz3Var.c();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.a.P);
        jSONObject.put("Latency", this.a.Q);
        String str = this.a.T;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = this.a.U;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = this.a.V;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = this.a.W;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : this.a.S.keySet()) {
            jSONObject2.put(str5, this.a.S.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        n2 n2Var = this.b;
        if (n2Var == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", n2Var.b());
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}