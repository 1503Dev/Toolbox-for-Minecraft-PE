package defpackage;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t73  reason: default package */
public final class t73 implements s22 {
    public y03 P;
    public final Executor Q;
    public final g73 R;
    public final kd S;
    public boolean T = false;
    public boolean U = false;
    public final i73 V = new i73();

    public t73(Executor executor, g73 g73Var, kd kdVar) {
        this.Q = executor;
        this.R = g73Var;
        this.S = kdVar;
    }

    public final void a() {
        try {
            JSONObject f = this.R.f(this.V);
            if (this.P != null) {
                this.Q.execute(new tx1(1, this, f));
            }
        } catch (JSONException e) {
            vz3.l("Failed to call video active view js", e);
        }
    }

    @Override // defpackage.s22
    public final void h0(r22 r22Var) {
        i73 i73Var = this.V;
        i73Var.a = this.U ? false : r22Var.j;
        i73Var.c = this.S.b();
        this.V.e = r22Var;
        if (this.T) {
            a();
        }
    }
}