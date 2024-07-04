package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: ny4  reason: default package */
public final class ny4 extends cz4 {
    public final Executor R;
    public final /* synthetic */ oy4 S;
    public final Callable T;
    public final /* synthetic */ oy4 U;

    public ny4(oy4 oy4Var, Callable callable, Executor executor) {
        this.U = oy4Var;
        this.S = oy4Var;
        executor.getClass();
        this.R = executor;
        this.T = callable;
    }

    @Override // defpackage.cz4
    public final Object b() {
        return this.T.call();
    }

    @Override // defpackage.cz4
    public final String c() {
        return this.T.toString();
    }

    @Override // defpackage.cz4
    public final void e(Throwable th) {
        oy4 oy4Var = this.S;
        oy4Var.e0 = null;
        if (th instanceof ExecutionException) {
            th = ((ExecutionException) th).getCause();
        } else if (th instanceof CancellationException) {
            oy4Var.cancel(false);
            return;
        }
        oy4Var.i(th);
    }

    @Override // defpackage.cz4
    public final void f(Object obj) {
        this.S.e0 = null;
        this.U.h(obj);
    }

    @Override // defpackage.cz4
    public final boolean g() {
        return this.S.isDone();
    }
}