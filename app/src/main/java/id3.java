package defpackage;

import android.content.Context;

/* renamed from: id3  reason: default package */
public final class id3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;

    public id3(uj5 uj5Var, f33 f33Var, uj5 uj5Var2, f53 f53Var) {
        this.a = uj5Var;
        this.b = f33Var;
        this.c = uj5Var2;
        this.d = f53Var;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        Context context = (Context) this.a.c();
        xv2 a = ((f33) this.b).a();
        yh4 a2 = ((pa3) this.c).a();
        if (a2.A != null) {
            ei4 ei4Var = a2.s;
            return new vs2(context, a, a2.A, ei4Var != null ? ei4Var.b : null);
        }
        return null;
    }
}