package defpackage;

import android.content.Context;

/* renamed from: kc3  reason: default package */
public final class kc3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public kc3(uj5 uj5Var, f33 f33Var, ed3 ed3Var) {
        this.a = uj5Var;
        this.b = f33Var;
        this.c = ed3Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        final Context context = (Context) this.a.c();
        final xv2 a = ((f33) this.b).a();
        final li4 a2 = ((ed3) this.c).a();
        return new at4() { // from class: jc3
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                Context context2 = context;
                xv2 xv2Var = a;
                li4 li4Var = a2;
                yh4 yh4Var = (yh4) obj;
                y02 y02Var = new y02(context2);
                y02Var.c = yh4Var.B;
                y02Var.f = yh4Var.C.toString();
                y02Var.e = xv2Var.P;
                y02Var.d = li4Var.f;
                return y02Var;
            }
        };
    }
}