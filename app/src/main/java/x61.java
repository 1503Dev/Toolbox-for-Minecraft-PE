package defpackage;

import androidx.work.impl.WorkDatabase;

/* renamed from: x61  reason: default package */
public final class x61 implements er {
    public final bw0 a;
    public final dr b;
    public final m71 c;

    static {
        y20.e("WMFgUpdater");
    }

    public x61(WorkDatabase workDatabase, dr drVar, bw0 bw0Var) {
        this.b = drVar;
        this.a = bw0Var;
        this.c = workDatabase.n();
    }
}