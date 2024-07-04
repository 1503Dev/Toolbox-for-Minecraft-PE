package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: u11  reason: default package */
public class u11<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c;

    public u11() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a = a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.b = a;
            this.a = (Class<? super T>) a.e(a);
            this.c = a.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u11) && a.c(this.b, ((u11) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return a.h(this.b);
    }

    public u11(Type type) {
        type.getClass();
        Type a = a.a(type);
        this.b = a;
        this.a = (Class<? super T>) a.e(a);
        this.c = a.hashCode();
    }
}