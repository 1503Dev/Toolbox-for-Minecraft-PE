package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: ug5  reason: default package */
public final class ug5 extends AbstractList implements RandomAccess, ye5 {
    public final ye5 P;

    public ug5(ye5 ye5Var) {
        this.P = ye5Var;
    }

    @Override // defpackage.ye5
    public final Object A(int i) {
        return this.P.A(i);
    }

    @Override // defpackage.ye5
    public final ye5 b() {
        return this;
    }

    @Override // defpackage.ye5
    public final List f() {
        return this.P.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((xe5) this.P).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new tg5(this);
    }

    @Override // defpackage.ye5
    public final void k(gd5 gd5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new sg5(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.P.size();
    }
}