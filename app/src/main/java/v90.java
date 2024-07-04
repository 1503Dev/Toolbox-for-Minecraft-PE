package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: v90  reason: default package */
public final class v90<K, V> implements Set<Map.Entry<K, V>> {
    public Set<Map.Entry<K, V>> P;

    /* renamed from: v90$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Map.Entry<K, V> {
        public Map.Entry<K, V> P;

        public a(Map.Entry entry) {
            this.P = entry;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            return this.P.equals(obj);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.P.getKey();
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.P.getValue();
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.P.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v != null) {
                return this.P.setValue(v);
            }
            throw new NullPointerException(a.class.getSimpleName() + " does not allow setting null");
        }
    }

    /* renamed from: v90$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Iterator<Map.Entry<K, V>> {
        public Iterator<Map.Entry<K, V>> P;

        public b(v90 v90Var, Iterator<Map.Entry<K, V>> it) {
            this.P = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.P.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return new a(this.P.next());
        }
    }

    public v90(Set<Map.Entry<K, V>> set) {
        this.P = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.P.add((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        return this.P.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.P.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.P.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.P.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new b(this, this.P.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.P.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.P.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.P.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.P.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.P.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.P.toArray(tArr);
    }
}