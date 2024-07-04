package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qz4  reason: default package */
public final class qz4 extends cz4 {
    public final Callable R;
    public final /* synthetic */ rz4 S;

    public qz4(rz4 rz4Var, Callable callable) {
        this.S = rz4Var;
        callable.getClass();
        this.R = callable;
    }

    @Override // defpackage.cz4
    public final Object b() {
        return this.R.call();
    }

    @Override // defpackage.cz4
    public final String c() {
        return this.R.toString();
    }

    @Override // defpackage.cz4
    public final void e(Throwable th) {
        this.S.i(th);
    }

    @Override // defpackage.cz4
    public final void f(Object obj) {
        this.S.h(obj);
    }

    @Override // defpackage.cz4
    public final boolean g() {
        return this.S.isDone();
    }
}