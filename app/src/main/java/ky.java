package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ky  reason: default package */
public final class ky {
    public final Method a;
    public final List<?> b;

    public ky(Method method, ArrayList arrayList) {
        this.a = method;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}