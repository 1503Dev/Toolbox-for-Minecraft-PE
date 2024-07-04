package defpackage;

import android.os.RemoteException;

/* renamed from: cx1  reason: default package */
public final /* synthetic */ class cx1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ cx1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                az1 az1Var = (az1) this.Q;
                az1Var.c.P = 0;
                az1Var.c.U = null;
                az1Var.a(qa2.j);
                return;
            case 1:
                h9 h9Var = (h9) this.Q;
                try {
                    c04 c04Var = h9Var.P;
                    c04Var.getClass();
                    try {
                        pq2 pq2Var = c04Var.i;
                        if (pq2Var != null) {
                            pq2Var.M1();
                        }
                    } catch (RemoteException e) {
                        sv2.i("#007 Could not call remote method.", e);
                    }
                    return;
                } catch (IllegalStateException e2) {
                    ip2.a(h9Var.getContext()).d("BaseAdView.pause", e2);
                    return;
                }
            case 2:
                ((ui2) this.Q).d();
                return;
            case 3:
                a73 a73Var = (a73) this.Q;
                a73Var.Q.execute(new qz3(4, a73Var));
                return;
            case 4:
                ((oa3) this.Q).d = false;
                return;
            default:
                ((y03) this.Q).destroy();
                return;
        }
    }
}