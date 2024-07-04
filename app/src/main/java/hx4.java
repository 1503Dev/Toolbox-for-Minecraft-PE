package defpackage;

/* renamed from: hx4  reason: default package */
public final class hx4 extends jx4 {
    public hx4(dz4 dz4Var, Class cls, ky4 ky4Var) {
        super(dz4Var, cls, ky4Var);
    }

    @Override // defpackage.jx4
    public final /* bridge */ /* synthetic */ Object s(Object obj, Throwable th) {
        ky4 ky4Var = (ky4) obj;
        dz4 e = ky4Var.e(th);
        gt4.d(e, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ky4Var);
        return e;
    }

    @Override // defpackage.jx4
    public final /* synthetic */ void t(Object obj) {
        n((dz4) obj);
    }
}