package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: h63  reason: default package */
public final class h63 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new g63(((t23) ((uj5) this.b)).a());
            case 1:
                try {
                    return new JSONObject(((pa3) ((uj5) this.b)).a().z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new xa2();
        }
    }
}