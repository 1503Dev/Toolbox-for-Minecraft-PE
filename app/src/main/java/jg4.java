package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: jg4  reason: default package */
public final class jg4 implements vg4 {
    public final wj4 a;
    public final Executor b;
    public final eg4 c = new eg4(0);

    public jg4(wj4 wj4Var, yw2 yw2Var) {
        this.a = wj4Var;
        this.b = yw2Var;
    }

    @Override // defpackage.vg4
    public final /* bridge */ /* synthetic */ dz4 a(wg4 wg4Var, ug4 ug4Var) {
        return b(wg4Var, ug4Var, null);
    }

    public final dz4 b(wg4 wg4Var, ug4 ug4Var, final wc3 wc3Var) {
        dz4 C;
        dz4 z;
        wj4 wj4Var = this.a;
        Executor executor = this.b;
        rg4 rg4Var = new rg4(wj4Var, wc3Var, executor);
        qg4 qg4Var = rg4Var.d;
        if (qg4Var == null) {
            if (!((Boolean) ub2.a.d()).booleanValue()) {
                qg4 qg4Var2 = new qg4(null, rg4Var.a());
                rg4Var.d = qg4Var2;
                z = zw4.C(qg4Var2);
            } else {
                final hb3 c = wc3Var.c();
                final bk4 bk4Var = ((xj4) wj4Var).b;
                el4 a = c.c.b(c.i.a(), ml4.GET_CACHE_KEY).d(new ky4() { // from class: eb3
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj) {
                        hb3 hb3Var = hb3.this;
                        bk4 bk4Var2 = bk4Var;
                        rq2 rq2Var = (rq2) obj;
                        hb3Var.getClass();
                        rq2Var.X = bk4Var2;
                        ow3 ow3Var = hb3Var.h;
                        ow3Var.getClass();
                        return ow3Var.a(rq2Var, new si3(ow3Var.b), new u04(5, ow3Var), new mw3(0, rq2Var));
                    }
                }).a();
                zw4.J(a, new fb3(0, c), c.j);
                z = zw4.z(zw4.E(sy4.r(a), new pg4(0, rg4Var), executor), gw3.class, new og4(0, rg4Var), executor);
            }
            C = zw4.E(z, new at4() { // from class: ng4
                @Override // defpackage.at4
                public final Object apply(Object obj) {
                    return (qg4) obj;
                }
            }, executor);
        } else {
            C = zw4.C(qg4Var);
        }
        return zw4.z(zw4.F(sy4.r(C), new ky4() { // from class: cg4
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                dk4 dk4Var;
                jg4 jg4Var = jg4.this;
                wc3 wc3Var2 = wc3Var;
                qg4 qg4Var3 = (qg4) obj;
                jg4Var.getClass();
                ek4 ek4Var = qg4Var3.b;
                rq2 rq2Var = qg4Var3.a;
                if (ek4Var != null) {
                    xj4 xj4Var = (xj4) jg4Var.a;
                    synchronized (xj4Var) {
                        vj4 vj4Var = (vj4) xj4Var.a.get(ek4Var);
                        if (vj4Var != null) {
                            rk4 rk4Var = vj4Var.d;
                            rk4Var.getClass();
                            jv5.A.j.getClass();
                            rk4Var.c = System.currentTimeMillis();
                            rk4Var.d++;
                            vj4Var.a();
                            if (vj4Var.a.isEmpty()) {
                                dk4Var = null;
                            } else {
                                dk4Var = (dk4) vj4Var.a.remove();
                                if (dk4Var != null) {
                                    rk4 rk4Var2 = vj4Var.d;
                                    rk4Var2.e++;
                                    rk4Var2.b.P = true;
                                }
                            }
                            if (dk4Var == null) {
                                xj4Var.c.e++;
                            }
                            rk4 rk4Var3 = vj4Var.d;
                            qk4 a2 = rk4Var3.b.a();
                            qk4 qk4Var = rk4Var3.b;
                            qk4Var.P = false;
                            qk4Var.Q = 0;
                            if (dk4Var != null) {
                                x52 w = d62.w();
                                v52 w2 = w52.w();
                                w2.j();
                                w52.A((w52) w2.Q);
                                z52 w3 = a62.w();
                                boolean z2 = a2.P;
                                w3.j();
                                a62.z((a62) w3.Q, z2);
                                int i = a2.Q;
                                w3.j();
                                a62.A((a62) w3.Q, i);
                                w2.j();
                                w52.y((w52) w2.Q, (a62) w3.h());
                                w.k(w2);
                                dk4Var.a.c().f.v0((d62) w.h());
                            }
                        } else {
                            xj4Var.c.d++;
                            dk4Var = null;
                        }
                        xj4Var.b();
                    }
                } else {
                    dk4Var = null;
                }
                if (ek4Var == null) {
                    return zw4.C(null);
                }
                if (dk4Var != null && rq2Var != null) {
                    hb3 c2 = wc3Var2.c();
                    ol4 ol4Var = c2.c;
                    ml4 ml4Var = ml4.NOTIFY_CACHE_HIT;
                    ow3 ow3Var = c2.h;
                    ow3Var.getClass();
                    el4 a3 = ol4Var.b(ow3Var.a(rq2Var, new s82(4, ow3Var), new d60(5, ow3Var), new ky4() { // from class: iw3
                        @Override // defpackage.ky4
                        public final dz4 e(Object obj2) {
                            InputStream inputStream = (InputStream) obj2;
                            return zw4.C(null);
                        }
                    }), ml4Var).a();
                    zw4.J(a3, new gb3(0, c2), c2.j);
                    zw4.J(a3, jg4Var.c, jg4Var.b);
                }
                return zw4.C(new fg4(ek4Var, rq2Var, dk4Var));
            }
        }, this.b), Exception.class, new dg4(), this.b);
    }

    @Override // defpackage.vg4
    public final /* bridge */ /* synthetic */ Object i() {
        return null;
    }
}