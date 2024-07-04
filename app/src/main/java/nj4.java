package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: nj4  reason: default package */
public final class nj4 {
    public final LinkedBlockingDeque a = new LinkedBlockingDeque();
    public final Callable b;
    public final ez4 c;

    public nj4(ip3 ip3Var, yw2 yw2Var) {
        this.b = ip3Var;
        this.c = yw2Var;
    }

    public final synchronized dz4 a() {
        b(1);
        return (dz4) this.a.poll();
    }

    public final synchronized void b(int i) {
        int size = i - this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.add(this.c.b(this.b));
        }
    }
}