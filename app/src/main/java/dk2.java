package defpackage;

import org.json.JSONObject;

/* renamed from: dk2  reason: default package */
public final /* synthetic */ class dk2 implements ky4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dk2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        switch (this.a) {
            case 0:
                sj2 sj2Var = (sj2) obj;
                sj2Var.g0((String) this.b, (mg2) this.c);
                return zw4.C(sj2Var);
            case 1:
                vu3 vu3Var = (vu3) obj;
                return ((fw3) ((uj5) this.b).c()).a((rq2) this.c);
            default:
                final p34 p34Var = (p34) this.b;
                yh4 yh4Var = (yh4) this.c;
                final kp3 kp3Var = (kp3) obj;
                p34Var.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isNonagon", true);
                if (((Boolean) w82.d.c.a(x92.h7)).booleanValue() && qe0.b()) {
                    jSONObject.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("response", yh4Var.s.c);
                jSONObject2.put("sdk_params", jSONObject);
                return zw4.F(kp3Var.a("google.afma.nativeAds.preProcessJson", jSONObject2), new ky4() { // from class: m34
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj2) {
                        p34 p34Var2 = p34.this;
                        kp3 kp3Var2 = kp3Var;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        nj4 nj4Var = p34Var2.d;
                        zy4 C = zw4.C(kp3Var2);
                        synchronized (nj4Var) {
                            nj4Var.a.addFirst(C);
                        }
                        if (jSONObject3.optBoolean("success")) {
                            return zw4.C(jSONObject3.getJSONObject("json").getJSONArray("ads"));
                        }
                        throw new uj2("process json failed");
                    }
                }, p34Var.b);
        }
    }
}