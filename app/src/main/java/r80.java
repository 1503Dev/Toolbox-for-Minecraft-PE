package defpackage;

import defpackage.iy0;
import defpackage.zv;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: r80  reason: default package */
public final /* synthetic */ class r80 implements Runnable {
    public final /* synthetic */ d P;
    public final /* synthetic */ zv.a Q;
    public final /* synthetic */ tv0 R;

    public /* synthetic */ r80(d dVar, iy0.a aVar, ze zeVar) {
        this.P = dVar;
        this.Q = aVar;
        this.R = zeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        d dVar = this.P;
        zv.a aVar = this.Q;
        tv0 tv0Var = this.R;
        dVar.t = false;
        if (aVar != null) {
            j = iy0.W(((iy0.a) aVar).a);
        } else {
            j = 0;
        }
        dVar.u = j;
        if (dVar.r.Q == 1) {
            dVar.j(tv0Var);
        }
    }
}