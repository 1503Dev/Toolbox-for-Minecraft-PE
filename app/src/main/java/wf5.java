package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: wf5  reason: default package */
public final class wf5 extends wc5 implements RandomAccess {
    public static final wf5 S = new wf5(new Object[0], 0, false);
    public Object[] Q;
    public int R;

    public wf5(Object[] objArr, int i, boolean z) {
        super(z);
        this.Q = objArr;
        this.R = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        g();
        if (i < 0 || i > (i2 = this.R)) {
            throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
        }
        Object[] objArr = this.Q;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[qq.c(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.Q, i, objArr2, i + 1, this.R - i);
            this.Q = objArr2;
        }
        this.Q[i] = obj;
        this.R++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.R;
        Object[] objArr = this.Q;
        if (i == objArr.length) {
            this.Q = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.Q;
        int i2 = this.R;
        this.R = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.qe5
    public final /* bridge */ /* synthetic */ qe5 e(int i) {
        if (i >= this.R) {
            return new wf5(Arrays.copyOf(this.Q, i), this.R, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return this.Q[i];
    }

    public final void h(int i) {
        if (i >= 0 && i < this.R) {
            return;
        }
        throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
    }

    @Override // defpackage.wc5, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        g();
        h(i);
        Object[] objArr = this.Q;
        Object obj = objArr[i];
        if (i < this.R - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.R--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        h(i);
        Object[] objArr = this.Q;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}