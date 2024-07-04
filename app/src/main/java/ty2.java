package defpackage;

import android.os.RemoteException;

/* renamed from: ty2  reason: default package */
public final /* synthetic */ class ty2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ ty2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                rx2 rx2Var = ((wy2) this.Q).U;
                if (rx2Var != null) {
                    ((vx2) rx2Var).f();
                    return;
                }
                return;
            case 1:
                m83 m83Var = (m83) this.Q;
                ge2 ge2Var = m83Var.n.d;
                if (ge2Var != null) {
                    try {
                        ge2Var.G2((pq2) m83Var.p.c(), new va0(m83Var.i));
                        return;
                    } catch (RemoteException e) {
                        sv2.e("RemoteException when notifyAdLoad is called", e);
                        return;
                    }
                }
                return;
            default:
                ((t64) this.Q).k();
                return;
        }
    }
}