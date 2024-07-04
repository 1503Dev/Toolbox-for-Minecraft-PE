package defpackage;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: n83  reason: default package */
public final class n83 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;
    public final uj5 i;
    public final uj5 j;

    public n83(vb3 vb3Var, uj5 uj5Var, s83 s83Var, uj5 uj5Var2, uj5 uj5Var3, t83 t83Var, mk3 mk3Var, uj5 uj5Var4, jj5 jj5Var, uj5 uj5Var5) {
        this.a = vb3Var;
        this.b = uj5Var;
        this.c = s83Var;
        this.d = uj5Var2;
        this.e = uj5Var3;
        this.f = t83Var;
        this.g = mk3Var;
        this.h = uj5Var4;
        this.i = jj5Var;
        this.j = uj5Var5;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final m83 c() {
        ba3 c = ((vb3) this.a).c();
        Context context = (Context) this.b.c();
        zh4 zh4Var = ((s83) this.c).a.c;
        tv2.C(zh4Var);
        View view = ((r83) this.d).a.b;
        tv2.C(view);
        y03 y03Var = ((c93) this.e).a.d;
        aa3 aa3Var = ((t83) this.f).a.a;
        tv2.C(aa3Var);
        wl3 wl3Var = (wl3) ((mk3) this.g).a.P;
        tv2.C(wl3Var);
        return new m83(c, context, zh4Var, view, y03Var, aa3Var, wl3Var, (qi3) this.h.c(), kj5.a(this.i), (Executor) this.j.c());
    }
}