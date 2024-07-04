package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: o14  reason: default package */
public final class o14 implements e14 {
    public final y73 a;
    public final Context b;
    public final qq3 c;
    public final li4 d;
    public final Executor e;
    public final xv2 f;
    public final og2 g;
    public final boolean h = ((Boolean) w82.d.c.a(x92.w7)).booleanValue();

    public o14(y73 y73Var, Context context, Executor executor, qq3 qq3Var, li4 li4Var, xv2 xv2Var, og2 og2Var) {
        this.b = context;
        this.a = y73Var;
        this.e = executor;
        this.c = qq3Var;
        this.d = li4Var;
        this.f = xv2Var;
        this.g = og2Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        ei4 ei4Var = yh4Var.s;
        return (ei4Var == null || ei4Var.a == null) ? false : true;
    }

    @Override // defpackage.e14
    public final dz4 b(final hi4 hi4Var, final yh4 yh4Var) {
        final uq3 uq3Var = new uq3();
        ay4 F = zw4.F(zw4.C(null), new ky4() { // from class: n14
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                og2 og2Var;
                o14 o14Var = o14.this;
                final yh4 yh4Var2 = yh4Var;
                hi4 hi4Var2 = hi4Var;
                uq3 uq3Var2 = uq3Var;
                final l13 a = o14Var.c.a(o14Var.d.e, yh4Var2, (ci4) hi4Var2.b.Q);
                a.J0(yh4Var2.W);
                uq3Var2.a(o14Var.b, a);
                bx2 bx2Var = new bx2();
                final x33 a2 = o14Var.a.a(new ts1(hi4Var2, yh4Var2, null), new hj3(new u14(o14Var.f, bx2Var, yh4Var2, a, o14Var.d, o14Var.h, o14Var.g), a), new x73(yh4Var2.a0));
                pq3 s = a2.s();
                if (o14Var.h) {
                    og2Var = o14Var.g;
                } else {
                    og2Var = null;
                }
                s.a(a, false, og2Var);
                bx2Var.a(a2);
                a2.n().Q0(new ae3() { // from class: l14
                    @Override // defpackage.ae3
                    public final void n() {
                        y03 y03Var = a;
                        if (y03Var.R() != null) {
                            y03Var.R().n();
                        }
                    }
                }, zw2.f);
                a2.s();
                ei4 ei4Var = yh4Var2.s;
                return zw4.E(pq3.b(a, ei4Var.b, ei4Var.a), new at4() { // from class: m14
                    @Override // defpackage.at4
                    public final Object apply(Object obj2) {
                        y03 y03Var = a;
                        yh4 yh4Var3 = yh4Var2;
                        w73 w73Var = a2;
                        if (yh4Var3.M) {
                            y03Var.B0();
                        }
                        y03Var.l0();
                        y03Var.onPause();
                        return w73Var.p();
                    }
                }, o14Var.e);
            }
        }, this.e);
        F.b(new gh4(4, uq3Var), this.e);
        return F;
    }
}