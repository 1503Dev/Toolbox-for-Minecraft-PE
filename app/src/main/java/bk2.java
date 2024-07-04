package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bk2  reason: default package */
public final class bk2 implements xg2 {
    public final jj2 a;
    public final bx2 b;
    public final /* synthetic */ ck2 c;

    public bk2(ck2 ck2Var, jj2 jj2Var, bx2 bx2Var) {
        this.c = ck2Var;
        this.a = jj2Var;
        this.b = bx2Var;
    }

    @Override // defpackage.xg2
    public final void m(String str) {
        try {
            if (str == null) {
                this.b.c(new uj2());
            } else {
                this.b.c(new uj2(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.a.g();
            throw th;
        }
        this.a.g();
    }

    @Override // defpackage.xg2
    public final void n(JSONObject jSONObject) {
        try {
            try {
                this.b.a(((wj2) this.c.b).b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.b.c(e);
            }
        } finally {
            this.a.g();
        }
    }
}