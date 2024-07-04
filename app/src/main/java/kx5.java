package defpackage;

/* renamed from: kx5  reason: default package */
public final class kx5 {
    public final long a;
    public final long b;

    public kx5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kx5) {
            kx5 kx5Var = (kx5) obj;
            return this.a == kx5Var.a && this.b == kx5Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}