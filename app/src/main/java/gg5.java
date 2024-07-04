package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gg5  reason: default package */
public final class gg5 implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}