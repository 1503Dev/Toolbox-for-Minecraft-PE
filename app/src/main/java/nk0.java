package defpackage;

import android.app.Activity;
import defpackage.bf0;
import defpackage.iy0;
import defpackage.zv;
import io.mrarm.mctoolbox.RelaunchActivity;

/* renamed from: nk0  reason: default package */
public final /* synthetic */ class nk0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ nk0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                RelaunchActivity relaunchActivity = (RelaunchActivity) this.Q;
                relaunchActivity.R = true;
                if (relaunchActivity.Q) {
                    RelaunchActivity.b(relaunchActivity);
                    return;
                }
                return;
            case 1:
                ny0 ny0Var = (ny0) this.Q;
                Activity activity = ny0Var.a;
                final zv zvVar = ny0Var.c;
                int i = bf0.U;
                ((iy0) zvVar).I0(new pk0(1, zvVar, activity, new bf0.b() { // from class: ye0
                    @Override // defpackage.bf0.b
                    public final void a(zv.a aVar) {
                        float[] k0;
                        iy0.a M = ((iy0) zv.this).M();
                        k0 = iy0.k0(((iy0.a) aVar).a);
                        M.getClass();
                        iy0.H0(M.a, k0[0], k0[1], k0[2]);
                    }
                }));
                return;
            default:
                ((ry0) this.Q).invalidate();
                return;
        }
    }
}