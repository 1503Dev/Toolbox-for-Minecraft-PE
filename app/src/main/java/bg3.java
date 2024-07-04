package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bg3  reason: default package */
public final class bg3<TResult, TContinuationResult> implements es5<TResult> {
    public final Executor P;
    public final mg<TResult, TContinuationResult> Q;
    public final ay5<TContinuationResult> R;

    public bg3(Executor executor, mg<TResult, TContinuationResult> mgVar, ay5<TContinuationResult> ay5Var) {
        this.P = executor;
        this.Q = mgVar;
        this.R = ay5Var;
    }

    @Override // defpackage.es5
    public final void a(yv0<TResult> yv0Var) {
        this.P.execute(new ch4(this, yv0Var));
    }
}