package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: bu4  reason: default package */
public final class bu4 extends eu4 implements NavigableSet {
    public final /* synthetic */ ku4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu4(ku4 ku4Var, NavigableMap navigableMap) {
        super(ku4Var, navigableMap);
        this.S = ku4Var;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.P)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((zt4) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new bu4(this.S, ((NavigableMap) ((SortedMap) this.P)).descendingMap());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.P)).floorKey(obj);
    }

    @Override // defpackage.eu4
    public final /* synthetic */ SortedMap g() {
        return (NavigableMap) ((SortedMap) this.P);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new bu4(this.S, ((NavigableMap) ((SortedMap) this.P)).headMap(obj, z));
    }

    @Override // defpackage.eu4, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.P)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.P)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollFirst() {
        yt4 yt4Var = (yt4) iterator();
        if (yt4Var.hasNext()) {
            Object next = yt4Var.next();
            yt4Var.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new bu4(this.S, ((NavigableMap) ((SortedMap) this.P)).subMap(obj, z, obj2, z2));
    }

    @Override // defpackage.eu4, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new bu4(this.S, ((NavigableMap) ((SortedMap) this.P)).tailMap(obj, z));
    }

    @Override // defpackage.eu4, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}