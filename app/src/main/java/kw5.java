package defpackage;

/* renamed from: kw5  reason: default package */
public final class kw5 {
    public final int a;
    public final boolean b;

    public kw5(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kw5.class == obj.getClass()) {
            kw5 kw5Var = (kw5) obj;
            if (this.a == kw5Var.a && this.b == kw5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}