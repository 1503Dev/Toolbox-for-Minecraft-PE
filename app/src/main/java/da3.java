package defpackage;

import android.app.Activity;

/* renamed from: da3  reason: default package */
public final class da3 extends gu3 {
    public final /* synthetic */ Activity T;
    public final /* synthetic */ String U;
    public final /* synthetic */ String V;
    public final /* synthetic */ h34 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da3(h34 h34Var, Activity activity, String str, String str2) {
        super(h34Var, true);
        this.W = h34Var;
        this.T = activity;
        this.U = str;
        this.V = str2;
    }

    @Override // defpackage.gu3
    public final void b() {
        ky2 ky2Var = this.W.h;
        uf0.f(ky2Var);
        ky2Var.Q2(new va0(this.T), this.U, this.V, this.P);
    }
}