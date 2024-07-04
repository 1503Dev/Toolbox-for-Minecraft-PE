package defpackage;

import org.json.JSONObject;

/* renamed from: hy3  reason: default package */
public final /* synthetic */ class hy3 implements at4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.at4
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ky3 ky3Var = (ky3) this.b;
                z63.a(ky3Var.c, (JSONObject) obj);
                return ky3Var;
            default:
                Throwable th = (Throwable) obj;
                sv2.d("Error calling adapter: ".concat(String.valueOf((String) this.b)));
                return null;
        }
    }
}