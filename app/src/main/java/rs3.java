package defpackage;

import android.os.Bundle;

/* renamed from: rs3  reason: default package */
public final class rs3 extends gu3 {
    public final /* synthetic */ String U;
    public final /* synthetic */ String V;
    public final /* synthetic */ Bundle W;
    public final /* synthetic */ h34 Z;
    public final /* synthetic */ Long T = null;
    public final /* synthetic */ boolean X = true;
    public final /* synthetic */ boolean Y = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs3(h34 h34Var, String str, String str2, Bundle bundle) {
        super(h34Var, true);
        this.Z = h34Var;
        this.U = str;
        this.V = str2;
        this.W = bundle;
    }

    @Override // defpackage.gu3
    public final void b() {
        long longValue;
        Long l = this.T;
        if (l == null) {
            longValue = this.P;
        } else {
            longValue = l.longValue();
        }
        ky2 ky2Var = this.Z.h;
        uf0.f(ky2Var);
        ky2Var.c2(this.U, this.V, this.W, this.X, this.Y, longValue);
    }
}