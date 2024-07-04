package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: je5  reason: default package */
public final class je5 extends wc5 implements RandomAccess, me5, uf5 {
    public static final je5 S = new je5(new int[0], 0, false);
    public int[] Q;
    public int R;

    public je5() {
        this(new int[10], 0, true);
    }

    public je5(int[] iArr, int i, boolean z) {
        super(z);
        this.Q = iArr;
        this.R = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        g();
        if (i < 0 || i > (i2 = this.R)) {
            throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
        }
        int[] iArr = this.Q;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[qq.c(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.Q, i, iArr2, i + 1, this.R - i);
            this.Q = iArr2;
        }
        this.Q[i] = intValue;
        this.R++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    @Override // defpackage.wc5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = re5.a;
        collection.getClass();
        if (collection instanceof je5) {
            je5 je5Var = (je5) collection;
            int i = je5Var.R;
            if (i == 0) {
                return false;
            }
            int i2 = this.R;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.Q;
                if (i3 > iArr.length) {
                    this.Q = Arrays.copyOf(iArr, i3);
                }
                System.arraycopy(je5Var.Q, 0, this.Q, this.R, je5Var.R);
                this.R = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.qe5
    public final qe5 e(int i) {
        if (i >= this.R) {
            return new je5(Arrays.copyOf(this.Q, i), this.R, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof je5) {
            je5 je5Var = (je5) obj;
            if (this.R != je5Var.R) {
                return false;
            }
            int[] iArr = je5Var.Q;
            for (int i = 0; i < this.R; i++) {
                if (this.Q[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m(i);
        return Integer.valueOf(this.Q[i]);
    }

    public final void h(int i) {
        g();
        int i2 = this.R;
        int[] iArr = this.Q;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[qq.c(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.Q = iArr2;
        }
        int[] iArr3 = this.Q;
        int i3 = this.R;
        this.R = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.R; i2++) {
            i = (i * 31) + this.Q[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.R;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.Q[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void m(int i) {
        if (i >= 0 && i < this.R) {
            return;
        }
        throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        g();
        m(i);
        int[] iArr = this.Q;
        int i3 = iArr[i];
        if (i < this.R - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.R--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.Q;
        System.arraycopy(iArr, i2, iArr, i, this.R - i2);
        this.R -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        g();
        m(i);
        int[] iArr = this.Q;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}