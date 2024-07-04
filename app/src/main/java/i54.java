package defpackage;

import org.json.JSONObject;

/* renamed from: i54  reason: default package */
public final class i54 implements g14 {
    public final e64 a;

    public i54(e64 e64Var) {
        this.a = e64Var;
    }

    @Override // defpackage.g14
    public final h14 a(String str, JSONObject jSONObject) {
        zm2 zm2Var;
        e64 e64Var = this.a;
        if (e64Var.a.containsKey(str)) {
            zm2Var = (zm2) e64Var.a.get(str);
        } else {
            zm2Var = null;
        }
        if (zm2Var == null) {
            return null;
        }
        return new h14(zm2Var, new w24(), str);
    }
}