package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: fz4  reason: default package */
public final class fz4 implements Executor {
    public final /* synthetic */ Executor P;
    public final /* synthetic */ vx4 Q;

    public fz4(Executor executor, ry4 ry4Var) {
        this.P = executor;
        this.Q = ry4Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.P.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.Q.i(e);
        }
    }
}