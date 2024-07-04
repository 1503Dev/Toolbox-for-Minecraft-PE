package defpackage;

import java.lang.reflect.Method;

/* renamed from: q21  reason: default package */
public final class q21 extends z9 {
    public final /* synthetic */ Method P;

    public q21(Method method) {
        this.P = method;
    }

    @Override // defpackage.z9
    public final <T> T e(Class<T> cls) {
        z9.d(cls);
        return (T) this.P.invoke(null, cls, Object.class);
    }
}