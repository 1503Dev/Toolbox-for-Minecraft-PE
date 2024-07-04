package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: k02  reason: default package */
public final class k02 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ l02 Q;

    public k02(l02 l02Var, int i) {
        this.Q = l02Var;
        this.P = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ey1 ey1Var;
        l02 l02Var = this.Q;
        if (this.P > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        ey1 ey1Var2 = null;
        try {
            PackageInfo packageInfo = l02Var.a.getPackageManager().getPackageInfo(l02Var.a.getPackageName(), 0);
            Context context = l02Var.a;
            try {
                ey1Var = (ey1) new gp4(context, context.getPackageName(), Integer.toString(packageInfo.versionCode)).d.poll(5000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused2) {
                ey1Var = null;
            }
            if (ey1Var == null) {
                ey1Var = gp4.a();
            }
            ey1Var2 = ey1Var;
        } catch (Throwable unused3) {
        }
        this.Q.j = ey1Var2;
        if (this.P < 4) {
            if (ey1Var2 == null || !ey1Var2.h0() || ey1Var2.w0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !ey1Var2.i0() || !ey1Var2.u0().z() || ey1Var2.u0().w() == -2) {
                l02 l02Var2 = this.Q;
                int i2 = this.P + 1;
                if (l02Var2.n) {
                    Future<?> submit = l02Var2.b.submit(new k02(l02Var2, i2));
                    if (i2 == 0) {
                        l02Var2.k = submit;
                    }
                }
            }
        }
    }
}