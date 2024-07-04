package defpackage;

/* renamed from: q11  reason: default package */
public final class q11 implements m11 {
    public final /* synthetic */ Class P;
    public final /* synthetic */ l11 Q;

    public q11(Class cls, l11 l11Var) {
        this.P = cls;
        this.Q = l11Var;
    }

    @Override // defpackage.m11
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        if (u11Var.a == this.P) {
            return this.Q;
        }
        return null;
    }

    public final String toString() {
        StringBuilder b = e5.b("Factory[type=");
        b.append(this.P.getName());
        b.append(",adapter=");
        b.append(this.Q);
        b.append("]");
        return b.toString();
    }
}