package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ad5  reason: default package */
public final class ad5 extends wc5 implements RandomAccess, uf5 {
    public boolean[] Q;
    public int R;

    static {
        new ad5(new boolean[0], 0, false);
    }

    public ad5() {
        this(new boolean[10], 0, true);
    }

    public ad5(boolean[] zArr, int i, boolean z) {
        super(z);
        this.Q = zArr;
        this.R = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g();
        if (i < 0 || i > (i2 = this.R)) {
            throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
        }
        boolean[] zArr = this.Q;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[qq.c(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.Q, i, zArr2, i + 1, this.R - i);
            this.Q = zArr2;
        }
        this.Q[i] = booleanValue;
        this.R++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // defpackage.wc5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = re5.a;
        collection.getClass();
        if (collection instanceof ad5) {
            ad5 ad5Var = (ad5) collection;
            int i = ad5Var.R;
            if (i == 0) {
                return false;
            }
            int i2 = this.R;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                boolean[] zArr = this.Q;
                if (i3 > zArr.length) {
                    this.Q = Arrays.copyOf(zArr, i3);
                }
                System.arraycopy(ad5Var.Q, 0, this.Q, this.R, ad5Var.R);
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
    public final /* bridge */ /* synthetic */ qe5 e(int i) {
        if (i >= this.R) {
            return new ad5(Arrays.copyOf(this.Q, i), this.R, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad5) {
            ad5 ad5Var = (ad5) obj;
            if (this.R != ad5Var.R) {
                return false;
            }
            boolean[] zArr = ad5Var.Q;
            for (int i = 0; i < this.R; i++) {
                if (this.Q[i] != zArr[i]) {
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
        return Boolean.valueOf(this.Q[i]);
    }

    public final void h(boolean z) {
        g();
        int i = this.R;
        boolean[] zArr = this.Q;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[qq.c(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.Q = zArr2;
        }
        boolean[] zArr3 = this.Q;
        int i2 = this.R;
        this.R = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.R; i2++) {
            i = (i * 31) + re5.a(this.Q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.R;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.Q[i2] == booleanValue) {
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
        boolean[] zArr = this.Q;
        boolean z = zArr[i];
        if (i < this.R - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.R--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.Q;
        System.arraycopy(zArr, i2, zArr, i, this.R - i2);
        this.R -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g();
        m(i);
        boolean[] zArr = this.Q;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}