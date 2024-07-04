package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l20  reason: default package */
public final class l20 extends n2 {
    public final rl0 e;

    public l20(int i, String str, String str2, n2 n2Var, rl0 rl0Var) {
        super(i, str, str2, n2Var);
        this.e = rl0Var;
    }

    @Override // defpackage.n2
    public final JSONObject b() {
        Object a;
        JSONObject b = super.b();
        rl0 rl0Var = this.e;
        if (rl0Var == null) {
            a = "null";
        } else {
            a = rl0Var.a();
        }
        b.put("Response Info", a);
        return b;
    }

    @Override // defpackage.n2
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}