package defpackage;

/* renamed from: vm5  reason: default package */
public final class vm5 {
    public final ov5 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vm5(ov5 ov5Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        tv2.G(!z3 || z);
        tv2.G((!z2 || z) ? true : true);
        this.a = ov5Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final vm5 a(long j) {
        return j == this.c ? this : new vm5(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public final vm5 b(long j) {
        return j == this.b ? this : new vm5(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vm5.class == obj.getClass()) {
            vm5 vm5Var = (vm5) obj;
            if (this.b == vm5Var.b && this.c == vm5Var.c && this.d == vm5Var.d && this.e == vm5Var.e && this.f == vm5Var.f && this.g == vm5Var.g && this.h == vm5Var.h && zn4.b(this.a, vm5Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) this.b;
        int i2 = (int) this.c;
        return ((((((((((((((this.a.hashCode() + 527) * 31) + i) * 31) + i2) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 961) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}