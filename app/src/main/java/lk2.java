package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lk2  reason: default package */
public final class lk2 implements xg2 {
    public final bx2 a;

    public lk2(bx2 bx2Var) {
        this.a = bx2Var;
    }

    @Override // defpackage.xg2
    public final void m(String str) {
        try {
            if (str == null) {
                this.a.c(new uj2());
            } else {
                this.a.c(new uj2(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.xg2
    public final void n(JSONObject jSONObject) {
        try {
            this.a.a(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.a.c(e);
        }
    }
}