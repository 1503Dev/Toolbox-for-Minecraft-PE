package defpackage;

import defpackage.ag1;
import defpackage.eg1;

/* renamed from: bg1  reason: default package */
public final class bg1 implements Runnable {
    public final /* synthetic */ eg1.b P;
    public final /* synthetic */ ag1 Q;

    public bg1(ag1 ag1Var, eg1.b bVar) {
        this.Q = ag1Var;
        this.P = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        this.Q.c = null;
        if (!ga1.j()) {
            return;
        }
        ad1 h = ga1.h();
        if (this.P.a() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && h.D.a) {
            h.h();
            StringBuilder sb = new StringBuilder();
            sb.append("Controller heartbeat timeout occurred. ");
            StringBuilder b = e5.b("Timeout set to: ");
            b.append(this.P.a);
            b.append(" ms. ");
            sb.append(b.toString());
            sb.append("Interval set to: " + h.T + " ms. ");
            sb.append("Heartbeat last reply: ");
            ag1.b bVar = this.Q.d;
            if (bVar != null) {
                str = bVar.toString();
            } else {
                str = "null";
            }
            sb.append(str);
            t1.b(0, 0, sb.toString(), true);
        } else if (!h.C) {
            eg1.e(h.T, this.Q.b);
            return;
        }
        this.Q.a();
    }
}