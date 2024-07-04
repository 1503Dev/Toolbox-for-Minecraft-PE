package defpackage;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: df1  reason: default package */
public final class df1 implements Runnable {
    public final /* synthetic */ ff1 P;

    public df1(ff1 ff1Var) {
        this.P = ff1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ff1 ff1Var = this.P;
        ff1Var.b = null;
        ga1.h().n().d(0, 2, "AdColony session ending, releasing Context.", false);
        ga1.h().B = true;
        ga1.P = null;
        re1 re1Var = ff1Var.d;
        re1Var.h = true;
        re1Var.i = true;
        me1 me1Var = ga1.h().n().e;
        re1Var.e = false;
        re1Var.c = false;
        if (me1Var != null) {
            synchronized (me1Var) {
                me1Var.b.shutdown();
                try {
                    ScheduledExecutorService scheduledExecutorService = me1Var.b;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (!scheduledExecutorService.awaitTermination(1L, timeUnit)) {
                        me1Var.b.shutdownNow();
                        if (!me1Var.b.awaitTermination(1L, timeUnit)) {
                            System.err.println(me1.class.getSimpleName() + ": ScheduledExecutorService did not terminate");
                        }
                    }
                } catch (InterruptedException unused) {
                    me1Var.b.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
        ic1 ic1Var = new ic1();
        double uptimeMillis = SystemClock.uptimeMillis() - re1Var.b;
        Double.isNaN(uptimeMillis);
        Double.isNaN(uptimeMillis);
        Double.isNaN(uptimeMillis);
        Double.isNaN(uptimeMillis);
        Double.isNaN(uptimeMillis);
        Double.isNaN(uptimeMillis);
        eb1.g(ic1Var, "session_length", uptimeMillis / 1000.0d);
        new rc1(1, ic1Var, "SessionInfo.on_stop").b();
        ga1.k();
        w1.a.shutdown();
        if (ga1.h().o().f()) {
            ScheduledFuture<?> scheduledFuture = ff1Var.c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                ff1Var.c.cancel(false);
            }
            try {
                ff1Var.c = ff1Var.a.schedule(new ef1(ff1Var), 10L, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                StringBuilder b = e5.b("RejectedExecutionException when scheduling message pumping stop ");
                b.append(e.toString());
                t1.b(0, 0, b.toString(), true);
            }
        }
    }
}