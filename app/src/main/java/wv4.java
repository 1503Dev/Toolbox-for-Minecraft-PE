package defpackage;

import java.util.ListIterator;

/* renamed from: wv4  reason: default package */
public final class wv4 extends bx4 implements ListIterator {
    public wv4(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // defpackage.bx4
    public final Object a(Object obj) {
        return ((f62) obj).name();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: c */
    public final boolean hasPrevious() {
        return ((ListIterator) this.P).hasPrevious();
    }

    @Override // java.util.ListIterator
    /* renamed from: d */
    public final int nextIndex() {
        return ((ListIterator) this.P).nextIndex();
    }

    @Override // java.util.ListIterator
    /* renamed from: e */
    public final Object previous() {
        return a(((ListIterator) this.P).previous());
    }

    @Override // java.util.ListIterator
    /* renamed from: f */
    public final int previousIndex() {
        return ((ListIterator) this.P).previousIndex();
    }

    public final void g(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        g(obj);
        throw null;
    }
}