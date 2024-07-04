package defpackage;

import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: gt5  reason: default package */
public final class gt5<TResult> {
    public final Object a = new Object();
    @GuardedBy("mLock")
    public ArrayDeque b;
    @GuardedBy("mLock")
    public boolean c;

    public final void a(es5<TResult> es5Var) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(es5Var);
        }
    }

    public final void b(yv0<TResult> yv0Var) {
        es5 es5Var;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        es5Var = (es5) this.b.poll();
                        if (es5Var == null) {
                            this.c = false;
                            return;
                        }
                    }
                    es5Var.a(yv0Var);
                }
            }
        }
    }
}