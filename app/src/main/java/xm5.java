package defpackage;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: xm5  reason: default package */
public final class xm5 {
    public final ya3 a = new ya3();
    public final lc3 b = new lc3();
    public final ho5 c;
    public final a54 d;
    public long e;
    public int f;
    public boolean g;
    public um5 h;
    public um5 i;
    public um5 j;
    public int k;
    public Object l;
    public long m;

    public xm5(ho5 ho5Var, a54 a54Var) {
        this.c = ho5Var;
        this.d = a54Var;
    }

    public static ov5 r(kd3 kd3Var, Object obj, long j, lc3 lc3Var, ya3 ya3Var) {
        kd3Var.n(obj, ya3Var);
        kd3Var.e(ya3Var.c, lc3Var, 0L);
        kd3Var.a(obj);
        if (ya3Var.d == 0) {
            ya3Var.f.getClass();
        }
        kd3Var.n(obj, ya3Var);
        return new ov5(-1, j, obj);
    }

    public final boolean a(kd3 kd3Var, ov5 ov5Var) {
        boolean z;
        if (!ov5Var.a() && ov5Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        int i = kd3Var.n(ov5Var.a, this.a).c;
        if (kd3Var.e(i, this.b, 0L).m == kd3Var.a(ov5Var.a)) {
            return true;
        }
        return false;
    }

    public final boolean b(kd3 kd3Var) {
        um5 um5Var;
        um5 um5Var2 = this.h;
        if (um5Var2 == null) {
            return true;
        }
        int a = kd3Var.a(um5Var2.b);
        while (true) {
            a = kd3Var.i(a, this.a, this.b, this.f, this.g);
            while (true) {
                um5Var = um5Var2.l;
                if (um5Var == null || um5Var2.f.f) {
                    break;
                }
                um5Var2 = um5Var;
            }
            if (a == -1 || um5Var == null || kd3Var.a(um5Var.b) != a) {
                break;
            }
            um5Var2 = um5Var;
        }
        boolean j = j(um5Var2);
        um5Var2.f = g(kd3Var, um5Var2.f);
        if (!j) {
            return true;
        }
        return false;
    }

    public final um5 c() {
        um5 um5Var = this.h;
        if (um5Var == null) {
            return null;
        }
        if (um5Var == this.i) {
            this.i = um5Var.l;
        }
        um5Var.h();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            um5 um5Var2 = this.h;
            this.l = um5Var2.b;
            this.m = um5Var2.f.a.d;
        }
        this.h = this.h.l;
        s();
        return this.h;
    }

    public final um5 d() {
        return this.j;
    }

    public final um5 e() {
        return this.h;
    }

    public final um5 f() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vm5 g(kd3 kd3Var, vm5 vm5Var) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        ov5 ov5Var = vm5Var.a;
        if (!ov5Var.a() && ov5Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean a = a(kd3Var, ov5Var);
        boolean t = t(kd3Var, ov5Var, z);
        kd3Var.n(vm5Var.a.a, this.a);
        if (!ov5Var.a() && (i = ov5Var.e) != -1) {
            this.a.f.a(i).getClass();
            j = 0;
        } else {
            j = -9223372036854775807L;
        }
        if (ov5Var.a()) {
            j2 = this.a.b(ov5Var.b, ov5Var.c);
        } else if (j != -9223372036854775807L) {
            j3 = 0;
            j4 = 0;
            if (!ov5Var.a()) {
                this.a.c(ov5Var.b);
            } else {
                int i2 = ov5Var.e;
                if (i2 != -1) {
                    this.a.c(i2);
                }
            }
            return new vm5(ov5Var, vm5Var.b, vm5Var.c, j3, j4, z, a, t);
        } else {
            j2 = this.a.d;
        }
        j3 = j;
        j4 = j2;
        if (!ov5Var.a()) {
        }
        return new vm5(ov5Var, vm5Var.b, vm5Var.c, j3, j4, z, a, t);
    }

    public final ov5 h(kd3 kd3Var, Object obj, long j) {
        long j2;
        int a;
        int i = kd3Var.n(obj, this.a).c;
        Object obj2 = this.l;
        if (obj2 != null && (a = kd3Var.a(obj2)) != -1 && kd3Var.d(a, this.a, false).c == i) {
            j2 = this.m;
        } else {
            um5 um5Var = this.h;
            while (true) {
                if (um5Var != null) {
                    if (um5Var.b.equals(obj)) {
                        break;
                    }
                    um5Var = um5Var.l;
                } else {
                    um5Var = this.h;
                    while (um5Var != null) {
                        int a2 = kd3Var.a(um5Var.b);
                        if (a2 == -1 || kd3Var.d(a2, this.a, false).c != i) {
                            um5Var = um5Var.l;
                        }
                    }
                    j2 = this.e;
                    this.e = 1 + j2;
                    if (this.h == null) {
                        this.l = obj;
                        this.m = j2;
                    }
                }
            }
            j2 = um5Var.f.a.d;
        }
        long j3 = j2;
        kd3Var.n(obj, this.a);
        kd3Var.e(this.a.c, this.b, 0L);
        int a3 = kd3Var.a(obj);
        while (true) {
            lc3 lc3Var = this.b;
            if (a3 >= lc3Var.l) {
                kd3Var.d(a3, this.a, true);
                this.a.f.getClass();
                long j4 = this.a.d;
                a3--;
            } else {
                return r(kd3Var, obj, j3, lc3Var, this.a);
            }
        }
    }

    public final void i() {
        if (this.k == 0) {
            return;
        }
        um5 um5Var = this.h;
        tv2.B(um5Var);
        this.l = um5Var.b;
        this.m = um5Var.f.a.d;
        while (um5Var != null) {
            um5Var.h();
            um5Var = um5Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        s();
    }

    public final boolean j(um5 um5Var) {
        boolean z;
        int i = 0;
        if (um5Var != null) {
            z = true;
        } else {
            z = false;
        }
        tv2.I(z);
        if (um5Var.equals(this.j)) {
            return false;
        }
        this.j = um5Var;
        boolean z2 = false;
        while (true) {
            um5Var = um5Var.l;
            if (um5Var == null) {
                break;
            }
            if (um5Var == this.i) {
                this.i = this.h;
                z2 = true;
            }
            um5Var.h();
            this.k--;
        }
        um5 um5Var2 = this.j;
        if (um5Var2.l != null) {
            um5Var2.i();
            um5Var2.l = null;
            while (true) {
                xy5 xy5Var = um5Var2.n;
                if (i >= xy5Var.a) {
                    break;
                }
                xy5Var.b(i);
                qy5 qy5Var = um5Var2.n.c[i];
                i++;
            }
        }
        s();
        return z2;
    }

    public final boolean k(kd3 kd3Var, long j, long j2) {
        vm5 vm5Var;
        long j3;
        boolean z;
        um5 um5Var = null;
        for (um5 um5Var2 = this.h; um5Var2 != null; um5Var2 = um5Var2.l) {
            vm5 vm5Var2 = um5Var2.f;
            if (um5Var == null) {
                vm5Var = g(kd3Var, vm5Var2);
            } else {
                vm5 n = n(kd3Var, um5Var, j);
                if (n == null) {
                    if (!j(um5Var)) {
                        return true;
                    }
                    return false;
                } else if (vm5Var2.b == n.b && vm5Var2.a.equals(n.a)) {
                    vm5Var = n;
                } else if (!j(um5Var)) {
                    return true;
                } else {
                    return false;
                }
            }
            vm5 a = vm5Var.a(vm5Var2.c);
            um5Var2.f = a;
            long j4 = vm5Var2.e;
            int i = (j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1));
            long j5 = vm5Var.e;
            if (i != 0 && j4 != j5) {
                nv5 nv5Var = um5Var2.a;
                if (nv5Var instanceof qu5) {
                    long j6 = a.d;
                    if (j6 == -9223372036854775807L) {
                        j6 = Long.MIN_VALUE;
                    }
                    ((qu5) nv5Var).T = j6;
                }
                if (j5 == -9223372036854775807L) {
                    j3 = RecyclerView.FOREVER_NS;
                } else {
                    j3 = um5Var2.o + j5;
                }
                if (um5Var2 == this.i && (j2 == Long.MIN_VALUE || j2 >= j3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!j(um5Var2) && !z) {
                    return true;
                }
                return false;
            }
            um5Var = um5Var2;
        }
        return true;
    }

    public final boolean l(kd3 kd3Var, int i) {
        this.f = i;
        return b(kd3Var);
    }

    public final boolean m(kd3 kd3Var, boolean z) {
        this.g = z;
        return b(kd3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
        return p(r19, r10.a, r3, r4, r11.c, r10.d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vm5 n(kd3 kd3Var, um5 um5Var, long j) {
        int i;
        long j2;
        long j3;
        long j4;
        vm5 vm5Var = um5Var.f;
        long j5 = (um5Var.o + vm5Var.e) - j;
        long j6 = 0;
        if (vm5Var.f) {
            int i2 = kd3Var.i(kd3Var.a(vm5Var.a.a), this.a, this.b, this.f, this.g);
            if (i2 == -1) {
                return null;
            }
            int i3 = kd3Var.d(i2, this.a, true).c;
            Object obj = this.a.b;
            obj.getClass();
            long j7 = vm5Var.a.d;
            if (kd3Var.e(i3, this.b, 0L).l == i2) {
                Pair m = kd3Var.m(this.b, this.a, i3, -9223372036854775807L, Math.max(0L, j5));
                if (m == null) {
                    return null;
                }
                obj = m.first;
                long longValue = ((Long) m.second).longValue();
                um5 um5Var2 = um5Var.l;
                if (um5Var2 != null && um5Var2.b.equals(obj)) {
                    j4 = um5Var2.f.a.d;
                } else {
                    j4 = this.e;
                    this.e = 1 + j4;
                }
                j3 = longValue;
                j2 = j4;
                j6 = -9223372036854775807L;
            } else {
                j2 = j7;
                j3 = 0;
            }
            ov5 r = r(kd3Var, obj, j2, this.b, this.a);
            if (j6 != -9223372036854775807L && vm5Var.c != -9223372036854775807L) {
                kd3Var.n(vm5Var.a.a, this.a).f.getClass();
            }
            return o(kd3Var, r, j6, j3);
        }
        ov5 ov5Var = vm5Var.a;
        kd3Var.n(ov5Var.a, this.a);
        if (ov5Var.a()) {
            int i4 = ov5Var.b;
            if (this.a.f.a(i4).a == -1) {
                return null;
            }
            ya3 ya3Var = this.a;
            int i5 = ov5Var.c;
            iw2 a = ya3Var.f.a(i4);
            int i6 = i5 + 1;
            while (true) {
                int[] iArr = a.c;
                if (i6 >= iArr.length || (i = iArr[i6]) == 0 || i == 1) {
                    break;
                }
                i6++;
            }
            long j8 = vm5Var.c;
            if (j8 == -9223372036854775807L) {
                lc3 lc3Var = this.b;
                ya3 ya3Var2 = this.a;
                Pair m2 = kd3Var.m(lc3Var, ya3Var2, ya3Var2.c, -9223372036854775807L, Math.max(0L, j5));
                if (m2 == null) {
                    return null;
                }
                j8 = ((Long) m2.second).longValue();
            }
            Object obj2 = ov5Var.a;
            int i7 = ov5Var.b;
            kd3Var.n(obj2, this.a);
            this.a.f.a(i7).getClass();
            this.a.f.a(i7).getClass();
            return q(kd3Var, ov5Var.a, Math.max(0L, j8), vm5Var.c, ov5Var.d);
        }
        int a2 = this.a.a(ov5Var.e);
        this.a.c(ov5Var.e);
        if (a2 != this.a.f.a(ov5Var.e).a) {
            return p(kd3Var, ov5Var.a, ov5Var.e, a2, vm5Var.e, ov5Var.d);
        }
        Object obj3 = ov5Var.a;
        int i8 = ov5Var.e;
        kd3Var.n(obj3, this.a);
        this.a.f.a(i8).getClass();
        this.a.f.a(i8).getClass();
        return q(kd3Var, ov5Var.a, 0L, vm5Var.e, ov5Var.d);
    }

    public final vm5 o(kd3 kd3Var, ov5 ov5Var, long j, long j2) {
        kd3Var.n(ov5Var.a, this.a);
        boolean a = ov5Var.a();
        Object obj = ov5Var.a;
        return a ? p(kd3Var, obj, ov5Var.b, ov5Var.c, j, ov5Var.d) : q(kd3Var, obj, j2, j, ov5Var.d);
    }

    public final vm5 p(kd3 kd3Var, Object obj, int i, int i2, long j, long j2) {
        ov5 ov5Var = new ov5(obj, i, i2, j2);
        long b = kd3Var.n(obj, this.a).b(i, i2);
        if (i2 == this.a.a(i)) {
            this.a.f.getClass();
        }
        this.a.c(i);
        long j3 = 0;
        if (b != -9223372036854775807L && b <= 0) {
            j3 = Math.max(0L, (-1) + b);
        }
        return new vm5(ov5Var, j3, j, -9223372036854775807L, b, false, false, false);
    }

    public final vm5 q(kd3 kd3Var, Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        kd3Var.n(obj, this.a);
        this.a.getClass();
        this.a.f.getClass();
        ov5 ov5Var = new ov5(-1, j3, obj);
        if (!ov5Var.a()) {
            z = true;
        } else {
            z = false;
        }
        boolean a = a(kd3Var, ov5Var);
        boolean t = t(kd3Var, ov5Var, z);
        long j5 = this.a.d;
        if (j5 != -9223372036854775807L && j >= j5) {
            j4 = Math.max(0L, (-1) + j5);
        } else {
            j4 = j;
        }
        return new vm5(ov5Var, j4, j2, -9223372036854775807L, j5, z, a, t);
    }

    public final void s() {
        ov5 ov5Var;
        kv4 kv4Var = new kv4();
        for (um5 um5Var = this.h; um5Var != null; um5Var = um5Var.l) {
            kv4Var.p(um5Var.f.a);
        }
        um5 um5Var2 = this.i;
        if (um5Var2 == null) {
            ov5Var = null;
        } else {
            ov5Var = um5Var2.f.a;
        }
        ((dl4) this.d).b(new wm5(0, this, kv4Var, ov5Var));
    }

    public final boolean t(kd3 kd3Var, ov5 ov5Var, boolean z) {
        int a = kd3Var.a(ov5Var.a);
        return !kd3Var.e(kd3Var.d(a, this.a, false).c, this.b, 0L).g && kd3Var.i(a, this.a, this.b, this.f, this.g) == -1 && z;
    }
}