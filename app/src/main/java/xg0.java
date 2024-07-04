package defpackage;

import android.content.Context;

/* renamed from: xg0  reason: default package */
public final class xg0 {
    public final k94 a;

    public xg0(k94 k94Var) {
        this.a = k94Var;
    }

    public static void a(final Context context, final d3 d3Var, final z61 z61Var) {
        o2 o2Var = o2.BANNER;
        x92.a(context);
        if (((Boolean) kb2.j.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                jv2.b.execute(new Runnable() { // from class: ij1
                    public final /* synthetic */ o2 Q = o2.BANNER;

                    @Override // java.lang.Runnable
                    public final void run() {
                        fx3 fx3Var;
                        Context context2 = context;
                        o2 o2Var2 = this.Q;
                        d3 d3Var2 = d3Var;
                        z61 z61Var2 = z61Var;
                        if (d3Var2 == null) {
                            fx3Var = null;
                        } else {
                            fx3Var = d3Var2.a;
                        }
                        new dp2(context2, o2Var2, fx3Var).a(z61Var2);
                    }
                });
                return;
            }
        }
        new dp2(context, o2Var, d3Var.a).a(z61Var);
    }
}