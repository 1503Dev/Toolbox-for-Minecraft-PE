package defpackage;

import defpackage.w30;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: e7  reason: default package */
public final class e7<K, V> extends os0<K, V> implements Map<K, V> {
    public d7 W;

    public e7() {
    }

    public e7(int i) {
        super(i);
    }

    public e7(e7 e7Var) {
        super(e7Var);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.W == null) {
            this.W = new d7(this);
        }
        d7 d7Var = this.W;
        if (d7Var.a == null) {
            d7Var.a = new w30.b();
        }
        return d7Var.a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.W == null) {
            this.W = new d7(this);
        }
        d7 d7Var = this.W;
        if (d7Var.b == null) {
            d7Var.b = new w30.c();
        }
        return d7Var.b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.R);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.W == null) {
            this.W = new d7(this);
        }
        d7 d7Var = this.W;
        if (d7Var.c == null) {
            d7Var.c = new w30.e();
        }
        return d7Var.c;
    }
}