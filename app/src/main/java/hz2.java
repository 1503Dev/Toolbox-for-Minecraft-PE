package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hz2  reason: default package */
public final class hz2 implements Iterable {
    public final ArrayList P = new ArrayList();

    public final boolean g(gy2 gy2Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            gz2 gz2Var = (gz2) it.next();
            if (gz2Var.b == gy2Var) {
                arrayList.add(gz2Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((gz2) it2.next()).c.l();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.P.iterator();
    }
}