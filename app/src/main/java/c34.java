package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: c34  reason: default package */
public final class c34 implements e14 {
    public final Context a;
    public final qq3 b;
    public final sj3 c;
    public final li4 d;
    public final Executor e;
    public final xv2 f;
    public final og2 g;
    public final boolean h = ((Boolean) w82.d.c.a(x92.w7)).booleanValue();

    public c34(Context context, xv2 xv2Var, li4 li4Var, Executor executor, sj3 sj3Var, qq3 qq3Var, og2 og2Var) {
        this.a = context;
        this.d = li4Var;
        this.c = sj3Var;
        this.e = executor;
        this.f = xv2Var;
        this.b = qq3Var;
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
        ay4 F = zw4.F(zw4.C(null), new ky4() { // from class: y24
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                og2 og2Var;
                c34 c34Var = c34.this;
                final yh4 yh4Var2 = yh4Var;
                hi4 hi4Var2 = hi4Var;
                uq3 uq3Var2 = uq3Var;
                final l13 a = c34Var.b.a(c34Var.d.e, yh4Var2, (ci4) hi4Var2.b.Q);
                a.J0(yh4Var2.W);
                uq3Var2.a(c34Var.a, a);
                bx2 bx2Var = new bx2();
                final o43 c = c34Var.c.c(new ts1(hi4Var2, yh4Var2, null), new hj3(new b34(c34Var.a, c34Var.f, bx2Var, yh4Var2, a, c34Var.d, c34Var.h, c34Var.g), a));
                bx2Var.a(c);
                c.n().Q0(new ae3() { // from class: z24
                    @Override // defpackage.ae3
                    public final void n() {
                        y03 y03Var = a;
                        if (y03Var.R() != null) {
                            y03Var.R().n();
                        }
                    }
                }, zw2.f);
                pq3 v = c.v();
                if (c34Var.h) {
                    og2Var = c34Var.g;
                } else {
                    og2Var = null;
                }
                v.a(a, true, og2Var);
                c.v();
                ei4 ei4Var = yh4Var2.s;
                return zw4.E(pq3.b(a, ei4Var.b, ei4Var.a), new at4() { // from class: a34
                    @Override // defpackage.at4
                    public final Object apply(Object obj2) {
                        y03 y03Var = a;
                        yh4 yh4Var3 = yh4Var2;
                        ej3 ej3Var = c;
                        if (yh4Var3.M) {
                            y03Var.B0();
                        }
                        y03Var.l0();
                        y03Var.onPause();
                        return ej3Var.p();
                    }
                }, c34Var.e);
            }
        }, this.e);
        F.b(new fp1(3, uq3Var), this.e);
        return F;
    }
}