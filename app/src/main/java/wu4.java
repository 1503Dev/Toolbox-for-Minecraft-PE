package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: wu4  reason: default package */
public final class wu4 extends AbstractCollection {
    public final /* synthetic */ xu4 P;

    public wu4(xu4 xu4Var) {
        this.P = xu4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.P.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        xu4 xu4Var = this.P;
        Map a = xu4Var.a();
        return a != null ? a.values().iterator() : new ru4(xu4Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.P.size();
    }
}