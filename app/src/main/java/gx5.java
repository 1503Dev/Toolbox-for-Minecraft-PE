package defpackage;

import android.util.SparseArray;

/* renamed from: gx5  reason: default package */
public final class gx5 {
    public final SparseArray b = new SparseArray();
    public int a = -1;

    public final Object a(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < this.b.keyAt(i2)) {
                this.a--;
            }
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public final void b(int i, tw5 tw5Var) {
        boolean z;
        boolean z2 = true;
        if (this.a == -1) {
            if (this.b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            tv2.I(z);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z2 = false;
            }
            tv2.G(z2);
            if (keyAt == i) {
                SparseArray sparseArray2 = this.b;
                ms5 ms5Var = ((tw5) sparseArray2.valueAt(sparseArray2.size() - 1)).b;
                int i2 = ls5.a;
            }
        }
        this.b.append(i, tw5Var);
    }
}