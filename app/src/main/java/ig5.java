package defpackage;

import java.util.Map;

/* renamed from: ig5  reason: default package */
public final class ig5 implements Map.Entry, Comparable {
    public final Comparable P;
    public Object Q;
    public final /* synthetic */ lg5 R;

    public ig5(lg5 lg5Var, Comparable comparable, Object obj) {
        this.R = lg5Var;
        this.P = comparable;
        this.Q = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.P.compareTo(((ig5) obj).P);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.P;
        Object key = entry.getKey();
        if (comparable == null) {
            if (key != null) {
                equals = false;
            } else {
                equals = true;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.Q;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value != null) {
                    equals2 = false;
                } else {
                    equals2 = true;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.P;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.Q;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.P;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.Q;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        lg5 lg5Var = this.R;
        int i = lg5.V;
        lg5Var.g();
        Object obj2 = this.Q;
        this.Q = obj;
        return obj2;
    }

    public final String toString() {
        return ij.c(String.valueOf(this.P), "=", String.valueOf(this.Q));
    }
}