package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: e34  reason: default package */
public final class e34 implements k14 {
    public final Context a;
    public final sj3 b;
    public final xv2 c;
    public final Executor d;

    public e34(Context context, xv2 xv2Var, sj3 sj3Var, yw2 yw2Var) {
        this.a = context;
        this.c = xv2Var;
        this.b = sj3Var;
        this.d = yw2Var;
    }

    @Override // defpackage.k14
    public final /* bridge */ /* synthetic */ Object a(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        o43 c = this.b.c(new ts1(hi4Var, yh4Var, h14Var.a), new hj3(new sk1(2, this, h14Var), null));
        c.s().Q0(new u63((mj4) h14Var.b), this.d);
        ((w24) h14Var.c).u4(c.u());
        return c.p();
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        mj4 mj4Var = (mj4) h14Var.b;
        Context context = this.a;
        pn5 pn5Var = ((li4) hi4Var.a.P).d;
        String jSONObject = yh4Var.v.toString();
        String j = mq2.j(yh4Var.s);
        cl2 cl2Var = (cl2) h14Var.c;
        mj4Var.getClass();
        try {
            mj4Var.a.F3(new va0(context), pn5Var, jSONObject, j, cl2Var);
        } catch (Throwable th) {
            throw new ni4(th);
        }
    }
}