package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: w30  reason: default package */
public abstract class w30<K, V> {
    public w30<K, V>.b a;
    public w30<K, V>.c b;
    public w30<K, V>.e c;

    /* renamed from: w30$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a<T> implements Iterator<T> {
        public final int P;
        public int Q;
        public int R;
        public boolean S = false;

        public a(int i) {
            this.P = i;
            this.Q = w30.this.d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.R < this.Q;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t = (T) w30.this.b(this.R, this.P);
                this.R++;
                this.S = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.S) {
                throw new IllegalStateException();
            }
            int i = this.R - 1;
            this.R = i;
            this.Q--;
            this.S = false;
            w30.this.h(i);
        }
    }

    /* renamed from: w30$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = w30.this.d();
            for (Map.Entry<K, V> entry : collection) {
                w30.this.g(entry.getKey(), entry.getValue());
            }
            return d != w30.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            w30.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e = w30.this.e(entry.getKey());
                if (e < 0) {
                    return false;
                }
                Object b = w30.this.b(e, 1);
                Object value = entry.getValue();
                return b == value || (b != null && b.equals(value));
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return w30.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int d = w30.this.d() - 1; d >= 0; d--) {
                Object b = w30.this.b(d, 0);
                Object b2 = w30.this.b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return w30.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return w30.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: w30$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            w30.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return w30.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> c = w30.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return w30.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int d = w30.this.d() - 1; d >= 0; d--) {
                Object b = w30.this.b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return w30.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int e = w30.this.e(obj);
            if (e >= 0) {
                w30.this.h(e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> c = w30.this.c();
            int size = c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c.remove(it.next());
            }
            return size != c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return w30.k(w30.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return w30.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            w30 w30Var = w30.this;
            int d = w30Var.d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = w30Var.b(i, 0);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) w30.this.l(0, tArr);
        }
    }

    /* renamed from: w30$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int P;
        public boolean R = false;
        public int Q = -1;

        public d() {
            this.P = w30.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (this.R) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object b = w30.this.b(this.Q, 0);
                if (key != b && (key == null || !key.equals(b))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                Object value = entry.getValue();
                Object b2 = w30.this.b(this.Q, 1);
                if (value != b2 && (value == null || !value.equals(b2))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.R) {
                return (K) w30.this.b(this.Q, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.R) {
                return (V) w30.this.b(this.Q, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.Q < this.P;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (this.R) {
                Object b = w30.this.b(this.Q, 0);
                Object b2 = w30.this.b(this.Q, 1);
                return (b == null ? 0 : b.hashCode()) ^ (b2 != null ? b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.Q++;
                this.R = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.R) {
                throw new IllegalStateException();
            }
            w30.this.h(this.Q);
            this.Q--;
            this.P--;
            this.R = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.R) {
                return (V) w30.this.i(this.Q, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: w30$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            w30.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return w30.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return w30.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int f = w30.this.f(obj);
            if (f >= 0) {
                w30.this.h(f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int d = w30.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(w30.this.b(i, 1))) {
                    w30.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int d = w30.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(w30.this.b(i, 1))) {
                    w30.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return w30.this.d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            w30 w30Var = w30.this;
            int d = w30Var.d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = w30Var.b(i, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) w30.this.l(1, tArr);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public final Object[] l(int i, Object[] objArr) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}