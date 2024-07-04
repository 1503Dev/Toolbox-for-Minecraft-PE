package defpackage;

/* renamed from: pz4  reason: default package */
public final class pz4 extends cz4 {
    public final jy4 R;
    public final /* synthetic */ rz4 S;

    public pz4(rz4 rz4Var, jy4 jy4Var) {
        this.S = rz4Var;
        this.R = jy4Var;
    }

    @Override // defpackage.cz4
    public final /* bridge */ /* synthetic */ Object b() {
        dz4 a = this.R.a();
        gt4.d(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.R);
        return a;
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
    public final /* synthetic */ void f(Object obj) {
        this.S.n((dz4) obj);
    }

    @Override // defpackage.cz4
    public final boolean g() {
        return this.S.isDone();
    }
}