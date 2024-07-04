package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u93  reason: default package */
public final class u93 implements le3, s22 {
    public final yh4 P;
    public final zd3 Q;
    public final ue3 R;
    public final AtomicBoolean S = new AtomicBoolean();
    public final AtomicBoolean T = new AtomicBoolean();

    public u93(yh4 yh4Var, zd3 zd3Var, ue3 ue3Var) {
        this.P = yh4Var;
        this.Q = zd3Var;
        this.R = ue3Var;
    }

    @Override // defpackage.s22
    public final void h0(r22 r22Var) {
        if (this.P.e == 1 && r22Var.j && this.S.compareAndSet(false, true)) {
            this.Q.a();
        }
        if (r22Var.j && this.T.compareAndSet(false, true)) {
            ue3 ue3Var = this.R;
            synchronized (ue3Var) {
                ue3Var.R0(p5.P);
            }
        }
    }

    @Override // defpackage.le3
    public final synchronized void k() {
        if (this.P.e != 1) {
            if (this.S.compareAndSet(false, true)) {
                this.Q.a();
            }
        }
    }
}