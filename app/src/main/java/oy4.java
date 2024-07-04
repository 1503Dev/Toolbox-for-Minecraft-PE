package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* renamed from: oy4  reason: default package */
public final class oy4 extends ey4 {
    @CheckForNull
    public ny4 e0;

    public oy4(nv4 nv4Var, boolean z, Executor executor, Callable callable) {
        super(nv4Var, z, false);
        this.e0 = new ny4(this, callable, executor);
        w();
    }

    @Override // defpackage.vx4
    public final void l() {
        ny4 ny4Var = this.e0;
        if (ny4Var != null) {
            ny4Var.h();
        }
    }

    @Override // defpackage.ey4
    public final void u(int i, @CheckForNull Object obj) {
    }

    @Override // defpackage.ey4
    public final void v() {
        ny4 ny4Var = this.e0;
        if (ny4Var != null) {
            try {
                ny4Var.R.execute(ny4Var);
            } catch (RejectedExecutionException e) {
                ny4Var.S.i(e);
            }
        }
    }

    @Override // defpackage.ey4
    public final void x(int i) {
        this.a0 = null;
        if (i == 1) {
            this.e0 = null;
        }
    }
}