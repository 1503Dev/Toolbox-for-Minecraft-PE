package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hz5  reason: default package */
public final class hz5 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(ho5 ho5Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            gz5 gz5Var = (gz5) it.next();
            if (gz5Var.b == ho5Var) {
                gz5Var.c = true;
                this.a.remove(gz5Var);
            }
        }
    }
}