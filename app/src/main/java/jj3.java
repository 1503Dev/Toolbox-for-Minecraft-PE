package defpackage;

import android.content.Context;

/* renamed from: jj3  reason: default package */
public final class jj3 implements lj5 {
    public final /* synthetic */ int a = 0;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final Object f;

    public jj3(t23 t23Var, uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4) {
        this.b = t23Var;
        this.c = uj5Var;
        this.d = uj5Var2;
        this.e = uj5Var3;
        this.f = uj5Var4;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                final Context context = (Context) this.b.c();
                final xv2 a = ((f33) this.c).a();
                final yh4 a2 = ((pa3) this.d).a();
                final li4 a3 = ((ed3) this.e).a();
                return new ii3(new le3() { // from class: gj3
                    @Override // defpackage.le3
                    public final void k() {
                        jv5.A.m.g(context, a.P, a2.C.toString(), a3.f);
                    }
                }, zw2.f);
            default:
                return new a14(((t23) this.b).a(), (r04) this.c.c(), (wv2) this.d.c(), (zr3) this.e.c(), (wl4) ((uj5) this.f).c());
        }
    }

    public jj3(hj3 hj3Var, uj5 uj5Var, f33 f33Var, uj5 uj5Var2, ed3 ed3Var) {
        this.f = hj3Var;
        this.b = uj5Var;
        this.c = f33Var;
        this.d = uj5Var2;
        this.e = ed3Var;
    }
}