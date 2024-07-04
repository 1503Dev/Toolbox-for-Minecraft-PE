package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: uj0  reason: default package */
public class uj0<T> implements List<Object> {
    public List<T> P;

    public uj0(List<T> list) {
        this.P = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m(i, obj);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        n(obj);
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ boolean addAll(int i, Collection<? extends Object> collection) {
        o(i, collection);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection<Object> collection) {
        p(collection);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ void clear() {
        q();
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.P.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.P.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.P.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.P.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.P.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new sj0(this.P.iterator());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.P.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return new tj0(this.P.listIterator());
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i) {
        return new tj0(this.P.listIterator(i));
    }

    public final void m(int i, Object obj) {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final boolean n(Object obj) {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final boolean o(int i, Collection<Object> collection) {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final boolean p(Collection<Object> collection) {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final void q() {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final Object r(int i) {
        throw new UnsupportedOperationException("List is read-only");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        r(i);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        s(obj);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection<?> collection) {
        t(collection);
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void replaceAll(UnaryOperator<Object> unaryOperator) {
        u(unaryOperator);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection<?> collection) {
        v(collection);
        throw null;
    }

    public final boolean s(Object obj) {
        throw new UnsupportedOperationException("List is read-only");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        w(i, obj);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.P.size();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void sort(Comparator<? super Object> comparator) {
        x(comparator);
        throw null;
    }

    @Override // java.util.List
    public final List<Object> subList(int i, int i2) {
        return new uj0(this.P.subList(i, i2));
    }

    public final boolean t(Collection<?> collection) {
        throw new UnsupportedOperationException("List is read-only");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.P.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <T1> T1[] toArray(T1[] t1Arr) {
        return (T1[]) this.P.toArray(t1Arr);
    }

    public final void u(UnaryOperator<Object> unaryOperator) {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final boolean v(Collection<?> collection) {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final Object w(int i, Object obj) {
        throw new UnsupportedOperationException("List is read-only");
    }

    public final void x(Comparator<Object> comparator) {
        throw new UnsupportedOperationException("List is read-only");
    }
}