package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: n44  reason: default package */
public final class n44 implements ky4 {
    public final ol4 a;
    public final pd3 b;
    public final bn4 c;
    public final gn4 d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final ga3 g;
    public final i44 h;
    public final j14 i;
    public final Context j;
    public final qm4 k;

    public n44(Context context, ol4 ol4Var, i44 i44Var, pd3 pd3Var, bn4 bn4Var, gn4 gn4Var, ga3 ga3Var, yw2 yw2Var, ScheduledExecutorService scheduledExecutorService, j14 j14Var, qm4 qm4Var) {
        this.j = context;
        this.a = ol4Var;
        this.h = i44Var;
        this.b = pd3Var;
        this.c = bn4Var;
        this.d = gn4Var;
        this.g = ga3Var;
        this.e = yw2Var;
        this.f = scheduledExecutorService;
        this.i = j14Var;
        this.k = qm4Var;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        String str;
        int i;
        final hi4 hi4Var = (hi4) obj;
        l92 l92Var = x92.w4;
        w82 w82Var = w82.d;
        if (true != ((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            str = "No ad config.";
        } else {
            str = "No fill.";
        }
        int i2 = ((ci4) hi4Var.b.Q).e;
        if (i2 != 0) {
            if (i2 >= 200 && i2 < 300) {
                if (!((Boolean) w82Var.c.a(x92.v4)).booleanValue()) {
                    str = "No fill.";
                }
            } else if (i2 >= 300 && i2 < 400) {
                str = "No location header to follow redirect or too many redirects.";
            } else {
                str = k6.a("Received error HTTP response code: ", i2);
            }
        }
        ci4 ci4Var = (ci4) hi4Var.b.Q;
        fb3 fb3Var = ci4Var.i;
        if (fb3Var != null) {
            str = (String) fb3Var.Q;
        }
        this.i.d = ci4Var;
        if (((Boolean) w82Var.c.a(x92.X6)).booleanValue() && (i = ((ci4) hi4Var.b.Q).e) != 0 && (i < 200 || i >= 300)) {
            return new yy4(new l44(3, str));
        }
        el4 a = hl4.a(new yy4(new l44(3, str)), ml4.RENDER_CONFIG_INIT, this.a).a();
        String str2 = ((ci4) hi4Var.b.Q).m;
        if (((Boolean) w82Var.c.a(x92.R2)).booleanValue() && !TextUtils.isEmpty(str2)) {
            j14 j14Var = this.i;
            List<yh4> list = (List) hi4Var.b.P;
            synchronized (j14Var) {
                if (j14Var.b.containsKey(str2)) {
                    int indexOf = j14Var.a.indexOf((fw5) j14Var.b.get(str2));
                    try {
                        j14Var.a.remove(indexOf);
                    } catch (IndexOutOfBoundsException e) {
                        jv5.A.g.f("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e);
                    }
                    j14Var.b.remove(str2);
                    for (yh4 yh4Var : list) {
                        j14Var.a(yh4Var, indexOf);
                        indexOf++;
                    }
                }
            }
        } else {
            for (yh4 yh4Var2 : (List) hi4Var.b.P) {
                j14 j14Var2 = this.i;
                j14Var2.a(yh4Var2, j14Var2.a.size());
                Iterator it = yh4Var2.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        e14 a2 = this.g.a(yh4Var2.b, (String) it.next());
                        if (a2 == null || !a2.a(hi4Var, yh4Var2)) {
                        }
                    } else {
                        this.i.b(yh4Var2, 0L, oj4.d(1, null, null), false);
                        break;
                    }
                }
            }
        }
        this.b.Q0(new v63(hi4Var, this.d, this.c), this.e);
        int i3 = 0;
        for (final yh4 yh4Var3 : (List) hi4Var.b.P) {
            Iterator it2 = yh4Var3.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str3 = (String) it2.next();
                final e14 a3 = this.g.a(yh4Var3.b, str3);
                if (a3 != null && a3.a(hi4Var, yh4Var3)) {
                    jl4 b = this.a.b(a, ml4.RENDER_CONFIG_WATERFALL);
                    kl4 kl4Var = b.f;
                    a = new jl4(kl4Var, b.a, "render-config-" + i3 + "-" + str3, b.c, b.d, zw4.B(b.e, Throwable.class, new ky4() { // from class: m44
                        @Override // defpackage.ky4
                        public final dz4 e(Object obj2) {
                            n44 n44Var = n44.this;
                            yh4 yh4Var4 = yh4Var3;
                            hi4 hi4Var2 = hi4Var;
                            e14 e14Var = a3;
                            Throwable th = (Throwable) obj2;
                            hm4 t = eb1.t(n44Var.j, 12);
                            t.P(yh4Var4.E);
                            t.f();
                            i44 i44Var = n44Var.h;
                            dz4 G = zw4.G(e14Var.b(hi4Var2, yh4Var4), yh4Var4.R, TimeUnit.MILLISECONDS, n44Var.f);
                            bn4 bn4Var = n44Var.c;
                            i44Var.getClass();
                            ci4 ci4Var2 = (ci4) hi4Var2.b.Q;
                            long b2 = i44Var.a.b();
                            String str4 = yh4Var4.w;
                            if (str4 != null) {
                                zw4.J(G, new h44(i44Var, b2, str4, yh4Var4, ci4Var2, bn4Var, hi4Var2), zw2.f);
                            }
                            pm4.c(G, n44Var.k, t, false);
                            return G;
                        }
                    }, kl4Var.a)).a();
                    break;
                }
            }
            i3++;
        }
        return a;
    }
}