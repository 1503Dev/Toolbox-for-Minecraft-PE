package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: cp5  reason: default package */
public final class cp5<TResult> implements es5<TResult> {
    public final Executor P;
    public final Object Q = new Object();
    @GuardedBy("mLock")
    @Nullable
    public ic0<? super TResult> R;

    public cp5(iv5 iv5Var, ri4 ri4Var) {
        this.P = iv5Var;
        this.R = ri4Var;
    }

    @Override // defpackage.es5
    public final void a(yv0<TResult> yv0Var) {
        if (yv0Var.l()) {
            synchronized (this.Q) {
                if (this.R == null) {
                    return;
                }
                this.P.execute(new qh1(8, this, yv0Var));
            }
        }
    }
}