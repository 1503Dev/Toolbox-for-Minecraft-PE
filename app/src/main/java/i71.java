package defpackage;

import androidx.work.b;
import java.util.UUID;

/* renamed from: i71  reason: default package */
public final class i71 implements Runnable {
    public final /* synthetic */ UUID P;
    public final /* synthetic */ b Q;
    public final /* synthetic */ yq0 R;
    public final /* synthetic */ j71 S;

    public i71(j71 j71Var, UUID uuid, b bVar, yq0 yq0Var) {
        this.S = j71Var;
        this.P = uuid;
        this.Q = bVar;
        this.R = yq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l71 i;
        String uuid = this.P.toString();
        y20 c = y20.c();
        String str = j71.c;
        c.a(str, String.format("Updating progress for %s (%s)", this.P, this.Q), new Throwable[0]);
        this.S.a.c();
        try {
            i = ((n71) this.S.a.n()).i(uuid);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (i != null) {
            if (i.b == y61.RUNNING) {
                f71 f71Var = new f71(uuid, this.Q);
                h71 h71Var = (h71) this.S.a.m();
                h71Var.a.b();
                h71Var.a.c();
                h71Var.b.e(f71Var);
                h71Var.a.h();
                h71Var.a.f();
            } else {
                y20.c().f(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.R.j(null);
            this.S.a.h();
            return;
        }
        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}