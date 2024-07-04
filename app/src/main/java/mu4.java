package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: mu4  reason: default package */
public final class mu4 extends AbstractCollection {
    public final /* synthetic */ nu4 P;

    public mu4(st4 st4Var) {
        this.P = st4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ((ku4) this.P).a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        for (Collection collection : this.P.s().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ku4 ku4Var = (ku4) this.P;
        ku4Var.getClass();
        return new tt4(ku4Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((ku4) this.P).T;
    }
}