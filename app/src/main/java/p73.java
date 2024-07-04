package defpackage;

import android.os.Bundle;

/* renamed from: p73  reason: default package */
public final class p73 extends gu3 {
    public final /* synthetic */ String T;
    public final /* synthetic */ String U;
    public final /* synthetic */ Bundle V;
    public final /* synthetic */ h34 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p73(h34 h34Var, String str, String str2, Bundle bundle) {
        super(h34Var, true);
        this.W = h34Var;
        this.T = str;
        this.U = str2;
        this.V = bundle;
    }

    @Override // defpackage.gu3
    public final void b() {
        ky2 ky2Var = this.W.h;
        uf0.f(ky2Var);
        ky2Var.n4(this.V, this.T, this.U);
    }
}