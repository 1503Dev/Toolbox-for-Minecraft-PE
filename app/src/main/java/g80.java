package defpackage;

import defpackage.el0;
import defpackage.iy0;
import io.mrarm.mctoolbox.ui.d;
import java.util.Iterator;

/* renamed from: g80  reason: default package */
public final /* synthetic */ class g80 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ g80(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int l0;
        long Z;
        byte[] B0;
        ze K0;
        switch (this.P) {
            case 0:
                d dVar = (d) this.Q;
                iy0.a M = ((iy0) dVar.o).M();
                if (M != null) {
                    l0 = iy0.l0(M.a);
                    Z = iy0.Z(M.a, l0);
                    B0 = iy0.B0(new iy0.d(Z).a);
                    K0 = iy0.K0(B0);
                    h21.a(new r30(1, dVar, K0));
                    return;
                }
                return;
            default:
                el0.b bVar = (el0.b) this.Q;
                el0.this.d.remove(bVar.a);
                Iterator it = bVar.d.iterator();
                while (it.hasNext()) {
                    ((el0.a) it.next()).a();
                }
                return;
        }
    }
}