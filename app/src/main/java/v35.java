package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: v35  reason: default package */
public final class v35 extends dv4 {
    public final Map Q;

    public v35(Map map) {
        this.Q = map;
    }

    @Override // defpackage.dv4, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = entrySet().iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return zw4.r(this.Q.entrySet(), new ht4() { // from class: l25
            @Override // defpackage.ht4
            public final boolean e(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && fw4.a(obj, this);
    }

    @Override // defpackage.fy4
    public final /* synthetic */ Object f() {
        return this.Q;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.Q.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zw4.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.Q.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return zw4.r(this.Q.keySet(), new ht4() { // from class: b35
            @Override // defpackage.ht4
            public final boolean e(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // defpackage.dv4, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}