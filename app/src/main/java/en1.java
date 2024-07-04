package defpackage;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: en1  reason: default package */
public final class en1 extends c06 {
    public final transient dz5 R;
    public final transient ew5 S;

    public en1(dz5 dz5Var, ho1 ho1Var) {
        this.R = dz5Var;
        this.S = ho1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.R.get(obj) != null;
    }

    @Override // defpackage.ft5
    public final int g(Object[] objArr) {
        return this.S.g(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.S.listIterator(0);
    }

    @Override // defpackage.c06
    public final ew5 o() {
        return this.S;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((ip1) this.R).U;
    }
}