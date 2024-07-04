package defpackage;

import java.util.NoSuchElementException;

/* renamed from: fu5  reason: default package */
public final class fu5 extends cs1 {
    public final int P;
    public int Q;
    public final ew5 R;

    public fu5(ew5 ew5Var, int i) {
        int size = ew5Var.size();
        nu2.i(i, size);
        this.P = size;
        this.Q = i;
        this.R = ew5Var;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: b */
    public final boolean hasNext() {
        return this.Q < this.P;
    }

    @Override // java.util.ListIterator
    /* renamed from: c */
    public final boolean hasPrevious() {
        return this.Q > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: d */
    public final Object next() {
        if (hasNext()) {
            int i = this.Q;
            this.Q = i + 1;
            return this.R.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: e */
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.Q - 1;
            this.Q = i;
            return this.R.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.Q;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.Q - 1;
    }
}