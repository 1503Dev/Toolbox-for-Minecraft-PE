package defpackage;

import java.util.Arrays;

/* renamed from: q63  reason: default package */
public final class q63 {
    public final Object a;
    public final int b;
    public final el2 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public q63(Object obj, int i, el2 el2Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = el2Var;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q63.class == obj.getClass()) {
            q63 q63Var = (q63) obj;
            if (this.b == q63Var.b && this.e == q63Var.e && this.f == q63Var.f && this.g == q63Var.g && this.h == q63Var.h && this.i == q63Var.i && dt4.l(this.a, q63Var.a) && dt4.l(this.d, q63Var.d) && dt4.l(this.c, q63Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}