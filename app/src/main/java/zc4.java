package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zc4  reason: default package */
public final class zc4 implements nc4 {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final boolean d;
    public final boolean e;
    public final pu2 f;

    public zc4(pu2 pu2Var, Context context, ScheduledExecutorService scheduledExecutorService, yw2 yw2Var, int i, boolean z, boolean z2) {
        this.f = pu2Var;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = yw2Var;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 40;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        boolean z;
        l92 l92Var = x92.G0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            pu2 pu2Var = this.f;
            Context context = this.a;
            pu2Var.getClass();
            bx2 bx2Var = new bx2();
            mv2 mv2Var = n62.f.a;
            int c = jt.b.c(context, 12451000);
            if (c != 0 && c != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                zw2.a.execute(new ou2(context, bx2Var));
            }
            return zw4.z((sy4) zw4.G(zw4.E(sy4.r(bx2Var), new w84(this, 1), this.c), ((Long) w82Var.c.a(x92.H0)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new at4() { // from class: yc4
                @Override // defpackage.at4
                public final Object apply(Object obj) {
                    String string;
                    zc4 zc4Var = zc4.this;
                    Throwable th = (Throwable) obj;
                    zc4Var.getClass();
                    mv2 mv2Var2 = n62.f.a;
                    ContentResolver contentResolver = zc4Var.a.getContentResolver();
                    if (contentResolver == null) {
                        string = null;
                    } else {
                        string = Settings.Secure.getString(contentResolver, "android_id");
                    }
                    return new ad4(null, string, new cr4());
                }
            }, this.c);
        }
        return new yy4(new Exception("Did not ad Ad ID into query param."));
    }
}