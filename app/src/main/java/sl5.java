package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: sl5  reason: default package */
public final class sl5<TResult> implements es5<TResult> {
    public final Executor P;
    public final Object Q = new Object();
    @GuardedBy("mLock")
    @Nullable
    public yb0<TResult> R;

    public sl5(Executor executor, yb0<TResult> yb0Var) {
        this.P = executor;
        this.R = yb0Var;
    }

    @Override // defpackage.es5
    public final void a(yv0<TResult> yv0Var) {
        synchronized (this.Q) {
            if (this.R == null) {
                return;
            }
            this.P.execute(new nh1(this, yv0Var));
        }
    }
}