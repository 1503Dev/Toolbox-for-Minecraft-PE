package defpackage;

import java.util.Iterator;

/* renamed from: sj0  reason: default package */
public final class sj0<T> implements Iterator<T> {
    public Iterator<T> P;

    public sj0(Iterator<T> it) {
        this.P = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.P.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return this.P.next();
    }
}