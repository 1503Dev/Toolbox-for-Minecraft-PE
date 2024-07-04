package defpackage;

import android.os.RemoteException;

/* renamed from: dd4  reason: default package */
public final class dd4 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ dd4(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                gf2 gf2Var = ((je4) this.Q).P.P;
                if (gf2Var != null) {
                    try {
                        gf2Var.y(1);
                        return;
                    } catch (RemoteException e) {
                        sv2.h("Could not notify onAdFailedToLoad event.", e);
                        return;
                    }
                }
                return;
            case 1:
                synchronized (((kz1) this.Q).c0) {
                    if (!((kz1) this.Q).d0) {
                        ((kz1) this.Q).d0 = true;
                        try {
                            kz1.j((kz1) this.Q);
                        } catch (Exception e2) {
                            ((kz1) this.Q).U.c(2023, -1L, e2);
                        }
                        synchronized (((kz1) this.Q).c0) {
                            ((kz1) this.Q).d0 = false;
                        }
                        return;
                    }
                    return;
                }
            case 2:
                qx2 qx2Var = (qx2) this.Q;
                rx2 rx2Var = qx2Var.h0;
                if (rx2Var != null) {
                    if (!qx2Var.i0) {
                        vx2 vx2Var = (vx2) rx2Var;
                        vx2Var.R.setVisibility(4);
                        cu5.i.post(new ux2(vx2Var));
                        ((qx2) this.Q).i0 = true;
                    }
                    ((vx2) ((qx2) this.Q).h0).e();
                    return;
                }
                return;
            case 3:
                j73 j73Var = ((d73) this.Q).P.d;
                synchronized (j73Var) {
                    j73Var.h();
                    j73Var.X = true;
                }
                return;
            default:
                ((df4) this.Q).d.p(oj4.d(6, null, null));
                return;
        }
    }
}