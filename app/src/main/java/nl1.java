package defpackage;

/* renamed from: nl1  reason: default package */
public final class nl1 {
    public static final nl1 c = new nl1(0, 0);
    public final long a;
    public final long b;

    public nl1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nl1.class == obj.getClass()) {
            nl1 nl1Var = (nl1) obj;
            if (this.a == nl1Var.a && this.b == nl1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}