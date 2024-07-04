package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: xn5  reason: default package */
public final class xn5<TResult> implements es5<TResult> {
    public final Executor P;
    public final Object Q = new Object();
    @GuardedBy("mLock")
    @Nullable
    public bc0 R;

    public xn5(Executor executor, bc0 bc0Var) {
        this.P = executor;
        this.R = bc0Var;
    }

    @Override // defpackage.es5
    public final void a(yv0<TResult> yv0Var) {
        if (yv0Var.l() || yv0Var.j()) {
            return;
        }
        synchronized (this.Q) {
            if (this.R == null) {
                return;
            }
            this.P.execute(new w06(this, yv0Var));
        }
    }
}