package defpackage;

import android.content.Context;

/* renamed from: yb3  reason: default package */
public final class yb3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public yb3(uj5 uj5Var, uj5 uj5Var2) {
        this.a = 0;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new o82((Context) this.b.c(), (ys2) this.c.c());
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new mn3((dl2) this.b.c(), (kd) this.c.c(), yw2Var);
        }
    }

    public yb3(uj5 uj5Var, uj5 uj5Var2, int i) {
        zk4 zk4Var = lp5.R;
        this.a = 1;
        this.b = uj5Var;
        this.c = uj5Var2;
        this.d = zk4Var;
    }
}