package defpackage;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: kk2  reason: default package */
public final /* synthetic */ class kk2 implements ky4 {
    public final /* synthetic */ mk2 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kk2(mk2 mk2Var, Object obj) {
        this.a = mk2Var;
        this.b = obj;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        mk2 mk2Var = this.a;
        Object obj2 = this.b;
        sj2 sj2Var = (sj2) obj;
        mk2Var.getClass();
        bx2 bx2Var = new bx2();
        cu5 cu5Var = jv5.A.c;
        String uuid = UUID.randomUUID().toString();
        yg2 yg2Var = lg2.j;
        lk2 lk2Var = new lk2(bx2Var);
        synchronized (yg2Var.P) {
            yg2Var.Q.put(uuid, lk2Var);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj2);
        sj2Var.M0("google.afma.activeView.handleUpdate", jSONObject);
        return bx2Var;
    }
}