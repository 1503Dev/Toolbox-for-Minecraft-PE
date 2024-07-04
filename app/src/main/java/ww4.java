package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: ww4  reason: default package */
public class ww4 extends AbstractCollection implements Set {
    public final Collection P;
    public final ht4 Q;

    public ww4(Set set, ht4 ht4Var) {
        this.P = set;
        this.Q = ht4Var;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return zw4.w(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: g */
    public final boolean add(Object obj) {
        if (this.Q.e(obj)) {
            return this.P.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: h */
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.Q.e(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.P.addAll(collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zw4.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: m */
    public final void clear() {
        Collection collection = this.P;
        ht4 ht4Var = this.Q;
        if ((collection instanceof RandomAccess) && (collection instanceof List)) {
            List list = (List) collection;
            ht4Var.getClass();
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                Object obj = list.get(i);
                if (!ht4Var.e(obj)) {
                    if (i > i2) {
                        try {
                            list.set(i2, obj);
                        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                            int size = list.size();
                            while (true) {
                                size--;
                                if (size <= i) {
                                    break;
                                } else if (ht4Var.e(list.get(size))) {
                                    list.remove(size);
                                }
                            }
                            while (true) {
                                i--;
                                if (i >= i2) {
                                    list.remove(i);
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    i2++;
                }
                i++;
            }
            list.subList(i2, list.size()).clear();
            return;
        }
        Iterator it = collection.iterator();
        ht4Var.getClass();
        while (it.hasNext()) {
            if (ht4Var.e(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: n */
    public final boolean contains(@CheckForNull Object obj) {
        boolean z;
        Collection collection = this.P;
        collection.getClass();
        try {
            z = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return this.Q.e(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: o */
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: p */
    public final boolean isEmpty() {
        Collection<Object> collection = this.P;
        ht4 ht4Var = this.Q;
        gt4.c(ht4Var, "predicate");
        int i = 0;
        for (Object obj : collection) {
            if (ht4Var.e(obj)) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public final Iterator iterator() {
        Iterator it = this.P.iterator();
        ht4 ht4Var = this.Q;
        it.getClass();
        ht4Var.getClass();
        return new tv4(it, ht4Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: r */
    public final boolean remove(@CheckForNull Object obj) {
        return contains(obj) && this.P.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: s */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.P.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.Q.e(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: t */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.P.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.Q.e(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: u */
    public final int size() {
        int i = 0;
        for (Object obj : this.P) {
            if (this.Q.e(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: v */
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        tv4 tv4Var = (tv4) it;
        while (tv4Var.hasNext()) {
            arrayList.add(tv4Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: w */
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        tv4 tv4Var = (tv4) it;
        while (tv4Var.hasNext()) {
            arrayList.add(tv4Var.next());
        }
        return arrayList.toArray(objArr);
    }
}