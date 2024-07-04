package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: xb  reason: default package */
public final class xb extends ac {
    public final /* synthetic */ a71 Q;
    public final /* synthetic */ UUID R;

    public xb(a71 a71Var, UUID uuid) {
        this.Q = a71Var;
        this.R = uuid;
    }

    @Override // defpackage.ac
    public final void c() {
        WorkDatabase workDatabase = this.Q.h;
        workDatabase.c();
        try {
            ac.b(this.Q, this.R.toString());
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