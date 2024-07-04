package defpackage;

import defpackage.hn0;
import java.util.HashMap;

/* renamed from: vp  reason: default package */
public final class vp<K, V> extends hn0<K, V> {
    public HashMap<K, hn0.c<K, V>> T = new HashMap<>();

    @Override // defpackage.hn0
    public final hn0.c<K, V> g(K k) {
        return this.T.get(k);
    }

    @Override // defpackage.hn0
    public final V h(K k) {
        V v = (V) super.h(k);
        this.T.remove(k);
        return v;
    }

    public final V m(K k, V v) {
        hn0.c<K, V> g = g(k);
        if (g != null) {
            return g.Q;
        }
        HashMap<K, hn0.c<K, V>> hashMap = this.T;
        hn0.c<K, V> cVar = new hn0.c<>(k, v);
        this.S++;
        hn0.c<K, V> cVar2 = this.Q;
        if (cVar2 == null) {
            this.P = cVar;
        } else {
            cVar2.R = cVar;
            cVar.S = cVar2;
        }
        this.Q = cVar;
        hashMap.put(k, cVar);
        return null;
    }
}