package defpackage;

import android.os.RemoteException;
import java.util.Collections;

/* renamed from: gh4  reason: default package */
public final /* synthetic */ class gh4 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ gh4(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                di2 di2Var = ((lh4) this.Q).P;
                if (di2Var != null) {
                    try {
                        di2Var.l2(Collections.emptyList());
                        return;
                    } catch (RemoteException e) {
                        sv2.h("Could not notify onComplete event.", e);
                        return;
                    }
                }
                return;
            case 1:
                int i = vx2.k0;
                ((vx2) this.Q).c("surfaceCreated", new String[0]);
                return;
            case 2:
                o13.Q0((o13) this.Q);
                return;
            case 3:
                ((jx3) this.Q).a();
                return;
            default:
                ((uq3) this.Q).b();
                return;
        }
    }
}