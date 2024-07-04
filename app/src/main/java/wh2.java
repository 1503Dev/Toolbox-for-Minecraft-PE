package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: wh2  reason: default package */
public final class wh2 extends dv1 implements RandomAccess, rp3 {
    public double[] Q;
    public int R;

    static {
        new wh2(new double[0], 0, false);
    }

    public wh2() {
        this(new double[10], 0, true);
    }

    public wh2(double[] dArr, int i, boolean z) {
        super(z);
        this.Q = dArr;
        this.R = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        g();
        if (i < 0 || i > (i2 = this.R)) {
            throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
        }
        double[] dArr = this.Q;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[qq.c(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.Q, i, dArr2, i + 1, this.R - i);
            this.Q = dArr2;
        }
        this.Q[i] = doubleValue;
        this.R++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }

    @Override // defpackage.dv1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = z13.a;
        collection.getClass();
        if (collection instanceof wh2) {
            wh2 wh2Var = (wh2) collection;
            int i = wh2Var.R;
            if (i == 0) {
                return false;
            }
            int i2 = this.R;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                double[] dArr = this.Q;
                if (i3 > dArr.length) {
                    this.Q = Arrays.copyOf(dArr, i3);
                }
                System.arraycopy(wh2Var.Q, 0, this.Q, this.R, wh2Var.R);
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
            return new wh2(Arrays.copyOf(this.Q, i), this.R, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wh2) {
            wh2 wh2Var = (wh2) obj;
            if (this.R != wh2Var.R) {
                return false;
            }
            double[] dArr = wh2Var.Q;
            for (int i = 0; i < this.R; i++) {
                if (Double.doubleToLongBits(this.Q[i]) != Double.doubleToLongBits(dArr[i])) {
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
        return Double.valueOf(this.Q[i]);
    }

    public final void h(double d) {
        g();
        int i = this.R;
        double[] dArr = this.Q;
        if (i == dArr.length) {
            double[] dArr2 = new double[qq.c(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.Q = dArr2;
        }
        double[] dArr3 = this.Q;
        int i2 = this.R;
        this.R = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.R; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.Q[i2]);
            Charset charset = z13.a;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.R;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.Q[i2] == doubleValue) {
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
        double[] dArr = this.Q;
        double d = dArr[i];
        if (i < this.R - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.R--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.Q;
        System.arraycopy(dArr, i2, dArr, i, this.R - i2);
        this.R -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        g();
        m(i);
        double[] dArr = this.Q;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}