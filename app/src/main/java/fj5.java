package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: fj5  reason: default package */
public final class fj5 extends AbstractList {
    public static final fy4 R = fy4.k(fj5.class);
    public final List P;
    public final Iterator Q;

    public fj5(ArrayList arrayList, Iterator it) {
        this.P = arrayList;
        this.Q = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.P.size() > i) {
            return this.P.get(i);
        }
        if (this.Q.hasNext()) {
            this.P.add(this.Q.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ej5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        fy4 fy4Var = R;
        fy4Var.h("potentially expensive size() call");
        fy4Var.h("blowup running");
        while (this.Q.hasNext()) {
            this.P.add(this.Q.next());
        }
        return this.P.size();
    }
}