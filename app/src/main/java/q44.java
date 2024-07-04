package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: q44  reason: default package */
public final class q44 implements k14 {
    public final Context a;
    public final Executor b;
    public final bq3 c;

    public q44(Context context, Executor executor, bq3 bq3Var) {
        this.a = context;
        this.b = executor;
        this.c = bq3Var;
    }

    @Override // defpackage.k14
    public final /* bridge */ /* synthetic */ Object a(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        w43 b = this.c.b(new ts1(hi4Var, yh4Var, h14Var.a), new aq3(new v14(h14Var, 1)));
        b.u().Q0(new u63((mj4) h14Var.b), this.b);
        ((w24) h14Var.c).u4(b.w());
        return b.r();
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        try {
            li4 li4Var = (li4) hi4Var.a.P;
            if (li4Var.o.P == 3) {
                mj4 mj4Var = (mj4) h14Var.b;
                Context context = this.a;
                pn5 pn5Var = li4Var.d;
                String jSONObject = yh4Var.v.toString();
                cl2 cl2Var = (cl2) h14Var.c;
                mj4Var.getClass();
                mj4Var.a.H2(new va0(context), pn5Var, jSONObject, cl2Var);
                return;
            }
            mj4 mj4Var2 = (mj4) h14Var.b;
            Context context2 = this.a;
            pn5 pn5Var2 = li4Var.d;
            String jSONObject2 = yh4Var.v.toString();
            cl2 cl2Var2 = (cl2) h14Var.c;
            mj4Var2.getClass();
            mj4Var2.a.V0(new va0(context2), pn5Var2, jSONObject2, cl2Var2);
        } catch (Exception e) {
            sv2.h("Fail to load ad from adapter ".concat(String.valueOf(h14Var.a)), e);
        }
    }
}