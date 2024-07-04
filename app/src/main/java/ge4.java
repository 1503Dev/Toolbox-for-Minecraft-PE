package defpackage;

import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ge4  reason: default package */
public final class ge4 implements nc4 {
    public final ScheduledExecutorService a;

    public ge4(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 49;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.E(zw4.G(zw4.C(new Bundle()), ((Long) w82.d.c.a(x92.t3)).longValue(), TimeUnit.MILLISECONDS, this.a), new at4() { // from class: fe4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                return new ke4((Bundle) obj);
            }
        }, zw2.a);
    }
}