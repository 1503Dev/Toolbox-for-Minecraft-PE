package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: dv1  reason: default package */
public abstract class dv1 extends AbstractList implements b13 {
    public boolean P;

    public dv1(boolean z) {
        this.P = z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        g();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        g();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        g();
        return super.addAll(collection);
    }

    @Override // defpackage.b13
    public final void c() {
        if (this.P) {
            this.P = false;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        g();
        super.clear();
    }

    @Override // defpackage.b13
    public final boolean d() {
        return this.P;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (obj instanceof RandomAccess) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    for (int i = 0; i < size; i++) {
                        if (!get(i).equals(list.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return super.equals(obj);
        }
        return false;
    }

    public final void g() {
        if (!this.P) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        g();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        g();
        return super.retainAll(collection);
    }
}