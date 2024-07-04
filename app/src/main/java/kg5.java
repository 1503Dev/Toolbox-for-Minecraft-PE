package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: kg5  reason: default package */
public final class kg5 extends AbstractSet {
    public final /* synthetic */ lg5 P;

    public /* synthetic */ kg5(lg5 lg5Var) {
        this.P = lg5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.P.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.P.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jg5(this.P);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.P.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.P.size();
    }
}