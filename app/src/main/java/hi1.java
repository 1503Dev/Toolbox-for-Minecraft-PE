package defpackage;

/* renamed from: hi1  reason: default package */
public final class hi1 extends yh1<Boolean> {
    public final j20<?> c;

    public hi1(j20<?> j20Var, aw0<Boolean> aw0Var) {
        super(aw0Var);
        this.c = j20Var;
    }

    @Override // defpackage.li1
    public final /* bridge */ /* synthetic */ void d(kg1 kg1Var, boolean z) {
    }

    @Override // defpackage.fh1
    public final boolean f(zg1<?> zg1Var) {
        if (((ph1) zg1Var.U.get(this.c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.fh1
    public final wp[] g(zg1<?> zg1Var) {
        if (((ph1) zg1Var.U.get(this.c)) == null) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, TResult] */
    @Override // defpackage.yh1
    public final void h(zg1<?> zg1Var) {
        if (((ph1) zg1Var.U.remove(this.c)) == null) {
            aw0<T> aw0Var = this.b;
            ?? r0 = Boolean.FALSE;
            ay5<TResult> ay5Var = aw0Var.a;
            synchronized (ay5Var.a) {
                if (!ay5Var.c) {
                    ay5Var.c = true;
                    ay5Var.e = r0;
                    ay5Var.b.b(ay5Var);
                    return;
                }
                return;
            }
        }
        throw null;
    }
}