package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: oq2  reason: default package */
public final class oq2 extends dv1 implements RandomAccess, rp3 {
    public float[] Q;
    public int R;

    static {
        new oq2(new float[0], 0, false);
    }

    public oq2() {
        this(new float[10], 0, true);
    }

    public oq2(float[] fArr, int i, boolean z) {
        super(z);
        this.Q = fArr;
        this.R = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        g();
        if (i < 0 || i > (i2 = this.R)) {
            throw new IndexOutOfBoundsException(dp.b("Index:", i, ", Size:", this.R));
        }
        float[] fArr = this.Q;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[qq.c(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.Q, i, fArr2, i + 1, this.R - i);
            this.Q = fArr2;
        }
        this.Q[i] = floatValue;
        this.R++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }

    @Override // defpackage.dv1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        Charset charset = z13.a;
        collection.getClass();
        if (collection instanceof oq2) {
            oq2 oq2Var = (oq2) collection;
            int i = oq2Var.R;
            if (i == 0) {
                return false;
            }
            int i2 = this.R;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                float[] fArr = this.Q;
                if (i3 > fArr.length) {
                    this.Q = Arrays.copyOf(fArr, i3);
                }
                System.arraycopy(oq2Var.Q, 0, this.Q, this.R, oq2Var.R);
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
            return new oq2(Arrays.copyOf(this.Q, i), this.R, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oq2) {
            oq2 oq2Var = (oq2) obj;
            if (this.R != oq2Var.R) {
                return false;
            }
            float[] fArr = oq2Var.Q;
            for (int i = 0; i < this.R; i++) {
                if (Float.floatToIntBits(this.Q[i]) != Float.floatToIntBits(fArr[i])) {
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
        return Float.valueOf(this.Q[i]);
    }

    public final void h(float f) {
        g();
        int i = this.R;
        float[] fArr = this.Q;
        if (i == fArr.length) {
            float[] fArr2 = new float[qq.c(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.Q = fArr2;
        }
        float[] fArr3 = this.Q;
        int i2 = this.R;
        this.R = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // defpackage.dv1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.R; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.Q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.R;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.Q[i2] == floatValue) {
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
        float[] fArr = this.Q;
        float f = fArr[i];
        if (i < this.R - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.R--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.Q;
        System.arraycopy(fArr, i2, fArr, i, this.R - i2);
        this.R -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        g();
        m(i);
        float[] fArr = this.Q;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}