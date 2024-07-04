package defpackage;

import android.app.Activity;
import defpackage.dz;
import defpackage.zv;
import io.mrarm.mctoolbox.RelaunchActivity;

/* renamed from: mk0  reason: default package */
public final /* synthetic */ class mk0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ mk0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                RelaunchActivity relaunchActivity = (RelaunchActivity) this.Q;
                relaunchActivity.Q = true;
                if (relaunchActivity.R) {
                    RelaunchActivity.b(relaunchActivity);
                    return;
                }
                return;
            default:
                ny0 ny0Var = (ny0) this.Q;
                final Activity activity = ny0Var.a;
                final zv zvVar = ny0Var.c;
                final az0 az0Var = ny0Var.h;
                int i = hz.d;
                final yd ydVar = new yd(zvVar);
                ((iy0) zvVar).I0(new Runnable() { // from class: ez
                    @Override // java.lang.Runnable
                    public final void run() {
                        zv zvVar2 = zvVar;
                        final Activity activity2 = activity;
                        final dz.b bVar = ydVar;
                        final az0 az0Var2 = az0Var;
                        final iy0 iy0Var = (iy0) zvVar2;
                        final zv.b[] I = iy0Var.I();
                        h21.a(new Runnable() { // from class: fz
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity3 = activity2;
                                hz hzVar = new hz(activity3, iy0Var, I, bVar, az0Var2);
                                hzVar.showAtLocation(activity3.getWindow().getDecorView(), 119, 0, 0);
                                hzVar.c.getContentView().setVisibility(8);
                            }
                        });
                    }
                });
                return;
        }
    }
}