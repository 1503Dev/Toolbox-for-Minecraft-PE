package defpackage;

import android.content.Context;
import android.view.View;
import org.json.JSONObject;

/* renamed from: tx1  reason: default package */
public final /* synthetic */ class tx1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ tx1(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ay5 ay5Var;
        switch (this.P) {
            case 0:
                y02 y02Var = (y02) this.Q;
                ez4 ez4Var = (ez4) this.R;
                y02Var.getClass();
                jv5 jv5Var = jv5.A;
                if (!jv5Var.m.f(y02Var.a, y02Var.d, y02Var.e)) {
                    jv5Var.m.b(y02Var.a, y02Var.d, y02Var.e);
                    return;
                } else {
                    ez4Var.execute(new gz1(0, y02Var));
                    return;
                }
            case 1:
                ((t73) this.Q).P.M0("AFMA_updateActiveView", (JSONObject) this.R);
                return;
            case 2:
                jl3 jl3Var = (jl3) this.Q;
                jl3Var.n((View) this.R, jl3Var.j.l());
                return;
            case 3:
                ((aw0) this.R).a.n(qq4.a((Context) this.Q, "GLAS"));
                return;
            default:
                try {
                    yv0 yv0Var = (yv0) ((ri4) this.R).Q.b((yv0) this.Q);
                    if (yv0Var == null) {
                        ((ri4) this.R).c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    iv5 iv5Var = cw0.b;
                    yv0Var.e(iv5Var, (ri4) this.R);
                    yv0Var.d(iv5Var, (ri4) this.R);
                    yv0Var.a(iv5Var, (ri4) this.R);
                    return;
                } catch (qm0 e) {
                    e = e;
                    if (e.getCause() instanceof Exception) {
                        ay5Var = ((ri4) this.R).R;
                        e = (Exception) e.getCause();
                        ay5Var.m(e);
                        return;
                    }
                    ay5Var = ((ri4) this.R).R;
                    ay5Var.m(e);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    ay5Var = ((ri4) this.R).R;
                    ay5Var.m(e);
                    return;
                }
        }
    }

    public tx1(ri4 ri4Var, yv0 yv0Var) {
        this.P = 4;
        this.R = ri4Var;
        this.Q = yv0Var;
    }
}