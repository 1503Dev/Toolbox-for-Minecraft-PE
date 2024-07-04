package defpackage;

import org.json.JSONObject;

/* renamed from: e63  reason: default package */
public final class e63 implements x53 {
    public final cu3 a;

    public e63(cu3 cu3Var) {
        this.a = cu3Var;
    }

    @Override // defpackage.x53
    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) w82.d.c.a(x92.N7)).booleanValue()) {
                cu3 cu3Var = this.a;
                synchronized (cu3Var) {
                    cu3Var.m = jSONObject;
                }
            }
        }
    }
}