package defpackage;

import defpackage.kk0;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: n11  reason: default package */
public final class n11<T> extends l11<T> {
    public final xt a;
    public final l11<T> b;
    public final Type c;

    public n11(xt xtVar, l11<T> l11Var, Type type) {
        this.a = xtVar;
        this.b = l11Var;
        this.c = type;
    }

    @Override // defpackage.l11
    public final T a(c00 c00Var) {
        return this.b.a(c00Var);
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, T t) {
        l11<T> l11Var = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            l11Var = this.a.f(new u11<>(type));
            if (l11Var instanceof kk0.a) {
                l11<T> l11Var2 = this.b;
                if (!(l11Var2 instanceof kk0.a)) {
                    l11Var = l11Var2;
                }
            }
        }
        l11Var.b(i00Var, t);
    }
}