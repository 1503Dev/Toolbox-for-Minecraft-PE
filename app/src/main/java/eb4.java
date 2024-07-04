package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: eb4  reason: default package */
public final class eb4 implements nc4 {
    public final nc4 a;
    public final long b;
    public final ScheduledExecutorService c;

    public eb4(nc4 nc4Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = nc4Var;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.nc4
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        dz4 c = this.a.c();
        long j = this.b;
        if (j > 0) {
            c = zw4.G(c, j, TimeUnit.MILLISECONDS, this.c);
        }
        return zw4.B(c, Throwable.class, new ky4() { // from class: db4
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                Throwable th = (Throwable) obj;
                return zw4.C(null);
            }
        }, zw2.f);
    }
}