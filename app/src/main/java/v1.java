package defpackage;

import android.graphics.Rect;
import defpackage.eg1;
import java.util.UUID;

/* renamed from: v1  reason: default package */
public final class v1 implements Runnable {
    public final /* synthetic */ eg1.a P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ z61 R;
    public final /* synthetic */ eg1.b S;

    public v1(u1 u1Var, String str, z61 z61Var, eg1.b bVar) {
        this.P = u1Var;
        this.Q = str;
        this.R = z61Var;
        this.S = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad1 h = ga1.h();
        if (!h.B && !h.C) {
            ad1 h2 = ga1.h();
            h2.D.a(15000L);
            if (h2.D.a || !ga1.i()) {
                m2 m2Var = h.u.get(this.Q);
                if (m2Var == null) {
                    m2Var = new m2();
                }
                int i = m2Var.b;
                if (i != 2 && i != 1) {
                    eg1.q(this.P);
                    if (!this.P.a()) {
                        pb1 k = h.k();
                        String str = this.Q;
                        z61 z61Var = this.R;
                        long a = this.S.a();
                        k.getClass();
                        String uuid = UUID.randomUUID().toString();
                        ad1 h3 = ga1.h();
                        i2 i2Var = new i2(uuid, z61Var, str);
                        ic1 ic1Var = new ic1();
                        eb1.j(ic1Var, "zone_id", str);
                        eb1.m(ic1Var, "fullscreen", true);
                        h3.l().getClass();
                        Rect g = he1.g();
                        eb1.l(g.width(), ic1Var, "width");
                        eb1.l(g.height(), ic1Var, "height");
                        eb1.l(0, ic1Var, "type");
                        eb1.j(ic1Var, "id", uuid);
                        k.c.put(uuid, i2Var);
                        k.a.put(uuid, new ub1(k, uuid, str, a));
                        new rc1(1, ic1Var, "AdSession.on_request").b();
                        eg1.e(a, k.a.get(uuid));
                        return;
                    }
                    return;
                }
                eg1.g(this.P);
                return;
            }
        } else {
            t1.b(0, 0, "The AdColony API is not available while AdColony is disabled.", false);
        }
        eg1.g(this.P);
    }
}