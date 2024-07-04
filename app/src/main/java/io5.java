package defpackage;

import java.util.Arrays;

/* renamed from: io5  reason: default package */
public final class io5 {
    public final long a;
    public final kd3 b;
    public final int c;
    public final ov5 d;
    public final long e;
    public final kd3 f;
    public final int g;
    public final ov5 h;
    public final long i;
    public final long j;

    public io5(long j, kd3 kd3Var, int i, ov5 ov5Var, long j2, kd3 kd3Var2, int i2, ov5 ov5Var2, long j3, long j4) {
        this.a = j;
        this.b = kd3Var;
        this.c = i;
        this.d = ov5Var;
        this.e = j2;
        this.f = kd3Var2;
        this.g = i2;
        this.h = ov5Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io5.class == obj.getClass()) {
            io5 io5Var = (io5) obj;
            if (this.a == io5Var.a && this.c == io5Var.c && this.e == io5Var.e && this.g == io5Var.g && this.i == io5Var.i && this.j == io5Var.j && dt4.l(this.b, io5Var.b) && dt4.l(this.d, io5Var.d) && dt4.l(this.f, io5Var.f) && dt4.l(this.h, io5Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}