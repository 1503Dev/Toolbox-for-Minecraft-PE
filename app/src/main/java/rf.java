package defpackage;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* renamed from: rf  reason: default package */
public final class rf implements Runnable {
    public final /* synthetic */ i20 P;
    public final /* synthetic */ ConstraintTrackingWorker Q;

    public rf(ConstraintTrackingWorker constraintTrackingWorker, i20 i20Var) {
        this.Q = constraintTrackingWorker;
        this.P = i20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.Q.V) {
            if (this.Q.W) {
                this.Q.X.j(new ListenableWorker.a.b());
            } else {
                this.Q.X.l(this.P);
            }
        }
    }
}