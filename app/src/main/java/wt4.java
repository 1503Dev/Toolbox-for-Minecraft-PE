package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* renamed from: wt4  reason: default package */
public class wt4 extends ew4 {
    public final transient Map R;
    public final /* synthetic */ ku4 S;

    public wt4(ku4 ku4Var, Map map) {
        this.S = ku4Var;
        this.R = map;
    }

    public final jv4 a(Map.Entry entry) {
        List ju4Var;
        Object key = entry.getKey();
        st4 st4Var = (st4) this.S;
        st4Var.getClass();
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            ju4Var = new cu4(st4Var, key, list, null);
        } else {
            ju4Var = new ju4(st4Var, key, list, null);
        }
        return new jv4(key, ju4Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.R;
        ku4 ku4Var = this.S;
        if (map == ku4Var.S) {
            ku4Var.a();
            return;
        }
        vt4 vt4Var = new vt4(this);
        while (vt4Var.hasNext()) {
            vt4Var.next();
            vt4Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.R;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.R.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Map map = this.R;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        st4 st4Var = (st4) this.S;
        st4Var.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new cu4(st4Var, obj, list, null);
        }
        return new ju4(st4Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        zt4 zt4Var;
        ku4 ku4Var = this.S;
        zt4 zt4Var2 = ku4Var.P;
        if (zt4Var2 == null) {
            iw4 iw4Var = (iw4) ku4Var;
            Map map = iw4Var.S;
            if (map instanceof NavigableMap) {
                zt4Var = new bu4(iw4Var, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                zt4Var = new eu4(iw4Var, (SortedMap) map);
            } else {
                zt4Var = new zt4(iw4Var, map);
            }
            zt4Var2 = zt4Var;
            ku4Var.P = zt4Var2;
        }
        return zt4Var2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Collection, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.R.remove(obj);
        if (collection == null) {
            return null;
        }
        ?? a = ((iw4) this.S).U.a();
        a.addAll(collection);
        this.S.T -= collection.size();
        collection.clear();
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.R.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.R.toString();
    }
}