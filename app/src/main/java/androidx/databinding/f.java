package androidx.databinding;

import androidx.databinding.g;
import java.util.ArrayList;
import java.util.Collection;

public final class f<T> extends ArrayList<T> implements g<T> {
    public transient d P = new d();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        super.add(i, t);
        d dVar = this.P;
        if (dVar != null) {
            dVar.j(this, 2, d.i(i, 0, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            int size = collection.size();
            d dVar = this.P;
            if (dVar != null) {
                dVar.j(this, 2, d.i(i, 0, size));
            }
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d dVar;
        int size = size();
        super.clear();
        if (size != 0 && (dVar = this.P) != null) {
            dVar.j(this, 4, d.i(0, 0, size));
        }
    }

    @Override // androidx.databinding.g
    public final void j(g.a aVar) {
        d dVar = this.P;
        if (dVar != null) {
            dVar.f(aVar);
        }
    }

    @Override // androidx.databinding.g
    public final void l(g.a aVar) {
        if (this.P == null) {
            this.P = new d();
        }
        this.P.a(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final T remove(int i) {
        T t = (T) super.remove(i);
        d dVar = this.P;
        if (dVar != null) {
            dVar.j(this, 4, d.i(i, 0, 1));
        }
        return t;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        int i3 = i2 - i;
        d dVar = this.P;
        if (dVar != null) {
            dVar.j(this, 4, d.i(i, 0, i3));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        T t2 = (T) super.set(i, t);
        d dVar = this.P;
        if (dVar != null) {
            dVar.j(this, 1, d.i(i, 0, 1));
        }
        return t2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(T t) {
        super.add(t);
        int size = size() - 1;
        d dVar = this.P;
        if (dVar != null) {
            dVar.j(this, 2, d.i(size, 0, 1));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            int size2 = size() - size;
            d dVar = this.P;
            if (dVar != null) {
                dVar.j(this, 2, d.i(size, 0, size2));
            }
        }
        return addAll;
    }
}