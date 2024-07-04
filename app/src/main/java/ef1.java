package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: ef1  reason: default package */
public final class ef1 implements Runnable {
    public final /* synthetic */ ff1 P;

    public ef1(ff1 ff1Var) {
        this.P = ff1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.P.d.i) {
            tc1 o = ga1.h().o();
            ScheduledFuture<?> scheduledFuture = o.i;
            if (scheduledFuture != null) {
                if (!scheduledFuture.isCancelled()) {
                    o.i.cancel(false);
                }
                o.i = null;
            }
            this.P.c = null;
        }
    }
}