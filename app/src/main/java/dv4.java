package defpackage;

import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: dv4  reason: default package */
public abstract class dv4 extends fy4 implements Map {
    public dv4() {
        super(7);
    }

    @Override // java.util.Map
    public final void clear() {
        ((v35) this).Q.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return ((v35) this).Q.containsKey(obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        return ((v35) this).Q.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((v35) this).Q.putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        return ((v35) this).Q.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((v35) this).Q.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((v35) this).Q.values();
    }
}