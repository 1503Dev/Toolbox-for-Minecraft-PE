package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: nx5  reason: default package */
public class nx5 implements qy5 {
    public final qe3 a;
    public final int b;
    public final int[] c;
    public final cu1[] d;
    public int e;

    public nx5(qe3 qe3Var, int[] iArr) {
        boolean z;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        tv2.I(z);
        qe3Var.getClass();
        this.a = qe3Var;
        this.b = length;
        this.d = new cu1[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = qe3Var.c[iArr[i]];
        }
        Arrays.sort(this.d, new Comparator() { // from class: mx5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((cu1) obj2).g - ((cu1) obj).g;
            }
        });
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            cu1 cu1Var = this.d[i2];
            int i3 = 0;
            while (true) {
                if (i3 <= 0) {
                    if (cu1Var == qe3Var.c[i3]) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            iArr2[i2] = i3;
        }
    }

    @Override // defpackage.uy5
    public final int B(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.uy5
    public final int a() {
        return this.c[0];
    }

    @Override // defpackage.uy5
    public final qe3 b() {
        return this.a;
    }

    @Override // defpackage.uy5
    public final int d() {
        return this.c.length;
    }

    @Override // defpackage.uy5
    public final cu1 e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nx5 nx5Var = (nx5) obj;
            if (this.a == nx5Var.a && Arrays.equals(this.c, nx5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }
}