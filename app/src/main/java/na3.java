package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: na3  reason: default package */
public final class na3 implements wy4, jy4, kg4 {
    public final /* synthetic */ int P;
    public final Object Q;
    public final Object R;

    public /* synthetic */ na3(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // defpackage.jy4
    public final dz4 a() {
        dz4 G;
        wp2 wp2Var = (wp2) this.R;
        jx3 jx3Var = ((sw3) this.Q).c;
        long longValue = ((Long) w82.d.c.a(x92.W8)).longValue();
        synchronized (jx3Var) {
            if (jx3Var.b) {
                G = zw4.G(jx3Var.a, longValue, TimeUnit.MILLISECONDS, jx3Var.g);
            } else {
                jx3Var.b = true;
                jx3Var.h = wp2Var;
                synchronized (jx3Var) {
                    if (jx3Var.d == null) {
                        jx3Var.d = new rp2(jx3Var.e, jx3Var.f, jx3Var, jx3Var);
                    }
                    jx3Var.d.n();
                    G = zw4.G(jx3Var.a, longValue, TimeUnit.MILLISECONDS, jx3Var.g);
                    G.b(new gh4(3, jx3Var), zw2.f);
                }
            }
        }
        return G;
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        ((px2) obj).A2((String) this.Q, (String) this.R);
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        final oa3 oa3Var = (oa3) this.R;
        List<dz4> list = ((ka3) obj).a;
        final wy4 wy4Var = (wy4) this.Q;
        if (list == null || list.isEmpty()) {
            oa3Var.a.execute(new p22(2, wy4Var));
            return;
        }
        dz4 C = zw4.C(null);
        for (final dz4 dz4Var : list) {
            C = zw4.F(zw4.B(C, Throwable.class, new ky4() { // from class: la3
                @Override // defpackage.ky4
                public final dz4 e(Object obj2) {
                    wy4.this.h((Throwable) obj2);
                    return zw4.C(null);
                }
            }, oa3Var.a), new ky4() { // from class: ma3
                @Override // defpackage.ky4
                public final dz4 e(Object obj2) {
                    oa3 oa3Var2 = oa3.this;
                    wy4 wy4Var2 = wy4Var;
                    dz4 dz4Var2 = dz4Var;
                    ea3 ea3Var = (ea3) obj2;
                    oa3Var2.getClass();
                    if (ea3Var != null) {
                        wy4Var2.f(ea3Var);
                    }
                    return zw4.G(dz4Var2, ((Long) ac2.a.d()).longValue(), TimeUnit.MILLISECONDS, oa3Var2.b);
                }
            }, oa3Var.a);
        }
        zw4.J(C, new ys0(oa3Var, wy4Var), oa3Var.a);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        ((wy4) this.Q).h(th);
        zw2.e.execute(new cx1(4, (oa3) this.R));
    }

    public na3(oa3 oa3Var, i74 i74Var) {
        this.P = 0;
        this.R = oa3Var;
        this.Q = i74Var;
    }
}