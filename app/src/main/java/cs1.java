package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: cs1  reason: default package */
public abstract class cs1 implements ListIterator, Iterator {
    @Deprecated
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        a();
        throw null;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}