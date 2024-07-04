package defpackage;

/* renamed from: kj5  reason: default package */
public final class kj5 implements uj5, hj5 {
    public static final Object c = new Object();
    public volatile uj5 a;
    public volatile Object b = c;

    public kj5(uj5 uj5Var) {
        this.a = uj5Var;
    }

    public static hj5 a(uj5 uj5Var) {
        if (uj5Var instanceof hj5) {
            return (hj5) uj5Var;
        }
        uj5Var.getClass();
        return new kj5(uj5Var);
    }

    public static uj5 b(lj5 lj5Var) {
        return lj5Var instanceof kj5 ? lj5Var : new kj5(lj5Var);
    }

    @Override // defpackage.uj5
    public final Object c() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.a.c();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
        }
        return obj;
    }
}