package defpackage;

import java.util.ListIterator;

/* renamed from: sg5  reason: default package */
public final class sg5 implements ListIterator {
    public final ListIterator P;

    public sg5(ug5 ug5Var, int i) {
        this.P = ug5Var.P.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
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
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.P.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.P.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.P.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.P.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}