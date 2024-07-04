package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: kp3  reason: default package */
public final class kp3 {
    public final uj1 b;
    public final Context c;
    public final zr3 d;
    public final wl4 e;
    public final Executor f;
    public final rz1 g;
    public final xv2 h;
    public final r04 j;
    public final gn4 k;
    public by4 l;
    public final ep3 a = new ep3();
    public final yg2 i = new yg2();

    public kp3(ip3 ip3Var) {
        this.c = ip3Var.b;
        this.f = ip3Var.f;
        this.g = ip3Var.g;
        this.h = ip3Var.h;
        this.b = ip3Var.a;
        this.j = ip3Var.e;
        this.k = ip3Var.i;
        this.d = ip3Var.c;
        this.e = ip3Var.d;
    }

    public final synchronized dz4 a(final String str, final JSONObject jSONObject) {
        by4 by4Var = this.l;
        if (by4Var == null) {
            return zw4.C(null);
        }
        return zw4.F(by4Var, new ky4() { // from class: fp3
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                kp3 kp3Var = kp3.this;
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                y03 y03Var = (y03) obj;
                yg2 yg2Var = kp3Var.i;
                yg2Var.getClass();
                bx2 bx2Var = new bx2();
                cu5 cu5Var = jv5.A.c;
                String uuid = UUID.randomUUID().toString();
                wg2 wg2Var = new wg2(bx2Var);
                synchronized (yg2Var.P) {
                    yg2Var.Q.put(uuid, wg2Var);
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", uuid);
                    jSONObject3.put("args", jSONObject2);
                    y03Var.M0(str2, jSONObject3);
                } catch (Exception e) {
                    bx2Var.c(e);
                }
                return bx2Var;
            }
        }, this.f);
    }

    public final synchronized void b(Map map) {
        by4 by4Var = this.l;
        if (by4Var == null) {
            return;
        }
        zw4.J(by4Var, new jg1(map), this.f);
    }

    public final synchronized void c(String str, mg2 mg2Var) {
        by4 by4Var = this.l;
        if (by4Var == null) {
            return;
        }
        zw4.J(by4Var, new uj1(str, mg2Var), this.f);
    }

    public final void d(WeakReference weakReference, String str, mg2 mg2Var) {
        c(str, new jp3(this, weakReference, str, mg2Var));
    }
}