package defpackage;

import java.lang.reflect.Method;

/* renamed from: o21  reason: default package */
public final class o21 extends z9 {
    public final /* synthetic */ Method P;
    public final /* synthetic */ Object Q;

    public o21(Object obj, Method method) {
        this.P = method;
        this.Q = obj;
    }

    @Override // defpackage.z9
    public final <T> T e(Class<T> cls) {
        z9.d(cls);
        return (T) this.P.invoke(this.Q, cls);
    }
}