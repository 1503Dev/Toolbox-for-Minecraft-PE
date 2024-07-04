package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: nn5  reason: default package */
public final class nn5 extends kd3 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final yw5 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final kd3[] h;
    public final Object[] i;
    public final HashMap j;

    public nn5(List list, yw5 yw5Var) {
        this.c = yw5Var;
        this.b = yw5Var.b.length;
        int size = list.size();
        this.f = new int[size];
        this.g = new int[size];
        this.h = new kd3[size];
        this.i = new Object[size];
        this.j = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            ym5 ym5Var = (ym5) it.next();
            this.h[i3] = ym5Var.a();
            this.g[i3] = i;
            this.f[i3] = i2;
            i += this.h[i3].c();
            i2 += this.h[i3].b();
            this.i[i3] = ym5Var.c();
            this.j.put(this.i[i3], Integer.valueOf(i3));
            i3++;
        }
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.kd3
    public final int a(Object obj) {
        int intValue;
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (a = this.h[intValue].a(obj3)) == -1) {
            return -1;
        }
        return this.f[intValue] + a;
    }

    @Override // defpackage.kd3
    public final int b() {
        return this.e;
    }

    @Override // defpackage.kd3
    public final int c() {
        return this.d;
    }

    @Override // defpackage.kd3
    public final ya3 d(int i, ya3 ya3Var, boolean z) {
        int h = zn4.h(this.f, i + 1, false, false);
        int i2 = this.g[h];
        this.h[h].d(i - this.f[h], ya3Var, z);
        ya3Var.c += i2;
        if (z) {
            Object obj = this.i[h];
            Object obj2 = ya3Var.b;
            obj2.getClass();
            ya3Var.b = Pair.create(obj, obj2);
        }
        return ya3Var;
    }

    @Override // defpackage.kd3
    public final lc3 e(int i, lc3 lc3Var, long j) {
        int h = zn4.h(this.g, i + 1, false, false);
        int i2 = this.g[h];
        int i3 = this.f[h];
        this.h[h].e(i - i2, lc3Var, j);
        Object obj = this.i[h];
        if (!lc3.n.equals(lc3Var.a)) {
            obj = Pair.create(obj, lc3Var.a);
        }
        lc3Var.a = obj;
        lc3Var.l += i3;
        lc3Var.m += i3;
        return lc3Var;
    }

    @Override // defpackage.kd3
    public final Object f(int i) {
        int h = zn4.h(this.f, i + 1, false, false);
        return Pair.create(this.i[h], this.h[h].f(i - this.f[h]));
    }

    @Override // defpackage.kd3
    public final int g(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.c.b;
            if (iArr.length > 0) {
                i = iArr[0];
            } else {
                i = -1;
            }
        }
        while (this.h[i].o()) {
            i = p(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return this.g[i] + this.h[i].g(z);
    }

    @Override // defpackage.kd3
    public final int h(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.c.b;
            int length = iArr.length;
            if (length > 0) {
                i = iArr[length - 1];
            } else {
                i = -1;
            }
        } else {
            i = i2 - 1;
        }
        while (this.h[i].o()) {
            i = q(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return this.g[i] + this.h[i].h(z);
    }

    @Override // defpackage.kd3
    public final int j(int i, int i2, boolean z) {
        int i3 = 0;
        int h = zn4.h(this.g, i + 1, false, false);
        int i4 = this.g[h];
        kd3 kd3Var = this.h[h];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int j = kd3Var.j(i5, i3, z);
        if (j != -1) {
            return i4 + j;
        }
        int p = p(h, z);
        while (p != -1 && this.h[p].o()) {
            p = p(p, z);
        }
        if (p != -1) {
            return this.h[p].g(z) + this.g[p];
        } else if (i2 != 2) {
            return -1;
        } else {
            return g(z);
        }
    }

    @Override // defpackage.kd3
    public final int k(int i) {
        int h = zn4.h(this.g, i + 1, false, false);
        int i2 = this.g[h];
        int k2 = this.h[h].k(i - i2);
        if (k2 != -1) {
            return i2 + k2;
        }
        int q = q(h, false);
        while (q != -1 && this.h[q].o()) {
            q = q(q, false);
        }
        if (q == -1) {
            return -1;
        }
        return this.h[q].h(false) + this.g[q];
    }

    @Override // defpackage.kd3
    public final ya3 n(Object obj, ya3 ya3Var) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = this.g[intValue];
        this.h[intValue].n(obj3, ya3Var);
        ya3Var.c += i;
        ya3Var.b = obj;
        return ya3Var;
    }

    public final int p(int i, boolean z) {
        if (z) {
            yw5 yw5Var = this.c;
            int i2 = yw5Var.c[i] + 1;
            int[] iArr = yw5Var.b;
            if (i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        } else if (i >= this.b - 1) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final int q(int i, boolean z) {
        if (z) {
            yw5 yw5Var = this.c;
            int i2 = yw5Var.c[i] - 1;
            if (i2 < 0) {
                return -1;
            }
            return yw5Var.b[i2];
        } else if (i <= 0) {
            return -1;
        } else {
            return (-1) + i;
        }
    }
}