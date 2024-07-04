package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: k64  reason: default package */
public final class k64 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public /* synthetic */ k64(uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = uj5Var4;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new j64((Context) this.b.c(), (gf2) ((kk3) this.c).a.Q, ((ed3) this.d).a(), ((n83) ((u83) this.e).a).c());
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ja4(yw2Var, (ViewGroup) ((f83) this.c).a.Q, (Context) this.d.c(), ((sj5) this.e).c());
        }
    }
}