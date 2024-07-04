package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: od4  reason: default package */
public final class od4 implements nc4 {
    public final yu2 a;
    public final ScheduledExecutorService b;
    public final ez4 c;

    public od4(yu2 yu2Var, ScheduledExecutorService scheduledExecutorService, yw2 yw2Var) {
        this.a = yu2Var;
        this.b = scheduledExecutorService;
        this.c = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 43;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        l92 l92Var = x92.f2;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (((Boolean) w82Var.c.a(x92.k2)).booleanValue()) {
                ay5 ay5Var = new ay5();
                ay5Var.n(null);
                dz4 F = zw4.F(ir4.a(ay5Var), new ky4() { // from class: md4
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj) {
                        z6 z6Var = (z6) obj;
                        if (z6Var == null) {
                            return zw4.C(new pd4(null, -1));
                        }
                        return zw4.C(new pd4(z6Var.a, z6Var.b));
                    }
                }, this.c);
                if (((Boolean) bb2.a.d()).booleanValue()) {
                    F = zw4.G(F, ((Long) bb2.b.d()).longValue(), TimeUnit.MILLISECONDS, this.b);
                }
                return zw4.z(F, Exception.class, new at4() { // from class: nd4
                    @Override // defpackage.at4
                    public final Object apply(Object obj) {
                        od4.this.a.f("AppSetIdInfoGmscoreSignal", (Exception) obj);
                        return new pd4(null, -1);
                    }
                }, this.c);
            }
        }
        return zw4.C(new pd4(null, -1));
    }
}