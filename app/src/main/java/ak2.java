package defpackage;

import java.io.IOException;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: ak2  reason: default package */
public final class ak2 implements ex2, tv5, ks5 {
    public Object P;
    public final Object Q;
    public Object R;
    public Object S;

    public /* synthetic */ ak2(ck2 ck2Var, jj2 jj2Var, Object obj, bx2 bx2Var) {
        this.S = ck2Var;
        this.P = jj2Var;
        this.Q = obj;
        this.R = bx2Var;
    }

    public ak2(tu5 tu5Var, Integer num) {
        this.S = tu5Var;
        this.P = new sv5(tu5Var.c.b, null);
        this.R = new js5(tu5Var.d.b, null);
        this.Q = num;
    }

    public /* synthetic */ ak2(w33 w33Var, n43 n43Var) {
        this.P = w33Var;
        this.Q = n43Var;
    }

    @Override // defpackage.tv5
    public final void a(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var, IOException iOException, boolean z) {
        if (d(ov5Var)) {
            ((sv5) this.P).d(xu5Var, c(lv5Var), iOException, z);
        }
    }

    public final m43 b() {
        tv2.E(Long.class, (Long) this.R);
        tv2.E(String.class, (String) this.S);
        return new m43((w33) this.P, (n43) this.Q, (Long) this.R, (String) this.S);
    }

    public final lv5 c(lv5 lv5Var) {
        Object obj = this.Q;
        long j = lv5Var.c;
        ((tu5) this.S).s(j, obj);
        Object obj2 = this.Q;
        long j2 = lv5Var.d;
        ((tu5) this.S).s(j2, obj2);
        return (j == lv5Var.c && j2 == lv5Var.d) ? lv5Var : new lv5(lv5Var.a, lv5Var.b, j, j2);
    }

    public final boolean d(ov5 ov5Var) {
        ov5 ov5Var2;
        if (ov5Var != null) {
            ov5Var2 = ((tu5) this.S).t(this.Q, ov5Var);
            if (ov5Var2 == null) {
                return false;
            }
        } else {
            ov5Var2 = null;
        }
        ((tu5) this.S).q(this.Q);
        sv5 sv5Var = (sv5) this.P;
        sv5Var.getClass();
        if (!zn4.b(sv5Var.a, ov5Var2)) {
            this.P = new sv5(((tu5) this.S).c.b, ov5Var2);
        }
        js5 js5Var = (js5) this.R;
        js5Var.getClass();
        if (!zn4.b(js5Var.a, ov5Var2)) {
            this.R = new js5(((tu5) this.S).d.b, ov5Var2);
            return true;
        }
        return true;
    }

    @Override // defpackage.ex2
    public final void e(Object obj) {
        sj2 sj2Var = (sj2) obj;
        ck2 ck2Var = (ck2) this.S;
        jj2 jj2Var = (jj2) this.P;
        Object obj2 = this.Q;
        bx2 bx2Var = (bx2) this.R;
        try {
            cu5 cu5Var = jv5.A.c;
            String uuid = UUID.randomUUID().toString();
            yg2 yg2Var = lg2.j;
            bk2 bk2Var = new bk2(ck2Var, jj2Var, bx2Var);
            synchronized (yg2Var.P) {
                yg2Var.Q.put(uuid, bk2Var);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", ((xj2) ck2Var.c).f(obj2));
            sj2Var.M0((String) ck2Var.e, jSONObject);
        } catch (Exception e) {
            try {
                bx2Var.c(e);
                sv2.e("Unable to invokeJavascript", e);
            } finally {
                jj2Var.g();
            }
        }
    }

    @Override // defpackage.tv5
    public final void j(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        if (d(ov5Var)) {
            ((sv5) this.P).c(xu5Var, c(lv5Var));
        }
    }

    @Override // defpackage.tv5
    public final void k(int i, ov5 ov5Var, lv5 lv5Var) {
        if (d(ov5Var)) {
            ((sv5) this.P).a(c(lv5Var));
        }
    }

    @Override // defpackage.tv5
    public final void p(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        if (d(ov5Var)) {
            ((sv5) this.P).b(xu5Var, c(lv5Var));
        }
    }

    @Override // defpackage.tv5
    public final void y(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        if (d(ov5Var)) {
            ((sv5) this.P).e(xu5Var, c(lv5Var));
        }
    }
}