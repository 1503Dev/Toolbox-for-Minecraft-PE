package defpackage;

/* renamed from: td5  reason: default package */
public final class td5 {
    public final Object a;
    public final int b;

    public td5(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td5) {
            td5 td5Var = (td5) obj;
            return this.a == td5Var.a && this.b == td5Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}