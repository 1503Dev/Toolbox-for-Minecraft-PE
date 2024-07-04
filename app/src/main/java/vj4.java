package defpackage;

import java.util.LinkedList;

/* renamed from: vj4  reason: default package */
public final class vj4 {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final rk4 d = new rk4();

    public vj4(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        while (!this.a.isEmpty()) {
            jv5.A.j.getClass();
            if (System.currentTimeMillis() - ((dk4) this.a.getFirst()).d >= this.c) {
                rk4 rk4Var = this.d;
                rk4Var.f++;
                rk4Var.b.Q++;
                this.a.remove();
            } else {
                return;
            }
        }
    }
}