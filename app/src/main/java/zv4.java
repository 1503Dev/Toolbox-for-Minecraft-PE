package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: zv4  reason: default package */
public abstract class zv4 extends yw4 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ((ut4) this).P.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return ((ut4) this).P.isEmpty();
    }

    @Override // defpackage.yw4, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return zw4.y(this, collection);
        } catch (UnsupportedOperationException unused) {
            boolean z = false;
            for (Object obj : collection) {
                z |= ((ut4) this).remove(obj);
            }
            return z;
        }
    }

    @Override // defpackage.yw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                ou4.a(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                double d = size;
                Double.isNaN(d);
                Double.isNaN(d);
                i = (int) Math.ceil(d / 0.75d);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((ut4) this).P.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((ut4) this).P.size();
    }
}