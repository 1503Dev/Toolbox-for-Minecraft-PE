package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;

/* renamed from: iv4  reason: default package */
public abstract class iv4 extends AbstractCollection implements Serializable {
    public static final Object[] P = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(int i, Object[] objArr) {
        throw null;
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        throw new UnsupportedOperationException();
    }

    public nv4 n() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public abstract cx4 iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean p();

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public Object[] q() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(P);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] q = q();
            if (q != null) {
                return Arrays.copyOfRange(q, m(), h(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        g(0, objArr);
        return objArr;
    }
}