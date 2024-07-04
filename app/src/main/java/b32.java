package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: b32  reason: default package */
public final class b32 {
    public int b;
    public final Object a = new Object();
    public final LinkedList c = new LinkedList();

    public final void a(a32 a32Var) {
        int i;
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                int size = this.c.size();
                sv2.b("Queue is full, current size = " + size);
                this.c.remove(0);
            }
            int i2 = this.b;
            this.b = i2 + 1;
            a32Var.l = i2;
            synchronized (a32Var.g) {
                int i3 = a32Var.k;
                int i4 = a32Var.l;
                if (a32Var.d) {
                    i = a32Var.b;
                } else {
                    i = (i3 * a32Var.a) + (i4 * a32Var.b);
                }
                if (i > a32Var.n) {
                    a32Var.n = i;
                }
            }
            this.c.add(a32Var);
        }
    }

    public final void b(a32 a32Var) {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a32 a32Var2 = (a32) it.next();
                jv5 jv5Var = jv5.A;
                if (!jv5Var.g.b().y()) {
                    if (!a32Var.equals(a32Var2) && a32Var2.o.equals(a32Var.o)) {
                        it.remove();
                        return;
                    }
                } else if (!jv5Var.g.b().z() && !a32Var.equals(a32Var2) && a32Var2.q.equals(a32Var.q)) {
                    it.remove();
                    return;
                }
            }
        }
    }
}