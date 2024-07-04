package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: x84  reason: default package */
public final class x84 implements nc4 {
    public final yu2 a;
    public et5 b;
    public final ScheduledExecutorService c;
    public final ez4 d;
    public final Context e;

    public x84(Context context, yu2 yu2Var, ScheduledExecutorService scheduledExecutorService, yw2 yw2Var) {
        if (!((Boolean) w82.d.c.a(x92.j2)).booleanValue()) {
            this.b = new et5(context);
        }
        this.e = context;
        this.a = yu2Var;
        this.c = scheduledExecutorService;
        this.d = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 11;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        yv0<z6> a;
        l92 l92Var = x92.f2;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (!((Boolean) w82Var.c.a(x92.k2)).booleanValue()) {
                if (!((Boolean) w82Var.c.a(x92.g2)).booleanValue()) {
                    return zw4.E(ir4.a(this.b.a()), new at4() { // from class: u84
                        @Override // defpackage.at4
                        public final Object apply(Object obj) {
                            z6 z6Var = (z6) obj;
                            return new y84(z6Var.a, z6Var.b);
                        }
                    }, zw2.f);
                }
                if (((Boolean) w82Var.c.a(x92.j2)).booleanValue()) {
                    pj4.a(this.e, false);
                    synchronized (pj4.c) {
                        a = pj4.a;
                    }
                } else {
                    a = this.b.a();
                }
                if (a == null) {
                    return zw4.C(new y84(null, -1));
                }
                dz4 F = zw4.F(ir4.a(a), new ky4() { // from class: v84
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj) {
                        z6 z6Var = (z6) obj;
                        if (z6Var == null) {
                            return zw4.C(new y84(null, -1));
                        }
                        return zw4.C(new y84(z6Var.a, z6Var.b));
                    }
                }, zw2.f);
                if (((Boolean) w82Var.c.a(x92.h2)).booleanValue()) {
                    F = zw4.G(F, ((Long) w82Var.c.a(x92.i2)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return zw4.z(F, Exception.class, new w84(this, 0), this.d);
            }
        }
        return zw4.C(new y84(null, -1));
    }
}