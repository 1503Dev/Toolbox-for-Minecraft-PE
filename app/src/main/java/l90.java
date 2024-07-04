package defpackage;

/* renamed from: l90  reason: default package */
public final class l90 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public l90(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l90) {
            l90 l90Var = (l90) obj;
            return this.a == l90Var.a && this.b == l90Var.b && this.c == l90Var.c && this.d == l90Var.d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r0 = this.a;
        int i = r0;
        if (this.b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        return this.d ? i2 + 4096 : i2;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}