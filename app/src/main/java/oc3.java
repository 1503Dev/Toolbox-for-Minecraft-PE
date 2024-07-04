package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: oc3  reason: default package */
public final class oc3 implements nd3, bi3, uf3, yd3, s22 {
    public final zd3 P;
    public final yh4 Q;
    public final ScheduledExecutorService R;
    public final Executor S;
    public ScheduledFuture U;
    public final lz4 T = new lz4();
    public final AtomicBoolean V = new AtomicBoolean();

    public oc3(zd3 zd3Var, yh4 yh4Var, ScheduledExecutorService scheduledExecutorService, yw2 yw2Var) {
        this.P = zd3Var;
        this.Q = yh4Var;
        this.R = scheduledExecutorService;
        this.S = yw2Var;
    }

    @Override // defpackage.nd3
    public final void K() {
        int i = this.Q.Y;
        if (i == 0 || i == 1) {
            if (!((Boolean) w82.d.c.a(x92.Q8)).booleanValue()) {
                this.P.a();
            }
        }
    }

    @Override // defpackage.uf3
    public final synchronized void b() {
        if (this.T.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.U;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.T.h(Boolean.TRUE);
    }

    @Override // defpackage.bi3
    public final void e() {
        boolean z;
        if (((Boolean) w82.d.c.a(x92.g1)).booleanValue()) {
            yh4 yh4Var = this.Q;
            if (yh4Var.Y == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (yh4Var.q == 0) {
                    this.P.a();
                    return;
                }
                zw4.J(this.T, new ee4(1, this), this.S);
                this.U = this.R.schedule(new qy2(2, this), this.Q.q, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // defpackage.yd3
    public final synchronized void g0(tz3 tz3Var) {
        if (this.T.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.U;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.T.i(new Exception());
    }

    @Override // defpackage.bi3
    public final void h() {
    }

    @Override // defpackage.s22
    public final void h0(r22 r22Var) {
        boolean z;
        if (((Boolean) w82.d.c.a(x92.Q8)).booleanValue()) {
            if (this.Q.Y == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z && r22Var.j && this.V.compareAndSet(false, true)) {
                vz3.k("Full screen 1px impression occurred");
                this.P.a();
            }
        }
    }

    @Override // defpackage.uf3
    public final void i() {
        boolean z;
        if (((Boolean) w82.d.c.a(x92.Q8)).booleanValue()) {
            if (this.Q.Y == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.P.a();
            }
        }
    }

    @Override // defpackage.nd3
    public final void j() {
    }

    @Override // defpackage.nd3
    public final void l(cr2 cr2Var, String str, String str2) {
    }

    @Override // defpackage.nd3
    public final void m() {
    }

    @Override // defpackage.nd3
    public final void o() {
    }

    @Override // defpackage.nd3
    public final void q() {
    }
}