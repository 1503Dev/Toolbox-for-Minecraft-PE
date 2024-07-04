package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ri4  reason: default package */
public final class ri4<TResult, TContinuationResult> implements ic0<TContinuationResult>, bc0, es5 {
    public final Executor P;
    public final mg<TResult, yv0<TContinuationResult>> Q;
    public final ay5<TContinuationResult> R;

    public ri4(mr5 mr5Var, a53 a53Var, ay5 ay5Var) {
        this.P = mr5Var;
        this.Q = a53Var;
        this.R = ay5Var;
    }

    @Override // defpackage.es5
    public final void a(yv0<TResult> yv0Var) {
        this.P.execute(new tx1(this, yv0Var));
    }

    @Override // defpackage.bc0
    public final void c(Exception exc) {
        this.R.m(exc);
    }
}