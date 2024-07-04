package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ag4  reason: default package */
public final class ag4 implements vg4 {
    public final vg4 a;
    public final vg4 b;
    public final pk4 c;
    public final String d;
    public wc3 e;
    public final Executor f;

    public ag4(mg4 mg4Var, jg4 jg4Var, pk4 pk4Var, String str, yw2 yw2Var) {
        this.a = mg4Var;
        this.b = jg4Var;
        this.c = pk4Var;
        this.d = str;
        this.f = yw2Var;
    }

    @Override // defpackage.vg4
    public final dz4 a(final wg4 wg4Var, final ug4 ug4Var) {
        dz4 b;
        synchronized (this) {
            vc3 b2 = ug4Var.b(wg4Var.b);
            b2.a(new bg4(this.d));
            final wc3 wc3Var = (wc3) b2.f();
            wc3Var.h();
            wc3Var.h();
            pn5 pn5Var = wc3Var.h().d;
            if (pn5Var.h0 == null && pn5Var.m0 == null) {
                li4 h = wc3Var.h();
                final zf4 zf4Var = new zf4(ug4Var, wg4Var, h.d, h.f, this.f, h.j, null);
                b = zw4.F(sy4.r(((jg4) this.b).b(wg4Var, ug4Var, wc3Var)), new ky4() { // from class: yf4
                    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
                    @Override // defpackage.ky4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final dz4 e(Object obj) {
                        vk4 vk4Var;
                        boolean z;
                        hx4 a;
                        final ag4 ag4Var = ag4.this;
                        wg4 wg4Var2 = wg4Var;
                        zf4 zf4Var2 = zf4Var;
                        ug4 ug4Var2 = ug4Var;
                        wc3 wc3Var2 = wc3Var;
                        fg4 fg4Var = (fg4) obj;
                        if (fg4Var != null) {
                            ag4Var.getClass();
                            zf4 zf4Var3 = new zf4(zf4Var2.a, zf4Var2.b, zf4Var2.c, zf4Var2.d, zf4Var2.e, zf4Var2.f, fg4Var.a);
                            if (fg4Var.c != null) {
                                ag4Var.e = null;
                                pk4 pk4Var = ag4Var.c;
                                synchronized (pk4Var) {
                                    pk4Var.c.add(zf4Var3);
                                }
                                return ag4Var.b(fg4Var.c, wg4Var2);
                            }
                            pk4 pk4Var2 = ag4Var.c;
                            synchronized (pk4Var2) {
                                pk4Var2.e = 2;
                                synchronized (pk4Var2) {
                                    vk4Var = pk4Var2.d;
                                    if (vk4Var == null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                }
                                if (a == null) {
                                    ag4Var.e = null;
                                    return zw4.F(a, new ky4() { // from class: xf4
                                        @Override // defpackage.ky4
                                        public final dz4 e(Object obj2) {
                                            lk4 lk4Var;
                                            ag4 ag4Var2 = ag4.this;
                                            kk4 kk4Var = (kk4) obj2;
                                            ag4Var2.getClass();
                                            if (kk4Var != null && kk4Var.a != null && (lk4Var = kk4Var.b) != null) {
                                                x52 w = d62.w();
                                                v52 w2 = w52.w();
                                                w2.j();
                                                w52.A((w52) w2.Q);
                                                a62 y = a62.y();
                                                w2.j();
                                                w52.y((w52) w2.Q, y);
                                                w.k(w2);
                                                kk4Var.a.a.c().f.M0((d62) w.h());
                                                return ag4Var2.b(kk4Var.a, ((zf4) lk4Var).b);
                                            }
                                            throw new vu3(1, "Empty prefetch");
                                        }
                                    }, ag4Var.f);
                                }
                                pk4 pk4Var3 = ag4Var.c;
                                synchronized (pk4Var3) {
                                    pk4Var3.c.add(zf4Var3);
                                }
                                wg4Var2 = new wg4(wg4Var2.b, fg4Var.b);
                            }
                            if (z) {
                                a = null;
                            } else {
                                a = vk4Var.a(zf4Var3);
                            }
                            if (a == null) {
                            }
                        }
                        dz4 b3 = ((mg4) ag4Var.a).b(wg4Var2, ug4Var2, wc3Var2);
                        ag4Var.e = wc3Var2;
                        return b3;
                    }
                }, this.f);
            }
            this.e = wc3Var;
            b = ((mg4) this.a).b(wg4Var, ug4Var, wc3Var);
        }
        return b;
    }

    public final dz4 b(dk4 dk4Var, wg4 wg4Var) {
        wc3 wc3Var = dk4Var.a;
        this.e = wc3Var;
        if (dk4Var.c != null) {
            if (wc3Var.e() != null) {
                dk4Var.c.e.e(dk4Var.a.e());
            }
            return zw4.C(dk4Var.c);
        }
        wc3Var.c().g = dk4Var.b;
        return ((mg4) this.a).b(wg4Var, null, dk4Var.a);
    }

    @Override // defpackage.vg4
    public final Object i() {
        wc3 wc3Var;
        synchronized (this) {
            wc3Var = this.e;
        }
        return wc3Var;
    }
}