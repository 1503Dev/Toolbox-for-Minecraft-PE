package defpackage;

/* renamed from: lj2  reason: default package */
public final class lj2 {
    public final Object a;
    public final int b;

    public lj2(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lj2) {
            lj2 lj2Var = (lj2) obj;
            return this.a == lj2Var.a && this.b == lj2Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}