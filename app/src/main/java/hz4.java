package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: hz4  reason: default package */
public final class hz4 extends vy4 implements ScheduledFuture {
    public final dz4 Q;
    public final ScheduledFuture R;

    public hz4(vx4 vx4Var, ScheduledFuture scheduledFuture) {
        this.Q = vx4Var;
        this.R = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.Q.cancel(z);
        if (cancel) {
            this.R.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.R.compareTo(delayed);
    }

    @Override // defpackage.fy4
    public final /* synthetic */ Object f() {
        return this.Q;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.R.getDelay(timeUnit);
    }
}