package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: wd3  reason: default package */
public final class wd3 extends xg3 implements rd3 {
    public final ScheduledExecutorService Q;
    public ScheduledFuture R;
    public boolean S;

    public wd3(vd3 vd3Var, Set set, yw2 yw2Var, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.S = false;
        this.Q = scheduledExecutorService;
        Q0(vd3Var, yw2Var);
    }

    @Override // defpackage.rd3
    public final void H0(vj3 vj3Var) {
        if (this.S) {
            return;
        }
        ScheduledFuture scheduledFuture = this.R;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        R0(new wv1(1, vj3Var));
    }

    @Override // defpackage.rd3
    public final void c() {
        R0(new wg3() { // from class: td3
            @Override // defpackage.wg3
            /* renamed from: e */
            public final void mo0e(Object obj) {
                ((rd3) obj).c();
            }
        });
    }

    public final void e() {
        this.R = this.Q.schedule(new Runnable() { // from class: sd3
            @Override // java.lang.Runnable
            public final void run() {
                wd3 wd3Var = wd3.this;
                synchronized (wd3Var) {
                    sv2.d("Timeout waiting for show call succeed to be called.");
                    wd3Var.H0(new vj3("Timeout for show call succeed."));
                    wd3Var.S = true;
                }
            }
        }, ((Integer) w82.d.c.a(x92.q8)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.rd3
    public final void p(tz3 tz3Var) {
        R0(new ij2(1, tz3Var));
    }
}