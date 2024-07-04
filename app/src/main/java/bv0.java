package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;

/* renamed from: bv0  reason: default package */
public final class bv0 implements Runnable {
    public final /* synthetic */ WorkDatabase P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ a R;

    public bv0(a aVar, WorkDatabase workDatabase, String str) {
        this.R = aVar;
        this.P = workDatabase;
        this.Q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l71 i = ((n71) this.P.n()).i(this.Q);
        if (i == null || !i.b()) {
            return;
        }
        synchronized (this.R.S) {
            this.R.V.put(this.Q, i);
            this.R.W.add(i);
            a aVar = this.R;
            aVar.X.b(aVar.W);
        }
    }
}