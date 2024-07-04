package defpackage;

import java.util.ListIterator;

/* renamed from: tj0  reason: default package */
public final class tj0<T> implements ListIterator<T> {
    public ListIterator<T> P;

    public tj0(ListIterator<T> listIterator) {
        this.P = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException("add");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.P.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.P.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        return this.P.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.P.nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return this.P.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.P.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException("set");
    }
}