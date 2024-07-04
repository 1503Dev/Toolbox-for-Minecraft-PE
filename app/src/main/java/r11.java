package defpackage;

/* renamed from: r11  reason: default package */
public final class r11 implements m11 {
    public final /* synthetic */ Class P;
    public final /* synthetic */ Class Q;
    public final /* synthetic */ l11 R;

    public r11(Class cls, Class cls2, l11 l11Var) {
        this.P = cls;
        this.Q = cls2;
        this.R = l11Var;
    }

    @Override // defpackage.m11
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        Class<? super T> cls = u11Var.a;
        if (cls != this.P && cls != this.Q) {
            return null;
        }
        return this.R;
    }

    public final String toString() {
        StringBuilder b = e5.b("Factory[type=");
        b.append(this.Q.getName());
        b.append("+");
        b.append(this.P.getName());
        b.append(",adapter=");
        b.append(this.R);
        b.append("]");
        return b.toString();
    }
}