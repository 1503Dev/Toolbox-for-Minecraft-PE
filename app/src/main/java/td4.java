package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: td4  reason: default package */
public final class td4 implements nc4 {
    public final yu2 a;
    public final ScheduledExecutorService b;
    public final Executor c;

    public td4(yu2 yu2Var, ScheduledExecutorService scheduledExecutorService, yw2 yw2Var) {
        this.a = yu2Var;
        this.b = scheduledExecutorService;
        this.c = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 44;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.z((sy4) zw4.G(zw4.E(sy4.r(zw4.D(new bo5(5, this), this.c)), new at4() { // from class: sd4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new j84(2, str);
            }
        }, this.c), ((Long) w82.d.c.a(x92.H0)).longValue(), TimeUnit.MILLISECONDS, this.b), Exception.class, new pg4(2, this), py4.P);
    }
}