package defpackage;

import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: lu4  reason: default package */
public abstract class lu4 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (dt4.l(getKey(), entry.getKey()) && dt4.l(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return ij.c(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}