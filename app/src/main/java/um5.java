package defpackage;

import android.util.Pair;

/* renamed from: um5  reason: default package */
public final class um5 {
    public final nv5 a;
    public final Object b;
    public final ww5[] c;
    public boolean d;
    public boolean e;
    public vm5 f;
    public boolean g;
    public final boolean[] h;
    public final mk5[] i;
    public final wy5 j;
    public final in5 k;
    public um5 l;
    public hx5 m;
    public xy5 n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [qu5] */
    public um5(mk5[] mk5VarArr, long j, wy5 wy5Var, jz5 jz5Var, in5 in5Var, vm5 vm5Var, xy5 xy5Var) {
        this.i = mk5VarArr;
        this.o = j;
        this.j = wy5Var;
        this.k = in5Var;
        ov5 ov5Var = vm5Var.a;
        this.b = ov5Var.a;
        this.f = vm5Var;
        this.m = hx5.d;
        this.n = xy5Var;
        this.c = new ww5[2];
        this.h = new boolean[2];
        long j2 = vm5Var.b;
        long j3 = vm5Var.d;
        in5Var.getClass();
        Object obj = ov5Var.a;
        int i = nn5.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        ov5 b = ov5Var.b(pair.second);
        gn5 gn5Var = (gn5) in5Var.d.get(obj2);
        gn5Var.getClass();
        in5Var.g.add(gn5Var);
        fn5 fn5Var = (fn5) in5Var.f.get(gn5Var);
        if (fn5Var != null) {
            fn5Var.a.c(fn5Var.b);
        }
        gn5Var.c.add(b);
        yu5 g = gn5Var.a.g(b, jz5Var, j2);
        in5Var.c.put(g, gn5Var);
        in5Var.j();
        this.a = j3 != -9223372036854775807L ? new qu5(g, j3) : g;
    }

    public final long a(xy5 xy5Var, long j, boolean z, boolean[] zArr) {
        boolean z2;
        boolean z3;
        int i = 0;
        while (true) {
            boolean z4 = true;
            if (i >= xy5Var.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !xy5Var.a(this.n, i)) {
                z4 = false;
            }
            zArr2[i] = z4;
            i++;
        }
        int i2 = 0;
        while (true) {
            mk5[] mk5VarArr = this.i;
            if (i2 >= 2) {
                break;
            }
            mk5VarArr[i2].getClass();
            i2++;
        }
        i();
        this.n = xy5Var;
        if (this.l == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i3 = 0;
            while (true) {
                xy5 xy5Var2 = this.n;
                if (i3 >= xy5Var2.a) {
                    break;
                }
                xy5Var2.b(i3);
                qy5 qy5Var = this.n.c[i3];
                i3++;
            }
        }
        long p = this.a.p(xy5Var.c, this.h, this.c, zArr, j);
        int i4 = 0;
        while (true) {
            mk5[] mk5VarArr2 = this.i;
            if (i4 >= 2) {
                break;
            }
            mk5VarArr2[i4].getClass();
            i4++;
        }
        this.e = false;
        int i5 = 0;
        while (true) {
            ww5[] ww5VarArr = this.c;
            if (i5 < 2) {
                if (ww5VarArr[i5] != null) {
                    tv2.I(xy5Var.b(i5));
                    this.i[i5].getClass();
                    this.e = true;
                } else {
                    if (xy5Var.c[i5] == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    tv2.I(z3);
                }
                i5++;
            } else {
                return p;
            }
        }
    }

    public final long b() {
        if (this.d) {
            long d = this.e ? this.a.d() : Long.MIN_VALUE;
            return d == Long.MIN_VALUE ? this.f.e : d;
        }
        return this.f.b;
    }

    public final long c() {
        return this.o;
    }

    public final long d() {
        return this.f.b + this.o;
    }

    public final um5 e() {
        return this.l;
    }

    public final xy5 f() {
        return this.n;
    }

    public final void g(float f, kd3 kd3Var) {
        qy5[] qy5VarArr;
        long j;
        this.d = true;
        hx5 f2 = this.a.f();
        this.m = f2;
        wy5 wy5Var = this.j;
        mk5[] mk5VarArr = this.i;
        ov5 ov5Var = this.f.a;
        xy5 d = wy5Var.d(mk5VarArr, f2);
        for (qy5 qy5Var : d.c) {
        }
        vm5 vm5Var = this.f;
        long j2 = vm5Var.b;
        long j3 = vm5Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j = Math.max(0L, j3 - 1);
        } else {
            j = j2;
        }
        long a = a(d, j, false, new boolean[2]);
        long j4 = this.o;
        vm5 vm5Var2 = this.f;
        this.o = (vm5Var2.b - a) + j4;
        this.f = vm5Var2.b(a);
    }

    public final void h() {
        i();
        in5 in5Var = this.k;
        nv5 nv5Var = this.a;
        try {
            if (nv5Var instanceof qu5) {
                in5Var.c(((qu5) nv5Var).P);
            } else {
                in5Var.c(nv5Var);
            }
        } catch (RuntimeException e) {
            lb4.b("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void i() {
        boolean z;
        int i = 0;
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            xy5 xy5Var = this.n;
            if (i < xy5Var.a) {
                xy5Var.b(i);
                qy5 qy5Var = this.n.c[i];
                i++;
            } else {
                return;
            }
        }
    }
}