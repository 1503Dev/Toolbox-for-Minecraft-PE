package defpackage;

import java.util.Collections;

/* renamed from: x54  reason: default package */
public final class x54 implements e14 {
    public final sa2 a;
    public final ez4 b;
    public final ol4 c;
    public final c64 d;

    public x54(ol4 ol4Var, ez4 ez4Var, sa2 sa2Var, c64 c64Var) {
        this.c = ol4Var;
        this.b = ez4Var;
        this.a = sa2Var;
        this.d = c64Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        ei4 ei4Var;
        return (this.a == null || (ei4Var = yh4Var.s) == null || ei4Var.a == null) ? false : true;
    }

    @Override // defpackage.e14
    public final dz4 b(hi4 hi4Var, yh4 yh4Var) {
        bx2 bx2Var = new bx2();
        wk1 wk1Var = new wk1(7);
        j43 j43Var = new j43(this, bx2Var, hi4Var, yh4Var, wk1Var);
        synchronized (wk1Var) {
            wk1Var.P = j43Var;
        }
        ei4 ei4Var = yh4Var.s;
        ma2 ma2Var = new ma2(wk1Var, ei4Var.b, ei4Var.a);
        ol4 ol4Var = this.c;
        ml4 ml4Var = ml4.CUSTOM_RENDER_SYN;
        jg1 jg1Var = new jg1(this, ma2Var);
        jl4 b = new jl4(ol4Var, ml4Var, kl4.d, Collections.emptyList(), this.b.b(new ac4(1, jg1Var))).b(ml4.CUSTOM_RENDER_ACK);
        return new jl4(b.f, b.a, b.b, b.c, b.d, zw4.F(b.e, new bt1(1, bx2Var), zw2.f)).a();
    }
}