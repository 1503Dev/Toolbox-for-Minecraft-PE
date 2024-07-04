package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* renamed from: cy4  reason: default package */
public abstract class cy4 extends ry4 implements Runnable {
    public static final /* synthetic */ int Y = 0;
    @CheckForNull
    public dz4 W;
    @CheckForNull
    public Object X;

    public cy4(dz4 dz4Var, Object obj) {
        dz4Var.getClass();
        this.W = dz4Var;
        obj.getClass();
        this.X = obj;
    }

    @Override // defpackage.vx4
    @CheckForNull
    public final String f() {
        String str;
        dz4 dz4Var = this.W;
        Object obj = this.X;
        String f = super.f();
        if (dz4Var != null) {
            str = ij.c("inputFuture=[", dz4Var.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return ho.b(str, "function=[", obj.toString(), "]");
        }
        if (f != null) {
            return str.concat(f);
        }
        return null;
    }

    @Override // defpackage.vx4
    public final void g() {
        m(this.W);
        this.W = null;
        this.X = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        dz4 dz4Var = this.W;
        Object obj = this.X;
        boolean z2 = this.P instanceof lx4;
        boolean z3 = true;
        if (dz4Var == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z2 | z;
        if (obj != null) {
            z3 = false;
        }
        if (z4 | z3) {
            return;
        }
        this.W = null;
        if (dz4Var.isCancelled()) {
            n(dz4Var);
            return;
        }
        try {
            try {
                Object s = s(obj, zw4.H(dz4Var));
                this.X = null;
                t(s);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    i(th);
                } finally {
                    this.X = null;
                }
            }
        } catch (Error e) {
            i(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            i(e2);
        } catch (ExecutionException e3) {
            i(e3.getCause());
        }
    }

    public abstract Object s(Object obj, Object obj2);

    public abstract void t(Object obj);
}