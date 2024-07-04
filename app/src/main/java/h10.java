package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: h10  reason: default package */
public final class h10<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a W = new a();
    public Comparator<? super K> P;
    public e<K, V> Q;
    public int R;
    public int S;
    public final e<K, V> T;
    public h10<K, V>.b U;
    public h10<K, V>.c V;

    /* renamed from: h10$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: h10$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: h10$b$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends h10<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h10.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h10.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e<K, V> b;
            if ((obj instanceof Map.Entry) && (b = h10.this.b((Map.Entry) obj)) != null) {
                h10.this.d(b, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h10.this.R;
        }
    }

    /* renamed from: h10$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class c extends AbstractSet<K> {

        /* renamed from: h10$c$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends h10<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().U;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h10.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return h10.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            h10 h10Var = h10.this;
            h10Var.getClass();
            e<K, V> eVar = null;
            if (obj != null) {
                try {
                    eVar = h10Var.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                h10Var.d(eVar, true);
            }
            if (eVar == null) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h10.this.R;
        }
    }

    /* renamed from: h10$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> P;
        public e<K, V> Q = null;
        public int R;

        public d() {
            this.P = h10.this.T.S;
            this.R = h10.this.S;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.P;
            h10 h10Var = h10.this;
            if (eVar != h10Var.T) {
                if (h10Var.S == this.R) {
                    this.P = eVar.S;
                    this.Q = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.P != h10.this.T;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.Q;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h10.this.d(eVar, true);
            this.Q = null;
            this.R = h10.this.S;
        }
    }

    /* renamed from: h10$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> P;
        public e<K, V> Q;
        public e<K, V> R;
        public e<K, V> S;
        public e<K, V> T;
        public final K U;
        public V V;
        public int W;

        public e() {
            this.U = null;
            this.T = this;
            this.S = this;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.P = eVar;
            this.U = k;
            this.W = 1;
            this.S = eVar2;
            this.T = eVar3;
            eVar3.S = this;
            eVar2.T = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.U;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.V;
                Object value = entry.getValue();
                if (v == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.U;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.V;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.U;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.V;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.V;
            this.V = v;
            return v2;
        }

        public final String toString() {
            return this.U + "=" + this.V;
        }
    }

    public h10() {
        a aVar = W;
        this.R = 0;
        this.S = 0;
        this.T = new e<>();
        this.P = aVar;
    }

    public final e<K, V> a(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.P;
        e<K, V> eVar2 = this.Q;
        if (eVar2 != null) {
            Comparable comparable = comparator == W ? (Comparable) k : null;
            while (true) {
                Object obj = (K) eVar2.U;
                i = comparable != null ? comparable.compareTo(obj) : comparator.compare(k, obj);
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.Q : eVar2.R;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (z) {
            e<K, V> eVar4 = this.T;
            if (eVar2 != null) {
                eVar = new e<>(eVar2, k, eVar4, eVar4.T);
                if (i < 0) {
                    eVar2.Q = eVar;
                } else {
                    eVar2.R = eVar;
                }
                c(eVar2, true);
            } else if (comparator == W && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            } else {
                eVar = new e<>(eVar2, k, eVar4, eVar4.T);
                this.Q = eVar;
            }
            this.R++;
            this.S++;
            return eVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e<K, V> b(Map.Entry<?, ?> entry) {
        e<K, V> a2;
        boolean z;
        Object key = entry.getKey();
        boolean z2 = false;
        if (key != null) {
            try {
                a2 = a(key, false);
            } catch (ClassCastException unused) {
            }
            if (a2 != null) {
                V v = a2.V;
                Object value = entry.getValue();
                if (v != value && (v == null || !v.equals(value))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2) {
                return null;
            }
            return a2;
        }
        a2 = null;
        if (a2 != null) {
        }
        if (z2) {
        }
    }

    public final void c(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.Q;
            e<K, V> eVar3 = eVar.R;
            int i = eVar2 != null ? eVar2.W : 0;
            int i2 = eVar3 != null ? eVar3.W : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.Q;
                e<K, V> eVar5 = eVar3.R;
                int i4 = (eVar4 != null ? eVar4.W : 0) - (eVar5 != null ? eVar5.W : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    g(eVar3);
                }
                f(eVar);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.Q;
                e<K, V> eVar7 = eVar2.R;
                int i5 = (eVar6 != null ? eVar6.W : 0) - (eVar7 != null ? eVar7.W : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    f(eVar2);
                }
                g(eVar);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.W = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.W = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.P;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.Q = null;
        this.R = 0;
        this.S++;
        e<K, V> eVar = this.T;
        eVar.T = eVar;
        eVar.S = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVar = null;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVar != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i;
        if (z) {
            e<K, V> eVar4 = eVar.T;
            eVar4.S = eVar.S;
            eVar.S.T = eVar4;
        }
        e<K, V> eVar5 = eVar.Q;
        e<K, V> eVar6 = eVar.R;
        e<K, V> eVar7 = eVar.P;
        int i2 = 0;
        if (eVar5 != null && eVar6 != null) {
            if (eVar5.W > eVar6.W) {
                do {
                    eVar3 = eVar5;
                    eVar5 = eVar5.R;
                } while (eVar5 != null);
            } else {
                do {
                    eVar2 = eVar6;
                    eVar6 = eVar6.Q;
                } while (eVar6 != null);
                eVar3 = eVar2;
            }
            d(eVar3, false);
            e<K, V> eVar8 = eVar.Q;
            if (eVar8 != null) {
                i = eVar8.W;
                eVar3.Q = eVar8;
                eVar8.P = eVar3;
                eVar.Q = null;
            } else {
                i = 0;
            }
            e<K, V> eVar9 = eVar.R;
            if (eVar9 != null) {
                i2 = eVar9.W;
                eVar3.R = eVar9;
                eVar9.P = eVar3;
                eVar.R = null;
            }
            eVar3.W = Math.max(i, i2) + 1;
            e(eVar, eVar3);
            return;
        }
        if (eVar5 != null) {
            e(eVar, eVar5);
            eVar.Q = null;
        } else if (eVar6 != null) {
            e(eVar, eVar6);
            eVar.R = null;
        } else {
            e(eVar, null);
        }
        c(eVar7, false);
        this.R--;
        this.S++;
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.P;
        eVar.P = null;
        if (eVar2 != null) {
            eVar2.P = eVar3;
        }
        if (eVar3 == null) {
            this.Q = eVar2;
        } else if (eVar3.Q == eVar) {
            eVar3.Q = eVar2;
        } else {
            eVar3.R = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        h10<K, V>.b bVar = this.U;
        if (bVar != null) {
            return bVar;
        }
        h10<K, V>.b bVar2 = new b();
        this.U = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.Q;
        e<K, V> eVar3 = eVar.R;
        e<K, V> eVar4 = eVar3.Q;
        e<K, V> eVar5 = eVar3.R;
        eVar.R = eVar4;
        if (eVar4 != null) {
            eVar4.P = eVar;
        }
        e(eVar, eVar3);
        eVar3.Q = eVar;
        eVar.P = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.W : 0, eVar4 != null ? eVar4.W : 0) + 1;
        eVar.W = max;
        eVar3.W = Math.max(max, eVar5 != null ? eVar5.W : 0) + 1;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.Q;
        e<K, V> eVar3 = eVar.R;
        e<K, V> eVar4 = eVar2.Q;
        e<K, V> eVar5 = eVar2.R;
        eVar.Q = eVar5;
        if (eVar5 != null) {
            eVar5.P = eVar;
        }
        e(eVar, eVar2);
        eVar2.R = eVar;
        eVar.P = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.W : 0, eVar5 != null ? eVar5.W : 0) + 1;
        eVar.W = max;
        eVar2.W = Math.max(max, eVar4 != null ? eVar4.W : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        e<K, V> eVar;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar != null) {
                return null;
            }
            return eVar.V;
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        h10<K, V>.c cVar = this.V;
        if (cVar != null) {
            return cVar;
        }
        h10<K, V>.c cVar2 = new c();
        this.V = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k != null) {
            e<K, V> a2 = a(k, true);
            V v2 = a2.V;
            a2.V = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(Object obj) {
        e<K, V> eVar;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (eVar != null) {
                d(eVar, true);
            }
            if (eVar != null) {
                return null;
            }
            return eVar.V;
        }
        eVar = null;
        if (eVar != null) {
        }
        if (eVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.R;
    }
}