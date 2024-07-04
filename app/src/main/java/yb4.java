package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: yb4  reason: default package */
public final class yb4 implements nc4 {
    public final String a;
    public final ez4 b;
    public final ScheduledExecutorService c;
    public final Context d;
    public final li4 e;
    public final q23 f;

    public yb4(yw2 yw2Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, li4 li4Var, q23 q23Var) {
        this.b = yw2Var;
        this.c = scheduledExecutorService;
        this.a = str;
        this.d = context;
        this.e = li4Var;
        this.f = q23Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 33;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        if (((Boolean) w82.d.c.a(x92.b6)).booleanValue() && !"adUnitId".equals(this.e.f)) {
            return zw4.D(new ez1(2, this), this.b);
        }
        return this.b.b(new Callable() { // from class: vb4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new sa4(1, null);
            }
        });
    }
}