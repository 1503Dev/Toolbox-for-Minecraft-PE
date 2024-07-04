package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* renamed from: mz4  reason: default package */
public final class mz4 implements Runnable {
    @CheckForNull
    public oz4 P;

    public mz4(oz4 oz4Var) {
        this.P = oz4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4 dz4Var;
        oz4 oz4Var = this.P;
        if (oz4Var == null || (dz4Var = oz4Var.W) == null) {
            return;
        }
        this.P = null;
        if (dz4Var.isDone()) {
            oz4Var.n(dz4Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = oz4Var.X;
            oz4Var.X = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                if (abs > 10) {
                    str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                }
            }
            oz4Var.i(new nz4(str + ": " + dz4Var.toString()));
        } finally {
            dz4Var.cancel(true);
        }
    }
}