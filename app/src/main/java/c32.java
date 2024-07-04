package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: c32  reason: default package */
public final class c32 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ c32(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                synchronized (((d32) this.Q).R) {
                    d32 d32Var = (d32) this.Q;
                    if (d32Var.S && d32Var.T) {
                        d32Var.S = false;
                        sv2.b("App went background");
                        Iterator it = ((d32) this.Q).U.iterator();
                        while (it.hasNext()) {
                            try {
                                ((e32) it.next()).d(false);
                            } catch (Exception e) {
                                sv2.e("", e);
                            }
                        }
                    } else {
                        sv2.b("App is still foreground");
                    }
                }
                return;
            case 1:
                rx2 rx2Var = ((qx2) this.Q).h0;
                if (rx2Var != null) {
                    vx2 vx2Var = (vx2) rx2Var;
                    iy2 iy2Var = vx2Var.T;
                    iy2Var.Q = false;
                    wi4 wi4Var = cu5.i;
                    wi4Var.removeCallbacks(iy2Var);
                    wi4Var.postDelayed(iy2Var, 250L);
                    wi4Var.post(new gh4(1, vx2Var));
                    return;
                }
                return;
            case 2:
                ((mh4) this.Q).k();
                return;
            default:
                Map map = mw5.y0;
                ((mw5) this.Q).v();
                return;
        }
    }
}