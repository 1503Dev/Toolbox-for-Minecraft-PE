package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ue4  reason: default package */
public final class ue4 implements nc4 {
    public final yu2 a;
    public final boolean b;
    public final boolean c;
    public final ScheduledExecutorService d;
    public final ez4 e;

    public ue4(yu2 yu2Var, boolean z, boolean z2, yw2 yw2Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = yu2Var;
        this.b = z;
        this.c = z2;
        this.e = yw2Var;
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 50;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        if (((Boolean) w82.d.c.a(x92.e6)).booleanValue() && this.c) {
            return zw4.C(null);
        }
        if (!this.b) {
            return zw4.C(null);
        }
        return zw4.z(zw4.G(zw4.E(zw4.C(null), new at4() { // from class: te4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new y74(str, 1);
            }
        }, this.e), ((Long) bc2.a.d()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new oq1(1, this), this.e);
    }
}