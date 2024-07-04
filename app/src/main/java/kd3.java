package defpackage;

import android.util.Pair;

/* renamed from: kd3  reason: default package */
public abstract class kd3 {
    public static final h93 a = new h93();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract ya3 d(int i, ya3 ya3Var, boolean z);

    public abstract lc3 e(int i, lc3 lc3Var, long j);

    public final boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (obj instanceof kd3) {
            kd3 kd3Var = (kd3) obj;
            if (kd3Var.c() == c() && kd3Var.b() == b()) {
                lc3 lc3Var = new lc3();
                ya3 ya3Var = new ya3();
                lc3 lc3Var2 = new lc3();
                ya3 ya3Var2 = new ya3();
                for (int i = 0; i < c(); i++) {
                    if (!e(i, lc3Var, 0L).equals(kd3Var.e(i, lc3Var2, 0L))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < b(); i2++) {
                    if (!d(i2, ya3Var, true).equals(kd3Var.d(i2, ya3Var2, true))) {
                        return false;
                    }
                }
                int g = g(true);
                if (g == kd3Var.g(true) && (h = h(true)) == kd3Var.h(true)) {
                    while (g != h) {
                        int j = j(g, 0, true);
                        if (j != kd3Var.j(g, 0, true)) {
                            return false;
                        }
                        g = j;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return o() ? -1 : 0;
    }

    public int h(boolean z) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        lc3 lc3Var = new lc3();
        ya3 ya3Var = new ya3();
        int c = c() + 217;
        int i2 = 0;
        while (true) {
            i = c * 31;
            if (i2 >= c()) {
                break;
            }
            c = i + e(i2, lc3Var, 0L).hashCode();
            i2++;
        }
        int b = b() + i;
        for (int i3 = 0; i3 < b(); i3++) {
            b = (b * 31) + d(i3, ya3Var, true).hashCode();
        }
        int g = g(true);
        while (g != -1) {
            b = (b * 31) + g;
            g = j(g, 0, true);
        }
        return b;
    }

    public final int i(int i, ya3 ya3Var, lc3 lc3Var, int i2, boolean z) {
        int i3 = d(i, ya3Var, false).c;
        if (e(i3, lc3Var, 0L).m == i) {
            int j = j(i3, i2, z);
            if (j == -1) {
                return -1;
            }
            return e(j, lc3Var, 0L).l;
        }
        return i + 1;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == h(z) ? g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public int k(int i) {
        if (i == g(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair l(lc3 lc3Var, ya3 ya3Var, int i, long j) {
        Pair m = m(lc3Var, ya3Var, i, j, 0L);
        m.getClass();
        return m;
    }

    public final Pair m(lc3 lc3Var, ya3 ya3Var, int i, long j, long j2) {
        tv2.w(i, c());
        e(i, lc3Var, j2);
        if (j == -9223372036854775807L) {
            lc3Var.getClass();
            j = 0;
        }
        int i2 = lc3Var.l;
        d(i2, ya3Var, false);
        while (i2 < lc3Var.m) {
            ya3Var.getClass();
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            d(i3, ya3Var, false).getClass();
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, ya3Var, true);
        ya3Var.getClass();
        long j3 = ya3Var.d;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j, j3 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = ya3Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public ya3 n(Object obj, ya3 ya3Var) {
        return d(a(obj), ya3Var, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}