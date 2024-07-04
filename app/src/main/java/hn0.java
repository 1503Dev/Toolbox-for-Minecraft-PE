package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: hn0  reason: default package */
public class hn0<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> P;
    public c<K, V> Q;
    public WeakHashMap<f<K, V>, Boolean> R = new WeakHashMap<>();
    public int S = 0;

    /* renamed from: hn0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.hn0.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.S;
        }

        @Override // defpackage.hn0.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.R;
        }
    }

    /* renamed from: hn0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.hn0.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.R;
        }

        @Override // defpackage.hn0.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.S;
        }
    }

    /* renamed from: hn0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K P;
        public final V Q;
        public c<K, V> R;
        public c<K, V> S;

        public c(K k, V v) {
            this.P = k;
            this.Q = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.P.equals(cVar.P) && this.Q.equals(cVar.Q);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.P;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.Q;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.P.hashCode() ^ this.Q.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.P + "=" + this.Q;
        }
    }

    /* renamed from: hn0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> P;
        public boolean Q = true;

        public d() {
        }

        @Override // defpackage.hn0.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.P;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.S;
                this.P = cVar3;
                this.Q = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.Q) {
                return hn0.this.P != null;
            }
            c<K, V> cVar = this.P;
            return (cVar == null || cVar.R == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.Q) {
                this.Q = false;
                cVar = hn0.this.P;
            } else {
                c<K, V> cVar2 = this.P;
                cVar = cVar2 != null ? cVar2.R : null;
            }
            this.P = cVar;
            return cVar;
        }
    }

    /* renamed from: hn0$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> P;
        public c<K, V> Q;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.P = cVar2;
            this.Q = cVar;
        }

        @Override // defpackage.hn0.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.P == cVar && cVar == this.Q) {
                this.Q = null;
                this.P = null;
            }
            c<K, V> cVar3 = this.P;
            if (cVar3 == cVar) {
                this.P = b(cVar3);
            }
            c<K, V> cVar4 = this.Q;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.P;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.Q = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.Q != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.Q;
            c<K, V> cVar3 = this.P;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
            } else {
                cVar = null;
            }
            this.Q = cVar;
            return cVar2;
        }
    }

    /* renamed from: hn0$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((defpackage.hn0.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hn0)) {
            return false;
        }
        hn0 hn0Var = (hn0) obj;
        if (this.S != hn0Var.S) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = hn0Var.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public c<K, V> g(K k) {
        c<K, V> cVar = this.P;
        while (cVar != null && !cVar.P.equals(k)) {
            cVar = cVar.R;
        }
        return cVar;
    }

    public V h(K k) {
        c<K, V> g = g(k);
        if (g == null) {
            return null;
        }
        this.S--;
        if (!this.R.isEmpty()) {
            for (f<K, V> fVar : this.R.keySet()) {
                fVar.a(g);
            }
        }
        c<K, V> cVar = g.S;
        c<K, V> cVar2 = g.R;
        if (cVar != null) {
            cVar.R = cVar2;
        } else {
            this.P = cVar2;
        }
        c<K, V> cVar3 = g.R;
        if (cVar3 != null) {
            cVar3.S = cVar;
        } else {
            this.Q = cVar;
        }
        g.R = null;
        g.S = null;
        return g.Q;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.P, this.Q);
        this.R.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder b2 = e5.b("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                b2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    b2.append(", ");
                }
            } else {
                b2.append("]");
                return b2.toString();
            }
        }
    }
}