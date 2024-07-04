package defpackage;

import java.util.concurrent.Executor;

/* renamed from: q93  reason: default package */
public final class q93 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;

    public /* synthetic */ q93(lj5 lj5Var, uj5 uj5Var, lj5 lj5Var2, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = lj5Var;
        this.c = uj5Var;
        this.d = lj5Var2;
        this.e = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                ba3 c = ((vb3) this.b).c();
                pe2 pe2Var = (pe2) ((p93) this.c).a.Q;
                tv2.C(pe2Var);
                return new n93(c, pe2Var, (Runnable) ((o93) this.d).a.R, (Executor) this.e.c());
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new p84(yw2Var, ((ed3) this.c).a(), ((f33) this.d).a(), ((h33) this.e).c());
        }
    }
}