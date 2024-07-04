package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a22  reason: default package */
public abstract class a22 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        a02 a02Var = (a02) this;
        int i = a02Var.P;
        if (i < a02Var.Q) {
            a02Var.P = i + 1;
            return Byte.valueOf(a02Var.R.h(i));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}