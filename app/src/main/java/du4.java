package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: du4  reason: default package */
public class du4 extends wt4 implements SortedMap {
    @CheckForNull
    public SortedSet T;
    public final /* synthetic */ ku4 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du4(ku4 ku4Var, SortedMap sortedMap) {
        super(ku4Var, sortedMap);
        this.U = ku4Var;
    }

    public SortedMap b() {
        return (SortedMap) this.R;
    }

    public SortedSet c() {
        return new eu4(this.U, b());
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // defpackage.wt4, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: d */
    public SortedSet keySet() {
        SortedSet sortedSet = this.T;
        if (sortedSet == null) {
            SortedSet c = c();
            this.T = c;
            return c;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new du4(this.U, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new du4(this.U, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new du4(this.U, b().tailMap(obj));
    }
}