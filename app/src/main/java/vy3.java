package defpackage;

import android.os.Bundle;

/* renamed from: vy3  reason: default package */
public final class vy3 implements ff3, le3, qd3 {
    public final vl4 P;
    public final wl4 Q;
    public final hv2 R;

    public vy3(vl4 vl4Var, wl4 wl4Var, hv2 hv2Var) {
        this.P = vl4Var;
        this.Q = wl4Var;
        this.R = hv2Var;
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
        this.P.f(hi4Var, this.R);
    }

    @Override // defpackage.le3
    public final void k() {
        wl4 wl4Var = this.Q;
        vl4 vl4Var = this.P;
        vl4Var.a("action", "loaded");
        wl4Var.a(vl4Var);
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        vl4 vl4Var = this.P;
        vl4Var.a("action", "ftl");
        vl4Var.a("ftl", String.valueOf(tz3Var.P));
        vl4Var.a("ed", tz3Var.R);
        this.Q.a(this.P);
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
        vl4 vl4Var = this.P;
        Bundle bundle = rq2Var.P;
        vl4Var.getClass();
        if (bundle.containsKey("cnt")) {
            vl4Var.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            vl4Var.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}