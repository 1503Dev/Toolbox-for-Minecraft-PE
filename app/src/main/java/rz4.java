package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* renamed from: rz4  reason: default package */
public final class rz4 extends ry4 implements RunnableFuture {
    @CheckForNull
    public volatile cz4 W;

    public rz4(Callable callable) {
        this.W = new qz4(this, callable);
    }

    public rz4(jy4 jy4Var) {
        this.W = new pz4(this, jy4Var);
    }

    @Override // defpackage.vx4
    @CheckForNull
    public final String f() {
        cz4 cz4Var = this.W;
        if (cz4Var != null) {
            return ij.c("task=[", cz4Var.toString(), "]");
        }
        return super.f();
    }

    @Override // defpackage.vx4
    public final void g() {
        boolean z;
        cz4 cz4Var;
        Object obj = this.P;
        if ((obj instanceof lx4) && ((lx4) obj).a) {
            z = true;
        } else {
            z = false;
        }
        if (z && (cz4Var = this.W) != null) {
            cz4Var.h();
        }
        this.W = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        cz4 cz4Var = this.W;
        if (cz4Var != null) {
            cz4Var.run();
        }
        this.W = null;
    }
}