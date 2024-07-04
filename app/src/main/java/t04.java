package defpackage;

import android.app.Activity;

/* renamed from: t04  reason: default package */
public final class t04 extends gu3 {
    public final /* synthetic */ Activity T;
    public final /* synthetic */ dv2 U;
    public final /* synthetic */ m24 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t04(m24 m24Var, Activity activity, dv2 dv2Var) {
        super(m24Var.P, true);
        this.V = m24Var;
        this.T = activity;
        this.U = dv2Var;
    }

    @Override // defpackage.gu3
    public final void b() {
        ky2 ky2Var = this.V.P.h;
        uf0.f(ky2Var);
        ky2Var.l1(new va0(this.T), this.U, this.Q);
    }
}