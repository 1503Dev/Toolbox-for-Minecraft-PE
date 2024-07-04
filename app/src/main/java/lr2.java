package defpackage;

/* renamed from: lr2  reason: default package */
public class lr2 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public lr2(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public lr2(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public lr2(lr2 lr2Var) {
        this.a = lr2Var.a;
        this.b = lr2Var.b;
        this.c = lr2Var.c;
        this.d = lr2Var.d;
        this.e = lr2Var.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lr2) {
            lr2 lr2Var = (lr2) obj;
            return this.a.equals(lr2Var.a) && this.b == lr2Var.b && this.c == lr2Var.c && this.d == lr2Var.d && this.e == lr2Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}