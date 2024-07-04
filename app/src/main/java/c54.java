package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: c54  reason: default package */
public final class c54 implements e14 {
    public final Context a;
    public final qq3 b;
    public final bq3 c;
    public final li4 d;
    public final Executor e;
    public final xv2 f;
    public final og2 g;
    public final boolean h = ((Boolean) w82.d.c.a(x92.w7)).booleanValue();

    public c54(Context context, xv2 xv2Var, li4 li4Var, Executor executor, bq3 bq3Var, qq3 qq3Var, og2 og2Var) {
        this.a = context;
        this.d = li4Var;
        this.c = bq3Var;
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
        ay4 F = zw4.F(zw4.C(null), new ky4() { // from class: w44
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                og2 og2Var;
                c54 c54Var = c54.this;
                final yh4 yh4Var2 = yh4Var;
                hi4 hi4Var2 = hi4Var;
                uq3 uq3Var2 = uq3Var;
                final l13 a = c54Var.b.a(c54Var.d.e, yh4Var2, (ci4) hi4Var2.b.Q);
                a.J0(yh4Var2.W);
                uq3Var2.a(c54Var.a, a);
                bx2 bx2Var = new bx2();
                final w43 b = c54Var.c.b(new ts1(hi4Var2, yh4Var2, null), new aq3(new b54(c54Var.a, c54Var.b, c54Var.d, c54Var.f, yh4Var2, bx2Var, a, c54Var.g, c54Var.h), a));
                bx2Var.a(b);
                a.D0("/reward", new ah2(b.p()));
                b.n().Q0(new ae3() { // from class: x44
                    @Override // defpackage.ae3
                    public final void n() {
                        y03 y03Var = a;
                        if (y03Var.R() != null) {
                            y03Var.R().n();
                        }
                    }
                }, zw2.f);
                pq3 s = b.s();
                if (c54Var.h) {
                    og2Var = c54Var.g;
                } else {
                    og2Var = null;
                }
                s.a(a, true, og2Var);
                b.s();
                ei4 ei4Var = yh4Var2.s;
                return zw4.E(pq3.b(a, ei4Var.b, ei4Var.a), new at4() { // from class: y44
                    @Override // defpackage.at4
                    public final Object apply(Object obj2) {
                        y03 y03Var = a;
                        yh4 yh4Var3 = yh4Var2;
                        zp3 zp3Var = b;
                        if (yh4Var3.M) {
                            y03Var.B0();
                        }
                        y03Var.l0();
                        y03Var.onPause();
                        return zp3Var.r();
                    }
                }, c54Var.e);
            }
        }, this.e);
        F.b(new qy2(4, uq3Var), this.e);
        return F;
    }
}