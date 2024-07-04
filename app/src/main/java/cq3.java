package defpackage;

/* renamed from: cq3  reason: default package */
public final class cq3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;

    public cq3(p54 p54Var, p54 p54Var2, uj5 uj5Var) {
        this.a = p54Var;
        this.b = p54Var2;
        this.c = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        uj5 uj5Var = this.a;
        uj5 uj5Var2 = this.b;
        int i = ((ed3) this.c).a().o.P;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? ((p54) uj5Var2).c() : ((p54) uj5Var).c();
        }
        throw null;
    }
}