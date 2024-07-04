package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n2  reason: default package */
public class n2 {
    public final int a;
    public final String b;
    public final String c;
    public final n2 d;

    public n2(int i, String str, String str2, n2 n2Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = n2Var;
    }

    public final tz3 a() {
        n2 n2Var = this.d;
        return new tz3(this.a, this.b, this.c, n2Var == null ? null : new tz3(n2Var.a, n2Var.b, n2Var.c, null, null), null);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.a);
        jSONObject.put("Message", this.b);
        jSONObject.put("Domain", this.c);
        n2 n2Var = this.d;
        jSONObject.put("Cause", n2Var == null ? "null" : n2Var.b());
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}