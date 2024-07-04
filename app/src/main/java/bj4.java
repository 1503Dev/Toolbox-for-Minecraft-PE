package defpackage;

import android.os.RemoteException;

/* renamed from: bj4  reason: default package */
public final /* synthetic */ class bj4 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ bj4(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                h9 h9Var = (h9) this.Q;
                try {
                    c04 c04Var = h9Var.P;
                    c04Var.getClass();
                    try {
                        pq2 pq2Var = c04Var.i;
                        if (pq2Var != null) {
                            pq2Var.J();
                            return;
                        }
                        return;
                    } catch (RemoteException e) {
                        sv2.i("#007 Could not call remote method.", e);
                        return;
                    }
                } catch (IllegalStateException e2) {
                    ip2.a(h9Var.getContext()).d("BaseAdView.resume", e2);
                    return;
                }
            case 1:
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    vx2 vx2Var = (vx2) rx2Var;
                    vx2Var.R.setVisibility(4);
                    cu5.i.post(new ux2(vx2Var));
                    return;
                }
                return;
            default:
                g13 g13Var = (g13) this.Q;
                g13Var.P.u0();
                qn5 N = g13Var.P.N();
                if (N != null) {
                    N.a0.removeView(N.U);
                    N.v4(true);
                    return;
                }
                return;
        }
    }
}