package defpackage;

/* renamed from: ff5  reason: default package */
public final class ff5 implements mf5 {
    public final mf5[] a;

    public ff5(mf5... mf5VarArr) {
        this.a = mf5VarArr;
    }

    @Override // defpackage.mf5
    public final lf5 a(Class cls) {
        mf5[] mf5VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            mf5 mf5Var = mf5VarArr[i];
            if (mf5Var.b(cls)) {
                return mf5Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.mf5
    public final boolean b(Class cls) {
        mf5[] mf5VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (mf5VarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}