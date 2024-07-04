package defpackage;

import android.os.Binder;

/* renamed from: rh2  reason: default package */
public final class rh2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ rh2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                uh2 uh2Var = (uh2) this.Q;
                if (uh2Var.a != null) {
                    uh2Var.a.p();
                    Binder.flushPendingCommands();
                    return;
                }
                return;
            case 1:
                int i = vx2.k0;
                ((vx2) this.Q).c("surfaceDestroyed", new String[0]);
                return;
            case 2:
                ((lx3) this.Q).a();
                return;
            default:
                ((hh4) this.Q).d.p(oj4.d(6, null, null));
                return;
        }
    }
}