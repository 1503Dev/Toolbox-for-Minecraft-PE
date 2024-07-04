package defpackage;

import java.util.Arrays;

/* renamed from: nq2  reason: default package */
public final class nq2 {
    public static final nq2 y = new nq2(new vo2());
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    @Deprecated
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final CharSequence w;
    public final Integer x;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(1000, 36);
    }

    public nq2(vo2 vo2Var) {
        Boolean bool = vo2Var.k;
        Integer num = vo2Var.j;
        Integer num2 = vo2Var.w;
        int i = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            i = 1;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                }
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i = 21;
                        break;
                    case 3:
                        i = 22;
                        break;
                    case 4:
                        i = 23;
                        break;
                    case 5:
                        i = 24;
                        break;
                    case 6:
                        i = 25;
                        break;
                    default:
                        i = 20;
                        break;
                }
                num2 = Integer.valueOf(i);
            }
        }
        this.a = vo2Var.a;
        this.b = vo2Var.b;
        this.c = vo2Var.c;
        this.d = vo2Var.d;
        this.e = vo2Var.e;
        this.f = vo2Var.f;
        this.g = vo2Var.g;
        this.h = vo2Var.h;
        this.i = vo2Var.i;
        this.j = num;
        this.k = bool;
        Integer num3 = vo2Var.l;
        this.l = num3;
        this.m = num3;
        this.n = vo2Var.m;
        this.o = vo2Var.n;
        this.p = vo2Var.o;
        this.q = vo2Var.p;
        this.r = vo2Var.q;
        this.s = vo2Var.r;
        this.t = vo2Var.s;
        this.u = vo2Var.t;
        this.v = vo2Var.u;
        this.w = vo2Var.v;
        this.x = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nq2.class == obj.getClass()) {
            nq2 nq2Var = (nq2) obj;
            if (zn4.b(this.a, nq2Var.a) && zn4.b(this.b, nq2Var.b) && zn4.b(this.c, nq2Var.c) && zn4.b(this.d, nq2Var.d) && zn4.b(null, null) && zn4.b(null, null) && zn4.b(this.e, nq2Var.e) && zn4.b(null, null) && zn4.b(null, null) && Arrays.equals(this.f, nq2Var.f) && zn4.b(this.g, nq2Var.g) && zn4.b(null, null) && zn4.b(this.h, nq2Var.h) && zn4.b(this.i, nq2Var.i) && zn4.b(this.j, nq2Var.j) && zn4.b(this.k, nq2Var.k) && zn4.b(null, null) && zn4.b(this.m, nq2Var.m) && zn4.b(this.n, nq2Var.n) && zn4.b(this.o, nq2Var.o) && zn4.b(this.p, nq2Var.p) && zn4.b(this.q, nq2Var.q) && zn4.b(this.r, nq2Var.r) && zn4.b(this.s, nq2Var.s) && zn4.b(this.t, nq2Var.t) && zn4.b(this.u, nq2Var.u) && zn4.b(null, null) && zn4.b(null, null) && zn4.b(this.v, nq2Var.v) && zn4.b(null, null) && zn4.b(this.w, nq2Var.w) && zn4.b(this.x, nq2Var.x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, null, null, this.e, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, null, null, this.v, null, this.w, this.x});
    }
}