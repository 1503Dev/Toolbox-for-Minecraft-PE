package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: m84  reason: default package */
public final class m84 extends AbstractList implements RandomAccess, s63 {
    public final s63 P;

    public m84(s63 s63Var) {
        this.P = s63Var;
    }

    @Override // defpackage.s63
    public final Object A(int i) {
        return this.P.A(i);
    }

    @Override // defpackage.s63
    public final s63 b() {
        return this;
    }

    @Override // defpackage.s63
    public final List f() {
        return this.P.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((q53) this.P).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new p74(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new w64(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.P.size();
    }
}