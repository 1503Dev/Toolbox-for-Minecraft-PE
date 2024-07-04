package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: qv4  reason: default package */
public abstract class qv4 implements Map, Serializable {
    @CheckForNull
    public transient sv4 P;
    @CheckForNull
    public transient sv4 Q;
    @CheckForNull
    public transient iv4 R;

    public static sw4 b(HashMap hashMap) {
        int i;
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z = entrySet instanceof Collection;
        if (z) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        pv4 pv4Var = new pv4(i);
        if (z) {
            int size = entrySet.size() + pv4Var.b;
            Object[] objArr = pv4Var.a;
            int length = objArr.length;
            int i2 = size + size;
            if (i2 > length) {
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    int highestOneBit = Integer.highestOneBit(i2 - 1);
                    i3 = highestOneBit + highestOneBit;
                }
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                pv4Var.a = Arrays.copyOf(objArr, i3);
            }
        }
        for (Map.Entry entry : entrySet) {
            pv4Var.a(entry.getKey(), entry.getValue());
        }
        return pv4Var.b();
    }

    public abstract rw4 a();

    public abstract pw4 c();

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
        iv4 iv4Var = this.R;
        if (iv4Var == null) {
            iv4Var = a();
            this.R = iv4Var;
        }
        return iv4Var.contains(obj);
    }

    public abstract qw4 d();

    @Override // java.util.Map
    public final Set entrySet() {
        sv4 sv4Var = this.P;
        if (sv4Var == null) {
            pw4 c = c();
            this.P = c;
            return c;
        }
        return sv4Var;
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return fw4.a(obj, this);
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
        sv4 sv4Var = this.P;
        if (sv4Var == null) {
            sv4Var = c();
            this.P = sv4Var;
        }
        return zw4.m(sv4Var);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        sv4 sv4Var = this.Q;
        if (sv4Var == null) {
            qw4 d = d();
            this.Q = d;
            return d;
        }
        return sv4Var;
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
        int size = size();
        ou4.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
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

    @Override // java.util.Map
    public final Collection values() {
        iv4 iv4Var = this.R;
        if (iv4Var == null) {
            rw4 a = a();
            this.R = a;
            return a;
        }
        return iv4Var;
    }
}