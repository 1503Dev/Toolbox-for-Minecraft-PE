package defpackage;

import android.os.Handler;
import defpackage.iy0;
import defpackage.me;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: je  reason: default package */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ je(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        iy0.a aVar;
        byte[] z0;
        long m0;
        int i;
        switch (this.P) {
            case 0:
                me meVar = (me) this.Q;
                if (meVar.i == me.b.Repeat && meVar.m.Q) {
                    meVar.a();
                    Handler handler = meVar.a;
                    je jeVar = meVar.n;
                    int i2 = meVar.j;
                    if (i2 < 0) {
                        i = 1000 / (-i2);
                    } else {
                        i = i2 * 1000;
                    }
                    handler.postDelayed(jeVar, i);
                    return;
                }
                return;
            default:
                d dVar = (d) this.Q;
                if (dVar.t) {
                    dVar.g(dVar.v, dVar.w, dVar.x);
                    return;
                }
                long j = dVar.u;
                ze zeVar = null;
                if (j != 0) {
                    ((iy0) dVar.o).a.getClass();
                    m0 = iy0.m0(j);
                    if (m0 != 0) {
                        aVar = new iy0.a(m0);
                        if (aVar != null) {
                            z0 = iy0.z0(aVar.a);
                            zeVar = iy0.K0(z0);
                        }
                        h21.a(new r80(dVar, aVar, zeVar));
                        return;
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
                h21.a(new r80(dVar, aVar, zeVar));
                return;
        }
    }
}