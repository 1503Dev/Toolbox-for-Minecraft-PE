package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: k94  reason: default package */
public final class k94 implements nf3 {
    public String P;
    public final Object Q;
    public Object R;

    public /* synthetic */ k94(Bundle bundle, String str, String str2) {
        this.P = str;
        this.R = bundle;
        this.Q = str2;
    }

    public /* synthetic */ k94(cr2 cr2Var, String str, String str2) {
        this.R = cr2Var;
        this.P = str;
        this.Q = str2;
    }

    public /* synthetic */ k94(w33 w33Var) {
        this.Q = w33Var;
    }

    public final v43 a() {
        tv2.E(Context.class, (Context) this.R);
        return new v43((w33) this.Q, (Context) this.R, this.P);
    }

    @Override // defpackage.nf3
    /* renamed from: e */
    public final void mo9e(Object obj) {
        t64 t64Var = (t64) obj;
    }
}