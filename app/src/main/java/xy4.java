package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: xy4  reason: default package */
public final class xy4 {
    public final boolean a;
    public final nv4 b;

    public /* synthetic */ xy4(boolean z, nv4 nv4Var) {
        this.a = z;
        this.b = nv4Var;
    }

    public final oy4 a(Callable callable, Executor executor) {
        return new oy4(this.b, this.a, executor, callable);
    }
}