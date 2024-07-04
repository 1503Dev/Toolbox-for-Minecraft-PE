package defpackage;

import java.lang.reflect.Method;

/* renamed from: p21  reason: default package */
public final class p21 extends z9 {
    public final /* synthetic */ Method P;
    public final /* synthetic */ int Q;

    public p21(int i, Method method) {
        this.P = method;
        this.Q = i;
    }

    @Override // defpackage.z9
    public final <T> T e(Class<T> cls) {
        z9.d(cls);
        return (T) this.P.invoke(null, cls, Integer.valueOf(this.Q));
    }
}