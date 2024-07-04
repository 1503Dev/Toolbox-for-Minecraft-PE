package defpackage;

import android.content.Context;

/* renamed from: v14  reason: default package */
public final /* synthetic */ class v14 implements wj3 {
    public final /* synthetic */ int P;
    public final /* synthetic */ h14 Q;

    public /* synthetic */ v14(h14 h14Var, int i) {
        this.P = i;
        this.Q = h14Var;
    }

    @Override // defpackage.wj3
    public final void c(boolean z, Context context, wd3 wd3Var) {
        switch (this.P) {
            case 0:
                h14 h14Var = this.Q;
                try {
                    ((mj4) h14Var.b).b(z);
                    mj4 mj4Var = (mj4) h14Var.b;
                    mj4Var.getClass();
                    mj4Var.a.i3(new va0(context));
                    return;
                } catch (ni4 e) {
                    throw new vj3(e.getCause());
                }
            default:
                h14 h14Var2 = this.Q;
                try {
                    ((mj4) h14Var2.b).b(z);
                    mj4 mj4Var2 = (mj4) h14Var2.b;
                    mj4Var2.getClass();
                    mj4Var2.a.y0(new va0(context));
                    return;
                } catch (ni4 e2) {
                    throw new vj3(e2.getCause());
                }
        }
    }
}