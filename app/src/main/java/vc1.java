package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: vc1  reason: default package */
public final class vc1 implements Runnable {
    public final /* synthetic */ tc1 P;

    public vc1(tc1 tc1Var) {
        this.P = tc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc1 tc1Var;
        ScheduledFuture<?> scheduledFuture;
        ga1.k();
        if (!this.P.f() && (scheduledFuture = (tc1Var = this.P).i) != null) {
            if (!scheduledFuture.isCancelled()) {
                tc1Var.i.cancel(false);
            }
            tc1Var.i = null;
        }
    }
}