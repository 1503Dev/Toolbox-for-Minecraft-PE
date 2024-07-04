package defpackage;

/* renamed from: fv3  reason: default package */
public final class fv3 implements lj5 {
    public final uj5 a;

    public fv3(t23 t23Var) {
        this.a = t23Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        String packageName = ((t23) this.a).a().getPackageName();
        tv2.C(packageName);
        return packageName;
    }
}