package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: yb  reason: default package */
public final class yb extends ac {
    public final /* synthetic */ a71 Q;
    public final /* synthetic */ String R = "offline_ping_sender_work";

    public yb(a71 a71Var) {
        this.Q = a71Var;
    }

    @Override // defpackage.ac
    public final void c() {
        WorkDatabase workDatabase = this.Q.h;
        workDatabase.c();
        try {
            Iterator it = ((n71) workDatabase.n()).h(this.R).iterator();
            while (it.hasNext()) {
                ac.b(this.Q, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            a71 a71Var = this.Q;
            nn0.a(a71Var.g, a71Var.h, a71Var.j);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}