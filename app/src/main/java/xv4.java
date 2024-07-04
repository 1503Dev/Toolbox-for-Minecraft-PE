package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: xv4  reason: default package */
public final class xv4 extends AbstractSequentialList implements Serializable {
    public final List P;
    public final at4 Q;

    public xv4(oe5 oe5Var) {
        k04 k04Var = new at4() { // from class: k04
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                return ((f62) obj).name();
            }
        };
        this.P = oe5Var;
        this.Q = k04Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new wv4(this.P.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.P.size();
    }
}