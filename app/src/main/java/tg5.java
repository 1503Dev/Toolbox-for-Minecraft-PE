package defpackage;

import java.util.Iterator;

/* renamed from: tg5  reason: default package */
public final class tg5 implements Iterator {
    public final Iterator P;

    public tg5(ug5 ug5Var) {
        this.P = ug5Var.P.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.P.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.P.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}