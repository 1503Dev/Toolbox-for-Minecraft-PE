package defpackage;

/* renamed from: ay4  reason: default package */
public final class ay4 extends cy4 {
    public ay4(dz4 dz4Var, ky4 ky4Var) {
        super(dz4Var, ky4Var);
    }

    @Override // defpackage.cy4
    public final /* bridge */ /* synthetic */ Object s(Object obj, Object obj2) {
        ky4 ky4Var = (ky4) obj;
        dz4 e = ky4Var.e(obj2);
        gt4.d(e, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ky4Var);
        return e;
    }

    @Override // defpackage.cy4
    public final /* synthetic */ void t(Object obj) {
        n((dz4) obj);
    }
}