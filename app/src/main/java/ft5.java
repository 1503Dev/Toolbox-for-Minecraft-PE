package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;

/* renamed from: ft5  reason: default package */
public abstract class ft5 extends AbstractCollection implements Serializable {
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

    abstract int g(Object[] objArr);

    int h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public Object[] n() {
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
            Object[] n = n();
            if (n != null) {
                return Arrays.copyOfRange(n, m(), h(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        g(objArr);
        return objArr;
    }
}