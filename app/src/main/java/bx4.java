package defpackage;

import java.util.Iterator;

/* renamed from: bx4  reason: default package */
public abstract class bx4 implements Iterator {
    public final Iterator P;

    public bx4(Iterator it) {
        it.getClass();
        this.P = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.P.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.P.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.P.remove();
    }
}