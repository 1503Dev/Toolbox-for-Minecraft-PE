package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: xw4  reason: default package */
public final class xw4 extends ww4 implements SortedSet {
    public xw4(SortedSet sortedSet, ht4 ht4Var) {
        super(sortedSet, ht4Var);
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return ((SortedSet) this.P).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.P.iterator();
        ht4 ht4Var = this.Q;
        it.getClass();
        ht4Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ht4Var.e(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new xw4(((SortedSet) this.P).headSet(obj), this.Q);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.P;
        while (true) {
            Object last = sortedSet.last();
            if (this.Q.e(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new xw4(((SortedSet) this.P).subSet(obj, obj2), this.Q);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new xw4(((SortedSet) this.P).tailSet(obj), this.Q);
    }
}