package defpackage;

import java.util.concurrent.Executor;

/* renamed from: yv0  reason: default package */
public abstract class yv0<TResult> {
    public void a(iv5 iv5Var, ri4 ri4Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void b(yb0 yb0Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void c(Executor executor, yb0 yb0Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract ay5 d(Executor executor, bc0 bc0Var);

    public abstract ay5 e(iv5 iv5Var, ri4 ri4Var);

    public <TContinuationResult> yv0<TContinuationResult> f(Executor executor, mg<TResult, TContinuationResult> mgVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public yv0 g(a53 a53Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception h();

    public abstract TResult i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();
}