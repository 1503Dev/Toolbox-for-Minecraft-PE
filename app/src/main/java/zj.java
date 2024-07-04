package defpackage;

import defpackage.ck;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: zj  reason: default package */
public final class zj implements qb<Object, pb<?>> {
    public final /* synthetic */ Type a;
    public final /* synthetic */ Executor b;

    public zj(Type type, Executor executor) {
        this.a = type;
        this.b = executor;
    }

    @Override // defpackage.qb
    public final Type a() {
        return this.a;
    }

    @Override // defpackage.qb
    public final Object b(mb0 mb0Var) {
        Executor executor = this.b;
        return executor == null ? mb0Var : new ck.a(executor, mb0Var);
    }
}