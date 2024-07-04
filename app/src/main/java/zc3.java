package defpackage;

/* renamed from: zc3  reason: default package */
public final class zc3 implements lj5 {
    public final yc3 a;
    public final uj5 b;

    public zc3(yc3 yc3Var, uj5 uj5Var) {
        this.a = yc3Var;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        yc3 yc3Var = this.a;
        String str = (String) this.b.c();
        j14 j14Var = yc3Var.f;
        if (j14Var == null) {
            return new j14(str);
        }
        return j14Var;
    }
}