package defpackage;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v44  reason: default package */
public final class v44 implements g14 {
    public final HashMap a = new HashMap();
    public final zq3 b;

    public v44(zq3 zq3Var) {
        this.b = zq3Var;
    }

    @Override // defpackage.g14
    public final h14 a(String str, JSONObject jSONObject) {
        h14 h14Var;
        synchronized (this) {
            h14Var = (h14) this.a.get(str);
            if (h14Var == null) {
                h14Var = new h14(this.b.b(str, jSONObject), new x24(), str);
                this.a.put(str, h14Var);
            }
        }
        return h14Var;
    }
}