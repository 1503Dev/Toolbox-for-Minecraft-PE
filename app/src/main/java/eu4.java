package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: eu4  reason: default package */
public class eu4 extends zt4 implements SortedSet {
    public final /* synthetic */ ku4 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu4(ku4 ku4Var, SortedMap sortedMap) {
        super(ku4Var, sortedMap);
        this.R = ku4Var;
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return g().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return g().firstKey();
    }

    public SortedMap g() {
        return (SortedMap) this.P;
    }

    public SortedSet headSet(Object obj) {
        return new eu4(this.R, g().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return g().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new eu4(this.R, g().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new eu4(this.R, g().tailMap(obj));
    }
}