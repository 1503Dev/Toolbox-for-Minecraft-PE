package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: ej5  reason: default package */
public final class ej5 implements Iterator {
    public int P = 0;
    public final /* synthetic */ fj5 Q;

    public ej5(fj5 fj5Var) {
        this.Q = fj5Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.P < this.Q.P.size() || this.Q.Q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.P >= this.Q.P.size()) {
            fj5 fj5Var = this.Q;
            fj5Var.P.add(fj5Var.Q.next());
            return next();
        }
        List list = this.Q.P;
        int i = this.P;
        this.P = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}