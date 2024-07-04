package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: dz5  reason: default package */
public abstract class dz5 implements Map, Serializable {
    @CheckForNull
    public transient em1 P;
    @CheckForNull
    public transient en1 Q;
    @CheckForNull
    public transient ho1 R;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        ho1 ho1Var = this.R;
        if (ho1Var == null) {
            ip1 ip1Var = (ip1) this;
            ho1 ho1Var2 = new ho1(1, ip1Var.U, ip1Var.T);
            this.R = ho1Var2;
            ho1Var = ho1Var2;
        }
        return ho1Var.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        em1 em1Var = this.P;
        if (em1Var == null) {
            ip1 ip1Var = (ip1) this;
            em1 em1Var2 = new em1(ip1Var, ip1Var.T, ip1Var.U);
            this.P = em1Var2;
            return em1Var2;
        }
        return em1Var;
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        em1 em1Var = this.P;
        if (em1Var == null) {
            ip1 ip1Var = (ip1) this;
            em1 em1Var2 = new em1(ip1Var, ip1Var.T, ip1Var.U);
            this.P = em1Var2;
            em1Var = em1Var2;
        }
        Iterator it = em1Var.iterator();
        int i2 = 0;
        while (true) {
            fu5 fu5Var = (fu5) it;
            if (fu5Var.hasNext()) {
                E next = fu5Var.next();
                if (next != 0) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 += i;
            } else {
                return i2;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((ip1) this).U == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        en1 en1Var = this.Q;
        if (en1Var == null) {
            ip1 ip1Var = (ip1) this;
            en1 en1Var2 = new en1(ip1Var, new ho1(0, ip1Var.U, ip1Var.T));
            this.Q = en1Var2;
            return en1Var2;
        }
        return en1Var;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((ip1) this).U;
        if (i >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
            sb.append('{');
            Iterator it = ((em1) entrySet()).iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException(k6.a("size cannot be negative but was: ", i));
    }

    @Override // java.util.Map
    public final Collection values() {
        ho1 ho1Var = this.R;
        if (ho1Var == null) {
            ip1 ip1Var = (ip1) this;
            ho1 ho1Var2 = new ho1(1, ip1Var.U, ip1Var.T);
            this.R = ho1Var2;
            return ho1Var2;
        }
        return ho1Var;
    }
}