package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* renamed from: oz4  reason: default package */
public final class oz4 extends ry4 {
    @CheckForNull
    public dz4 W;
    @CheckForNull
    public ScheduledFuture X;

    public oz4(dz4 dz4Var) {
        dz4Var.getClass();
        this.W = dz4Var;
    }

    @Override // defpackage.vx4
    @CheckForNull
    public final String f() {
        dz4 dz4Var = this.W;
        ScheduledFuture scheduledFuture = this.X;
        if (dz4Var != null) {
            String c = ij.c("inputFuture=[", dz4Var.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return c + ", remaining delay=[" + delay + " ms]";
                }
                return c;
            }
            return c;
        }
        return null;
    }

    @Override // defpackage.vx4
    public final void g() {
        m(this.W);
        ScheduledFuture scheduledFuture = this.X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.W = null;
        this.X = null;
    }
}