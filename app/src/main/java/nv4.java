package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* renamed from: nv4  reason: default package */
public abstract class nv4 extends iv4 implements List, RandomAccess {
    public static final lv4 Q = new lv4(0, nw4.T);

    public static nw4 s(int i, Object[] objArr) {
        return i == 0 ? nw4.T : new nw4(i, objArr);
    }

    public static nv4 t(Collection collection) {
        if (!(collection instanceof iv4)) {
            Object[] array = collection.toArray();
            int length = array.length;
            lw4.a(length, array);
            return s(length, array);
        }
        nv4 n = ((iv4) collection).n();
        if (n.p()) {
            Object[] array2 = n.toArray();
            return s(array2.length, array2);
        }
        return n;
    }

    public static nw4 u(Object[] objArr) {
        if (objArr.length == 0) {
            return nw4.T;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        lw4.a(length, objArr2);
        return s(length, objArr2);
    }

    public static nw4 v(Object obj) {
        Object[] objArr = {obj};
        lw4.a(1, objArr);
        return s(1, objArr);
    }

    public static nw4 w(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        lw4.a(5, objArr);
        return s(5, objArr);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@CheckForNull Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (list instanceof RandomAccess) {
                for (int i = 0; i < size; i++) {
                    if (!dt4.l(get(i), list.get(i))) {
                        return false;
                    }
                }
            } else {
                lv4 listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (listIterator.hasNext()) {
                    if (!it.hasNext() || !dt4.l(listIterator.next(), it.next())) {
                        return false;
                    }
                    while (listIterator.hasNext()) {
                    }
                }
                if (it.hasNext()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.iv4
    public int g(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.iv4
    @Deprecated
    public final nv4 n() {
        return this;
    }

    @Override // defpackage.iv4
    public final cx4 o() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r */
    public nv4 subList(int i, int i2) {
        gt4.f(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? nw4.T : new mv4(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: y */
    public final lv4 listIterator(int i) {
        gt4.b(i, size());
        return isEmpty() ? Q : new lv4(i, this);
    }
}