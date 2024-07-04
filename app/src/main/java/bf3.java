package defpackage;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bf3  reason: default package */
public final class bf3 extends xg3 {
    public final ScheduledExecutorService Q;
    public final kd R;
    public long S;
    public long T;
    public boolean U;
    public ScheduledFuture V;

    public bf3(ScheduledExecutorService scheduledExecutorService, kd kdVar) {
        super(Collections.emptySet());
        this.S = -1L;
        this.T = -1L;
        this.U = false;
        this.Q = scheduledExecutorService;
        this.R = kdVar;
    }

    public final synchronized void S0(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.U) {
            long j = this.T;
            if (j <= 0 || millis >= j) {
                millis = j;
            }
            this.T = millis;
            return;
        }
        long b = this.R.b();
        long j2 = this.S;
        if (b > j2 || j2 - this.R.b() > millis) {
            T0(millis);
        }
    }

    public final synchronized void T0(long j) {
        ScheduledFuture scheduledFuture = this.V;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.V.cancel(true);
        }
        this.S = this.R.b() + j;
        this.V = this.Q.schedule(new af3(this), j, TimeUnit.MILLISECONDS);
    }
}