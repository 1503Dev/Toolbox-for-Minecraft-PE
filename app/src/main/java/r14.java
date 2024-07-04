package defpackage;

import android.app.Activity;

/* renamed from: r14  reason: default package */
public final class r14 extends gu3 {
    public final /* synthetic */ Activity T;
    public final /* synthetic */ m24 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r14(m24 m24Var, Activity activity) {
        super(m24Var.P, true);
        this.U = m24Var;
        this.T = activity;
    }

    @Override // defpackage.gu3
    public final void b() {
        ky2 ky2Var = this.U.P.h;
        uf0.f(ky2Var);
        ky2Var.F0(new va0(this.T), this.Q);
    }
}