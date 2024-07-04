package defpackage;

import java.util.Iterator;

/* renamed from: p74  reason: default package */
public final class p74 implements Iterator {
    public final Iterator P;

    public p74(m84 m84Var) {
        this.P = m84Var.P.iterator();
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