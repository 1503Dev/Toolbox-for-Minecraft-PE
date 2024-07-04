package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hu3  reason: default package */
public final class hu3 implements Iterator {
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