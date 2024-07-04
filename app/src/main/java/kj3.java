package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kj3  reason: default package */
public final class kj3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ kj3(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ii3((xp3) this.b.c(), zw2.f);
            default:
                sl3 sl3Var = (sl3) ((uk3) this.b).a.c();
                tv2.C(sl3Var);
                JSONObject jSONObject = sl3Var.b;
                if (jSONObject == null) {
                    try {
                        return new JSONObject(sl3Var.a.z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
        }
    }
}