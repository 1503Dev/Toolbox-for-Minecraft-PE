package defpackage;

import java.lang.annotation.Annotation;

/* renamed from: ft0  reason: default package */
public final class ft0 implements et0 {
    public static final ft0 a = new ft0();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return et0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof et0;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder b = e5.b("@");
        b.append(et0.class.getName());
        b.append("()");
        return b.toString();
    }
}