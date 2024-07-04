package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: zb  reason: default package */
public final class zb extends ac {
    public final /* synthetic */ a71 Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ boolean S = false;

    public zb(a71 a71Var, String str) {
        this.Q = a71Var;
        this.R = str;
    }

    @Override // defpackage.ac
    public final void c() {
        WorkDatabase workDatabase = this.Q.h;
        workDatabase.c();
        try {
            Iterator it = ((n71) workDatabase.n()).g(this.R).iterator();
            while (it.hasNext()) {
                ac.b(this.Q, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.S) {
                a71 a71Var = this.Q;
                nn0.a(a71Var.g, a71Var.h, a71Var.j);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}