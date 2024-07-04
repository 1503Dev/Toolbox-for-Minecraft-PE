package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: uu4  reason: default package */
public final class uu4 extends AbstractSet {
    public final /* synthetic */ xu4 P;

    public uu4(xu4 xu4Var) {
        this.P = xu4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.P.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        xu4 xu4Var = this.P;
        Map a = xu4Var.a();
        return a != null ? a.keySet().iterator() : new pu4(xu4Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map a = this.P.a();
        if (a != null) {
            return a.keySet().remove(obj);
        }
        if (this.P.f(obj) == xu4.Y) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.P.size();
    }
}