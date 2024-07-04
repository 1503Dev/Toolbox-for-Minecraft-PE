package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: hp1  reason: default package */
public final class hp1 {
    public final SparseBooleanArray a;

    public /* synthetic */ hp1(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        tv2.w(i, this.a.size());
        return this.a.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hp1) {
            hp1 hp1Var = (hp1) obj;
            if (zn4.a < 24) {
                if (this.a.size() == hp1Var.a.size()) {
                    for (int i = 0; i < this.a.size(); i++) {
                        if (a(i) != hp1Var.a(i)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.a.equals(hp1Var.a);
        }
        return false;
    }

    public final int hashCode() {
        if (zn4.a < 24) {
            int size = this.a.size();
            for (int i = 0; i < this.a.size(); i++) {
                size = (size * 31) + a(i);
            }
            return size;
        }
        return this.a.hashCode();
    }
}