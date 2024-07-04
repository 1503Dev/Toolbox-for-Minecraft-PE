package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: mc3  reason: default package */
public final class mc3 extends dv1 implements RandomAccess, rp3 {
    public long[] Q;
    public int R;

    static {
        new mc3(new long[0], 0, false);
    }

    public mc3() {
        this(new long[10], 0, true);
    }

    public mc3(long[] jArr, int i, boolean z) {
        super(z);
        this.Q = jArr;
        this.R = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        g();
        if (i < 0 || i > (i2 = this.R)) {
            throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
        }
        long[] jArr = this.Q;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[qq.c(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.Q, i, jArr2, i + 1, this.R - i);
            this.Q = jArr2;
        }
        this.Q[i] = longValue;
        this.R++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // defpackage.dv1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = z13.a;
        collection.getClass();
        if (collection instanceof mc3) {
            mc3 mc3Var = (mc3) collection;
            int i = mc3Var.R;
            if (i == 0) {
                return false;
            }
            int i2 = this.R;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                long[] jArr = this.Q;
                if (i3 > jArr.length) {
                    this.Q = Arrays.copyOf(jArr, i3);
                }
                System.arraycopy(mc3Var.Q, 0, this.Q, this.R, mc3Var.R);
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

    @Override // defpackage.b13
    public final /* bridge */ /* synthetic */ b13 e(int i) {
        if (i >= this.R) {
            return new mc3(Arrays.copyOf(this.Q, i), this.R, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mc3) {
            mc3 mc3Var = (mc3) obj;
            if (this.R != mc3Var.R) {
                return false;
            }
            long[] jArr = mc3Var.Q;
            for (int i = 0; i < this.R; i++) {
                if (this.Q[i] != jArr[i]) {
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
        return Long.valueOf(this.Q[i]);
    }

    public final void h(long j) {
        g();
        int i = this.R;
        long[] jArr = this.Q;
        if (i == jArr.length) {
            long[] jArr2 = new long[qq.c(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.Q = jArr2;
        }
        long[] jArr3 = this.Q;
        int i2 = this.R;
        this.R = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.R; i2++) {
            long j = this.Q[i2];
            Charset charset = z13.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.R;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.Q[i2] == longValue) {
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

    @Override // defpackage.dv1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        g();
        m(i);
        long[] jArr = this.Q;
        long j = jArr[i];
        if (i < this.R - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.R--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.Q;
        System.arraycopy(jArr, i2, jArr, i, this.R - i2);
        this.R -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        g();
        m(i);
        long[] jArr = this.Q;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}