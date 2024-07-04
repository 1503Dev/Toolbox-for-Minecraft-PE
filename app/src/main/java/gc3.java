package defpackage;

import java.util.concurrent.Executor;

/* renamed from: gc3  reason: default package */
public final class gc3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ gc3(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ii3((pc3) this.b.c(), zw2.f);
            default:
                final y03 y03Var = ((hj3) this.c).b;
                return new ii3(new qf3() { // from class: fj3
                    @Override // defpackage.qf3
                    public final void a() {
                        qn5 N;
                        y03 y03Var2 = y03.this;
                        if (y03Var2 == null || (N = y03Var2.N()) == null) {
                            return;
                        }
                        N.c();
                    }
                }, (Executor) this.b.c());
        }
    }
}