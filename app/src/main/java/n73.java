package defpackage;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: n73  reason: default package */
public final class n73 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public /* synthetic */ n73(lj5 lj5Var, lj5 lj5Var2, uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = lj5Var;
        this.c = lj5Var2;
        this.d = uj5Var;
        this.e = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                ((pa3) this.b).a();
                xv2 a = ((f33) this.c).a();
                JSONObject jSONObject = (JSONObject) this.d.c();
                String str = (String) this.e.c();
                boolean equals = "native".equals(str);
                cu5 cu5Var = jv5.A.c;
                return new o22(UUID.randomUUID().toString(), a, str, jSONObject, equals);
            default:
                vd3 vd3Var = new vd3(((sj5) ((xd3) this.b).a).c());
                Set c = ((sj5) this.c).c();
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new wd3(vd3Var, c, yw2Var, (ScheduledExecutorService) this.e.c());
        }
    }
}