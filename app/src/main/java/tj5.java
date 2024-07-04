package defpackage;

/* renamed from: tj5  reason: default package */
public final class tj5 implements uj5 {
    public static final Object c = new Object();
    public volatile uj5 a;
    public volatile Object b = c;

    public tj5(lj5 lj5Var) {
        this.a = lj5Var;
    }

    public static uj5 a(lj5 lj5Var) {
        return ((lj5Var instanceof tj5) || (lj5Var instanceof kj5)) ? lj5Var : new tj5(lj5Var);
    }

    @Override // defpackage.uj5
    public final Object c() {
        Object obj = this.b;
        if (obj == c) {
            uj5 uj5Var = this.a;
            if (uj5Var == null) {
                return this.b;
            }
            Object c2 = uj5Var.c();
            this.b = c2;
            this.a = null;
            return c2;
        }
        return obj;
    }
}