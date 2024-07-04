package defpackage;

import android.os.RemoteException;
import java.util.LinkedHashMap;

/* renamed from: qz3  reason: default package */
public final /* synthetic */ class qz3 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ qz3(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ca2 ca2Var;
        switch (this.P) {
            case 0:
                h9 h9Var = (h9) this.Q;
                try {
                    c04 c04Var = h9Var.P;
                    c04Var.getClass();
                    try {
                        pq2 pq2Var = c04Var.i;
                        if (pq2Var != null) {
                            pq2Var.F();
                            return;
                        }
                        return;
                    } catch (RemoteException e) {
                        sv2.i("#007 Could not call remote method.", e);
                        return;
                    }
                } catch (IllegalStateException e2) {
                    ip2.a(h9Var.getContext()).d("BaseAdView.destroy", e2);
                    return;
                }
            case 1:
                rx2 rx2Var = ((qx2) this.Q).h0;
                if (rx2Var != null) {
                    ((vx2) rx2Var).d();
                    return;
                }
                return;
            case 2:
                rx2 rx2Var2 = ((wy2) this.Q).U;
                if (rx2Var2 != null) {
                    ((vx2) rx2Var2).g();
                    return;
                }
                return;
            case 3:
                String str = (String) this.Q;
                int i = g13.r0;
                yu2 yu2Var = jv5.A.g;
                synchronized (yu2Var.a) {
                    ca2Var = yu2Var.h;
                }
                if (!ca2Var.g.contains(str)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sdkVersion", ca2Var.f);
                    linkedHashMap.put("ue", str);
                    ca2Var.b(ca2Var.a(ca2Var.b, linkedHashMap), null);
                    return;
                }
                return;
            case 4:
                ((a73) this.Q).a();
                return;
            default:
                ((qh4) this.Q).d.p(oj4.d(6, null, null));
                return;
        }
    }
}