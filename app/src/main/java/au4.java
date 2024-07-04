package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: au4  reason: default package */
public final class au4 extends du4 implements NavigableMap {
    public final /* synthetic */ ku4 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au4(ku4 ku4Var, NavigableMap navigableMap) {
        super(ku4Var, navigableMap);
        this.V = ku4Var;
    }

    @Override // defpackage.du4
    public final /* synthetic */ SortedMap b() {
        return (NavigableMap) ((SortedMap) this.R);
    }

    @Override // defpackage.du4
    public final SortedSet c() {
        return new bu4(this.V, (NavigableMap) ((SortedMap) this.R));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.R)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.R)).ceilingKey(obj);
    }

    @Override // defpackage.du4
    public final /* synthetic */ SortedSet d() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new au4(this.V, ((NavigableMap) ((SortedMap) this.R)).descendingMap());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @CheckForNull
    public final jv4 e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ?? a = ((iw4) this.V).U.a();
        a.addAll((Collection) entry.getValue());
        it.remove();
        Object key = entry.getKey();
        ((st4) this.V).getClass();
        return new jv4(key, Collections.unmodifiableList(a));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.R)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.R)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.R)).floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new au4(this.V, ((NavigableMap) ((SortedMap) this.R)).headMap(obj, z));
    }

    @Override // defpackage.du4, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.R)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.R)).higherKey(obj);
    }

    @Override // defpackage.du4, defpackage.wt4, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.R)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.R)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.R)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollFirstEntry() {
        return e(((ut4) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollLastEntry() {
        return e(((ut4) ((ew4) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new au4(this.V, ((NavigableMap) ((SortedMap) this.R)).subMap(obj, z, obj2, z2));
    }

    @Override // defpackage.du4, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new au4(this.V, ((NavigableMap) ((SortedMap) this.R)).tailMap(obj, z));
    }

    @Override // defpackage.du4, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}