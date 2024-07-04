package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: dy5  reason: default package */
public final class dy5 extends ai3 {
    public static final /* synthetic */ int s = 0;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final SparseArray q;
    public final SparseBooleanArray r;

    static {
        new dy5(new cy5());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
    }

    public dy5(cy5 cy5Var) {
        super(cy5Var);
        this.k = cy5Var.k;
        this.l = cy5Var.l;
        this.m = cy5Var.m;
        this.n = cy5Var.n;
        this.o = cy5Var.o;
        this.p = cy5Var.p;
        this.q = cy5Var.q;
        this.r = cy5Var.r;
    }

    @Override // defpackage.ai3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dy5.class == obj.getClass()) {
            dy5 dy5Var = (dy5) obj;
            if (super.equals(dy5Var) && this.k == dy5Var.k && this.l == dy5Var.l && this.m == dy5Var.m && this.n == dy5Var.n && this.o == dy5Var.o && this.p == dy5Var.p) {
                SparseBooleanArray sparseBooleanArray = this.r;
                SparseBooleanArray sparseBooleanArray2 = dy5Var.r;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.q;
                            SparseArray sparseArray2 = dy5Var.q;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                hx5 hx5Var = (hx5) entry.getKey();
                                                if (map2.containsKey(hx5Var)) {
                                                    if (!zn4.b(entry.getValue(), map2.get(hx5Var))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ai3
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.k ? 1 : 0)) * 961) + (this.l ? 1 : 0)) * 961) + (this.m ? 1 : 0)) * 28629151) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 961) + (this.p ? 1 : 0);
    }
}