package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: u73  reason: default package */
public final class u73 implements e32 {
    public final ScheduledExecutorService a;
    public final kd b;
    public ScheduledFuture c;
    public long d = -1;
    public long e = -1;
    public Runnable f = null;
    public boolean g = false;

    public u73(ScheduledExecutorService scheduledExecutorService, dk dkVar) {
        this.a = scheduledExecutorService;
        this.b = dkVar;
        jv5.A.f.b(this);
    }

    @Override // defpackage.e32
    public final void d(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                if (this.g) {
                    if (this.e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                        this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
                    }
                    this.g = false;
                }
            }
            return;
        }
        synchronized (this) {
            if (!this.g) {
                ScheduledFuture scheduledFuture2 = this.c;
                if (scheduledFuture2 != null && !scheduledFuture2.isDone()) {
                    this.c.cancel(true);
                    this.e = this.d - this.b.b();
                } else {
                    this.e = -1L;
                }
                this.g = true;
            }
        }
    }
}