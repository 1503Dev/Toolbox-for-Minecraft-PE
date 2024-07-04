package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: rt4  reason: default package */
public abstract class rt4 extends cx4 implements ListIterator {
    public final int Q;
    public int R;

    public rt4(int i, int i2) {
        super(0);
        gt4.b(i2, i);
        this.Q = i;
        this.R = i2;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    @Deprecated
    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.R < this.Q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.R > 0;
    }

    @Override // defpackage.cx4, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.R;
            this.R = i + 1;
            return ((lv4) this).S.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.R;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.R - 1;
            this.R = i;
            return ((lv4) this).S.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.R - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}