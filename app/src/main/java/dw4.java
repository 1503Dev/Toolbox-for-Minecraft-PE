package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: dw4  reason: default package */
public final class dw4 extends AbstractCollection {
    public final Map P;

    public dw4(Map map) {
        this.P = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.P.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.P.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yv4(this.P.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.P.entrySet()) {
                if (dt4.l(obj, entry.getValue())) {
                    this.P.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.P.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.P.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.P.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.P.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.P.size();
    }
}