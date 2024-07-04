package defpackage;

import androidx.work.impl.WorkDatabase;

/* renamed from: zt0  reason: default package */
public final class zt0 implements Runnable {
    public static final String S = y20.e("StopWorkRunnable");
    public final a71 P;
    public final String Q;
    public final boolean R;

    public zt0(a71 a71Var, String str, boolean z) {
        this.P = a71Var;
        this.Q = str;
        this.R = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean i;
        a71 a71Var = this.P;
        WorkDatabase workDatabase = a71Var.h;
        eg0 eg0Var = a71Var.k;
        m71 n = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.Q;
            synchronized (eg0Var.Z) {
                containsKey = eg0Var.U.containsKey(str);
            }
            if (this.R) {
                i = this.P.k.h(this.Q);
            } else {
                if (!containsKey) {
                    n71 n71Var = (n71) n;
                    if (n71Var.f(this.Q) == y61.RUNNING) {
                        n71Var.p(y61.ENQUEUED, this.Q);
                    }
                }
                i = this.P.k.i(this.Q);
            }
            y20.c().a(S, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.Q, Boolean.valueOf(i)), new Throwable[0]);
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}