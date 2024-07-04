package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: ck5  reason: default package */
public final class ck5<TResult> implements es5<TResult> {
    public final Executor P;
    public final Object Q = new Object();
    @GuardedBy("mLock")
    @Nullable
    public ri4 R;

    public ck5(iv5 iv5Var, ri4 ri4Var) {
        this.P = iv5Var;
        this.R = ri4Var;
    }

    @Override // defpackage.es5
    public final void a(yv0<TResult> yv0Var) {
        if (yv0Var.j()) {
            synchronized (this.Q) {
                if (this.R == null) {
                    return;
                }
                this.P.execute(new a25(this));
            }
        }
    }
}