package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: oe5  reason: default package */
public final class oe5 extends AbstractList {
    public final List P;

    public oe5(me5 me5Var) {
        this.P = me5Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f62 b = f62.b(((Integer) this.P.get(i)).intValue());
        return b == null ? f62.Q : b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.P.size();
    }
}