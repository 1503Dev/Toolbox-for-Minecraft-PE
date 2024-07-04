package defpackage;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: d24  reason: default package */
public final class d24 implements e14 {
    public final d93 a;
    public final Context b;
    public final qq3 c;
    public final li4 d;
    public final Executor e;
    public final at4 f;

    public d24(d93 d93Var, Context context, Executor executor, qq3 qq3Var, li4 li4Var, at4 at4Var) {
        this.b = context;
        this.a = d93Var;
        this.e = executor;
        this.c = qq3Var;
        this.d = li4Var;
        this.f = at4Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        ei4 ei4Var = yh4Var.s;
        return (ei4Var == null || ei4Var.a == null) ? false : true;
    }

    @Override // defpackage.e14
    public final dz4 b(final hi4 hi4Var, final yh4 yh4Var) {
        return zw4.F(zw4.C(null), new ky4() { // from class: a24
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                View tq3Var;
                zh4 zh4Var;
                d24 d24Var = d24.this;
                hi4 hi4Var2 = hi4Var;
                yh4 yh4Var2 = yh4Var;
                zr5 y = ea2.y(d24Var.b, yh4Var2.u);
                final l13 a = d24Var.c.a(y, yh4Var2, (ci4) hi4Var2.b.Q);
                a.J0(yh4Var2.W);
                if (((Boolean) w82.d.c.a(x92.A6)).booleanValue() && yh4Var2.g0) {
                    tq3Var = r93.a(d24Var.b, a, yh4Var2);
                } else {
                    tq3Var = new tq3(d24Var.b, a, (y02) d24Var.f.apply(yh4Var2));
                }
                d93 d93Var = d24Var.a;
                ts1 ts1Var = new ts1(hi4Var2, yh4Var2, null);
                d22 d22Var = new d22(4, a);
                if (y.X) {
                    zh4Var = new zh4(-3, 0, true);
                } else {
                    zh4Var = new zh4(y.T, y.Q, false);
                }
                final c43 a2 = d93Var.a(ts1Var, new q83(tq3Var, a, d22Var, zh4Var));
                a2.s().a(a, false, null);
                zd3 n = a2.n();
                ae3 ae3Var = new ae3() { // from class: b24
                    @Override // defpackage.ae3
                    public final void n() {
                        y03 y03Var = a;
                        if (y03Var.R() != null) {
                            y03Var.R().n();
                        }
                    }
                };
                yw2 yw2Var = zw2.f;
                n.Q0(ae3Var, yw2Var);
                a2.s();
                ei4 ei4Var = yh4Var2.s;
                bx2 b = pq3.b(a, ei4Var.b, ei4Var.a);
                if (yh4Var2.M) {
                    b.b(new qy2(3, a), d24Var.e);
                }
                b.b(new ry2(1, d24Var, a), d24Var.e);
                return zw4.E(b, new at4() { // from class: c24
                    @Override // defpackage.at4
                    public final Object apply(Object obj2) {
                        return i83.this.p();
                    }
                }, yw2Var);
            }
        }, this.e);
    }
}