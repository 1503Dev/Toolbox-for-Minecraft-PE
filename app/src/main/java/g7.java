package defpackage;

import defpackage.w30;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: g7  reason: default package */
public final class g7<E> implements Collection<E>, Set<E> {
    public static final int[] T = new int[0];
    public static final Object[] U = new Object[0];
    public static Object[] V;
    public static int W;
    public static Object[] X;
    public static int Y;
    public int[] P;
    public Object[] Q;
    public int R;
    public f7 S;

    public g7() {
        this(0);
    }

    public g7(int i) {
        if (i == 0) {
            this.P = T;
            this.Q = U;
        } else {
            g(i);
        }
        this.R = 0;
    }

    public static void h(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (g7.class) {
                if (Y < 10) {
                    objArr[0] = X;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    X = objArr;
                    Y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g7.class) {
                if (W < 10) {
                    objArr[0] = V;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    V = objArr;
                    W++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int m;
        if (e == null) {
            m = n();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m = m(hashCode, e);
        }
        if (m >= 0) {
            return false;
        }
        int i2 = m ^ (-1);
        int i3 = this.R;
        int[] iArr = this.P;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.Q;
            g(i4);
            int[] iArr2 = this.P;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.Q, 0, objArr.length);
            }
            h(iArr, objArr, this.R);
        }
        int i5 = this.R;
        if (i2 < i5) {
            int[] iArr3 = this.P;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.Q;
            System.arraycopy(objArr2, i2, objArr2, i6, this.R - i2);
        }
        this.P[i2] = i;
        this.Q[i2] = e;
        this.R++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.R;
        int[] iArr = this.P;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.Q;
            g(size);
            int i = this.R;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.P, 0, i);
                System.arraycopy(objArr, 0, this.Q, 0, this.R);
            }
            h(iArr, objArr, this.R);
        }
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.R;
        if (i != 0) {
            h(this.P, this.Q, i);
            this.P = T;
            this.Q = U;
            this.R = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.R != set.size()) {
                return false;
            }
            for (int i = 0; i < this.R; i++) {
                try {
                    if (!set.contains(this.Q[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(int i) {
        if (i == 8) {
            synchronized (g7.class) {
                Object[] objArr = X;
                if (objArr != null) {
                    this.Q = objArr;
                    X = (Object[]) objArr[0];
                    this.P = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    Y--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (g7.class) {
                Object[] objArr2 = V;
                if (objArr2 != null) {
                    this.Q = objArr2;
                    V = (Object[]) objArr2[0];
                    this.P = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    W--;
                    return;
                }
            }
        }
        this.P = new int[i];
        this.Q = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.P;
        int i = this.R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? n() : m(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.R <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.S == null) {
            this.S = new f7(this);
        }
        f7 f7Var = this.S;
        if (f7Var.b == null) {
            f7Var.b = new w30.c();
        }
        return (Iterator<E>) f7Var.b.iterator();
    }

    public final int m(int i, Object obj) {
        int i2 = this.R;
        if (i2 == 0) {
            return -1;
        }
        int h = gw.h(i2, i, this.P);
        if (h >= 0 && !obj.equals(this.Q[h])) {
            int i3 = h + 1;
            while (i3 < i2 && this.P[i3] == i) {
                if (obj.equals(this.Q[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = h - 1; i4 >= 0 && this.P[i4] == i; i4--) {
                if (obj.equals(this.Q[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return h;
    }

    public final int n() {
        int i = this.R;
        if (i == 0) {
            return -1;
        }
        int h = gw.h(i, 0, this.P);
        if (h >= 0 && this.Q[h] != null) {
            int i2 = h + 1;
            while (i2 < i && this.P[i2] == 0) {
                if (this.Q[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = h - 1; i3 >= 0 && this.P[i3] == 0; i3--) {
                if (this.Q[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return h;
    }

    public final void o(int i) {
        Object[] objArr = this.Q;
        Object obj = objArr[i];
        int i2 = this.R;
        if (i2 <= 1) {
            h(this.P, objArr, i2);
            this.P = T;
            this.Q = U;
            this.R = 0;
            return;
        }
        int[] iArr = this.P;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.R = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.Q;
                System.arraycopy(objArr2, i4, objArr2, i, this.R - i);
            }
            this.Q[this.R] = null;
            return;
        }
        g(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.R--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.P, 0, i);
            System.arraycopy(objArr, 0, this.Q, 0, i);
        }
        int i5 = this.R;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.P, i, i5 - i);
            System.arraycopy(objArr, i6, this.Q, i, this.R - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            o(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.R - 1; i >= 0; i--) {
            if (!collection.contains(this.Q[i])) {
                o(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.R;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.R;
        Object[] objArr = new Object[i];
        System.arraycopy(this.Q, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.R) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.R));
        }
        System.arraycopy(this.Q, 0, tArr, 0, this.R);
        int length = tArr.length;
        int i = this.R;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.R * 14);
        sb.append('{');
        for (int i = 0; i < this.R; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.Q[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}