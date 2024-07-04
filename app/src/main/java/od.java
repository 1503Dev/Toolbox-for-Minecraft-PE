package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: od  reason: default package */
public final class od implements m11 {
    public final vf P;

    /* renamed from: od$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a<E> extends l11<Collection<E>> {
        public final n11 a;
        public final ta0<? extends Collection<E>> b;

        public a(xt xtVar, Type type, l11<E> l11Var, ta0<? extends Collection<E>> ta0Var) {
            this.a = new n11(xtVar, l11Var, type);
            this.b = ta0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.l11
        public final Object a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            Collection collection = (Collection) ((Collection<E>) this.b.d());
            c00Var.a();
            while (c00Var.H()) {
                collection.add(this.a.a(c00Var));
            }
            c00Var.y();
            return collection;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                i00Var.H();
                return;
            }
            i00Var.d();
            for (E e : collection) {
                this.a.b(i00Var, e);
            }
            i00Var.y();
        }
    }

    public od(vf vfVar) {
        this.P = vfVar;
    }

    @Override // defpackage.m11
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        Type type;
        Type type2 = u11Var.b;
        Class<? super T> cls = u11Var.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f = defpackage.a.f(type2, cls, Collection.class);
        if (f instanceof WildcardType) {
            f = ((WildcardType) f).getUpperBounds()[0];
        }
        if (f instanceof ParameterizedType) {
            type = ((ParameterizedType) f).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new a(xtVar, type, xtVar.f(new u11<>(type)), this.P.a(u11Var));
    }
}