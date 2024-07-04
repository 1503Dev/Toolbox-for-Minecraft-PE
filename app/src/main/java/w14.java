package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: w14  reason: default package */
public final class w14 implements k14 {
    public final Context a;
    public final y73 b;
    public final Executor c;

    public w14(Context context, y73 y73Var, yw2 yw2Var) {
        this.a = context;
        this.b = y73Var;
        this.c = yw2Var;
    }

    @Override // defpackage.k14
    public final /* bridge */ /* synthetic */ Object a(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        x33 a = this.b.a(new ts1(hi4Var, yh4Var, h14Var.a), new hj3(new v14(h14Var, 0), null), new x73(yh4Var.a0));
        a.r().Q0(new u63((mj4) h14Var.b), this.c);
        ((w24) h14Var.c).u4(a.u());
        return a.p();
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        mj4 mj4Var = (mj4) h14Var.b;
        Context context = this.a;
        pn5 pn5Var = ((li4) hi4Var.a.P).d;
        String jSONObject = yh4Var.v.toString();
        cl2 cl2Var = (cl2) h14Var.c;
        mj4Var.getClass();
        try {
            mj4Var.a.E0(new va0(context), pn5Var, jSONObject, cl2Var);
        } catch (Throwable th) {
            throw new ni4(th);
        }
    }
}