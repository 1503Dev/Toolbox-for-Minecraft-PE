package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Collections;

/* renamed from: t54  reason: default package */
public final class t54 implements e14 {
    public final Context a;
    public final d93 b;
    public final sa2 c;
    public final ez4 d;
    public final ol4 e;

    public t54(Context context, d93 d93Var, ol4 ol4Var, ez4 ez4Var, sa2 sa2Var) {
        this.a = context;
        this.b = d93Var;
        this.e = ol4Var;
        this.d = ez4Var;
        this.c = sa2Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        ei4 ei4Var;
        return (this.c == null || (ei4Var = yh4Var.s) == null || ei4Var.a == null) ? false : true;
    }

    @Override // defpackage.e14
    public final dz4 b(hi4 hi4Var, yh4 yh4Var) {
        c43 a = this.b.a(new ts1(hi4Var, yh4Var, null), new r54(new View(this.a), (zh4) yh4Var.u.get(0)));
        s54 v = a.v();
        ei4 ei4Var = yh4Var.s;
        ma2 ma2Var = new ma2(v, ei4Var.b, ei4Var.a);
        ol4 ol4Var = this.e;
        ml4 ml4Var = ml4.CUSTOM_RENDER_SYN;
        m32 m32Var = new m32(this, ma2Var);
        jl4 b = new jl4(ol4Var, ml4Var, kl4.d, Collections.emptyList(), this.d.b(new ac4(1, m32Var))).b(ml4.CUSTOM_RENDER_ACK);
        return new jl4(b.f, b.a, b.b, b.c, b.d, zw4.F(b.e, new bt1(1, zw4.C(a.p())), zw2.f)).a();
    }
}